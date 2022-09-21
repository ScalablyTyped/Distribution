package typings.authmosphere

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Accesstoken extends StObject {
    
    var access_token: String
    
    var expires_in: js.UndefOr[Double] = js.undefined
    
    var local_expiry: js.UndefOr[Double] = js.undefined
    
    var scope: js.UndefOr[js.Array[String]] = js.undefined
    
    var token_type: js.UndefOr[String] = js.undefined
  }
  object Accesstoken {
    
    inline def apply(access_token: String): Accesstoken = {
      val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any])
      __obj.asInstanceOf[Accesstoken]
    }
    
    extension [Self <: Accesstoken](x: Self) {
      
      inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      inline def setExpires_in(value: Double): Self = StObject.set(x, "expires_in", value.asInstanceOf[js.Any])
      
      inline def setExpires_inUndefined: Self = StObject.set(x, "expires_in", js.undefined)
      
      inline def setLocal_expiry(value: Double): Self = StObject.set(x, "local_expiry", value.asInstanceOf[js.Any])
      
      inline def setLocal_expiryUndefined: Self = StObject.set(x, "local_expiry", js.undefined)
      
      inline def setScope(value: js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value*))
      
      inline def setToken_type(value: String): Self = StObject.set(x, "token_type", value.asInstanceOf[js.Any])
      
      inline def setToken_typeUndefined: Self = StObject.set(x, "token_type", js.undefined)
    }
  }
  
  trait Code extends StObject {
    
    var code: String
    
    var redirectUri: String
  }
  object Code {
    
    inline def apply(code: String, redirectUri: String): Code = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], redirectUri = redirectUri.asInstanceOf[js.Any])
      __obj.asInstanceOf[Code]
    }
    
    extension [Self <: Code](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
    }
  }
  
  trait RefreshToken extends StObject {
    
    var refreshToken: String
  }
  object RefreshToken {
    
    inline def apply(refreshToken: String): RefreshToken = {
      val __obj = js.Dynamic.literal(refreshToken = refreshToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[RefreshToken]
    }
    
    extension [Self <: RefreshToken](x: Self) {
      
      inline def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
    }
  }
  
  trait Scope extends StObject {
    
    var scope: js.Array[String]
  }
  object Scope {
    
    inline def apply(scope: js.Array[String]): Scope = {
      val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[Scope]
    }
    
    extension [Self <: Scope](x: Self) {
      
      inline def setScope(value: js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value*))
    }
  }
  
  trait TokenInfoEndpoint extends StObject {
    
    var tokenInfoEndpoint: String
  }
  object TokenInfoEndpoint {
    
    inline def apply(tokenInfoEndpoint: String): TokenInfoEndpoint = {
      val __obj = js.Dynamic.literal(tokenInfoEndpoint = tokenInfoEndpoint.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenInfoEndpoint]
    }
    
    extension [Self <: TokenInfoEndpoint](x: Self) {
      
      inline def setTokenInfoEndpoint(value: String): Self = StObject.set(x, "tokenInfoEndpoint", value.asInstanceOf[js.Any])
    }
  }
}
