package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2OrdersOrderUpdateUserNotification extends js.Object {
  /**
    * The contents of the notification.
    */
  var text: js.UndefOr[String] = js.undefined
  /**
    * The title for the user notification.
    */
  var title: js.UndefOr[String] = js.undefined
}

object GoogleActionsV2OrdersOrderUpdateUserNotification {
  @scala.inline
  def apply(text: String = null, title: String = null): GoogleActionsV2OrdersOrderUpdateUserNotification = {
    val __obj = js.Dynamic.literal()
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2OrdersOrderUpdateUserNotification]
  }
}

