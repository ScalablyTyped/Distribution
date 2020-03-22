package typings.agoraRtcSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLighteningContrastLevel extends js.Object {
  /**
    * The contrast level, used with the `lighteningLevel` parameter.
    *
    * - 0: Low contrast level.
    * - 1: (Default) The original contrast level.
    * - 2: High contrast level.
    */
  var lighteningContrastLevel: js.UndefOr[Double] = js.undefined
  /**
    * The brightness level.
    *
    * The value ranges from 0.0 (original) to 1.0. The default value is 0.7.
    */
  var lighteningLevel: js.UndefOr[Double] = js.undefined
  /**
    * The redness level.
    *
    * The value ranges from 0.0 (original) to 1.0. The default value is 0.1. This parameter adjusts the red saturation level.
    */
  var rednessLevel: js.UndefOr[Double] = js.undefined
  /**
    * The sharpness level.
    *
    * The value ranges from 0.0 (original) to 1.0. The default value is 0.5. This parameter is usually used to remove blemishes.
    */
  var smoothnessLevel: js.UndefOr[Double] = js.undefined
}

object AnonLighteningContrastLevel {
  @scala.inline
  def apply(
    lighteningContrastLevel: Int | Double = null,
    lighteningLevel: Int | Double = null,
    rednessLevel: Int | Double = null,
    smoothnessLevel: Int | Double = null
  ): AnonLighteningContrastLevel = {
    val __obj = js.Dynamic.literal()
    if (lighteningContrastLevel != null) __obj.updateDynamic("lighteningContrastLevel")(lighteningContrastLevel.asInstanceOf[js.Any])
    if (lighteningLevel != null) __obj.updateDynamic("lighteningLevel")(lighteningLevel.asInstanceOf[js.Any])
    if (rednessLevel != null) __obj.updateDynamic("rednessLevel")(rednessLevel.asInstanceOf[js.Any])
    if (smoothnessLevel != null) __obj.updateDynamic("smoothnessLevel")(smoothnessLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLighteningContrastLevel]
  }
}

