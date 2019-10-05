package typings.async.asyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("async", "forever")
@js.native
object forever extends js.Object {
  def apply[E](next: js.Function1[/* next */ ErrorCallback[E], Unit], errBack: ErrorCallback[E]): Unit = js.native
}

