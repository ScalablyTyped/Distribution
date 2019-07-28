package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoiseReducerSpatialFilterSettings extends js.Object {
  /**
    * Specify strength of post noise reduction sharpening filter, with 0 disabling the filter and 3 enabling it at maximum strength.
    */
  var PostFilterSharpenStrength: js.UndefOr[__integerMin0Max3] = js.undefined
  /**
    * The speed of the filter, from -2 (lower speed) to 3 (higher speed), with 0 being the nominal value.
    */
  var Speed: js.UndefOr[__integerMinNegative2Max3] = js.undefined
  /**
    * Relative strength of noise reducing filter. Higher values produce stronger filtering.
    */
  var Strength: js.UndefOr[__integerMin0Max16] = js.undefined
}

object NoiseReducerSpatialFilterSettings {
  @scala.inline
  def apply(
    PostFilterSharpenStrength: js.UndefOr[__integerMin0Max3] = js.undefined,
    Speed: js.UndefOr[__integerMinNegative2Max3] = js.undefined,
    Strength: js.UndefOr[__integerMin0Max16] = js.undefined
  ): NoiseReducerSpatialFilterSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(PostFilterSharpenStrength)) __obj.updateDynamic("PostFilterSharpenStrength")(PostFilterSharpenStrength)
    if (!js.isUndefined(Speed)) __obj.updateDynamic("Speed")(Speed)
    if (!js.isUndefined(Strength)) __obj.updateDynamic("Strength")(Strength)
    __obj.asInstanceOf[NoiseReducerSpatialFilterSettings]
  }
}

