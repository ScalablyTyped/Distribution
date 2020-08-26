package typings.agoraRtcSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SoundId extends js.Object {
  var soundId: Double = js.native
  var volume: Double = js.native
}

object SoundId {
  @scala.inline
  def apply(soundId: Double, volume: Double): SoundId = {
    val __obj = js.Dynamic.literal(soundId = soundId.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[SoundId]
  }
  @scala.inline
  implicit class SoundIdOps[Self <: SoundId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSoundId(value: Double): Self = this.set("soundId", value.asInstanceOf[js.Any])
    @scala.inline
    def setVolume(value: Double): Self = this.set("volume", value.asInstanceOf[js.Any])
  }
  
}

