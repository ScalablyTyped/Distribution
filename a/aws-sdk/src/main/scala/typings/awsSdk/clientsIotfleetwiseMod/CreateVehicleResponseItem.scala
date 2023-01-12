package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVehicleResponseItem extends StObject {
  
  /**
    * The ARN of the created vehicle.
    */
  var arn: js.UndefOr[typings.awsSdk.clientsIotfleetwiseMod.arn] = js.undefined
  
  /**
    * The ARN of a created or validated Amazon Web Services IoT thing.
    */
  var thingArn: js.UndefOr[arn] = js.undefined
  
  /**
    * The unique ID of the vehicle to create.
    */
  var vehicleName: js.UndefOr[typings.awsSdk.clientsIotfleetwiseMod.vehicleName] = js.undefined
}
object CreateVehicleResponseItem {
  
  inline def apply(): CreateVehicleResponseItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVehicleResponseItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateVehicleResponseItem] (val x: Self) extends AnyVal {
    
    inline def setArn(value: arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setThingArn(value: arn): Self = StObject.set(x, "thingArn", value.asInstanceOf[js.Any])
    
    inline def setThingArnUndefined: Self = StObject.set(x, "thingArn", js.undefined)
    
    inline def setVehicleName(value: vehicleName): Self = StObject.set(x, "vehicleName", value.asInstanceOf[js.Any])
    
    inline def setVehicleNameUndefined: Self = StObject.set(x, "vehicleName", js.undefined)
  }
}
