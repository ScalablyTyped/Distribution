package typings.auth0Lock

import typings.auth0Lock.auth0LockStrings.forgotPassword
import typings.auth0Lock.auth0LockStrings.login
import typings.auth0Lock.auth0LockStrings.signUp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Auth0LockShowOptions extends StObject {
  
  var allowForgotPassword: js.UndefOr[Boolean] = js.undefined
  
  var allowLogin: js.UndefOr[Boolean] = js.undefined
  
  var allowSignUp: js.UndefOr[Boolean] = js.undefined
  
  var allowedConnections: js.UndefOr[js.Array[String]] = js.undefined
  
  var auth: js.UndefOr[Auth0LockAuthOptions] = js.undefined
  
  var flashMessage: js.UndefOr[Auth0LockFlashMessageOptions] = js.undefined
  
  var initialScreen: js.UndefOr[login | signUp | forgotPassword] = js.undefined
  
  var languageDictionary: js.UndefOr[Any] = js.undefined
  
  var rememberLastLogin: js.UndefOr[Boolean] = js.undefined
}
object Auth0LockShowOptions {
  
  inline def apply(): Auth0LockShowOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Auth0LockShowOptions]
  }
  
  extension [Self <: Auth0LockShowOptions](x: Self) {
    
    inline def setAllowForgotPassword(value: Boolean): Self = StObject.set(x, "allowForgotPassword", value.asInstanceOf[js.Any])
    
    inline def setAllowForgotPasswordUndefined: Self = StObject.set(x, "allowForgotPassword", js.undefined)
    
    inline def setAllowLogin(value: Boolean): Self = StObject.set(x, "allowLogin", value.asInstanceOf[js.Any])
    
    inline def setAllowLoginUndefined: Self = StObject.set(x, "allowLogin", js.undefined)
    
    inline def setAllowSignUp(value: Boolean): Self = StObject.set(x, "allowSignUp", value.asInstanceOf[js.Any])
    
    inline def setAllowSignUpUndefined: Self = StObject.set(x, "allowSignUp", js.undefined)
    
    inline def setAllowedConnections(value: js.Array[String]): Self = StObject.set(x, "allowedConnections", value.asInstanceOf[js.Any])
    
    inline def setAllowedConnectionsUndefined: Self = StObject.set(x, "allowedConnections", js.undefined)
    
    inline def setAllowedConnectionsVarargs(value: String*): Self = StObject.set(x, "allowedConnections", js.Array(value*))
    
    inline def setAuth(value: Auth0LockAuthOptions): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setFlashMessage(value: Auth0LockFlashMessageOptions): Self = StObject.set(x, "flashMessage", value.asInstanceOf[js.Any])
    
    inline def setFlashMessageUndefined: Self = StObject.set(x, "flashMessage", js.undefined)
    
    inline def setInitialScreen(value: login | signUp | forgotPassword): Self = StObject.set(x, "initialScreen", value.asInstanceOf[js.Any])
    
    inline def setInitialScreenUndefined: Self = StObject.set(x, "initialScreen", js.undefined)
    
    inline def setLanguageDictionary(value: Any): Self = StObject.set(x, "languageDictionary", value.asInstanceOf[js.Any])
    
    inline def setLanguageDictionaryUndefined: Self = StObject.set(x, "languageDictionary", js.undefined)
    
    inline def setRememberLastLogin(value: Boolean): Self = StObject.set(x, "rememberLastLogin", value.asInstanceOf[js.Any])
    
    inline def setRememberLastLoginUndefined: Self = StObject.set(x, "rememberLastLogin", js.undefined)
  }
}
