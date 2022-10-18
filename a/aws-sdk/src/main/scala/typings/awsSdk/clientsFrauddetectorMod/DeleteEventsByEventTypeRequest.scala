package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEventsByEventTypeRequest extends StObject {
  
  /**
    * The name of the event type.
    */
  var eventTypeName: identifier
}
object DeleteEventsByEventTypeRequest {
  
  inline def apply(eventTypeName: identifier): DeleteEventsByEventTypeRequest = {
    val __obj = js.Dynamic.literal(eventTypeName = eventTypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEventsByEventTypeRequest]
  }
  
  extension [Self <: DeleteEventsByEventTypeRequest](x: Self) {
    
    inline def setEventTypeName(value: identifier): Self = StObject.set(x, "eventTypeName", value.asInstanceOf[js.Any])
  }
}
