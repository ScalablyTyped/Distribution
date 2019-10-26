package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsOrdersV3OrderUpdateUserNotification extends js.Object {
  /**
    * The contents of the notification.
    * Max allowed length is 100 chars.
    */
  var text: js.UndefOr[String] = js.undefined
  /**
    * The title for the user notification.
    * Max allowed length is 30 chars.
    */
  var title: js.UndefOr[String] = js.undefined
}

object GoogleActionsOrdersV3OrderUpdateUserNotification {
  @scala.inline
  def apply(text: String = null, title: String = null): GoogleActionsOrdersV3OrderUpdateUserNotification = {
    val __obj = js.Dynamic.literal()
    if (text != null) __obj.updateDynamic("text")(text)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[GoogleActionsOrdersV3OrderUpdateUserNotification]
  }
}

