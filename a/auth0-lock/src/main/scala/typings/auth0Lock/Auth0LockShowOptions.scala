package typings.auth0Lock

import typings.auth0Lock.auth0LockStrings.forgotPassword
import typings.auth0Lock.auth0LockStrings.login
import typings.auth0Lock.auth0LockStrings.signUp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Auth0LockShowOptions extends StObject {
  
  var allowForgotPassword: js.UndefOr[Boolean] = js.native
  
  var allowLogin: js.UndefOr[Boolean] = js.native
  
  var allowSignUp: js.UndefOr[Boolean] = js.native
  
  var allowedConnections: js.UndefOr[js.Array[String]] = js.native
  
  var auth: js.UndefOr[Auth0LockAuthOptions] = js.native
  
  var flashMessage: js.UndefOr[Auth0LockFlashMessageOptions] = js.native
  
  var initialScreen: js.UndefOr[login | signUp | forgotPassword] = js.native
  
  var languageDictionary: js.UndefOr[js.Any] = js.native
  
  var rememberLastLogin: js.UndefOr[Boolean] = js.native
}
object Auth0LockShowOptions {
  
  @scala.inline
  def apply(): Auth0LockShowOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Auth0LockShowOptions]
  }
  
  @scala.inline
  implicit class Auth0LockShowOptionsMutableBuilder[Self <: Auth0LockShowOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowForgotPassword(value: Boolean): Self = StObject.set(x, "allowForgotPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowForgotPasswordUndefined: Self = StObject.set(x, "allowForgotPassword", js.undefined)
    
    @scala.inline
    def setAllowLogin(value: Boolean): Self = StObject.set(x, "allowLogin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowLoginUndefined: Self = StObject.set(x, "allowLogin", js.undefined)
    
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
    def setAuth(value: Auth0LockAuthOptions): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setFlashMessage(value: Auth0LockFlashMessageOptions): Self = StObject.set(x, "flashMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlashMessageUndefined: Self = StObject.set(x, "flashMessage", js.undefined)
    
    @scala.inline
    def setInitialScreen(value: login | signUp | forgotPassword): Self = StObject.set(x, "initialScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialScreenUndefined: Self = StObject.set(x, "initialScreen", js.undefined)
    
    @scala.inline
    def setLanguageDictionary(value: js.Any): Self = StObject.set(x, "languageDictionary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageDictionaryUndefined: Self = StObject.set(x, "languageDictionary", js.undefined)
    
    @scala.inline
    def setRememberLastLogin(value: Boolean): Self = StObject.set(x, "rememberLastLogin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRememberLastLoginUndefined: Self = StObject.set(x, "rememberLastLogin", js.undefined)
  }
}
