package typings
package agDashGridLib.distLibInterfacesIRangeControllerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRangeController extends js.Object {
  def addRange(rangeSelection: AddRangeSelectionParams): scala.Unit = js.native
  def clearSelection(): scala.Unit = js.native
  def extendRangeInDirection(cell: agDashGridLib.distLibEntitiesGridCellMod.GridCell, key: scala.Double): scala.Boolean = js.native
  def extendRangeToCell(cell: agDashGridLib.distLibEntitiesGridCellMod.GridCell): scala.Unit = js.native
  def getCellRangeCount(cell: agDashGridLib.distLibEntitiesGridCellMod.GridCell): scala.Double = js.native
  def getCellRanges(): js.Array[RangeSelection] = js.native
  def isCellInAnyRange(cell: agDashGridLib.distLibEntitiesGridCellMod.GridCell): scala.Boolean = js.native
  def onDragStart(mouseEvent: stdLib.MouseEvent): scala.Unit = js.native
  def onDragStop(): scala.Unit = js.native
  def onDragging(mouseEvent: stdLib.MouseEvent): scala.Unit = js.native
  def registerGridComp(gridPanel: agDashGridLib.distLibGridPanelGridPanelMod.GridPanel): scala.Unit = js.native
  def setRange(rangeSelection: AddRangeSelectionParams): scala.Unit = js.native
  def setRangeToCell(cell: agDashGridLib.distLibEntitiesGridCellMod.GridCell): scala.Unit = js.native
  def setRangeToCell(cell: agDashGridLib.distLibEntitiesGridCellMod.GridCell, appendRange: scala.Boolean): scala.Unit = js.native
}

