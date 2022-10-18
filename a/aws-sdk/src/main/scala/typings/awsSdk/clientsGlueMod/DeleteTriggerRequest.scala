package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTriggerRequest extends StObject {
  
  /**
    * The name of the trigger to delete.
    */
  var Name: NameString
}
object DeleteTriggerRequest {
  
  inline def apply(Name: NameString): DeleteTriggerRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTriggerRequest]
  }
  
  extension [Self <: DeleteTriggerRequest](x: Self) {
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
