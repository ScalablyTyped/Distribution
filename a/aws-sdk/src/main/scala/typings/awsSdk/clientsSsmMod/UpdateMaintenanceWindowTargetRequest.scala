package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateMaintenanceWindowTargetRequest extends StObject {
  
  /**
    * An optional description for the update.
    */
  var Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined
  
  /**
    * A name for the update.
    */
  var Name: js.UndefOr[MaintenanceWindowName] = js.undefined
  
  /**
    * User-provided value that will be included in any Amazon CloudWatch Events events raised while running tasks for these targets in this maintenance window.
    */
  var OwnerInformation: js.UndefOr[typings.awsSdk.clientsSsmMod.OwnerInformation] = js.undefined
  
  /**
    * If True, then all fields that are required by the RegisterTargetWithMaintenanceWindow operation are also required for this API request. Optional fields that aren't specified are set to null.
    */
  var Replace: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The targets to add or replace.
    */
  var Targets: js.UndefOr[typings.awsSdk.clientsSsmMod.Targets] = js.undefined
  
  /**
    * The maintenance window ID with which to modify the target.
    */
  var WindowId: MaintenanceWindowId
  
  /**
    * The target ID to modify.
    */
  var WindowTargetId: MaintenanceWindowTargetId
}
object UpdateMaintenanceWindowTargetRequest {
  
  inline def apply(WindowId: MaintenanceWindowId, WindowTargetId: MaintenanceWindowTargetId): UpdateMaintenanceWindowTargetRequest = {
    val __obj = js.Dynamic.literal(WindowId = WindowId.asInstanceOf[js.Any], WindowTargetId = WindowTargetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMaintenanceWindowTargetRequest]
  }
  
  extension [Self <: UpdateMaintenanceWindowTargetRequest](x: Self) {
    
    inline def setDescription(value: MaintenanceWindowDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: MaintenanceWindowName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setOwnerInformation(value: OwnerInformation): Self = StObject.set(x, "OwnerInformation", value.asInstanceOf[js.Any])
    
    inline def setOwnerInformationUndefined: Self = StObject.set(x, "OwnerInformation", js.undefined)
    
    inline def setReplace(value: Boolean): Self = StObject.set(x, "Replace", value.asInstanceOf[js.Any])
    
    inline def setReplaceUndefined: Self = StObject.set(x, "Replace", js.undefined)
    
    inline def setTargets(value: Targets): Self = StObject.set(x, "Targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsUndefined: Self = StObject.set(x, "Targets", js.undefined)
    
    inline def setTargetsVarargs(value: Target*): Self = StObject.set(x, "Targets", js.Array(value*))
    
    inline def setWindowId(value: MaintenanceWindowId): Self = StObject.set(x, "WindowId", value.asInstanceOf[js.Any])
    
    inline def setWindowTargetId(value: MaintenanceWindowTargetId): Self = StObject.set(x, "WindowTargetId", value.asInstanceOf[js.Any])
  }
}
