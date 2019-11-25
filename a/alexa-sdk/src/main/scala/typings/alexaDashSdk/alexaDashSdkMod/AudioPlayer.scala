package typings.alexaDashSdk.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioPlayer extends js.Object {
  var offsetInMilliseconds: Double
  /**
    * Player activity
    */
  var playerActivity: AudioPlayerActivity
  var token: String
}

object AudioPlayer {
  @scala.inline
  def apply(offsetInMilliseconds: Double, playerActivity: AudioPlayerActivity, token: String): AudioPlayer = {
    val __obj = js.Dynamic.literal(offsetInMilliseconds = offsetInMilliseconds.asInstanceOf[js.Any], playerActivity = playerActivity.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AudioPlayer]
  }
}

