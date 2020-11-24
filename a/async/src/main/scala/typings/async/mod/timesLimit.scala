package typings.async.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("async", "timesLimit")
@js.native
object timesLimit extends js.Object {
  
  def apply[T, E](n: Double, limit: Double, iterator: AsyncResultIterator[Double, T, E]): js.Promise[T] = js.native
  def apply[T, E](
    n: Double,
    limit: Double,
    iterator: AsyncResultIterator[Double, T, E],
    callback: AsyncResultArrayCallback[T, E]
  ): Unit = js.native
}
