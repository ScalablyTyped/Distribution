package typings
package agDashGridLib.distLibRowModelsPinnedRowModelMod

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
  def forEachPinnedBottomRow(
    callback: js.Function2[
      /* rowNode */ agDashGridLib.distLibEntitiesRowNodeMod.RowNode, 
      /* index */ scala.Double, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def forEachPinnedTopRow(
    callback: js.Function2[
      /* rowNode */ agDashGridLib.distLibEntitiesRowNodeMod.RowNode, 
      /* index */ scala.Double, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def getPinnedBottomRow(index: scala.Double): agDashGridLib.distLibEntitiesRowNodeMod.RowNode = js.native
  def getPinnedBottomRowCount(): scala.Double = js.native
  def getPinnedBottomRowData(): js.Array[agDashGridLib.distLibEntitiesRowNodeMod.RowNode] = js.native
  def getPinnedBottomTotalHeight(): scala.Double = js.native
  def getPinnedTopRow(index: scala.Double): agDashGridLib.distLibEntitiesRowNodeMod.RowNode = js.native
  def getPinnedTopRowCount(): scala.Double = js.native
  def getPinnedTopRowData(): js.Array[agDashGridLib.distLibEntitiesRowNodeMod.RowNode] = js.native
  def getPinnedTopTotalHeight(): scala.Double = js.native
  def getRowAtPixel(pixel: scala.Double, floating: java.lang.String): scala.Double = js.native
  /* private */ def getTotalHeight(rowNodes: js.Any): js.Any = js.native
  def init(): scala.Unit = js.native
  def isEmpty(floating: java.lang.String): scala.Boolean = js.native
  def isRowsToRender(floating: java.lang.String): scala.Boolean = js.native
  def setPinnedBottomRowData(rowData: js.Array[_]): scala.Unit = js.native
  def setPinnedTopRowData(rowData: js.Array[_]): scala.Unit = js.native
}

