package typings.agoraRtcSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LighteningContrastLevel extends js.Object {
  /** The contrast level, used with the `lighteningLevel` parameter.
    *
    * - 0: Low contrast level.
    * - 1: (Default) The original contrast level.
    * - 2: High contrast level.
    */
  var lighteningContrastLevel: js.UndefOr[Double] = js.native
  /** The brightness level.
    *
    * The value ranges from 0.0 (original) to 1.0. The default value is 0.7.
    */
  var lighteningLevel: js.UndefOr[Double] = js.native
  /** The redness level.
    *
    * The value ranges from 0.0 (original) to 1.0. The default value is 0.1. This parameter adjusts the red saturation level.
    */
  var rednessLevel: js.UndefOr[Double] = js.native
  /** The sharpness level.
    *
    * The value ranges from 0.0 (original) to 1.0. The default value is 0.5. This parameter is usually used to remove blemishes.
    */
  var smoothnessLevel: js.UndefOr[Double] = js.native
}

object LighteningContrastLevel {
  @scala.inline
  def apply(): LighteningContrastLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LighteningContrastLevel]
  }
  @scala.inline
  implicit class LighteningContrastLevelOps[Self <: LighteningContrastLevel] (val x: Self) extends AnyVal {
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
    def setLighteningContrastLevel(value: Double): Self = this.set("lighteningContrastLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLighteningContrastLevel: Self = this.set("lighteningContrastLevel", js.undefined)
    @scala.inline
    def setLighteningLevel(value: Double): Self = this.set("lighteningLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLighteningLevel: Self = this.set("lighteningLevel", js.undefined)
    @scala.inline
    def setRednessLevel(value: Double): Self = this.set("rednessLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRednessLevel: Self = this.set("rednessLevel", js.undefined)
    @scala.inline
    def setSmoothnessLevel(value: Double): Self = this.set("smoothnessLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmoothnessLevel: Self = this.set("smoothnessLevel", js.undefined)
  }
  
}

