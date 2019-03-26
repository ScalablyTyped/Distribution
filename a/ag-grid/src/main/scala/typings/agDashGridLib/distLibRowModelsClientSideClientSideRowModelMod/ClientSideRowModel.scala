package typings
package agDashGridLib.distLibRowModelsClientSideClientSideRowModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rowModels/clientSide/clientSideRowModel", "ClientSideRowModel")
@js.native
class ClientSideRowModel () extends js.Object {
  @JSName("$scope")
  var $scope: js.Any = js.native
  var aggregationStage: js.Any = js.native
  var columnApi: js.Any = js.native
  var columnController: js.Any = js.native
  var context: js.Any = js.native
  var eventService: js.Any = js.native
  var filterManager: js.Any = js.native
  var filterStage: js.Any = js.native
  var flattenStage: js.Any = js.native
  var gridApi: js.Any = js.native
  var gridOptionsWrapper: js.Any = js.native
  var groupStage: js.Any = js.native
  var nodeManager: js.Any = js.native
  var pivotStage: js.Any = js.native
  var rootNode: js.Any = js.native
  var rowDataTransactionBatch: js.Any = js.native
  var rowsToDisplay: js.Any = js.native
  var selectionController: js.Any = js.native
  var sortStage: js.Any = js.native
  var valueCache: js.Any = js.native
  var valueService: js.Any = js.native
  def batchUpdateRowData(rowDataTransaction: RowDataTransaction): scala.Unit = js.native
  def batchUpdateRowData(
    rowDataTransaction: RowDataTransaction,
    callback: js.Function1[/* res */ RowNodeTransaction, scala.Unit]
  ): scala.Unit = js.native
  /* private */ def commonUpdateRowData(rowNodeTrans: js.Any): js.Any = js.native
  /* private */ def commonUpdateRowData(rowNodeTrans: js.Any, rowNodeOrder: js.Any): js.Any = js.native
  /* private */ def createChangePath(rowNodeTransactions: js.Any): js.Any = js.native
  def doAggregate(): scala.Unit = js.native
  def doAggregate(changedPath: agDashGridLib.distLibRowModelsClientSideChangedPathMod.ChangedPath): scala.Unit = js.native
  /* private */ def doFilter(): js.Any = js.native
  /* private */ def doPivot(changedPath: js.Any): js.Any = js.native
  /* private */ def doRowGrouping(groupState: js.Any, rowNodeTransactions: js.Any, rowNodeOrder: js.Any, changedPath: js.Any): js.Any = js.native
  /* private */ def doRowsToDisplay(): js.Any = js.native
  /* private */ def doSort(): js.Any = js.native
  def ensureRowAtPixel(rowNode: agDashGridLib.distLibEntitiesRowNodeMod.RowNode, pixel: scala.Double): scala.Boolean = js.native
  /* private */ def executeBatchUpdateRowData(): js.Any = js.native
  def expandOrCollapseAll(expand: scala.Boolean): scala.Unit = js.native
  def forEachLeafNode(callback: js.Function): scala.Unit = js.native
  def forEachNode(callback: js.Function): scala.Unit = js.native
  def forEachNodeAfterFilter(callback: js.Function): scala.Unit = js.native
  def forEachNodeAfterFilterAndSort(callback: js.Function): scala.Unit = js.native
  def forEachPivotNode(callback: js.Function): scala.Unit = js.native
  def getCopyOfNodesMap(): org.scalablytyped.runtime.StringDictionary[agDashGridLib.distLibEntitiesRowNodeMod.RowNode] = js.native
  def getCurrentPageHeight(): scala.Double = js.native
  /* private */ def getGroupState(): js.Any = js.native
  def getNodesInRangeForSelection(
    firstInRange: agDashGridLib.distLibEntitiesRowNodeMod.RowNode,
    lastInRange: agDashGridLib.distLibEntitiesRowNodeMod.RowNode
  ): js.Array[agDashGridLib.distLibEntitiesRowNodeMod.RowNode] = js.native
  def getPageFirstRow(): scala.Double = js.native
  def getPageLastRow(): scala.Double = js.native
  def getRootNode(): agDashGridLib.distLibEntitiesRowNodeMod.RowNode = js.native
  def getRow(index: scala.Double): agDashGridLib.distLibEntitiesRowNodeMod.RowNode = js.native
  def getRowBounds(index: scala.Double): agDashGridLib.distLibInterfacesIRowModelMod.RowBounds = js.native
  def getRowCount(): scala.Double = js.native
  def getRowIndexAtPixel(pixelToMatch: scala.Double): scala.Double = js.native
  def getRowNode(id: java.lang.String): agDashGridLib.distLibEntitiesRowNodeMod.RowNode = js.native
  def getTopLevelNodes(): js.Array[agDashGridLib.distLibEntitiesRowNodeMod.RowNode] = js.native
  def getType(): java.lang.String = js.native
  def getVirtualRowCount(): scala.Double = js.native
  def init(): scala.Unit = js.native
  def isEmpty(): scala.Boolean = js.native
  def isLastRowFound(): scala.Boolean = js.native
  /* private */ def isRowInPixel(rowNode: js.Any, pixelToMatch: js.Any): js.Any = js.native
  def isRowPresent(rowNode: agDashGridLib.distLibEntitiesRowNodeMod.RowNode): scala.Boolean = js.native
  def isRowsToRender(): scala.Boolean = js.native
  /* private */ def onFilterChanged(): js.Any = js.native
  /* private */ def onRowGroupOpened(): js.Any = js.native
  def onRowHeightChanged(): scala.Unit = js.native
  /* private */ def onSortChanged(): js.Any = js.native
  /* private */ def onValueChanged(): js.Any = js.native
  /* private */ def recursivelyWalkNodesAndCallback(nodes: js.Any, callback: js.Any, recursionType: js.Any, index: js.Any): js.Any = js.native
  def refreshModel(params: RefreshModelParams): scala.Unit = js.native
  def resetRowHeights(): scala.Unit = js.native
  /* private */ def restoreGroupState(groupState: js.Any): js.Any = js.native
  def setDatasource(datasource: js.Any): scala.Unit = js.native
  def setRowData(rowData: js.Array[_]): scala.Unit = js.native
  def updateRowData(rowDataTran: RowDataTransaction): RowNodeTransaction = js.native
  def updateRowData(
    rowDataTran: RowDataTransaction,
    rowNodeOrder: org.scalablytyped.runtime.StringDictionary[scala.Double]
  ): RowNodeTransaction = js.native
}

