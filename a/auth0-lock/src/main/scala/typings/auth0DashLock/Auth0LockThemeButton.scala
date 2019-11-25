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
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any])
    if (foregroundColor != null) __obj.updateDynamic("foregroundColor")(foregroundColor.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (primaryColor != null) __obj.updateDynamic("primaryColor")(primaryColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auth0LockThemeButton]
  }
}

