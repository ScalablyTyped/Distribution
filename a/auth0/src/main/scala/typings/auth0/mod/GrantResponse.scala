package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GrantResponse extends StObject {
  
  var clientID: String
  
  var id: String
  
  var scope: js.Array[String]
  
  var user_id: String
}
object GrantResponse {
  
  inline def apply(clientID: String, id: String, scope: js.Array[String], user_id: String): GrantResponse = {
    val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrantResponse]
  }
  
  extension [Self <: GrantResponse](x: Self) {
    
    inline def setClientID(value: String): Self = StObject.set(x, "clientID", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setScope(value: js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value*))
    
    inline def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
  }
}
