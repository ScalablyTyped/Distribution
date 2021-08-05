package typings.actionsOnGoogle.apiV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmartHomeV1QueryRequestPayload extends StObject {
  
  var devices: js.Array[SmartHomeV1QueryRequestDevices]
}
object SmartHomeV1QueryRequestPayload {
  
  inline def apply(devices: js.Array[SmartHomeV1QueryRequestDevices]): SmartHomeV1QueryRequestPayload = {
    val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1QueryRequestPayload]
  }
  
  extension [Self <: SmartHomeV1QueryRequestPayload](x: Self) {
    
    inline def setDevices(value: js.Array[SmartHomeV1QueryRequestDevices]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    inline def setDevicesVarargs(value: SmartHomeV1QueryRequestDevices*): Self = StObject.set(x, "devices", js.Array(value :_*))
  }
}
