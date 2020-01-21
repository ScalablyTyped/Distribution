package typings.agGrid

import typings.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/functions", JSImport.Namespace)
@js.native
object functionsMod extends js.Object {
  def defaultGroupComparator(valueA: js.Any, valueB: js.Any, nodeA: RowNode, nodeB: RowNode): Double = js.native
  def defaultGroupComparator(valueA: js.Any, valueB: js.Any, nodeA: RowNode, nodeB: RowNode, accentedCompare: Boolean): Double = js.native
}

