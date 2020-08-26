package typings.actionsOnGoogle.apiV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmartHomeV1QueryResponse extends SmartHomeV1Response {
  var payload: SmartHomeV1QueryPayload = js.native
  var requestId: String = js.native
}

object SmartHomeV1QueryResponse {
  @scala.inline
  def apply(payload: SmartHomeV1QueryPayload, requestId: String): SmartHomeV1QueryResponse = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1QueryResponse]
  }
  @scala.inline
  implicit class SmartHomeV1QueryResponseOps[Self <: SmartHomeV1QueryResponse] (val x: Self) extends AnyVal {
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
    def setPayload(value: SmartHomeV1QueryPayload): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestId(value: String): Self = this.set("requestId", value.asInstanceOf[js.Any])
  }
  
}

