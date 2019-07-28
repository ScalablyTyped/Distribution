package typings.asyncblockDashGenerators.underscoreAbNs

import typings.asyncblockDashGenerators.underscoreAbNs.abNs.Flow
import typings.asyncblockDashGenerators.underscoreAbNs.abNs.Result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("_ab")
@js.native
object ^ extends js.Object {
  def ab[T](run: js.Function0[T]): Result[T] = js.native
  def ab[T](run: js.Function0[T], done: js.Function): Result[T] = js.native
  def ab[T](run: js.Function1[/* flow */ Flow, T]): Result[T] = js.native
  def ab[T](run: js.Function1[/* flow */ Flow, T], done: js.Function): Result[T] = js.native
}

