package typings
package auth0DashLockLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Auth0LockConstructorOptions extends js.Object {
  var _enableIdPInitiatedLogin: js.UndefOr[scala.Boolean] = js.undefined
  var _enableImpersonation: js.UndefOr[scala.Boolean] = js.undefined
  var additionalSignUpFields: js.UndefOr[js.Array[Auth0LockAdditionalSignUpField]] = js.undefined
  var allowAutocomplete: js.UndefOr[scala.Boolean] = js.undefined
  var allowForgotPassword: js.UndefOr[scala.Boolean] = js.undefined
  var allowLogin: js.UndefOr[scala.Boolean] = js.undefined
  var allowPasswordAutocomplete: js.UndefOr[scala.Boolean] = js.undefined
  var allowShowPassword: js.UndefOr[scala.Boolean] = js.undefined
  var allowSignUp: js.UndefOr[scala.Boolean] = js.undefined
  var allowedConnections: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var assetsUrl: js.UndefOr[java.lang.String] = js.undefined
  var auth: js.UndefOr[Auth0LockAuthOptions] = js.undefined
  var autoclose: js.UndefOr[scala.Boolean] = js.undefined
  var autofocus: js.UndefOr[scala.Boolean] = js.undefined
  var avatar: js.UndefOr[Auth0LockAvatarOptions | scala.Null] = js.undefined
  var clientBaseUrl: js.UndefOr[java.lang.String] = js.undefined
  var closable: js.UndefOr[scala.Boolean] = js.undefined
  var configurationBaseUrl: js.UndefOr[java.lang.String] = js.undefined
  var container: js.UndefOr[java.lang.String] = js.undefined
  var defaultADUsernameFromEmailPrefix: js.UndefOr[scala.Boolean] = js.undefined
  var defaultDatabaseConnection: js.UndefOr[java.lang.String] = js.undefined
  var defaultEnterpriseConnection: js.UndefOr[java.lang.String] = js.undefined
  var flashMessage: js.UndefOr[Auth0LockFlashMessageOptions] = js.undefined
  var forgotPasswordLink: js.UndefOr[java.lang.String] = js.undefined
  var hashCleanup: js.UndefOr[scala.Boolean] = js.undefined
  var initialScreen: js.UndefOr[
    auth0DashLockLib.auth0DashLockLibStrings.login | auth0DashLockLib.auth0DashLockLibStrings.signUp | auth0DashLockLib.auth0DashLockLibStrings.forgotPassword
  ] = js.undefined
  var language: js.UndefOr[java.lang.String] = js.undefined
  var languageBaseUrl: js.UndefOr[java.lang.String] = js.undefined
  var languageDictionary: js.UndefOr[js.Any] = js.undefined
  var leeway: js.UndefOr[scala.Double] = js.undefined
  var loginAfterSignUp: js.UndefOr[scala.Boolean] = js.undefined
  var mustAcceptTerms: js.UndefOr[scala.Boolean] = js.undefined
  var oidcConformant: js.UndefOr[scala.Boolean] = js.undefined
  var popupOptions: js.UndefOr[Auth0LockPopupOptions] = js.undefined
  var prefill: js.UndefOr[Anon_Email] = js.undefined
  var rememberLastLogin: js.UndefOr[scala.Boolean] = js.undefined
  var scrollGlobalMessagesIntoView: js.UndefOr[scala.Boolean] = js.undefined
  var signupLink: js.UndefOr[java.lang.String] = js.undefined
  var socialButtonStyle: js.UndefOr[
    auth0DashLockLib.auth0DashLockLibStrings.big | auth0DashLockLib.auth0DashLockLibStrings.small
  ] = js.undefined
  var theme: js.UndefOr[Auth0LockThemeOptions] = js.undefined
  var usernameStyle: js.UndefOr[java.lang.String] = js.undefined
}

