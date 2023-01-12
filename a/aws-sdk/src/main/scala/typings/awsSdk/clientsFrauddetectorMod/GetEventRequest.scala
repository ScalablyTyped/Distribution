package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEventRequest extends StObject {
  
  /**
    * The ID of the event to retrieve.
    */
  var eventId: String
  
  /**
    * The event type of the event to retrieve.
    */
  var eventTypeName: String
}
object GetEventRequest {
  
  inline def apply(eventId: String, eventTypeName: String): GetEventRequest = {
    val __obj = js.Dynamic.literal(eventId = eventId.asInstanceOf[js.Any], eventTypeName = eventTypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEventRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetEventRequest] (val x: Self) extends AnyVal {
    
    inline def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    inline def setEventTypeName(value: String): Self = StObject.set(x, "eventTypeName", value.asInstanceOf[js.Any])
  }
}
