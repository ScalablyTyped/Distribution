package typings.angularJwt

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  object jwt {
    
    trait IAuthManagerServiceProvider extends StObject {
      
      def authenticate(): Unit
      
      def checkAuthOnRefresh(): Unit
      
      def redirectWhenUnauthenticated(): Unit
      
      def unauthenticate(): Unit
    }
    object IAuthManagerServiceProvider {
      
      @scala.inline
      def apply(
        authenticate: () => Unit,
        checkAuthOnRefresh: () => Unit,
        redirectWhenUnauthenticated: () => Unit,
        unauthenticate: () => Unit
      ): IAuthManagerServiceProvider = {
        val __obj = js.Dynamic.literal(authenticate = js.Any.fromFunction0(authenticate), checkAuthOnRefresh = js.Any.fromFunction0(checkAuthOnRefresh), redirectWhenUnauthenticated = js.Any.fromFunction0(redirectWhenUnauthenticated), unauthenticate = js.Any.fromFunction0(unauthenticate))
        __obj.asInstanceOf[IAuthManagerServiceProvider]
      }
      
      @scala.inline
      implicit class IAuthManagerServiceProviderMutableBuilder[Self <: IAuthManagerServiceProvider] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuthenticate(value: () => Unit): Self = StObject.set(x, "authenticate", js.Any.fromFunction0(value))
        
        @scala.inline
        def setCheckAuthOnRefresh(value: () => Unit): Self = StObject.set(x, "checkAuthOnRefresh", js.Any.fromFunction0(value))
        
        @scala.inline
        def setRedirectWhenUnauthenticated(value: () => Unit): Self = StObject.set(x, "redirectWhenUnauthenticated", js.Any.fromFunction0(value))
        
        @scala.inline
        def setUnauthenticate(value: () => Unit): Self = StObject.set(x, "unauthenticate", js.Any.fromFunction0(value))
      }
    }
    
    @js.native
    trait IJwtHelper extends StObject {
      
      def decodeToken(token: String): JwtToken = js.native
      
      def getTokenExpirationDate(token: js.Any): Date = js.native
      
      def isTokenExpired(token: js.Any): Boolean = js.native
      def isTokenExpired(token: js.Any, offsetSeconds: Double): Boolean = js.native
    }
    
    trait IJwtInterceptor extends StObject {
      
      def tokenGetter(params: js.Any*): String
    }
    object IJwtInterceptor {
      
      @scala.inline
      def apply(tokenGetter: /* repeated */ js.Any => String): IJwtInterceptor = {
        val __obj = js.Dynamic.literal(tokenGetter = js.Any.fromFunction1(tokenGetter))
        __obj.asInstanceOf[IJwtInterceptor]
      }
      
      @scala.inline
      implicit class IJwtInterceptorMutableBuilder[Self <: IJwtInterceptor] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setTokenGetter(value: /* repeated */ js.Any => String): Self = StObject.set(x, "tokenGetter", js.Any.fromFunction1(value))
      }
    }
    
    trait JwtToken extends StObject {
      
      var aud: js.UndefOr[String] = js.undefined
      
      var exp: js.UndefOr[Double] = js.undefined
      
      var iat: js.UndefOr[Double] = js.undefined
      
      var iss: js.UndefOr[String] = js.undefined
      
      var jti: js.UndefOr[String] = js.undefined
      
      var nbf: js.UndefOr[Double] = js.undefined
      
      var sub: js.UndefOr[String] = js.undefined
      
      var unique_name: js.UndefOr[String] = js.undefined
    }
    object JwtToken {
      
      @scala.inline
      def apply(): JwtToken = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[JwtToken]
      }
      
      @scala.inline
      implicit class JwtTokenMutableBuilder[Self <: JwtToken] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAud(value: String): Self = StObject.set(x, "aud", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAudUndefined: Self = StObject.set(x, "aud", js.undefined)
        
        @scala.inline
        def setExp(value: Double): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExpUndefined: Self = StObject.set(x, "exp", js.undefined)
        
        @scala.inline
        def setIat(value: Double): Self = StObject.set(x, "iat", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIatUndefined: Self = StObject.set(x, "iat", js.undefined)
        
        @scala.inline
        def setIss(value: String): Self = StObject.set(x, "iss", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIssUndefined: Self = StObject.set(x, "iss", js.undefined)
        
        @scala.inline
        def setJti(value: String): Self = StObject.set(x, "jti", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setJtiUndefined: Self = StObject.set(x, "jti", js.undefined)
        
        @scala.inline
        def setNbf(value: Double): Self = StObject.set(x, "nbf", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNbfUndefined: Self = StObject.set(x, "nbf", js.undefined)
        
        @scala.inline
        def setSub(value: String): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSubUndefined: Self = StObject.set(x, "sub", js.undefined)
        
        @scala.inline
        def setUnique_name(value: String): Self = StObject.set(x, "unique_name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUnique_nameUndefined: Self = StObject.set(x, "unique_name", js.undefined)
      }
    }
  }
}
