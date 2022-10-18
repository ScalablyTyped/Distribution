package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaintenanceCreateSettings extends StObject {
  
  /**
    * Choose one day of the week for maintenance. The chosen day is used for all future maintenance windows.
    */
  var MaintenanceDay: js.UndefOr[typings.awsSdk.clientsMedialiveMod.MaintenanceDay] = js.undefined
  
  /**
    * Choose the hour that maintenance will start. The chosen time is used for all future maintenance windows.
    */
  var MaintenanceStartTime: js.UndefOr[stringPattern010920300] = js.undefined
}
object MaintenanceCreateSettings {
  
  inline def apply(): MaintenanceCreateSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceCreateSettings]
  }
  
  extension [Self <: MaintenanceCreateSettings](x: Self) {
    
    inline def setMaintenanceDay(value: MaintenanceDay): Self = StObject.set(x, "MaintenanceDay", value.asInstanceOf[js.Any])
    
    inline def setMaintenanceDayUndefined: Self = StObject.set(x, "MaintenanceDay", js.undefined)
    
    inline def setMaintenanceStartTime(value: stringPattern010920300): Self = StObject.set(x, "MaintenanceStartTime", value.asInstanceOf[js.Any])
    
    inline def setMaintenanceStartTimeUndefined: Self = StObject.set(x, "MaintenanceStartTime", js.undefined)
  }
}
