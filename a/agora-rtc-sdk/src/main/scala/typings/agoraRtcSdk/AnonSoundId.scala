package typings.agoraRtcSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSoundId extends js.Object {
  var soundId: Double
  var volume: Double
}

object AnonSoundId {
  @scala.inline
  def apply(soundId: Double, volume: Double): AnonSoundId = {
    val __obj = js.Dynamic.literal(soundId = soundId.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSoundId]
  }
}

