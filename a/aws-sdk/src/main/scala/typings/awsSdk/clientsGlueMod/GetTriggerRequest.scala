package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTriggerRequest extends StObject {
  
  /**
    * The name of the trigger to retrieve.
    */
  var Name: NameString
}
object GetTriggerRequest {
  
  inline def apply(Name: NameString): GetTriggerRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTriggerRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetTriggerRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
