package typings.agGrid

import typings.agGrid.beanStubMod.BeanStub
import typings.agGrid.cellCompMod.CellComp
import typings.agGrid.columnMod.Column
import typings.agGrid.gridApiMod.FlashCellsParams
import typings.agGrid.gridApiMod.GetCellRendererInstancesParams
import typings.agGrid.gridApiMod.RefreshCellsParams
import typings.agGrid.gridCellMod.GridCell
import typings.agGrid.gridCellMod.GridCellDef
import typings.agGrid.gridPanelMod.GridPanel
import typings.agGrid.iCellEditorMod.ICellEditorComp
import typings.agGrid.iCellRendererMod.ICellRendererComp
import typings.agGrid.loggerMod.LoggerFactory
import typings.agGrid.rowNodeMod.RowNode
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rowRendererMod {
  
  @JSImport("ag-grid/dist/lib/rendering/rowRenderer", "RowRenderer")
  @js.native
  class RowRenderer () extends BeanStub {
    
    /* private */ @JSName("$scope")
    var $scope: js.Any = js.native
    
    def addRenderedRowListener(eventName: String, rowIndex: Double, callback: js.Function): Unit = js.native
    
    def agWire(loggerFactory: LoggerFactory): Unit = js.native
    
    /* private */ var animationFrameService: js.Any = js.native
    
    /* private */ var beans: js.Any = js.native
    
    /* private */ def binRowComps(recycleRows: js.Any): js.Any = js.native
    
    /* private */ def calculateIndexesToDraw(): js.Any = js.native
    
    /* private */ var cellNavigationService: js.Any = js.native
    
    /* private */ def checkAngularCompile(): js.Any = js.native
    
    /* private */ var columnApi: js.Any = js.native
    
    /* private */ var columnController: js.Any = js.native
    
    /* private */ var context: js.Any = js.native
    
    /* private */ def createOrUpdateRowComp(rowIndex: js.Any, rowsToRecycle: js.Any, animate: js.Any, afterScroll: js.Any): js.Any = js.native
    
    /* private */ def createRowComp(rowNode: js.Any, animate: js.Any, afterScroll: js.Any): js.Any = js.native
    
    /* private */ def destroyRowComps(rowCompsMap: js.Any, animate: js.Any): js.Any = js.native
    
    def ensureCellVisible(gridCell: GridCell): Unit = js.native
    
    /* private */ var eventService: js.Any = js.native
    
    /* private */ var expressionService: js.Any = js.native
    
    /* private */ def findNextCellToFocusOn(gridCell: js.Any, backwards: js.Any, startEditing: js.Any): js.Any = js.native
    
    /* private */ var firstRenderedRow: js.Any = js.native
    
    def flashCells(): Unit = js.native
    def flashCells(params: FlashCellsParams): Unit = js.native
    
    /* private */ var floatingBottomRowComps: js.Any = js.native
    
    /* private */ var floatingTopRowComps: js.Any = js.native
    
    /* private */ def flushContainers(rowComps: js.Any): js.Any = js.native
    
    /* private */ var focusedCellController: js.Any = js.native
    
    def forEachCellComp(callback: js.Function1[/* cellComp */ CellComp, Unit]): Unit = js.native
    
    /* private */ def forEachCellCompFiltered(rowNodes: js.Any, columns: js.Any, callback: js.Any): js.Any = js.native
    
    /* private */ def forEachRowComp(callback: js.Any): js.Any = js.native
    
    def getAllCellsForColumn(column: Column): js.Array[HTMLElement] = js.native
    
    def getCellEditorInstances(params: GetCellRendererInstancesParams): js.Array[ICellEditorComp] = js.native
    
    def getCellRendererInstances(params: GetCellRendererInstancesParams): js.Array[ICellRendererComp] = js.native
    
    /* private */ def getCellToRestoreFocusToAfterRefresh(params: js.Any): js.Any = js.native
    
    /* private */ def getComponentForCell(gridCell: js.Any): js.Any = js.native
    
    def getEditingCells(): js.Array[GridCellDef] = js.native
    
    def getFirstVirtualRenderedRow(): Double = js.native
    
    def getLastVirtualRenderedRow(): Double = js.native
    
    /* private */ def getLockOnRefresh(): js.Any = js.native
    
    /* private */ def getRenderedIndexesForRowNodes(rowNodes: js.Any): js.Any = js.native
    
    def getRenderedNodes(): js.Array[RowNode] = js.native
    
    /* private */ var gridApi: js.Any = js.native
    
    /* private */ var gridCore: js.Any = js.native
    
    /* private */ var gridOptionsWrapper: js.Any = js.native
    
    /* private */ var gridPanel: js.Any = js.native
    
    /* private */ var heightScaler: js.Any = js.native
    
    /* private */ def keepRowBecauseEditing(rowComp: js.Any): js.Any = js.native
    
    /* private */ var lastRenderedRow: js.Any = js.native
    
    /* private */ var logger: js.Any = js.native
    
    /* private */ var loggerFactory: js.Any = js.native
    
    /* private */ def moveEditToNextCellOrRow(previousRenderedCell: js.Any, nextRenderedCell: js.Any): js.Any = js.native
    
    /* private */ def moveToCellAfter(previousRenderedCell: js.Any, backwards: js.Any): js.Any = js.native
    
    /* private */ def moveToNextCellNotEditing(previousRenderedCell: js.Any, backwards: js.Any): js.Any = js.native
    
    /* private */ def moveToNextEditingCell(previousRenderedCell: js.Any, backwards: js.Any): js.Any = js.native
    
    /* private */ def moveToNextEditingRow(previousRenderedCell: js.Any, backwards: js.Any): js.Any = js.native
    
    def navigateToNextCell(event: KeyboardEvent, key: Double, previousCell: GridCell, allowUserOverride: Boolean): Unit = js.native
    
    /* private */ def onDisplayedColumnsChanged(): js.Any = js.native
    
    /* private */ def onModelUpdated(refreshEvent: js.Any): js.Any = js.native
    
    /* private */ def onPageLoaded(refreshEvent: js.Any): js.Any = js.native
    
    /* private */ def onPinnedRowDataChanged(): js.Any = js.native
    
    def onTabKeyDown(previousRenderedCell: CellComp, keyboardEvent: KeyboardEvent): Unit = js.native
    
    /* private */ var paginationProxy: js.Any = js.native
    
    /* private */ var pinnedRowModel: js.Any = js.native
    
    /* private */ var pinningLeft: js.Any = js.native
    
    /* private */ var pinningRight: js.Any = js.native
    
    /* private */ var rangeController: js.Any = js.native
    
    /* private */ def redraw(rowsToRecycle: js.Any, animate: js.Any, afterScroll: js.Any): js.Any = js.native
    
    def redrawAfterModelUpdate(): Unit = js.native
    def redrawAfterModelUpdate(params: RefreshViewParams): Unit = js.native
    
    def redrawAfterScroll(): Unit = js.native
    
    /* private */ def redrawFullWidthEmbeddedRows(): js.Any = js.native
    
    def redrawRows(rowNodes: js.Array[RowNode]): Unit = js.native
    
    def refreshCells(): Unit = js.native
    def refreshCells(params: RefreshCellsParams): Unit = js.native
    
    def refreshFloatingRowComps(): Unit = js.native
    
    /* private */ def refreshFloatingRows(
      rowComps: js.Any,
      rowNodes: js.Any,
      pinnedLeftContainerComp: js.Any,
      pinnedRightContainerComp: js.Any,
      bodyContainerComp: js.Any,
      fullWidthContainerComp: js.Any
    ): js.Any = js.native
    
    /* private */ var refreshInProgress: js.Any = js.native
    
    def registerGridComp(gridPanel: GridPanel): Unit = js.native
    
    /* private */ def releaseLockOnRefresh(): js.Any = js.native
    
    /* private */ def removeRowComps(rowsToRemove: js.Any): js.Any = js.native
    
    /* private */ def removeRowCompsNotToDraw(indexesToDraw: js.Any): js.Any = js.native
    
    /* private */ def restoreFocusedCell(gridCell: js.Any): js.Any = js.native
    
    /* private */ var rowCompsByIndex: js.Any = js.native
    
    /* private */ var rowContainers: js.Any = js.native
    
    /* private */ def scrollToTopIfNewData(params: js.Any): js.Any = js.native
    
    /* private */ def sizeContainerToPageHeight(): js.Any = js.native
    
    def startEditingCell(gridCell: GridCell, keyPress: Double, charPress: String): Unit = js.native
    
    def stopEditing(): Unit = js.native
    def stopEditing(cancel: Boolean): Unit = js.native
    
    def tabToNextCell(backwards: Boolean): Boolean = js.native
    
    /* private */ var templateService: js.Any = js.native
    
    /* private */ var valueService: js.Any = js.native
    
    /* private */ def workOutFirstAndLastRowsToRender(): js.Any = js.native
  }
  
  trait RefreshViewParams extends StObject {
    
    var animate: js.UndefOr[Boolean] = js.undefined
    
    var newData: js.UndefOr[Boolean] = js.undefined
    
    var newPage: js.UndefOr[Boolean] = js.undefined
    
    var onlyBody: js.UndefOr[Boolean] = js.undefined
    
    var recycleRows: js.UndefOr[Boolean] = js.undefined
    
    var suppressKeepFocus: js.UndefOr[Boolean] = js.undefined
  }
  object RefreshViewParams {
    
    inline def apply(): RefreshViewParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RefreshViewParams]
    }
    
    extension [Self <: RefreshViewParams](x: Self) {
      
      inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      inline def setNewData(value: Boolean): Self = StObject.set(x, "newData", value.asInstanceOf[js.Any])
      
      inline def setNewDataUndefined: Self = StObject.set(x, "newData", js.undefined)
      
      inline def setNewPage(value: Boolean): Self = StObject.set(x, "newPage", value.asInstanceOf[js.Any])
      
      inline def setNewPageUndefined: Self = StObject.set(x, "newPage", js.undefined)
      
      inline def setOnlyBody(value: Boolean): Self = StObject.set(x, "onlyBody", value.asInstanceOf[js.Any])
      
      inline def setOnlyBodyUndefined: Self = StObject.set(x, "onlyBody", js.undefined)
      
      inline def setRecycleRows(value: Boolean): Self = StObject.set(x, "recycleRows", value.asInstanceOf[js.Any])
      
      inline def setRecycleRowsUndefined: Self = StObject.set(x, "recycleRows", js.undefined)
      
      inline def setSuppressKeepFocus(value: Boolean): Self = StObject.set(x, "suppressKeepFocus", value.asInstanceOf[js.Any])
      
      inline def setSuppressKeepFocusUndefined: Self = StObject.set(x, "suppressKeepFocus", js.undefined)
    }
  }
}
