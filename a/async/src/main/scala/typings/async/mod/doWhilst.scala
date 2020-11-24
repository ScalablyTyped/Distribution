package typings.async.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("async", "doWhilst")
@js.native
object doWhilst extends js.Object {
  
  def apply[T, E](
    fn: AsyncFunctionEx[T, E],
    test: js.Function1[/* repeated */ T, Boolean],
    callback: ErrorCallback[E]
  ): Unit = js.native
  def apply[T, R, E](fn: AsyncFunctionEx[T, E], test: js.Function1[/* repeated */ T, Boolean]): js.Promise[R] = js.native
}
