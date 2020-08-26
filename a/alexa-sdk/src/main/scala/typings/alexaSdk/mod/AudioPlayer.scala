package typings.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioPlayer extends js.Object {
  var offsetInMilliseconds: Double = js.native
  /**
    * Player activity
    */
  var playerActivity: AudioPlayerActivity = js.native
  var token: String = js.native
}

object AudioPlayer {
  @scala.inline
  def apply(offsetInMilliseconds: Double, playerActivity: AudioPlayerActivity, token: String): AudioPlayer = {
    val __obj = js.Dynamic.literal(offsetInMilliseconds = offsetInMilliseconds.asInstanceOf[js.Any], playerActivity = playerActivity.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioPlayer]
  }
  @scala.inline
  implicit class AudioPlayerOps[Self <: AudioPlayer] (val x: Self) extends AnyVal {
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
    def setOffsetInMilliseconds(value: Double): Self = this.set("offsetInMilliseconds", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlayerActivity(value: AudioPlayerActivity): Self = this.set("playerActivity", value.asInstanceOf[js.Any])
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
  }
  
}

