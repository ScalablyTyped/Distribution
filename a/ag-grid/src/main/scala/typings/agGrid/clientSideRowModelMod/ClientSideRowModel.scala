package typings.agGrid.clientSideRowModelMod

import org.scalablytyped.runtime.StringDictionary
import typings.agGrid.changedPathMod.ChangedPath
import typings.agGrid.iRowModelMod.RowBounds
import typings.agGrid.rowNodeMod.RowNode
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
  def batchUpdateRowData(rowDataTransaction: RowDataTransaction): Unit = js.native
  def batchUpdateRowData(rowDataTransaction: RowDataTransaction, callback: js.Function1[/* res */ RowNodeTransaction, Unit]): Unit = js.native
  /* private */ def commonUpdateRowData(rowNodeTrans: js.Any, rowNodeOrder: js.Any): js.Any = js.native
  /* private */ def createChangePath(rowNodeTransactions: js.Any): js.Any = js.native
  def doAggregate(): Unit = js.native
  def doAggregate(changedPath: ChangedPath): Unit = js.native
  /* private */ def doFilter(): js.Any = js.native
  /* private */ def doPivot(changedPath: js.Any): js.Any = js.native
  /* private */ def doRowGrouping(groupState: js.Any, rowNodeTransactions: js.Any, rowNodeOrder: js.Any, changedPath: js.Any): js.Any = js.native
  /* private */ def doRowsToDisplay(): js.Any = js.native
  /* private */ def doSort(): js.Any = js.native
  def ensureRowAtPixel(rowNode: RowNode, pixel: Double): Boolean = js.native
  /* private */ def executeBatchUpdateRowData(): js.Any = js.native
  def expandOrCollapseAll(expand: Boolean): Unit = js.native
  def forEachLeafNode(callback: js.Function): Unit = js.native
  def forEachNode(callback: js.Function): Unit = js.native
  def forEachNodeAfterFilter(callback: js.Function): Unit = js.native
  def forEachNodeAfterFilterAndSort(callback: js.Function): Unit = js.native
  def forEachPivotNode(callback: js.Function): Unit = js.native
  def getCopyOfNodesMap(): StringDictionary[RowNode] = js.native
  def getCurrentPageHeight(): Double = js.native
  /* private */ def getGroupState(): js.Any = js.native
  def getNodesInRangeForSelection(firstInRange: RowNode, lastInRange: RowNode): js.Array[RowNode] = js.native
  def getPageFirstRow(): Double = js.native
  def getPageLastRow(): Double = js.native
  def getRootNode(): RowNode = js.native
  def getRow(index: Double): RowNode = js.native
  def getRowBounds(index: Double): RowBounds = js.native
  def getRowCount(): Double = js.native
  def getRowIndexAtPixel(pixelToMatch: Double): Double = js.native
  def getRowNode(id: String): RowNode = js.native
  def getTopLevelNodes(): js.Array[RowNode] = js.native
  def getType(): String = js.native
  def getVirtualRowCount(): Double = js.native
  def init(): Unit = js.native
  def isEmpty(): Boolean = js.native
  def isLastRowFound(): Boolean = js.native
  /* private */ def isRowInPixel(rowNode: js.Any, pixelToMatch: js.Any): js.Any = js.native
  def isRowPresent(rowNode: RowNode): Boolean = js.native
  def isRowsToRender(): Boolean = js.native
  /* private */ def onFilterChanged(): js.Any = js.native
  /* private */ def onRowGroupOpened(): js.Any = js.native
  def onRowHeightChanged(): Unit = js.native
  /* private */ def onSortChanged(): js.Any = js.native
  /* private */ def onValueChanged(): js.Any = js.native
  /* private */ def recursivelyWalkNodesAndCallback(nodes: js.Any, callback: js.Any, recursionType: js.Any, index: js.Any): js.Any = js.native
  def refreshModel(params: RefreshModelParams): Unit = js.native
  def resetRowHeights(): Unit = js.native
  /* private */ def restoreGroupState(groupState: js.Any): js.Any = js.native
  def setDatasource(datasource: js.Any): Unit = js.native
  def setRowData(rowData: js.Array[_]): Unit = js.native
  def updateRowData(rowDataTran: RowDataTransaction): RowNodeTransaction = js.native
  def updateRowData(rowDataTran: RowDataTransaction, rowNodeOrder: StringDictionary[Double]): RowNodeTransaction = js.native
}

