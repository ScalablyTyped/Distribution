package typings.atom.atomMod

import typings.atom.Anon_ClassName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorNotificationOptions extends NotificationOptions {
  var stack: js.UndefOr[String] = js.undefined
}

object ErrorNotificationOptions {
  @scala.inline
  def apply(
    buttons: js.Array[Anon_ClassName] = null,
    description: String = null,
    detail: String = null,
    dismissable: js.UndefOr[Boolean] = js.undefined,
    icon: String = null,
    stack: String = null
  ): ErrorNotificationOptions = {
    val __obj = js.Dynamic.literal()
    if (buttons != null) __obj.updateDynamic("buttons")(buttons)
    if (description != null) __obj.updateDynamic("description")(description)
    if (detail != null) __obj.updateDynamic("detail")(detail)
    if (!js.isUndefined(dismissable)) __obj.updateDynamic("dismissable")(dismissable)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[ErrorNotificationOptions]
  }
}

