package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteVehicleRequest extends StObject {
  
  /**
    * The ID of the vehicle to delete. 
    */
  var vehicleName: typings.awsSdk.clientsIotfleetwiseMod.vehicleName
}
object DeleteVehicleRequest {
  
  inline def apply(vehicleName: vehicleName): DeleteVehicleRequest = {
    val __obj = js.Dynamic.literal(vehicleName = vehicleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVehicleRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteVehicleRequest] (val x: Self) extends AnyVal {
    
    inline def setVehicleName(value: vehicleName): Self = StObject.set(x, "vehicleName", value.asInstanceOf[js.Any])
  }
}
