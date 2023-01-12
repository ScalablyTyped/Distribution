package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateVehicleRequest extends StObject {
  
  /**
    * The method the specified attributes will update the existing attributes on the vehicle. UseOverwite to replace the vehicle attributes with the specified attributes. Or use Merge to combine all attributes. This is required if attributes are present in the input.
    */
  var attributeUpdateMode: js.UndefOr[UpdateMode] = js.undefined
  
  /**
    * Static information about a vehicle in a key-value pair. For example:  "engineType" : "1.3 L R2" 
    */
  var attributes: js.UndefOr[attributesMap] = js.undefined
  
  /**
    * The ARN of the decoder manifest associated with this vehicle.
    */
  var decoderManifestArn: js.UndefOr[arn] = js.undefined
  
  /**
    * The ARN of a vehicle model (model manifest) associated with the vehicle.
    */
  var modelManifestArn: js.UndefOr[arn] = js.undefined
  
  /**
    * The unique ID of the vehicle to update.
    */
  var vehicleName: typings.awsSdk.clientsIotfleetwiseMod.vehicleName
}
object UpdateVehicleRequest {
  
  inline def apply(vehicleName: vehicleName): UpdateVehicleRequest = {
    val __obj = js.Dynamic.literal(vehicleName = vehicleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVehicleRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateVehicleRequest] (val x: Self) extends AnyVal {
    
    inline def setAttributeUpdateMode(value: UpdateMode): Self = StObject.set(x, "attributeUpdateMode", value.asInstanceOf[js.Any])
    
    inline def setAttributeUpdateModeUndefined: Self = StObject.set(x, "attributeUpdateMode", js.undefined)
    
    inline def setAttributes(value: attributesMap): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setDecoderManifestArn(value: arn): Self = StObject.set(x, "decoderManifestArn", value.asInstanceOf[js.Any])
    
    inline def setDecoderManifestArnUndefined: Self = StObject.set(x, "decoderManifestArn", js.undefined)
    
    inline def setModelManifestArn(value: arn): Self = StObject.set(x, "modelManifestArn", value.asInstanceOf[js.Any])
    
    inline def setModelManifestArnUndefined: Self = StObject.set(x, "modelManifestArn", js.undefined)
    
    inline def setVehicleName(value: vehicleName): Self = StObject.set(x, "vehicleName", value.asInstanceOf[js.Any])
  }
}
