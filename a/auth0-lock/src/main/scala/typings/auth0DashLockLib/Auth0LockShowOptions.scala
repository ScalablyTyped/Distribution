package typings
package auth0DashLockLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Auth0LockShowOptions extends js.Object {
  var allowForgotPassword: js.UndefOr[scala.Boolean] = js.undefined
  var allowLogin: js.UndefOr[scala.Boolean] = js.undefined
  var allowSignUp: js.UndefOr[scala.Boolean] = js.undefined
  var allowedConnections: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var auth: js.UndefOr[Auth0LockAuthOptions] = js.undefined
  var flashMessage: js.UndefOr[Auth0LockFlashMessageOptions] = js.undefined
  var initialScreen: js.UndefOr[
    auth0DashLockLib.auth0DashLockLibStrings.login | auth0DashLockLib.auth0DashLockLibStrings.signUp | auth0DashLockLib.auth0DashLockLibStrings.forgotPassword
  ] = js.undefined
  var languageDictionary: js.UndefOr[js.Any] = js.undefined
  var rememberLastLogin: js.UndefOr[scala.Boolean] = js.undefined
}

object Auth0LockShowOptions {
  @scala.inline
  def apply(
    allowForgotPassword: js.UndefOr[scala.Boolean] = js.undefined,
    allowLogin: js.UndefOr[scala.Boolean] = js.undefined,
    allowSignUp: js.UndefOr[scala.Boolean] = js.undefined,
    allowedConnections: js.Array[java.lang.String] = null,
    auth: Auth0LockAuthOptions = null,
    flashMessage: Auth0LockFlashMessageOptions = null,
    initialScreen: auth0DashLockLib.auth0DashLockLibStrings.login | auth0DashLockLib.auth0DashLockLibStrings.signUp | auth0DashLockLib.auth0DashLockLibStrings.forgotPassword = null,
    languageDictionary: js.Any = null,
    rememberLastLogin: js.UndefOr[scala.Boolean] = js.undefined
  ): Auth0LockShowOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowForgotPassword)) __obj.updateDynamic("allowForgotPassword")(allowForgotPassword)
    if (!js.isUndefined(allowLogin)) __obj.updateDynamic("allowLogin")(allowLogin)
    if (!js.isUndefined(allowSignUp)) __obj.updateDynamic("allowSignUp")(allowSignUp)
    if (allowedConnections != null) __obj.updateDynamic("allowedConnections")(allowedConnections)
    if (auth != null) __obj.updateDynamic("auth")(auth)
    if (flashMessage != null) __obj.updateDynamic("flashMessage")(flashMessage)
    if (initialScreen != null) __obj.updateDynamic("initialScreen")(initialScreen.asInstanceOf[js.Any])
    if (languageDictionary != null) __obj.updateDynamic("languageDictionary")(languageDictionary)
    if (!js.isUndefined(rememberLastLogin)) __obj.updateDynamic("rememberLastLogin")(rememberLastLogin)
    __obj.asInstanceOf[Auth0LockShowOptions]
  }
}

