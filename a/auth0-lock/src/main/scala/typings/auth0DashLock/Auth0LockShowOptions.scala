package typings.auth0DashLock

import typings.auth0DashLock.auth0DashLockStrings.forgotPassword
import typings.auth0DashLock.auth0DashLockStrings.login
import typings.auth0DashLock.auth0DashLockStrings.signUp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Auth0LockShowOptions extends js.Object {
  var allowForgotPassword: js.UndefOr[Boolean] = js.undefined
  var allowLogin: js.UndefOr[Boolean] = js.undefined
  var allowSignUp: js.UndefOr[Boolean] = js.undefined
  var allowedConnections: js.UndefOr[js.Array[String]] = js.undefined
  var auth: js.UndefOr[Auth0LockAuthOptions] = js.undefined
  var flashMessage: js.UndefOr[Auth0LockFlashMessageOptions] = js.undefined
  var initialScreen: js.UndefOr[login | signUp | forgotPassword] = js.undefined
  var languageDictionary: js.UndefOr[js.Any] = js.undefined
  var rememberLastLogin: js.UndefOr[Boolean] = js.undefined
}

object Auth0LockShowOptions {
  @scala.inline
  def apply(
    allowForgotPassword: js.UndefOr[Boolean] = js.undefined,
    allowLogin: js.UndefOr[Boolean] = js.undefined,
    allowSignUp: js.UndefOr[Boolean] = js.undefined,
    allowedConnections: js.Array[String] = null,
    auth: Auth0LockAuthOptions = null,
    flashMessage: Auth0LockFlashMessageOptions = null,
    initialScreen: login | signUp | forgotPassword = null,
    languageDictionary: js.Any = null,
    rememberLastLogin: js.UndefOr[Boolean] = js.undefined
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

