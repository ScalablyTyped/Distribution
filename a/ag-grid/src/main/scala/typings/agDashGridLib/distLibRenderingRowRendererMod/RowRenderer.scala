package typings
package agDashGridLib.distLibRenderingRowRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rendering/rowRenderer", "RowRenderer")
@js.native
class RowRenderer ()
  extends agDashGridLib.distLibContextBeanStubMod.BeanStub {
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
  def addRenderedRowListener(eventName: java.lang.String, rowIndex: scala.Double, callback: js.Function): scala.Unit = js.native
  def agWire(loggerFactory: agDashGridLib.distLibLoggerMod.LoggerFactory): scala.Unit = js.native
  /* private */ def binRowComps(recycleRows: js.Any): js.Any = js.native
  /* private */ def calculateIndexesToDraw(): js.Any = js.native
  /* private */ def checkAngularCompile(): js.Any = js.native
  /* private */ def createOrUpdateRowComp(rowIndex: js.Any, rowsToRecycle: js.Any, animate: js.Any, afterScroll: js.Any): js.Any = js.native
  /* private */ def createRowComp(rowNode: js.Any, animate: js.Any, afterScroll: js.Any): js.Any = js.native
  /* private */ def destroyRowComps(rowCompsMap: js.Any, animate: js.Any): js.Any = js.native
  def ensureCellVisible(gridCell: agDashGridLib.distLibEntitiesGridCellMod.GridCell): scala.Unit = js.native
  /* private */ def findNextCellToFocusOn(gridCell: js.Any, backwards: js.Any, startEditing: js.Any): js.Any = js.native
  def flashCells(): scala.Unit = js.native
  def flashCells(params: agDashGridLib.distLibGridApiMod.FlashCellsParams): scala.Unit = js.native
  /* private */ def flushContainers(rowComps: js.Any): js.Any = js.native
  def forEachCellComp(
    callback: js.Function1[/* cellComp */ agDashGridLib.distLibRenderingCellCompMod.CellComp, scala.Unit]
  ): scala.Unit = js.native
  /* private */ def forEachCellCompFiltered(rowNodes: js.Any, columns: js.Any, callback: js.Any): js.Any = js.native
  /* private */ def forEachRowComp(callback: js.Any): js.Any = js.native
  def getAllCellsForColumn(column: agDashGridLib.distLibEntitiesColumnMod.Column): js.Array[stdLib.HTMLElement] = js.native
  def getCellEditorInstances(params: agDashGridLib.distLibGridApiMod.GetCellRendererInstancesParams): js.Array[agDashGridLib.distLibRenderingCellEditorsICellEditorMod.ICellEditorComp] = js.native
  def getCellRendererInstances(params: agDashGridLib.distLibGridApiMod.GetCellRendererInstancesParams): js.Array[agDashGridLib.distLibRenderingCellRenderersICellRendererMod.ICellRendererComp] = js.native
  /* private */ def getCellToRestoreFocusToAfterRefresh(params: js.Any): js.Any = js.native
  /* private */ def getComponentForCell(gridCell: js.Any): js.Any = js.native
  def getEditingCells(): js.Array[agDashGridLib.distLibEntitiesGridCellMod.GridCellDef] = js.native
  def getFirstVirtualRenderedRow(): scala.Double = js.native
  def getLastVirtualRenderedRow(): scala.Double = js.native
  /* private */ def getLockOnRefresh(): js.Any = js.native
  /* private */ def getRenderedIndexesForRowNodes(rowNodes: js.Any): js.Any = js.native
  def getRenderedNodes(): js.Array[agDashGridLib.distLibEntitiesRowNodeMod.RowNode] = js.native
  /* private */ def keepRowBecauseEditing(rowComp: js.Any): js.Any = js.native
  /* private */ def moveEditToNextCellOrRow(previousRenderedCell: js.Any, nextRenderedCell: js.Any): js.Any = js.native
  /* private */ def moveToCellAfter(previousRenderedCell: js.Any, backwards: js.Any): js.Any = js.native
  /* private */ def moveToNextCellNotEditing(previousRenderedCell: js.Any, backwards: js.Any): js.Any = js.native
  /* private */ def moveToNextEditingCell(previousRenderedCell: js.Any, backwards: js.Any): js.Any = js.native
  /* private */ def moveToNextEditingRow(previousRenderedCell: js.Any, backwards: js.Any): js.Any = js.native
  def navigateToNextCell(
    event: stdLib.KeyboardEvent,
    key: scala.Double,
    previousCell: agDashGridLib.distLibEntitiesGridCellMod.GridCell,
    allowUserOverride: scala.Boolean
  ): scala.Unit = js.native
  /* private */ def onDisplayedColumnsChanged(): js.Any = js.native
  /* private */ def onModelUpdated(refreshEvent: js.Any): js.Any = js.native
  /* private */ def onPageLoaded(): js.Any = js.native
  /* private */ def onPageLoaded(refreshEvent: js.Any): js.Any = js.native
  /* private */ def onPinnedRowDataChanged(): js.Any = js.native
  def onTabKeyDown(
    previousRenderedCell: agDashGridLib.distLibRenderingCellCompMod.CellComp,
    keyboardEvent: stdLib.KeyboardEvent
  ): scala.Unit = js.native
  /* private */ def redraw(): js.Any = js.native
  /* private */ def redraw(rowsToRecycle: js.Any): js.Any = js.native
  /* private */ def redraw(rowsToRecycle: js.Any, animate: js.Any): js.Any = js.native
  /* private */ def redraw(rowsToRecycle: js.Any, animate: js.Any, afterScroll: js.Any): js.Any = js.native
  def redrawAfterModelUpdate(): scala.Unit = js.native
  def redrawAfterModelUpdate(params: RefreshViewParams): scala.Unit = js.native
  def redrawAfterScroll(): scala.Unit = js.native
  /* private */ def redrawFullWidthEmbeddedRows(): js.Any = js.native
  def redrawRows(rowNodes: js.Array[agDashGridLib.distLibEntitiesRowNodeMod.RowNode]): scala.Unit = js.native
  def refreshCells(): scala.Unit = js.native
  def refreshCells(params: agDashGridLib.distLibGridApiMod.RefreshCellsParams): scala.Unit = js.native
  def refreshFloatingRowComps(): scala.Unit = js.native
  /* private */ def refreshFloatingRows(
    rowComps: js.Any,
    rowNodes: js.Any,
    pinnedLeftContainerComp: js.Any,
    pinnedRightContainerComp: js.Any,
    bodyContainerComp: js.Any,
    fullWidthContainerComp: js.Any
  ): js.Any = js.native
  def registerGridComp(gridPanel: agDashGridLib.distLibGridPanelGridPanelMod.GridPanel): scala.Unit = js.native
  /* private */ def releaseLockOnRefresh(): js.Any = js.native
  /* private */ def removeRowComps(rowsToRemove: js.Any): js.Any = js.native
  /* private */ def removeRowCompsNotToDraw(indexesToDraw: js.Any): js.Any = js.native
  /* private */ def restoreFocusedCell(gridCell: js.Any): js.Any = js.native
  /* private */ def scrollToTopIfNewData(params: js.Any): js.Any = js.native
  /* private */ def sizeContainerToPageHeight(): js.Any = js.native
  def startEditingCell(
    gridCell: agDashGridLib.distLibEntitiesGridCellMod.GridCell,
    keyPress: scala.Double,
    charPress: java.lang.String
  ): scala.Unit = js.native
  def stopEditing(): scala.Unit = js.native
  def stopEditing(cancel: scala.Boolean): scala.Unit = js.native
  def tabToNextCell(backwards: scala.Boolean): scala.Boolean = js.native
  /* private */ def workOutFirstAndLastRowsToRender(): js.Any = js.native
}

