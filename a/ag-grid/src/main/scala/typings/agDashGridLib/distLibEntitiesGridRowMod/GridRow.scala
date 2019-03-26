package typings
package agDashGridLib.distLibEntitiesGridRowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/entities/gridRow", "GridRow")
@js.native
class GridRow protected () extends js.Object {
  def this(rowIndex: scala.Double, floating: java.lang.String) = this()
  var floating: java.lang.String = js.native
  var rowIndex: scala.Double = js.native
  def before(otherSelection: GridRow): scala.Boolean = js.native
  def equals(otherSelection: GridRow): scala.Boolean = js.native
  def getGridCell(column: agDashGridLib.distLibEntitiesColumnMod.Column): agDashGridLib.distLibEntitiesGridCellMod.GridCell = js.native
  def isFloatingBottom(): scala.Boolean = js.native
  def isFloatingTop(): scala.Boolean = js.native
  def isNotFloating(): scala.Boolean = js.native
}

