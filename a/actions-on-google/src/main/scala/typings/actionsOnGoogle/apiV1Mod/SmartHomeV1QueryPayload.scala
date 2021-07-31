package typings.actionsOnGoogle.apiV1Mod

import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmartHomeV1QueryPayload extends StObject {
  
  var devices: ApiClientObjectMap[js.Any]
}
object SmartHomeV1QueryPayload {
  
  @scala.inline
  def apply(devices: ApiClientObjectMap[js.Any]): SmartHomeV1QueryPayload = {
    val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1QueryPayload]
  }
  
  @scala.inline
  implicit class SmartHomeV1QueryPayloadMutableBuilder[Self <: SmartHomeV1QueryPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevices(value: ApiClientObjectMap[js.Any]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
  }
}
