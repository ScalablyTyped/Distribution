package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2OrdersRejectionInfo extends js.Object {
  /**
    * Reason for the error.
    */
  var reason: js.UndefOr[String] = js.undefined
  /**
    * Rejection type.
    */
  var `type`: js.UndefOr[GoogleActionsV2OrdersRejectionInfoType] = js.undefined
}

object GoogleActionsV2OrdersRejectionInfo {
  @scala.inline
  def apply(reason: String = null, `type`: GoogleActionsV2OrdersRejectionInfoType = null): GoogleActionsV2OrdersRejectionInfo = {
    val __obj = js.Dynamic.literal()
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2OrdersRejectionInfo]
  }
}

