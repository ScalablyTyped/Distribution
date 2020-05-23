package typings.actionsOnGoogle.apiV1Mod

import typings.actionsOnGoogle.anon.Intent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.actionsOnGoogle.apiV1Mod.SmartHomeV1SyncRequest
  - typings.actionsOnGoogle.apiV1Mod.SmartHomeV1QueryRequest
  - typings.actionsOnGoogle.apiV1Mod.SmartHomeV1ExecuteRequest
  - typings.actionsOnGoogle.apiV1Mod.SmartHomeV1DisconnectRequest
*/
trait SmartHomeV1Request extends js.Object

object SmartHomeV1Request {
  @scala.inline
  def SmartHomeV1SyncRequest(inputs: js.Array[SmartHomeV1SyncRequestInputs], requestId: String): SmartHomeV1Request = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1Request]
  }
  @scala.inline
  def SmartHomeV1QueryRequest(inputs: js.Array[SmartHomeV1QueryRequestInputs], requestId: String): SmartHomeV1Request = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1Request]
  }
  @scala.inline
  def SmartHomeV1ExecuteRequest(inputs: js.Array[SmartHomeV1ExecuteRequestInputs], requestId: String): SmartHomeV1Request = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1Request]
  }
  @scala.inline
  def SmartHomeV1DisconnectRequest(inputs: js.Array[Intent], requestId: String): SmartHomeV1Request = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1Request]
  }
}

