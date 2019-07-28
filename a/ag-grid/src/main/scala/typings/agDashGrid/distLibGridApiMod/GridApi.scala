package typings.agDashGrid.distLibGridApiMod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.agDashGrid.Anon_ColId
import typings.agDashGrid.distLibAlignedGridsServiceMod.AlignedGridsService
import typings.agDashGrid.distLibEntitiesColDefMod.ColDef
import typings.agDashGrid.distLibEntitiesColDefMod.ColGroupDef
import typings.agDashGrid.distLibEntitiesColDefMod.IAggFunc
import typings.agDashGrid.distLibEntitiesColumnMod.Column
import typings.agDashGrid.distLibEntitiesGridCellMod.GridCell
import typings.agDashGrid.distLibEntitiesGridCellMod.GridCellDef
import typings.agDashGrid.distLibEntitiesRowNodeMod.RowNode
import typings.agDashGrid.distLibEventsMod.AgEvent
import typings.agDashGrid.distLibEventsMod.ColumnEventType
import typings.agDashGrid.distLibExportParamsMod.CsvExportParams
import typings.agDashGrid.distLibGridPanelGridPanelMod.GridPanel
import typings.agDashGrid.distLibHeaderRenderingHeaderRootCompMod.HeaderRootComp
import typings.agDashGrid.distLibInterfacesIExcelCreatorMod.ExcelExportParams
import typings.agDashGrid.distLibInterfacesIFilterMod.IFilterComp
import typings.agDashGrid.distLibInterfacesIRangeControllerMod.AddRangeSelectionParams
import typings.agDashGrid.distLibInterfacesIRangeControllerMod.RangeSelection
import typings.agDashGrid.distLibInterfacesIRowModelMod.IRowModel
import typings.agDashGrid.distLibInterfacesIServerSideDatasourceMod.IServerSideDatasource
import typings.agDashGrid.distLibInterfacesIViewportDatasourceMod.IViewportDatasource
import typings.agDashGrid.distLibRenderingCellEditorsICellEditorMod.ICellEditorComp
import typings.agDashGrid.distLibRenderingCellRenderersICellRendererMod.ICellRendererComp
import typings.agDashGrid.distLibRowModelsClientSideClientSideRowModelMod.RowDataTransaction
import typings.agDashGrid.distLibRowModelsClientSideClientSideRowModelMod.RowNodeTransaction
import typings.agDashGrid.distLibRowModelsIDatasourceMod.IDatasource
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.Touch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/gridApi", "GridApi")
@js.native
class GridApi () extends js.Object {
  var aggFuncService: js.Any = js.native
  var alignedGridsService: js.Any = js.native
  var animationFrameService: js.Any = js.native
  var cellEditorFactory: js.Any = js.native
  var cellRendererFactory: js.Any = js.native
  var clientSideRowModel: js.Any = js.native
  var clipboardService: js.Any = js.native
  var columnController: js.Any = js.native
  var context: js.Any = js.native
  var contextMenuFactory: js.Any = js.native
  var csvCreator: js.Any = js.native
  var detailGridInfoMap: js.Any = js.native
  var eventService: js.Any = js.native
  var excelCreator: js.Any = js.native
  var filterManager: js.Any = js.native
  var focusedCellController: js.Any = js.native
  var gridCore: js.Any = js.native
  var gridOptionsWrapper: js.Any = js.native
  var gridPanel: js.Any = js.native
  var headerRootComp: js.Any = js.native
  var immutableService: js.Any = js.native
  var infinitePageRowModel: js.Any = js.native
  var menuFactory: js.Any = js.native
  var paginationProxy: js.Any = js.native
  var pinnedRowModel: js.Any = js.native
  var rangeController: js.Any = js.native
  var rowModel: js.Any = js.native
  var rowRenderer: js.Any = js.native
  var selectionController: js.Any = js.native
  var serverSideRowModel: js.Any = js.native
  var sortController: js.Any = js.native
  var toolPanelComp: js.Any = js.native
  var valueCache: js.Any = js.native
  var valueService: js.Any = js.native
  /** Used internally by grid. Not intended to be used by the client. Interface may change between releases. */
  def __getAlignedGridService(): AlignedGridsService = js.native
  def addAggFunc(key: String, aggFunc: IAggFunc): Unit = js.native
  def addAggFuncs(aggFuncs: StringDictionary[IAggFunc]): Unit = js.native
  def addDetailGridInfo(id: String, gridInfo: DetailGridInfo): Unit = js.native
  def addEventListener(eventType: String, listener: js.Function): Unit = js.native
  def addGlobalListener(listener: js.Function): Unit = js.native
  def addItems(items: js.Array[_]): Unit = js.native
  def addItems(items: js.Array[_], skipRefresh: Boolean): Unit = js.native
  def addRangeSelection(rangeSelection: AddRangeSelectionParams): Unit = js.native
  def addRenderedRowListener(eventName: String, rowIndex: Double, callback: js.Function): Unit = js.native
  def addVirtualRowListener(eventName: String, rowIndex: Double, callback: js.Function): Unit = js.native
  def batchUpdateRowData(rowDataTransaction: RowDataTransaction): Unit = js.native
  def batchUpdateRowData(rowDataTransaction: RowDataTransaction, callback: js.Function1[/* res */ RowNodeTransaction, Unit]): Unit = js.native
  def camelCaseToHumanReadable(camelCase: String): String = js.native
  def checkGridSize(): Unit = js.native
  def clearAggFuncs(): Unit = js.native
  def clearFocusedCell(): Unit = js.native
  def clearRangeSelection(): Unit = js.native
  def collapseAll(): Unit = js.native
  def copySelectedRangeDown(): Unit = js.native
  def copySelectedRangeToClipboard(includeHeader: Boolean): Unit = js.native
  def copySelectedRowsToClipboard(includeHeader: Boolean): Unit = js.native
  def copySelectedRowsToClipboard(includeHeader: Boolean, columnKeys: js.Array[String | Column]): Unit = js.native
  def deselectAll(): Unit = js.native
  def deselectAllFiltered(): Unit = js.native
  def deselectIndex(index: Double): Unit = js.native
  def deselectIndex(index: Double, suppressEvents: Boolean): Unit = js.native
  def deselectNode(node: RowNode): Unit = js.native
  def deselectNode(node: RowNode, suppressEvents: Boolean): Unit = js.native
  def destroy(): Unit = js.native
  def destroyFilter(key: String): Unit = js.native
  def destroyFilter(key: Column): Unit = js.native
  def dispatchEvent(event: AgEvent): Unit = js.native
  def doLayout(): Unit = js.native
  def ensureColIndexVisible(index: js.Any): Unit = js.native
  def ensureColumnVisible(key: String): Unit = js.native
  def ensureColumnVisible(key: Column): Unit = js.native
  def ensureIndexVisible(index: js.Any): Unit = js.native
  def ensureIndexVisible(index: js.Any, position: String): Unit = js.native
  def ensureNodeVisible(comparator: js.Any): Unit = js.native
  def ensureNodeVisible(comparator: js.Any, position: String): Unit = js.native
  def expandAll(): Unit = js.native
  def expireValueCache(): Unit = js.native
  def exportDataAsCsv(): Unit = js.native
  def exportDataAsCsv(params: CsvExportParams): Unit = js.native
  def exportDataAsExcel(): Unit = js.native
  def exportDataAsExcel(params: ExcelExportParams): Unit = js.native
  def flashCells(): Unit = js.native
  def flashCells(params: FlashCellsParams): Unit = js.native
  def forEachDetailGridInfo(callback: js.Function2[/* gridInfo */ DetailGridInfo, /* index */ Double, Unit]): Unit = js.native
  def forEachLeafNode(callback: js.Function1[/* rowNode */ RowNode, Unit]): Unit = js.native
  def forEachNode(callback: js.Function1[/* rowNode */ RowNode, Unit]): Unit = js.native
  def forEachNodeAfterFilter(callback: js.Function1[/* rowNode */ RowNode, Unit]): Unit = js.native
  def forEachNodeAfterFilterAndSort(callback: js.Function1[/* rowNode */ RowNode, Unit]): Unit = js.native
  def getBestCostNodeSelection(): js.Any = js.native
  def getCacheBlockState(): js.Any = js.native
  def getCellEditorInstances(): js.Array[ICellEditorComp] = js.native
  def getCellEditorInstances(params: GetCellEditorInstancesParams): js.Array[ICellEditorComp] = js.native
  def getCellRendererInstances(): js.Array[ICellRendererComp] = js.native
  def getCellRendererInstances(params: GetCellRendererInstancesParams): js.Array[ICellRendererComp] = js.native
  def getColumnDef(key: String): ColDef = js.native
  def getColumnDef(key: Column): ColDef = js.native
  def getDataAsCsv(): String = js.native
  def getDataAsCsv(params: CsvExportParams): String = js.native
  def getDataAsExcel(): String = js.native
  def getDataAsExcel(params: ExcelExportParams): String = js.native
  def getDetailGridInfo(id: String): DetailGridInfo = js.native
  def getDisplayedRowAtIndex(index: Double): RowNode = js.native
  def getDisplayedRowCount(): Double = js.native
  def getEditingCells(): js.Array[GridCellDef] = js.native
  def getFilterApi(key: String): IFilterComp = js.native
  def getFilterApi(key: Column): IFilterComp = js.native
  def getFilterApiForColDef(colDef: js.Any): js.Any = js.native
  def getFilterInstance(key: String): IFilterComp = js.native
  def getFilterInstance(key: Column): IFilterComp = js.native
  def getFilterModel(): js.Any = js.native
  def getFirstDisplayedRow(): Double = js.native
  def getFirstRenderedRow(): Double = js.native
  def getFloatingBottomRow(index: Double): RowNode = js.native
  def getFloatingBottomRowCount(): Double = js.native
  def getFloatingTopRow(index: Double): RowNode = js.native
  def getFloatingTopRowCount(): Double = js.native
  def getFocusedCell(): GridCell = js.native
  def getInfinitePageState(): js.Any = js.native
  def getInfiniteRowCount(): Double = js.native
  def getLastDisplayedRow(): Double = js.native
  def getLastRenderedRow(): Double = js.native
  def getModel(): IRowModel = js.native
  def getPinnedBottomRow(index: Double): RowNode = js.native
  def getPinnedBottomRowCount(): Double = js.native
  def getPinnedTopRow(index: Double): RowNode = js.native
  def getPinnedTopRowCount(): Double = js.native
  def getPreferredWidth(): Double = js.native
  def getRangeSelections(): js.Array[RangeSelection] = js.native
  def getRenderedNodes(): js.Array[RowNode] = js.native
  def getRowNode(id: String): RowNode = js.native
  def getSelectedNodes(): js.Array[RowNode] = js.native
  def getSelectedNodesById(): NumberDictionary[RowNode] = js.native
  def getSelectedRows(): js.Array[_] = js.native
  def getSortModel(): js.Array[Anon_ColId] = js.native
  def getValue(colKey: String, rowNode: RowNode): js.Any = js.native
  def getValue(colKey: Column, rowNode: RowNode): js.Any = js.native
  def getVerticalPixelRange(): js.Any = js.native
  def getVirtualPageState(): js.Any = js.native
  def getVirtualRowCount(): Double = js.native
  def hideOverlay(): Unit = js.native
  def hidePopupMenu(): Unit = js.native
  /* private */ def init(): js.Any = js.native
  def insertItemsAtIndex(index: Double, items: js.Array[_]): Unit = js.native
  def insertItemsAtIndex(index: Double, items: js.Array[_], skipRefresh: Boolean): Unit = js.native
  def isAdvancedFilterPresent(): Boolean = js.native
  def isAnimationFrameQueueEmpty(): Boolean = js.native
  def isAnyFilterPresent(): Boolean = js.native
  def isMaxRowFound(): Boolean = js.native
  def isNodeSelected(node: js.Any): js.Any = js.native
  def isQuickFilterPresent(): Boolean = js.native
  def isToolPanelShowing(): Boolean = js.native
  def onFilterChanged(): Unit = js.native
  def onGroupExpandedOrCollapsed(): Unit = js.native
  def onGroupExpandedOrCollapsed(deprecated_refreshFromIndex: js.Any): Unit = js.native
  def onRowHeightChanged(): Unit = js.native
  def onSortChanged(): Unit = js.native
  def paginationGetCurrentPage(): Double = js.native
  def paginationGetPageSize(): Double = js.native
  def paginationGetRowCount(): Double = js.native
  def paginationGetTotalPages(): Double = js.native
  def paginationGoToFirstPage(): Unit = js.native
  def paginationGoToLastPage(): Unit = js.native
  def paginationGoToNextPage(): Unit = js.native
  def paginationGoToPage(page: Double): Unit = js.native
  def paginationGoToPreviousPage(): Unit = js.native
  def paginationIsLastPageFound(): Boolean = js.native
  def paginationSetPageSize(size: Double): Unit = js.native
  def purgeEnterpriseCache(): Unit = js.native
  def purgeEnterpriseCache(route: js.Array[String]): Unit = js.native
  def purgeInfiniteCache(): Unit = js.native
  def purgeInfinitePageCache(): Unit = js.native
  def purgeServerSideCache(): Unit = js.native
  def purgeServerSideCache(route: js.Array[String]): Unit = js.native
  def purgeVirtualPageCache(): Unit = js.native
  def recomputeAggregates(): Unit = js.native
  def redrawRows(): Unit = js.native
  def redrawRows(params: RedrawRowsParams): Unit = js.native
  def refreshCells(): Unit = js.native
  def refreshCells(params: RefreshCellsParams): Unit = js.native
  def refreshClientSideRowModel(): js.Any = js.native
  def refreshClientSideRowModel(step: String): js.Any = js.native
  def refreshGroupRows(): Unit = js.native
  def refreshHeader(): Unit = js.native
  def refreshInMemoryRowModel(): js.Any = js.native
  def refreshInMemoryRowModel(step: String): js.Any = js.native
  def refreshInfiniteCache(): Unit = js.native
  def refreshInfinitePageCache(): Unit = js.native
  def refreshRows(rowNodes: js.Array[RowNode]): Unit = js.native
  def refreshToolPanel(): Unit = js.native
  def refreshView(): Unit = js.native
  def refreshVirtualPageCache(): Unit = js.native
  def registerGridComp(gridPanel: GridPanel): Unit = js.native
  def registerHeaderRootComp(headerRootComp: HeaderRootComp): Unit = js.native
  def removeDetailGridInfo(id: String): Unit = js.native
  def removeEventListener(eventType: String, listener: js.Function): Unit = js.native
  def removeGlobalListener(listener: js.Function): Unit = js.native
  def removeItems(rowNodes: js.Array[RowNode]): Unit = js.native
  def removeItems(rowNodes: js.Array[RowNode], skipRefresh: Boolean): Unit = js.native
  def resetQuickFilter(): Unit = js.native
  def resetRowHeights(): Unit = js.native
  def rowDataChanged(rows: js.Any): Unit = js.native
  def selectAll(): Unit = js.native
  def selectAllFiltered(): Unit = js.native
  def selectIndex(index: js.Any, tryMulti: js.Any, suppressEvents: js.Any): Unit = js.native
  def selectNode(node: RowNode): Unit = js.native
  def selectNode(node: RowNode, tryMulti: Boolean): Unit = js.native
  def selectNode(node: RowNode, tryMulti: Boolean, suppressEvents: Boolean): Unit = js.native
  def setColumnDefs(colDefs: js.Array[ColDef | ColGroupDef]): Unit = js.native
  def setColumnDefs(colDefs: js.Array[ColDef | ColGroupDef], source: ColumnEventType): Unit = js.native
  def setDatasource(datasource: IDatasource): Unit = js.native
  def setEnterpriseDatasource(datasource: IServerSideDatasource): Unit = js.native
  def setFilterModel(model: js.Any): Unit = js.native
  def setFloatingBottomRowData(rows: js.Array[_]): Unit = js.native
  def setFloatingFiltersHeight(headerHeight: Double): Unit = js.native
  def setFloatingTopRowData(rows: js.Array[_]): Unit = js.native
  def setFocusedCell(rowIndex: Double, colKey: String): Unit = js.native
  def setFocusedCell(rowIndex: Double, colKey: String, floating: String): Unit = js.native
  def setFocusedCell(rowIndex: Double, colKey: Column): Unit = js.native
  def setFocusedCell(rowIndex: Double, colKey: Column, floating: String): Unit = js.native
  def setFunctionsReadOnly(readOnly: Boolean): Unit = js.native
  def setGridAutoHeight(gridAutoHeight: Boolean): Unit = js.native
  def setGroupHeaderHeight(headerHeight: Double): Unit = js.native
  def setGroupRemoveLowestSingleChildren(value: Boolean): Unit = js.native
  def setGroupRemoveSingleChildren(value: Boolean): Unit = js.native
  def setHeaderHeight(headerHeight: Double): Unit = js.native
  def setInfiniteRowCount(rowCount: Double): Unit = js.native
  def setInfiniteRowCount(rowCount: Double, maxRowFound: Boolean): Unit = js.native
  def setPinnedBottomRowData(rows: js.Array[_]): Unit = js.native
  def setPinnedTopRowData(rows: js.Array[_]): Unit = js.native
  def setPivotGroupHeaderHeight(headerHeight: Double): Unit = js.native
  def setPivotHeaderHeight(headerHeight: Double): Unit = js.native
  def setPopupParent(ePopupParent: HTMLElement): Unit = js.native
  def setQuickFilter(newFilter: js.Any): Unit = js.native
  def setRowData(rowData: js.Array[_]): Unit = js.native
  def setServerSideDatasource(datasource: IServerSideDatasource): Unit = js.native
  def setSortModel(sortModel: js.Any): Unit = js.native
  def setSortModel(sortModel: js.Any, source: ColumnEventType): Unit = js.native
  def setSuppressClipboardPaste(value: Boolean): Unit = js.native
  def setSuppressRowDrag(value: Boolean): Unit = js.native
  def setViewportDatasource(viewportDatasource: IViewportDatasource): Unit = js.native
  def setVirtualRowCount(rowCount: Double): Unit = js.native
  def setVirtualRowCount(rowCount: Double, maxRowFound: Boolean): Unit = js.native
  def showColumnMenuAfterButtonClick(colKey: String, buttonElement: HTMLElement): Unit = js.native
  def showColumnMenuAfterButtonClick(colKey: Column, buttonElement: HTMLElement): Unit = js.native
  def showColumnMenuAfterMouseClick(colKey: String, mouseEvent: MouseEvent): Unit = js.native
  def showColumnMenuAfterMouseClick(colKey: String, mouseEvent: Touch): Unit = js.native
  def showColumnMenuAfterMouseClick(colKey: Column, mouseEvent: MouseEvent): Unit = js.native
  def showColumnMenuAfterMouseClick(colKey: Column, mouseEvent: Touch): Unit = js.native
  def showLoadingOverlay(): Unit = js.native
  def showNoRowsOverlay(): Unit = js.native
  def showToolPanel(show: js.Any): Unit = js.native
  def sizeColumnsToFit(): Unit = js.native
  def softRefreshView(): Unit = js.native
  def startEditingCell(params: StartEditingCellParams): Unit = js.native
  def stopEditing(): Unit = js.native
  def stopEditing(cancel: Boolean): Unit = js.native
  def tabToNextCell(): Boolean = js.native
  def tabToPreviousCell(): Boolean = js.native
  def timeFullRedraw(): Unit = js.native
  def timeFullRedraw(count: Double): Unit = js.native
  def updateRowData(rowDataTransaction: RowDataTransaction): RowNodeTransaction = js.native
}

