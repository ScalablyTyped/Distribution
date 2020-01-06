package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NoiseReducerTemporalFilterSettings extends js.Object {
  /**
    * Use Aggressive mode for content that has complex motion. Higher values produce stronger temporal filtering. This filters highly complex scenes more aggressively and creates better VQ for low bitrate outputs.
    */
  var AggressiveMode: js.UndefOr[__integerMin0Max4] = js.native
  /**
    * The speed of the filter (higher number is faster). Low setting reduces bit rate at the cost of transcode time, high setting improves transcode time at the cost of bit rate.
    */
  var Speed: js.UndefOr[__integerMinNegative1Max3] = js.native
  /**
    * Specify the strength of the noise reducing filter on this output. Higher values produce stronger filtering. We recommend the following value ranges, depending on the result that you want: * 0-2 for complexity reduction with minimal sharpness loss * 2-8 for complexity reduction with image preservation * 8-16 for a high level of complexity reduction
    */
  var Strength: js.UndefOr[__integerMin0Max16] = js.native
}

object NoiseReducerTemporalFilterSettings {
  @scala.inline
  def apply(AggressiveMode: Int | Double = null, Speed: Int | Double = null, Strength: Int | Double = null): NoiseReducerTemporalFilterSettings = {
    val __obj = js.Dynamic.literal()
    if (AggressiveMode != null) __obj.updateDynamic("AggressiveMode")(AggressiveMode.asInstanceOf[js.Any])
    if (Speed != null) __obj.updateDynamic("Speed")(Speed.asInstanceOf[js.Any])
    if (Strength != null) __obj.updateDynamic("Strength")(Strength.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoiseReducerTemporalFilterSettings]
  }
}

