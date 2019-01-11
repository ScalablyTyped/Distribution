package typings
package asyncblockLib.asyncblockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asyncblock", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[T](run: js.Function0[T]): asyncblockLib.underscoreAbNs.abNs.Result[T] = js.native
  def apply[T](run: js.Function0[T], done: js.Function): asyncblockLib.underscoreAbNs.abNs.Result[T] = js.native
  def apply[T](run: js.Function1[/* flow */ asyncblockLib.underscoreAbNs.abNs.Flow, T]): asyncblockLib.underscoreAbNs.abNs.Result[T] = js.native
  def apply[T](run: js.Function1[/* flow */ asyncblockLib.underscoreAbNs.abNs.Flow, T], done: js.Function): asyncblockLib.underscoreAbNs.abNs.Result[T] = js.native
  def enableTransform(module: js.Any): scala.Boolean = js.native
  def getCurrentFlow(): asyncblockLib.underscoreAbNs.abNs.Flow = js.native
  def ifError(callback: js.Function): js.Function = js.native
  def nostack[T](run: js.Function0[T]): asyncblockLib.underscoreAbNs.abNs.Result[T] = js.native
  def nostack[T](run: js.Function0[T], done: js.Function): asyncblockLib.underscoreAbNs.abNs.Result[T] = js.native
  def nostack[T](run: js.Function1[/* flow */ asyncblockLib.underscoreAbNs.abNs.Flow, T]): asyncblockLib.underscoreAbNs.abNs.Result[T] = js.native
  def nostack[T](run: js.Function1[/* flow */ asyncblockLib.underscoreAbNs.abNs.Flow, T], done: js.Function): asyncblockLib.underscoreAbNs.abNs.Result[T] = js.native
}

