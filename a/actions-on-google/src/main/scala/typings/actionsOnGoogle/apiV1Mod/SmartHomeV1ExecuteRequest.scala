package typings.actionsOnGoogle.apiV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmartHomeV1ExecuteRequest extends SmartHomeV1Request {
  var inputs: js.Array[SmartHomeV1ExecuteRequestInputs]
  var requestId: String
}

object SmartHomeV1ExecuteRequest {
  @scala.inline
  def apply(inputs: js.Array[SmartHomeV1ExecuteRequestInputs], requestId: String): SmartHomeV1ExecuteRequest = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1ExecuteRequest]
  }
}

