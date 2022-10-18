package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationAttributes extends StObject {
  
  /**
    * A fleet location and its current life-cycle state.
    */
  var LocationState: js.UndefOr[typings.awsSdk.clientsGameliftMod.LocationState] = js.undefined
  
  /**
    * A list of fleet actions that have been suspended in the fleet location.
    */
  var StoppedActions: js.UndefOr[FleetActionList] = js.undefined
  
  /**
    * The status of fleet activity updates to the location. The status PENDING_UPDATE indicates that StopFleetActions or StartFleetActions has been requested but the update has not yet been completed for the location.
    */
  var UpdateStatus: js.UndefOr[LocationUpdateStatus] = js.undefined
}
object LocationAttributes {
  
  inline def apply(): LocationAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationAttributes]
  }
  
  extension [Self <: LocationAttributes](x: Self) {
    
    inline def setLocationState(value: LocationState): Self = StObject.set(x, "LocationState", value.asInstanceOf[js.Any])
    
    inline def setLocationStateUndefined: Self = StObject.set(x, "LocationState", js.undefined)
    
    inline def setStoppedActions(value: FleetActionList): Self = StObject.set(x, "StoppedActions", value.asInstanceOf[js.Any])
    
    inline def setStoppedActionsUndefined: Self = StObject.set(x, "StoppedActions", js.undefined)
    
    inline def setStoppedActionsVarargs(value: FleetAction*): Self = StObject.set(x, "StoppedActions", js.Array(value*))
    
    inline def setUpdateStatus(value: LocationUpdateStatus): Self = StObject.set(x, "UpdateStatus", value.asInstanceOf[js.Any])
    
    inline def setUpdateStatusUndefined: Self = StObject.set(x, "UpdateStatus", js.undefined)
  }
}
