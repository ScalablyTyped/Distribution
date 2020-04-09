package typings.async.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("async", "whilst")
@js.native
object whilst extends js.Object {
  def apply[E](test: js.Function0[Boolean], fn: AsyncVoidFunction[E], callback: ErrorCallback[E]): Unit = js.native
  def apply[R, E](test: js.Function0[Boolean], fn: AsyncVoidFunction[E]): js.Promise[R] = js.native
}

