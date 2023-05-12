package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaintenanceDetails extends StObject {
  
  /**
    * Timestamp of last applied maintenance.
    */
  var LastMaintenanceApplied: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The timestamp after which Amazon Web Services will automatically apply maintenance.
    */
  var MaintenanceAutoAppliedAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Verify existence of a pending maintenance.
    */
  var PendingMaintenance: js.UndefOr[String] = js.undefined
}
object MaintenanceDetails {
  
  inline def apply(): MaintenanceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MaintenanceDetails] (val x: Self) extends AnyVal {
    
    inline def setLastMaintenanceApplied(value: js.Date): Self = StObject.set(x, "LastMaintenanceApplied", value.asInstanceOf[js.Any])
    
    inline def setLastMaintenanceAppliedUndefined: Self = StObject.set(x, "LastMaintenanceApplied", js.undefined)
    
    inline def setMaintenanceAutoAppliedAfter(value: js.Date): Self = StObject.set(x, "MaintenanceAutoAppliedAfter", value.asInstanceOf[js.Any])
    
    inline def setMaintenanceAutoAppliedAfterUndefined: Self = StObject.set(x, "MaintenanceAutoAppliedAfter", js.undefined)
    
    inline def setPendingMaintenance(value: String): Self = StObject.set(x, "PendingMaintenance", value.asInstanceOf[js.Any])
    
    inline def setPendingMaintenanceUndefined: Self = StObject.set(x, "PendingMaintenance", js.undefined)
  }
}
