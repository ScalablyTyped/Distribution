package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteVariableRequest extends StObject {
  
  /**
    * The name of the variable to delete.
    */
  var name: String
}
object DeleteVariableRequest {
  
  inline def apply(name: String): DeleteVariableRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVariableRequest]
  }
  
  extension [Self <: DeleteVariableRequest](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
