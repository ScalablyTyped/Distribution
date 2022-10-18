package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddMaintenance extends StObject {
  
  /**
    * A day of a week when the maintenance will happen. Use Monday/Tuesday/Wednesday/Thursday/Friday/Saturday/Sunday.
    */
  var MaintenanceDay: typings.awsSdk.clientsMediaconnectMod.MaintenanceDay
  
  /**
    * UTC time when the maintenance will happen. Use 24-hour HH:MM format. Minutes must be 00. Example: 13:00. The default value is 02:00.
    */
  var MaintenanceStartHour: string
}
object AddMaintenance {
  
  inline def apply(MaintenanceDay: MaintenanceDay, MaintenanceStartHour: string): AddMaintenance = {
    val __obj = js.Dynamic.literal(MaintenanceDay = MaintenanceDay.asInstanceOf[js.Any], MaintenanceStartHour = MaintenanceStartHour.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddMaintenance]
  }
  
  extension [Self <: AddMaintenance](x: Self) {
    
    inline def setMaintenanceDay(value: MaintenanceDay): Self = StObject.set(x, "MaintenanceDay", value.asInstanceOf[js.Any])
    
    inline def setMaintenanceStartHour(value: string): Self = StObject.set(x, "MaintenanceStartHour", value.asInstanceOf[js.Any])
  }
}
