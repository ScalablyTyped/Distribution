package typings.ariClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceStateChanged
  extends StObject
     with Event {
  
  /**
    * Device state object.
    */
  var device_state: DeviceState
}
object DeviceStateChanged {
  
  inline def apply(application: String, device_state: DeviceState, timestamp: js.Date, `type`: String): DeviceStateChanged = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], device_state = device_state.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceStateChanged]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceStateChanged] (val x: Self) extends AnyVal {
    
    inline def setDevice_state(value: DeviceState): Self = StObject.set(x, "device_state", value.asInstanceOf[js.Any])
  }
}
