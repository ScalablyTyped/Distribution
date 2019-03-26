package typings
package agDashGridLib.distLibEntitiesGridCellMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/entities/gridCell", "GridCell")
@js.native
class GridCell protected () extends js.Object {
  def this(gridCellDef: GridCellDef) = this()
  var column: agDashGridLib.distLibEntitiesColumnMod.Column = js.native
  var floating: java.lang.String = js.native
  var rowIndex: scala.Double = js.native
  def createId(): java.lang.String = js.native
  def equals(other: GridCell): scala.Boolean = js.native
  def getGridCellDef(): GridCellDef = js.native
  def getGridRow(): agDashGridLib.distLibEntitiesGridRowMod.GridRow = js.native
}

