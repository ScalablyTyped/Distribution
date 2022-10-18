package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelMaintenanceWindowExecutionResult extends StObject {
  
  /**
    * The ID of the maintenance window execution that has been stopped.
    */
  var WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId] = js.undefined
}
object CancelMaintenanceWindowExecutionResult {
  
  inline def apply(): CancelMaintenanceWindowExecutionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelMaintenanceWindowExecutionResult]
  }
  
  extension [Self <: CancelMaintenanceWindowExecutionResult](x: Self) {
    
    inline def setWindowExecutionId(value: MaintenanceWindowExecutionId): Self = StObject.set(x, "WindowExecutionId", value.asInstanceOf[js.Any])
    
    inline def setWindowExecutionIdUndefined: Self = StObject.set(x, "WindowExecutionId", js.undefined)
  }
}
