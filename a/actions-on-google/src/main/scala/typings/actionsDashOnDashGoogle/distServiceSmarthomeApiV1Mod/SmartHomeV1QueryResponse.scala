package typings.actionsDashOnDashGoogle.distServiceSmarthomeApiV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmartHomeV1QueryResponse extends SmartHomeV1Response {
  var payload: SmartHomeV1QueryPayload
  var requestId: String
}

object SmartHomeV1QueryResponse {
  @scala.inline
  def apply(payload: SmartHomeV1QueryPayload, requestId: String): SmartHomeV1QueryResponse = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SmartHomeV1QueryResponse]
  }
}

