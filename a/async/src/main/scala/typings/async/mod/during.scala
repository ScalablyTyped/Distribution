package typings.async.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("async", "during")
@js.native
object during extends js.Object {
  def apply[E](
    test: js.Function1[/* testCallback */ AsyncBooleanResultCallback[E], Unit],
    fn: AsyncVoidFunction[E],
    callback: ErrorCallback[E]
  ): Unit = js.native
}

