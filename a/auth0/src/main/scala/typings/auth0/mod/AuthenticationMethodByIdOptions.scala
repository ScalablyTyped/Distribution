package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticationMethodByIdOptions extends StObject {
  
  var authentication_method_id: String
  
  var id: String
}
object AuthenticationMethodByIdOptions {
  
  inline def apply(authentication_method_id: String, id: String): AuthenticationMethodByIdOptions = {
    val __obj = js.Dynamic.literal(authentication_method_id = authentication_method_id.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationMethodByIdOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthenticationMethodByIdOptions] (val x: Self) extends AnyVal {
    
    inline def setAuthentication_method_id(value: String): Self = StObject.set(x, "authentication_method_id", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
