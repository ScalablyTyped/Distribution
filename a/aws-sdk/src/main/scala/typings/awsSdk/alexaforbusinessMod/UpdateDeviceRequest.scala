package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDeviceRequest extends StObject {
  
  /**
    * The ARN of the device to update. Required.
    */
  var DeviceArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The updated device name. Required.
    */
  var DeviceName: js.UndefOr[typings.awsSdk.alexaforbusinessMod.DeviceName] = js.undefined
}
object UpdateDeviceRequest {
  
  inline def apply(): UpdateDeviceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDeviceRequest]
  }
  
  extension [Self <: UpdateDeviceRequest](x: Self) {
    
    inline def setDeviceArn(value: Arn): Self = StObject.set(x, "DeviceArn", value.asInstanceOf[js.Any])
    
    inline def setDeviceArnUndefined: Self = StObject.set(x, "DeviceArn", js.undefined)
    
    inline def setDeviceName(value: DeviceName): Self = StObject.set(x, "DeviceName", value.asInstanceOf[js.Any])
    
    inline def setDeviceNameUndefined: Self = StObject.set(x, "DeviceName", js.undefined)
  }
}
