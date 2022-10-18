package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMaintenanceWindowResult extends StObject {
  
  /**
    * The ID of the created maintenance window.
    */
  var WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined
}
object CreateMaintenanceWindowResult {
  
  inline def apply(): CreateMaintenanceWindowResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateMaintenanceWindowResult]
  }
  
  extension [Self <: CreateMaintenanceWindowResult](x: Self) {
    
    inline def setWindowId(value: MaintenanceWindowId): Self = StObject.set(x, "WindowId", value.asInstanceOf[js.Any])
    
    inline def setWindowIdUndefined: Self = StObject.set(x, "WindowId", js.undefined)
  }
}
