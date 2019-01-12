package typings
package asyncblockDashGeneratorsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asyncblock-generators", JSImport.Namespace)
@js.native
object asyncblockDashGeneratorsMod extends js.Object {
  def apply[T](run: js.Function0[T]): asyncblockDashGeneratorsLib.underscoreAbNs.abNs.Result[T] = js.native
  def apply[T](run: js.Function0[T], done: js.Function): asyncblockDashGeneratorsLib.underscoreAbNs.abNs.Result[T] = js.native
  def apply[T](run: js.Function1[/* flow */ asyncblockDashGeneratorsLib.underscoreAbNs.abNs.Flow, T]): asyncblockDashGeneratorsLib.underscoreAbNs.abNs.Result[T] = js.native
  def apply[T](
    run: js.Function1[/* flow */ asyncblockDashGeneratorsLib.underscoreAbNs.abNs.Flow, T],
    done: js.Function
  ): asyncblockDashGeneratorsLib.underscoreAbNs.abNs.Result[T] = js.native
  def enableTransform(module: js.Any): scala.Boolean = js.native
  def getCurrentFlow(): asyncblockDashGeneratorsLib.underscoreAbNs.abNs.Flow = js.native
  def ifError(callback: js.Function): js.Function = js.native
  def nostack[T](run: js.Function0[T]): asyncblockDashGeneratorsLib.underscoreAbNs.abNs.Result[T] = js.native
  def nostack[T](run: js.Function0[T], done: js.Function): asyncblockDashGeneratorsLib.underscoreAbNs.abNs.Result[T] = js.native
  def nostack[T](run: js.Function1[/* flow */ asyncblockDashGeneratorsLib.underscoreAbNs.abNs.Flow, T]): asyncblockDashGeneratorsLib.underscoreAbNs.abNs.Result[T] = js.native
  def nostack[T](
    run: js.Function1[/* flow */ asyncblockDashGeneratorsLib.underscoreAbNs.abNs.Flow, T],
    done: js.Function
  ): asyncblockDashGeneratorsLib.underscoreAbNs.abNs.Result[T] = js.native
}

