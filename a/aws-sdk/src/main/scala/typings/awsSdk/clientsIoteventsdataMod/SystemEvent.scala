package typings.awsSdk.clientsIoteventsdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SystemEvent extends StObject {
  
  /**
    * The event type. If the value is STATE_CHANGE, the event contains information about alarm state changes.
    */
  var eventType: js.UndefOr[EventType] = js.undefined
  
  /**
    * Contains the configuration information of alarm state changes.
    */
  var stateChangeConfiguration: js.UndefOr[StateChangeConfiguration] = js.undefined
}
object SystemEvent {
  
  inline def apply(): SystemEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SystemEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SystemEvent] (val x: Self) extends AnyVal {
    
    inline def setEventType(value: EventType): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    inline def setEventTypeUndefined: Self = StObject.set(x, "eventType", js.undefined)
    
    inline def setStateChangeConfiguration(value: StateChangeConfiguration): Self = StObject.set(x, "stateChangeConfiguration", value.asInstanceOf[js.Any])
    
    inline def setStateChangeConfigurationUndefined: Self = StObject.set(x, "stateChangeConfiguration", js.undefined)
  }
}
