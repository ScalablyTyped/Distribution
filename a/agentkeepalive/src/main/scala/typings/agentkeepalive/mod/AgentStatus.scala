package typings.agentkeepalive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentStatus extends js.Object {
  var closeSocketCount: Double
  var createSocketCount: Double
  var createSocketErrorCount: Double
  var errorSocketCount: Double
  var freeSockets: PlainObject
  var requestCount: Double
  var requests: PlainObject
  var sockets: PlainObject
  var timeoutSocketCount: Double
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
}

