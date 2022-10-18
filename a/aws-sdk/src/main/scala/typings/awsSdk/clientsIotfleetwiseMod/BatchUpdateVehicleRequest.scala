package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchUpdateVehicleRequest extends StObject {
  
  /**
    *  A list of information about the vehicles to update. For more information, see the API data type.
    */
  var vehicles: updateVehicleRequestItems
}
object BatchUpdateVehicleRequest {
  
  inline def apply(vehicles: updateVehicleRequestItems): BatchUpdateVehicleRequest = {
    val __obj = js.Dynamic.literal(vehicles = vehicles.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchUpdateVehicleRequest]
  }
  
  extension [Self <: BatchUpdateVehicleRequest](x: Self) {
    
    inline def setVehicles(value: updateVehicleRequestItems): Self = StObject.set(x, "vehicles", value.asInstanceOf[js.Any])
    
    inline def setVehiclesVarargs(value: UpdateVehicleRequestItem*): Self = StObject.set(x, "vehicles", js.Array(value*))
  }
}
