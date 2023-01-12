package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplyPendingMaintenanceActionResponse extends StObject {
  
  /**
    * The DMS resource that the pending maintenance action will be applied to.
    */
  var ResourcePendingMaintenanceActions: js.UndefOr[typings.awsSdk.clientsDmsMod.ResourcePendingMaintenanceActions] = js.undefined
}
object ApplyPendingMaintenanceActionResponse {
  
  inline def apply(): ApplyPendingMaintenanceActionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplyPendingMaintenanceActionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplyPendingMaintenanceActionResponse] (val x: Self) extends AnyVal {
    
    inline def setResourcePendingMaintenanceActions(value: ResourcePendingMaintenanceActions): Self = StObject.set(x, "ResourcePendingMaintenanceActions", value.asInstanceOf[js.Any])
    
    inline def setResourcePendingMaintenanceActionsUndefined: Self = StObject.set(x, "ResourcePendingMaintenanceActions", js.undefined)
  }
}
