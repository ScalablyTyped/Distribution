package typings.actionsOnGoogle.apiV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartHomeV1SyncPayload extends StObject {
  
  var agentUserId: js.UndefOr[String] = js.native
  
  var debugString: js.UndefOr[String] = js.native
  
  var devices: js.Array[SmartHomeV1SyncDevices] = js.native
  
  var errorCode: js.UndefOr[String] = js.native
}
object SmartHomeV1SyncPayload {
  
  @scala.inline
  def apply(devices: js.Array[SmartHomeV1SyncDevices]): SmartHomeV1SyncPayload = {
    val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1SyncPayload]
  }
  
  @scala.inline
  implicit class SmartHomeV1SyncPayloadMutableBuilder[Self <: SmartHomeV1SyncPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgentUserId(value: String): Self = StObject.set(x, "agentUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentUserIdUndefined: Self = StObject.set(x, "agentUserId", js.undefined)
    
    @scala.inline
    def setDebugString(value: String): Self = StObject.set(x, "debugString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugStringUndefined: Self = StObject.set(x, "debugString", js.undefined)
    
    @scala.inline
    def setDevices(value: js.Array[SmartHomeV1SyncDevices]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevicesVarargs(value: SmartHomeV1SyncDevices*): Self = StObject.set(x, "devices", js.Array(value :_*))
    
    @scala.inline
    def setErrorCode(value: String): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
  }
}
