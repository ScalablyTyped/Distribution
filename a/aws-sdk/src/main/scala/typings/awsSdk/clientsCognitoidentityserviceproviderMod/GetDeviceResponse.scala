package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDeviceResponse extends StObject {
  
  /**
    * The device.
    */
  var Device: DeviceType
}
object GetDeviceResponse {
  
  inline def apply(Device: DeviceType): GetDeviceResponse = {
    val __obj = js.Dynamic.literal(Device = Device.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeviceResponse]
  }
  
  extension [Self <: GetDeviceResponse](x: Self) {
    
    inline def setDevice(value: DeviceType): Self = StObject.set(x, "Device", value.asInstanceOf[js.Any])
  }
}
