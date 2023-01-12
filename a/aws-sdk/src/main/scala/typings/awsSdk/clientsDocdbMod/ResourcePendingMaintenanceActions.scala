package typings.awsSdk.clientsDocdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourcePendingMaintenanceActions extends StObject {
  
  /**
    * A list that provides details about the pending maintenance actions for the resource.
    */
  var PendingMaintenanceActionDetails: js.UndefOr[typings.awsSdk.clientsDocdbMod.PendingMaintenanceActionDetails] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the resource that has pending maintenance actions.
    */
  var ResourceIdentifier: js.UndefOr[String] = js.undefined
}
object ResourcePendingMaintenanceActions {
  
  inline def apply(): ResourcePendingMaintenanceActions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourcePendingMaintenanceActions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourcePendingMaintenanceActions] (val x: Self) extends AnyVal {
    
    inline def setPendingMaintenanceActionDetails(value: PendingMaintenanceActionDetails): Self = StObject.set(x, "PendingMaintenanceActionDetails", value.asInstanceOf[js.Any])
    
    inline def setPendingMaintenanceActionDetailsUndefined: Self = StObject.set(x, "PendingMaintenanceActionDetails", js.undefined)
    
    inline def setPendingMaintenanceActionDetailsVarargs(value: PendingMaintenanceAction*): Self = StObject.set(x, "PendingMaintenanceActionDetails", js.Array(value*))
    
    inline def setResourceIdentifier(value: String): Self = StObject.set(x, "ResourceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setResourceIdentifierUndefined: Self = StObject.set(x, "ResourceIdentifier", js.undefined)
  }
}
