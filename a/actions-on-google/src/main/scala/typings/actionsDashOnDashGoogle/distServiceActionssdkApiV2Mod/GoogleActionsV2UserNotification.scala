package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2UserNotification extends js.Object {
  /**
    * The content of the notification.
    */
  var text: js.UndefOr[String] = js.undefined
  /**
    * The title for the notification.
    */
  var title: js.UndefOr[String] = js.undefined
}

object GoogleActionsV2UserNotification {
  @scala.inline
  def apply(text: String = null, title: String = null): GoogleActionsV2UserNotification = {
    val __obj = js.Dynamic.literal()
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2UserNotification]
  }
}

