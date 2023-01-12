package typings.auth0Js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Auth0DelegationToken extends StObject {
  
  /** The length of time in seconds the token is valid for. */
  var expiresIn: Double
  
  /** The JWT for delegated access.  */
  var idToken: String
  
  /** The type of token being returned. Possible values: "Bearer"  */
  var tokenType: String
}
object Auth0DelegationToken {
  
  inline def apply(expiresIn: Double, idToken: String, tokenType: String): Auth0DelegationToken = {
    val __obj = js.Dynamic.literal(expiresIn = expiresIn.asInstanceOf[js.Any], idToken = idToken.asInstanceOf[js.Any], tokenType = tokenType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auth0DelegationToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Auth0DelegationToken] (val x: Self) extends AnyVal {
    
    inline def setExpiresIn(value: Double): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
    
    inline def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
    
    inline def setTokenType(value: String): Self = StObject.set(x, "tokenType", value.asInstanceOf[js.Any])
  }
}
