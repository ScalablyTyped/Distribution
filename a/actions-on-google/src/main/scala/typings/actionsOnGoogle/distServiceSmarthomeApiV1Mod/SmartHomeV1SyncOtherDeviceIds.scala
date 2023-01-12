package typings.actionsOnGoogle.distServiceSmarthomeApiV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmartHomeV1SyncOtherDeviceIds extends StObject {
  
  var agentId: js.UndefOr[String] = js.undefined
  
  var deviceId: String
}
object SmartHomeV1SyncOtherDeviceIds {
  
  inline def apply(deviceId: String): SmartHomeV1SyncOtherDeviceIds = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1SyncOtherDeviceIds]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SmartHomeV1SyncOtherDeviceIds] (val x: Self) extends AnyVal {
    
    inline def setAgentId(value: String): Self = StObject.set(x, "agentId", value.asInstanceOf[js.Any])
    
    inline def setAgentIdUndefined: Self = StObject.set(x, "agentId", js.undefined)
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
  }
}
