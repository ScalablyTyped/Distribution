package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceStatusEvent extends StObject {
  
  /**
    * The event code.
    */
  var Code: js.UndefOr[EventCode] = js.undefined
  
  /**
    * A description of the event. After a scheduled event is completed, it can still be described for up to a week. If the event has been completed, this description starts with the following text: [Completed].
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the event.
    */
  var InstanceEventId: js.UndefOr[typings.awsSdk.clientsEc2Mod.InstanceEventId] = js.undefined
  
  /**
    * The latest scheduled end time for the event.
    */
  var NotAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The earliest scheduled start time for the event.
    */
  var NotBefore: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The deadline for starting the event.
    */
  var NotBeforeDeadline: js.UndefOr[js.Date] = js.undefined
}
object InstanceStatusEvent {
  
  inline def apply(): InstanceStatusEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceStatusEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstanceStatusEvent] (val x: Self) extends AnyVal {
    
    inline def setCode(value: EventCode): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setInstanceEventId(value: InstanceEventId): Self = StObject.set(x, "InstanceEventId", value.asInstanceOf[js.Any])
    
    inline def setInstanceEventIdUndefined: Self = StObject.set(x, "InstanceEventId", js.undefined)
    
    inline def setNotAfter(value: js.Date): Self = StObject.set(x, "NotAfter", value.asInstanceOf[js.Any])
    
    inline def setNotAfterUndefined: Self = StObject.set(x, "NotAfter", js.undefined)
    
    inline def setNotBefore(value: js.Date): Self = StObject.set(x, "NotBefore", value.asInstanceOf[js.Any])
    
    inline def setNotBeforeDeadline(value: js.Date): Self = StObject.set(x, "NotBeforeDeadline", value.asInstanceOf[js.Any])
    
    inline def setNotBeforeDeadlineUndefined: Self = StObject.set(x, "NotBeforeDeadline", js.undefined)
    
    inline def setNotBeforeUndefined: Self = StObject.set(x, "NotBefore", js.undefined)
  }
}
