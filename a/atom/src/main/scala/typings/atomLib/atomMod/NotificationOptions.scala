package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationOptions extends js.Object {
  var buttons: js.UndefOr[js.Array[atomLib.Anon_ClassName]] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var detail: js.UndefOr[java.lang.String] = js.undefined
  var dismissable: js.UndefOr[scala.Boolean] = js.undefined
  var icon: js.UndefOr[java.lang.String] = js.undefined
}

object NotificationOptions {
  @scala.inline
  def apply(
    buttons: js.Array[atomLib.Anon_ClassName] = null,
    description: java.lang.String = null,
    detail: java.lang.String = null,
    dismissable: js.UndefOr[scala.Boolean] = js.undefined,
    icon: java.lang.String = null
  ): NotificationOptions = {
    val __obj = js.Dynamic.literal()
    if (buttons != null) __obj.updateDynamic("buttons")(buttons)
    if (description != null) __obj.updateDynamic("description")(description)
    if (detail != null) __obj.updateDynamic("detail")(detail)
    if (!js.isUndefined(dismissable)) __obj.updateDynamic("dismissable")(dismissable)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    __obj.asInstanceOf[NotificationOptions]
  }
}

