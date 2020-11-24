package typings.auth0Lock

import typings.auth0Lock.anon.Email
import typings.auth0Lock.auth0LockStrings.big
import typings.auth0Lock.auth0LockStrings.forgotPassword
import typings.auth0Lock.auth0LockStrings.login
import typings.auth0Lock.auth0LockStrings.signUp
import typings.auth0Lock.auth0LockStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Auth0LockConstructorOptions extends js.Object {
  
  var _enableIdPInitiatedLogin: js.UndefOr[Boolean] = js.native
  
  var _enableImpersonation: js.UndefOr[Boolean] = js.native
  
  var additionalSignUpFields: js.UndefOr[js.Array[Auth0LockAdditionalSignUpField]] = js.native
  
  var allowAutocomplete: js.UndefOr[Boolean] = js.native
  
  var allowForgotPassword: js.UndefOr[Boolean] = js.native
  
  var allowLogin: js.UndefOr[Boolean] = js.native
  
  var allowPasswordAutocomplete: js.UndefOr[Boolean] = js.native
  
  var allowShowPassword: js.UndefOr[Boolean] = js.native
  
  var allowSignUp: js.UndefOr[Boolean] = js.native
  
  var allowedConnections: js.UndefOr[js.Array[String]] = js.native
  
  var assetsUrl: js.UndefOr[String] = js.native
  
  var auth: js.UndefOr[Auth0LockAuthOptions] = js.native
  
  var autoclose: js.UndefOr[Boolean] = js.native
  
  var autofocus: js.UndefOr[Boolean] = js.native
  
  var avatar: js.UndefOr[Auth0LockAvatarOptions | Null] = js.native
  
  var clientBaseUrl: js.UndefOr[String] = js.native
  
  var closable: js.UndefOr[Boolean] = js.native
  
  var configurationBaseUrl: js.UndefOr[String] = js.native
  
  var container: js.UndefOr[String] = js.native
  
  var defaultADUsernameFromEmailPrefix: js.UndefOr[Boolean] = js.native
  
  var defaultDatabaseConnection: js.UndefOr[String] = js.native
  
  var defaultEnterpriseConnection: js.UndefOr[String] = js.native
  
  var flashMessage: js.UndefOr[Auth0LockFlashMessageOptions] = js.native
  
  var forgotPasswordLink: js.UndefOr[String] = js.native
  
  var hashCleanup: js.UndefOr[Boolean] = js.native
  
  var initialScreen: js.UndefOr[login | signUp | forgotPassword] = js.native
  
  var language: js.UndefOr[String] = js.native
  
  var languageBaseUrl: js.UndefOr[String] = js.native
  
  var languageDictionary: js.UndefOr[js.Any] = js.native
  
  var leeway: js.UndefOr[Double] = js.native
  
  var loginAfterSignUp: js.UndefOr[Boolean] = js.native
  
  var mustAcceptTerms: js.UndefOr[Boolean] = js.native
  
  var oidcConformant: js.UndefOr[Boolean] = js.native
  
  var popupOptions: js.UndefOr[Auth0LockPopupOptions] = js.native
  
  var prefill: js.UndefOr[Email] = js.native
  
  var rememberLastLogin: js.UndefOr[Boolean] = js.native
  
  var scrollGlobalMessagesIntoView: js.UndefOr[Boolean] = js.native
  
  var signupLink: js.UndefOr[String] = js.native
  
  var socialButtonStyle: js.UndefOr[big | small] = js.native
  
  var theme: js.UndefOr[Auth0LockThemeOptions] = js.native
  
  var usernameStyle: js.UndefOr[String] = js.native
}
object Auth0LockConstructorOptions {
  
  @scala.inline
  def apply(): Auth0LockConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Auth0LockConstructorOptions]
  }
  
  @scala.inline
  implicit class Auth0LockConstructorOptionsOps[Self <: Auth0LockConstructorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_enableIdPInitiatedLogin(value: Boolean): Self = this.set("_enableIdPInitiatedLogin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_enableIdPInitiatedLogin: Self = this.set("_enableIdPInitiatedLogin", js.undefined)
    
    @scala.inline
    def set_enableImpersonation(value: Boolean): Self = this.set("_enableImpersonation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_enableImpersonation: Self = this.set("_enableImpersonation", js.undefined)
    
    @scala.inline
    def setAdditionalSignUpFieldsVarargs(value: Auth0LockAdditionalSignUpField*): Self = this.set("additionalSignUpFields", js.Array(value :_*))
    
    @scala.inline
    def setAdditionalSignUpFields(value: js.Array[Auth0LockAdditionalSignUpField]): Self = this.set("additionalSignUpFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalSignUpFields: Self = this.set("additionalSignUpFields", js.undefined)
    
    @scala.inline
    def setAllowAutocomplete(value: Boolean): Self = this.set("allowAutocomplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowAutocomplete: Self = this.set("allowAutocomplete", js.undefined)
    
    @scala.inline
    def setAllowForgotPassword(value: Boolean): Self = this.set("allowForgotPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowForgotPassword: Self = this.set("allowForgotPassword", js.undefined)
    
    @scala.inline
    def setAllowLogin(value: Boolean): Self = this.set("allowLogin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowLogin: Self = this.set("allowLogin", js.undefined)
    
    @scala.inline
    def setAllowPasswordAutocomplete(value: Boolean): Self = this.set("allowPasswordAutocomplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowPasswordAutocomplete: Self = this.set("allowPasswordAutocomplete", js.undefined)
    
    @scala.inline
    def setAllowShowPassword(value: Boolean): Self = this.set("allowShowPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowShowPassword: Self = this.set("allowShowPassword", js.undefined)
    
    @scala.inline
    def setAllowSignUp(value: Boolean): Self = this.set("allowSignUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSignUp: Self = this.set("allowSignUp", js.undefined)
    
    @scala.inline
    def setAllowedConnectionsVarargs(value: String*): Self = this.set("allowedConnections", js.Array(value :_*))
    
    @scala.inline
    def setAllowedConnections(value: js.Array[String]): Self = this.set("allowedConnections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedConnections: Self = this.set("allowedConnections", js.undefined)
    
    @scala.inline
    def setAssetsUrl(value: String): Self = this.set("assetsUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssetsUrl: Self = this.set("assetsUrl", js.undefined)
    
    @scala.inline
    def setAuth(value: Auth0LockAuthOptions): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setAutoclose(value: Boolean): Self = this.set("autoclose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoclose: Self = this.set("autoclose", js.undefined)
    
    @scala.inline
    def setAutofocus(value: Boolean): Self = this.set("autofocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutofocus: Self = this.set("autofocus", js.undefined)
    
    @scala.inline
    def setAvatar(value: Auth0LockAvatarOptions): Self = this.set("avatar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvatar: Self = this.set("avatar", js.undefined)
    
    @scala.inline
    def setAvatarNull: Self = this.set("avatar", null)
    
    @scala.inline
    def setClientBaseUrl(value: String): Self = this.set("clientBaseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientBaseUrl: Self = this.set("clientBaseUrl", js.undefined)
    
    @scala.inline
    def setClosable(value: Boolean): Self = this.set("closable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClosable: Self = this.set("closable", js.undefined)
    
    @scala.inline
    def setConfigurationBaseUrl(value: String): Self = this.set("configurationBaseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigurationBaseUrl: Self = this.set("configurationBaseUrl", js.undefined)
    
    @scala.inline
    def setContainer(value: String): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setDefaultADUsernameFromEmailPrefix(value: Boolean): Self = this.set("defaultADUsernameFromEmailPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultADUsernameFromEmailPrefix: Self = this.set("defaultADUsernameFromEmailPrefix", js.undefined)
    
    @scala.inline
    def setDefaultDatabaseConnection(value: String): Self = this.set("defaultDatabaseConnection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultDatabaseConnection: Self = this.set("defaultDatabaseConnection", js.undefined)
    
    @scala.inline
    def setDefaultEnterpriseConnection(value: String): Self = this.set("defaultEnterpriseConnection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultEnterpriseConnection: Self = this.set("defaultEnterpriseConnection", js.undefined)
    
    @scala.inline
    def setFlashMessage(value: Auth0LockFlashMessageOptions): Self = this.set("flashMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlashMessage: Self = this.set("flashMessage", js.undefined)
    
    @scala.inline
    def setForgotPasswordLink(value: String): Self = this.set("forgotPasswordLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForgotPasswordLink: Self = this.set("forgotPasswordLink", js.undefined)
    
    @scala.inline
    def setHashCleanup(value: Boolean): Self = this.set("hashCleanup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHashCleanup: Self = this.set("hashCleanup", js.undefined)
    
    @scala.inline
    def setInitialScreen(value: login | signUp | forgotPassword): Self = this.set("initialScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialScreen: Self = this.set("initialScreen", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setLanguageBaseUrl(value: String): Self = this.set("languageBaseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageBaseUrl: Self = this.set("languageBaseUrl", js.undefined)
    
    @scala.inline
    def setLanguageDictionary(value: js.Any): Self = this.set("languageDictionary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageDictionary: Self = this.set("languageDictionary", js.undefined)
    
    @scala.inline
    def setLeeway(value: Double): Self = this.set("leeway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeeway: Self = this.set("leeway", js.undefined)
    
    @scala.inline
    def setLoginAfterSignUp(value: Boolean): Self = this.set("loginAfterSignUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoginAfterSignUp: Self = this.set("loginAfterSignUp", js.undefined)
    
    @scala.inline
    def setMustAcceptTerms(value: Boolean): Self = this.set("mustAcceptTerms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMustAcceptTerms: Self = this.set("mustAcceptTerms", js.undefined)
    
    @scala.inline
    def setOidcConformant(value: Boolean): Self = this.set("oidcConformant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOidcConformant: Self = this.set("oidcConformant", js.undefined)
    
    @scala.inline
    def setPopupOptions(value: Auth0LockPopupOptions): Self = this.set("popupOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopupOptions: Self = this.set("popupOptions", js.undefined)
    
    @scala.inline
    def setPrefill(value: Email): Self = this.set("prefill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefill: Self = this.set("prefill", js.undefined)
    
    @scala.inline
    def setRememberLastLogin(value: Boolean): Self = this.set("rememberLastLogin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRememberLastLogin: Self = this.set("rememberLastLogin", js.undefined)
    
    @scala.inline
    def setScrollGlobalMessagesIntoView(value: Boolean): Self = this.set("scrollGlobalMessagesIntoView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollGlobalMessagesIntoView: Self = this.set("scrollGlobalMessagesIntoView", js.undefined)
    
    @scala.inline
    def setSignupLink(value: String): Self = this.set("signupLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignupLink: Self = this.set("signupLink", js.undefined)
    
    @scala.inline
    def setSocialButtonStyle(value: big | small): Self = this.set("socialButtonStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSocialButtonStyle: Self = this.set("socialButtonStyle", js.undefined)
    
    @scala.inline
    def setTheme(value: Auth0LockThemeOptions): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setUsernameStyle(value: String): Self = this.set("usernameStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsernameStyle: Self = this.set("usernameStyle", js.undefined)
  }
}
