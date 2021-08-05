package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DelegationTokenOptions extends StObject {
  
  var api_type: String
  
  var grant_type: String
  
  var id_token: String
  
  var scope: String
  
  var target: String
}
object DelegationTokenOptions {
  
  inline def apply(api_type: String, grant_type: String, id_token: String, scope: String, target: String): DelegationTokenOptions = {
    val __obj = js.Dynamic.literal(api_type = api_type.asInstanceOf[js.Any], grant_type = grant_type.asInstanceOf[js.Any], id_token = id_token.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[DelegationTokenOptions]
  }
  
  extension [Self <: DelegationTokenOptions](x: Self) {
    
    inline def setApi_type(value: String): Self = StObject.set(x, "api_type", value.asInstanceOf[js.Any])
    
    inline def setGrant_type(value: String): Self = StObject.set(x, "grant_type", value.asInstanceOf[js.Any])
    
    inline def setId_token(value: String): Self = StObject.set(x, "id_token", value.asInstanceOf[js.Any])
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
