package typings
package auth0DashLockLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Auth0LockThemeOptions extends js.Object {
  var authButtons: js.UndefOr[Auth0LockThemeButtonOptions] = js.undefined
  var hideMainScreenTitle: js.UndefOr[scala.Boolean] = js.undefined
  var labeledSubmitButton: js.UndefOr[scala.Boolean] = js.undefined
  var logo: js.UndefOr[java.lang.String] = js.undefined
  var primaryColor: js.UndefOr[java.lang.String] = js.undefined
}

object Auth0LockThemeOptions {
  @scala.inline
  def apply(
    authButtons: Auth0LockThemeButtonOptions = null,
    hideMainScreenTitle: js.UndefOr[scala.Boolean] = js.undefined,
    labeledSubmitButton: js.UndefOr[scala.Boolean] = js.undefined,
    logo: java.lang.String = null,
    primaryColor: java.lang.String = null
  ): Auth0LockThemeOptions = {
    val __obj = js.Dynamic.literal()
    if (authButtons != null) __obj.updateDynamic("authButtons")(authButtons)
    if (!js.isUndefined(hideMainScreenTitle)) __obj.updateDynamic("hideMainScreenTitle")(hideMainScreenTitle)
    if (!js.isUndefined(labeledSubmitButton)) __obj.updateDynamic("labeledSubmitButton")(labeledSubmitButton)
    if (logo != null) __obj.updateDynamic("logo")(logo)
    if (primaryColor != null) __obj.updateDynamic("primaryColor")(primaryColor)
    __obj.asInstanceOf[Auth0LockThemeOptions]
  }
}

