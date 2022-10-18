package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaintenanceStatus extends StObject {
  
  /**
    * The currently selected maintenance day.
    */
  var MaintenanceDay: js.UndefOr[typings.awsSdk.clientsMedialiveMod.MaintenanceDay] = js.undefined
  
  /**
    * Maintenance is required by the displayed date and time. Date and time is in ISO.
    */
  var MaintenanceDeadline: js.UndefOr[string] = js.undefined
  
  /**
    * The currently scheduled maintenance date and time. Date and time is in ISO.
    */
  var MaintenanceScheduledDate: js.UndefOr[string] = js.undefined
  
  /**
    * The currently selected maintenance start time. Time is in UTC.
    */
  var MaintenanceStartTime: js.UndefOr[string] = js.undefined
}
object MaintenanceStatus {
  
  inline def apply(): MaintenanceStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceStatus]
  }
  
  extension [Self <: MaintenanceStatus](x: Self) {
    
    inline def setMaintenanceDay(value: MaintenanceDay): Self = StObject.set(x, "MaintenanceDay", value.asInstanceOf[js.Any])
    
    inline def setMaintenanceDayUndefined: Self = StObject.set(x, "MaintenanceDay", js.undefined)
    
    inline def setMaintenanceDeadline(value: string): Self = StObject.set(x, "MaintenanceDeadline", value.asInstanceOf[js.Any])
    
    inline def setMaintenanceDeadlineUndefined: Self = StObject.set(x, "MaintenanceDeadline", js.undefined)
    
    inline def setMaintenanceScheduledDate(value: string): Self = StObject.set(x, "MaintenanceScheduledDate", value.asInstanceOf[js.Any])
    
    inline def setMaintenanceScheduledDateUndefined: Self = StObject.set(x, "MaintenanceScheduledDate", js.undefined)
    
    inline def setMaintenanceStartTime(value: string): Self = StObject.set(x, "MaintenanceStartTime", value.asInstanceOf[js.Any])
    
    inline def setMaintenanceStartTimeUndefined: Self = StObject.set(x, "MaintenanceStartTime", js.undefined)
  }
}
