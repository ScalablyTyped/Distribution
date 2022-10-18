package typings.awsSdk.clientsCloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivateEventSourceRequest extends StObject {
  
  /**
    * The name of the partner event source to activate.
    */
  var Name: EventSourceName
}
object ActivateEventSourceRequest {
  
  inline def apply(Name: EventSourceName): ActivateEventSourceRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivateEventSourceRequest]
  }
  
  extension [Self <: ActivateEventSourceRequest](x: Self) {
    
    inline def setName(value: EventSourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
