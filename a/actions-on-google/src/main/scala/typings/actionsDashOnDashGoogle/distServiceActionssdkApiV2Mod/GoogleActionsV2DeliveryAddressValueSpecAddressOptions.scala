package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2DeliveryAddressValueSpecAddressOptions extends js.Object {
  /**
    * App can optionally pass a short text giving user a hint why delivery
    * address is requested. For example, \"Grubhub is asking your address for
    * [determining the service area].\", the text in `[]` is the custom TTS
    * that should be populated here.
    */
  var reason: js.UndefOr[String] = js.undefined
}

object GoogleActionsV2DeliveryAddressValueSpecAddressOptions {
  @scala.inline
  def apply(reason: String = null): GoogleActionsV2DeliveryAddressValueSpecAddressOptions = {
    val __obj = js.Dynamic.literal()
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2DeliveryAddressValueSpecAddressOptions]
  }
}

