package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoiseReducerTemporalFilterSettings extends js.Object {
  /**
    * Use Aggressive mode for content that has complex motion. Higher values produce stronger temporal filtering. This filters highly complex scenes more aggressively and creates better VQ for low bitrate outputs.
    */
  var AggressiveMode: js.UndefOr[__integerMin0Max4] = js.undefined
  /**
    * The speed of the filter (higher number is faster). Low setting reduces bit rate at the cost of transcode time, high setting improves transcode time at the cost of bit rate.
    */
  var Speed: js.UndefOr[__integerMinNegative1Max3] = js.undefined
  /**
    * Relative strength of noise reducing filter. Higher values produce stronger filtering. Recommended Range: * [0 .. 2] for complexity reduction with minimal sharpness loss * [2 .. 8] for complexity reduction with image preservation * [8 .. 16] for noise reduction. Reduce noise combined high complexity reduction
    */
  var Strength: js.UndefOr[__integerMin0Max16] = js.undefined
}

object NoiseReducerTemporalFilterSettings {
  @scala.inline
  def apply(
    AggressiveMode: js.UndefOr[__integerMin0Max4] = js.undefined,
    Speed: js.UndefOr[__integerMinNegative1Max3] = js.undefined,
    Strength: js.UndefOr[__integerMin0Max16] = js.undefined
  ): NoiseReducerTemporalFilterSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AggressiveMode)) __obj.updateDynamic("AggressiveMode")(AggressiveMode)
    if (!js.isUndefined(Speed)) __obj.updateDynamic("Speed")(Speed)
    if (!js.isUndefined(Strength)) __obj.updateDynamic("Strength")(Strength)
    __obj.asInstanceOf[NoiseReducerTemporalFilterSettings]
  }
}

