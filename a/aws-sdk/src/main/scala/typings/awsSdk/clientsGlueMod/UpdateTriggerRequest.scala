package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTriggerRequest extends StObject {
  
  /**
    * The name of the trigger to update.
    */
  var Name: NameString
  
  /**
    * The new values with which to update the trigger.
    */
  var TriggerUpdate: typings.awsSdk.clientsGlueMod.TriggerUpdate
}
object UpdateTriggerRequest {
  
  inline def apply(Name: NameString, TriggerUpdate: TriggerUpdate): UpdateTriggerRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], TriggerUpdate = TriggerUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTriggerRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateTriggerRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setTriggerUpdate(value: TriggerUpdate): Self = StObject.set(x, "TriggerUpdate", value.asInstanceOf[js.Any])
  }
}
