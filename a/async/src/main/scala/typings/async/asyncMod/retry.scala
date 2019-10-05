package typings.async.asyncMod

import typings.async.Anon_Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("async", "retry")
@js.native
object retry extends js.Object {
  def apply[T, E](
    opts: Double,
    task: js.Function2[/* callback */ AsyncResultCallback[T, E], /* results */ js.Any, Unit],
    callback: AsyncResultCallback[_, E]
  ): Unit = js.native
  def apply[T, E](
    opts: Anon_Error,
    task: js.Function2[/* callback */ AsyncResultCallback[T, E], /* results */ js.Any, Unit],
    callback: AsyncResultCallback[_, E]
  ): Unit = js.native
}

