package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceState extends StObject {
  
  var deviceName: String
  
  var deviceState: String
}
object DeviceState {
  
  @scala.inline
  def apply(deviceName: String, deviceState: String): DeviceState = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any], deviceState = deviceState.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceState]
  }
  
  @scala.inline
  implicit class DeviceStateMutableBuilder[Self <: DeviceState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceState(value: String): Self = StObject.set(x, "deviceState", value.asInstanceOf[js.Any])
  }
}
