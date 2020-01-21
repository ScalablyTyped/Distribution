package typings.agGrid.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid", "defaultGroupComparator")
@js.native
object defaultGroupComparator extends js.Object {
  def apply(
    valueA: js.Any,
    valueB: js.Any,
    nodeA: typings.agGrid.rowNodeMod.RowNode,
    nodeB: typings.agGrid.rowNodeMod.RowNode
  ): Double = js.native
  def apply(
    valueA: js.Any,
    valueB: js.Any,
    nodeA: typings.agGrid.rowNodeMod.RowNode,
    nodeB: typings.agGrid.rowNodeMod.RowNode,
    accentedCompare: Boolean
  ): Double = js.native
}

