package typings.async.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("async", "cargo")
@js.native
object cargo extends js.Object {
  
  def apply[E](worker: js.Function2[/* tasks */ js.Array[_], /* callback */ ErrorCallback[E], Unit]): AsyncCargo = js.native
  def apply[E](
    worker: js.Function2[/* tasks */ js.Array[_], /* callback */ ErrorCallback[E], Unit],
    payload: Double
  ): AsyncCargo = js.native
}
