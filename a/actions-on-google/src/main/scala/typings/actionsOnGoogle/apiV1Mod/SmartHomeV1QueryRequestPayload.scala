package typings.actionsOnGoogle.apiV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartHomeV1QueryRequestPayload extends StObject {
  
  var devices: js.Array[SmartHomeV1QueryRequestDevices] = js.native
}
object SmartHomeV1QueryRequestPayload {
  
  @scala.inline
  def apply(devices: js.Array[SmartHomeV1QueryRequestDevices]): SmartHomeV1QueryRequestPayload = {
    val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1QueryRequestPayload]
  }
  
  @scala.inline
  implicit class SmartHomeV1QueryRequestPayloadMutableBuilder[Self <: SmartHomeV1QueryRequestPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevices(value: js.Array[SmartHomeV1QueryRequestDevices]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevicesVarargs(value: SmartHomeV1QueryRequestDevices*): Self = StObject.set(x, "devices", js.Array(value :_*))
  }
}
