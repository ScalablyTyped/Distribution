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

