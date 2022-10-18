package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceState extends StObject {
  
  var deviceState: String
}
object DeviceState {
  
  inline def apply(deviceState: String): DeviceState = {
    val __obj = js.Dynamic.literal(deviceState = deviceState.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceState]
  }
  
  extension [Self <: DeviceState](x: Self) {
    
    inline def setDeviceState(value: String): Self = StObject.set(x, "deviceState", value.asInstanceOf[js.Any])
  }
}
