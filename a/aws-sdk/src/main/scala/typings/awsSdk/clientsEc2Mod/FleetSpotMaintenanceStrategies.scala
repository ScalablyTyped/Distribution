package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FleetSpotMaintenanceStrategies extends StObject {
  
  /**
    * The strategy to use when Amazon EC2 emits a signal that your Spot Instance is at an elevated risk of being interrupted.
    */
  var CapacityRebalance: js.UndefOr[FleetSpotCapacityRebalance] = js.undefined
}
object FleetSpotMaintenanceStrategies {
  
  inline def apply(): FleetSpotMaintenanceStrategies = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FleetSpotMaintenanceStrategies]
  }
  
  extension [Self <: FleetSpotMaintenanceStrategies](x: Self) {
    
    inline def setCapacityRebalance(value: FleetSpotCapacityRebalance): Self = StObject.set(x, "CapacityRebalance", value.asInstanceOf[js.Any])
    
    inline def setCapacityRebalanceUndefined: Self = StObject.set(x, "CapacityRebalance", js.undefined)
  }
}
