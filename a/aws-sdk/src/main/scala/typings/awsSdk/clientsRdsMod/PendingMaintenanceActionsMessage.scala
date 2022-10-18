package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PendingMaintenanceActionsMessage extends StObject {
  
  /**
    * An optional pagination token provided by a previous DescribePendingMaintenanceActions request. If this parameter is specified, the response includes only records beyond the marker, up to a number of records specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * A list of the pending maintenance actions for the resource.
    */
  var PendingMaintenanceActions: js.UndefOr[typings.awsSdk.clientsRdsMod.PendingMaintenanceActions] = js.undefined
}
object PendingMaintenanceActionsMessage {
  
  inline def apply(): PendingMaintenanceActionsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PendingMaintenanceActionsMessage]
  }
  
  extension [Self <: PendingMaintenanceActionsMessage](x: Self) {
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setPendingMaintenanceActions(value: PendingMaintenanceActions): Self = StObject.set(x, "PendingMaintenanceActions", value.asInstanceOf[js.Any])
    
    inline def setPendingMaintenanceActionsUndefined: Self = StObject.set(x, "PendingMaintenanceActions", js.undefined)
    
    inline def setPendingMaintenanceActionsVarargs(value: ResourcePendingMaintenanceActions*): Self = StObject.set(x, "PendingMaintenanceActions", js.Array(value*))
  }
}
