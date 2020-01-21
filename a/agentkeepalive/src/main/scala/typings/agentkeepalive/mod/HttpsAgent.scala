package typings.agentkeepalive.mod

import typings.node.httpMod.IncomingMessage
import typings.node.httpsMod.Agent
import typings.node.httpsMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("agentkeepalive", "HttpsAgent")
@js.native
class HttpsAgent () extends Agent {
  def this(opts: HttpsOptions) = this()
  val statusChanged: Boolean = js.native
  def createSocket(req: IncomingMessage, options: RequestOptions, cb: js.Function): Unit = js.native
  def getCurrentStatus(): AgentStatus = js.native
}

