package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartServiceSoftwareUpdateRequest extends StObject {
  
  /**
    * The Epoch timestamp when you want the service software update to start. You only need to specify this parameter if you set ScheduleAt to TIMESTAMP.
    */
  var DesiredStartTime: js.UndefOr[Long] = js.undefined
  
  /**
    * The name of the domain that you want to update to the latest service software.
    */
  var DomainName: typings.awsSdk.clientsOpensearchMod.DomainName
  
  /**
    * When to start the service software update.    NOW - Immediately schedules the update to happen in the current hour if there's capacity available.    TIMESTAMP - Lets you specify a custom date and time to apply the update. If you specify this value, you must also provide a value for DesiredStartTime.    OFF_PEAK_WINDOW - Marks the update to be picked up during an upcoming off-peak window. There's no guarantee that the update will happen during the next immediate window. Depending on capacity, it might happen in subsequent days.   Default: NOW if you don't specify a value for DesiredStartTime, and TIMESTAMP if you do.
    */
  var ScheduleAt: js.UndefOr[typings.awsSdk.clientsOpensearchMod.ScheduleAt] = js.undefined
}
object StartServiceSoftwareUpdateRequest {
  
  inline def apply(DomainName: DomainName): StartServiceSoftwareUpdateRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartServiceSoftwareUpdateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartServiceSoftwareUpdateRequest] (val x: Self) extends AnyVal {
    
    inline def setDesiredStartTime(value: Long): Self = StObject.set(x, "DesiredStartTime", value.asInstanceOf[js.Any])
    
    inline def setDesiredStartTimeUndefined: Self = StObject.set(x, "DesiredStartTime", js.undefined)
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setScheduleAt(value: ScheduleAt): Self = StObject.set(x, "ScheduleAt", value.asInstanceOf[js.Any])
    
    inline def setScheduleAtUndefined: Self = StObject.set(x, "ScheduleAt", js.undefined)
  }
}
