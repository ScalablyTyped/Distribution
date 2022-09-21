package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateClientGrant extends StObject {
  
  /**
    * The audience.
    */
  var audience: String
  
  /**
    * The identifier of the resource server.
    */
  var client_id: String
  
  var scope: js.Array[String]
}
object CreateClientGrant {
  
  inline def apply(audience: String, client_id: String, scope: js.Array[String]): CreateClientGrant = {
    val __obj = js.Dynamic.literal(audience = audience.asInstanceOf[js.Any], client_id = client_id.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClientGrant]
  }
  
  extension [Self <: CreateClientGrant](x: Self) {
    
    inline def setAudience(value: String): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
    
    inline def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
    
    inline def setScope(value: js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value*))
  }
}
