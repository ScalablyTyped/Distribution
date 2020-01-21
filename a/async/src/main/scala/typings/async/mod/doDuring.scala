package typings.async.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("async", "doDuring")
@js.native
object doDuring extends js.Object {
  def apply[E](
    fn: AsyncVoidFunction[E],
    test: js.Function1[/* testCallback */ AsyncBooleanResultCallback[E], Unit],
    callback: ErrorCallback[E]
  ): Unit = js.native
}

