package typings
package agentkeepaliveLib.agentkeepaliveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("agentkeepalive", "HttpsAgent")
@js.native
class HttpsAgent ()
  extends nodeLib.httpsMod.Agent {
  def this(opts: HttpsOptions) = this()
  val statusChanged: scala.Boolean = js.native
  def createSocket(req: nodeLib.httpMod.IncomingMessage, options: nodeLib.httpsMod.RequestOptions, cb: js.Function): scala.Unit = js.native
  def getCurrentStatus(): AgentStatus = js.native
}

