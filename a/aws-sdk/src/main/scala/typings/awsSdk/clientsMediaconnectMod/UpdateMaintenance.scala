package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateMaintenance extends StObject {
  
  /**
    * A day of a week when the maintenance will happen. use Monday/Tuesday/Wednesday/Thursday/Friday/Saturday/Sunday.
    */
  var MaintenanceDay: js.UndefOr[typings.awsSdk.clientsMediaconnectMod.MaintenanceDay] = js.undefined
  
  /**
    * A scheduled date in ISO UTC format when the maintenance will happen. Use YYYY-MM-DD format. Example: 2021-01-30.
    */
  var MaintenanceScheduledDate: js.UndefOr[string] = js.undefined
  
  /**
    * UTC time when the maintenance will happen. Use 24-hour HH:MM format. Minutes must be 00. Example: 13:00. The default value is 02:00.
    */
  var MaintenanceStartHour: js.UndefOr[string] = js.undefined
}
object UpdateMaintenance {
  
  inline def apply(): UpdateMaintenance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateMaintenance]
  }
  
  extension [Self <: UpdateMaintenance](x: Self) {
    
    inline def setMaintenanceDay(value: MaintenanceDay): Self = StObject.set(x, "MaintenanceDay", value.asInstanceOf[js.Any])
    
    inline def setMaintenanceDayUndefined: Self = StObject.set(x, "MaintenanceDay", js.undefined)
    
    inline def setMaintenanceScheduledDate(value: string): Self = StObject.set(x, "MaintenanceScheduledDate", value.asInstanceOf[js.Any])
    
    inline def setMaintenanceScheduledDateUndefined: Self = StObject.set(x, "MaintenanceScheduledDate", js.undefined)
    
    inline def setMaintenanceStartHour(value: string): Self = StObject.set(x, "MaintenanceStartHour", value.asInstanceOf[js.Any])
    
    inline def setMaintenanceStartHourUndefined: Self = StObject.set(x, "MaintenanceStartHour", js.undefined)
  }
}
