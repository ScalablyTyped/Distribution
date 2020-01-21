package typings.actionsOnGoogle.apiV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmartHomeV1ExecuteResponse extends SmartHomeV1Response {
  var payload: SmartHomeV1ExecutePayload
  var requestId: String
}

object SmartHomeV1ExecuteResponse {
  @scala.inline
  def apply(payload: SmartHomeV1ExecutePayload, requestId: String): SmartHomeV1ExecuteResponse = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SmartHomeV1ExecuteResponse]
  }
}

