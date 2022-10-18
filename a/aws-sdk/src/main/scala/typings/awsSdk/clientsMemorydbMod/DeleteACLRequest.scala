package typings.awsSdk.clientsMemorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteACLRequest extends StObject {
  
  /**
    * The name of the Access Control List to delete
    */
  var ACLName: String
}
object DeleteACLRequest {
  
  inline def apply(ACLName: String): DeleteACLRequest = {
    val __obj = js.Dynamic.literal(ACLName = ACLName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteACLRequest]
  }
  
  extension [Self <: DeleteACLRequest](x: Self) {
    
    inline def setACLName(value: String): Self = StObject.set(x, "ACLName", value.asInstanceOf[js.Any])
  }
}
