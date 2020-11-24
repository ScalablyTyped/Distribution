package typings.async.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("async", "rejectLimit")
@js.native
object rejectLimit extends js.Object {
  
  def apply[T, E](arr: IterableCollection[T], limit: Double, iterator: AsyncBooleanIterator[T, E]): js.Promise[js.Array[T]] = js.native
  def apply[T, E](
    arr: IterableCollection[T],
    limit: Double,
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultArrayCallback[T, E]
  ): Unit = js.native
}
