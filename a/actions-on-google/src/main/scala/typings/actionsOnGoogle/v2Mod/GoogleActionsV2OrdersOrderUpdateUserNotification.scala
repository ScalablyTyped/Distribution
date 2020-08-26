package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2OrdersOrderUpdateUserNotification extends js.Object {
  /**
    * The contents of the notification.
    */
  var text: js.UndefOr[String] = js.native
  /**
    * The title for the user notification.
    */
  var title: js.UndefOr[String] = js.native
}

object GoogleActionsV2OrdersOrderUpdateUserNotification {
  @scala.inline
  def apply(): GoogleActionsV2OrdersOrderUpdateUserNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersOrderUpdateUserNotification]
  }
  @scala.inline
  implicit class GoogleActionsV2OrdersOrderUpdateUserNotificationOps[Self <: GoogleActionsV2OrdersOrderUpdateUserNotification] (val x: Self) extends AnyVal {
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
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

