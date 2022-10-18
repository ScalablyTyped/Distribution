package typings.awsSdk.clientsEventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestEventPatternRequest extends StObject {
  
  /**
    * The event, in JSON format, to test against the event pattern. The JSON must follow the format specified in Amazon Web Services Events, and the following fields are mandatory:    id     account     source     time     region     resources     detail-type   
    */
  var Event: String
  
  /**
    * The event pattern. For more information, see Events and Event Patterns in the Amazon EventBridge User Guide.
    */
  var EventPattern: typings.awsSdk.clientsEventbridgeMod.EventPattern
}
object TestEventPatternRequest {
  
  inline def apply(Event: String, EventPattern: EventPattern): TestEventPatternRequest = {
    val __obj = js.Dynamic.literal(Event = Event.asInstanceOf[js.Any], EventPattern = EventPattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestEventPatternRequest]
  }
  
  extension [Self <: TestEventPatternRequest](x: Self) {
    
    inline def setEvent(value: String): Self = StObject.set(x, "Event", value.asInstanceOf[js.Any])
    
    inline def setEventPattern(value: EventPattern): Self = StObject.set(x, "EventPattern", value.asInstanceOf[js.Any])
  }
}
