package typings.async.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("async", "retry")
@js.native
object retry extends js.Object {
  def apply[T, E](): js.Promise[Unit] = js.native
  def apply[T, E](opts: Double): js.Promise[Unit] = js.native
  def apply[T, E](
    opts: Double,
    task: js.Function2[/* callback */ AsyncResultCallback[T, E], /* results */ js.Any, Unit]
  ): js.Promise[Unit] = js.native
  def apply[T, E](
    opts: Double,
    task: js.Function2[/* callback */ AsyncResultCallback[T, E], /* results */ js.Any, Unit],
    callback: AsyncResultCallback[_, E]
  ): Unit = js.native
  def apply[T, E](opts: RetryOptions): js.Promise[Unit] = js.native
  def apply[T, E](
    opts: RetryOptions,
    task: js.Function2[/* callback */ AsyncResultCallback[T, E], /* results */ js.Any, Unit]
  ): js.Promise[Unit] = js.native
  def apply[T, E](
    opts: RetryOptions,
    task: js.Function2[/* callback */ AsyncResultCallback[T, E], /* results */ js.Any, Unit],
    callback: AsyncResultCallback[_, E]
  ): Unit = js.native
}

