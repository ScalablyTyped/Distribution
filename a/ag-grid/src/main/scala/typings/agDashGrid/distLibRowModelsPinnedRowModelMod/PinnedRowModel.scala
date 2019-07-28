package typings.agDashGrid.distLibRowModelsPinnedRowModelMod

import typings.agDashGrid.distLibEntitiesRowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rowModels/pinnedRowModel", "PinnedRowModel")
@js.native
class PinnedRowModel () extends js.Object {
  var columnApi: js.Any = js.native
  var context: js.Any = js.native
  var eventService: js.Any = js.native
  var gridApi: js.Any = js.native
  var gridOptionsWrapper: js.Any = js.native
  var pinnedBottomRows: js.Any = js.native
  var pinnedTopRows: js.Any = js.native
  /* private */ def createNodesFromData(allData: js.Any, isTop: js.Any): js.Any = js.native
  def forEachPinnedBottomRow(callback: js.Function2[/* rowNode */ RowNode, /* index */ Double, Unit]): Unit = js.native
  def forEachPinnedTopRow(callback: js.Function2[/* rowNode */ RowNode, /* index */ Double, Unit]): Unit = js.native
  def getPinnedBottomRow(index: Double): RowNode = js.native
  def getPinnedBottomRowCount(): Double = js.native
  def getPinnedBottomRowData(): js.Array[RowNode] = js.native
  def getPinnedBottomTotalHeight(): Double = js.native
  def getPinnedTopRow(index: Double): RowNode = js.native
  def getPinnedTopRowCount(): Double = js.native
  def getPinnedTopRowData(): js.Array[RowNode] = js.native
  def getPinnedTopTotalHeight(): Double = js.native
  def getRowAtPixel(pixel: Double, floating: String): Double = js.native
  /* private */ def getTotalHeight(rowNodes: js.Any): js.Any = js.native
  def init(): Unit = js.native
  def isEmpty(floating: String): Boolean = js.native
  def isRowsToRender(floating: String): Boolean = js.native
  def setPinnedBottomRowData(rowData: js.Array[_]): Unit = js.native
  def setPinnedTopRowData(rowData: js.Array[_]): Unit = js.native
}

