package typings
package agDashGridLib.distLibEntitiesGridOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridOptions
  extends agDashGridLib.distLibComponentsFrameworkComponentResolverMod.ComponentHolder {
  var accentedSort: js.UndefOr[scala.Boolean] = js.undefined
  var aggFuncs: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[agDashGridLib.distLibEntitiesColDefMod.IAggFunc]
  ] = js.undefined
  var aggregateOnlyChangedColumns: js.UndefOr[scala.Boolean] = js.undefined
  var alignedGrids: js.UndefOr[js.Array[GridOptions]] = js.undefined
  var allowContextMenuWithControlKey: js.UndefOr[scala.Boolean] = js.undefined
  var alwaysShowStatusBar: js.UndefOr[scala.Boolean] = js.undefined
  var angularCompileFilters: js.UndefOr[scala.Boolean] = js.undefined
  var angularCompileHeaders: js.UndefOr[scala.Boolean] = js.undefined
  var angularCompileRows: js.UndefOr[scala.Boolean] = js.undefined
  var animateRows: js.UndefOr[scala.Boolean] = js.undefined
  /****************************************************************
    * Don't forget to update ComponentUtil if changing this class. *
    ****************************************************************/
  var api: js.UndefOr[agDashGridLib.distLibGridApiMod.GridApi] = js.undefined
  var autoGroupColumnDef: js.UndefOr[agDashGridLib.distLibEntitiesColDefMod.ColDef] = js.undefined
  var autoSizePadding: js.UndefOr[scala.Double] = js.undefined
  var batchUpdateWaitMillis: js.UndefOr[scala.Double] = js.undefined
  var cacheBlockSize: js.UndefOr[scala.Double] = js.undefined
  var cacheOverflowSize: js.UndefOr[scala.Double] = js.undefined
  var cacheQuickFilter: js.UndefOr[scala.Boolean] = js.undefined
  var clipboardDeliminator: js.UndefOr[java.lang.String] = js.undefined
  var colResizeDefault: js.UndefOr[java.lang.String] = js.undefined
  var colWidth: js.UndefOr[scala.Double] = js.undefined
  var columnApi: js.UndefOr[agDashGridLib.distLibColumnControllerColumnApiMod.ColumnApi] = js.undefined
  var columnDefs: js.UndefOr[
    js.Array[
      agDashGridLib.distLibEntitiesColDefMod.ColDef | agDashGridLib.distLibEntitiesColDefMod.ColGroupDef
    ]
  ] = js.undefined
  var columnTypes: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[agDashGridLib.distLibEntitiesColDefMod.ColDef]
  ] = js.undefined
  var components: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[
      agDashGridLib.distLibComponentsFrameworkComponentProviderMod.AgGridRegisteredComponentInput[agDashGridLib.distLibInterfacesIComponentMod.IComponent[_]]
    ]
  ] = js.undefined
  /****************************************************************
    * Don't forget to update ComponentUtil if changing this class. *
    ****************************************************************/
  var context: js.UndefOr[js.Any] = js.undefined
  var contractColumnSelection: js.UndefOr[scala.Boolean] = js.undefined
  var datasource: js.UndefOr[agDashGridLib.distLibRowModelsIDatasourceMod.IDatasource] = js.undefined
  var dateComponent: js.UndefOr[agDashGridLib.Anon_IDateComp] = js.undefined
  var dateComponentFramework: js.UndefOr[js.Any] = js.undefined
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  var defaultColDef: js.UndefOr[agDashGridLib.distLibEntitiesColDefMod.ColDef] = js.undefined
  var defaultColGroupDef: js.UndefOr[agDashGridLib.distLibEntitiesColDefMod.ColGroupDef] = js.undefined
  var defaultExportParams: js.UndefOr[agDashGridLib.distLibExportParamsMod.CsvExportParams] = js.undefined
  var defaultGroupSortComparator: js.UndefOr[
    js.Function2[
      /* nodeA */ agDashGridLib.distLibEntitiesRowNodeMod.RowNode, 
      /* nodeB */ agDashGridLib.distLibEntitiesRowNodeMod.RowNode, 
      scala.Double
    ]
  ] = js.undefined
  var deltaRowDataMode: js.UndefOr[scala.Boolean] = js.undefined
  var detailCellRenderer: js.UndefOr[
    agDashGridLib.Anon_ICellRendererComp | agDashGridLib.distLibRenderingCellRenderersICellRendererMod.ICellRendererFunc | java.lang.String
  ] = js.undefined
  var detailCellRendererFramework: js.UndefOr[js.Any] = js.undefined
  var detailCellRendererParams: js.UndefOr[js.Any] = js.undefined
  var detailRowHeight: js.UndefOr[scala.Double] = js.undefined
  var doesDataFlower: js.UndefOr[js.Function1[/* dataItem */ js.Any, scala.Boolean]] = js.undefined
  var doesExternalFilterPass: js.UndefOr[
    js.Function1[/* node */ agDashGridLib.distLibEntitiesRowNodeMod.RowNode, scala.Boolean]
  ] = js.undefined
  var domLayout: js.UndefOr[java.lang.String] = js.undefined
  var editType: js.UndefOr[java.lang.String] = js.undefined
  var embedFullWidthRows: js.UndefOr[scala.Boolean] = js.undefined
  var enableCellChangeFlash: js.UndefOr[scala.Boolean] = js.undefined
  var enableCellExpressions: js.UndefOr[scala.Boolean] = js.undefined
  var enableColResize: js.UndefOr[scala.Boolean] = js.undefined
  var enableFilter: js.UndefOr[scala.Boolean] = js.undefined
  var enableGroupEdit: js.UndefOr[scala.Boolean] = js.undefined
  var enableOldSetFilterModel: js.UndefOr[scala.Boolean] = js.undefined
  var enableRangeSelection: js.UndefOr[scala.Boolean] = js.undefined
  var enableRtl: js.UndefOr[scala.Boolean] = js.undefined
  var enableServerSideFilter: js.UndefOr[scala.Boolean] = js.undefined
  var enableServerSideSorting: js.UndefOr[scala.Boolean] = js.undefined
  var enableSorting: js.UndefOr[scala.Boolean] = js.undefined
  var enableStatusBar: js.UndefOr[scala.Boolean] = js.undefined
  var ensureDomOrder: js.UndefOr[scala.Boolean] = js.undefined
  var enterMovesDown: js.UndefOr[scala.Boolean] = js.undefined
  var enterMovesDownAfterEdit: js.UndefOr[scala.Boolean] = js.undefined
  var excelStyles: js.UndefOr[js.Array[_]] = js.undefined
  var floatingFilter: js.UndefOr[scala.Boolean] = js.undefined
  var floatingFiltersHeight: js.UndefOr[scala.Double] = js.undefined
  var forPrint: js.UndefOr[scala.Boolean] = js.undefined
  var frameworkComponents: js.UndefOr[org.scalablytyped.runtime.StringDictionary[agDashGridLib.Anon_Any]] = js.undefined
  var fullWidthCellRenderer: js.UndefOr[
    agDashGridLib.Anon_ICellRendererComp | agDashGridLib.distLibRenderingCellRenderersICellRendererMod.ICellRendererFunc | java.lang.String
  ] = js.undefined
  var fullWidthCellRendererFramework: js.UndefOr[js.Any] = js.undefined
  var fullWidthCellRendererParams: js.UndefOr[js.Any] = js.undefined
  var functionsPassive: js.UndefOr[scala.Boolean] = js.undefined
  var functionsReadOnly: js.UndefOr[scala.Boolean] = js.undefined
  var getBusinessKeyForNode: js.UndefOr[
    js.Function1[/* node */ agDashGridLib.distLibEntitiesRowNodeMod.RowNode, java.lang.String]
  ] = js.undefined
  var getChildCount: js.UndefOr[js.Function1[/* dataItem */ js.Any, scala.Double]] = js.undefined
  var getContextMenuItems: js.UndefOr[GetContextMenuItems] = js.undefined
  var getDataPath: js.UndefOr[GetDataPath] = js.undefined
  var getDocument: js.UndefOr[js.Function0[stdLib.Document]] = js.undefined
  var getMainMenuItems: js.UndefOr[GetMainMenuItems] = js.undefined
  var getNodeChildDetails: js.UndefOr[GetNodeChildDetails] = js.undefined
  var getRowClass: js.UndefOr[js.Function1[/* params */ js.Any, java.lang.String | js.Array[java.lang.String]]] = js.undefined
  var getRowHeight: js.UndefOr[js.Function] = js.undefined
  var getRowNodeId: js.UndefOr[GetRowNodeIdFunc] = js.undefined
  var getRowStyle: js.UndefOr[js.Function] = js.undefined
  var gridAutoHeight: js.UndefOr[scala.Boolean] = js.undefined
  var groupColumnDef: js.UndefOr[agDashGridLib.distLibEntitiesColDefMod.ColDef] = js.undefined
  var groupDefaultExpanded: js.UndefOr[scala.Double] = js.undefined
  var groupHeaderHeight: js.UndefOr[scala.Double] = js.undefined
  var groupHideOpenParents: js.UndefOr[scala.Boolean] = js.undefined
  var groupIncludeFooter: js.UndefOr[scala.Boolean] = js.undefined
  var groupIncludeTotalFooter: js.UndefOr[scala.Boolean] = js.undefined
  var groupMultiAutoColumn: js.UndefOr[scala.Boolean] = js.undefined
  var groupRemoveLowestSingleChildren: js.UndefOr[scala.Boolean] = js.undefined
  var groupRemoveSingleChildren: js.UndefOr[scala.Boolean] = js.undefined
  var groupRowAggNodes: js.UndefOr[
    js.Function1[/* nodes */ js.Array[agDashGridLib.distLibEntitiesRowNodeMod.RowNode], _]
  ] = js.undefined
  var groupRowInnerRenderer: js.UndefOr[
    agDashGridLib.Anon_ICellRendererComp | agDashGridLib.distLibRenderingCellRenderersICellRendererMod.ICellRendererFunc | java.lang.String
  ] = js.undefined
  var groupRowInnerRendererFramework: js.UndefOr[js.Any] = js.undefined
  var groupRowRenderer: js.UndefOr[
    agDashGridLib.Anon_ICellRendererComp | agDashGridLib.distLibRenderingCellRenderersICellRendererMod.ICellRendererFunc | java.lang.String
  ] = js.undefined
  var groupRowRendererFramework: js.UndefOr[js.Any] = js.undefined
  var groupRowRendererParams: js.UndefOr[js.Any] = js.undefined
  var groupSelectsChildren: js.UndefOr[scala.Boolean] = js.undefined
  var groupSelectsFiltered: js.UndefOr[scala.Boolean] = js.undefined
  /****************************************************************
    * Don't forget to update ComponentUtil if changing this class. *
    ****************************************************************/
  var groupSuppressAutoColumn: js.UndefOr[scala.Boolean] = js.undefined
  var groupSuppressBlankHeader: js.UndefOr[scala.Boolean] = js.undefined
  var groupSuppressRow: js.UndefOr[scala.Boolean] = js.undefined
  var groupUseEntireRow: js.UndefOr[scala.Boolean] = js.undefined
  var headerHeight: js.UndefOr[scala.Double] = js.undefined
  var icons: js.UndefOr[js.Any] = js.undefined
  var infiniteInitialRowCount: js.UndefOr[scala.Double] = js.undefined
  var isExternalFilterPresent: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  var isFullWidthCell: js.UndefOr[
    js.Function1[/* rowNode */ agDashGridLib.distLibEntitiesRowNodeMod.RowNode, scala.Boolean]
  ] = js.undefined
  var isRowMaster: js.UndefOr[IsRowMaster] = js.undefined
  var isRowSelectable: js.UndefOr[IsRowSelectable] = js.undefined
  var loadingOverlayComponent: js.UndefOr[agDashGridLib.Anon_ILoadingOverlayComp | java.lang.String] = js.undefined
  var loadingOverlayComponentFramework: js.UndefOr[js.Any] = js.undefined
  /****************************************************************
    * Don't forget to update ComponentUtil if changing this class. *
    ****************************************************************/
  var localeText: js.UndefOr[js.Any] = js.undefined
  var localeTextFunc: js.UndefOr[js.Function] = js.undefined
  var masterDetail: js.UndefOr[scala.Boolean] = js.undefined
  var maxBlocksInCache: js.UndefOr[scala.Double] = js.undefined
  var maxColWidth: js.UndefOr[scala.Double] = js.undefined
  var maxConcurrentDatasourceRequests: js.UndefOr[scala.Double] = js.undefined
  var minColWidth: js.UndefOr[scala.Double] = js.undefined
  var multiSortKey: js.UndefOr[java.lang.String] = js.undefined
  var navigateToNextCell: js.UndefOr[
    js.Function1[
      /* params */ NavigateToNextCellParams, 
      agDashGridLib.distLibEntitiesGridCellMod.GridCellDef
    ]
  ] = js.undefined
  var noRowsOverlayComponent: js.UndefOr[agDashGridLib.Anon_INoRowsOverlayComp | java.lang.String] = js.undefined
  var noRowsOverlayComponentFramework: js.UndefOr[js.Any] = js.undefined
  var onBodyScroll: js.UndefOr[
    js.Function1[/* event */ agDashGridLib.distLibEventsMod.BodyScrollEvent, scala.Unit]
  ] = js.undefined
  var onCellClicked: js.UndefOr[
    js.Function1[/* event */ agDashGridLib.distLibEventsMod.CellClickedEvent, scala.Unit]
  ] = js.undefined
  var onCellContextMenu: js.UndefOr[
    js.Function1[/* event */ agDashGridLib.distLibEventsMod.CellContextMenuEvent, scala.Unit]
  ] = js.undefined
  var onCellDoubleClicked: js.UndefOr[
    js.Function1[/* event */ agDashGridLib.distLibEventsMod.CellDoubleClickedEvent, scala.Unit]
  ] = js.undefined
  var onCellEditingStarted: js.UndefOr[
    js.Function1[/* event */ agDashGridLib.distLibEventsMod.CellEditingStartedEvent, scala.Unit]
  ] = js.undefined
  var onCellEditingStopped: js.UndefOr[
    js.Function1[/* event */ agDashGridLib.distLibEventsMod.CellEditingStoppedEvent, scala.Unit]
  ] = js.undefined
  var onCellFocused: js.UndefOr[
    js.Function1[/* event */ agDashGridLib.distLibEventsMod.CellFocusedEvent, scala.Unit]
  ] = js.undefined
  var onCellMouseDown: js.UndefOr[
    js.Function1[/* event */ agDashGridLib.distLibEventsMod.CellMouseDownEvent, scala.Unit]
  ] = js.undefined
  var onCellMouseOut: js.UndefOr[
    js.Function1[/* event */ agDashGridLib.distLibEventsMod.CellMouseOutEvent, scala.Unit]
  ] = js.undefined
  var onCellMouseOver: js.UndefOr[
    js.Function1[/* event */ agDashGridLib.distLibEventsMod.CellMouseOverEvent, scala.Unit]
  ] = js.undefined
  var onCellValueChanged: js.UndefOr[
    js.Function1[/* event */ agDashGridLib.distLibEventsMod.CellValueChangedEvent, scala.Unit]
  ] = js.undefined
  var onColumnAggFuncChangeRequest: js.UndefOr[
    js.Function1[
      /* event */ agDashGridLib.distLibEventsMod.ColumnAggFuncChangeRequestEvent, 
      scala.Unit
    ]
  ] = js.undefined
  /****************************************************************
    * Don't forget to update ComponentUtil if changing this class. *
    ****************************************************************/
  var onColumnEverythingChanged: js.UndefOr[
    js.Function1[
      /* event */ agDashGridLib.distLibEventsMod.ColumnEverythingChangedEvent, 
      scala.Unit
    ]
  ] = js.undefined
  var onColumnGroupOpened: js.UndefOr[
    js.Function1[/* event */ agDashGridLib.distLibEventsMod.ColumnGroupOpenedEvent, scala.Unit]
  ] = js.undefined
  var onColumnMoved: js.UndefOr[
    js.Function1[/* event */ agDashGridLib.distLibEventsMod.ColumnMovedEvent, scala.Unit]
  ] = js.undefined
  var onColumnPinned: js.UndefOr[
    js.Function1[/* event */ agDashGridLib.distLibEventsMod.ColumnPinnedEvent, scala.Unit]
  ] = js.undefined
  var onColumnPivotChangeRequest: js.UndefOr[
    js.Function1[
      /* event */ agDashGridLib.distLibEventsMod.ColumnPivotChangeRequestEvent, 
      scala.Unit
    ]
  ] = js.undefined
  var onColumnPivotChanged: js.UndefOr[
    js.Function1[/* event */ agDashGridLib.distLibEventsMod.ColumnPivotChangedEvent, scala.Unit]
  ] = js.undefined
  var onColumnPivotModeChanged: js.UndefOr[
    js.Function1[/* event */ agDashGridLib.distLibEventsMod.ColumnPivotModeChangedEvent, scala.Unit]
  ] = js.undefined
  var onColumnResized: js.UndefOr[
    js.Function1[/* event */ agDashGridLib.distLibEventsMod.ColumnResizedEvent, scala.Unit]
  ] = js.undefined
  var onColumnRowGroupChangeRequest: js.UndefOr[
    js.Function1[
      /* event */ agDashGridLib.distLibEventsMod.ColumnRowGroupChangeRequestEvent, 
      scala.Unit
    ]
  ] = js.undefined
  var onColumnRowGroupChanged: js.UndefOr[
    js.Function1[/* event */ agDashGridLib.distLibEventsMod.ColumnRowGroupChangedEvent, scala.Unit]
  ] = js.undefined
  var onColumnValueChangeRequest: js.UndefOr[
    js.Function1[
      /* event */ agDashGridLib.distLibEventsMod.ColumnValueChangeRequestEvent, 
      scala.Unit
    ]
  ] = js.undefined
  var onColumnValueChanged: js.UndefOr[
    js.Function1[/* event */ agDashGridLib.distLibEventsMod.ColumnValueChangedEvent, scala.Unit]
  ] = js.undefined
  var onColumnVisible: js.UndefOr[
    js.Function1[/* event */ agDashGridLib.distLibEventsMod.ColumnVisibleEvent, scala.Unit]
  ] = js.undefined
  var onDisplayedColumnsChanged: js.UndefOr[
    js.Function1[
      /* event */ agDashGridLib.distLibEventsMod.DisplayedColumnsChangedEvent, 
      scala.Unit
    ]
  ] = js.undefined
  var onDragStarted: js.UndefOr[
    js.Function1[/* event */ agDashGridLib.distLibEventsMod.DragStartedEvent, scala.Unit]
  ] = js.undefined
  var onDragStopped: js.UndefOr[
    js.Function1[/* event */ agDashGridLib.distLibEventsMod.DragStoppedEvent, scala.Unit]
  ] = js.undefined
  var onFilterChanged: js.UndefOr[
    js.Function1[/* event */ agDashGridLib.distLibEventsMod.FilterChangedEvent, scala.Unit]
  ] = js.undefined
  var onFilterModified: js.UndefOr[
    js.Function1[/* event */ agDashGridLib.distLibEventsMod.FilterModifiedEvent, scala.Unit]
  ] = js.undefined
  var onGridColumnsChanged: js.UndefOr[
    js.Function1[/* event */ agDashGridLib.distLibEventsMod.GridColumnsChangedEvent, scala.Unit]
  ] = js.undefined
  var onGridReady: js.UndefOr[
    js.Function1[/* event */ agDashGridLib.distLibEventsMod.GridReadyEvent, scala.Unit]
  ] = js.undefined
  var onGridSizeChanged: js.UndefOr[js.Function1[/* event */ js.Any, scala.Unit]] = js.undefined
  var onModelUpdated: js.UndefOr[
    js.Function1[/* event */ agDashGridLib.distLibEventsMod.ModelUpdatedEvent, scala.Unit]
  ] = js.undefined
  var onNewColumnsLoaded: js.UndefOr[
    js.Function1[/* event */ agDashGridLib.distLibEventsMod.NewColumnsLoadedEvent, scala.Unit]
  ] = js.undefined
  var onPaginationChanged: js.UndefOr[
    js.Function1[/* event */ agDashGridLib.distLibEventsMod.PaginationChangedEvent, scala.Unit]
  ] = js.undefined
  var onPasteEnd: js.UndefOr[
    js.Function1[/* event */ agDashGridLib.distLibEventsMod.PasteEndEvent, scala.Unit]
  ] = js.undefined
  var onPasteStart: js.UndefOr[
    js.Function1[/* event */ agDashGridLib.distLibEventsMod.PasteStartEvent, scala.Unit]
  ] = js.undefined
  var onPinnedRowDataChanged: js.UndefOr[
    js.Function1[/* event */ agDashGridLib.distLibEventsMod.PinnedRowDataChangedEvent, scala.Unit]
  ] = js.undefined
  var onRangeSelectionChanged: js.UndefOr[
    js.Function1[/* event */ agDashGridLib.distLibEventsMod.RangeSelectionChangedEvent, scala.Unit]
  ] = js.undefined
  var onRowClicked: js.UndefOr[
    js.Function1[/* event */ agDashGridLib.distLibEventsMod.RowClickedEvent, scala.Unit]
  ] = js.undefined
  var onRowDataChanged: js.UndefOr[
    js.Function1[/* event */ agDashGridLib.distLibEventsMod.RowDataChangedEvent, scala.Unit]
  ] = js.undefined
  var onRowDataUpdated: js.UndefOr[
    js.Function1[/* event */ agDashGridLib.distLibEventsMod.RowDataUpdatedEvent, scala.Unit]
  ] = js.undefined
  var onRowDoubleClicked: js.UndefOr[
    js.Function1[/* event */ agDashGridLib.distLibEventsMod.RowDoubleClickedEvent, scala.Unit]
  ] = js.undefined
  var onRowDragEnd: js.UndefOr[
    js.Function1[/* event */ agDashGridLib.distLibEventsMod.RowDragEvent, scala.Unit]
  ] = js.undefined
  var onRowDragEnter: js.UndefOr[
    js.Function1[/* event */ agDashGridLib.distLibEventsMod.RowDragEvent, scala.Unit]
  ] = js.undefined
  var onRowDragLeave: js.UndefOr[
    js.Function1[/* event */ agDashGridLib.distLibEventsMod.RowDragEvent, scala.Unit]
  ] = js.undefined
  var onRowDragMove: js.UndefOr[
    js.Function1[/* event */ agDashGridLib.distLibEventsMod.RowDragEvent, scala.Unit]
  ] = js.undefined
  var onRowEditingStarted: js.UndefOr[
    js.Function1[/* event */ agDashGridLib.distLibEventsMod.RowEditingStartedEvent, scala.Unit]
  ] = js.undefined
  var onRowEditingStopped: js.UndefOr[
    js.Function1[/* event */ agDashGridLib.distLibEventsMod.RowEditingStoppedEvent, scala.Unit]
  ] = js.undefined
  var onRowGroupOpened: js.UndefOr[
    js.Function1[/* event */ agDashGridLib.distLibEventsMod.RowGroupOpenedEvent, scala.Unit]
  ] = js.undefined
  var onRowSelected: js.UndefOr[
    js.Function1[/* event */ agDashGridLib.distLibEventsMod.RowSelectedEvent, scala.Unit]
  ] = js.undefined
  var onRowValueChanged: js.UndefOr[
    js.Function1[/* event */ agDashGridLib.distLibEventsMod.RowValueChangedEvent, scala.Unit]
  ] = js.undefined
  var onSelectionChanged: js.UndefOr[
    js.Function1[/* event */ agDashGridLib.distLibEventsMod.SelectionChangedEvent, scala.Unit]
  ] = js.undefined
  var onSortChanged: js.UndefOr[
    js.Function1[/* event */ agDashGridLib.distLibEventsMod.SortChangedEvent, scala.Unit]
  ] = js.undefined
  var onViewportChanged: js.UndefOr[
    js.Function1[/* event */ agDashGridLib.distLibEventsMod.ViewportChangedEvent, scala.Unit]
  ] = js.undefined
  var onVirtualColumnsChanged: js.UndefOr[
    js.Function1[/* event */ agDashGridLib.distLibEventsMod.VirtualColumnsChangedEvent, scala.Unit]
  ] = js.undefined
  var onVirtualRowRemoved: js.UndefOr[
    js.Function1[/* event */ agDashGridLib.distLibEventsMod.VirtualRowRemovedEvent, scala.Unit]
  ] = js.undefined
  var overlayLoadingTemplate: js.UndefOr[java.lang.String] = js.undefined
  var overlayNoRowsTemplate: js.UndefOr[java.lang.String] = js.undefined
  var pagination: js.UndefOr[scala.Boolean] = js.undefined
  var paginationAutoPageSize: js.UndefOr[scala.Boolean] = js.undefined
  /****************************************************************
    * Don't forget to update ComponentUtil if changing this class. *
    ****************************************************************/
  var paginationNumberFormatter: js.UndefOr[js.Function1[/* params */ PaginationNumberFormatterParams, java.lang.String]] = js.undefined
  var paginationPageSize: js.UndefOr[scala.Double] = js.undefined
  var paginationStartPage: js.UndefOr[scala.Double] = js.undefined
  var pinnedBottomRowData: js.UndefOr[js.Array[_]] = js.undefined
  var pinnedTopRowData: js.UndefOr[js.Array[_]] = js.undefined
  var pivotColumnGroupTotals: js.UndefOr[java.lang.String] = js.undefined
  var pivotGroupHeaderHeight: js.UndefOr[scala.Double] = js.undefined
  var pivotHeaderHeight: js.UndefOr[scala.Double] = js.undefined
  var pivotMode: js.UndefOr[scala.Boolean] = js.undefined
  var pivotPanelShow: js.UndefOr[java.lang.String] = js.undefined
  var pivotRowTotals: js.UndefOr[java.lang.String] = js.undefined
  var pivotTotals: js.UndefOr[scala.Boolean] = js.undefined
  var popupParent: js.UndefOr[stdLib.HTMLElement] = js.undefined
  var postProcessPopup: js.UndefOr[js.Function1[/* params */ PostProcessPopupParams, scala.Unit]] = js.undefined
  var postSort: js.UndefOr[
    js.Function1[/* nodes */ js.Array[agDashGridLib.distLibEntitiesRowNodeMod.RowNode], scala.Unit]
  ] = js.undefined
  var processCellForClipboard: js.UndefOr[
    js.Function1[/* params */ agDashGridLib.distLibExportParamsMod.ProcessCellForExportParams, _]
  ] = js.undefined
  var processCellFromClipboard: js.UndefOr[
    js.Function1[/* params */ agDashGridLib.distLibExportParamsMod.ProcessCellForExportParams, _]
  ] = js.undefined
  var processDataFromClipboard: js.UndefOr[
    js.Function1[/* params */ ProcessDataFromClipboardParams, js.Array[js.Array[java.lang.String]]]
  ] = js.undefined
  var processHeaderForClipboard: js.UndefOr[
    js.Function1[/* params */ agDashGridLib.distLibExportParamsMod.ProcessHeaderForExportParams, _]
  ] = js.undefined
  var processRowPostCreate: js.UndefOr[js.Function1[/* params */ ProcessRowParams, scala.Unit]] = js.undefined
  var processSecondaryColDef: js.UndefOr[
    js.Function1[/* colDef */ agDashGridLib.distLibEntitiesColDefMod.ColDef, scala.Unit]
  ] = js.undefined
  var processSecondaryColGroupDef: js.UndefOr[
    js.Function1[/* colGroupDef */ agDashGridLib.distLibEntitiesColDefMod.ColGroupDef, scala.Unit]
  ] = js.undefined
  var purgeClosedRowNodes: js.UndefOr[scala.Boolean] = js.undefined
  var quickFilterText: js.UndefOr[java.lang.String] = js.undefined
  var rememberGroupStateWhenNewData: js.UndefOr[scala.Boolean] = js.undefined
  var rowBuffer: js.UndefOr[scala.Double] = js.undefined
  var rowClass: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var rowClassRules: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Function | java.lang.String]] = js.undefined
  /****************************************************************
    * Don't forget to update ComponentUtil if changing this class. *
    ****************************************************************/
  var rowData: js.UndefOr[js.Array[_]] = js.undefined
  var rowDeselection: js.UndefOr[scala.Boolean] = js.undefined
  /****************************************************************
    * Don't forget to update ComponentUtil if changing this class. PLEASE!*
    ****************************************************************/
  var rowDragManaged: js.UndefOr[scala.Boolean] = js.undefined
  var rowGroupPanelShow: js.UndefOr[java.lang.String] = js.undefined
  var rowHeight: js.UndefOr[scala.Double] = js.undefined
  var rowModelType: js.UndefOr[java.lang.String] = js.undefined
  var rowMultiSelectWithClick: js.UndefOr[scala.Boolean] = js.undefined
  var rowSelection: js.UndefOr[java.lang.String] = js.undefined
  var rowStyle: js.UndefOr[js.Any] = js.undefined
  var scrollbarWidth: js.UndefOr[scala.Double] = js.undefined
  var sendToClipboard: js.UndefOr[js.Function1[/* params */ js.Any, scala.Unit]] = js.undefined
  var serverSideDatasource: js.UndefOr[agDashGridLib.distLibInterfacesIServerSideDatasourceMod.IServerSideDatasource] = js.undefined
  var serverSideSortingAlwaysResets: js.UndefOr[scala.Boolean] = js.undefined
  var showToolPanel: js.UndefOr[scala.Boolean] = js.undefined
  var singleClickEdit: js.UndefOr[scala.Boolean] = js.undefined
  var slaveGrids: js.UndefOr[js.Array[GridOptions]] = js.undefined
  var sortingOrder: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var stopEditingWhenGridLosesFocus: js.UndefOr[scala.Boolean] = js.undefined
  var suppressAggAtRootLevel: js.UndefOr[scala.Boolean] = js.undefined
  var suppressAggFuncInHeader: js.UndefOr[scala.Boolean] = js.undefined
  var suppressAnimationFrame: js.UndefOr[scala.Boolean] = js.undefined
  var suppressAsyncEvents: js.UndefOr[scala.Boolean] = js.undefined
  var suppressAutoSize: js.UndefOr[scala.Boolean] = js.undefined
  var suppressCellSelection: js.UndefOr[scala.Boolean] = js.undefined
  var suppressChangeDetection: js.UndefOr[scala.Boolean] = js.undefined
  var suppressClickEdit: js.UndefOr[scala.Boolean] = js.undefined
  var suppressClipboardPaste: js.UndefOr[scala.Boolean] = js.undefined
  var suppressColumnMoveAnimation: js.UndefOr[scala.Boolean] = js.undefined
  var suppressColumnVirtualisation: js.UndefOr[scala.Boolean] = js.undefined
  var suppressContextMenu: js.UndefOr[scala.Boolean] = js.undefined
  var suppressCopyRowsToClipboard: js.UndefOr[scala.Boolean] = js.undefined
  var suppressCsvExport: js.UndefOr[scala.Boolean] = js.undefined
  var suppressDragLeaveHidesColumns: js.UndefOr[scala.Boolean] = js.undefined
  var suppressEnterpriseResetOnNewColumns: js.UndefOr[scala.Boolean] = js.undefined
  var suppressExcelExport: js.UndefOr[scala.Boolean] = js.undefined
  var suppressFieldDotNotation: js.UndefOr[scala.Boolean] = js.undefined
  var suppressFocusAfterRefresh: js.UndefOr[scala.Boolean] = js.undefined
  var suppressHorizontalScroll: js.UndefOr[scala.Boolean] = js.undefined
  var suppressLoadingOverlay: js.UndefOr[scala.Boolean] = js.undefined
  var suppressMakeColumnVisibleAfterUnGroup: js.UndefOr[scala.Boolean] = js.undefined
  var suppressMenuHide: js.UndefOr[scala.Boolean] = js.undefined
  var suppressMiddleClickScrolls: js.UndefOr[scala.Boolean] = js.undefined
  var suppressMovableColumns: js.UndefOr[scala.Boolean] = js.undefined
  var suppressMultiRangeSelection: js.UndefOr[scala.Boolean] = js.undefined
  var suppressMultiSort: js.UndefOr[scala.Boolean] = js.undefined
  var suppressNoRowsOverlay: js.UndefOr[scala.Boolean] = js.undefined
  var suppressPaginationPanel: js.UndefOr[scala.Boolean] = js.undefined
  var suppressParentsInRowNodes: js.UndefOr[scala.Boolean] = js.undefined
  var suppressPreventDefaultOnMouseWheel: js.UndefOr[scala.Boolean] = js.undefined
  var suppressPropertyNamesCheck: js.UndefOr[scala.Boolean] = js.undefined
  var suppressRowClickSelection: js.UndefOr[scala.Boolean] = js.undefined
  var suppressRowDrag: js.UndefOr[scala.Boolean] = js.undefined
  var suppressRowHoverHighlight: js.UndefOr[scala.Boolean] = js.undefined
  var suppressRowTransform: js.UndefOr[scala.Boolean] = js.undefined
  var suppressScrollOnNewData: js.UndefOr[scala.Boolean] = js.undefined
  var suppressTabbing: js.UndefOr[scala.Boolean] = js.undefined
  var suppressTouch: js.UndefOr[scala.Boolean] = js.undefined
  var tabToNextCell: js.UndefOr[
    js.Function1[
      /* params */ TabToNextCellParams, 
      agDashGridLib.distLibEntitiesGridCellMod.GridCellDef
    ]
  ] = js.undefined
  var toolPanelSuppressColumnExpandAll: js.UndefOr[scala.Boolean] = js.undefined
  var toolPanelSuppressColumnFilter: js.UndefOr[scala.Boolean] = js.undefined
  var toolPanelSuppressColumnSelectAll: js.UndefOr[scala.Boolean] = js.undefined
  var toolPanelSuppressPivotMode: js.UndefOr[scala.Boolean] = js.undefined
  var toolPanelSuppressPivots: js.UndefOr[scala.Boolean] = js.undefined
  var toolPanelSuppressRowGroups: js.UndefOr[scala.Boolean] = js.undefined
  var toolPanelSuppressSideButtons: js.UndefOr[scala.Boolean] = js.undefined
  var toolPanelSuppressValues: js.UndefOr[scala.Boolean] = js.undefined
  var treeData: js.UndefOr[scala.Boolean] = js.undefined
  var unSortIcon: js.UndefOr[scala.Boolean] = js.undefined
  var valueCache: js.UndefOr[scala.Boolean] = js.undefined
  var valueCacheNeverExpires: js.UndefOr[scala.Boolean] = js.undefined
  var viewportDatasource: js.UndefOr[agDashGridLib.distLibInterfacesIViewportDatasourceMod.IViewportDatasource] = js.undefined
  var viewportRowModelBufferSize: js.UndefOr[scala.Double] = js.undefined
  var viewportRowModelPageSize: js.UndefOr[scala.Double] = js.undefined
}

object GridOptions {
  @scala.inline
  def apply(
    ComponentHolder: agDashGridLib.distLibComponentsFrameworkComponentResolverMod.ComponentHolder = null,
    accentedSort: js.UndefOr[scala.Boolean] = js.undefined,
    aggFuncs: org.scalablytyped.runtime.StringDictionary[agDashGridLib.distLibEntitiesColDefMod.IAggFunc] = null,
    aggregateOnlyChangedColumns: js.UndefOr[scala.Boolean] = js.undefined,
    alignedGrids: js.Array[GridOptions] = null,
    allowContextMenuWithControlKey: js.UndefOr[scala.Boolean] = js.undefined,
    alwaysShowStatusBar: js.UndefOr[scala.Boolean] = js.undefined,
    angularCompileFilters: js.UndefOr[scala.Boolean] = js.undefined,
    angularCompileHeaders: js.UndefOr[scala.Boolean] = js.undefined,
    angularCompileRows: js.UndefOr[scala.Boolean] = js.undefined,
    animateRows: js.UndefOr[scala.Boolean] = js.undefined,
    api: agDashGridLib.distLibGridApiMod.GridApi = null,
    autoGroupColumnDef: agDashGridLib.distLibEntitiesColDefMod.ColDef = null,
    autoSizePadding: scala.Int | scala.Double = null,
    batchUpdateWaitMillis: scala.Int | scala.Double = null,
    cacheBlockSize: scala.Int | scala.Double = null,
    cacheOverflowSize: scala.Int | scala.Double = null,
    cacheQuickFilter: js.UndefOr[scala.Boolean] = js.undefined,
    clipboardDeliminator: java.lang.String = null,
    colResizeDefault: java.lang.String = null,
    colWidth: scala.Int | scala.Double = null,
    columnApi: agDashGridLib.distLibColumnControllerColumnApiMod.ColumnApi = null,
    columnDefs: js.Array[
      agDashGridLib.distLibEntitiesColDefMod.ColDef | agDashGridLib.distLibEntitiesColDefMod.ColGroupDef
    ] = null,
    columnTypes: org.scalablytyped.runtime.StringDictionary[agDashGridLib.distLibEntitiesColDefMod.ColDef] = null,
    components: org.scalablytyped.runtime.StringDictionary[
      agDashGridLib.distLibComponentsFrameworkComponentProviderMod.AgGridRegisteredComponentInput[agDashGridLib.distLibInterfacesIComponentMod.IComponent[_]]
    ] = null,
    context: js.Any = null,
    contractColumnSelection: js.UndefOr[scala.Boolean] = js.undefined,
    datasource: agDashGridLib.distLibRowModelsIDatasourceMod.IDatasource = null,
    dateComponent: agDashGridLib.Anon_IDateComp = null,
    dateComponentFramework: js.Any = null,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    defaultColDef: agDashGridLib.distLibEntitiesColDefMod.ColDef = null,
    defaultColGroupDef: agDashGridLib.distLibEntitiesColDefMod.ColGroupDef = null,
    defaultExportParams: agDashGridLib.distLibExportParamsMod.CsvExportParams = null,
    defaultGroupSortComparator: (/* nodeA */ agDashGridLib.distLibEntitiesRowNodeMod.RowNode, /* nodeB */ agDashGridLib.distLibEntitiesRowNodeMod.RowNode) => scala.Double = null,
    deltaRowDataMode: js.UndefOr[scala.Boolean] = js.undefined,
    detailCellRenderer: agDashGridLib.Anon_ICellRendererComp | agDashGridLib.distLibRenderingCellRenderersICellRendererMod.ICellRendererFunc | java.lang.String = null,
    detailCellRendererFramework: js.Any = null,
    detailCellRendererParams: js.Any = null,
    detailRowHeight: scala.Int | scala.Double = null,
    doesDataFlower: /* dataItem */ js.Any => scala.Boolean = null,
    doesExternalFilterPass: /* node */ agDashGridLib.distLibEntitiesRowNodeMod.RowNode => scala.Boolean = null,
    domLayout: java.lang.String = null,
    editType: java.lang.String = null,
    embedFullWidthRows: js.UndefOr[scala.Boolean] = js.undefined,
    enableCellChangeFlash: js.UndefOr[scala.Boolean] = js.undefined,
    enableCellExpressions: js.UndefOr[scala.Boolean] = js.undefined,
    enableColResize: js.UndefOr[scala.Boolean] = js.undefined,
    enableFilter: js.UndefOr[scala.Boolean] = js.undefined,
    enableGroupEdit: js.UndefOr[scala.Boolean] = js.undefined,
    enableOldSetFilterModel: js.UndefOr[scala.Boolean] = js.undefined,
    enableRangeSelection: js.UndefOr[scala.Boolean] = js.undefined,
    enableRtl: js.UndefOr[scala.Boolean] = js.undefined,
    enableServerSideFilter: js.UndefOr[scala.Boolean] = js.undefined,
    enableServerSideSorting: js.UndefOr[scala.Boolean] = js.undefined,
    enableSorting: js.UndefOr[scala.Boolean] = js.undefined,
    enableStatusBar: js.UndefOr[scala.Boolean] = js.undefined,
    ensureDomOrder: js.UndefOr[scala.Boolean] = js.undefined,
    enterMovesDown: js.UndefOr[scala.Boolean] = js.undefined,
    enterMovesDownAfterEdit: js.UndefOr[scala.Boolean] = js.undefined,
    excelStyles: js.Array[_] = null,
    floatingFilter: js.UndefOr[scala.Boolean] = js.undefined,
    floatingFiltersHeight: scala.Int | scala.Double = null,
    forPrint: js.UndefOr[scala.Boolean] = js.undefined,
    frameworkComponents: org.scalablytyped.runtime.StringDictionary[agDashGridLib.Anon_Any] = null,
    fullWidthCellRenderer: agDashGridLib.Anon_ICellRendererComp | agDashGridLib.distLibRenderingCellRenderersICellRendererMod.ICellRendererFunc | java.lang.String = null,
    fullWidthCellRendererFramework: js.Any = null,
    fullWidthCellRendererParams: js.Any = null,
    functionsPassive: js.UndefOr[scala.Boolean] = js.undefined,
    functionsReadOnly: js.UndefOr[scala.Boolean] = js.undefined,
    getBusinessKeyForNode: /* node */ agDashGridLib.distLibEntitiesRowNodeMod.RowNode => java.lang.String = null,
    getChildCount: /* dataItem */ js.Any => scala.Double = null,
    getContextMenuItems: GetContextMenuItems = null,
    getDataPath: GetDataPath = null,
    getDocument: () => stdLib.Document = null,
    getMainMenuItems: GetMainMenuItems = null,
    getNodeChildDetails: GetNodeChildDetails = null,
    getRowClass: /* params */ js.Any => java.lang.String | js.Array[java.lang.String] = null,
    getRowHeight: js.Function = null,
    getRowNodeId: GetRowNodeIdFunc = null,
    getRowStyle: js.Function = null,
    gridAutoHeight: js.UndefOr[scala.Boolean] = js.undefined,
    groupColumnDef: agDashGridLib.distLibEntitiesColDefMod.ColDef = null,
    groupDefaultExpanded: scala.Int | scala.Double = null,
    groupHeaderHeight: scala.Int | scala.Double = null,
    groupHideOpenParents: js.UndefOr[scala.Boolean] = js.undefined,
    groupIncludeFooter: js.UndefOr[scala.Boolean] = js.undefined,
    groupIncludeTotalFooter: js.UndefOr[scala.Boolean] = js.undefined,
    groupMultiAutoColumn: js.UndefOr[scala.Boolean] = js.undefined,
    groupRemoveLowestSingleChildren: js.UndefOr[scala.Boolean] = js.undefined,
    groupRemoveSingleChildren: js.UndefOr[scala.Boolean] = js.undefined,
    groupRowAggNodes: /* nodes */ js.Array[agDashGridLib.distLibEntitiesRowNodeMod.RowNode] => _ = null,
    groupRowInnerRenderer: agDashGridLib.Anon_ICellRendererComp | agDashGridLib.distLibRenderingCellRenderersICellRendererMod.ICellRendererFunc | java.lang.String = null,
    groupRowInnerRendererFramework: js.Any = null,
    groupRowRenderer: agDashGridLib.Anon_ICellRendererComp | agDashGridLib.distLibRenderingCellRenderersICellRendererMod.ICellRendererFunc | java.lang.String = null,
    groupRowRendererFramework: js.Any = null,
    groupRowRendererParams: js.Any = null,
    groupSelectsChildren: js.UndefOr[scala.Boolean] = js.undefined,
    groupSelectsFiltered: js.UndefOr[scala.Boolean] = js.undefined,
    groupSuppressAutoColumn: js.UndefOr[scala.Boolean] = js.undefined,
    groupSuppressBlankHeader: js.UndefOr[scala.Boolean] = js.undefined,
    groupSuppressRow: js.UndefOr[scala.Boolean] = js.undefined,
    groupUseEntireRow: js.UndefOr[scala.Boolean] = js.undefined,
    headerHeight: scala.Int | scala.Double = null,
    icons: js.Any = null,
    infiniteInitialRowCount: scala.Int | scala.Double = null,
    isExternalFilterPresent: () => scala.Boolean = null,
    isFullWidthCell: /* rowNode */ agDashGridLib.distLibEntitiesRowNodeMod.RowNode => scala.Boolean = null,
    isRowMaster: IsRowMaster = null,
    isRowSelectable: IsRowSelectable = null,
    loadingOverlayComponent: agDashGridLib.Anon_ILoadingOverlayComp | java.lang.String = null,
    loadingOverlayComponentFramework: js.Any = null,
    localeText: js.Any = null,
    localeTextFunc: js.Function = null,
    masterDetail: js.UndefOr[scala.Boolean] = js.undefined,
    maxBlocksInCache: scala.Int | scala.Double = null,
    maxColWidth: scala.Int | scala.Double = null,
    maxConcurrentDatasourceRequests: scala.Int | scala.Double = null,
    minColWidth: scala.Int | scala.Double = null,
    multiSortKey: java.lang.String = null,
    navigateToNextCell: /* params */ NavigateToNextCellParams => agDashGridLib.distLibEntitiesGridCellMod.GridCellDef = null,
    noRowsOverlayComponent: agDashGridLib.Anon_INoRowsOverlayComp | java.lang.String = null,
    noRowsOverlayComponentFramework: js.Any = null,
    onBodyScroll: /* event */ agDashGridLib.distLibEventsMod.BodyScrollEvent => scala.Unit = null,
    onCellClicked: /* event */ agDashGridLib.distLibEventsMod.CellClickedEvent => scala.Unit = null,
    onCellContextMenu: /* event */ agDashGridLib.distLibEventsMod.CellContextMenuEvent => scala.Unit = null,
    onCellDoubleClicked: /* event */ agDashGridLib.distLibEventsMod.CellDoubleClickedEvent => scala.Unit = null,
    onCellEditingStarted: /* event */ agDashGridLib.distLibEventsMod.CellEditingStartedEvent => scala.Unit = null,
    onCellEditingStopped: /* event */ agDashGridLib.distLibEventsMod.CellEditingStoppedEvent => scala.Unit = null,
    onCellFocused: /* event */ agDashGridLib.distLibEventsMod.CellFocusedEvent => scala.Unit = null,
    onCellMouseDown: /* event */ agDashGridLib.distLibEventsMod.CellMouseDownEvent => scala.Unit = null,
    onCellMouseOut: /* event */ agDashGridLib.distLibEventsMod.CellMouseOutEvent => scala.Unit = null,
    onCellMouseOver: /* event */ agDashGridLib.distLibEventsMod.CellMouseOverEvent => scala.Unit = null,
    onCellValueChanged: /* event */ agDashGridLib.distLibEventsMod.CellValueChangedEvent => scala.Unit = null,
    onColumnAggFuncChangeRequest: /* event */ agDashGridLib.distLibEventsMod.ColumnAggFuncChangeRequestEvent => scala.Unit = null,
    onColumnEverythingChanged: /* event */ agDashGridLib.distLibEventsMod.ColumnEverythingChangedEvent => scala.Unit = null,
    onColumnGroupOpened: /* event */ agDashGridLib.distLibEventsMod.ColumnGroupOpenedEvent => scala.Unit = null,
    onColumnMoved: /* event */ agDashGridLib.distLibEventsMod.ColumnMovedEvent => scala.Unit = null,
    onColumnPinned: /* event */ agDashGridLib.distLibEventsMod.ColumnPinnedEvent => scala.Unit = null,
    onColumnPivotChangeRequest: /* event */ agDashGridLib.distLibEventsMod.ColumnPivotChangeRequestEvent => scala.Unit = null,
    onColumnPivotChanged: /* event */ agDashGridLib.distLibEventsMod.ColumnPivotChangedEvent => scala.Unit = null,
    onColumnPivotModeChanged: /* event */ agDashGridLib.distLibEventsMod.ColumnPivotModeChangedEvent => scala.Unit = null,
    onColumnResized: /* event */ agDashGridLib.distLibEventsMod.ColumnResizedEvent => scala.Unit = null,
    onColumnRowGroupChangeRequest: /* event */ agDashGridLib.distLibEventsMod.ColumnRowGroupChangeRequestEvent => scala.Unit = null,
    onColumnRowGroupChanged: /* event */ agDashGridLib.distLibEventsMod.ColumnRowGroupChangedEvent => scala.Unit = null,
    onColumnValueChangeRequest: /* event */ agDashGridLib.distLibEventsMod.ColumnValueChangeRequestEvent => scala.Unit = null,
    onColumnValueChanged: /* event */ agDashGridLib.distLibEventsMod.ColumnValueChangedEvent => scala.Unit = null,
    onColumnVisible: /* event */ agDashGridLib.distLibEventsMod.ColumnVisibleEvent => scala.Unit = null,
    onDisplayedColumnsChanged: /* event */ agDashGridLib.distLibEventsMod.DisplayedColumnsChangedEvent => scala.Unit = null,
    onDragStarted: /* event */ agDashGridLib.distLibEventsMod.DragStartedEvent => scala.Unit = null,
    onDragStopped: /* event */ agDashGridLib.distLibEventsMod.DragStoppedEvent => scala.Unit = null,
    onFilterChanged: /* event */ agDashGridLib.distLibEventsMod.FilterChangedEvent => scala.Unit = null,
    onFilterModified: /* event */ agDashGridLib.distLibEventsMod.FilterModifiedEvent => scala.Unit = null,
    onGridColumnsChanged: /* event */ agDashGridLib.distLibEventsMod.GridColumnsChangedEvent => scala.Unit = null,
    onGridReady: /* event */ agDashGridLib.distLibEventsMod.GridReadyEvent => scala.Unit = null,
    onGridSizeChanged: /* event */ js.Any => scala.Unit = null,
    onModelUpdated: /* event */ agDashGridLib.distLibEventsMod.ModelUpdatedEvent => scala.Unit = null,
    onNewColumnsLoaded: /* event */ agDashGridLib.distLibEventsMod.NewColumnsLoadedEvent => scala.Unit = null,
    onPaginationChanged: /* event */ agDashGridLib.distLibEventsMod.PaginationChangedEvent => scala.Unit = null,
    onPasteEnd: /* event */ agDashGridLib.distLibEventsMod.PasteEndEvent => scala.Unit = null,
    onPasteStart: /* event */ agDashGridLib.distLibEventsMod.PasteStartEvent => scala.Unit = null,
    onPinnedRowDataChanged: /* event */ agDashGridLib.distLibEventsMod.PinnedRowDataChangedEvent => scala.Unit = null,
    onRangeSelectionChanged: /* event */ agDashGridLib.distLibEventsMod.RangeSelectionChangedEvent => scala.Unit = null,
    onRowClicked: /* event */ agDashGridLib.distLibEventsMod.RowClickedEvent => scala.Unit = null,
    onRowDataChanged: /* event */ agDashGridLib.distLibEventsMod.RowDataChangedEvent => scala.Unit = null,
    onRowDataUpdated: /* event */ agDashGridLib.distLibEventsMod.RowDataUpdatedEvent => scala.Unit = null,
    onRowDoubleClicked: /* event */ agDashGridLib.distLibEventsMod.RowDoubleClickedEvent => scala.Unit = null,
    onRowDragEnd: /* event */ agDashGridLib.distLibEventsMod.RowDragEvent => scala.Unit = null,
    onRowDragEnter: /* event */ agDashGridLib.distLibEventsMod.RowDragEvent => scala.Unit = null,
    onRowDragLeave: /* event */ agDashGridLib.distLibEventsMod.RowDragEvent => scala.Unit = null,
    onRowDragMove: /* event */ agDashGridLib.distLibEventsMod.RowDragEvent => scala.Unit = null,
    onRowEditingStarted: /* event */ agDashGridLib.distLibEventsMod.RowEditingStartedEvent => scala.Unit = null,
    onRowEditingStopped: /* event */ agDashGridLib.distLibEventsMod.RowEditingStoppedEvent => scala.Unit = null,
    onRowGroupOpened: /* event */ agDashGridLib.distLibEventsMod.RowGroupOpenedEvent => scala.Unit = null,
    onRowSelected: /* event */ agDashGridLib.distLibEventsMod.RowSelectedEvent => scala.Unit = null,
    onRowValueChanged: /* event */ agDashGridLib.distLibEventsMod.RowValueChangedEvent => scala.Unit = null,
    onSelectionChanged: /* event */ agDashGridLib.distLibEventsMod.SelectionChangedEvent => scala.Unit = null,
    onSortChanged: /* event */ agDashGridLib.distLibEventsMod.SortChangedEvent => scala.Unit = null,
    onViewportChanged: /* event */ agDashGridLib.distLibEventsMod.ViewportChangedEvent => scala.Unit = null,
    onVirtualColumnsChanged: /* event */ agDashGridLib.distLibEventsMod.VirtualColumnsChangedEvent => scala.Unit = null,
    onVirtualRowRemoved: /* event */ agDashGridLib.distLibEventsMod.VirtualRowRemovedEvent => scala.Unit = null,
    overlayLoadingTemplate: java.lang.String = null,
    overlayNoRowsTemplate: java.lang.String = null,
    pagination: js.UndefOr[scala.Boolean] = js.undefined,
    paginationAutoPageSize: js.UndefOr[scala.Boolean] = js.undefined,
    paginationNumberFormatter: /* params */ PaginationNumberFormatterParams => java.lang.String = null,
    paginationPageSize: scala.Int | scala.Double = null,
    paginationStartPage: scala.Int | scala.Double = null,
    pinnedBottomRowData: js.Array[_] = null,
    pinnedTopRowData: js.Array[_] = null,
    pivotColumnGroupTotals: java.lang.String = null,
    pivotGroupHeaderHeight: scala.Int | scala.Double = null,
    pivotHeaderHeight: scala.Int | scala.Double = null,
    pivotMode: js.UndefOr[scala.Boolean] = js.undefined,
    pivotPanelShow: java.lang.String = null,
    pivotRowTotals: java.lang.String = null,
    pivotTotals: js.UndefOr[scala.Boolean] = js.undefined,
    popupParent: stdLib.HTMLElement = null,
    postProcessPopup: /* params */ PostProcessPopupParams => scala.Unit = null,
    postSort: /* nodes */ js.Array[agDashGridLib.distLibEntitiesRowNodeMod.RowNode] => scala.Unit = null,
    processCellForClipboard: /* params */ agDashGridLib.distLibExportParamsMod.ProcessCellForExportParams => _ = null,
    processCellFromClipboard: /* params */ agDashGridLib.distLibExportParamsMod.ProcessCellForExportParams => _ = null,
    processDataFromClipboard: /* params */ ProcessDataFromClipboardParams => js.Array[js.Array[java.lang.String]] = null,
    processHeaderForClipboard: /* params */ agDashGridLib.distLibExportParamsMod.ProcessHeaderForExportParams => _ = null,
    processRowPostCreate: /* params */ ProcessRowParams => scala.Unit = null,
    processSecondaryColDef: /* colDef */ agDashGridLib.distLibEntitiesColDefMod.ColDef => scala.Unit = null,
    processSecondaryColGroupDef: /* colGroupDef */ agDashGridLib.distLibEntitiesColDefMod.ColGroupDef => scala.Unit = null,
    purgeClosedRowNodes: js.UndefOr[scala.Boolean] = js.undefined,
    quickFilterText: java.lang.String = null,
    rememberGroupStateWhenNewData: js.UndefOr[scala.Boolean] = js.undefined,
    rowBuffer: scala.Int | scala.Double = null,
    rowClass: java.lang.String | js.Array[java.lang.String] = null,
    rowClassRules: org.scalablytyped.runtime.StringDictionary[js.Function | java.lang.String] = null,
    rowData: js.Array[_] = null,
    rowDeselection: js.UndefOr[scala.Boolean] = js.undefined,
    rowDragManaged: js.UndefOr[scala.Boolean] = js.undefined,
    rowGroupPanelShow: java.lang.String = null,
    rowHeight: scala.Int | scala.Double = null,
    rowModelType: java.lang.String = null,
    rowMultiSelectWithClick: js.UndefOr[scala.Boolean] = js.undefined,
    rowSelection: java.lang.String = null,
    rowStyle: js.Any = null,
    scrollbarWidth: scala.Int | scala.Double = null,
    sendToClipboard: /* params */ js.Any => scala.Unit = null,
    serverSideDatasource: agDashGridLib.distLibInterfacesIServerSideDatasourceMod.IServerSideDatasource = null,
    serverSideSortingAlwaysResets: js.UndefOr[scala.Boolean] = js.undefined,
    showToolPanel: js.UndefOr[scala.Boolean] = js.undefined,
    singleClickEdit: js.UndefOr[scala.Boolean] = js.undefined,
    slaveGrids: js.Array[GridOptions] = null,
    sortingOrder: js.Array[java.lang.String] = null,
    stopEditingWhenGridLosesFocus: js.UndefOr[scala.Boolean] = js.undefined,
    suppressAggAtRootLevel: js.UndefOr[scala.Boolean] = js.undefined,
    suppressAggFuncInHeader: js.UndefOr[scala.Boolean] = js.undefined,
    suppressAnimationFrame: js.UndefOr[scala.Boolean] = js.undefined,
    suppressAsyncEvents: js.UndefOr[scala.Boolean] = js.undefined,
    suppressAutoSize: js.UndefOr[scala.Boolean] = js.undefined,
    suppressCellSelection: js.UndefOr[scala.Boolean] = js.undefined,
    suppressChangeDetection: js.UndefOr[scala.Boolean] = js.undefined,
    suppressClickEdit: js.UndefOr[scala.Boolean] = js.undefined,
    suppressClipboardPaste: js.UndefOr[scala.Boolean] = js.undefined,
    suppressColumnMoveAnimation: js.UndefOr[scala.Boolean] = js.undefined,
    suppressColumnVirtualisation: js.UndefOr[scala.Boolean] = js.undefined,
    suppressContextMenu: js.UndefOr[scala.Boolean] = js.undefined,
    suppressCopyRowsToClipboard: js.UndefOr[scala.Boolean] = js.undefined,
    suppressCsvExport: js.UndefOr[scala.Boolean] = js.undefined,
    suppressDragLeaveHidesColumns: js.UndefOr[scala.Boolean] = js.undefined,
    suppressEnterpriseResetOnNewColumns: js.UndefOr[scala.Boolean] = js.undefined,
    suppressExcelExport: js.UndefOr[scala.Boolean] = js.undefined,
    suppressFieldDotNotation: js.UndefOr[scala.Boolean] = js.undefined,
    suppressFocusAfterRefresh: js.UndefOr[scala.Boolean] = js.undefined,
    suppressHorizontalScroll: js.UndefOr[scala.Boolean] = js.undefined,
    suppressLoadingOverlay: js.UndefOr[scala.Boolean] = js.undefined,
    suppressMakeColumnVisibleAfterUnGroup: js.UndefOr[scala.Boolean] = js.undefined,
    suppressMenuHide: js.UndefOr[scala.Boolean] = js.undefined
  ): GridOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, ComponentHolder)
    if (!js.isUndefined(accentedSort)) __obj.updateDynamic("accentedSort")(accentedSort)
    if (aggFuncs != null) __obj.updateDynamic("aggFuncs")(aggFuncs)
    if (!js.isUndefined(aggregateOnlyChangedColumns)) __obj.updateDynamic("aggregateOnlyChangedColumns")(aggregateOnlyChangedColumns)
    if (alignedGrids != null) __obj.updateDynamic("alignedGrids")(alignedGrids)
    if (!js.isUndefined(allowContextMenuWithControlKey)) __obj.updateDynamic("allowContextMenuWithControlKey")(allowContextMenuWithControlKey)
    if (!js.isUndefined(alwaysShowStatusBar)) __obj.updateDynamic("alwaysShowStatusBar")(alwaysShowStatusBar)
    if (!js.isUndefined(angularCompileFilters)) __obj.updateDynamic("angularCompileFilters")(angularCompileFilters)
    if (!js.isUndefined(angularCompileHeaders)) __obj.updateDynamic("angularCompileHeaders")(angularCompileHeaders)
    if (!js.isUndefined(angularCompileRows)) __obj.updateDynamic("angularCompileRows")(angularCompileRows)
    if (!js.isUndefined(animateRows)) __obj.updateDynamic("animateRows")(animateRows)
    if (api != null) __obj.updateDynamic("api")(api)
    if (autoGroupColumnDef != null) __obj.updateDynamic("autoGroupColumnDef")(autoGroupColumnDef)
    if (autoSizePadding != null) __obj.updateDynamic("autoSizePadding")(autoSizePadding.asInstanceOf[js.Any])
    if (batchUpdateWaitMillis != null) __obj.updateDynamic("batchUpdateWaitMillis")(batchUpdateWaitMillis.asInstanceOf[js.Any])
    if (cacheBlockSize != null) __obj.updateDynamic("cacheBlockSize")(cacheBlockSize.asInstanceOf[js.Any])
    if (cacheOverflowSize != null) __obj.updateDynamic("cacheOverflowSize")(cacheOverflowSize.asInstanceOf[js.Any])
    if (!js.isUndefined(cacheQuickFilter)) __obj.updateDynamic("cacheQuickFilter")(cacheQuickFilter)
    if (clipboardDeliminator != null) __obj.updateDynamic("clipboardDeliminator")(clipboardDeliminator)
    if (colResizeDefault != null) __obj.updateDynamic("colResizeDefault")(colResizeDefault)
    if (colWidth != null) __obj.updateDynamic("colWidth")(colWidth.asInstanceOf[js.Any])
    if (columnApi != null) __obj.updateDynamic("columnApi")(columnApi)
    if (columnDefs != null) __obj.updateDynamic("columnDefs")(columnDefs)
    if (columnTypes != null) __obj.updateDynamic("columnTypes")(columnTypes)
    if (components != null) __obj.updateDynamic("components")(components)
    if (context != null) __obj.updateDynamic("context")(context)
    if (!js.isUndefined(contractColumnSelection)) __obj.updateDynamic("contractColumnSelection")(contractColumnSelection)
    if (datasource != null) __obj.updateDynamic("datasource")(datasource)
    if (dateComponent != null) __obj.updateDynamic("dateComponent")(dateComponent)
    if (dateComponentFramework != null) __obj.updateDynamic("dateComponentFramework")(dateComponentFramework)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (defaultColDef != null) __obj.updateDynamic("defaultColDef")(defaultColDef)
    if (defaultColGroupDef != null) __obj.updateDynamic("defaultColGroupDef")(defaultColGroupDef)
    if (defaultExportParams != null) __obj.updateDynamic("defaultExportParams")(defaultExportParams)
    if (defaultGroupSortComparator != null) __obj.updateDynamic("defaultGroupSortComparator")(js.Any.fromFunction2(defaultGroupSortComparator))
    if (!js.isUndefined(deltaRowDataMode)) __obj.updateDynamic("deltaRowDataMode")(deltaRowDataMode)
    if (detailCellRenderer != null) __obj.updateDynamic("detailCellRenderer")(detailCellRenderer.asInstanceOf[js.Any])
    if (detailCellRendererFramework != null) __obj.updateDynamic("detailCellRendererFramework")(detailCellRendererFramework)
    if (detailCellRendererParams != null) __obj.updateDynamic("detailCellRendererParams")(detailCellRendererParams)
    if (detailRowHeight != null) __obj.updateDynamic("detailRowHeight")(detailRowHeight.asInstanceOf[js.Any])
    if (doesDataFlower != null) __obj.updateDynamic("doesDataFlower")(js.Any.fromFunction1(doesDataFlower))
    if (doesExternalFilterPass != null) __obj.updateDynamic("doesExternalFilterPass")(js.Any.fromFunction1(doesExternalFilterPass))
    if (domLayout != null) __obj.updateDynamic("domLayout")(domLayout)
    if (editType != null) __obj.updateDynamic("editType")(editType)
    if (!js.isUndefined(embedFullWidthRows)) __obj.updateDynamic("embedFullWidthRows")(embedFullWidthRows)
    if (!js.isUndefined(enableCellChangeFlash)) __obj.updateDynamic("enableCellChangeFlash")(enableCellChangeFlash)
    if (!js.isUndefined(enableCellExpressions)) __obj.updateDynamic("enableCellExpressions")(enableCellExpressions)
    if (!js.isUndefined(enableColResize)) __obj.updateDynamic("enableColResize")(enableColResize)
    if (!js.isUndefined(enableFilter)) __obj.updateDynamic("enableFilter")(enableFilter)
    if (!js.isUndefined(enableGroupEdit)) __obj.updateDynamic("enableGroupEdit")(enableGroupEdit)
    if (!js.isUndefined(enableOldSetFilterModel)) __obj.updateDynamic("enableOldSetFilterModel")(enableOldSetFilterModel)
    if (!js.isUndefined(enableRangeSelection)) __obj.updateDynamic("enableRangeSelection")(enableRangeSelection)
    if (!js.isUndefined(enableRtl)) __obj.updateDynamic("enableRtl")(enableRtl)
    if (!js.isUndefined(enableServerSideFilter)) __obj.updateDynamic("enableServerSideFilter")(enableServerSideFilter)
    if (!js.isUndefined(enableServerSideSorting)) __obj.updateDynamic("enableServerSideSorting")(enableServerSideSorting)
    if (!js.isUndefined(enableSorting)) __obj.updateDynamic("enableSorting")(enableSorting)
    if (!js.isUndefined(enableStatusBar)) __obj.updateDynamic("enableStatusBar")(enableStatusBar)
    if (!js.isUndefined(ensureDomOrder)) __obj.updateDynamic("ensureDomOrder")(ensureDomOrder)
    if (!js.isUndefined(enterMovesDown)) __obj.updateDynamic("enterMovesDown")(enterMovesDown)
    if (!js.isUndefined(enterMovesDownAfterEdit)) __obj.updateDynamic("enterMovesDownAfterEdit")(enterMovesDownAfterEdit)
    if (excelStyles != null) __obj.updateDynamic("excelStyles")(excelStyles)
    if (!js.isUndefined(floatingFilter)) __obj.updateDynamic("floatingFilter")(floatingFilter)
    if (floatingFiltersHeight != null) __obj.updateDynamic("floatingFiltersHeight")(floatingFiltersHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(forPrint)) __obj.updateDynamic("forPrint")(forPrint)
    if (frameworkComponents != null) __obj.updateDynamic("frameworkComponents")(frameworkComponents)
    if (fullWidthCellRenderer != null) __obj.updateDynamic("fullWidthCellRenderer")(fullWidthCellRenderer.asInstanceOf[js.Any])
    if (fullWidthCellRendererFramework != null) __obj.updateDynamic("fullWidthCellRendererFramework")(fullWidthCellRendererFramework)
    if (fullWidthCellRendererParams != null) __obj.updateDynamic("fullWidthCellRendererParams")(fullWidthCellRendererParams)
    if (!js.isUndefined(functionsPassive)) __obj.updateDynamic("functionsPassive")(functionsPassive)
    if (!js.isUndefined(functionsReadOnly)) __obj.updateDynamic("functionsReadOnly")(functionsReadOnly)
    if (getBusinessKeyForNode != null) __obj.updateDynamic("getBusinessKeyForNode")(js.Any.fromFunction1(getBusinessKeyForNode))
    if (getChildCount != null) __obj.updateDynamic("getChildCount")(js.Any.fromFunction1(getChildCount))
    if (getContextMenuItems != null) __obj.updateDynamic("getContextMenuItems")(getContextMenuItems)
    if (getDataPath != null) __obj.updateDynamic("getDataPath")(getDataPath)
    if (getDocument != null) __obj.updateDynamic("getDocument")(js.Any.fromFunction0(getDocument))
    if (getMainMenuItems != null) __obj.updateDynamic("getMainMenuItems")(getMainMenuItems)
    if (getNodeChildDetails != null) __obj.updateDynamic("getNodeChildDetails")(getNodeChildDetails)
    if (getRowClass != null) __obj.updateDynamic("getRowClass")(js.Any.fromFunction1(getRowClass))
    if (getRowHeight != null) __obj.updateDynamic("getRowHeight")(getRowHeight)
    if (getRowNodeId != null) __obj.updateDynamic("getRowNodeId")(getRowNodeId)
    if (getRowStyle != null) __obj.updateDynamic("getRowStyle")(getRowStyle)
    if (!js.isUndefined(gridAutoHeight)) __obj.updateDynamic("gridAutoHeight")(gridAutoHeight)
    if (groupColumnDef != null) __obj.updateDynamic("groupColumnDef")(groupColumnDef)
    if (groupDefaultExpanded != null) __obj.updateDynamic("groupDefaultExpanded")(groupDefaultExpanded.asInstanceOf[js.Any])
    if (groupHeaderHeight != null) __obj.updateDynamic("groupHeaderHeight")(groupHeaderHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(groupHideOpenParents)) __obj.updateDynamic("groupHideOpenParents")(groupHideOpenParents)
    if (!js.isUndefined(groupIncludeFooter)) __obj.updateDynamic("groupIncludeFooter")(groupIncludeFooter)
    if (!js.isUndefined(groupIncludeTotalFooter)) __obj.updateDynamic("groupIncludeTotalFooter")(groupIncludeTotalFooter)
    if (!js.isUndefined(groupMultiAutoColumn)) __obj.updateDynamic("groupMultiAutoColumn")(groupMultiAutoColumn)
    if (!js.isUndefined(groupRemoveLowestSingleChildren)) __obj.updateDynamic("groupRemoveLowestSingleChildren")(groupRemoveLowestSingleChildren)
    if (!js.isUndefined(groupRemoveSingleChildren)) __obj.updateDynamic("groupRemoveSingleChildren")(groupRemoveSingleChildren)
    if (groupRowAggNodes != null) __obj.updateDynamic("groupRowAggNodes")(js.Any.fromFunction1(groupRowAggNodes))
    if (groupRowInnerRenderer != null) __obj.updateDynamic("groupRowInnerRenderer")(groupRowInnerRenderer.asInstanceOf[js.Any])
    if (groupRowInnerRendererFramework != null) __obj.updateDynamic("groupRowInnerRendererFramework")(groupRowInnerRendererFramework)
    if (groupRowRenderer != null) __obj.updateDynamic("groupRowRenderer")(groupRowRenderer.asInstanceOf[js.Any])
    if (groupRowRendererFramework != null) __obj.updateDynamic("groupRowRendererFramework")(groupRowRendererFramework)
    if (groupRowRendererParams != null) __obj.updateDynamic("groupRowRendererParams")(groupRowRendererParams)
    if (!js.isUndefined(groupSelectsChildren)) __obj.updateDynamic("groupSelectsChildren")(groupSelectsChildren)
    if (!js.isUndefined(groupSelectsFiltered)) __obj.updateDynamic("groupSelectsFiltered")(groupSelectsFiltered)
    if (!js.isUndefined(groupSuppressAutoColumn)) __obj.updateDynamic("groupSuppressAutoColumn")(groupSuppressAutoColumn)
    if (!js.isUndefined(groupSuppressBlankHeader)) __obj.updateDynamic("groupSuppressBlankHeader")(groupSuppressBlankHeader)
    if (!js.isUndefined(groupSuppressRow)) __obj.updateDynamic("groupSuppressRow")(groupSuppressRow)
    if (!js.isUndefined(groupUseEntireRow)) __obj.updateDynamic("groupUseEntireRow")(groupUseEntireRow)
    if (headerHeight != null) __obj.updateDynamic("headerHeight")(headerHeight.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons)
    if (infiniteInitialRowCount != null) __obj.updateDynamic("infiniteInitialRowCount")(infiniteInitialRowCount.asInstanceOf[js.Any])
    if (isExternalFilterPresent != null) __obj.updateDynamic("isExternalFilterPresent")(js.Any.fromFunction0(isExternalFilterPresent))
    if (isFullWidthCell != null) __obj.updateDynamic("isFullWidthCell")(js.Any.fromFunction1(isFullWidthCell))
    if (isRowMaster != null) __obj.updateDynamic("isRowMaster")(isRowMaster)
    if (isRowSelectable != null) __obj.updateDynamic("isRowSelectable")(isRowSelectable)
    if (loadingOverlayComponent != null) __obj.updateDynamic("loadingOverlayComponent")(loadingOverlayComponent.asInstanceOf[js.Any])
    if (loadingOverlayComponentFramework != null) __obj.updateDynamic("loadingOverlayComponentFramework")(loadingOverlayComponentFramework)
    if (localeText != null) __obj.updateDynamic("localeText")(localeText)
    if (localeTextFunc != null) __obj.updateDynamic("localeTextFunc")(localeTextFunc)
    if (!js.isUndefined(masterDetail)) __obj.updateDynamic("masterDetail")(masterDetail)
    if (maxBlocksInCache != null) __obj.updateDynamic("maxBlocksInCache")(maxBlocksInCache.asInstanceOf[js.Any])
    if (maxColWidth != null) __obj.updateDynamic("maxColWidth")(maxColWidth.asInstanceOf[js.Any])
    if (maxConcurrentDatasourceRequests != null) __obj.updateDynamic("maxConcurrentDatasourceRequests")(maxConcurrentDatasourceRequests.asInstanceOf[js.Any])
    if (minColWidth != null) __obj.updateDynamic("minColWidth")(minColWidth.asInstanceOf[js.Any])
    if (multiSortKey != null) __obj.updateDynamic("multiSortKey")(multiSortKey)
    if (navigateToNextCell != null) __obj.updateDynamic("navigateToNextCell")(js.Any.fromFunction1(navigateToNextCell))
    if (noRowsOverlayComponent != null) __obj.updateDynamic("noRowsOverlayComponent")(noRowsOverlayComponent.asInstanceOf[js.Any])
    if (noRowsOverlayComponentFramework != null) __obj.updateDynamic("noRowsOverlayComponentFramework")(noRowsOverlayComponentFramework)
    if (onBodyScroll != null) __obj.updateDynamic("onBodyScroll")(js.Any.fromFunction1(onBodyScroll))
    if (onCellClicked != null) __obj.updateDynamic("onCellClicked")(js.Any.fromFunction1(onCellClicked))
    if (onCellContextMenu != null) __obj.updateDynamic("onCellContextMenu")(js.Any.fromFunction1(onCellContextMenu))
    if (onCellDoubleClicked != null) __obj.updateDynamic("onCellDoubleClicked")(js.Any.fromFunction1(onCellDoubleClicked))
    if (onCellEditingStarted != null) __obj.updateDynamic("onCellEditingStarted")(js.Any.fromFunction1(onCellEditingStarted))
    if (onCellEditingStopped != null) __obj.updateDynamic("onCellEditingStopped")(js.Any.fromFunction1(onCellEditingStopped))
    if (onCellFocused != null) __obj.updateDynamic("onCellFocused")(js.Any.fromFunction1(onCellFocused))
    if (onCellMouseDown != null) __obj.updateDynamic("onCellMouseDown")(js.Any.fromFunction1(onCellMouseDown))
    if (onCellMouseOut != null) __obj.updateDynamic("onCellMouseOut")(js.Any.fromFunction1(onCellMouseOut))
    if (onCellMouseOver != null) __obj.updateDynamic("onCellMouseOver")(js.Any.fromFunction1(onCellMouseOver))
    if (onCellValueChanged != null) __obj.updateDynamic("onCellValueChanged")(js.Any.fromFunction1(onCellValueChanged))
    if (onColumnAggFuncChangeRequest != null) __obj.updateDynamic("onColumnAggFuncChangeRequest")(js.Any.fromFunction1(onColumnAggFuncChangeRequest))
    if (onColumnEverythingChanged != null) __obj.updateDynamic("onColumnEverythingChanged")(js.Any.fromFunction1(onColumnEverythingChanged))
    if (onColumnGroupOpened != null) __obj.updateDynamic("onColumnGroupOpened")(js.Any.fromFunction1(onColumnGroupOpened))
    if (onColumnMoved != null) __obj.updateDynamic("onColumnMoved")(js.Any.fromFunction1(onColumnMoved))
    if (onColumnPinned != null) __obj.updateDynamic("onColumnPinned")(js.Any.fromFunction1(onColumnPinned))
    if (onColumnPivotChangeRequest != null) __obj.updateDynamic("onColumnPivotChangeRequest")(js.Any.fromFunction1(onColumnPivotChangeRequest))
    if (onColumnPivotChanged != null) __obj.updateDynamic("onColumnPivotChanged")(js.Any.fromFunction1(onColumnPivotChanged))
    if (onColumnPivotModeChanged != null) __obj.updateDynamic("onColumnPivotModeChanged")(js.Any.fromFunction1(onColumnPivotModeChanged))
    if (onColumnResized != null) __obj.updateDynamic("onColumnResized")(js.Any.fromFunction1(onColumnResized))
    if (onColumnRowGroupChangeRequest != null) __obj.updateDynamic("onColumnRowGroupChangeRequest")(js.Any.fromFunction1(onColumnRowGroupChangeRequest))
    if (onColumnRowGroupChanged != null) __obj.updateDynamic("onColumnRowGroupChanged")(js.Any.fromFunction1(onColumnRowGroupChanged))
    if (onColumnValueChangeRequest != null) __obj.updateDynamic("onColumnValueChangeRequest")(js.Any.fromFunction1(onColumnValueChangeRequest))
    if (onColumnValueChanged != null) __obj.updateDynamic("onColumnValueChanged")(js.Any.fromFunction1(onColumnValueChanged))
    if (onColumnVisible != null) __obj.updateDynamic("onColumnVisible")(js.Any.fromFunction1(onColumnVisible))
    if (onDisplayedColumnsChanged != null) __obj.updateDynamic("onDisplayedColumnsChanged")(js.Any.fromFunction1(onDisplayedColumnsChanged))
    if (onDragStarted != null) __obj.updateDynamic("onDragStarted")(js.Any.fromFunction1(onDragStarted))
    if (onDragStopped != null) __obj.updateDynamic("onDragStopped")(js.Any.fromFunction1(onDragStopped))
    if (onFilterChanged != null) __obj.updateDynamic("onFilterChanged")(js.Any.fromFunction1(onFilterChanged))
    if (onFilterModified != null) __obj.updateDynamic("onFilterModified")(js.Any.fromFunction1(onFilterModified))
    if (onGridColumnsChanged != null) __obj.updateDynamic("onGridColumnsChanged")(js.Any.fromFunction1(onGridColumnsChanged))
    if (onGridReady != null) __obj.updateDynamic("onGridReady")(js.Any.fromFunction1(onGridReady))
    if (onGridSizeChanged != null) __obj.updateDynamic("onGridSizeChanged")(js.Any.fromFunction1(onGridSizeChanged))
    if (onModelUpdated != null) __obj.updateDynamic("onModelUpdated")(js.Any.fromFunction1(onModelUpdated))
    if (onNewColumnsLoaded != null) __obj.updateDynamic("onNewColumnsLoaded")(js.Any.fromFunction1(onNewColumnsLoaded))
    if (onPaginationChanged != null) __obj.updateDynamic("onPaginationChanged")(js.Any.fromFunction1(onPaginationChanged))
    if (onPasteEnd != null) __obj.updateDynamic("onPasteEnd")(js.Any.fromFunction1(onPasteEnd))
    if (onPasteStart != null) __obj.updateDynamic("onPasteStart")(js.Any.fromFunction1(onPasteStart))
    if (onPinnedRowDataChanged != null) __obj.updateDynamic("onPinnedRowDataChanged")(js.Any.fromFunction1(onPinnedRowDataChanged))
    if (onRangeSelectionChanged != null) __obj.updateDynamic("onRangeSelectionChanged")(js.Any.fromFunction1(onRangeSelectionChanged))
    if (onRowClicked != null) __obj.updateDynamic("onRowClicked")(js.Any.fromFunction1(onRowClicked))
    if (onRowDataChanged != null) __obj.updateDynamic("onRowDataChanged")(js.Any.fromFunction1(onRowDataChanged))
    if (onRowDataUpdated != null) __obj.updateDynamic("onRowDataUpdated")(js.Any.fromFunction1(onRowDataUpdated))
    if (onRowDoubleClicked != null) __obj.updateDynamic("onRowDoubleClicked")(js.Any.fromFunction1(onRowDoubleClicked))
    if (onRowDragEnd != null) __obj.updateDynamic("onRowDragEnd")(js.Any.fromFunction1(onRowDragEnd))
    if (onRowDragEnter != null) __obj.updateDynamic("onRowDragEnter")(js.Any.fromFunction1(onRowDragEnter))
    if (onRowDragLeave != null) __obj.updateDynamic("onRowDragLeave")(js.Any.fromFunction1(onRowDragLeave))
    if (onRowDragMove != null) __obj.updateDynamic("onRowDragMove")(js.Any.fromFunction1(onRowDragMove))
    if (onRowEditingStarted != null) __obj.updateDynamic("onRowEditingStarted")(js.Any.fromFunction1(onRowEditingStarted))
    if (onRowEditingStopped != null) __obj.updateDynamic("onRowEditingStopped")(js.Any.fromFunction1(onRowEditingStopped))
    if (onRowGroupOpened != null) __obj.updateDynamic("onRowGroupOpened")(js.Any.fromFunction1(onRowGroupOpened))
    if (onRowSelected != null) __obj.updateDynamic("onRowSelected")(js.Any.fromFunction1(onRowSelected))
    if (onRowValueChanged != null) __obj.updateDynamic("onRowValueChanged")(js.Any.fromFunction1(onRowValueChanged))
    if (onSelectionChanged != null) __obj.updateDynamic("onSelectionChanged")(js.Any.fromFunction1(onSelectionChanged))
    if (onSortChanged != null) __obj.updateDynamic("onSortChanged")(js.Any.fromFunction1(onSortChanged))
    if (onViewportChanged != null) __obj.updateDynamic("onViewportChanged")(js.Any.fromFunction1(onViewportChanged))
    if (onVirtualColumnsChanged != null) __obj.updateDynamic("onVirtualColumnsChanged")(js.Any.fromFunction1(onVirtualColumnsChanged))
    if (onVirtualRowRemoved != null) __obj.updateDynamic("onVirtualRowRemoved")(js.Any.fromFunction1(onVirtualRowRemoved))
    if (overlayLoadingTemplate != null) __obj.updateDynamic("overlayLoadingTemplate")(overlayLoadingTemplate)
    if (overlayNoRowsTemplate != null) __obj.updateDynamic("overlayNoRowsTemplate")(overlayNoRowsTemplate)
    if (!js.isUndefined(pagination)) __obj.updateDynamic("pagination")(pagination)
    if (!js.isUndefined(paginationAutoPageSize)) __obj.updateDynamic("paginationAutoPageSize")(paginationAutoPageSize)
    if (paginationNumberFormatter != null) __obj.updateDynamic("paginationNumberFormatter")(js.Any.fromFunction1(paginationNumberFormatter))
    if (paginationPageSize != null) __obj.updateDynamic("paginationPageSize")(paginationPageSize.asInstanceOf[js.Any])
    if (paginationStartPage != null) __obj.updateDynamic("paginationStartPage")(paginationStartPage.asInstanceOf[js.Any])
    if (pinnedBottomRowData != null) __obj.updateDynamic("pinnedBottomRowData")(pinnedBottomRowData)
    if (pinnedTopRowData != null) __obj.updateDynamic("pinnedTopRowData")(pinnedTopRowData)
    if (pivotColumnGroupTotals != null) __obj.updateDynamic("pivotColumnGroupTotals")(pivotColumnGroupTotals)
    if (pivotGroupHeaderHeight != null) __obj.updateDynamic("pivotGroupHeaderHeight")(pivotGroupHeaderHeight.asInstanceOf[js.Any])
    if (pivotHeaderHeight != null) __obj.updateDynamic("pivotHeaderHeight")(pivotHeaderHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(pivotMode)) __obj.updateDynamic("pivotMode")(pivotMode)
    if (pivotPanelShow != null) __obj.updateDynamic("pivotPanelShow")(pivotPanelShow)
    if (pivotRowTotals != null) __obj.updateDynamic("pivotRowTotals")(pivotRowTotals)
    if (!js.isUndefined(pivotTotals)) __obj.updateDynamic("pivotTotals")(pivotTotals)
    if (popupParent != null) __obj.updateDynamic("popupParent")(popupParent)
    if (postProcessPopup != null) __obj.updateDynamic("postProcessPopup")(js.Any.fromFunction1(postProcessPopup))
    if (postSort != null) __obj.updateDynamic("postSort")(js.Any.fromFunction1(postSort))
    if (processCellForClipboard != null) __obj.updateDynamic("processCellForClipboard")(js.Any.fromFunction1(processCellForClipboard))
    if (processCellFromClipboard != null) __obj.updateDynamic("processCellFromClipboard")(js.Any.fromFunction1(processCellFromClipboard))
    if (processDataFromClipboard != null) __obj.updateDynamic("processDataFromClipboard")(js.Any.fromFunction1(processDataFromClipboard))
    if (processHeaderForClipboard != null) __obj.updateDynamic("processHeaderForClipboard")(js.Any.fromFunction1(processHeaderForClipboard))
    if (processRowPostCreate != null) __obj.updateDynamic("processRowPostCreate")(js.Any.fromFunction1(processRowPostCreate))
    if (processSecondaryColDef != null) __obj.updateDynamic("processSecondaryColDef")(js.Any.fromFunction1(processSecondaryColDef))
    if (processSecondaryColGroupDef != null) __obj.updateDynamic("processSecondaryColGroupDef")(js.Any.fromFunction1(processSecondaryColGroupDef))
    if (!js.isUndefined(purgeClosedRowNodes)) __obj.updateDynamic("purgeClosedRowNodes")(purgeClosedRowNodes)
    if (quickFilterText != null) __obj.updateDynamic("quickFilterText")(quickFilterText)
    if (!js.isUndefined(rememberGroupStateWhenNewData)) __obj.updateDynamic("rememberGroupStateWhenNewData")(rememberGroupStateWhenNewData)
    if (rowBuffer != null) __obj.updateDynamic("rowBuffer")(rowBuffer.asInstanceOf[js.Any])
    if (rowClass != null) __obj.updateDynamic("rowClass")(rowClass.asInstanceOf[js.Any])
    if (rowClassRules != null) __obj.updateDynamic("rowClassRules")(rowClassRules)
    if (rowData != null) __obj.updateDynamic("rowData")(rowData)
    if (!js.isUndefined(rowDeselection)) __obj.updateDynamic("rowDeselection")(rowDeselection)
    if (!js.isUndefined(rowDragManaged)) __obj.updateDynamic("rowDragManaged")(rowDragManaged)
    if (rowGroupPanelShow != null) __obj.updateDynamic("rowGroupPanelShow")(rowGroupPanelShow)
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    if (rowModelType != null) __obj.updateDynamic("rowModelType")(rowModelType)
    if (!js.isUndefined(rowMultiSelectWithClick)) __obj.updateDynamic("rowMultiSelectWithClick")(rowMultiSelectWithClick)
    if (rowSelection != null) __obj.updateDynamic("rowSelection")(rowSelection)
    if (rowStyle != null) __obj.updateDynamic("rowStyle")(rowStyle)
    if (scrollbarWidth != null) __obj.updateDynamic("scrollbarWidth")(scrollbarWidth.asInstanceOf[js.Any])
    if (sendToClipboard != null) __obj.updateDynamic("sendToClipboard")(js.Any.fromFunction1(sendToClipboard))
    if (serverSideDatasource != null) __obj.updateDynamic("serverSideDatasource")(serverSideDatasource)
    if (!js.isUndefined(serverSideSortingAlwaysResets)) __obj.updateDynamic("serverSideSortingAlwaysResets")(serverSideSortingAlwaysResets)
    if (!js.isUndefined(showToolPanel)) __obj.updateDynamic("showToolPanel")(showToolPanel)
    if (!js.isUndefined(singleClickEdit)) __obj.updateDynamic("singleClickEdit")(singleClickEdit)
    if (slaveGrids != null) __obj.updateDynamic("slaveGrids")(slaveGrids)
    if (sortingOrder != null) __obj.updateDynamic("sortingOrder")(sortingOrder)
    if (!js.isUndefined(stopEditingWhenGridLosesFocus)) __obj.updateDynamic("stopEditingWhenGridLosesFocus")(stopEditingWhenGridLosesFocus)
    if (!js.isUndefined(suppressAggAtRootLevel)) __obj.updateDynamic("suppressAggAtRootLevel")(suppressAggAtRootLevel)
    if (!js.isUndefined(suppressAggFuncInHeader)) __obj.updateDynamic("suppressAggFuncInHeader")(suppressAggFuncInHeader)
    if (!js.isUndefined(suppressAnimationFrame)) __obj.updateDynamic("suppressAnimationFrame")(suppressAnimationFrame)
    if (!js.isUndefined(suppressAsyncEvents)) __obj.updateDynamic("suppressAsyncEvents")(suppressAsyncEvents)
    if (!js.isUndefined(suppressAutoSize)) __obj.updateDynamic("suppressAutoSize")(suppressAutoSize)
    if (!js.isUndefined(suppressCellSelection)) __obj.updateDynamic("suppressCellSelection")(suppressCellSelection)
    if (!js.isUndefined(suppressChangeDetection)) __obj.updateDynamic("suppressChangeDetection")(suppressChangeDetection)
    if (!js.isUndefined(suppressClickEdit)) __obj.updateDynamic("suppressClickEdit")(suppressClickEdit)
    if (!js.isUndefined(suppressClipboardPaste)) __obj.updateDynamic("suppressClipboardPaste")(suppressClipboardPaste)
    if (!js.isUndefined(suppressColumnMoveAnimation)) __obj.updateDynamic("suppressColumnMoveAnimation")(suppressColumnMoveAnimation)
    if (!js.isUndefined(suppressColumnVirtualisation)) __obj.updateDynamic("suppressColumnVirtualisation")(suppressColumnVirtualisation)
    if (!js.isUndefined(suppressContextMenu)) __obj.updateDynamic("suppressContextMenu")(suppressContextMenu)
    if (!js.isUndefined(suppressCopyRowsToClipboard)) __obj.updateDynamic("suppressCopyRowsToClipboard")(suppressCopyRowsToClipboard)
    if (!js.isUndefined(suppressCsvExport)) __obj.updateDynamic("suppressCsvExport")(suppressCsvExport)
    if (!js.isUndefined(suppressDragLeaveHidesColumns)) __obj.updateDynamic("suppressDragLeaveHidesColumns")(suppressDragLeaveHidesColumns)
    if (!js.isUndefined(suppressEnterpriseResetOnNewColumns)) __obj.updateDynamic("suppressEnterpriseResetOnNewColumns")(suppressEnterpriseResetOnNewColumns)
    if (!js.isUndefined(suppressExcelExport)) __obj.updateDynamic("suppressExcelExport")(suppressExcelExport)
    if (!js.isUndefined(suppressFieldDotNotation)) __obj.updateDynamic("suppressFieldDotNotation")(suppressFieldDotNotation)
    if (!js.isUndefined(suppressFocusAfterRefresh)) __obj.updateDynamic("suppressFocusAfterRefresh")(suppressFocusAfterRefresh)
    if (!js.isUndefined(suppressHorizontalScroll)) __obj.updateDynamic("suppressHorizontalScroll")(suppressHorizontalScroll)
    if (!js.isUndefined(suppressLoadingOverlay)) __obj.updateDynamic("suppressLoadingOverlay")(suppressLoadingOverlay)
    if (!js.isUndefined(suppressMakeColumnVisibleAfterUnGroup)) __obj.updateDynamic("suppressMakeColumnVisibleAfterUnGroup")(suppressMakeColumnVisibleAfterUnGroup)
    if (!js.isUndefined(suppressMenuHide)) __obj.updateDynamic("suppressMenuHide")(suppressMenuHide)
    __obj.asInstanceOf[GridOptions]
  }
}

