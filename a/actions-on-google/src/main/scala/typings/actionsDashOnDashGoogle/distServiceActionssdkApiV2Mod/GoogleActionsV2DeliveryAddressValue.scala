package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2DeliveryAddressValue extends js.Object {
  /**
    * Contains delivery address only when user agrees to share the delivery
    * address.
    */
  var location: js.UndefOr[GoogleActionsV2Location] = js.undefined
  /**
    * User's decision regarding the request.
    */
  var userDecision: js.UndefOr[GoogleActionsV2DeliveryAddressValueUserDecision] = js.undefined
}

object GoogleActionsV2DeliveryAddressValue {
  @scala.inline
  def apply(
    location: GoogleActionsV2Location = null,
    userDecision: GoogleActionsV2DeliveryAddressValueUserDecision = null
  ): GoogleActionsV2DeliveryAddressValue = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (userDecision != null) __obj.updateDynamic("userDecision")(userDecision.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2DeliveryAddressValue]
  }
}

