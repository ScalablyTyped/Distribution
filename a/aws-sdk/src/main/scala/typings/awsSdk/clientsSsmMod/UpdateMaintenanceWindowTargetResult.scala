package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateMaintenanceWindowTargetResult extends StObject {
  
  /**
    * The updated description.
    */
  var Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined
  
  /**
    * The updated name.
    */
  var Name: js.UndefOr[MaintenanceWindowName] = js.undefined
  
  /**
    * The updated owner.
    */
  var OwnerInformation: js.UndefOr[typings.awsSdk.clientsSsmMod.OwnerInformation] = js.undefined
  
  /**
    * The updated targets.
    */
  var Targets: js.UndefOr[typings.awsSdk.clientsSsmMod.Targets] = js.undefined
  
  /**
    * The maintenance window ID specified in the update request.
    */
  var WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined
  
  /**
    * The target ID specified in the update request.
    */
  var WindowTargetId: js.UndefOr[MaintenanceWindowTargetId] = js.undefined
}
object UpdateMaintenanceWindowTargetResult {
  
  inline def apply(): UpdateMaintenanceWindowTargetResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateMaintenanceWindowTargetResult]
  }
  
  extension [Self <: UpdateMaintenanceWindowTargetResult](x: Self) {
    
    inline def setDescription(value: MaintenanceWindowDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: MaintenanceWindowName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setOwnerInformation(value: OwnerInformation): Self = StObject.set(x, "OwnerInformation", value.asInstanceOf[js.Any])
    
    inline def setOwnerInformationUndefined: Self = StObject.set(x, "OwnerInformation", js.undefined)
    
    inline def setTargets(value: Targets): Self = StObject.set(x, "Targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsUndefined: Self = StObject.set(x, "Targets", js.undefined)
    
    inline def setTargetsVarargs(value: Target*): Self = StObject.set(x, "Targets", js.Array(value*))
    
    inline def setWindowId(value: MaintenanceWindowId): Self = StObject.set(x, "WindowId", value.asInstanceOf[js.Any])
    
    inline def setWindowIdUndefined: Self = StObject.set(x, "WindowId", js.undefined)
    
    inline def setWindowTargetId(value: MaintenanceWindowTargetId): Self = StObject.set(x, "WindowTargetId", value.asInstanceOf[js.Any])
    
    inline def setWindowTargetIdUndefined: Self = StObject.set(x, "WindowTargetId", js.undefined)
  }
}
