package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TokenResponse extends StObject {
  
  var access_token: String
  
  var expires_in: Double
  
  var id_token: js.UndefOr[String] = js.undefined
  
  var scope: js.UndefOr[String] = js.undefined
  
  var token_type: String
}
object TokenResponse {
  
  @scala.inline
  def apply(access_token: String, expires_in: Double, token_type: String): TokenResponse = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], expires_in = expires_in.asInstanceOf[js.Any], token_type = token_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenResponse]
  }
  
  @scala.inline
  implicit class TokenResponseMutableBuilder[Self <: TokenResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpires_in(value: Double): Self = StObject.set(x, "expires_in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId_token(value: String): Self = StObject.set(x, "id_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId_tokenUndefined: Self = StObject.set(x, "id_token", js.undefined)
    
    @scala.inline
    def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    @scala.inline
    def setToken_type(value: String): Self = StObject.set(x, "token_type", value.asInstanceOf[js.Any])
  }
}
