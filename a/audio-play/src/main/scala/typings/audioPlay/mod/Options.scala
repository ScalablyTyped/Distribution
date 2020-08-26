package typings.audioPlay.mod

import typings.std.AudioContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Various options for audio playback
  * @param start The timestamp at which to start the audio. Can be negative to start from end. (Default: 0)
  * @param end The timestamp the audio ends at. (Default: length of audio buffer)
  * @param autoplay Plays back the audio immediately upon loading. (Default: false)
  * @param loop Continuously loops the buffer until paused. (Default: false)
  * @param context Handle to an audio context. If not provided, one is provided for you.
  * @param volume (not implemented) Playback the audio at a percentage of full volume. (Default: 1)
  * @param detune (not implemented) Percentage of fine-tuning. (Default: 0)
  * @param rate (not implemented) Playback rate, in percent, of the audio. (Default: 1)
  */
@js.native
trait Options extends js.Object {
  var autoplay: js.UndefOr[Boolean] = js.native
  var context: js.UndefOr[AudioContext] = js.native
  var detune: js.UndefOr[Double] = js.native
  var end: js.UndefOr[Double] = js.native
  var loop: js.UndefOr[Boolean] = js.native
  var rate: js.UndefOr[Double] = js.native
  var start: js.UndefOr[Double] = js.native
  var volume: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setAutoplay(value: Boolean): Self = this.set("autoplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoplay: Self = this.set("autoplay", js.undefined)
    @scala.inline
    def setContext(value: AudioContext): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setDetune(value: Double): Self = this.set("detune", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetune: Self = this.set("detune", js.undefined)
    @scala.inline
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setLoop(value: Boolean): Self = this.set("loop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    @scala.inline
    def setRate(value: Double): Self = this.set("rate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRate: Self = this.set("rate", js.undefined)
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setVolume(value: Double): Self = this.set("volume", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolume: Self = this.set("volume", js.undefined)
  }
  
}

