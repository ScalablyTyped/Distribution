package typings.actionsOnGoogle.apiV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.actionsOnGoogle.apiV1Mod.SmartHomeV1SyncResponse
  - typings.actionsOnGoogle.apiV1Mod.SmartHomeV1QueryResponse
  - typings.actionsOnGoogle.apiV1Mod.SmartHomeV1ExecuteResponse
  - typings.actionsOnGoogle.apiV1Mod.SmartHomeV1DisconnectResponse
*/
trait SmartHomeV1Response extends StObject
object SmartHomeV1Response {
  
  @scala.inline
  def SmartHomeV1ExecuteResponse(payload: SmartHomeV1ExecutePayload, requestId: String): typings.actionsOnGoogle.apiV1Mod.SmartHomeV1ExecuteResponse = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.actionsOnGoogle.apiV1Mod.SmartHomeV1ExecuteResponse]
  }
  
  @scala.inline
  def SmartHomeV1QueryResponse(payload: SmartHomeV1QueryPayload, requestId: String): typings.actionsOnGoogle.apiV1Mod.SmartHomeV1QueryResponse = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.actionsOnGoogle.apiV1Mod.SmartHomeV1QueryResponse]
  }
  
  @scala.inline
  def SmartHomeV1SyncResponse(payload: SmartHomeV1SyncPayload, requestId: String): typings.actionsOnGoogle.apiV1Mod.SmartHomeV1SyncResponse = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.actionsOnGoogle.apiV1Mod.SmartHomeV1SyncResponse]
  }
}
