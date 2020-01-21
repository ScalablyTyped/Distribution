package typings.asyncblock

import typings.asyncblock.ab.ab.Flow
import typings.asyncblock.ab.ab.Result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asyncblock", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply[T](run: js.Function0[T]): Result[T] = js.native
  def apply[T](run: js.Function0[T], done: js.Function): Result[T] = js.native
  def apply[T](run: js.Function1[/* flow */ Flow, T]): Result[T] = js.native
  def apply[T](run: js.Function1[/* flow */ Flow, T], done: js.Function): Result[T] = js.native
  def enableTransform(module: js.Any): Boolean = js.native
  def getCurrentFlow(): Flow = js.native
  def ifError(callback: js.Function): js.Function = js.native
  def nostack[T](run: js.Function0[T]): Result[T] = js.native
  def nostack[T](run: js.Function0[T], done: js.Function): Result[T] = js.native
  def nostack[T](run: js.Function1[/* flow */ Flow, T]): Result[T] = js.native
  def nostack[T](run: js.Function1[/* flow */ Flow, T], done: js.Function): Result[T] = js.native
}

