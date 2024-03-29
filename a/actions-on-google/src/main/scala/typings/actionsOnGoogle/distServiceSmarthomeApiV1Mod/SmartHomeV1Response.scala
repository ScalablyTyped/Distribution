package typings.actionsOnGoogle.distServiceSmarthomeApiV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.actionsOnGoogle.distServiceSmarthomeApiV1Mod.SmartHomeV1SyncResponse
  - typings.actionsOnGoogle.distServiceSmarthomeApiV1Mod.SmartHomeV1QueryResponse
  - typings.actionsOnGoogle.distServiceSmarthomeApiV1Mod.SmartHomeV1ExecuteResponse
  - typings.actionsOnGoogle.distServiceSmarthomeApiV1Mod.SmartHomeV1DisconnectResponse
*/
trait SmartHomeV1Response extends StObject
object SmartHomeV1Response {
  
  inline def SmartHomeV1ExecuteResponse(payload: SmartHomeV1ExecutePayload, requestId: String): typings.actionsOnGoogle.distServiceSmarthomeApiV1Mod.SmartHomeV1ExecuteResponse = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.actionsOnGoogle.distServiceSmarthomeApiV1Mod.SmartHomeV1ExecuteResponse]
  }
  
  inline def SmartHomeV1QueryResponse(payload: SmartHomeV1QueryPayload, requestId: String): typings.actionsOnGoogle.distServiceSmarthomeApiV1Mod.SmartHomeV1QueryResponse = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.actionsOnGoogle.distServiceSmarthomeApiV1Mod.SmartHomeV1QueryResponse]
  }
  
  inline def SmartHomeV1SyncResponse(payload: SmartHomeV1SyncPayload, requestId: String): typings.actionsOnGoogle.distServiceSmarthomeApiV1Mod.SmartHomeV1SyncResponse = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.actionsOnGoogle.distServiceSmarthomeApiV1Mod.SmartHomeV1SyncResponse]
  }
}
