package typings.async.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("async", "autoInject")
@js.native
object autoInject extends js.Object {
  def apply[E](tasks: js.Any): Unit = js.native
  def apply[E](tasks: js.Any, callback: AsyncResultCallback[_, E]): Unit = js.native
}

