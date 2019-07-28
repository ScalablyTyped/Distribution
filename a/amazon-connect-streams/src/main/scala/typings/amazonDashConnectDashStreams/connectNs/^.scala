package typings.amazonDashConnectDashStreams.connectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("connect")
@js.native
object ^ extends js.Object {
  var core: Core = js.native
  /**
    * Register a callback to receive agent details
    *
    * @param callback A callback that will receive an {Agent} instance
    *                 when agent information becomes available.
    */
  def agent(callback: AgentCallback): Unit = js.native
  /**
    * Register a callback to receive contact details
    *
    * @param callback A callback that will receive a Contact instance
    *                 when contact information is updated.
    */
  def contact(callback: ContactCallback): Unit = js.native
  /**
    * Binds the given instance object as the context for
    * the method provided.
    *
    * @param scope The instance object to be set as the scope
    *              of the function.
    * @param method The method to be encapsulated.
    *
    * All other arguments, if any, are bound to the method
    * invocation inside the closure.
    *
    * @return A closure encapsulating the invocation of the
    *    method provided in context of the given instance.
    */
  def hitch(scope: js.Object, method: js.Function0[_]): Unit = js.native
}

