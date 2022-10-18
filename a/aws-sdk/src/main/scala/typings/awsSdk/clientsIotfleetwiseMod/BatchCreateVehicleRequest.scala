package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchCreateVehicleRequest extends StObject {
  
  /**
    *  A list of information about each vehicle to create. For more information, see the API data type.
    */
  var vehicles: createVehicleRequestItems
}
object BatchCreateVehicleRequest {
  
  inline def apply(vehicles: createVehicleRequestItems): BatchCreateVehicleRequest = {
    val __obj = js.Dynamic.literal(vehicles = vehicles.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchCreateVehicleRequest]
  }
  
  extension [Self <: BatchCreateVehicleRequest](x: Self) {
    
    inline def setVehicles(value: createVehicleRequestItems): Self = StObject.set(x, "vehicles", value.asInstanceOf[js.Any])
    
    inline def setVehiclesVarargs(value: CreateVehicleRequestItem*): Self = StObject.set(x, "vehicles", js.Array(value*))
  }
}
