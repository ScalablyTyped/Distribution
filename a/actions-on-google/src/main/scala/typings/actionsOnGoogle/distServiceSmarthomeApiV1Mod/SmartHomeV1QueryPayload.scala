package typings.actionsOnGoogle.distServiceSmarthomeApiV1Mod

import typings.actionsOnGoogle.distCommonMod.ApiClientObjectMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmartHomeV1QueryPayload extends StObject {
  
  var devices: ApiClientObjectMap[Any]
}
object SmartHomeV1QueryPayload {
  
  inline def apply(devices: ApiClientObjectMap[Any]): SmartHomeV1QueryPayload = {
    val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1QueryPayload]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SmartHomeV1QueryPayload] (val x: Self) extends AnyVal {
    
    inline def setDevices(value: ApiClientObjectMap[Any]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
  }
}
