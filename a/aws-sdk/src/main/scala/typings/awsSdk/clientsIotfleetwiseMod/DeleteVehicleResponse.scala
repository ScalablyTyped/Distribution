package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteVehicleResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the deleted vehicle.
    */
  var arn: typings.awsSdk.clientsIotfleetwiseMod.arn
  
  /**
    * The ID of the deleted vehicle.
    */
  var vehicleName: typings.awsSdk.clientsIotfleetwiseMod.vehicleName
}
object DeleteVehicleResponse {
  
  inline def apply(arn: arn, vehicleName: vehicleName): DeleteVehicleResponse = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], vehicleName = vehicleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVehicleResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteVehicleResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setVehicleName(value: vehicleName): Self = StObject.set(x, "vehicleName", value.asInstanceOf[js.Any])
  }
}
