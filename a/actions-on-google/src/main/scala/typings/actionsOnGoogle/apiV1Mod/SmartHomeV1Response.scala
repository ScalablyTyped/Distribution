package typings.actionsOnGoogle.apiV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.actionsOnGoogle.apiV1Mod.SmartHomeV1SyncResponse
  - typings.actionsOnGoogle.apiV1Mod.SmartHomeV1QueryResponse
  - typings.actionsOnGoogle.apiV1Mod.SmartHomeV1ExecuteResponse
  - typings.actionsOnGoogle.apiV1Mod.SmartHomeV1DisconnectResponse
*/
trait SmartHomeV1Response extends js.Object

object SmartHomeV1Response {
  @scala.inline
  def SmartHomeV1SyncResponse(payload: SmartHomeV1SyncPayload, requestId: String): SmartHomeV1Response = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1Response]
  }
  @scala.inline
  def SmartHomeV1QueryResponse(payload: SmartHomeV1QueryPayload, requestId: String): SmartHomeV1Response = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1Response]
  }
  @scala.inline
  def SmartHomeV1ExecuteResponse(payload: SmartHomeV1ExecutePayload, requestId: String): SmartHomeV1Response = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1Response]
  }
}

