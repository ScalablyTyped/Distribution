package typings.atom.mod

import typings.atom.AnonClassName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorNotificationOptions extends NotificationOptions {
  var stack: js.UndefOr[String] = js.undefined
}

object ErrorNotificationOptions {
  @scala.inline
  def apply(
    buttons: js.Array[AnonClassName] = null,
    description: String = null,
    detail: String = null,
    dismissable: js.UndefOr[Boolean] = js.undefined,
    icon: String = null,
    stack: String = null
  ): ErrorNotificationOptions = {
    val __obj = js.Dynamic.literal()
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (detail != null) __obj.updateDynamic("detail")(detail.asInstanceOf[js.Any])
    if (!js.isUndefined(dismissable)) __obj.updateDynamic("dismissable")(dismissable.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorNotificationOptions]
  }
}

