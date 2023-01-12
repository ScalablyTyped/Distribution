package typings.angularOauth2

import typings.angular.mod.IPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object angularMod {
  
  object oauth2 {
    
    trait Data extends StObject {
      
      var password: String
      
      var username: String
    }
    object Data {
      
      inline def apply(password: String, username: String): Data = {
        val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
        __obj.asInstanceOf[Data]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
        
        inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
        
        inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait OAuth extends StObject {
      
      def getAccessToken(data: Data): IPromise[String] = js.native
      def getAccessToken(data: Data, options: Any): IPromise[String] = js.native
      
      def getRefreshToken(): IPromise[String] = js.native
      def getRefreshToken(data: Unit, options: Any): IPromise[String] = js.native
      def getRefreshToken(data: Data): IPromise[String] = js.native
      def getRefreshToken(data: Data, options: Any): IPromise[String] = js.native
      
      def isAuthenticated(): Boolean = js.native
      
      def revokeToken(): IPromise[String] = js.native
      def revokeToken(data: Unit, options: Any): IPromise[String] = js.native
      def revokeToken(data: Data): IPromise[String] = js.native
      def revokeToken(data: Data, options: Any): IPromise[String] = js.native
    }
    
    trait OAuthConfig extends StObject {
      
      var baseUrl: String
      
      var clientId: String
      
      var clientSecret: js.UndefOr[String] = js.undefined
      
      var grantPath: js.UndefOr[String] = js.undefined
      
      var revokePath: js.UndefOr[String] = js.undefined
    }
    object OAuthConfig {
      
      inline def apply(baseUrl: String, clientId: String): OAuthConfig = {
        val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any])
        __obj.asInstanceOf[OAuthConfig]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: OAuthConfig] (val x: Self) extends AnyVal {
        
        inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
        
        inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
        
        inline def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
        
        inline def setClientSecretUndefined: Self = StObject.set(x, "clientSecret", js.undefined)
        
        inline def setGrantPath(value: String): Self = StObject.set(x, "grantPath", value.asInstanceOf[js.Any])
        
        inline def setGrantPathUndefined: Self = StObject.set(x, "grantPath", js.undefined)
        
        inline def setRevokePath(value: String): Self = StObject.set(x, "revokePath", value.asInstanceOf[js.Any])
        
        inline def setRevokePathUndefined: Self = StObject.set(x, "revokePath", js.undefined)
      }
    }
    
    trait OAuthProvider extends StObject {
      
      def configure(params: OAuthConfig): OAuthConfig
    }
    object OAuthProvider {
      
      inline def apply(configure: OAuthConfig => OAuthConfig): OAuthProvider = {
        val __obj = js.Dynamic.literal(configure = js.Any.fromFunction1(configure))
        __obj.asInstanceOf[OAuthProvider]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: OAuthProvider] (val x: Self) extends AnyVal {
        
        inline def setConfigure(value: OAuthConfig => OAuthConfig): Self = StObject.set(x, "configure", js.Any.fromFunction1(value))
      }
    }
    
    trait OAuthTokenConfig extends StObject {
      
      var name: String
      
      var options: Any
    }
    object OAuthTokenConfig {
      
      inline def apply(name: String, options: Any): OAuthTokenConfig = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
        __obj.asInstanceOf[OAuthTokenConfig]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: OAuthTokenConfig] (val x: Self) extends AnyVal {
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      }
    }
    
    trait OAuthTokenOptions extends StObject {
      
      var secure: Boolean
    }
    object OAuthTokenOptions {
      
      inline def apply(secure: Boolean): OAuthTokenOptions = {
        val __obj = js.Dynamic.literal(secure = secure.asInstanceOf[js.Any])
        __obj.asInstanceOf[OAuthTokenOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: OAuthTokenOptions] (val x: Self) extends AnyVal {
        
        inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      }
    }
    
    trait OAuthTokenProvider extends StObject {
      
      def configure(params: OAuthTokenConfig): OAuthTokenConfig
    }
    object OAuthTokenProvider {
      
      inline def apply(configure: OAuthTokenConfig => OAuthTokenConfig): OAuthTokenProvider = {
        val __obj = js.Dynamic.literal(configure = js.Any.fromFunction1(configure))
        __obj.asInstanceOf[OAuthTokenProvider]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: OAuthTokenProvider] (val x: Self) extends AnyVal {
        
        inline def setConfigure(value: OAuthTokenConfig => OAuthTokenConfig): Self = StObject.set(x, "configure", js.Any.fromFunction1(value))
      }
    }
  }
}
