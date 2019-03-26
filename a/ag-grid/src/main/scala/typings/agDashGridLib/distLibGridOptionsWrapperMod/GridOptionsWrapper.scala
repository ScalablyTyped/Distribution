package typings
package agDashGridLib.distLibGridOptionsWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/gridOptionsWrapper", "GridOptionsWrapper")
@js.native
class GridOptionsWrapper () extends js.Object {
  var autoHeightCalculator: js.Any = js.native
  var columnApi: js.Any = js.native
  var columnController: js.Any = js.native
  var domDataKey: js.Any = js.native
  var enterprise: js.Any = js.native
  var environment: js.Any = js.native
  var eventService: js.Any = js.native
  var frameworkFactory: js.Any = js.native
  var gridApi: js.Any = js.native
  var gridOptions: js.Any = js.native
  var layoutElements: js.Any = js.native
  var propertyEventService: js.Any = js.native
  def addEventListener(key: java.lang.String, listener: js.Function): scala.Unit = js.native
  def addLayoutElement(element: stdLib.HTMLElement): scala.Unit = js.native
  /* private */ def agWire(gridApi: js.Any, columnApi: js.Any): js.Any = js.native
  /* private */ def checkColumnDefProperties(): js.Any = js.native
  /* private */ def checkForDeprecated(): js.Any = js.native
  /* private */ def checkGridOptionsProperties(): js.Any = js.native
  /* private */ def checkProperties(
    userProperties: js.Any,
    validPropertiesAndExceptions: js.Any,
    validProperties: js.Any,
    containerName: js.Any,
    docsUrl: js.Any
  ): js.Any = js.native
  /* private */ def destroy(): js.Any = js.native
  def doesExternalFilterPass(node: agDashGridLib.distLibEntitiesRowNodeMod.RowNode): scala.Boolean = js.native
  def getAggFuncs(): org.scalablytyped.runtime.StringDictionary[agDashGridLib.distLibEntitiesColDefMod.IAggFunc] = js.native
  def getAlignedGrids(): js.Array[agDashGridLib.distLibEntitiesGridOptionsMod.GridOptions] = js.native
  def getApi(): agDashGridLib.distLibGridApiMod.GridApi = js.native
  def getAutoGroupColumnDef(): agDashGridLib.distLibEntitiesColDefMod.ColDef = js.native
  def getAutoSizePadding(): scala.Double = js.native
  def getBatchUpdateWaitMillis(): scala.Double = js.native
  def getBusinessKeyForNodeFunc(): js.Function1[/* node */ agDashGridLib.distLibEntitiesRowNodeMod.RowNode, java.lang.String] = js.native
  def getCacheBlockSize(): scala.Double = js.native
  def getCacheOverflowSize(): scala.Double = js.native
  def getChildCountFunc(): js.Function1[/* dataItem */ js.Any, scala.Double] = js.native
  def getClipboardDeliminator(): java.lang.String = js.native
  def getColResizeDefault(): java.lang.String = js.native
  def getColWidth(): scala.Double = js.native
  def getColumnApi(): agDashGridLib.distLibColumnControllerColumnApiMod.ColumnApi = js.native
  def getColumnDefs(): js.Array[
    agDashGridLib.distLibEntitiesColDefMod.ColDef | agDashGridLib.distLibEntitiesColDefMod.ColGroupDef
  ] = js.native
  def getColumnTypes(): org.scalablytyped.runtime.StringDictionary[agDashGridLib.distLibEntitiesColDefMod.ColDef] = js.native
  def getContext(): js.Any = js.native
  def getContextMenuItemsFunc(): agDashGridLib.distLibEntitiesGridOptionsMod.GetContextMenuItems = js.native
  def getDataPathFunc(): js.Function1[/* dataItem */ js.Any, js.Array[java.lang.String]] = js.native
  def getDatasource(): agDashGridLib.distLibRowModelsIDatasourceMod.IDatasource = js.native
  def getDefaultColDef(): agDashGridLib.distLibEntitiesColDefMod.ColDef = js.native
  def getDefaultColGroupDef(): agDashGridLib.distLibEntitiesColDefMod.ColGroupDef = js.native
  def getDefaultExportParams(): agDashGridLib.distLibExportParamsMod.BaseExportParams = js.native
  def getDefaultGroupSortComparator(): js.Function2[
    /* nodeA */ agDashGridLib.distLibEntitiesRowNodeMod.RowNode, 
    /* nodeB */ agDashGridLib.distLibEntitiesRowNodeMod.RowNode, 
    scala.Double
  ] = js.native
  /* private */ def getDefaultRowHeight(): js.Any = js.native
  def getDocument(): stdLib.Document = js.native
  def getDoesDataFlowerFunc(): js.Function1[/* data */ js.Any, scala.Boolean] = js.native
  def getDomData(element: stdLib.Node, key: java.lang.String): js.Any = js.native
  def getFloatingFiltersHeight(): scala.Double = js.native
  def getFullWidthCellRendererParams(): js.Any = js.native
  def getGroupDefaultExpanded(): scala.Double = js.native
  def getGroupHeaderHeight(): scala.Double = js.native
  def getGroupRowAggNodesFunc(): js.Function1[/* nodes */ js.Array[agDashGridLib.distLibEntitiesRowNodeMod.RowNode], _] = js.native
  def getGroupRowRendererParams(): js.Any = js.native
  def getHeaderHeight(): scala.Double = js.native
  def getIcons(): js.Any = js.native
  def getInfiniteInitialRowCount(): scala.Double = js.native
  def getIsFullWidthCellFunc(): js.Function1[/* rowNode */ agDashGridLib.distLibEntitiesRowNodeMod.RowNode, scala.Boolean] = js.native
  def getIsRowMasterFunc(): agDashGridLib.distLibEntitiesGridOptionsMod.IsRowMaster = js.native
  def getIsRowSelectableFunc(): agDashGridLib.distLibEntitiesGridOptionsMod.IsRowSelectable = js.native
  def getLocaleTextFunc(): js.Function = js.native
  def getMainMenuItemsFunc(): agDashGridLib.distLibEntitiesGridOptionsMod.GetMainMenuItems = js.native
  def getMaxBlocksInCache(): scala.Double = js.native
  def getMaxColWidth(): scala.Double = js.native
  def getMaxConcurrentDatasourceRequests(): scala.Double = js.native
  def getMinColWidth(): scala.Double = js.native
  def getNavigateToNextCellFunc(): js.Function1[
    /* params */ agDashGridLib.distLibEntitiesGridOptionsMod.NavigateToNextCellParams, 
    agDashGridLib.distLibEntitiesGridCellMod.GridCellDef
  ] = js.native
  def getNodeChildDetailsFunc(): js.Function1[
    /* dataItem */ js.Any, 
    agDashGridLib.distLibEntitiesGridOptionsMod.NodeChildDetails
  ] = js.native
  def getOverlayLoadingTemplate(): java.lang.String = js.native
  def getOverlayNoRowsTemplate(): java.lang.String = js.native
  def getPaginationNumberFormatterFunc(): js.Function1[
    /* params */ agDashGridLib.distLibEntitiesGridOptionsMod.PaginationNumberFormatterParams, 
    java.lang.String
  ] = js.native
  def getPaginationPageSize(): scala.Double = js.native
  def getPinnedBottomRowData(): js.Array[_] = js.native
  def getPinnedTopRowData(): js.Array[_] = js.native
  def getPivotColumnGroupTotals(): java.lang.String = js.native
  def getPivotGroupHeaderHeight(): scala.Double = js.native
  def getPivotHeaderHeight(): scala.Double = js.native
  def getPivotPanelShow(): java.lang.String = js.native
  def getPivotRowTotals(): java.lang.String = js.native
  def getPopupParent(): stdLib.HTMLElement = js.native
  def getPostProcessPopupFunc(): js.Function1[
    /* params */ agDashGridLib.distLibEntitiesGridOptionsMod.PostProcessPopupParams, 
    scala.Unit
  ] = js.native
  def getPostSortFunc(): js.Function1[
    /* rowNodes */ js.Array[agDashGridLib.distLibEntitiesRowNodeMod.RowNode], 
    scala.Unit
  ] = js.native
  def getProcessCellForClipboardFunc(): js.Function1[/* params */ agDashGridLib.distLibExportParamsMod.ProcessCellForExportParams, _] = js.native
  def getProcessCellFromClipboardFunc(): js.Function1[/* params */ agDashGridLib.distLibExportParamsMod.ProcessCellForExportParams, _] = js.native
  def getProcessDataFromClipboardFunc(): js.Function1[
    /* params */ agDashGridLib.distLibEntitiesGridOptionsMod.ProcessDataFromClipboardParams, 
    js.Array[js.Array[java.lang.String]]
  ] = js.native
  def getProcessHeaderForClipboardFunc(): js.Function1[/* params */ agDashGridLib.distLibExportParamsMod.ProcessHeaderForExportParams, _] = js.native
  def getProcessRowPostCreateFunc(): js.Any = js.native
  def getProcessSecondaryColDefFunc(): js.Function1[/* colDef */ agDashGridLib.distLibEntitiesColDefMod.ColDef, scala.Unit] = js.native
  def getProcessSecondaryColGroupDefFunc(): js.Function1[/* colGroupDef */ agDashGridLib.distLibEntitiesColDefMod.ColGroupDef, scala.Unit] = js.native
  def getQuickFilterText(): java.lang.String = js.native
  def getRowBuffer(): scala.Double = js.native
  def getRowClass(): java.lang.String | js.Array[java.lang.String] = js.native
  def getRowClassFunc(): js.Function1[/* params */ js.Any, java.lang.String | js.Array[java.lang.String]] = js.native
  def getRowData(): js.Array[_] = js.native
  def getRowGroupPanelShow(): java.lang.String = js.native
  def getRowHeightAsNumber(): scala.Double = js.native
  def getRowHeightForNode(rowNode: agDashGridLib.distLibEntitiesRowNodeMod.RowNode): scala.Double = js.native
  def getRowNodeIdFunc(): agDashGridLib.distLibEntitiesGridOptionsMod.GetRowNodeIdFunc = js.native
  def getRowStyle(): js.Any = js.native
  def getRowStyleFunc(): js.Function = js.native
  def getScrollbarWidth(): scala.Double = js.native
  def getSendToClipboardFunc(): js.Function1[/* params */ js.Any, scala.Unit] = js.native
  def getServerSideDatasource(): agDashGridLib.distLibInterfacesIServerSideDatasourceMod.IServerSideDatasource = js.native
  def getSortingOrder(): js.Array[java.lang.String] = js.native
  def getTabToNextCellFunc(): js.Function1[
    /* params */ agDashGridLib.distLibEntitiesGridOptionsMod.TabToNextCellParams, 
    agDashGridLib.distLibEntitiesGridCellMod.GridCellDef
  ] = js.native
  def getViewportDatasource(): agDashGridLib.distLibInterfacesIViewportDatasourceMod.IViewportDatasource = js.native
  def getViewportRowModelBufferSize(): scala.Double = js.native
  def getViewportRowModelPageSize(): scala.Double = js.native
  def getVirtualItemHeight(): scala.Double = js.native
  def globalEventHandler(eventName: java.lang.String): scala.Unit = js.native
  def globalEventHandler(eventName: java.lang.String, event: js.Any): scala.Unit = js.native
  def init(): scala.Unit = js.native
  def isAccentedSort(): scala.Boolean = js.native
  def isAggregateOnlyChangedColumns(): scala.Boolean = js.native
  def isAllowContextMenuWithControlKey(): scala.Boolean = js.native
  def isAlwaysShowStatusBar(): scala.Boolean = js.native
  def isAngularCompileFilters(): scala.Boolean = js.native
  def isAngularCompileHeaders(): scala.Boolean = js.native
  def isAngularCompileRows(): scala.Boolean = js.native
  def isAnimateRows(): scala.Boolean = js.native
  def isCacheQuickFilter(): scala.Boolean = js.native
  def isContractColumnSelection(): scala.Boolean = js.native
  def isDebug(): scala.Boolean = js.native
  def isDeltaRowDataMode(): scala.Boolean = js.native
  def isDynamicRowHeight(): scala.Boolean = js.native
  def isEmbedFullWidthRows(): scala.Boolean = js.native
  def isEnableCellChangeFlash(): scala.Boolean = js.native
  def isEnableCellExpressions(): scala.Boolean = js.native
  def isEnableColResize(): scala.Boolean = js.native
  def isEnableFilter(): scala.Boolean = js.native
  def isEnableGroupEdit(): scala.Boolean = js.native
  def isEnableOldSetFilterModel(): scala.Boolean = js.native
  def isEnableRangeSelection(): scala.Boolean = js.native
  def isEnableRtl(): scala.Boolean = js.native
  def isEnableServerSideFilter(): scala.Boolean = js.native
  def isEnableServerSideSorting(): scala.Boolean = js.native
  def isEnableSorting(): scala.Boolean = js.native
  def isEnableStatusBar(): scala.Boolean = js.native
  def isEnsureDomOrder(): scala.Boolean = js.native
  def isEnterMovesDown(): scala.Boolean = js.native
  def isEnterMovesDownAfterEdit(): scala.Boolean = js.native
  def isEnterprise(): scala.Boolean = js.native
  def isExternalFilterPresent(): scala.Boolean = js.native
  def isFloatingFilter(): scala.Boolean = js.native
  def isFullRowEdit(): scala.Boolean = js.native
  def isFunctionsPassive(): scala.Boolean = js.native
  def isFunctionsReadOnly(): scala.Boolean = js.native
  def isGridAutoHeight(): scala.Boolean = js.native
  def isGroupHideOpenParents(): scala.Boolean = js.native
  def isGroupIncludeFooter(): scala.Boolean = js.native
  def isGroupIncludeTotalFooter(): scala.Boolean = js.native
  def isGroupMultiAutoColumn(): scala.Boolean = js.native
  def isGroupRemoveLowestSingleChildren(): scala.Boolean = js.native
  def isGroupRemoveSingleChildren(): scala.Boolean = js.native
  def isGroupSelectsChildren(): scala.Boolean = js.native
  def isGroupSelectsFiltered(): scala.Boolean = js.native
  def isGroupSuppressAutoColumn(): scala.Boolean = js.native
  def isGroupSuppressBlankHeader(): scala.Boolean = js.native
  def isGroupSuppressRow(): scala.Boolean = js.native
  def isGroupUseEntireRow(): scala.Boolean = js.native
  def isMasterDetail(): scala.Boolean = js.native
  def isMultiSortKeyCtrl(): scala.Boolean = js.native
  /* private */ def isNumeric(value: js.Any): js.Any = js.native
  def isPagination(): scala.Boolean = js.native
  def isPaginationAutoPageSize(): scala.Boolean = js.native
  def isPivotMode(): scala.Boolean = js.native
  def isPivotTotals(): scala.Boolean = js.native
  def isPurgeClosedRowNodes(): scala.Boolean = js.native
  def isRememberGroupStateWhenNewData(): scala.Boolean = js.native
  def isRowDeselection(): scala.Boolean = js.native
  def isRowDragManaged(): scala.Boolean = js.native
  def isRowModelDefault(): scala.Boolean = js.native
  def isRowModelInfinite(): scala.Boolean = js.native
  def isRowModelServerSide(): scala.Boolean = js.native
  def isRowModelViewport(): scala.Boolean = js.native
  def isRowMultiSelectWithClick(): scala.Boolean = js.native
  def isRowSelection(): scala.Boolean = js.native
  def isRowSelectionMulti(): scala.Boolean = js.native
  def isServerSideSortingAlwaysResets(): scala.Boolean = js.native
  def isShowToolPanel(): scala.Boolean = js.native
  def isSingleClickEdit(): scala.Boolean = js.native
  def isStopEditingWhenGridLosesFocus(): scala.Boolean = js.native
  def isSuppressAggAtRootLevel(): scala.Boolean = js.native
  def isSuppressAggFuncInHeader(): scala.Boolean = js.native
  def isSuppressAnimationFrame(): scala.Boolean = js.native
  def isSuppressAutoSize(): scala.Boolean = js.native
  def isSuppressCellSelection(): scala.Boolean = js.native
  def isSuppressChangeDetection(): scala.Boolean = js.native
  def isSuppressClickEdit(): scala.Boolean = js.native
  def isSuppressClipboardPaste(): scala.Boolean = js.native
  def isSuppressColumnMoveAnimation(): scala.Boolean = js.native
  def isSuppressColumnVirtualisation(): scala.Boolean = js.native
  def isSuppressContextMenu(): scala.Boolean = js.native
  def isSuppressCopyRowsToClipboard(): scala.Boolean = js.native
  def isSuppressCsvExport(): scala.Boolean = js.native
  def isSuppressDragLeaveHidesColumns(): scala.Boolean = js.native
  def isSuppressEnterpriseResetOnNewColumns(): scala.Boolean = js.native
  def isSuppressExcelExport(): scala.Boolean = js.native
  def isSuppressFieldDotNotation(): scala.Boolean = js.native
  def isSuppressFocusAfterRefresh(): scala.Boolean = js.native
  def isSuppressHorizontalScroll(): scala.Boolean = js.native
  def isSuppressLoadingOverlay(): scala.Boolean = js.native
  def isSuppressMakeColumnVisibleAfterUnGroup(): scala.Boolean = js.native
  def isSuppressMenuHide(): scala.Boolean = js.native
  def isSuppressMiddleClickScrolls(): scala.Boolean = js.native
  def isSuppressMovableColumns(): scala.Boolean = js.native
  def isSuppressMultiRangeSelection(): scala.Boolean = js.native
  def isSuppressMultiSort(): scala.Boolean = js.native
  def isSuppressNoRowsOverlay(): scala.Boolean = js.native
  def isSuppressPaginationPanel(): scala.Boolean = js.native
  def isSuppressParentsInRowNodes(): scala.Boolean = js.native
  def isSuppressPreventDefaultOnMouseWheel(): scala.Boolean = js.native
  def isSuppressRowClickSelection(): scala.Boolean = js.native
  def isSuppressRowDrag(): scala.Boolean = js.native
  def isSuppressRowHoverHighlight(): scala.Boolean = js.native
  def isSuppressRowTransform(): scala.Boolean = js.native
  def isSuppressScrollOnNewData(): scala.Boolean = js.native
  def isSuppressTabbing(): scala.Boolean = js.native
  def isSuppressTouch(): scala.Boolean = js.native
  def isToolPanelSuppressColumnExpandAll(): scala.Boolean = js.native
  def isToolPanelSuppressColumnFilter(): scala.Boolean = js.native
  def isToolPanelSuppressColumnSelectAll(): scala.Boolean = js.native
  def isToolPanelSuppressPivotMode(): scala.Boolean = js.native
  def isToolPanelSuppressPivots(): scala.Boolean = js.native
  def isToolPanelSuppressRowGroups(): scala.Boolean = js.native
  def isToolPanelSuppressSideButtons(): scala.Boolean = js.native
  def isToolPanelSuppressValues(): scala.Boolean = js.native
  def isTreeData(): scala.Boolean = js.native
  def isUnSortIcon(): scala.Boolean = js.native
  def isValueCache(): scala.Boolean = js.native
  def isValueCacheNeverExpires(): scala.Boolean = js.native
  def removeEventListener(key: java.lang.String, listener: js.Function): scala.Unit = js.native
  def rowClassRules(): org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Function] = js.native
  def setDomData(element: stdLib.Element, key: java.lang.String, value: js.Any): js.Any = js.native
  def setProperty(key: java.lang.String, value: js.Any): scala.Unit = js.native
  /* private */ def specialForNewMaterial(defaultValue: js.Any, sassVariableName: js.Any): js.Any = js.native
  /* private */ def updateLayoutClasses(): js.Any = js.native
  def useAsyncEvents(): scala.Boolean = js.native
}

/* static members */
@JSImport("ag-grid/dist/lib/gridOptionsWrapper", "GridOptionsWrapper")
@js.native
object GridOptionsWrapper extends js.Object {
  var MIN_COL_WIDTH: js.Any = js.native
  var PROP_FLOATING_FILTERS_HEIGHT: java.lang.String = js.native
  var PROP_GRID_AUTO_HEIGHT: java.lang.String = js.native
  var PROP_GROUP_HEADER_HEIGHT: java.lang.String = js.native
  var PROP_GROUP_REMOVE_LOWEST_SINGLE_CHILDREN: java.lang.String = js.native
  var PROP_GROUP_REMOVE_SINGLE_CHILDREN: java.lang.String = js.native
  var PROP_HEADER_HEIGHT: java.lang.String = js.native
  var PROP_PIVOT_GROUP_HEADER_HEIGHT: java.lang.String = js.native
  var PROP_PIVOT_HEADER_HEIGHT: java.lang.String = js.native
  var PROP_POPUP_PARENT: java.lang.String = js.native
  var PROP_SUPPRESS_CLIPBOARD_PASTE: java.lang.String = js.native
  var PROP_SUPPRESS_ROW_DRAG: java.lang.String = js.native
  def checkEventDeprecation(eventName: java.lang.String): scala.Unit = js.native
}

