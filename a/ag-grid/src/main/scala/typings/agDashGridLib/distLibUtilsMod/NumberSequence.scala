package typings
package agDashGridLib.distLibUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/utils", "NumberSequence")
@js.native
class NumberSequence () extends js.Object {
  def this(initValue: scala.Double) = this()
  def this(initValue: scala.Double, step: scala.Double) = this()
  var nextValue: js.Any = js.native
  var step: js.Any = js.native
  def next(): scala.Double = js.native
  def peek(): scala.Double = js.native
  def skip(count: scala.Double): scala.Unit = js.native
}

