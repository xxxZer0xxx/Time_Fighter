package com.raywenderlich.timefighter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    internal var score: Int = 0

    internal lateinit var tapMeButton: Button
    internal lateinit var gameScoreText: TextView
    internal lateinit var timeLeftText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tapMeButton = findViewById(R.id.tapMeButton)
        gameScoreText = findViewById(R.id.gameScoreText)
        timeLeftText = findViewById(R.id.timeLeftText)

        tapMeButton.setOnClickListener{ view ->
            incrementScore()
        }
    }

    private fun incrementScore() {
        score += 1
        val newScore = getString(R.string.yourScore, score)
        gameScoreText.text = newScore
    }
}
