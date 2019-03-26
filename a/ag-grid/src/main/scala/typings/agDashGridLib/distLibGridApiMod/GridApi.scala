package typings
package agDashGridLib.distLibGridApiMod

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
  def __getAlignedGridService(): agDashGridLib.distLibAlignedGridsServiceMod.AlignedGridsService = js.native
  def addAggFunc(key: java.lang.String, aggFunc: agDashGridLib.distLibEntitiesColDefMod.IAggFunc): scala.Unit = js.native
  def addAggFuncs(
    aggFuncs: org.scalablytyped.runtime.StringDictionary[agDashGridLib.distLibEntitiesColDefMod.IAggFunc]
  ): scala.Unit = js.native
  def addDetailGridInfo(id: java.lang.String, gridInfo: DetailGridInfo): scala.Unit = js.native
  def addEventListener(eventType: java.lang.String, listener: js.Function): scala.Unit = js.native
  def addGlobalListener(listener: js.Function): scala.Unit = js.native
  def addItems(items: js.Array[_]): scala.Unit = js.native
  def addItems(items: js.Array[_], skipRefresh: scala.Boolean): scala.Unit = js.native
  def addRangeSelection(rangeSelection: agDashGridLib.distLibInterfacesIRangeControllerMod.AddRangeSelectionParams): scala.Unit = js.native
  def addRenderedRowListener(eventName: java.lang.String, rowIndex: scala.Double, callback: js.Function): scala.Unit = js.native
  def addVirtualRowListener(eventName: java.lang.String, rowIndex: scala.Double, callback: js.Function): scala.Unit = js.native
  def batchUpdateRowData(
    rowDataTransaction: agDashGridLib.distLibRowModelsClientSideClientSideRowModelMod.RowDataTransaction
  ): scala.Unit = js.native
  def batchUpdateRowData(
    rowDataTransaction: agDashGridLib.distLibRowModelsClientSideClientSideRowModelMod.RowDataTransaction,
    callback: js.Function1[
      /* res */ agDashGridLib.distLibRowModelsClientSideClientSideRowModelMod.RowNodeTransaction, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def camelCaseToHumanReadable(camelCase: java.lang.String): java.lang.String = js.native
  def checkGridSize(): scala.Unit = js.native
  def clearAggFuncs(): scala.Unit = js.native
  def clearFocusedCell(): scala.Unit = js.native
  def clearRangeSelection(): scala.Unit = js.native
  def collapseAll(): scala.Unit = js.native
  def copySelectedRangeDown(): scala.Unit = js.native
  def copySelectedRangeToClipboard(includeHeader: scala.Boolean): scala.Unit = js.native
  def copySelectedRowsToClipboard(includeHeader: scala.Boolean): scala.Unit = js.native
  def copySelectedRowsToClipboard(
    includeHeader: scala.Boolean,
    columnKeys: js.Array[java.lang.String | agDashGridLib.distLibEntitiesColumnMod.Column]
  ): scala.Unit = js.native
  def deselectAll(): scala.Unit = js.native
  def deselectAllFiltered(): scala.Unit = js.native
  def deselectIndex(index: scala.Double): scala.Unit = js.native
  def deselectIndex(index: scala.Double, suppressEvents: scala.Boolean): scala.Unit = js.native
  def deselectNode(node: agDashGridLib.distLibEntitiesRowNodeMod.RowNode): scala.Unit = js.native
  def deselectNode(node: agDashGridLib.distLibEntitiesRowNodeMod.RowNode, suppressEvents: scala.Boolean): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def destroyFilter(key: agDashGridLib.distLibEntitiesColumnMod.Column): scala.Unit = js.native
  def destroyFilter(key: java.lang.String): scala.Unit = js.native
  def dispatchEvent(event: agDashGridLib.distLibEventsMod.AgEvent): scala.Unit = js.native
  def doLayout(): scala.Unit = js.native
  def ensureColIndexVisible(index: js.Any): scala.Unit = js.native
  def ensureColumnVisible(key: agDashGridLib.distLibEntitiesColumnMod.Column): scala.Unit = js.native
  def ensureColumnVisible(key: java.lang.String): scala.Unit = js.native
  def ensureIndexVisible(index: js.Any): scala.Unit = js.native
  def ensureIndexVisible(index: js.Any, position: java.lang.String): scala.Unit = js.native
  def ensureNodeVisible(comparator: js.Any): scala.Unit = js.native
  def ensureNodeVisible(comparator: js.Any, position: java.lang.String): scala.Unit = js.native
  def expandAll(): scala.Unit = js.native
  def expireValueCache(): scala.Unit = js.native
  def exportDataAsCsv(): scala.Unit = js.native
  def exportDataAsCsv(params: agDashGridLib.distLibExportParamsMod.CsvExportParams): scala.Unit = js.native
  def exportDataAsExcel(): scala.Unit = js.native
  def exportDataAsExcel(params: agDashGridLib.distLibInterfacesIExcelCreatorMod.ExcelExportParams): scala.Unit = js.native
  def flashCells(): scala.Unit = js.native
  def flashCells(params: FlashCellsParams): scala.Unit = js.native
  def forEachDetailGridInfo(callback: js.Function2[/* gridInfo */ DetailGridInfo, /* index */ scala.Double, scala.Unit]): scala.Unit = js.native
  def forEachLeafNode(callback: js.Function1[/* rowNode */ agDashGridLib.distLibEntitiesRowNodeMod.RowNode, scala.Unit]): scala.Unit = js.native
  def forEachNode(callback: js.Function1[/* rowNode */ agDashGridLib.distLibEntitiesRowNodeMod.RowNode, scala.Unit]): scala.Unit = js.native
  def forEachNodeAfterFilter(callback: js.Function1[/* rowNode */ agDashGridLib.distLibEntitiesRowNodeMod.RowNode, scala.Unit]): scala.Unit = js.native
  def forEachNodeAfterFilterAndSort(callback: js.Function1[/* rowNode */ agDashGridLib.distLibEntitiesRowNodeMod.RowNode, scala.Unit]): scala.Unit = js.native
  def getBestCostNodeSelection(): js.Any = js.native
  def getCacheBlockState(): js.Any = js.native
  def getCellEditorInstances(): js.Array[agDashGridLib.distLibRenderingCellEditorsICellEditorMod.ICellEditorComp] = js.native
  def getCellEditorInstances(params: GetCellEditorInstancesParams): js.Array[agDashGridLib.distLibRenderingCellEditorsICellEditorMod.ICellEditorComp] = js.native
  def getCellRendererInstances(): js.Array[agDashGridLib.distLibRenderingCellRenderersICellRendererMod.ICellRendererComp] = js.native
  def getCellRendererInstances(params: GetCellRendererInstancesParams): js.Array[agDashGridLib.distLibRenderingCellRenderersICellRendererMod.ICellRendererComp] = js.native
  def getColumnDef(key: agDashGridLib.distLibEntitiesColumnMod.Column): agDashGridLib.distLibEntitiesColDefMod.ColDef = js.native
  def getColumnDef(key: java.lang.String): agDashGridLib.distLibEntitiesColDefMod.ColDef = js.native
  def getDataAsCsv(): java.lang.String = js.native
  def getDataAsCsv(params: agDashGridLib.distLibExportParamsMod.CsvExportParams): java.lang.String = js.native
  def getDataAsExcel(): java.lang.String = js.native
  def getDataAsExcel(params: agDashGridLib.distLibInterfacesIExcelCreatorMod.ExcelExportParams): java.lang.String = js.native
  def getDetailGridInfo(id: java.lang.String): DetailGridInfo = js.native
  def getDisplayedRowAtIndex(index: scala.Double): agDashGridLib.distLibEntitiesRowNodeMod.RowNode = js.native
  def getDisplayedRowCount(): scala.Double = js.native
  def getEditingCells(): js.Array[agDashGridLib.distLibEntitiesGridCellMod.GridCellDef] = js.native
  def getFilterApi(key: agDashGridLib.distLibEntitiesColumnMod.Column): agDashGridLib.distLibInterfacesIFilterMod.IFilterComp = js.native
  def getFilterApi(key: java.lang.String): agDashGridLib.distLibInterfacesIFilterMod.IFilterComp = js.native
  def getFilterApiForColDef(colDef: js.Any): js.Any = js.native
  def getFilterInstance(key: agDashGridLib.distLibEntitiesColumnMod.Column): agDashGridLib.distLibInterfacesIFilterMod.IFilterComp = js.native
  def getFilterInstance(key: java.lang.String): agDashGridLib.distLibInterfacesIFilterMod.IFilterComp = js.native
  def getFilterModel(): js.Any = js.native
  def getFirstDisplayedRow(): scala.Double = js.native
  def getFirstRenderedRow(): scala.Double = js.native
  def getFloatingBottomRow(index: scala.Double): agDashGridLib.distLibEntitiesRowNodeMod.RowNode = js.native
  def getFloatingBottomRowCount(): scala.Double = js.native
  def getFloatingTopRow(index: scala.Double): agDashGridLib.distLibEntitiesRowNodeMod.RowNode = js.native
  def getFloatingTopRowCount(): scala.Double = js.native
  def getFocusedCell(): agDashGridLib.distLibEntitiesGridCellMod.GridCell = js.native
  def getInfinitePageState(): js.Any = js.native
  def getInfiniteRowCount(): scala.Double = js.native
  def getLastDisplayedRow(): scala.Double = js.native
  def getLastRenderedRow(): scala.Double = js.native
  def getModel(): agDashGridLib.distLibInterfacesIRowModelMod.IRowModel = js.native
  def getPinnedBottomRow(index: scala.Double): agDashGridLib.distLibEntitiesRowNodeMod.RowNode = js.native
  def getPinnedBottomRowCount(): scala.Double = js.native
  def getPinnedTopRow(index: scala.Double): agDashGridLib.distLibEntitiesRowNodeMod.RowNode = js.native
  def getPinnedTopRowCount(): scala.Double = js.native
  def getPreferredWidth(): scala.Double = js.native
  def getRangeSelections(): js.Array[agDashGridLib.distLibInterfacesIRangeControllerMod.RangeSelection] = js.native
  def getRenderedNodes(): js.Array[agDashGridLib.distLibEntitiesRowNodeMod.RowNode] = js.native
  def getRowNode(id: java.lang.String): agDashGridLib.distLibEntitiesRowNodeMod.RowNode = js.native
  def getSelectedNodes(): js.Array[agDashGridLib.distLibEntitiesRowNodeMod.RowNode] = js.native
  def getSelectedNodesById(): org.scalablytyped.runtime.NumberDictionary[agDashGridLib.distLibEntitiesRowNodeMod.RowNode] = js.native
  def getSelectedRows(): js.Array[_] = js.native
  def getSortModel(): js.Array[agDashGridLib.Anon_ColId] = js.native
  def getValue(
    colKey: agDashGridLib.distLibEntitiesColumnMod.Column,
    rowNode: agDashGridLib.distLibEntitiesRowNodeMod.RowNode
  ): js.Any = js.native
  def getValue(colKey: java.lang.String, rowNode: agDashGridLib.distLibEntitiesRowNodeMod.RowNode): js.Any = js.native
  def getVerticalPixelRange(): js.Any = js.native
  def getVirtualPageState(): js.Any = js.native
  def getVirtualRowCount(): scala.Double = js.native
  def hideOverlay(): scala.Unit = js.native
  def hidePopupMenu(): scala.Unit = js.native
  /* private */ def init(): js.Any = js.native
  def insertItemsAtIndex(index: scala.Double, items: js.Array[_]): scala.Unit = js.native
  def insertItemsAtIndex(index: scala.Double, items: js.Array[_], skipRefresh: scala.Boolean): scala.Unit = js.native
  def isAdvancedFilterPresent(): scala.Boolean = js.native
  def isAnimationFrameQueueEmpty(): scala.Boolean = js.native
  def isAnyFilterPresent(): scala.Boolean = js.native
  def isMaxRowFound(): scala.Boolean = js.native
  def isNodeSelected(node: js.Any): js.Any = js.native
  def isQuickFilterPresent(): scala.Boolean = js.native
  def isToolPanelShowing(): scala.Boolean = js.native
  def onFilterChanged(): scala.Unit = js.native
  def onGroupExpandedOrCollapsed(): scala.Unit = js.native
  def onGroupExpandedOrCollapsed(deprecated_refreshFromIndex: js.Any): scala.Unit = js.native
  def onRowHeightChanged(): scala.Unit = js.native
  def onSortChanged(): scala.Unit = js.native
  def paginationGetCurrentPage(): scala.Double = js.native
  def paginationGetPageSize(): scala.Double = js.native
  def paginationGetRowCount(): scala.Double = js.native
  def paginationGetTotalPages(): scala.Double = js.native
  def paginationGoToFirstPage(): scala.Unit = js.native
  def paginationGoToLastPage(): scala.Unit = js.native
  def paginationGoToNextPage(): scala.Unit = js.native
  def paginationGoToPage(page: scala.Double): scala.Unit = js.native
  def paginationGoToPreviousPage(): scala.Unit = js.native
  def paginationIsLastPageFound(): scala.Boolean = js.native
  def paginationSetPageSize(size: scala.Double): scala.Unit = js.native
  def purgeEnterpriseCache(): scala.Unit = js.native
  def purgeEnterpriseCache(route: js.Array[java.lang.String]): scala.Unit = js.native
  def purgeInfiniteCache(): scala.Unit = js.native
  def purgeInfinitePageCache(): scala.Unit = js.native
  def purgeServerSideCache(): scala.Unit = js.native
  def purgeServerSideCache(route: js.Array[java.lang.String]): scala.Unit = js.native
  def purgeVirtualPageCache(): scala.Unit = js.native
  def recomputeAggregates(): scala.Unit = js.native
  def redrawRows(): scala.Unit = js.native
  def redrawRows(params: RedrawRowsParams): scala.Unit = js.native
  def refreshCells(): scala.Unit = js.native
  def refreshCells(params: RefreshCellsParams): scala.Unit = js.native
  def refreshClientSideRowModel(): js.Any = js.native
  def refreshClientSideRowModel(step: java.lang.String): js.Any = js.native
  def refreshGroupRows(): scala.Unit = js.native
  def refreshHeader(): scala.Unit = js.native
  def refreshInMemoryRowModel(): js.Any = js.native
  def refreshInMemoryRowModel(step: java.lang.String): js.Any = js.native
  def refreshInfiniteCache(): scala.Unit = js.native
  def refreshInfinitePageCache(): scala.Unit = js.native
  def refreshRows(rowNodes: js.Array[agDashGridLib.distLibEntitiesRowNodeMod.RowNode]): scala.Unit = js.native
  def refreshToolPanel(): scala.Unit = js.native
  def refreshView(): scala.Unit = js.native
  def refreshVirtualPageCache(): scala.Unit = js.native
  def registerGridComp(gridPanel: agDashGridLib.distLibGridPanelGridPanelMod.GridPanel): scala.Unit = js.native
  def registerHeaderRootComp(headerRootComp: agDashGridLib.distLibHeaderRenderingHeaderRootCompMod.HeaderRootComp): scala.Unit = js.native
  def removeDetailGridInfo(id: java.lang.String): scala.Unit = js.native
  def removeEventListener(eventType: java.lang.String, listener: js.Function): scala.Unit = js.native
  def removeGlobalListener(listener: js.Function): scala.Unit = js.native
  def removeItems(rowNodes: js.Array[agDashGridLib.distLibEntitiesRowNodeMod.RowNode]): scala.Unit = js.native
  def removeItems(rowNodes: js.Array[agDashGridLib.distLibEntitiesRowNodeMod.RowNode], skipRefresh: scala.Boolean): scala.Unit = js.native
  def resetQuickFilter(): scala.Unit = js.native
  def resetRowHeights(): scala.Unit = js.native
  def rowDataChanged(rows: js.Any): scala.Unit = js.native
  def selectAll(): scala.Unit = js.native
  def selectAllFiltered(): scala.Unit = js.native
  def selectIndex(index: js.Any, tryMulti: js.Any, suppressEvents: js.Any): scala.Unit = js.native
  def selectNode(node: agDashGridLib.distLibEntitiesRowNodeMod.RowNode): scala.Unit = js.native
  def selectNode(node: agDashGridLib.distLibEntitiesRowNodeMod.RowNode, tryMulti: scala.Boolean): scala.Unit = js.native
  def selectNode(
    node: agDashGridLib.distLibEntitiesRowNodeMod.RowNode,
    tryMulti: scala.Boolean,
    suppressEvents: scala.Boolean
  ): scala.Unit = js.native
  def setColumnDefs(
    colDefs: js.Array[
      agDashGridLib.distLibEntitiesColDefMod.ColDef | agDashGridLib.distLibEntitiesColDefMod.ColGroupDef
    ]
  ): scala.Unit = js.native
  def setColumnDefs(
    colDefs: js.Array[
      agDashGridLib.distLibEntitiesColDefMod.ColDef | agDashGridLib.distLibEntitiesColDefMod.ColGroupDef
    ],
    source: agDashGridLib.distLibEventsMod.ColumnEventType
  ): scala.Unit = js.native
  def setDatasource(datasource: agDashGridLib.distLibRowModelsIDatasourceMod.IDatasource): scala.Unit = js.native
  def setEnterpriseDatasource(datasource: agDashGridLib.distLibInterfacesIServerSideDatasourceMod.IServerSideDatasource): scala.Unit = js.native
  def setFilterModel(model: js.Any): scala.Unit = js.native
  def setFloatingBottomRowData(rows: js.Array[_]): scala.Unit = js.native
  def setFloatingFiltersHeight(headerHeight: scala.Double): scala.Unit = js.native
  def setFloatingTopRowData(rows: js.Array[_]): scala.Unit = js.native
  def setFocusedCell(rowIndex: scala.Double, colKey: agDashGridLib.distLibEntitiesColumnMod.Column): scala.Unit = js.native
  def setFocusedCell(
    rowIndex: scala.Double,
    colKey: agDashGridLib.distLibEntitiesColumnMod.Column,
    floating: java.lang.String
  ): scala.Unit = js.native
  def setFocusedCell(rowIndex: scala.Double, colKey: java.lang.String): scala.Unit = js.native
  def setFocusedCell(rowIndex: scala.Double, colKey: java.lang.String, floating: java.lang.String): scala.Unit = js.native
  def setFunctionsReadOnly(readOnly: scala.Boolean): scala.Unit = js.native
  def setGridAutoHeight(gridAutoHeight: scala.Boolean): scala.Unit = js.native
  def setGroupHeaderHeight(headerHeight: scala.Double): scala.Unit = js.native
  def setGroupRemoveLowestSingleChildren(value: scala.Boolean): scala.Unit = js.native
  def setGroupRemoveSingleChildren(value: scala.Boolean): scala.Unit = js.native
  def setHeaderHeight(headerHeight: scala.Double): scala.Unit = js.native
  def setInfiniteRowCount(rowCount: scala.Double): scala.Unit = js.native
  def setInfiniteRowCount(rowCount: scala.Double, maxRowFound: scala.Boolean): scala.Unit = js.native
  def setPinnedBottomRowData(rows: js.Array[_]): scala.Unit = js.native
  def setPinnedTopRowData(rows: js.Array[_]): scala.Unit = js.native
  def setPivotGroupHeaderHeight(headerHeight: scala.Double): scala.Unit = js.native
  def setPivotHeaderHeight(headerHeight: scala.Double): scala.Unit = js.native
  def setPopupParent(ePopupParent: stdLib.HTMLElement): scala.Unit = js.native
  def setQuickFilter(newFilter: js.Any): scala.Unit = js.native
  def setRowData(rowData: js.Array[_]): scala.Unit = js.native
  def setServerSideDatasource(datasource: agDashGridLib.distLibInterfacesIServerSideDatasourceMod.IServerSideDatasource): scala.Unit = js.native
  def setSortModel(sortModel: js.Any): scala.Unit = js.native
  def setSortModel(sortModel: js.Any, source: agDashGridLib.distLibEventsMod.ColumnEventType): scala.Unit = js.native
  def setSuppressClipboardPaste(value: scala.Boolean): scala.Unit = js.native
  def setSuppressRowDrag(value: scala.Boolean): scala.Unit = js.native
  def setViewportDatasource(viewportDatasource: agDashGridLib.distLibInterfacesIViewportDatasourceMod.IViewportDatasource): scala.Unit = js.native
  def setVirtualRowCount(rowCount: scala.Double): scala.Unit = js.native
  def setVirtualRowCount(rowCount: scala.Double, maxRowFound: scala.Boolean): scala.Unit = js.native
  def showColumnMenuAfterButtonClick(colKey: agDashGridLib.distLibEntitiesColumnMod.Column, buttonElement: stdLib.HTMLElement): scala.Unit = js.native
  def showColumnMenuAfterButtonClick(colKey: java.lang.String, buttonElement: stdLib.HTMLElement): scala.Unit = js.native
  def showColumnMenuAfterMouseClick(colKey: agDashGridLib.distLibEntitiesColumnMod.Column, mouseEvent: stdLib.MouseEvent): scala.Unit = js.native
  def showColumnMenuAfterMouseClick(colKey: agDashGridLib.distLibEntitiesColumnMod.Column, mouseEvent: stdLib.Touch): scala.Unit = js.native
  def showColumnMenuAfterMouseClick(colKey: java.lang.String, mouseEvent: stdLib.MouseEvent): scala.Unit = js.native
  def showColumnMenuAfterMouseClick(colKey: java.lang.String, mouseEvent: stdLib.Touch): scala.Unit = js.native
  def showLoadingOverlay(): scala.Unit = js.native
  def showNoRowsOverlay(): scala.Unit = js.native
  def showToolPanel(show: js.Any): scala.Unit = js.native
  def sizeColumnsToFit(): scala.Unit = js.native
  def softRefreshView(): scala.Unit = js.native
  def startEditingCell(params: StartEditingCellParams): scala.Unit = js.native
  def stopEditing(): scala.Unit = js.native
  def stopEditing(cancel: scala.Boolean): scala.Unit = js.native
  def tabToNextCell(): scala.Boolean = js.native
  def tabToPreviousCell(): scala.Boolean = js.native
  def timeFullRedraw(): scala.Unit = js.native
  def timeFullRedraw(count: scala.Double): scala.Unit = js.native
  def updateRowData(
    rowDataTransaction: agDashGridLib.distLibRowModelsClientSideClientSideRowModelMod.RowDataTransaction
  ): agDashGridLib.distLibRowModelsClientSideClientSideRowModelMod.RowNodeTransaction = js.native
}

