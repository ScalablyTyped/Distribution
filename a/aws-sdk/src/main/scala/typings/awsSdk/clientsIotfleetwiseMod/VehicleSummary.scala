package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VehicleSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the vehicle.
    */
  var arn: typings.awsSdk.clientsIotfleetwiseMod.arn
  
  /**
    * The time the vehicle was created in seconds since epoch (January 1, 1970 at midnight UTC time).
    */
  var creationTime: js.Date
  
  /**
    * The ARN of a decoder manifest associated with the vehicle.
    */
  var decoderManifestArn: arn
  
  /**
    * The time the vehicle was last updated in seconds since epoch (January 1, 1970 at midnight UTC time). 
    */
  var lastModificationTime: js.Date
  
  /**
    * The ARN of a vehicle model (model manifest) associated with the vehicle.
    */
  var modelManifestArn: arn
  
  /**
    * The unique ID of the vehicle.
    */
  var vehicleName: typings.awsSdk.clientsIotfleetwiseMod.vehicleName
}
object VehicleSummary {
  
  inline def apply(
    arn: arn,
    creationTime: js.Date,
    decoderManifestArn: arn,
    lastModificationTime: js.Date,
    modelManifestArn: arn,
    vehicleName: vehicleName
  ): VehicleSummary = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], creationTime = creationTime.asInstanceOf[js.Any], decoderManifestArn = decoderManifestArn.asInstanceOf[js.Any], lastModificationTime = lastModificationTime.asInstanceOf[js.Any], modelManifestArn = modelManifestArn.asInstanceOf[js.Any], vehicleName = vehicleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[VehicleSummary]
  }
  
  extension [Self <: VehicleSummary](x: Self) {
    
    inline def setArn(value: arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setDecoderManifestArn(value: arn): Self = StObject.set(x, "decoderManifestArn", value.asInstanceOf[js.Any])
    
    inline def setLastModificationTime(value: js.Date): Self = StObject.set(x, "lastModificationTime", value.asInstanceOf[js.Any])
    
    inline def setModelManifestArn(value: arn): Self = StObject.set(x, "modelManifestArn", value.asInstanceOf[js.Any])
    
    inline def setVehicleName(value: vehicleName): Self = StObject.set(x, "vehicleName", value.asInstanceOf[js.Any])
  }
}
