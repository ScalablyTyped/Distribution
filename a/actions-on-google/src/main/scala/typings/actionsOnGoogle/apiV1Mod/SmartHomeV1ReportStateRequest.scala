package typings.actionsOnGoogle.apiV1Mod

import typings.actionsOnGoogle.AnonDevices
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmartHomeV1ReportStateRequest extends js.Object {
  var agentUserId: String
  var payload: AnonDevices
  var requestId: String
}

object SmartHomeV1ReportStateRequest {
  @scala.inline
  def apply(agentUserId: String, payload: AnonDevices, requestId: String): SmartHomeV1ReportStateRequest = {
    val __obj = js.Dynamic.literal(agentUserId = agentUserId.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1ReportStateRequest]
  }
}

