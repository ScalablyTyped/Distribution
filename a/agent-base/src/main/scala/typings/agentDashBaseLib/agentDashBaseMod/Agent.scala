package typings
package agentDashBaseLib.agentDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Agent
  extends nodeLib.eventsMod.EventEmitter {
  var _promisifiedCallback: scala.Boolean = js.native
  @JSName("callback")
  var callback_Original: AgentCallback = js.native
  var options: js.UndefOr[AgentOptions] = js.native
  var timeout: scala.Double | scala.Null = js.native
  def addRequest(): scala.Unit = js.native
  def addRequest(req: js.Any): scala.Unit = js.native
  def addRequest(req: js.Any, opts: js.Any): scala.Unit = js.native
  def callback(): scala.Unit = js.native
  def callback(req: js.Any): scala.Unit = js.native
  def callback(req: js.Any, opts: agentDashBaseLib.Anon_SecureEndpoint): scala.Unit = js.native
  def freeSocket(socket: js.Any, opts: js.Any): scala.Unit = js.native
}

