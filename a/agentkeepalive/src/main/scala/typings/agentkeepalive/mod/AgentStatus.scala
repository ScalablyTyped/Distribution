package typings.agentkeepalive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentStatus extends js.Object {
  var closeSocketCount: Double
  var createSocketCount: Double
  var createSocketErrorCount: Double
  var errorSocketCount: Double
  var freeSockets: js.Object
  var requestCount: Double
  var requests: js.Object
  var sockets: js.Object
  var timeoutSocketCount: Double
}

object AgentStatus {
  @scala.inline
  def apply(
    closeSocketCount: Double,
    createSocketCount: Double,
    createSocketErrorCount: Double,
    errorSocketCount: Double,
    freeSockets: js.Object,
    requestCount: Double,
    requests: js.Object,
    sockets: js.Object,
    timeoutSocketCount: Double
  ): AgentStatus = {
    val __obj = js.Dynamic.literal(closeSocketCount = closeSocketCount.asInstanceOf[js.Any], createSocketCount = createSocketCount.asInstanceOf[js.Any], createSocketErrorCount = createSocketErrorCount.asInstanceOf[js.Any], errorSocketCount = errorSocketCount.asInstanceOf[js.Any], freeSockets = freeSockets.asInstanceOf[js.Any], requestCount = requestCount.asInstanceOf[js.Any], requests = requests.asInstanceOf[js.Any], sockets = sockets.asInstanceOf[js.Any], timeoutSocketCount = timeoutSocketCount.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AgentStatus]
  }
}

