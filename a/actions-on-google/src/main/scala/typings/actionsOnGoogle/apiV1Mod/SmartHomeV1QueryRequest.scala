package typings.actionsOnGoogle.apiV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmartHomeV1QueryRequest extends SmartHomeV1Request {
  var inputs: js.Array[SmartHomeV1QueryRequestInputs]
  var requestId: String
}

object SmartHomeV1QueryRequest {
  @scala.inline
  def apply(inputs: js.Array[SmartHomeV1QueryRequestInputs], requestId: String): SmartHomeV1QueryRequest = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SmartHomeV1QueryRequest]
  }
}

