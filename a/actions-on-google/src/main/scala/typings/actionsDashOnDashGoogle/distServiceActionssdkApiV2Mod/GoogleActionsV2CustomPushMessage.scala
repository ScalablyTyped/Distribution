package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2CustomPushMessage extends js.Object {
  /**
    * An order update updating orders placed through transaction APIs.
    */
  var orderUpdate: js.UndefOr[GoogleActionsV2OrdersOrderUpdate] = js.undefined
  /**
    * The specified target for the push request.
    */
  var target: js.UndefOr[GoogleActionsV2CustomPushMessageTarget] = js.undefined
  /**
    * If specified, displays a notification to the user with specified title
    * and text.
    */
  var userNotification: js.UndefOr[GoogleActionsV2UserNotification] = js.undefined
}

object GoogleActionsV2CustomPushMessage {
  @scala.inline
  def apply(
    orderUpdate: GoogleActionsV2OrdersOrderUpdate = null,
    target: GoogleActionsV2CustomPushMessageTarget = null,
    userNotification: GoogleActionsV2UserNotification = null
  ): GoogleActionsV2CustomPushMessage = {
    val __obj = js.Dynamic.literal()
    if (orderUpdate != null) __obj.updateDynamic("orderUpdate")(orderUpdate)
    if (target != null) __obj.updateDynamic("target")(target)
    if (userNotification != null) __obj.updateDynamic("userNotification")(userNotification)
    __obj.asInstanceOf[GoogleActionsV2CustomPushMessage]
  }
}

