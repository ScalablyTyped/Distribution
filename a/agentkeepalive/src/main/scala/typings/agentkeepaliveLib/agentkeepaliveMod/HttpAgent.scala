package typings
package agentkeepaliveLib.agentkeepaliveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpAgent
  extends nodeLib.httpMod.Agent {
  val statusChanged: scala.Boolean = js.native
  def createSocket(req: nodeLib.httpMod.IncomingMessage, options: nodeLib.httpMod.RequestOptions, cb: js.Function): scala.Unit = js.native
  def getCurrentStatus(): AgentStatus = js.native
}

