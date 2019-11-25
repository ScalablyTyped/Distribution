package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2OrdersReturnInfo extends js.Object {
  /**
    * Reason for return.
    */
  var reason: js.UndefOr[String] = js.undefined
}

object GoogleActionsV2OrdersReturnInfo {
  @scala.inline
  def apply(reason: String = null): GoogleActionsV2OrdersReturnInfo = {
    val __obj = js.Dynamic.literal()
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2OrdersReturnInfo]
  }
}

