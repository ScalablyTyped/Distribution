package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopTriggerRequest extends StObject {
  
  /**
    * The name of the trigger to stop.
    */
  var Name: NameString
}
object StopTriggerRequest {
  
  inline def apply(Name: NameString): StopTriggerRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopTriggerRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopTriggerRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
