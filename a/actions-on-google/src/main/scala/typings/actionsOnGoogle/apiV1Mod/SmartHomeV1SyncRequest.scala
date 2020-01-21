package typings.actionsOnGoogle.apiV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmartHomeV1SyncRequest extends SmartHomeV1Request {
  var inputs: js.Array[SmartHomeV1SyncRequestInputs]
  var requestId: String
}

object SmartHomeV1SyncRequest {
  @scala.inline
  def apply(inputs: js.Array[SmartHomeV1SyncRequestInputs], requestId: String): SmartHomeV1SyncRequest = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SmartHomeV1SyncRequest]
  }
}

