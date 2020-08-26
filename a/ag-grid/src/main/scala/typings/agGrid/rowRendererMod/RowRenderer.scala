package typings.agGrid.rowRendererMod

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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rendering/rowRenderer", "RowRenderer")
@js.native
class RowRenderer () extends BeanStub {
  @JSName("$scope")
  var $scope: js.Any = js.native
  var animationFrameService: js.Any = js.native
  var beans: js.Any = js.native
  var cellNavigationService: js.Any = js.native
  var columnApi: js.Any = js.native
  var columnController: js.Any = js.native
  var context: js.Any = js.native
  var eventService: js.Any = js.native
  var expressionService: js.Any = js.native
  var firstRenderedRow: js.Any = js.native
  var floatingBottomRowComps: js.Any = js.native
  var floatingTopRowComps: js.Any = js.native
  var focusedCellController: js.Any = js.native
  var gridApi: js.Any = js.native
  var gridCore: js.Any = js.native
  var gridOptionsWrapper: js.Any = js.native
  var gridPanel: js.Any = js.native
  var heightScaler: js.Any = js.native
  var lastRenderedRow: js.Any = js.native
  var logger: js.Any = js.native
  var loggerFactory: js.Any = js.native
  var paginationProxy: js.Any = js.native
  var pinnedRowModel: js.Any = js.native
  var pinningLeft: js.Any = js.native
  var pinningRight: js.Any = js.native
  var rangeController: js.Any = js.native
  var refreshInProgress: js.Any = js.native
  var rowCompsByIndex: js.Any = js.native
  var rowContainers: js.Any = js.native
  var templateService: js.Any = js.native
  var valueService: js.Any = js.native
  def addRenderedRowListener(eventName: String, rowIndex: Double, callback: js.Function): Unit = js.native
  def agWire(loggerFactory: LoggerFactory): Unit = js.native
  /* private */ def binRowComps(recycleRows: js.Any): js.Any = js.native
  /* private */ def calculateIndexesToDraw(): js.Any = js.native
  /* private */ def checkAngularCompile(): js.Any = js.native
  /* private */ def createOrUpdateRowComp(rowIndex: js.Any, rowsToRecycle: js.Any, animate: js.Any, afterScroll: js.Any): js.Any = js.native
  /* private */ def createRowComp(rowNode: js.Any, animate: js.Any, afterScroll: js.Any): js.Any = js.native
  /* private */ def destroyRowComps(rowCompsMap: js.Any, animate: js.Any): js.Any = js.native
  def ensureCellVisible(gridCell: GridCell): Unit = js.native
  /* private */ def findNextCellToFocusOn(gridCell: js.Any, backwards: js.Any, startEditing: js.Any): js.Any = js.native
  def flashCells(): Unit = js.native
  def flashCells(params: FlashCellsParams): Unit = js.native
  /* private */ def flushContainers(rowComps: js.Any): js.Any = js.native
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
  /* private */ def keepRowBecauseEditing(rowComp: js.Any): js.Any = js.native
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
  def registerGridComp(gridPanel: GridPanel): Unit = js.native
  /* private */ def releaseLockOnRefresh(): js.Any = js.native
  /* private */ def removeRowComps(rowsToRemove: js.Any): js.Any = js.native
  /* private */ def removeRowCompsNotToDraw(indexesToDraw: js.Any): js.Any = js.native
  /* private */ def restoreFocusedCell(gridCell: js.Any): js.Any = js.native
  /* private */ def scrollToTopIfNewData(params: js.Any): js.Any = js.native
  /* private */ def sizeContainerToPageHeight(): js.Any = js.native
  def startEditingCell(gridCell: GridCell, keyPress: Double, charPress: String): Unit = js.native
  def stopEditing(): Unit = js.native
  def stopEditing(cancel: Boolean): Unit = js.native
  def tabToNextCell(backwards: Boolean): Boolean = js.native
  /* private */ def workOutFirstAndLastRowsToRender(): js.Any = js.native
}

