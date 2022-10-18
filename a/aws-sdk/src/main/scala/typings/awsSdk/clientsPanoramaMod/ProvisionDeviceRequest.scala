package typings.awsSdk.clientsPanoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvisionDeviceRequest extends StObject {
  
  /**
    * A description for the device.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsPanoramaMod.Description] = js.undefined
  
  /**
    * A name for the device.
    */
  var Name: DeviceName
  
  /**
    * A networking configuration for the device.
    */
  var NetworkingConfiguration: js.UndefOr[NetworkPayload] = js.undefined
  
  /**
    * Tags for the device.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object ProvisionDeviceRequest {
  
  inline def apply(Name: DeviceName): ProvisionDeviceRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisionDeviceRequest]
  }
  
  extension [Self <: ProvisionDeviceRequest](x: Self) {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: DeviceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNetworkingConfiguration(value: NetworkPayload): Self = StObject.set(x, "NetworkingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setNetworkingConfigurationUndefined: Self = StObject.set(x, "NetworkingConfiguration", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
