package typings.agGrid.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/utils", "NumberSequence")
@js.native
class NumberSequence () extends js.Object {
  def this(initValue: Double) = this()
  def this(initValue: Double, step: Double) = this()
  var nextValue: js.Any = js.native
  var step: js.Any = js.native
  def next(): Double = js.native
  def peek(): Double = js.native
  def skip(count: Double): Unit = js.native
}

