package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignInToken extends StObject {
  
  var access_token: String
  
  var expiry: Double
  
  var id_token: js.UndefOr[String] = js.undefined
  
  var token_type: js.UndefOr[String] = js.undefined
}
object SignInToken {
  
  @scala.inline
  def apply(access_token: String, expiry: Double): SignInToken = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], expiry = expiry.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignInToken]
  }
  
  @scala.inline
  implicit class SignInTokenMutableBuilder[Self <: SignInToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiry(value: Double): Self = StObject.set(x, "expiry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId_token(value: String): Self = StObject.set(x, "id_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId_tokenUndefined: Self = StObject.set(x, "id_token", js.undefined)
    
    @scala.inline
    def setToken_type(value: String): Self = StObject.set(x, "token_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken_typeUndefined: Self = StObject.set(x, "token_type", js.undefined)
  }
}
