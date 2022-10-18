package typings.awsSdk.clientsCloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeactivateEventSourceRequest extends StObject {
  
  /**
    * The name of the partner event source to deactivate.
    */
  var Name: EventSourceName
}
object DeactivateEventSourceRequest {
  
  inline def apply(Name: EventSourceName): DeactivateEventSourceRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeactivateEventSourceRequest]
  }
  
  extension [Self <: DeactivateEventSourceRequest](x: Self) {
    
    inline def setName(value: EventSourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
