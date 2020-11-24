package typings.async.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("async", "waterfall")
@js.native
object waterfall extends js.Object {
  
  def apply[T, E](tasks: js.Array[js.Function]): Unit = js.native
  def apply[T, E](tasks: js.Array[js.Function], callback: AsyncResultCallback[T, E]): Unit = js.native
}
