package typings
package alexaDashSdkLib.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioPlayer extends js.Object {
  var offsetInMilliseconds: scala.Double
  /**
    * Player activity
    */
  var playerActivity: AudioPlayerActivity
  var token: java.lang.String
}

object AudioPlayer {
  @scala.inline
  def apply(offsetInMilliseconds: scala.Double, playerActivity: AudioPlayerActivity, token: java.lang.String): AudioPlayer = {
    val __obj = js.Dynamic.literal(offsetInMilliseconds = offsetInMilliseconds, playerActivity = playerActivity, token = token)
  
    __obj.asInstanceOf[AudioPlayer]
  }
}

