package typings.amazonConnectStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("connect.agent")
@js.native
object agent extends js.Object {
  /**
    * Register a callback to receive agent details
    *
    * @param callback A callback that will receive an {Agent} instance
    *                 when agent information becomes available.
    */
  def apply(callback: AgentCallback): Unit = js.native
}

