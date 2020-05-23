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
trait Options extends js.Object {
  var autoplay: js.UndefOr[Boolean] = js.undefined
  var context: js.UndefOr[AudioContext] = js.undefined
  var detune: js.UndefOr[Double] = js.undefined
  var end: js.UndefOr[Double] = js.undefined
  var loop: js.UndefOr[Boolean] = js.undefined
  var rate: js.UndefOr[Double] = js.undefined
  var start: js.UndefOr[Double] = js.undefined
  var volume: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    autoplay: js.UndefOr[Boolean] = js.undefined,
    context: AudioContext = null,
    detune: js.UndefOr[Double] = js.undefined,
    end: js.UndefOr[Double] = js.undefined,
    loop: js.UndefOr[Boolean] = js.undefined,
    rate: js.UndefOr[Double] = js.undefined,
    start: js.UndefOr[Double] = js.undefined,
    volume: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay.get.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(detune)) __obj.updateDynamic("detune")(detune.get.asInstanceOf[js.Any])
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rate)) __obj.updateDynamic("rate")(rate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.get.asInstanceOf[js.Any])
    if (!js.isUndefined(volume)) __obj.updateDynamic("volume")(volume.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

