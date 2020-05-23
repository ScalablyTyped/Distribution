package typings.auth0Lock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Auth0LockThemeOptions extends js.Object {
  var authButtons: js.UndefOr[Auth0LockThemeButtonOptions] = js.undefined
  var hideMainScreenTitle: js.UndefOr[Boolean] = js.undefined
  var labeledSubmitButton: js.UndefOr[Boolean] = js.undefined
  var logo: js.UndefOr[String] = js.undefined
  var primaryColor: js.UndefOr[String] = js.undefined
}

object Auth0LockThemeOptions {
  @scala.inline
  def apply(
    authButtons: Auth0LockThemeButtonOptions = null,
    hideMainScreenTitle: js.UndefOr[Boolean] = js.undefined,
    labeledSubmitButton: js.UndefOr[Boolean] = js.undefined,
    logo: String = null,
    primaryColor: String = null
  ): Auth0LockThemeOptions = {
    val __obj = js.Dynamic.literal()
    if (authButtons != null) __obj.updateDynamic("authButtons")(authButtons.asInstanceOf[js.Any])
    if (!js.isUndefined(hideMainScreenTitle)) __obj.updateDynamic("hideMainScreenTitle")(hideMainScreenTitle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(labeledSubmitButton)) __obj.updateDynamic("labeledSubmitButton")(labeledSubmitButton.get.asInstanceOf[js.Any])
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    if (primaryColor != null) __obj.updateDynamic("primaryColor")(primaryColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auth0LockThemeOptions]
  }
}

