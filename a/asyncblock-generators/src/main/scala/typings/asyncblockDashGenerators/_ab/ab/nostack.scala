package typings.asyncblockDashGenerators._ab.ab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("_ab.ab.nostack")
@js.native
object nostack extends js.Object {
  def apply[T](run: js.Function0[T]): Result[T] = js.native
  def apply[T](run: js.Function0[T], done: js.Function): Result[T] = js.native
  def apply[T](run: js.Function1[/* flow */ Flow, T]): Result[T] = js.native
  def apply[T](run: js.Function1[/* flow */ Flow, T], done: js.Function): Result[T] = js.native
}

