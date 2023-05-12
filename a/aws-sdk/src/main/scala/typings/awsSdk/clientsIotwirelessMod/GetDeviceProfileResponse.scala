package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDeviceProfileResponse extends StObject {
  
  /**
    * The Amazon Resource Name of the resource.
    */
  var Arn: js.UndefOr[DeviceProfileArn] = js.undefined
  
  /**
    * The ID of the device profile.
    */
  var Id: js.UndefOr[DeviceProfileId] = js.undefined
  
  /**
    * Information about the device profile.
    */
  var LoRaWAN: js.UndefOr[LoRaWANDeviceProfile] = js.undefined
  
  /**
    * The name of the resource.
    */
  var Name: js.UndefOr[DeviceProfileName] = js.undefined
  
  /**
    * Information about the Sidewalk parameters in the device profile.
    */
  var Sidewalk: js.UndefOr[SidewalkGetDeviceProfile] = js.undefined
}
object GetDeviceProfileResponse {
  
  inline def apply(): GetDeviceProfileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDeviceProfileResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDeviceProfileResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: DeviceProfileArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setId(value: DeviceProfileId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setLoRaWAN(value: LoRaWANDeviceProfile): Self = StObject.set(x, "LoRaWAN", value.asInstanceOf[js.Any])
    
    inline def setLoRaWANUndefined: Self = StObject.set(x, "LoRaWAN", js.undefined)
    
    inline def setName(value: DeviceProfileName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setSidewalk(value: SidewalkGetDeviceProfile): Self = StObject.set(x, "Sidewalk", value.asInstanceOf[js.Any])
    
    inline def setSidewalkUndefined: Self = StObject.set(x, "Sidewalk", js.undefined)
  }
}
