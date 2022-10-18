package typings.awsSdk.clientsNeptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplyPendingMaintenanceActionResult extends StObject {
  
  var ResourcePendingMaintenanceActions: js.UndefOr[typings.awsSdk.clientsNeptuneMod.ResourcePendingMaintenanceActions] = js.undefined
}
object ApplyPendingMaintenanceActionResult {
  
  inline def apply(): ApplyPendingMaintenanceActionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplyPendingMaintenanceActionResult]
  }
  
  extension [Self <: ApplyPendingMaintenanceActionResult](x: Self) {
    
    inline def setResourcePendingMaintenanceActions(value: ResourcePendingMaintenanceActions): Self = StObject.set(x, "ResourcePendingMaintenanceActions", value.asInstanceOf[js.Any])
    
    inline def setResourcePendingMaintenanceActionsUndefined: Self = StObject.set(x, "ResourcePendingMaintenanceActions", js.undefined)
  }
}
