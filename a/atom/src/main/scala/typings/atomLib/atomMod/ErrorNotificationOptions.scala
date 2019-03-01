package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorNotificationOptions extends NotificationOptions {
  var stack: js.UndefOr[java.lang.String] = js.undefined
}

object ErrorNotificationOptions {
  @scala.inline
  def apply(
    buttons: js.Array[atomLib.Anon_ClassName] = null,
    description: java.lang.String = null,
    detail: java.lang.String = null,
    dismissable: js.UndefOr[scala.Boolean] = js.undefined,
    icon: java.lang.String = null,
    stack: java.lang.String = null
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

