package typings.async.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("async", "doUntil")
@js.native
object doUntil extends js.Object {
  def apply[T, E](
    fn: AsyncFunctionEx[T, E],
    test: js.Function1[/* repeated */ T, Boolean],
    callback: ErrorCallback[E]
  ): Unit = js.native
}

