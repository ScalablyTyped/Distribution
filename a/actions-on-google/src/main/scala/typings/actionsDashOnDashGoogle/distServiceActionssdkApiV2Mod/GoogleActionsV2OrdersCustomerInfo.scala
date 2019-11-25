package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2OrdersCustomerInfo extends js.Object {
  /**
    * Customer email will be included and returned to the app if
    * CustomerInfoProperty.EMAIL specified in CustomerInfoOptions.
    */
  var email: js.UndefOr[String] = js.undefined
}

object GoogleActionsV2OrdersCustomerInfo {
  @scala.inline
  def apply(email: String = null): GoogleActionsV2OrdersCustomerInfo = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2OrdersCustomerInfo]
  }
}

