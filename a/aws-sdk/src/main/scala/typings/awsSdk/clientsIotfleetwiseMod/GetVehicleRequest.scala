package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVehicleRequest extends StObject {
  
  /**
    *  The ID of the vehicle to retrieve information about. 
    */
  var vehicleName: typings.awsSdk.clientsIotfleetwiseMod.vehicleName
}
object GetVehicleRequest {
  
  inline def apply(vehicleName: vehicleName): GetVehicleRequest = {
    val __obj = js.Dynamic.literal(vehicleName = vehicleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVehicleRequest]
  }
  
  extension [Self <: GetVehicleRequest](x: Self) {
    
    inline def setVehicleName(value: vehicleName): Self = StObject.set(x, "vehicleName", value.asInstanceOf[js.Any])
  }
}
