package typings.agentBase.mod

import typings.agentBase.AnonSecureEndpoint
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Agent extends EventEmitter {
  var _promisifiedCallback: Boolean = js.native
  @JSName("callback")
  var callback_Original: AgentCallback = js.native
  var options: js.UndefOr[AgentOptions] = js.native
  var timeout: Double | Null = js.native
  def addRequest(): Unit = js.native
  def addRequest(req: js.Any): Unit = js.native
  def addRequest(req: js.Any, opts: js.Any): Unit = js.native
  def callback(): Unit = js.native
  def callback(req: js.Any): Unit = js.native
  def callback(req: js.Any, opts: AnonSecureEndpoint): Unit = js.native
  def freeSocket(socket: js.Any, opts: js.Any): Unit = js.native
}

