package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StaticImageDeactivateScheduleActionSettings extends js.Object {
  /**
    * The time in milliseconds for the image to fade out. Default is 0 (no fade-out).
    */
  var FadeOut: js.UndefOr[__integerMin0] = js.undefined
  /**
    * The image overlay layer to deactivate, 0 to 7. Default is 0.
    */
  var Layer: js.UndefOr[__integerMin0Max7] = js.undefined
}

object StaticImageDeactivateScheduleActionSettings {
  @scala.inline
  def apply(
    FadeOut: js.UndefOr[__integerMin0] = js.undefined,
    Layer: js.UndefOr[__integerMin0Max7] = js.undefined
  ): StaticImageDeactivateScheduleActionSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(FadeOut)) __obj.updateDynamic("FadeOut")(FadeOut)
    if (!js.isUndefined(Layer)) __obj.updateDynamic("Layer")(Layer)
    __obj.asInstanceOf[StaticImageDeactivateScheduleActionSettings]
  }
}

