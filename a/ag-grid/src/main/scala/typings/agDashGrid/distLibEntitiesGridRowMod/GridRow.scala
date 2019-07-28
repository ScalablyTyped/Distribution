package typings.agDashGrid.distLibEntitiesGridRowMod

import typings.agDashGrid.distLibEntitiesColumnMod.Column
import typings.agDashGrid.distLibEntitiesGridCellMod.GridCell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/entities/gridRow", "GridRow")
@js.native
class GridRow protected () extends js.Object {
  def this(rowIndex: Double, floating: String) = this()
  var floating: String = js.native
  var rowIndex: Double = js.native
  def before(otherSelection: GridRow): Boolean = js.native
  def equals(otherSelection: GridRow): Boolean = js.native
  def getGridCell(column: Column): GridCell = js.native
  def isFloatingBottom(): Boolean = js.native
  def isFloatingTop(): Boolean = js.native
  def isNotFloating(): Boolean = js.native
}

