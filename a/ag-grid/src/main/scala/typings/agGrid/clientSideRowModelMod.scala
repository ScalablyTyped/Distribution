package typings.agGrid

import org.scalablytyped.runtime.StringDictionary
import typings.agGrid.changedPathMod.ChangedPath
import typings.agGrid.iRowModelMod.RowBounds
import typings.agGrid.rowNodeMod.RowNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientSideRowModelMod {
  
  @JSImport("ag-grid/dist/lib/rowModels/clientSide/clientSideRowModel", "ClientSideRowModel")
  @js.native
  class ClientSideRowModel () extends StObject {
    
    /* private */ @JSName("$scope")
    var $scope: js.Any = js.native
    
    /* private */ var aggregationStage: js.Any = js.native
    
    def batchUpdateRowData(rowDataTransaction: RowDataTransaction): Unit = js.native
    def batchUpdateRowData(rowDataTransaction: RowDataTransaction, callback: js.Function1[/* res */ RowNodeTransaction, Unit]): Unit = js.native
    
    /* private */ var columnApi: js.Any = js.native
    
    /* private */ var columnController: js.Any = js.native
    
    /* private */ def commonUpdateRowData(rowNodeTrans: js.Any, rowNodeOrder: js.Any): js.Any = js.native
    
    /* private */ var context: js.Any = js.native
    
    /* private */ def createChangePath(rowNodeTransactions: js.Any): js.Any = js.native
    
    def doAggregate(): Unit = js.native
    def doAggregate(changedPath: ChangedPath): Unit = js.native
    
    /* private */ def doFilter(): js.Any = js.native
    
    /* private */ def doPivot(changedPath: js.Any): js.Any = js.native
    
    /* private */ def doRowGrouping(groupState: js.Any, rowNodeTransactions: js.Any, rowNodeOrder: js.Any, changedPath: js.Any): js.Any = js.native
    
    /* private */ def doRowsToDisplay(): js.Any = js.native
    
    /* private */ def doSort(): js.Any = js.native
    
    def ensureRowAtPixel(rowNode: RowNode, pixel: Double): Boolean = js.native
    
    /* private */ var eventService: js.Any = js.native
    
    /* private */ def executeBatchUpdateRowData(): js.Any = js.native
    
    def expandOrCollapseAll(expand: Boolean): Unit = js.native
    
    /* private */ var filterManager: js.Any = js.native
    
    /* private */ var filterStage: js.Any = js.native
    
    /* private */ var flattenStage: js.Any = js.native
    
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
    
    /* private */ var gridApi: js.Any = js.native
    
    /* private */ var gridOptionsWrapper: js.Any = js.native
    
    /* private */ var groupStage: js.Any = js.native
    
    def init(): Unit = js.native
    
    def isEmpty(): Boolean = js.native
    
    def isLastRowFound(): Boolean = js.native
    
    /* private */ def isRowInPixel(rowNode: js.Any, pixelToMatch: js.Any): js.Any = js.native
    
    def isRowPresent(rowNode: RowNode): Boolean = js.native
    
    def isRowsToRender(): Boolean = js.native
    
    /* private */ var nodeManager: js.Any = js.native
    
    /* private */ def onFilterChanged(): js.Any = js.native
    
    /* private */ def onRowGroupOpened(): js.Any = js.native
    
    def onRowHeightChanged(): Unit = js.native
    
    /* private */ def onSortChanged(): js.Any = js.native
    
    /* private */ def onValueChanged(): js.Any = js.native
    
    /* private */ var pivotStage: js.Any = js.native
    
    /* private */ def recursivelyWalkNodesAndCallback(nodes: js.Any, callback: js.Any, recursionType: js.Any, index: js.Any): js.Any = js.native
    
    def refreshModel(params: RefreshModelParams): Unit = js.native
    
    def resetRowHeights(): Unit = js.native
    
    /* private */ def restoreGroupState(groupState: js.Any): js.Any = js.native
    
    /* private */ var rootNode: js.Any = js.native
    
    /* private */ var rowDataTransactionBatch: js.Any = js.native
    
    /* private */ var rowsToDisplay: js.Any = js.native
    
    /* private */ var selectionController: js.Any = js.native
    
    def setDatasource(datasource: js.Any): Unit = js.native
    
    def setRowData(rowData: js.Array[js.Any]): Unit = js.native
    
    /* private */ var sortStage: js.Any = js.native
    
    def updateRowData(rowDataTran: RowDataTransaction): RowNodeTransaction = js.native
    def updateRowData(rowDataTran: RowDataTransaction, rowNodeOrder: StringDictionary[Double]): RowNodeTransaction = js.native
    
    /* private */ var valueCache: js.Any = js.native
    
    /* private */ var valueService: js.Any = js.native
  }
  
  trait BatchTransactionItem extends StObject {
    
    def callback(res: RowNodeTransaction): Unit
    
    var rowDataTransaction: RowDataTransaction
  }
  object BatchTransactionItem {
    
    inline def apply(callback: RowNodeTransaction => Unit, rowDataTransaction: RowDataTransaction): BatchTransactionItem = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), rowDataTransaction = rowDataTransaction.asInstanceOf[js.Any])
      __obj.asInstanceOf[BatchTransactionItem]
    }
    
    extension [Self <: BatchTransactionItem](x: Self) {
      
      inline def setCallback(value: RowNodeTransaction => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      inline def setRowDataTransaction(value: RowDataTransaction): Self = StObject.set(x, "rowDataTransaction", value.asInstanceOf[js.Any])
    }
  }
  
  trait RefreshModelParams extends StObject {
    
    var animate: js.UndefOr[Boolean] = js.undefined
    
    var groupState: js.UndefOr[js.Any] = js.undefined
    
    var keepEditingRows: js.UndefOr[Boolean] = js.undefined
    
    var keepRenderedRows: js.UndefOr[Boolean] = js.undefined
    
    var newData: js.UndefOr[Boolean] = js.undefined
    
    var rowNodeOrder: js.UndefOr[StringDictionary[Double]] = js.undefined
    
    var rowNodeTransactions: js.UndefOr[js.Array[RowNodeTransaction]] = js.undefined
    
    var step: Double
  }
  object RefreshModelParams {
    
    inline def apply(step: Double): RefreshModelParams = {
      val __obj = js.Dynamic.literal(step = step.asInstanceOf[js.Any])
      __obj.asInstanceOf[RefreshModelParams]
    }
    
    extension [Self <: RefreshModelParams](x: Self) {
      
      inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      inline def setGroupState(value: js.Any): Self = StObject.set(x, "groupState", value.asInstanceOf[js.Any])
      
      inline def setGroupStateUndefined: Self = StObject.set(x, "groupState", js.undefined)
      
      inline def setKeepEditingRows(value: Boolean): Self = StObject.set(x, "keepEditingRows", value.asInstanceOf[js.Any])
      
      inline def setKeepEditingRowsUndefined: Self = StObject.set(x, "keepEditingRows", js.undefined)
      
      inline def setKeepRenderedRows(value: Boolean): Self = StObject.set(x, "keepRenderedRows", value.asInstanceOf[js.Any])
      
      inline def setKeepRenderedRowsUndefined: Self = StObject.set(x, "keepRenderedRows", js.undefined)
      
      inline def setNewData(value: Boolean): Self = StObject.set(x, "newData", value.asInstanceOf[js.Any])
      
      inline def setNewDataUndefined: Self = StObject.set(x, "newData", js.undefined)
      
      inline def setRowNodeOrder(value: StringDictionary[Double]): Self = StObject.set(x, "rowNodeOrder", value.asInstanceOf[js.Any])
      
      inline def setRowNodeOrderUndefined: Self = StObject.set(x, "rowNodeOrder", js.undefined)
      
      inline def setRowNodeTransactions(value: js.Array[RowNodeTransaction]): Self = StObject.set(x, "rowNodeTransactions", value.asInstanceOf[js.Any])
      
      inline def setRowNodeTransactionsUndefined: Self = StObject.set(x, "rowNodeTransactions", js.undefined)
      
      inline def setRowNodeTransactionsVarargs(value: RowNodeTransaction*): Self = StObject.set(x, "rowNodeTransactions", js.Array(value :_*))
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    }
  }
  
  trait RowDataTransaction extends StObject {
    
    var add: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var addIndex: js.UndefOr[Double] = js.undefined
    
    var remove: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var update: js.UndefOr[js.Array[js.Any]] = js.undefined
  }
  object RowDataTransaction {
    
    inline def apply(): RowDataTransaction = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RowDataTransaction]
    }
    
    extension [Self <: RowDataTransaction](x: Self) {
      
      inline def setAdd(value: js.Array[js.Any]): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
      
      inline def setAddIndex(value: Double): Self = StObject.set(x, "addIndex", value.asInstanceOf[js.Any])
      
      inline def setAddIndexUndefined: Self = StObject.set(x, "addIndex", js.undefined)
      
      inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
      
      inline def setAddVarargs(value: js.Any*): Self = StObject.set(x, "add", js.Array(value :_*))
      
      inline def setRemove(value: js.Array[js.Any]): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
      
      inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
      
      inline def setRemoveVarargs(value: js.Any*): Self = StObject.set(x, "remove", js.Array(value :_*))
      
      inline def setUpdate(value: js.Array[js.Any]): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
      
      inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
      
      inline def setUpdateVarargs(value: js.Any*): Self = StObject.set(x, "update", js.Array(value :_*))
    }
  }
  
  trait RowNodeTransaction extends StObject {
    
    var add: js.Array[RowNode]
    
    var remove: js.Array[RowNode]
    
    var update: js.Array[RowNode]
  }
  object RowNodeTransaction {
    
    inline def apply(add: js.Array[RowNode], remove: js.Array[RowNode], update: js.Array[RowNode]): RowNodeTransaction = {
      val __obj = js.Dynamic.literal(add = add.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowNodeTransaction]
    }
    
    extension [Self <: RowNodeTransaction](x: Self) {
      
      inline def setAdd(value: js.Array[RowNode]): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
      
      inline def setAddVarargs(value: RowNode*): Self = StObject.set(x, "add", js.Array(value :_*))
      
      inline def setRemove(value: js.Array[RowNode]): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
      
      inline def setRemoveVarargs(value: RowNode*): Self = StObject.set(x, "remove", js.Array(value :_*))
      
      inline def setUpdate(value: js.Array[RowNode]): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
      
      inline def setUpdateVarargs(value: RowNode*): Self = StObject.set(x, "update", js.Array(value :_*))
    }
  }
}
