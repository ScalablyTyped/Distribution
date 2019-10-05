package typings.async.asyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("async", "until")
@js.native
object until extends js.Object {
  def apply[E](test: js.Function0[Boolean], fn: AsyncVoidFunction[E], callback: ErrorCallback[E]): Unit = js.native
}

