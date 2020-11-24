package typings.amazonConnectStreams.global.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("connect.hitch")
@js.native
object hitch extends js.Object {
  
  /**
    * A useful utility function for creating callback closures that bind a function to an object instance.
    *
    * @param scope The instance object to be set as the scope of the function.
    * @param method The method to be encapsulated.
    */
  def apply[T /* <: js.Function1[/* repeated */ js.Any, _] */](scope: js.Object, method: T): T = js.native
}
