package typings.amazonConnectStreams.global.connect

import typings.amazonConnectStreams.connect.AgentCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("connect.agent")
@js.native
object agent extends js.Object {
  /**
    * Subscribe a method to be called when the agent is initialized.
    * If the agent has already been initalized, the call is synchronous and the callback is invoked immediately.
    * Otherwise, the callback is invoked once the first agent data is received from upstream.
    * This callback is provided with an `Agent` API object, which can also be created at any time after initialization is complete via `new connect.Agent()`.
    *
    * @param callback A callback that will receive an `Agent` API object instance.
    */
  def apply(callback: AgentCallback): Unit = js.native
}

