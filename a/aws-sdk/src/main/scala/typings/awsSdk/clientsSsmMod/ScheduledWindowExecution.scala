package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduledWindowExecution extends StObject {
  
  /**
    * The time, in ISO-8601 Extended format, that the maintenance window is scheduled to be run.
    */
  var ExecutionTime: js.UndefOr[MaintenanceWindowStringDateTime] = js.undefined
  
  /**
    * The name of the maintenance window to be run.
    */
  var Name: js.UndefOr[MaintenanceWindowName] = js.undefined
  
  /**
    * The ID of the maintenance window to be run.
    */
  var WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined
}
object ScheduledWindowExecution {
  
  inline def apply(): ScheduledWindowExecution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduledWindowExecution]
  }
  
  extension [Self <: ScheduledWindowExecution](x: Self) {
    
    inline def setExecutionTime(value: MaintenanceWindowStringDateTime): Self = StObject.set(x, "ExecutionTime", value.asInstanceOf[js.Any])
    
    inline def setExecutionTimeUndefined: Self = StObject.set(x, "ExecutionTime", js.undefined)
    
    inline def setName(value: MaintenanceWindowName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setWindowId(value: MaintenanceWindowId): Self = StObject.set(x, "WindowId", value.asInstanceOf[js.Any])
    
    inline def setWindowIdUndefined: Self = StObject.set(x, "WindowId", js.undefined)
  }
}
