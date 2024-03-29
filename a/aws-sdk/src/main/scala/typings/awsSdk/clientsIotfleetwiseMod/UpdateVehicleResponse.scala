package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateVehicleResponse extends StObject {
  
  /**
    * The ARN of the updated vehicle.
    */
  var arn: js.UndefOr[typings.awsSdk.clientsIotfleetwiseMod.arn] = js.undefined
  
  /**
    * The ID of the updated vehicle.
    */
  var vehicleName: js.UndefOr[typings.awsSdk.clientsIotfleetwiseMod.vehicleName] = js.undefined
}
object UpdateVehicleResponse {
  
  inline def apply(): UpdateVehicleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateVehicleResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateVehicleResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setVehicleName(value: vehicleName): Self = StObject.set(x, "vehicleName", value.asInstanceOf[js.Any])
    
    inline def setVehicleNameUndefined: Self = StObject.set(x, "vehicleName", js.undefined)
  }
}
