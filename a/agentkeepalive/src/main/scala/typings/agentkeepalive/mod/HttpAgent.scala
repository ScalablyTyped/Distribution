package typings.agentkeepalive.mod

import typings.node.httpMod.Agent
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpAgent extends Agent {
  
  def createSocket(req: IncomingMessage, options: RequestOptions, cb: js.Function): Unit = js.native
  
  def getCurrentStatus(): AgentStatus = js.native
  
  val statusChanged: Boolean = js.native
}
