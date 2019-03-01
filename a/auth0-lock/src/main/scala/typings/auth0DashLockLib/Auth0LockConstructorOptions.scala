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

object Auth0LockConstructorOptions {
  @scala.inline
  def apply(
    _enableIdPInitiatedLogin: js.UndefOr[scala.Boolean] = js.undefined,
    _enableImpersonation: js.UndefOr[scala.Boolean] = js.undefined,
    additionalSignUpFields: js.Array[Auth0LockAdditionalSignUpField] = null,
    allowAutocomplete: js.UndefOr[scala.Boolean] = js.undefined,
    allowForgotPassword: js.UndefOr[scala.Boolean] = js.undefined,
    allowLogin: js.UndefOr[scala.Boolean] = js.undefined,
    allowPasswordAutocomplete: js.UndefOr[scala.Boolean] = js.undefined,
    allowShowPassword: js.UndefOr[scala.Boolean] = js.undefined,
    allowSignUp: js.UndefOr[scala.Boolean] = js.undefined,
    allowedConnections: js.Array[java.lang.String] = null,
    assetsUrl: java.lang.String = null,
    auth: Auth0LockAuthOptions = null,
    autoclose: js.UndefOr[scala.Boolean] = js.undefined,
    autofocus: js.UndefOr[scala.Boolean] = js.undefined,
    avatar: Auth0LockAvatarOptions = null,
    clientBaseUrl: java.lang.String = null,
    closable: js.UndefOr[scala.Boolean] = js.undefined,
    configurationBaseUrl: java.lang.String = null,
    container: java.lang.String = null,
    defaultADUsernameFromEmailPrefix: js.UndefOr[scala.Boolean] = js.undefined,
    defaultDatabaseConnection: java.lang.String = null,
    defaultEnterpriseConnection: java.lang.String = null,
    flashMessage: Auth0LockFlashMessageOptions = null,
    forgotPasswordLink: java.lang.String = null,
    hashCleanup: js.UndefOr[scala.Boolean] = js.undefined,
    initialScreen: auth0DashLockLib.auth0DashLockLibStrings.login | auth0DashLockLib.auth0DashLockLibStrings.signUp | auth0DashLockLib.auth0DashLockLibStrings.forgotPassword = null,
    language: java.lang.String = null,
    languageBaseUrl: java.lang.String = null,
    languageDictionary: js.Any = null,
    leeway: scala.Int | scala.Double = null,
    loginAfterSignUp: js.UndefOr[scala.Boolean] = js.undefined,
    mustAcceptTerms: js.UndefOr[scala.Boolean] = js.undefined,
    oidcConformant: js.UndefOr[scala.Boolean] = js.undefined,
    popupOptions: Auth0LockPopupOptions = null,
    prefill: Anon_Email = null,
    rememberLastLogin: js.UndefOr[scala.Boolean] = js.undefined,
    scrollGlobalMessagesIntoView: js.UndefOr[scala.Boolean] = js.undefined,
    signupLink: java.lang.String = null,
    socialButtonStyle: auth0DashLockLib.auth0DashLockLibStrings.big | auth0DashLockLib.auth0DashLockLibStrings.small = null,
    theme: Auth0LockThemeOptions = null,
    usernameStyle: java.lang.String = null
  ): Auth0LockConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(_enableIdPInitiatedLogin)) __obj.updateDynamic("_enableIdPInitiatedLogin")(_enableIdPInitiatedLogin)
    if (!js.isUndefined(_enableImpersonation)) __obj.updateDynamic("_enableImpersonation")(_enableImpersonation)
    if (additionalSignUpFields != null) __obj.updateDynamic("additionalSignUpFields")(additionalSignUpFields)
    if (!js.isUndefined(allowAutocomplete)) __obj.updateDynamic("allowAutocomplete")(allowAutocomplete)
    if (!js.isUndefined(allowForgotPassword)) __obj.updateDynamic("allowForgotPassword")(allowForgotPassword)
    if (!js.isUndefined(allowLogin)) __obj.updateDynamic("allowLogin")(allowLogin)
    if (!js.isUndefined(allowPasswordAutocomplete)) __obj.updateDynamic("allowPasswordAutocomplete")(allowPasswordAutocomplete)
    if (!js.isUndefined(allowShowPassword)) __obj.updateDynamic("allowShowPassword")(allowShowPassword)
    if (!js.isUndefined(allowSignUp)) __obj.updateDynamic("allowSignUp")(allowSignUp)
    if (allowedConnections != null) __obj.updateDynamic("allowedConnections")(allowedConnections)
    if (assetsUrl != null) __obj.updateDynamic("assetsUrl")(assetsUrl)
    if (auth != null) __obj.updateDynamic("auth")(auth)
    if (!js.isUndefined(autoclose)) __obj.updateDynamic("autoclose")(autoclose)
    if (!js.isUndefined(autofocus)) __obj.updateDynamic("autofocus")(autofocus)
    if (avatar != null) __obj.updateDynamic("avatar")(avatar)
    if (clientBaseUrl != null) __obj.updateDynamic("clientBaseUrl")(clientBaseUrl)
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable)
    if (configurationBaseUrl != null) __obj.updateDynamic("configurationBaseUrl")(configurationBaseUrl)
    if (container != null) __obj.updateDynamic("container")(container)
    if (!js.isUndefined(defaultADUsernameFromEmailPrefix)) __obj.updateDynamic("defaultADUsernameFromEmailPrefix")(defaultADUsernameFromEmailPrefix)
    if (defaultDatabaseConnection != null) __obj.updateDynamic("defaultDatabaseConnection")(defaultDatabaseConnection)
    if (defaultEnterpriseConnection != null) __obj.updateDynamic("defaultEnterpriseConnection")(defaultEnterpriseConnection)
    if (flashMessage != null) __obj.updateDynamic("flashMessage")(flashMessage)
    if (forgotPasswordLink != null) __obj.updateDynamic("forgotPasswordLink")(forgotPasswordLink)
    if (!js.isUndefined(hashCleanup)) __obj.updateDynamic("hashCleanup")(hashCleanup)
    if (initialScreen != null) __obj.updateDynamic("initialScreen")(initialScreen.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language)
    if (languageBaseUrl != null) __obj.updateDynamic("languageBaseUrl")(languageBaseUrl)
    if (languageDictionary != null) __obj.updateDynamic("languageDictionary")(languageDictionary)
    if (leeway != null) __obj.updateDynamic("leeway")(leeway.asInstanceOf[js.Any])
    if (!js.isUndefined(loginAfterSignUp)) __obj.updateDynamic("loginAfterSignUp")(loginAfterSignUp)
    if (!js.isUndefined(mustAcceptTerms)) __obj.updateDynamic("mustAcceptTerms")(mustAcceptTerms)
    if (!js.isUndefined(oidcConformant)) __obj.updateDynamic("oidcConformant")(oidcConformant)
    if (popupOptions != null) __obj.updateDynamic("popupOptions")(popupOptions)
    if (prefill != null) __obj.updateDynamic("prefill")(prefill)
    if (!js.isUndefined(rememberLastLogin)) __obj.updateDynamic("rememberLastLogin")(rememberLastLogin)
    if (!js.isUndefined(scrollGlobalMessagesIntoView)) __obj.updateDynamic("scrollGlobalMessagesIntoView")(scrollGlobalMessagesIntoView)
    if (signupLink != null) __obj.updateDynamic("signupLink")(signupLink)
    if (socialButtonStyle != null) __obj.updateDynamic("socialButtonStyle")(socialButtonStyle.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (usernameStyle != null) __obj.updateDynamic("usernameStyle")(usernameStyle)
    __obj.asInstanceOf[Auth0LockConstructorOptions]
  }
}

