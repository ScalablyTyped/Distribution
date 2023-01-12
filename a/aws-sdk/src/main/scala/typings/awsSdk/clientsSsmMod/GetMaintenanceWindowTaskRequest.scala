package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMaintenanceWindowTaskRequest extends StObject {
  
  /**
    * The maintenance window ID that includes the task to retrieve.
    */
  var WindowId: MaintenanceWindowId
  
  /**
    * The maintenance window task ID to retrieve.
    */
  var WindowTaskId: MaintenanceWindowTaskId
}
object GetMaintenanceWindowTaskRequest {
  
  inline def apply(WindowId: MaintenanceWindowId, WindowTaskId: MaintenanceWindowTaskId): GetMaintenanceWindowTaskRequest = {
    val __obj = js.Dynamic.literal(WindowId = WindowId.asInstanceOf[js.Any], WindowTaskId = WindowTaskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMaintenanceWindowTaskRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetMaintenanceWindowTaskRequest] (val x: Self) extends AnyVal {
    
    inline def setWindowId(value: MaintenanceWindowId): Self = StObject.set(x, "WindowId", value.asInstanceOf[js.Any])
    
    inline def setWindowTaskId(value: MaintenanceWindowTaskId): Self = StObject.set(x, "WindowTaskId", value.asInstanceOf[js.Any])
  }
}
