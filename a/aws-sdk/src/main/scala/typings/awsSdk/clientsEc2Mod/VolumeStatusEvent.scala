package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VolumeStatusEvent extends StObject {
  
  /**
    * A description of the event.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of this event.
    */
  var EventId: js.UndefOr[String] = js.undefined
  
  /**
    * The type of this event.
    */
  var EventType: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the instance associated with the event.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
  
  /**
    * The latest end time of the event.
    */
  var NotAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The earliest start time of the event.
    */
  var NotBefore: js.UndefOr[js.Date] = js.undefined
}
object VolumeStatusEvent {
  
  inline def apply(): VolumeStatusEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeStatusEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VolumeStatusEvent] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEventId(value: String): Self = StObject.set(x, "EventId", value.asInstanceOf[js.Any])
    
    inline def setEventIdUndefined: Self = StObject.set(x, "EventId", js.undefined)
    
    inline def setEventType(value: String): Self = StObject.set(x, "EventType", value.asInstanceOf[js.Any])
    
    inline def setEventTypeUndefined: Self = StObject.set(x, "EventType", js.undefined)
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    inline def setNotAfter(value: js.Date): Self = StObject.set(x, "NotAfter", value.asInstanceOf[js.Any])
    
    inline def setNotAfterUndefined: Self = StObject.set(x, "NotAfter", js.undefined)
    
    inline def setNotBefore(value: js.Date): Self = StObject.set(x, "NotBefore", value.asInstanceOf[js.Any])
    
    inline def setNotBeforeUndefined: Self = StObject.set(x, "NotBefore", js.undefined)
  }
}
