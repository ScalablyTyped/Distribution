package typings.auth0DashLock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Auth0LockThemeButton extends js.Object {
  var displayName: String
  var foregroundColor: js.UndefOr[String] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var primaryColor: js.UndefOr[String] = js.undefined
}

object Auth0LockThemeButton {
  @scala.inline
  def apply(
    displayName: String,
    foregroundColor: String = null,
    icon: String = null,
    primaryColor: String = null
  ): Auth0LockThemeButton = {
    val __obj = js.Dynamic.literal(displayName = displayName)
    if (foregroundColor != null) __obj.updateDynamic("foregroundColor")(foregroundColor)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (primaryColor != null) __obj.updateDynamic("primaryColor")(primaryColor)
    __obj.asInstanceOf[Auth0LockThemeButton]
  }
}

