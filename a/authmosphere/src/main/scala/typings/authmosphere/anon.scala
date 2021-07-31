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
    
    @scala.inline
    def apply(access_token: String): Accesstoken = {
      val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any])
      __obj.asInstanceOf[Accesstoken]
    }
    
    @scala.inline
    implicit class AccesstokenMutableBuilder[Self <: Accesstoken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpires_in(value: Double): Self = StObject.set(x, "expires_in", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpires_inUndefined: Self = StObject.set(x, "expires_in", js.undefined)
      
      @scala.inline
      def setLocal_expiry(value: Double): Self = StObject.set(x, "local_expiry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocal_expiryUndefined: Self = StObject.set(x, "local_expiry", js.undefined)
      
      @scala.inline
      def setScope(value: js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value :_*))
      
      @scala.inline
      def setToken_type(value: String): Self = StObject.set(x, "token_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToken_typeUndefined: Self = StObject.set(x, "token_type", js.undefined)
    }
  }
  
  trait Code extends StObject {
    
    var code: String
    
    var redirectUri: String
  }
  object Code {
    
    @scala.inline
    def apply(code: String, redirectUri: String): Code = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], redirectUri = redirectUri.asInstanceOf[js.Any])
      __obj.asInstanceOf[Code]
    }
    
    @scala.inline
    implicit class CodeMutableBuilder[Self <: Code] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
    }
  }
  
  trait RefreshToken extends StObject {
    
    var refreshToken: String
  }
  object RefreshToken {
    
    @scala.inline
    def apply(refreshToken: String): RefreshToken = {
      val __obj = js.Dynamic.literal(refreshToken = refreshToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[RefreshToken]
    }
    
    @scala.inline
    implicit class RefreshTokenMutableBuilder[Self <: RefreshToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
    }
  }
  
  trait Scope extends StObject {
    
    var scope: js.Array[String]
  }
  object Scope {
    
    @scala.inline
    def apply(scope: js.Array[String]): Scope = {
      val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[Scope]
    }
    
    @scala.inline
    implicit class ScopeMutableBuilder[Self <: Scope] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setScope(value: js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value :_*))
    }
  }
  
  trait TokenInfoEndpoint extends StObject {
    
    var tokenInfoEndpoint: String
  }
  object TokenInfoEndpoint {
    
    @scala.inline
    def apply(tokenInfoEndpoint: String): TokenInfoEndpoint = {
      val __obj = js.Dynamic.literal(tokenInfoEndpoint = tokenInfoEndpoint.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenInfoEndpoint]
    }
    
    @scala.inline
    implicit class TokenInfoEndpointMutableBuilder[Self <: TokenInfoEndpoint] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTokenInfoEndpoint(value: String): Self = StObject.set(x, "tokenInfoEndpoint", value.asInstanceOf[js.Any])
    }
  }
}
