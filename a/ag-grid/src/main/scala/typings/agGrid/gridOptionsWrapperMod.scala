package typings.agGrid

import org.scalablytyped.runtime.StringDictionary
import typings.agGrid.colDefMod.ColDef
import typings.agGrid.colDefMod.ColGroupDef
import typings.agGrid.colDefMod.IAggFunc
import typings.agGrid.columnApiMod.ColumnApi
import typings.agGrid.eventsMod.AgEvent
import typings.agGrid.exportParamsMod.BaseExportParams
import typings.agGrid.exportParamsMod.ProcessCellForExportParams
import typings.agGrid.exportParamsMod.ProcessHeaderForExportParams
import typings.agGrid.gridApiMod.GridApi
import typings.agGrid.gridCellMod.GridCellDef
import typings.agGrid.gridOptionsMod.GetContextMenuItems
import typings.agGrid.gridOptionsMod.GetMainMenuItems
import typings.agGrid.gridOptionsMod.GetRowNodeIdFunc
import typings.agGrid.gridOptionsMod.GridOptions
import typings.agGrid.gridOptionsMod.IsRowMaster
import typings.agGrid.gridOptionsMod.IsRowSelectable
import typings.agGrid.gridOptionsMod.NavigateToNextCellParams
import typings.agGrid.gridOptionsMod.NodeChildDetails
import typings.agGrid.gridOptionsMod.PaginationNumberFormatterParams
import typings.agGrid.gridOptionsMod.PostProcessPopupParams
import typings.agGrid.gridOptionsMod.ProcessDataFromClipboardParams
import typings.agGrid.gridOptionsMod.TabToNextCellParams
import typings.agGrid.iDatasourceMod.IDatasource
import typings.agGrid.iServerSideDatasourceMod.IServerSideDatasource
import typings.agGrid.iViewportDatasourceMod.IViewportDatasource
import typings.agGrid.rowNodeMod.RowNode
import typings.std.Document
import typings.std.Element
import typings.std.HTMLElement
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gridOptionsWrapperMod {
  
  @JSImport("ag-grid/dist/lib/gridOptionsWrapper", "GridOptionsWrapper")
  @js.native
  class GridOptionsWrapper () extends StObject {
    
    def addEventListener(key: String, listener: js.Function): Unit = js.native
    
    def addLayoutElement(element: HTMLElement): Unit = js.native
    
    /* private */ def agWire(gridApi: js.Any, columnApi: js.Any): js.Any = js.native
    
    /* private */ var autoHeightCalculator: js.Any = js.native
    
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
    
    /* private */ var columnApi: js.Any = js.native
    
    /* private */ var columnController: js.Any = js.native
    
    /* private */ def destroy(): js.Any = js.native
    
    def doesExternalFilterPass(node: RowNode): Boolean = js.native
    
    /* private */ var domDataKey: js.Any = js.native
    
    /* private */ var enterprise: js.Any = js.native
    
    /* private */ var environment: js.Any = js.native
    
    /* private */ var eventService: js.Any = js.native
    
    /* private */ var frameworkFactory: js.Any = js.native
    
    def getAggFuncs(): StringDictionary[IAggFunc] = js.native
    
    def getAlignedGrids(): js.Array[GridOptions] = js.native
    
    def getApi(): GridApi = js.native
    
    def getAutoGroupColumnDef(): ColDef = js.native
    
    def getAutoSizePadding(): Double = js.native
    
    def getBatchUpdateWaitMillis(): Double = js.native
    
    def getBusinessKeyForNodeFunc(): js.Function1[/* node */ RowNode, String] = js.native
    
    def getCacheBlockSize(): Double = js.native
    
    def getCacheOverflowSize(): Double = js.native
    
    def getChildCountFunc(): js.Function1[/* dataItem */ js.Any, Double] = js.native
    
    def getClipboardDeliminator(): String = js.native
    
    def getColResizeDefault(): String = js.native
    
    def getColWidth(): Double = js.native
    
    def getColumnApi(): ColumnApi = js.native
    
    def getColumnDefs(): js.Array[ColDef | ColGroupDef] = js.native
    
    def getColumnTypes(): StringDictionary[ColDef] = js.native
    
    def getContext(): js.Any = js.native
    
    def getContextMenuItemsFunc(): GetContextMenuItems = js.native
    
    def getDataPathFunc(): js.Function1[/* dataItem */ js.Any, js.Array[String]] = js.native
    
    def getDatasource(): IDatasource = js.native
    
    def getDefaultColDef(): ColDef = js.native
    
    def getDefaultColGroupDef(): ColGroupDef = js.native
    
    def getDefaultExportParams(): BaseExportParams = js.native
    
    def getDefaultGroupSortComparator(): js.Function2[/* nodeA */ RowNode, /* nodeB */ RowNode, Double] = js.native
    
    /* private */ def getDefaultRowHeight(): js.Any = js.native
    
    def getDocument(): Document = js.native
    
    def getDoesDataFlowerFunc(): js.Function1[/* data */ js.Any, Boolean] = js.native
    
    def getDomData(element: Node, key: String): js.Any = js.native
    
    def getFloatingFiltersHeight(): Double = js.native
    
    def getFullWidthCellRendererParams(): js.Any = js.native
    
    def getGroupDefaultExpanded(): Double = js.native
    
    def getGroupHeaderHeight(): Double = js.native
    
    def getGroupRowAggNodesFunc(): js.Function1[/* nodes */ js.Array[RowNode], js.Any] = js.native
    
    def getGroupRowRendererParams(): js.Any = js.native
    
    def getHeaderHeight(): Double = js.native
    
    def getIcons(): js.Any = js.native
    
    def getInfiniteInitialRowCount(): Double = js.native
    
    def getIsFullWidthCellFunc(): js.Function1[/* rowNode */ RowNode, Boolean] = js.native
    
    def getIsRowMasterFunc(): IsRowMaster = js.native
    
    def getIsRowSelectableFunc(): IsRowSelectable = js.native
    
    def getLocaleTextFunc(): js.Function = js.native
    
    def getMainMenuItemsFunc(): GetMainMenuItems = js.native
    
    def getMaxBlocksInCache(): Double = js.native
    
    def getMaxColWidth(): Double = js.native
    
    def getMaxConcurrentDatasourceRequests(): Double = js.native
    
    def getMinColWidth(): Double = js.native
    
    def getNavigateToNextCellFunc(): js.Function1[/* params */ NavigateToNextCellParams, GridCellDef] = js.native
    
    def getNodeChildDetailsFunc(): js.Function1[/* dataItem */ js.Any, NodeChildDetails] = js.native
    
    def getOverlayLoadingTemplate(): String = js.native
    
    def getOverlayNoRowsTemplate(): String = js.native
    
    def getPaginationNumberFormatterFunc(): js.Function1[/* params */ PaginationNumberFormatterParams, String] = js.native
    
    def getPaginationPageSize(): Double = js.native
    
    def getPinnedBottomRowData(): js.Array[js.Any] = js.native
    
    def getPinnedTopRowData(): js.Array[js.Any] = js.native
    
    def getPivotColumnGroupTotals(): String = js.native
    
    def getPivotGroupHeaderHeight(): Double = js.native
    
    def getPivotHeaderHeight(): Double = js.native
    
    def getPivotPanelShow(): String = js.native
    
    def getPivotRowTotals(): String = js.native
    
    def getPopupParent(): HTMLElement = js.native
    
    def getPostProcessPopupFunc(): js.Function1[/* params */ PostProcessPopupParams, Unit] = js.native
    
    def getPostSortFunc(): js.Function1[/* rowNodes */ js.Array[RowNode], Unit] = js.native
    
    def getProcessCellForClipboardFunc(): js.Function1[/* params */ ProcessCellForExportParams, js.Any] = js.native
    
    def getProcessCellFromClipboardFunc(): js.Function1[/* params */ ProcessCellForExportParams, js.Any] = js.native
    
    def getProcessDataFromClipboardFunc(): js.Function1[/* params */ ProcessDataFromClipboardParams, js.Array[js.Array[String]]] = js.native
    
    def getProcessHeaderForClipboardFunc(): js.Function1[/* params */ ProcessHeaderForExportParams, js.Any] = js.native
    
    def getProcessRowPostCreateFunc(): js.Any = js.native
    
    def getProcessSecondaryColDefFunc(): js.Function1[/* colDef */ ColDef, Unit] = js.native
    
    def getProcessSecondaryColGroupDefFunc(): js.Function1[/* colGroupDef */ ColGroupDef, Unit] = js.native
    
    def getQuickFilterText(): String = js.native
    
    def getRowBuffer(): Double = js.native
    
    def getRowClass(): String | js.Array[String] = js.native
    
    def getRowClassFunc(): js.Function1[/* params */ js.Any, String | js.Array[String]] = js.native
    
    def getRowData(): js.Array[js.Any] = js.native
    
    def getRowGroupPanelShow(): String = js.native
    
    def getRowHeightAsNumber(): Double = js.native
    
    def getRowHeightForNode(rowNode: RowNode): Double = js.native
    
    def getRowNodeIdFunc(): GetRowNodeIdFunc = js.native
    
    def getRowStyle(): js.Any = js.native
    
    def getRowStyleFunc(): js.Function = js.native
    
    def getScrollbarWidth(): Double = js.native
    
    def getSendToClipboardFunc(): js.Function1[/* params */ js.Any, Unit] = js.native
    
    def getServerSideDatasource(): IServerSideDatasource = js.native
    
    def getSortingOrder(): js.Array[String] = js.native
    
    def getTabToNextCellFunc(): js.Function1[/* params */ TabToNextCellParams, GridCellDef] = js.native
    
    def getViewportDatasource(): IViewportDatasource = js.native
    
    def getViewportRowModelBufferSize(): Double = js.native
    
    def getViewportRowModelPageSize(): Double = js.native
    
    def getVirtualItemHeight(): Double = js.native
    
    def globalEventHandler(eventName: String): Unit = js.native
    def globalEventHandler(eventName: String, event: js.Any): Unit = js.native
    
    /* private */ var gridApi: js.Any = js.native
    
    /* private */ var gridOptions: js.Any = js.native
    
    def init(): Unit = js.native
    
    def isAccentedSort(): Boolean = js.native
    
    def isAggregateOnlyChangedColumns(): Boolean = js.native
    
    def isAllowContextMenuWithControlKey(): Boolean = js.native
    
    def isAlwaysShowStatusBar(): Boolean = js.native
    
    def isAngularCompileFilters(): Boolean = js.native
    
    def isAngularCompileHeaders(): Boolean = js.native
    
    def isAngularCompileRows(): Boolean = js.native
    
    def isAnimateRows(): Boolean = js.native
    
    def isCacheQuickFilter(): Boolean = js.native
    
    def isContractColumnSelection(): Boolean = js.native
    
    def isDebug(): Boolean = js.native
    
    def isDeltaRowDataMode(): Boolean = js.native
    
    def isDynamicRowHeight(): Boolean = js.native
    
    def isEmbedFullWidthRows(): Boolean = js.native
    
    def isEnableCellChangeFlash(): Boolean = js.native
    
    def isEnableCellExpressions(): Boolean = js.native
    
    def isEnableColResize(): Boolean = js.native
    
    def isEnableFilter(): Boolean = js.native
    
    def isEnableGroupEdit(): Boolean = js.native
    
    def isEnableOldSetFilterModel(): Boolean = js.native
    
    def isEnableRangeSelection(): Boolean = js.native
    
    def isEnableRtl(): Boolean = js.native
    
    def isEnableServerSideFilter(): Boolean = js.native
    
    def isEnableServerSideSorting(): Boolean = js.native
    
    def isEnableSorting(): Boolean = js.native
    
    def isEnableStatusBar(): Boolean = js.native
    
    def isEnsureDomOrder(): Boolean = js.native
    
    def isEnterMovesDown(): Boolean = js.native
    
    def isEnterMovesDownAfterEdit(): Boolean = js.native
    
    def isEnterprise(): Boolean = js.native
    
    def isExternalFilterPresent(): Boolean = js.native
    
    def isFloatingFilter(): Boolean = js.native
    
    def isFullRowEdit(): Boolean = js.native
    
    def isFunctionsPassive(): Boolean = js.native
    
    def isFunctionsReadOnly(): Boolean = js.native
    
    def isGridAutoHeight(): Boolean = js.native
    
    def isGroupHideOpenParents(): Boolean = js.native
    
    def isGroupIncludeFooter(): Boolean = js.native
    
    def isGroupIncludeTotalFooter(): Boolean = js.native
    
    def isGroupMultiAutoColumn(): Boolean = js.native
    
    def isGroupRemoveLowestSingleChildren(): Boolean = js.native
    
    def isGroupRemoveSingleChildren(): Boolean = js.native
    
    def isGroupSelectsChildren(): Boolean = js.native
    
    def isGroupSelectsFiltered(): Boolean = js.native
    
    def isGroupSuppressAutoColumn(): Boolean = js.native
    
    def isGroupSuppressBlankHeader(): Boolean = js.native
    
    def isGroupSuppressRow(): Boolean = js.native
    
    def isGroupUseEntireRow(): Boolean = js.native
    
    def isMasterDetail(): Boolean = js.native
    
    def isMultiSortKeyCtrl(): Boolean = js.native
    
    /* private */ def isNumeric(value: js.Any): js.Any = js.native
    
    def isPagination(): Boolean = js.native
    
    def isPaginationAutoPageSize(): Boolean = js.native
    
    def isPivotMode(): Boolean = js.native
    
    def isPivotTotals(): Boolean = js.native
    
    def isPurgeClosedRowNodes(): Boolean = js.native
    
    def isRememberGroupStateWhenNewData(): Boolean = js.native
    
    def isRowDeselection(): Boolean = js.native
    
    def isRowDragManaged(): Boolean = js.native
    
    def isRowModelDefault(): Boolean = js.native
    
    def isRowModelInfinite(): Boolean = js.native
    
    def isRowModelServerSide(): Boolean = js.native
    
    def isRowModelViewport(): Boolean = js.native
    
    def isRowMultiSelectWithClick(): Boolean = js.native
    
    def isRowSelection(): Boolean = js.native
    
    def isRowSelectionMulti(): Boolean = js.native
    
    def isServerSideSortingAlwaysResets(): Boolean = js.native
    
    def isShowToolPanel(): Boolean = js.native
    
    def isSingleClickEdit(): Boolean = js.native
    
    def isStopEditingWhenGridLosesFocus(): Boolean = js.native
    
    def isSuppressAggAtRootLevel(): Boolean = js.native
    
    def isSuppressAggFuncInHeader(): Boolean = js.native
    
    def isSuppressAnimationFrame(): Boolean = js.native
    
    def isSuppressAutoSize(): Boolean = js.native
    
    def isSuppressCellSelection(): Boolean = js.native
    
    def isSuppressChangeDetection(): Boolean = js.native
    
    def isSuppressClickEdit(): Boolean = js.native
    
    def isSuppressClipboardPaste(): Boolean = js.native
    
    def isSuppressColumnMoveAnimation(): Boolean = js.native
    
    def isSuppressColumnVirtualisation(): Boolean = js.native
    
    def isSuppressContextMenu(): Boolean = js.native
    
    def isSuppressCopyRowsToClipboard(): Boolean = js.native
    
    def isSuppressCsvExport(): Boolean = js.native
    
    def isSuppressDragLeaveHidesColumns(): Boolean = js.native
    
    def isSuppressEnterpriseResetOnNewColumns(): Boolean = js.native
    
    def isSuppressExcelExport(): Boolean = js.native
    
    def isSuppressFieldDotNotation(): Boolean = js.native
    
    def isSuppressFocusAfterRefresh(): Boolean = js.native
    
    def isSuppressHorizontalScroll(): Boolean = js.native
    
    def isSuppressLoadingOverlay(): Boolean = js.native
    
    def isSuppressMakeColumnVisibleAfterUnGroup(): Boolean = js.native
    
    def isSuppressMenuHide(): Boolean = js.native
    
    def isSuppressMiddleClickScrolls(): Boolean = js.native
    
    def isSuppressMovableColumns(): Boolean = js.native
    
    def isSuppressMultiRangeSelection(): Boolean = js.native
    
    def isSuppressMultiSort(): Boolean = js.native
    
    def isSuppressNoRowsOverlay(): Boolean = js.native
    
    def isSuppressPaginationPanel(): Boolean = js.native
    
    def isSuppressParentsInRowNodes(): Boolean = js.native
    
    def isSuppressPreventDefaultOnMouseWheel(): Boolean = js.native
    
    def isSuppressRowClickSelection(): Boolean = js.native
    
    def isSuppressRowDrag(): Boolean = js.native
    
    def isSuppressRowHoverHighlight(): Boolean = js.native
    
    def isSuppressRowTransform(): Boolean = js.native
    
    def isSuppressScrollOnNewData(): Boolean = js.native
    
    def isSuppressTabbing(): Boolean = js.native
    
    def isSuppressTouch(): Boolean = js.native
    
    def isToolPanelSuppressColumnExpandAll(): Boolean = js.native
    
    def isToolPanelSuppressColumnFilter(): Boolean = js.native
    
    def isToolPanelSuppressColumnSelectAll(): Boolean = js.native
    
    def isToolPanelSuppressPivotMode(): Boolean = js.native
    
    def isToolPanelSuppressPivots(): Boolean = js.native
    
    def isToolPanelSuppressRowGroups(): Boolean = js.native
    
    def isToolPanelSuppressSideButtons(): Boolean = js.native
    
    def isToolPanelSuppressValues(): Boolean = js.native
    
    def isTreeData(): Boolean = js.native
    
    def isUnSortIcon(): Boolean = js.native
    
    def isValueCache(): Boolean = js.native
    
    def isValueCacheNeverExpires(): Boolean = js.native
    
    /* private */ var layoutElements: js.Any = js.native
    
    /* private */ var propertyEventService: js.Any = js.native
    
    def removeEventListener(key: String, listener: js.Function): Unit = js.native
    
    def rowClassRules(): StringDictionary[String | js.Function] = js.native
    
    def setDomData(element: Element, key: String, value: js.Any): js.Any = js.native
    
    def setProperty(key: String, value: js.Any): Unit = js.native
    
    /* private */ def specialForNewMaterial(defaultValue: js.Any, sassVariableName: js.Any): js.Any = js.native
    
    /* private */ def updateLayoutClasses(): js.Any = js.native
    
    def useAsyncEvents(): Boolean = js.native
  }
  /* static members */
  object GridOptionsWrapper {
    
    @JSImport("ag-grid/dist/lib/gridOptionsWrapper", "GridOptionsWrapper")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ag-grid/dist/lib/gridOptionsWrapper", "GridOptionsWrapper.MIN_COL_WIDTH")
    @js.native
    def MIN_COL_WIDTH: js.Any = js.native
    inline def MIN_COL_WIDTH_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN_COL_WIDTH")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/gridOptionsWrapper", "GridOptionsWrapper.PROP_FLOATING_FILTERS_HEIGHT")
    @js.native
    def PROP_FLOATING_FILTERS_HEIGHT: String = js.native
    inline def PROP_FLOATING_FILTERS_HEIGHT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROP_FLOATING_FILTERS_HEIGHT")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/gridOptionsWrapper", "GridOptionsWrapper.PROP_GRID_AUTO_HEIGHT")
    @js.native
    def PROP_GRID_AUTO_HEIGHT: String = js.native
    inline def PROP_GRID_AUTO_HEIGHT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROP_GRID_AUTO_HEIGHT")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/gridOptionsWrapper", "GridOptionsWrapper.PROP_GROUP_HEADER_HEIGHT")
    @js.native
    def PROP_GROUP_HEADER_HEIGHT: String = js.native
    inline def PROP_GROUP_HEADER_HEIGHT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROP_GROUP_HEADER_HEIGHT")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/gridOptionsWrapper", "GridOptionsWrapper.PROP_GROUP_REMOVE_LOWEST_SINGLE_CHILDREN")
    @js.native
    def PROP_GROUP_REMOVE_LOWEST_SINGLE_CHILDREN: String = js.native
    inline def PROP_GROUP_REMOVE_LOWEST_SINGLE_CHILDREN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROP_GROUP_REMOVE_LOWEST_SINGLE_CHILDREN")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/gridOptionsWrapper", "GridOptionsWrapper.PROP_GROUP_REMOVE_SINGLE_CHILDREN")
    @js.native
    def PROP_GROUP_REMOVE_SINGLE_CHILDREN: String = js.native
    inline def PROP_GROUP_REMOVE_SINGLE_CHILDREN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROP_GROUP_REMOVE_SINGLE_CHILDREN")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/gridOptionsWrapper", "GridOptionsWrapper.PROP_HEADER_HEIGHT")
    @js.native
    def PROP_HEADER_HEIGHT: String = js.native
    inline def PROP_HEADER_HEIGHT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROP_HEADER_HEIGHT")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/gridOptionsWrapper", "GridOptionsWrapper.PROP_PIVOT_GROUP_HEADER_HEIGHT")
    @js.native
    def PROP_PIVOT_GROUP_HEADER_HEIGHT: String = js.native
    inline def PROP_PIVOT_GROUP_HEADER_HEIGHT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROP_PIVOT_GROUP_HEADER_HEIGHT")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/gridOptionsWrapper", "GridOptionsWrapper.PROP_PIVOT_HEADER_HEIGHT")
    @js.native
    def PROP_PIVOT_HEADER_HEIGHT: String = js.native
    inline def PROP_PIVOT_HEADER_HEIGHT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROP_PIVOT_HEADER_HEIGHT")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/gridOptionsWrapper", "GridOptionsWrapper.PROP_POPUP_PARENT")
    @js.native
    def PROP_POPUP_PARENT: String = js.native
    inline def PROP_POPUP_PARENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROP_POPUP_PARENT")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/gridOptionsWrapper", "GridOptionsWrapper.PROP_SUPPRESS_CLIPBOARD_PASTE")
    @js.native
    def PROP_SUPPRESS_CLIPBOARD_PASTE: String = js.native
    inline def PROP_SUPPRESS_CLIPBOARD_PASTE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROP_SUPPRESS_CLIPBOARD_PASTE")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/gridOptionsWrapper", "GridOptionsWrapper.PROP_SUPPRESS_ROW_DRAG")
    @js.native
    def PROP_SUPPRESS_ROW_DRAG: String = js.native
    inline def PROP_SUPPRESS_ROW_DRAG_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROP_SUPPRESS_ROW_DRAG")(x.asInstanceOf[js.Any])
    
    inline def checkEventDeprecation(eventName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkEventDeprecation")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  trait PropertyChangedEvent
    extends StObject
       with AgEvent {
    
    var currentValue: js.Any
    
    var previousValue: js.Any
  }
  object PropertyChangedEvent {
    
    inline def apply(currentValue: js.Any, previousValue: js.Any, `type`: String): PropertyChangedEvent = {
      val __obj = js.Dynamic.literal(currentValue = currentValue.asInstanceOf[js.Any], previousValue = previousValue.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropertyChangedEvent]
    }
    
    extension [Self <: PropertyChangedEvent](x: Self) {
      
      inline def setCurrentValue(value: js.Any): Self = StObject.set(x, "currentValue", value.asInstanceOf[js.Any])
      
      inline def setPreviousValue(value: js.Any): Self = StObject.set(x, "previousValue", value.asInstanceOf[js.Any])
    }
  }
}
