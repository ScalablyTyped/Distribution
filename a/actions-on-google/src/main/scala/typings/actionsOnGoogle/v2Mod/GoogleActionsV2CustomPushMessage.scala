package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2CustomPushMessage extends js.Object {
  /**
    * An order update updating orders placed through transaction APIs.
    */
  var orderUpdate: js.UndefOr[GoogleActionsV2OrdersOrderUpdate] = js.native
  /**
    * The specified target for the push request.
    */
  var target: js.UndefOr[GoogleActionsV2CustomPushMessageTarget] = js.native
  /**
    * If specified, displays a notification to the user with specified title
    * and text.
    */
  var userNotification: js.UndefOr[GoogleActionsV2UserNotification] = js.native
}

object GoogleActionsV2CustomPushMessage {
  @scala.inline
  def apply(): GoogleActionsV2CustomPushMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2CustomPushMessage]
  }
  @scala.inline
  implicit class GoogleActionsV2CustomPushMessageOps[Self <: GoogleActionsV2CustomPushMessage] (val x: Self) extends AnyVal {
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
    def setOrderUpdate(value: GoogleActionsV2OrdersOrderUpdate): Self = this.set("orderUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderUpdate: Self = this.set("orderUpdate", js.undefined)
    @scala.inline
    def setTarget(value: GoogleActionsV2CustomPushMessageTarget): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setUserNotification(value: GoogleActionsV2UserNotification): Self = this.set("userNotification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserNotification: Self = this.set("userNotification", js.undefined)
  }
  
}

