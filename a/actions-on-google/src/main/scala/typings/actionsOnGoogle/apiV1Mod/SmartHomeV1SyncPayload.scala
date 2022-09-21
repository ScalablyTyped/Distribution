package typings.actionsOnGoogle.apiV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmartHomeV1SyncPayload extends StObject {
  
  var agentUserId: js.UndefOr[String] = js.undefined
  
  var debugString: js.UndefOr[String] = js.undefined
  
  var devices: js.Array[SmartHomeV1SyncDevices]
  
  var errorCode: js.UndefOr[String] = js.undefined
}
object SmartHomeV1SyncPayload {
  
  inline def apply(devices: js.Array[SmartHomeV1SyncDevices]): SmartHomeV1SyncPayload = {
    val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1SyncPayload]
  }
  
  extension [Self <: SmartHomeV1SyncPayload](x: Self) {
    
    inline def setAgentUserId(value: String): Self = StObject.set(x, "agentUserId", value.asInstanceOf[js.Any])
    
    inline def setAgentUserIdUndefined: Self = StObject.set(x, "agentUserId", js.undefined)
    
    inline def setDebugString(value: String): Self = StObject.set(x, "debugString", value.asInstanceOf[js.Any])
    
    inline def setDebugStringUndefined: Self = StObject.set(x, "debugString", js.undefined)
    
    inline def setDevices(value: js.Array[SmartHomeV1SyncDevices]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    inline def setDevicesVarargs(value: SmartHomeV1SyncDevices*): Self = StObject.set(x, "devices", js.Array(value*))
    
    inline def setErrorCode(value: String): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
  }
}
