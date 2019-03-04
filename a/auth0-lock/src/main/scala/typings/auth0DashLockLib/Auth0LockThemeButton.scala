package typings
package auth0DashLockLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Auth0LockThemeButton extends js.Object {
  var displayName: java.lang.String
  var foregroundColor: js.UndefOr[java.lang.String] = js.undefined
  var icon: js.UndefOr[java.lang.String] = js.undefined
  var primaryColor: js.UndefOr[java.lang.String] = js.undefined
}

object Auth0LockThemeButton {
  @scala.inline
  def apply(
    displayName: java.lang.String,
    foregroundColor: java.lang.String = null,
    icon: java.lang.String = null,
    primaryColor: java.lang.String = null
  ): Auth0LockThemeButton = {
    val __obj = js.Dynamic.literal(displayName = displayName)
    if (foregroundColor != null) __obj.updateDynamic("foregroundColor")(foregroundColor)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (primaryColor != null) __obj.updateDynamic("primaryColor")(primaryColor)
    __obj.asInstanceOf[Auth0LockThemeButton]
  }
}

