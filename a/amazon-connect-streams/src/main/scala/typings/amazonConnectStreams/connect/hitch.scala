package typings.amazonConnectStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("connect.hitch")
@js.native
object hitch extends js.Object {
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
  def apply(scope: js.Object, method: js.Function0[_]): Unit = js.native
}

