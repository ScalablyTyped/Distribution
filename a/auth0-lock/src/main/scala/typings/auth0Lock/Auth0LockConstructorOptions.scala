package typings.auth0Lock

import typings.auth0Lock.anon.Email
import typings.auth0Lock.auth0LockStrings.big
import typings.auth0Lock.auth0LockStrings.forgotPassword
import typings.auth0Lock.auth0LockStrings.login
import typings.auth0Lock.auth0LockStrings.signUp
import typings.auth0Lock.auth0LockStrings.small
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Auth0LockConstructorOptions extends StObject {
  
  var _enableIdPInitiatedLogin: js.UndefOr[Boolean] = js.undefined
  
  var _enableImpersonation: js.UndefOr[Boolean] = js.undefined
  
  var additionalSignUpFields: js.UndefOr[js.Array[Auth0LockAdditionalSignUpField]] = js.undefined
  
  var allowAutocomplete: js.UndefOr[Boolean] = js.undefined
  
  var allowForgotPassword: js.UndefOr[Boolean] = js.undefined
  
  var allowLogin: js.UndefOr[Boolean] = js.undefined
  
  var allowPasswordAutocomplete: js.UndefOr[Boolean] = js.undefined
  
  var allowShowPassword: js.UndefOr[Boolean] = js.undefined
  
  var allowSignUp: js.UndefOr[Boolean] = js.undefined
  
  var allowedConnections: js.UndefOr[js.Array[String]] = js.undefined
  
  var assetsUrl: js.UndefOr[String] = js.undefined
  
  var auth: js.UndefOr[Auth0LockAuthOptions] = js.undefined
  
  var autoclose: js.UndefOr[Boolean] = js.undefined
  
  var autofocus: js.UndefOr[Boolean] = js.undefined
  
  var avatar: js.UndefOr[Auth0LockAvatarOptions | Null] = js.undefined
  
  var clientBaseUrl: js.UndefOr[String] = js.undefined
  
  var closable: js.UndefOr[Boolean] = js.undefined
  
  var configurationBaseUrl: js.UndefOr[String] = js.undefined
  
  var container: js.UndefOr[String] = js.undefined
  
  var defaultADUsernameFromEmailPrefix: js.UndefOr[Boolean] = js.undefined
  
  var defaultDatabaseConnection: js.UndefOr[String] = js.undefined
  
  var defaultEnterpriseConnection: js.UndefOr[String] = js.undefined
  
  var flashMessage: js.UndefOr[Auth0LockFlashMessageOptions] = js.undefined
  
  var forgotPasswordLink: js.UndefOr[String] = js.undefined
  
  var hashCleanup: js.UndefOr[Boolean] = js.undefined
  
  var initialScreen: js.UndefOr[login | signUp | forgotPassword] = js.undefined
  
  var language: js.UndefOr[String] = js.undefined
  
  var languageBaseUrl: js.UndefOr[String] = js.undefined
  
  var languageDictionary: js.UndefOr[js.Any] = js.undefined
  
  var leeway: js.UndefOr[Double] = js.undefined
  
  var loginAfterSignUp: js.UndefOr[Boolean] = js.undefined
  
  var mustAcceptTerms: js.UndefOr[Boolean] = js.undefined
  
  var oidcConformant: js.UndefOr[Boolean] = js.undefined
  
  var popupOptions: js.UndefOr[Auth0LockPopupOptions] = js.undefined
  
  var prefill: js.UndefOr[Email] = js.undefined
  
  var rememberLastLogin: js.UndefOr[Boolean] = js.undefined
  
  var scrollGlobalMessagesIntoView: js.UndefOr[Boolean] = js.undefined
  
  var signupLink: js.UndefOr[String] = js.undefined
  
  var socialButtonStyle: js.UndefOr[big | small] = js.undefined
  
  var theme: js.UndefOr[Auth0LockThemeOptions] = js.undefined
  
  var usernameStyle: js.UndefOr[String] = js.undefined
}
object Auth0LockConstructorOptions {
  
  @scala.inline
  def apply(): Auth0LockConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Auth0LockConstructorOptions]
  }
  
  @scala.inline
  implicit class Auth0LockConstructorOptionsMutableBuilder[Self <: Auth0LockConstructorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalSignUpFields(value: js.Array[Auth0LockAdditionalSignUpField]): Self = StObject.set(x, "additionalSignUpFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalSignUpFieldsUndefined: Self = StObject.set(x, "additionalSignUpFields", js.undefined)
    
    @scala.inline
    def setAdditionalSignUpFieldsVarargs(value: Auth0LockAdditionalSignUpField*): Self = StObject.set(x, "additionalSignUpFields", js.Array(value :_*))
    
    @scala.inline
    def setAllowAutocomplete(value: Boolean): Self = StObject.set(x, "allowAutocomplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowAutocompleteUndefined: Self = StObject.set(x, "allowAutocomplete", js.undefined)
    
    @scala.inline
    def setAllowForgotPassword(value: Boolean): Self = StObject.set(x, "allowForgotPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowForgotPasswordUndefined: Self = StObject.set(x, "allowForgotPassword", js.undefined)
    
    @scala.inline
    def setAllowLogin(value: Boolean): Self = StObject.set(x, "allowLogin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowLoginUndefined: Self = StObject.set(x, "allowLogin", js.undefined)
    
    @scala.inline
    def setAllowPasswordAutocomplete(value: Boolean): Self = StObject.set(x, "allowPasswordAutocomplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowPasswordAutocompleteUndefined: Self = StObject.set(x, "allowPasswordAutocomplete", js.undefined)
    
    @scala.inline
    def setAllowShowPassword(value: Boolean): Self = StObject.set(x, "allowShowPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowShowPasswordUndefined: Self = StObject.set(x, "allowShowPassword", js.undefined)
    
    @scala.inline
    def setAllowSignUp(value: Boolean): Self = StObject.set(x, "allowSignUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowSignUpUndefined: Self = StObject.set(x, "allowSignUp", js.undefined)
    
    @scala.inline
    def setAllowedConnections(value: js.Array[String]): Self = StObject.set(x, "allowedConnections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedConnectionsUndefined: Self = StObject.set(x, "allowedConnections", js.undefined)
    
    @scala.inline
    def setAllowedConnectionsVarargs(value: String*): Self = StObject.set(x, "allowedConnections", js.Array(value :_*))
    
    @scala.inline
    def setAssetsUrl(value: String): Self = StObject.set(x, "assetsUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetsUrlUndefined: Self = StObject.set(x, "assetsUrl", js.undefined)
    
    @scala.inline
    def setAuth(value: Auth0LockAuthOptions): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setAutoclose(value: Boolean): Self = StObject.set(x, "autoclose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutocloseUndefined: Self = StObject.set(x, "autoclose", js.undefined)
    
    @scala.inline
    def setAutofocus(value: Boolean): Self = StObject.set(x, "autofocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutofocusUndefined: Self = StObject.set(x, "autofocus", js.undefined)
    
    @scala.inline
    def setAvatar(value: Auth0LockAvatarOptions): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvatarNull: Self = StObject.set(x, "avatar", null)
    
    @scala.inline
    def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
    
    @scala.inline
    def setClientBaseUrl(value: String): Self = StObject.set(x, "clientBaseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientBaseUrlUndefined: Self = StObject.set(x, "clientBaseUrl", js.undefined)
    
    @scala.inline
    def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClosableUndefined: Self = StObject.set(x, "closable", js.undefined)
    
    @scala.inline
    def setConfigurationBaseUrl(value: String): Self = StObject.set(x, "configurationBaseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationBaseUrlUndefined: Self = StObject.set(x, "configurationBaseUrl", js.undefined)
    
    @scala.inline
    def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setDefaultADUsernameFromEmailPrefix(value: Boolean): Self = StObject.set(x, "defaultADUsernameFromEmailPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultADUsernameFromEmailPrefixUndefined: Self = StObject.set(x, "defaultADUsernameFromEmailPrefix", js.undefined)
    
    @scala.inline
    def setDefaultDatabaseConnection(value: String): Self = StObject.set(x, "defaultDatabaseConnection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultDatabaseConnectionUndefined: Self = StObject.set(x, "defaultDatabaseConnection", js.undefined)
    
    @scala.inline
    def setDefaultEnterpriseConnection(value: String): Self = StObject.set(x, "defaultEnterpriseConnection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultEnterpriseConnectionUndefined: Self = StObject.set(x, "defaultEnterpriseConnection", js.undefined)
    
    @scala.inline
    def setFlashMessage(value: Auth0LockFlashMessageOptions): Self = StObject.set(x, "flashMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlashMessageUndefined: Self = StObject.set(x, "flashMessage", js.undefined)
    
    @scala.inline
    def setForgotPasswordLink(value: String): Self = StObject.set(x, "forgotPasswordLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForgotPasswordLinkUndefined: Self = StObject.set(x, "forgotPasswordLink", js.undefined)
    
    @scala.inline
    def setHashCleanup(value: Boolean): Self = StObject.set(x, "hashCleanup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashCleanupUndefined: Self = StObject.set(x, "hashCleanup", js.undefined)
    
    @scala.inline
    def setInitialScreen(value: login | signUp | forgotPassword): Self = StObject.set(x, "initialScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialScreenUndefined: Self = StObject.set(x, "initialScreen", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageBaseUrl(value: String): Self = StObject.set(x, "languageBaseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageBaseUrlUndefined: Self = StObject.set(x, "languageBaseUrl", js.undefined)
    
    @scala.inline
    def setLanguageDictionary(value: js.Any): Self = StObject.set(x, "languageDictionary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageDictionaryUndefined: Self = StObject.set(x, "languageDictionary", js.undefined)
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setLeeway(value: Double): Self = StObject.set(x, "leeway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeewayUndefined: Self = StObject.set(x, "leeway", js.undefined)
    
    @scala.inline
    def setLoginAfterSignUp(value: Boolean): Self = StObject.set(x, "loginAfterSignUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoginAfterSignUpUndefined: Self = StObject.set(x, "loginAfterSignUp", js.undefined)
    
    @scala.inline
    def setMustAcceptTerms(value: Boolean): Self = StObject.set(x, "mustAcceptTerms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMustAcceptTermsUndefined: Self = StObject.set(x, "mustAcceptTerms", js.undefined)
    
    @scala.inline
    def setOidcConformant(value: Boolean): Self = StObject.set(x, "oidcConformant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOidcConformantUndefined: Self = StObject.set(x, "oidcConformant", js.undefined)
    
    @scala.inline
    def setPopupOptions(value: Auth0LockPopupOptions): Self = StObject.set(x, "popupOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopupOptionsUndefined: Self = StObject.set(x, "popupOptions", js.undefined)
    
    @scala.inline
    def setPrefill(value: Email): Self = StObject.set(x, "prefill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefillUndefined: Self = StObject.set(x, "prefill", js.undefined)
    
    @scala.inline
    def setRememberLastLogin(value: Boolean): Self = StObject.set(x, "rememberLastLogin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRememberLastLoginUndefined: Self = StObject.set(x, "rememberLastLogin", js.undefined)
    
    @scala.inline
    def setScrollGlobalMessagesIntoView(value: Boolean): Self = StObject.set(x, "scrollGlobalMessagesIntoView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollGlobalMessagesIntoViewUndefined: Self = StObject.set(x, "scrollGlobalMessagesIntoView", js.undefined)
    
    @scala.inline
    def setSignupLink(value: String): Self = StObject.set(x, "signupLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignupLinkUndefined: Self = StObject.set(x, "signupLink", js.undefined)
    
    @scala.inline
    def setSocialButtonStyle(value: big | small): Self = StObject.set(x, "socialButtonStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSocialButtonStyleUndefined: Self = StObject.set(x, "socialButtonStyle", js.undefined)
    
    @scala.inline
    def setTheme(value: Auth0LockThemeOptions): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    @scala.inline
    def setUsernameStyle(value: String): Self = StObject.set(x, "usernameStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameStyleUndefined: Self = StObject.set(x, "usernameStyle", js.undefined)
    
    @scala.inline
    def set_enableIdPInitiatedLogin(value: Boolean): Self = StObject.set(x, "_enableIdPInitiatedLogin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_enableIdPInitiatedLoginUndefined: Self = StObject.set(x, "_enableIdPInitiatedLogin", js.undefined)
    
    @scala.inline
    def set_enableImpersonation(value: Boolean): Self = StObject.set(x, "_enableImpersonation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_enableImpersonationUndefined: Self = StObject.set(x, "_enableImpersonation", js.undefined)
  }
}
