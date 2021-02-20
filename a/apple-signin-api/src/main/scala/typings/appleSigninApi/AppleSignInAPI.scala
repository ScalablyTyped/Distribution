package typings.appleSigninApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AppleSignInAPI {
  
  @js.native
  trait AppleID extends StObject {
    
    var auth: AuthI = js.native
  }
  object AppleID {
    
    @scala.inline
    def apply(auth: AuthI): AppleID = {
      val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppleID]
    }
    
    @scala.inline
    implicit class AppleIDMutableBuilder[Self <: AppleID] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuth(value: AuthI): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    }
  }
  
  // https://developer.apple.com/documentation/signinwithapplejs/authi
  @js.native
  trait AuthI extends StObject {
    
    def init(config: ClientConfigI): Unit = js.native
    
    def renderButton(): Unit = js.native
    
    def signIn(): js.Promise[SignInResponseI] = js.native
    def signIn(signInConfig: ClientConfigI): js.Promise[SignInResponseI] = js.native
  }
  
  // https://developer.apple.com/documentation/signinwithapplejs/authorizationi
  @js.native
  trait AuthorizationI extends StObject {
    
    var code: String = js.native
    
    var id_token: String = js.native
    
    var nonce: js.UndefOr[String] = js.native
    
    var state: String = js.native
  }
  object AuthorizationI {
    
    @scala.inline
    def apply(code: String, id_token: String, state: String): AuthorizationI = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], id_token = id_token.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthorizationI]
    }
    
    @scala.inline
    implicit class AuthorizationIMutableBuilder[Self <: AuthorizationI] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId_token(value: String): Self = StObject.set(x, "id_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  // https://developer.apple.com/documentation/signinwithapplejs/clientconfigi
  @js.native
  trait ClientConfigI extends StObject {
    
    var clientId: js.UndefOr[String] = js.native
    
    var nonce: js.UndefOr[String] = js.native
    
    var redirectURI: js.UndefOr[String] = js.native
    
    var scope: js.UndefOr[String] = js.native
    
    var state: js.UndefOr[String] = js.native
    
    var usePopup: js.UndefOr[Boolean] = js.native
  }
  object ClientConfigI {
    
    @scala.inline
    def apply(): ClientConfigI = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientConfigI]
    }
    
    @scala.inline
    implicit class ClientConfigIMutableBuilder[Self <: ClientConfigI] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
      
      @scala.inline
      def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      @scala.inline
      def setRedirectURI(value: String): Self = StObject.set(x, "redirectURI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectURIUndefined: Self = StObject.set(x, "redirectURI", js.undefined)
      
      @scala.inline
      def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setUsePopup(value: Boolean): Self = StObject.set(x, "usePopup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsePopupUndefined: Self = StObject.set(x, "usePopup", js.undefined)
    }
  }
  
  // https://developer.apple.com/documentation/signinwithapplejs/namei
  @js.native
  trait NameI extends StObject {
    
    var firstName: String = js.native
    
    var lastName: String = js.native
  }
  object NameI {
    
    @scala.inline
    def apply(firstName: String, lastName: String): NameI = {
      val __obj = js.Dynamic.literal(firstName = firstName.asInstanceOf[js.Any], lastName = lastName.asInstanceOf[js.Any])
      __obj.asInstanceOf[NameI]
    }
    
    @scala.inline
    implicit class NameIMutableBuilder[Self <: NameI] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
    }
  }
  
  // https://developer.apple.com/documentation/signinwithapplejs/signinerrori
  @js.native
  trait SignInErrorI extends StObject {
    
    var error: String = js.native
  }
  object SignInErrorI {
    
    @scala.inline
    def apply(error: String): SignInErrorI = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignInErrorI]
    }
    
    @scala.inline
    implicit class SignInErrorIMutableBuilder[Self <: SignInErrorI] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  // https://developer.apple.com/documentation/signinwithapplejs/signinresponsei
  @js.native
  trait SignInResponseI extends StObject {
    
    var authorization: AuthorizationI = js.native
    
    var user: js.UndefOr[UserI] = js.native
  }
  object SignInResponseI {
    
    @scala.inline
    def apply(authorization: AuthorizationI): SignInResponseI = {
      val __obj = js.Dynamic.literal(authorization = authorization.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignInResponseI]
    }
    
    @scala.inline
    implicit class SignInResponseIMutableBuilder[Self <: SignInResponseI] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthorization(value: AuthorizationI): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: UserI): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
  
  // https://developer.apple.com/documentation/signinwithapplejs/useri
  @js.native
  trait UserI extends StObject {
    
    var email: String = js.native
    
    var name: NameI = js.native
  }
  object UserI {
    
    @scala.inline
    def apply(email: String, name: NameI): UserI = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserI]
    }
    
    @scala.inline
    implicit class UserIMutableBuilder[Self <: UserI] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: NameI): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
