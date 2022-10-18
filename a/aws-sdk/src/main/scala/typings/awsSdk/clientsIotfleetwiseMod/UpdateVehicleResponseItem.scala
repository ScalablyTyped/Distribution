package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateVehicleResponseItem extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the updated vehicle.
    */
  var arn: js.UndefOr[typings.awsSdk.clientsIotfleetwiseMod.arn] = js.undefined
  
  /**
    * The unique ID of the updated vehicle.
    */
  var vehicleName: js.UndefOr[typings.awsSdk.clientsIotfleetwiseMod.vehicleName] = js.undefined
}
object UpdateVehicleResponseItem {
  
  inline def apply(): UpdateVehicleResponseItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateVehicleResponseItem]
  }
  
  extension [Self <: UpdateVehicleResponseItem](x: Self) {
    
    inline def setArn(value: arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setVehicleName(value: vehicleName): Self = StObject.set(x, "vehicleName", value.asInstanceOf[js.Any])
    
    inline def setVehicleNameUndefined: Self = StObject.set(x, "vehicleName", js.undefined)
  }
}
