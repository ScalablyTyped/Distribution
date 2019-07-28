package typings.agentkeepalive.agentkeepaliveMod

import typings.node.httpMod.Agent
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpAgent extends Agent {
  val statusChanged: Boolean = js.native
  def createSocket(req: IncomingMessage, options: RequestOptions, cb: js.Function): Unit = js.native
  def getCurrentStatus(): AgentStatus = js.native
}

