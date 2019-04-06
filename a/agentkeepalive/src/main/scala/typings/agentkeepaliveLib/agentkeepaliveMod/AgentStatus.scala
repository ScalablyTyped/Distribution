package typings
package agentkeepaliveLib.agentkeepaliveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentStatus extends js.Object {
  var closeSocketCount: scala.Double
  var createSocketCount: scala.Double
  var createSocketErrorCount: scala.Double
  var errorSocketCount: scala.Double
  var freeSockets: js.Object
  var requestCount: scala.Double
  var requests: js.Object
  var sockets: js.Object
  var timeoutSocketCount: scala.Double
}

object AgentStatus {
  @scala.inline
  def apply(
    closeSocketCount: scala.Double,
    createSocketCount: scala.Double,
    createSocketErrorCount: scala.Double,
    errorSocketCount: scala.Double,
    freeSockets: js.Object,
    requestCount: scala.Double,
    requests: js.Object,
    sockets: js.Object,
    timeoutSocketCount: scala.Double
  ): AgentStatus = {
    val __obj = js.Dynamic.literal(closeSocketCount = closeSocketCount, createSocketCount = createSocketCount, createSocketErrorCount = createSocketErrorCount, errorSocketCount = errorSocketCount, freeSockets = freeSockets, requestCount = requestCount, requests = requests, sockets = sockets, timeoutSocketCount = timeoutSocketCount)
  
    __obj.asInstanceOf[AgentStatus]
  }
}

