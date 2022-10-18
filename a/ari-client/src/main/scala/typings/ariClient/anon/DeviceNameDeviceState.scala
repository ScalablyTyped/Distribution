package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceNameDeviceState extends StObject {
  
  var deviceName: String
  
  var deviceState: String
}
object DeviceNameDeviceState {
  
  inline def apply(deviceName: String, deviceState: String): DeviceNameDeviceState = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any], deviceState = deviceState.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceNameDeviceState]
  }
  
  extension [Self <: DeviceNameDeviceState](x: Self) {
    
    inline def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    inline def setDeviceState(value: String): Self = StObject.set(x, "deviceState", value.asInstanceOf[js.Any])
  }
}
