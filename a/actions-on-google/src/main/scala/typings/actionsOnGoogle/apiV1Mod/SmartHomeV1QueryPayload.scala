package typings.actionsOnGoogle.apiV1Mod

import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartHomeV1QueryPayload extends StObject {
  
  var devices: ApiClientObjectMap[_] = js.native
}
object SmartHomeV1QueryPayload {
  
  @scala.inline
  def apply(devices: ApiClientObjectMap[_]): SmartHomeV1QueryPayload = {
    val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1QueryPayload]
  }
  
  @scala.inline
  implicit class SmartHomeV1QueryPayloadMutableBuilder[Self <: SmartHomeV1QueryPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevices(value: ApiClientObjectMap[_]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
  }
}
