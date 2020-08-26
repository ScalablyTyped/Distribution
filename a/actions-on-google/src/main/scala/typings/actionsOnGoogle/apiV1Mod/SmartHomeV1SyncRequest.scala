package typings.actionsOnGoogle.apiV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmartHomeV1SyncRequest extends SmartHomeV1Request {
  var inputs: js.Array[SmartHomeV1SyncRequestInputs] = js.native
  var requestId: String = js.native
}

object SmartHomeV1SyncRequest {
  @scala.inline
  def apply(inputs: js.Array[SmartHomeV1SyncRequestInputs], requestId: String): SmartHomeV1SyncRequest = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1SyncRequest]
  }
  @scala.inline
  implicit class SmartHomeV1SyncRequestOps[Self <: SmartHomeV1SyncRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInputsVarargs(value: SmartHomeV1SyncRequestInputs*): Self = this.set("inputs", js.Array(value :_*))
    @scala.inline
    def setInputs(value: js.Array[SmartHomeV1SyncRequestInputs]): Self = this.set("inputs", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestId(value: String): Self = this.set("requestId", value.asInstanceOf[js.Any])
  }
  
}

