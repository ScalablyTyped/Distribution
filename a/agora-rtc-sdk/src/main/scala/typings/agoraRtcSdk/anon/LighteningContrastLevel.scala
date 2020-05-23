package typings.agoraRtcSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LighteningContrastLevel extends js.Object {
  /** The contrast level, used with the `lighteningLevel` parameter.
    *
    * - 0: Low contrast level.
    * - 1: (Default) The original contrast level.
    * - 2: High contrast level.
    */
  var lighteningContrastLevel: js.UndefOr[Double] = js.undefined
  /** The brightness level.
    *
    * The value ranges from 0.0 (original) to 1.0. The default value is 0.7.
    */
  var lighteningLevel: js.UndefOr[Double] = js.undefined
  /** The redness level.
    *
    * The value ranges from 0.0 (original) to 1.0. The default value is 0.1. This parameter adjusts the red saturation level.
    */
  var rednessLevel: js.UndefOr[Double] = js.undefined
  /** The sharpness level.
    *
    * The value ranges from 0.0 (original) to 1.0. The default value is 0.5. This parameter is usually used to remove blemishes.
    */
  var smoothnessLevel: js.UndefOr[Double] = js.undefined
}

object LighteningContrastLevel {
  @scala.inline
  def apply(
    lighteningContrastLevel: js.UndefOr[Double] = js.undefined,
    lighteningLevel: js.UndefOr[Double] = js.undefined,
    rednessLevel: js.UndefOr[Double] = js.undefined,
    smoothnessLevel: js.UndefOr[Double] = js.undefined
  ): LighteningContrastLevel = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(lighteningContrastLevel)) __obj.updateDynamic("lighteningContrastLevel")(lighteningContrastLevel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lighteningLevel)) __obj.updateDynamic("lighteningLevel")(lighteningLevel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rednessLevel)) __obj.updateDynamic("rednessLevel")(rednessLevel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(smoothnessLevel)) __obj.updateDynamic("smoothnessLevel")(smoothnessLevel.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LighteningContrastLevel]
  }
}

