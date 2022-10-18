package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaintenanceUpdateSettings extends StObject {
  
  /**
    * Choose one day of the week for maintenance. The chosen day is used for all future maintenance windows.
    */
  var MaintenanceDay: js.UndefOr[typings.awsSdk.clientsMedialiveMod.MaintenanceDay] = js.undefined
  
  /**
    * Choose a specific date for maintenance to occur. The chosen date is used for the next maintenance window only.
    */
  var MaintenanceScheduledDate: js.UndefOr[string] = js.undefined
  
  /**
    * Choose the hour that maintenance will start. The chosen time is used for all future maintenance windows.
    */
  var MaintenanceStartTime: js.UndefOr[stringPattern010920300] = js.undefined
}
object MaintenanceUpdateSettings {
  
  inline def apply(): MaintenanceUpdateSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceUpdateSettings]
  }
  
  extension [Self <: MaintenanceUpdateSettings](x: Self) {
    
    inline def setMaintenanceDay(value: MaintenanceDay): Self = StObject.set(x, "MaintenanceDay", value.asInstanceOf[js.Any])
    
    inline def setMaintenanceDayUndefined: Self = StObject.set(x, "MaintenanceDay", js.undefined)
    
    inline def setMaintenanceScheduledDate(value: string): Self = StObject.set(x, "MaintenanceScheduledDate", value.asInstanceOf[js.Any])
    
    inline def setMaintenanceScheduledDateUndefined: Self = StObject.set(x, "MaintenanceScheduledDate", js.undefined)
    
    inline def setMaintenanceStartTime(value: stringPattern010920300): Self = StObject.set(x, "MaintenanceStartTime", value.asInstanceOf[js.Any])
    
    inline def setMaintenanceStartTimeUndefined: Self = StObject.set(x, "MaintenanceStartTime", js.undefined)
  }
}
