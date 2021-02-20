package typings.angularOauth2

import typings.angular.mod.IPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  object oauth2 {
    
    @js.native
    trait Data extends StObject {
      
      var password: String = js.native
      
      var username: String = js.native
    }
    object Data {
      
      @scala.inline
      def apply(password: String, username: String): Data = {
        val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
        __obj.asInstanceOf[Data]
      }
      
      @scala.inline
      implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait OAuth extends StObject {
      
      def getAccessToken(data: Data): IPromise[String] = js.native
      def getAccessToken(data: Data, options: js.Any): IPromise[String] = js.native
      
      def getRefreshToken(): IPromise[String] = js.native
      def getRefreshToken(data: js.UndefOr[scala.Nothing], options: js.Any): IPromise[String] = js.native
      def getRefreshToken(data: Data): IPromise[String] = js.native
      def getRefreshToken(data: Data, options: js.Any): IPromise[String] = js.native
      
      def isAuthenticated(): Boolean = js.native
      
      def revokeToken(): IPromise[String] = js.native
      def revokeToken(data: js.UndefOr[scala.Nothing], options: js.Any): IPromise[String] = js.native
      def revokeToken(data: Data): IPromise[String] = js.native
      def revokeToken(data: Data, options: js.Any): IPromise[String] = js.native
    }
    
    @js.native
    trait OAuthConfig extends StObject {
      
      var baseUrl: String = js.native
      
      var clientId: String = js.native
      
      var clientSecret: js.UndefOr[String] = js.native
      
      var grantPath: js.UndefOr[String] = js.native
      
      var revokePath: js.UndefOr[String] = js.native
    }
    object OAuthConfig {
      
      @scala.inline
      def apply(baseUrl: String, clientId: String): OAuthConfig = {
        val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any])
        __obj.asInstanceOf[OAuthConfig]
      }
      
      @scala.inline
      implicit class OAuthConfigMutableBuilder[Self <: OAuthConfig] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClientSecretUndefined: Self = StObject.set(x, "clientSecret", js.undefined)
        
        @scala.inline
        def setGrantPath(value: String): Self = StObject.set(x, "grantPath", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGrantPathUndefined: Self = StObject.set(x, "grantPath", js.undefined)
        
        @scala.inline
        def setRevokePath(value: String): Self = StObject.set(x, "revokePath", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRevokePathUndefined: Self = StObject.set(x, "revokePath", js.undefined)
      }
    }
    
    @js.native
    trait OAuthProvider extends StObject {
      
      def configure(params: OAuthConfig): OAuthConfig = js.native
    }
    object OAuthProvider {
      
      @scala.inline
      def apply(configure: OAuthConfig => OAuthConfig): OAuthProvider = {
        val __obj = js.Dynamic.literal(configure = js.Any.fromFunction1(configure))
        __obj.asInstanceOf[OAuthProvider]
      }
      
      @scala.inline
      implicit class OAuthProviderMutableBuilder[Self <: OAuthProvider] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setConfigure(value: OAuthConfig => OAuthConfig): Self = StObject.set(x, "configure", js.Any.fromFunction1(value))
      }
    }
    
    @js.native
    trait OAuthTokenConfig extends StObject {
      
      var name: String = js.native
      
      var options: js.Any = js.native
    }
    object OAuthTokenConfig {
      
      @scala.inline
      def apply(name: String, options: js.Any): OAuthTokenConfig = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
        __obj.asInstanceOf[OAuthTokenConfig]
      }
      
      @scala.inline
      implicit class OAuthTokenConfigMutableBuilder[Self <: OAuthTokenConfig] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait OAuthTokenOptions extends StObject {
      
      var secure: Boolean = js.native
    }
    object OAuthTokenOptions {
      
      @scala.inline
      def apply(secure: Boolean): OAuthTokenOptions = {
        val __obj = js.Dynamic.literal(secure = secure.asInstanceOf[js.Any])
        __obj.asInstanceOf[OAuthTokenOptions]
      }
      
      @scala.inline
      implicit class OAuthTokenOptionsMutableBuilder[Self <: OAuthTokenOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait OAuthTokenProvider extends StObject {
      
      def configure(params: OAuthTokenConfig): OAuthTokenConfig = js.native
    }
    object OAuthTokenProvider {
      
      @scala.inline
      def apply(configure: OAuthTokenConfig => OAuthTokenConfig): OAuthTokenProvider = {
        val __obj = js.Dynamic.literal(configure = js.Any.fromFunction1(configure))
        __obj.asInstanceOf[OAuthTokenProvider]
      }
      
      @scala.inline
      implicit class OAuthTokenProviderMutableBuilder[Self <: OAuthTokenProvider] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setConfigure(value: OAuthTokenConfig => OAuthTokenConfig): Self = StObject.set(x, "configure", js.Any.fromFunction1(value))
      }
    }
  }
}
