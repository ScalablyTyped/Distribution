package typings.agoraRtcSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SoundId extends js.Object {
  var soundId: Double
  var volume: Double
}

object SoundId {
  @scala.inline
  def apply(soundId: Double, volume: Double): SoundId = {
    val __obj = js.Dynamic.literal(soundId = soundId.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[SoundId]
  }
}

