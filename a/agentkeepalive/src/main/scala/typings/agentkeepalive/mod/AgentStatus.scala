package typings.agentkeepalive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentStatus extends js.Object {
  var closeSocketCount: Double = js.native
  var createSocketCount: Double = js.native
  var createSocketErrorCount: Double = js.native
  var errorSocketCount: Double = js.native
  var freeSockets: PlainObject = js.native
  var requestCount: Double = js.native
  var requests: PlainObject = js.native
  var sockets: PlainObject = js.native
  var timeoutSocketCount: Double = js.native
}

object AgentStatus {
  @scala.inline
  def apply(
    closeSocketCount: Double,
    createSocketCount: Double,
    createSocketErrorCount: Double,
    errorSocketCount: Double,
    freeSockets: PlainObject,
    requestCount: Double,
    requests: PlainObject,
    sockets: PlainObject,
    timeoutSocketCount: Double
  ): AgentStatus = {
    val __obj = js.Dynamic.literal(closeSocketCount = closeSocketCount.asInstanceOf[js.Any], createSocketCount = createSocketCount.asInstanceOf[js.Any], createSocketErrorCount = createSocketErrorCount.asInstanceOf[js.Any], errorSocketCount = errorSocketCount.asInstanceOf[js.Any], freeSockets = freeSockets.asInstanceOf[js.Any], requestCount = requestCount.asInstanceOf[js.Any], requests = requests.asInstanceOf[js.Any], sockets = sockets.asInstanceOf[js.Any], timeoutSocketCount = timeoutSocketCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentStatus]
  }
  @scala.inline
  implicit class AgentStatusOps[Self <: AgentStatus] (val x: Self) extends AnyVal {
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
    def setCloseSocketCount(value: Double): Self = this.set("closeSocketCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateSocketCount(value: Double): Self = this.set("createSocketCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateSocketErrorCount(value: Double): Self = this.set("createSocketErrorCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorSocketCount(value: Double): Self = this.set("errorSocketCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setFreeSockets(value: PlainObject): Self = this.set("freeSockets", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestCount(value: Double): Self = this.set("requestCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequests(value: PlainObject): Self = this.set("requests", value.asInstanceOf[js.Any])
    @scala.inline
    def setSockets(value: PlainObject): Self = this.set("sockets", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeoutSocketCount(value: Double): Self = this.set("timeoutSocketCount", value.asInstanceOf[js.Any])
  }
  
}

