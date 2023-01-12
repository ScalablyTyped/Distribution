package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RevokeRefreshTokenOptions extends StObject {
  
  var client_id: js.UndefOr[String] = js.undefined
  
  var client_secret: js.UndefOr[String] = js.undefined
  
  var token: String
}
object RevokeRefreshTokenOptions {
  
  inline def apply(token: String): RevokeRefreshTokenOptions = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevokeRefreshTokenOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RevokeRefreshTokenOptions] (val x: Self) extends AnyVal {
    
    inline def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
    
    inline def setClient_idUndefined: Self = StObject.set(x, "client_id", js.undefined)
    
    inline def setClient_secret(value: String): Self = StObject.set(x, "client_secret", value.asInstanceOf[js.Any])
    
    inline def setClient_secretUndefined: Self = StObject.set(x, "client_secret", js.undefined)
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
