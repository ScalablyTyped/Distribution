package typings.agGrid.gridOptionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.agGrid.anon.Instantiable
import typings.agGrid.anon.InstantiableAny
import typings.agGrid.anon.InstantiableICellRendererComp
import typings.agGrid.anon.InstantiableILoadingOverlayComp
import typings.agGrid.anon.InstantiableINoRowsOverlayComp
import typings.agGrid.colDefMod.ColDef
import typings.agGrid.colDefMod.ColGroupDef
import typings.agGrid.colDefMod.IAggFunc
import typings.agGrid.columnApiMod.ColumnApi
import typings.agGrid.componentProviderMod.AgGridRegisteredComponentInput
import typings.agGrid.componentResolverMod.ComponentHolder
import typings.agGrid.eventsMod.BodyScrollEvent
import typings.agGrid.eventsMod.CellClickedEvent
import typings.agGrid.eventsMod.CellContextMenuEvent
import typings.agGrid.eventsMod.CellDoubleClickedEvent
import typings.agGrid.eventsMod.CellEditingStartedEvent
import typings.agGrid.eventsMod.CellEditingStoppedEvent
import typings.agGrid.eventsMod.CellFocusedEvent
import typings.agGrid.eventsMod.CellMouseDownEvent
import typings.agGrid.eventsMod.CellMouseOutEvent
import typings.agGrid.eventsMod.CellMouseOverEvent
import typings.agGrid.eventsMod.CellValueChangedEvent
import typings.agGrid.eventsMod.ColumnAggFuncChangeRequestEvent
import typings.agGrid.eventsMod.ColumnEverythingChangedEvent
import typings.agGrid.eventsMod.ColumnGroupOpenedEvent
import typings.agGrid.eventsMod.ColumnMovedEvent
import typings.agGrid.eventsMod.ColumnPinnedEvent
import typings.agGrid.eventsMod.ColumnPivotChangeRequestEvent
import typings.agGrid.eventsMod.ColumnPivotChangedEvent
import typings.agGrid.eventsMod.ColumnPivotModeChangedEvent
import typings.agGrid.eventsMod.ColumnResizedEvent
import typings.agGrid.eventsMod.ColumnRowGroupChangeRequestEvent
import typings.agGrid.eventsMod.ColumnRowGroupChangedEvent
import typings.agGrid.eventsMod.ColumnValueChangeRequestEvent
import typings.agGrid.eventsMod.ColumnValueChangedEvent
import typings.agGrid.eventsMod.ColumnVisibleEvent
import typings.agGrid.eventsMod.DisplayedColumnsChangedEvent
import typings.agGrid.eventsMod.DragStartedEvent
import typings.agGrid.eventsMod.DragStoppedEvent
import typings.agGrid.eventsMod.FilterChangedEvent
import typings.agGrid.eventsMod.FilterModifiedEvent
import typings.agGrid.eventsMod.GridColumnsChangedEvent
import typings.agGrid.eventsMod.GridReadyEvent
import typings.agGrid.eventsMod.ModelUpdatedEvent
import typings.agGrid.eventsMod.NewColumnsLoadedEvent
import typings.agGrid.eventsMod.PaginationChangedEvent
import typings.agGrid.eventsMod.PasteEndEvent
import typings.agGrid.eventsMod.PasteStartEvent
import typings.agGrid.eventsMod.PinnedRowDataChangedEvent
import typings.agGrid.eventsMod.RangeSelectionChangedEvent
import typings.agGrid.eventsMod.RowClickedEvent
import typings.agGrid.eventsMod.RowDataChangedEvent
import typings.agGrid.eventsMod.RowDataUpdatedEvent
import typings.agGrid.eventsMod.RowDoubleClickedEvent
import typings.agGrid.eventsMod.RowDragEvent
import typings.agGrid.eventsMod.RowEditingStartedEvent
import typings.agGrid.eventsMod.RowEditingStoppedEvent
import typings.agGrid.eventsMod.RowGroupOpenedEvent
import typings.agGrid.eventsMod.RowSelectedEvent
import typings.agGrid.eventsMod.RowValueChangedEvent
import typings.agGrid.eventsMod.SelectionChangedEvent
import typings.agGrid.eventsMod.SortChangedEvent
import typings.agGrid.eventsMod.ViewportChangedEvent
import typings.agGrid.eventsMod.VirtualColumnsChangedEvent
import typings.agGrid.eventsMod.VirtualRowRemovedEvent
import typings.agGrid.exportParamsMod.CsvExportParams
import typings.agGrid.exportParamsMod.ProcessCellForExportParams
import typings.agGrid.exportParamsMod.ProcessHeaderForExportParams
import typings.agGrid.gridApiMod.GridApi
import typings.agGrid.gridCellMod.GridCellDef
import typings.agGrid.iCellRendererMod.ICellRendererFunc
import typings.agGrid.iComponentMod.IComponent
import typings.agGrid.iDatasourceMod.IDatasource
import typings.agGrid.iServerSideDatasourceMod.IServerSideDatasource
import typings.agGrid.iViewportDatasourceMod.IViewportDatasource
import typings.agGrid.rowNodeMod.RowNode
import typings.std.Document
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridOptions extends ComponentHolder {
  var accentedSort: js.UndefOr[Boolean] = js.native
  var aggFuncs: js.UndefOr[StringDictionary[IAggFunc]] = js.native
  var aggregateOnlyChangedColumns: js.UndefOr[Boolean] = js.native
  var alignedGrids: js.UndefOr[js.Array[GridOptions]] = js.native
  var allowContextMenuWithControlKey: js.UndefOr[Boolean] = js.native
  var alwaysShowStatusBar: js.UndefOr[Boolean] = js.native
  var angularCompileFilters: js.UndefOr[Boolean] = js.native
  var angularCompileHeaders: js.UndefOr[Boolean] = js.native
  var angularCompileRows: js.UndefOr[Boolean] = js.native
  var animateRows: js.UndefOr[Boolean] = js.native
  /****************************************************************
    * Don't forget to update ComponentUtil if changing this class. *
    ****************************************************************/
  var api: js.UndefOr[GridApi] = js.native
  var autoGroupColumnDef: js.UndefOr[ColDef] = js.native
  var autoSizePadding: js.UndefOr[Double] = js.native
  var batchUpdateWaitMillis: js.UndefOr[Double] = js.native
  var cacheBlockSize: js.UndefOr[Double] = js.native
  var cacheOverflowSize: js.UndefOr[Double] = js.native
  var cacheQuickFilter: js.UndefOr[Boolean] = js.native
  var clipboardDeliminator: js.UndefOr[String] = js.native
  var colResizeDefault: js.UndefOr[String] = js.native
  var colWidth: js.UndefOr[Double] = js.native
  var columnApi: js.UndefOr[ColumnApi] = js.native
  var columnDefs: js.UndefOr[js.Array[ColDef | ColGroupDef]] = js.native
  var columnTypes: js.UndefOr[StringDictionary[ColDef]] = js.native
  var components: js.UndefOr[StringDictionary[AgGridRegisteredComponentInput[IComponent[_]]]] = js.native
  /****************************************************************
    * Don't forget to update ComponentUtil if changing this class. *
    ****************************************************************/
  var context: js.UndefOr[js.Any] = js.native
  var contractColumnSelection: js.UndefOr[Boolean] = js.native
  var datasource: js.UndefOr[IDatasource] = js.native
  var dateComponent: js.UndefOr[Instantiable] = js.native
  var dateComponentFramework: js.UndefOr[js.Any] = js.native
  var debug: js.UndefOr[Boolean] = js.native
  var defaultColDef: js.UndefOr[ColDef] = js.native
  var defaultColGroupDef: js.UndefOr[ColGroupDef] = js.native
  var defaultExportParams: js.UndefOr[CsvExportParams] = js.native
  var defaultGroupSortComparator: js.UndefOr[js.Function2[/* nodeA */ RowNode, /* nodeB */ RowNode, Double]] = js.native
  var deltaRowDataMode: js.UndefOr[Boolean] = js.native
  var detailCellRenderer: js.UndefOr[InstantiableICellRendererComp | ICellRendererFunc | String] = js.native
  var detailCellRendererFramework: js.UndefOr[js.Any] = js.native
  var detailCellRendererParams: js.UndefOr[js.Any] = js.native
  var detailRowHeight: js.UndefOr[Double] = js.native
  var doesDataFlower: js.UndefOr[js.Function1[/* dataItem */ js.Any, Boolean]] = js.native
  var doesExternalFilterPass: js.UndefOr[js.Function1[/* node */ RowNode, Boolean]] = js.native
  var domLayout: js.UndefOr[String] = js.native
  var editType: js.UndefOr[String] = js.native
  var embedFullWidthRows: js.UndefOr[Boolean] = js.native
  var enableCellChangeFlash: js.UndefOr[Boolean] = js.native
  var enableCellExpressions: js.UndefOr[Boolean] = js.native
  var enableColResize: js.UndefOr[Boolean] = js.native
  var enableFilter: js.UndefOr[Boolean] = js.native
  var enableGroupEdit: js.UndefOr[Boolean] = js.native
  var enableOldSetFilterModel: js.UndefOr[Boolean] = js.native
  var enableRangeSelection: js.UndefOr[Boolean] = js.native
  var enableRtl: js.UndefOr[Boolean] = js.native
  var enableServerSideFilter: js.UndefOr[Boolean] = js.native
  var enableServerSideSorting: js.UndefOr[Boolean] = js.native
  var enableSorting: js.UndefOr[Boolean] = js.native
  var enableStatusBar: js.UndefOr[Boolean] = js.native
  var ensureDomOrder: js.UndefOr[Boolean] = js.native
  var enterMovesDown: js.UndefOr[Boolean] = js.native
  var enterMovesDownAfterEdit: js.UndefOr[Boolean] = js.native
  var excelStyles: js.UndefOr[js.Array[_]] = js.native
  var floatingFilter: js.UndefOr[Boolean] = js.native
  var floatingFiltersHeight: js.UndefOr[Double] = js.native
  var forPrint: js.UndefOr[Boolean] = js.native
  var frameworkComponents: js.UndefOr[StringDictionary[InstantiableAny]] = js.native
  var fullWidthCellRenderer: js.UndefOr[InstantiableICellRendererComp | ICellRendererFunc | String] = js.native
  var fullWidthCellRendererFramework: js.UndefOr[js.Any] = js.native
  var fullWidthCellRendererParams: js.UndefOr[js.Any] = js.native
  var functionsPassive: js.UndefOr[Boolean] = js.native
  var functionsReadOnly: js.UndefOr[Boolean] = js.native
  var getBusinessKeyForNode: js.UndefOr[js.Function1[/* node */ RowNode, String]] = js.native
  var getChildCount: js.UndefOr[js.Function1[/* dataItem */ js.Any, Double]] = js.native
  var getContextMenuItems: js.UndefOr[GetContextMenuItems] = js.native
  var getDataPath: js.UndefOr[GetDataPath] = js.native
  var getDocument: js.UndefOr[js.Function0[Document]] = js.native
  var getMainMenuItems: js.UndefOr[GetMainMenuItems] = js.native
  var getNodeChildDetails: js.UndefOr[GetNodeChildDetails] = js.native
  var getRowClass: js.UndefOr[js.Function1[/* params */ js.Any, String | js.Array[String]]] = js.native
  var getRowHeight: js.UndefOr[js.Function] = js.native
  var getRowNodeId: js.UndefOr[GetRowNodeIdFunc] = js.native
  var getRowStyle: js.UndefOr[js.Function] = js.native
  var gridAutoHeight: js.UndefOr[Boolean] = js.native
  var groupColumnDef: js.UndefOr[ColDef] = js.native
  var groupDefaultExpanded: js.UndefOr[Double] = js.native
  var groupHeaderHeight: js.UndefOr[Double] = js.native
  var groupHideOpenParents: js.UndefOr[Boolean] = js.native
  var groupIncludeFooter: js.UndefOr[Boolean] = js.native
  var groupIncludeTotalFooter: js.UndefOr[Boolean] = js.native
  var groupMultiAutoColumn: js.UndefOr[Boolean] = js.native
  var groupRemoveLowestSingleChildren: js.UndefOr[Boolean] = js.native
  var groupRemoveSingleChildren: js.UndefOr[Boolean] = js.native
  var groupRowAggNodes: js.UndefOr[js.Function1[/* nodes */ js.Array[RowNode], _]] = js.native
  var groupRowInnerRenderer: js.UndefOr[InstantiableICellRendererComp | ICellRendererFunc | String] = js.native
  var groupRowInnerRendererFramework: js.UndefOr[js.Any] = js.native
  var groupRowRenderer: js.UndefOr[InstantiableICellRendererComp | ICellRendererFunc | String] = js.native
  var groupRowRendererFramework: js.UndefOr[js.Any] = js.native
  var groupRowRendererParams: js.UndefOr[js.Any] = js.native
  var groupSelectsChildren: js.UndefOr[Boolean] = js.native
  var groupSelectsFiltered: js.UndefOr[Boolean] = js.native
  /****************************************************************
    * Don't forget to update ComponentUtil if changing this class. *
    ****************************************************************/
  var groupSuppressAutoColumn: js.UndefOr[Boolean] = js.native
  var groupSuppressBlankHeader: js.UndefOr[Boolean] = js.native
  var groupSuppressRow: js.UndefOr[Boolean] = js.native
  var groupUseEntireRow: js.UndefOr[Boolean] = js.native
  var headerHeight: js.UndefOr[Double] = js.native
  var icons: js.UndefOr[js.Any] = js.native
  var infiniteInitialRowCount: js.UndefOr[Double] = js.native
  var isExternalFilterPresent: js.UndefOr[js.Function0[Boolean]] = js.native
  var isFullWidthCell: js.UndefOr[js.Function1[/* rowNode */ RowNode, Boolean]] = js.native
  var isRowMaster: js.UndefOr[IsRowMaster] = js.native
  var isRowSelectable: js.UndefOr[IsRowSelectable] = js.native
  var loadingOverlayComponent: js.UndefOr[InstantiableILoadingOverlayComp | String] = js.native
  var loadingOverlayComponentFramework: js.UndefOr[js.Any] = js.native
  /****************************************************************
    * Don't forget to update ComponentUtil if changing this class. *
    ****************************************************************/
  var localeText: js.UndefOr[js.Any] = js.native
  var localeTextFunc: js.UndefOr[js.Function] = js.native
  var masterDetail: js.UndefOr[Boolean] = js.native
  var maxBlocksInCache: js.UndefOr[Double] = js.native
  var maxColWidth: js.UndefOr[Double] = js.native
  var maxConcurrentDatasourceRequests: js.UndefOr[Double] = js.native
  var minColWidth: js.UndefOr[Double] = js.native
  var multiSortKey: js.UndefOr[String] = js.native
  var navigateToNextCell: js.UndefOr[js.Function1[/* params */ NavigateToNextCellParams, GridCellDef]] = js.native
  var noRowsOverlayComponent: js.UndefOr[InstantiableINoRowsOverlayComp | String] = js.native
  var noRowsOverlayComponentFramework: js.UndefOr[js.Any] = js.native
  var onBodyScroll: js.UndefOr[js.Function1[/* event */ BodyScrollEvent, Unit]] = js.native
  var onCellClicked: js.UndefOr[js.Function1[/* event */ CellClickedEvent, Unit]] = js.native
  var onCellContextMenu: js.UndefOr[js.Function1[/* event */ CellContextMenuEvent, Unit]] = js.native
  var onCellDoubleClicked: js.UndefOr[js.Function1[/* event */ CellDoubleClickedEvent, Unit]] = js.native
  var onCellEditingStarted: js.UndefOr[js.Function1[/* event */ CellEditingStartedEvent, Unit]] = js.native
  var onCellEditingStopped: js.UndefOr[js.Function1[/* event */ CellEditingStoppedEvent, Unit]] = js.native
  var onCellFocused: js.UndefOr[js.Function1[/* event */ CellFocusedEvent, Unit]] = js.native
  var onCellMouseDown: js.UndefOr[js.Function1[/* event */ CellMouseDownEvent, Unit]] = js.native
  var onCellMouseOut: js.UndefOr[js.Function1[/* event */ CellMouseOutEvent, Unit]] = js.native
  var onCellMouseOver: js.UndefOr[js.Function1[/* event */ CellMouseOverEvent, Unit]] = js.native
  var onCellValueChanged: js.UndefOr[js.Function1[/* event */ CellValueChangedEvent, Unit]] = js.native
  var onColumnAggFuncChangeRequest: js.UndefOr[js.Function1[/* event */ ColumnAggFuncChangeRequestEvent, Unit]] = js.native
  /****************************************************************
    * Don't forget to update ComponentUtil if changing this class. *
    ****************************************************************/
  var onColumnEverythingChanged: js.UndefOr[js.Function1[/* event */ ColumnEverythingChangedEvent, Unit]] = js.native
  var onColumnGroupOpened: js.UndefOr[js.Function1[/* event */ ColumnGroupOpenedEvent, Unit]] = js.native
  var onColumnMoved: js.UndefOr[js.Function1[/* event */ ColumnMovedEvent, Unit]] = js.native
  var onColumnPinned: js.UndefOr[js.Function1[/* event */ ColumnPinnedEvent, Unit]] = js.native
  var onColumnPivotChangeRequest: js.UndefOr[js.Function1[/* event */ ColumnPivotChangeRequestEvent, Unit]] = js.native
  var onColumnPivotChanged: js.UndefOr[js.Function1[/* event */ ColumnPivotChangedEvent, Unit]] = js.native
  var onColumnPivotModeChanged: js.UndefOr[js.Function1[/* event */ ColumnPivotModeChangedEvent, Unit]] = js.native
  var onColumnResized: js.UndefOr[js.Function1[/* event */ ColumnResizedEvent, Unit]] = js.native
  var onColumnRowGroupChangeRequest: js.UndefOr[js.Function1[/* event */ ColumnRowGroupChangeRequestEvent, Unit]] = js.native
  var onColumnRowGroupChanged: js.UndefOr[js.Function1[/* event */ ColumnRowGroupChangedEvent, Unit]] = js.native
  var onColumnValueChangeRequest: js.UndefOr[js.Function1[/* event */ ColumnValueChangeRequestEvent, Unit]] = js.native
  var onColumnValueChanged: js.UndefOr[js.Function1[/* event */ ColumnValueChangedEvent, Unit]] = js.native
  var onColumnVisible: js.UndefOr[js.Function1[/* event */ ColumnVisibleEvent, Unit]] = js.native
  var onDisplayedColumnsChanged: js.UndefOr[js.Function1[/* event */ DisplayedColumnsChangedEvent, Unit]] = js.native
  var onDragStarted: js.UndefOr[js.Function1[/* event */ DragStartedEvent, Unit]] = js.native
  var onDragStopped: js.UndefOr[js.Function1[/* event */ DragStoppedEvent, Unit]] = js.native
  var onFilterChanged: js.UndefOr[js.Function1[/* event */ FilterChangedEvent, Unit]] = js.native
  var onFilterModified: js.UndefOr[js.Function1[/* event */ FilterModifiedEvent, Unit]] = js.native
  var onGridColumnsChanged: js.UndefOr[js.Function1[/* event */ GridColumnsChangedEvent, Unit]] = js.native
  var onGridReady: js.UndefOr[js.Function1[/* event */ GridReadyEvent, Unit]] = js.native
  var onGridSizeChanged: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.native
  var onModelUpdated: js.UndefOr[js.Function1[/* event */ ModelUpdatedEvent, Unit]] = js.native
  var onNewColumnsLoaded: js.UndefOr[js.Function1[/* event */ NewColumnsLoadedEvent, Unit]] = js.native
  var onPaginationChanged: js.UndefOr[js.Function1[/* event */ PaginationChangedEvent, Unit]] = js.native
  var onPasteEnd: js.UndefOr[js.Function1[/* event */ PasteEndEvent, Unit]] = js.native
  var onPasteStart: js.UndefOr[js.Function1[/* event */ PasteStartEvent, Unit]] = js.native
  var onPinnedRowDataChanged: js.UndefOr[js.Function1[/* event */ PinnedRowDataChangedEvent, Unit]] = js.native
  var onRangeSelectionChanged: js.UndefOr[js.Function1[/* event */ RangeSelectionChangedEvent, Unit]] = js.native
  var onRowClicked: js.UndefOr[js.Function1[/* event */ RowClickedEvent, Unit]] = js.native
  var onRowDataChanged: js.UndefOr[js.Function1[/* event */ RowDataChangedEvent, Unit]] = js.native
  var onRowDataUpdated: js.UndefOr[js.Function1[/* event */ RowDataUpdatedEvent, Unit]] = js.native
  var onRowDoubleClicked: js.UndefOr[js.Function1[/* event */ RowDoubleClickedEvent, Unit]] = js.native
  var onRowDragEnd: js.UndefOr[js.Function1[/* event */ RowDragEvent, Unit]] = js.native
  var onRowDragEnter: js.UndefOr[js.Function1[/* event */ RowDragEvent, Unit]] = js.native
  var onRowDragLeave: js.UndefOr[js.Function1[/* event */ RowDragEvent, Unit]] = js.native
  var onRowDragMove: js.UndefOr[js.Function1[/* event */ RowDragEvent, Unit]] = js.native
  var onRowEditingStarted: js.UndefOr[js.Function1[/* event */ RowEditingStartedEvent, Unit]] = js.native
  var onRowEditingStopped: js.UndefOr[js.Function1[/* event */ RowEditingStoppedEvent, Unit]] = js.native
  var onRowGroupOpened: js.UndefOr[js.Function1[/* event */ RowGroupOpenedEvent, Unit]] = js.native
  var onRowSelected: js.UndefOr[js.Function1[/* event */ RowSelectedEvent, Unit]] = js.native
  var onRowValueChanged: js.UndefOr[js.Function1[/* event */ RowValueChangedEvent, Unit]] = js.native
  var onSelectionChanged: js.UndefOr[js.Function1[/* event */ SelectionChangedEvent, Unit]] = js.native
  var onSortChanged: js.UndefOr[js.Function1[/* event */ SortChangedEvent, Unit]] = js.native
  var onViewportChanged: js.UndefOr[js.Function1[/* event */ ViewportChangedEvent, Unit]] = js.native
  var onVirtualColumnsChanged: js.UndefOr[js.Function1[/* event */ VirtualColumnsChangedEvent, Unit]] = js.native
  var onVirtualRowRemoved: js.UndefOr[js.Function1[/* event */ VirtualRowRemovedEvent, Unit]] = js.native
  var overlayLoadingTemplate: js.UndefOr[String] = js.native
  var overlayNoRowsTemplate: js.UndefOr[String] = js.native
  var pagination: js.UndefOr[Boolean] = js.native
  var paginationAutoPageSize: js.UndefOr[Boolean] = js.native
  /****************************************************************
    * Don't forget to update ComponentUtil if changing this class. *
    ****************************************************************/
  var paginationNumberFormatter: js.UndefOr[js.Function1[/* params */ PaginationNumberFormatterParams, String]] = js.native
  var paginationPageSize: js.UndefOr[Double] = js.native
  var paginationStartPage: js.UndefOr[Double] = js.native
  var pinnedBottomRowData: js.UndefOr[js.Array[_]] = js.native
  var pinnedTopRowData: js.UndefOr[js.Array[_]] = js.native
  var pivotColumnGroupTotals: js.UndefOr[String] = js.native
  var pivotGroupHeaderHeight: js.UndefOr[Double] = js.native
  var pivotHeaderHeight: js.UndefOr[Double] = js.native
  var pivotMode: js.UndefOr[Boolean] = js.native
  var pivotPanelShow: js.UndefOr[String] = js.native
  var pivotRowTotals: js.UndefOr[String] = js.native
  var pivotTotals: js.UndefOr[Boolean] = js.native
  var popupParent: js.UndefOr[HTMLElement] = js.native
  var postProcessPopup: js.UndefOr[js.Function1[/* params */ PostProcessPopupParams, Unit]] = js.native
  var postSort: js.UndefOr[js.Function1[/* nodes */ js.Array[RowNode], Unit]] = js.native
  var processCellForClipboard: js.UndefOr[js.Function1[/* params */ ProcessCellForExportParams, _]] = js.native
  var processCellFromClipboard: js.UndefOr[js.Function1[/* params */ ProcessCellForExportParams, _]] = js.native
  var processDataFromClipboard: js.UndefOr[
    js.Function1[/* params */ ProcessDataFromClipboardParams, js.Array[js.Array[String]]]
  ] = js.native
  var processHeaderForClipboard: js.UndefOr[js.Function1[/* params */ ProcessHeaderForExportParams, _]] = js.native
  var processRowPostCreate: js.UndefOr[js.Function1[/* params */ ProcessRowParams, Unit]] = js.native
  var processSecondaryColDef: js.UndefOr[js.Function1[/* colDef */ ColDef, Unit]] = js.native
  var processSecondaryColGroupDef: js.UndefOr[js.Function1[/* colGroupDef */ ColGroupDef, Unit]] = js.native
  var purgeClosedRowNodes: js.UndefOr[Boolean] = js.native
  var quickFilterText: js.UndefOr[String] = js.native
  var rememberGroupStateWhenNewData: js.UndefOr[Boolean] = js.native
  var rowBuffer: js.UndefOr[Double] = js.native
  var rowClass: js.UndefOr[String | js.Array[String]] = js.native
  var rowClassRules: js.UndefOr[StringDictionary[js.Function | String]] = js.native
  /****************************************************************
    * Don't forget to update ComponentUtil if changing this class. *
    ****************************************************************/
  var rowData: js.UndefOr[js.Array[_]] = js.native
  var rowDeselection: js.UndefOr[Boolean] = js.native
  /****************************************************************
    * Don't forget to update ComponentUtil if changing this class. PLEASE!*
    ****************************************************************/
  var rowDragManaged: js.UndefOr[Boolean] = js.native
  var rowGroupPanelShow: js.UndefOr[String] = js.native
  var rowHeight: js.UndefOr[Double] = js.native
  var rowModelType: js.UndefOr[String] = js.native
  var rowMultiSelectWithClick: js.UndefOr[Boolean] = js.native
  var rowSelection: js.UndefOr[String] = js.native
  var rowStyle: js.UndefOr[js.Any] = js.native
  var scrollbarWidth: js.UndefOr[Double] = js.native
  var sendToClipboard: js.UndefOr[js.Function1[/* params */ js.Any, Unit]] = js.native
  var serverSideDatasource: js.UndefOr[IServerSideDatasource] = js.native
  var serverSideSortingAlwaysResets: js.UndefOr[Boolean] = js.native
  var showToolPanel: js.UndefOr[Boolean] = js.native
  var singleClickEdit: js.UndefOr[Boolean] = js.native
  var slaveGrids: js.UndefOr[js.Array[GridOptions]] = js.native
  var sortingOrder: js.UndefOr[js.Array[String]] = js.native
  var stopEditingWhenGridLosesFocus: js.UndefOr[Boolean] = js.native
  var suppressAggAtRootLevel: js.UndefOr[Boolean] = js.native
  var suppressAggFuncInHeader: js.UndefOr[Boolean] = js.native
  var suppressAnimationFrame: js.UndefOr[Boolean] = js.native
  var suppressAsyncEvents: js.UndefOr[Boolean] = js.native
  var suppressAutoSize: js.UndefOr[Boolean] = js.native
  var suppressCellSelection: js.UndefOr[Boolean] = js.native
  var suppressChangeDetection: js.UndefOr[Boolean] = js.native
  var suppressClickEdit: js.UndefOr[Boolean] = js.native
  var suppressClipboardPaste: js.UndefOr[Boolean] = js.native
  var suppressColumnMoveAnimation: js.UndefOr[Boolean] = js.native
  var suppressColumnVirtualisation: js.UndefOr[Boolean] = js.native
  var suppressContextMenu: js.UndefOr[Boolean] = js.native
  var suppressCopyRowsToClipboard: js.UndefOr[Boolean] = js.native
  var suppressCsvExport: js.UndefOr[Boolean] = js.native
  var suppressDragLeaveHidesColumns: js.UndefOr[Boolean] = js.native
  var suppressEnterpriseResetOnNewColumns: js.UndefOr[Boolean] = js.native
  var suppressExcelExport: js.UndefOr[Boolean] = js.native
  var suppressFieldDotNotation: js.UndefOr[Boolean] = js.native
  var suppressFocusAfterRefresh: js.UndefOr[Boolean] = js.native
  var suppressHorizontalScroll: js.UndefOr[Boolean] = js.native
  var suppressLoadingOverlay: js.UndefOr[Boolean] = js.native
  var suppressMakeColumnVisibleAfterUnGroup: js.UndefOr[Boolean] = js.native
  var suppressMenuHide: js.UndefOr[Boolean] = js.native
  var suppressMiddleClickScrolls: js.UndefOr[Boolean] = js.native
  var suppressMovableColumns: js.UndefOr[Boolean] = js.native
  var suppressMultiRangeSelection: js.UndefOr[Boolean] = js.native
  var suppressMultiSort: js.UndefOr[Boolean] = js.native
  var suppressNoRowsOverlay: js.UndefOr[Boolean] = js.native
  var suppressPaginationPanel: js.UndefOr[Boolean] = js.native
  var suppressParentsInRowNodes: js.UndefOr[Boolean] = js.native
  var suppressPreventDefaultOnMouseWheel: js.UndefOr[Boolean] = js.native
  var suppressPropertyNamesCheck: js.UndefOr[Boolean] = js.native
  var suppressRowClickSelection: js.UndefOr[Boolean] = js.native
  var suppressRowDrag: js.UndefOr[Boolean] = js.native
  var suppressRowHoverHighlight: js.UndefOr[Boolean] = js.native
  var suppressRowTransform: js.UndefOr[Boolean] = js.native
  var suppressScrollOnNewData: js.UndefOr[Boolean] = js.native
  var suppressTabbing: js.UndefOr[Boolean] = js.native
  var suppressTouch: js.UndefOr[Boolean] = js.native
  var tabToNextCell: js.UndefOr[js.Function1[/* params */ TabToNextCellParams, GridCellDef]] = js.native
  var toolPanelSuppressColumnExpandAll: js.UndefOr[Boolean] = js.native
  var toolPanelSuppressColumnFilter: js.UndefOr[Boolean] = js.native
  var toolPanelSuppressColumnSelectAll: js.UndefOr[Boolean] = js.native
  var toolPanelSuppressPivotMode: js.UndefOr[Boolean] = js.native
  var toolPanelSuppressPivots: js.UndefOr[Boolean] = js.native
  var toolPanelSuppressRowGroups: js.UndefOr[Boolean] = js.native
  var toolPanelSuppressSideButtons: js.UndefOr[Boolean] = js.native
  var toolPanelSuppressValues: js.UndefOr[Boolean] = js.native
  var treeData: js.UndefOr[Boolean] = js.native
  var unSortIcon: js.UndefOr[Boolean] = js.native
  var valueCache: js.UndefOr[Boolean] = js.native
  var valueCacheNeverExpires: js.UndefOr[Boolean] = js.native
  var viewportDatasource: js.UndefOr[IViewportDatasource] = js.native
  var viewportRowModelBufferSize: js.UndefOr[Double] = js.native
  var viewportRowModelPageSize: js.UndefOr[Double] = js.native
}

object GridOptions {
  @scala.inline
  def apply(): GridOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridOptions]
  }
  @scala.inline
  implicit class GridOptionsOps[Self <: GridOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccentedSort(value: Boolean): Self = this.set("accentedSort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccentedSort: Self = this.set("accentedSort", js.undefined)
    @scala.inline
    def setAggFuncs(value: StringDictionary[IAggFunc]): Self = this.set("aggFuncs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAggFuncs: Self = this.set("aggFuncs", js.undefined)
    @scala.inline
    def setAggregateOnlyChangedColumns(value: Boolean): Self = this.set("aggregateOnlyChangedColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAggregateOnlyChangedColumns: Self = this.set("aggregateOnlyChangedColumns", js.undefined)
    @scala.inline
    def setAlignedGridsVarargs(value: GridOptions*): Self = this.set("alignedGrids", js.Array(value :_*))
    @scala.inline
    def setAlignedGrids(value: js.Array[GridOptions]): Self = this.set("alignedGrids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignedGrids: Self = this.set("alignedGrids", js.undefined)
    @scala.inline
    def setAllowContextMenuWithControlKey(value: Boolean): Self = this.set("allowContextMenuWithControlKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowContextMenuWithControlKey: Self = this.set("allowContextMenuWithControlKey", js.undefined)
    @scala.inline
    def setAlwaysShowStatusBar(value: Boolean): Self = this.set("alwaysShowStatusBar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlwaysShowStatusBar: Self = this.set("alwaysShowStatusBar", js.undefined)
    @scala.inline
    def setAngularCompileFilters(value: Boolean): Self = this.set("angularCompileFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAngularCompileFilters: Self = this.set("angularCompileFilters", js.undefined)
    @scala.inline
    def setAngularCompileHeaders(value: Boolean): Self = this.set("angularCompileHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAngularCompileHeaders: Self = this.set("angularCompileHeaders", js.undefined)
    @scala.inline
    def setAngularCompileRows(value: Boolean): Self = this.set("angularCompileRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAngularCompileRows: Self = this.set("angularCompileRows", js.undefined)
    @scala.inline
    def setAnimateRows(value: Boolean): Self = this.set("animateRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimateRows: Self = this.set("animateRows", js.undefined)
    @scala.inline
    def setApi(value: GridApi): Self = this.set("api", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApi: Self = this.set("api", js.undefined)
    @scala.inline
    def setAutoGroupColumnDef(value: ColDef): Self = this.set("autoGroupColumnDef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoGroupColumnDef: Self = this.set("autoGroupColumnDef", js.undefined)
    @scala.inline
    def setAutoSizePadding(value: Double): Self = this.set("autoSizePadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoSizePadding: Self = this.set("autoSizePadding", js.undefined)
    @scala.inline
    def setBatchUpdateWaitMillis(value: Double): Self = this.set("batchUpdateWaitMillis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBatchUpdateWaitMillis: Self = this.set("batchUpdateWaitMillis", js.undefined)
    @scala.inline
    def setCacheBlockSize(value: Double): Self = this.set("cacheBlockSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheBlockSize: Self = this.set("cacheBlockSize", js.undefined)
    @scala.inline
    def setCacheOverflowSize(value: Double): Self = this.set("cacheOverflowSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheOverflowSize: Self = this.set("cacheOverflowSize", js.undefined)
    @scala.inline
    def setCacheQuickFilter(value: Boolean): Self = this.set("cacheQuickFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheQuickFilter: Self = this.set("cacheQuickFilter", js.undefined)
    @scala.inline
    def setClipboardDeliminator(value: String): Self = this.set("clipboardDeliminator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClipboardDeliminator: Self = this.set("clipboardDeliminator", js.undefined)
    @scala.inline
    def setColResizeDefault(value: String): Self = this.set("colResizeDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColResizeDefault: Self = this.set("colResizeDefault", js.undefined)
    @scala.inline
    def setColWidth(value: Double): Self = this.set("colWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColWidth: Self = this.set("colWidth", js.undefined)
    @scala.inline
    def setColumnApi(value: ColumnApi): Self = this.set("columnApi", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnApi: Self = this.set("columnApi", js.undefined)
    @scala.inline
    def setColumnDefsVarargs(value: (ColDef | ColGroupDef)*): Self = this.set("columnDefs", js.Array(value :_*))
    @scala.inline
    def setColumnDefs(value: js.Array[ColDef | ColGroupDef]): Self = this.set("columnDefs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnDefs: Self = this.set("columnDefs", js.undefined)
    @scala.inline
    def setColumnTypes(value: StringDictionary[ColDef]): Self = this.set("columnTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnTypes: Self = this.set("columnTypes", js.undefined)
    @scala.inline
    def setComponents(value: StringDictionary[AgGridRegisteredComponentInput[IComponent[_]]]): Self = this.set("components", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponents: Self = this.set("components", js.undefined)
    @scala.inline
    def setContext(value: js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setContractColumnSelection(value: Boolean): Self = this.set("contractColumnSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContractColumnSelection: Self = this.set("contractColumnSelection", js.undefined)
    @scala.inline
    def setDatasource(value: IDatasource): Self = this.set("datasource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatasource: Self = this.set("datasource", js.undefined)
    @scala.inline
    def setDateComponent(value: Instantiable): Self = this.set("dateComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateComponent: Self = this.set("dateComponent", js.undefined)
    @scala.inline
    def setDateComponentFramework(value: js.Any): Self = this.set("dateComponentFramework", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateComponentFramework: Self = this.set("dateComponentFramework", js.undefined)
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setDefaultColDef(value: ColDef): Self = this.set("defaultColDef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultColDef: Self = this.set("defaultColDef", js.undefined)
    @scala.inline
    def setDefaultColGroupDef(value: ColGroupDef): Self = this.set("defaultColGroupDef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultColGroupDef: Self = this.set("defaultColGroupDef", js.undefined)
    @scala.inline
    def setDefaultExportParams(value: CsvExportParams): Self = this.set("defaultExportParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultExportParams: Self = this.set("defaultExportParams", js.undefined)
    @scala.inline
    def setDefaultGroupSortComparator(value: (/* nodeA */ RowNode, /* nodeB */ RowNode) => Double): Self = this.set("defaultGroupSortComparator", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDefaultGroupSortComparator: Self = this.set("defaultGroupSortComparator", js.undefined)
    @scala.inline
    def setDeltaRowDataMode(value: Boolean): Self = this.set("deltaRowDataMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeltaRowDataMode: Self = this.set("deltaRowDataMode", js.undefined)
    @scala.inline
    def setDetailCellRendererFunction1(value: /* params */ js.Any => HTMLElement | String): Self = this.set("detailCellRenderer", js.Any.fromFunction1(value))
    @scala.inline
    def setDetailCellRenderer(value: InstantiableICellRendererComp | ICellRendererFunc | String): Self = this.set("detailCellRenderer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetailCellRenderer: Self = this.set("detailCellRenderer", js.undefined)
    @scala.inline
    def setDetailCellRendererFramework(value: js.Any): Self = this.set("detailCellRendererFramework", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetailCellRendererFramework: Self = this.set("detailCellRendererFramework", js.undefined)
    @scala.inline
    def setDetailCellRendererParams(value: js.Any): Self = this.set("detailCellRendererParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetailCellRendererParams: Self = this.set("detailCellRendererParams", js.undefined)
    @scala.inline
    def setDetailRowHeight(value: Double): Self = this.set("detailRowHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetailRowHeight: Self = this.set("detailRowHeight", js.undefined)
    @scala.inline
    def setDoesDataFlower(value: /* dataItem */ js.Any => Boolean): Self = this.set("doesDataFlower", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDoesDataFlower: Self = this.set("doesDataFlower", js.undefined)
    @scala.inline
    def setDoesExternalFilterPass(value: /* node */ RowNode => Boolean): Self = this.set("doesExternalFilterPass", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDoesExternalFilterPass: Self = this.set("doesExternalFilterPass", js.undefined)
    @scala.inline
    def setDomLayout(value: String): Self = this.set("domLayout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomLayout: Self = this.set("domLayout", js.undefined)
    @scala.inline
    def setEditType(value: String): Self = this.set("editType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditType: Self = this.set("editType", js.undefined)
    @scala.inline
    def setEmbedFullWidthRows(value: Boolean): Self = this.set("embedFullWidthRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmbedFullWidthRows: Self = this.set("embedFullWidthRows", js.undefined)
    @scala.inline
    def setEnableCellChangeFlash(value: Boolean): Self = this.set("enableCellChangeFlash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableCellChangeFlash: Self = this.set("enableCellChangeFlash", js.undefined)
    @scala.inline
    def setEnableCellExpressions(value: Boolean): Self = this.set("enableCellExpressions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableCellExpressions: Self = this.set("enableCellExpressions", js.undefined)
    @scala.inline
    def setEnableColResize(value: Boolean): Self = this.set("enableColResize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableColResize: Self = this.set("enableColResize", js.undefined)
    @scala.inline
    def setEnableFilter(value: Boolean): Self = this.set("enableFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableFilter: Self = this.set("enableFilter", js.undefined)
    @scala.inline
    def setEnableGroupEdit(value: Boolean): Self = this.set("enableGroupEdit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableGroupEdit: Self = this.set("enableGroupEdit", js.undefined)
    @scala.inline
    def setEnableOldSetFilterModel(value: Boolean): Self = this.set("enableOldSetFilterModel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableOldSetFilterModel: Self = this.set("enableOldSetFilterModel", js.undefined)
    @scala.inline
    def setEnableRangeSelection(value: Boolean): Self = this.set("enableRangeSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableRangeSelection: Self = this.set("enableRangeSelection", js.undefined)
    @scala.inline
    def setEnableRtl(value: Boolean): Self = this.set("enableRtl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableRtl: Self = this.set("enableRtl", js.undefined)
    @scala.inline
    def setEnableServerSideFilter(value: Boolean): Self = this.set("enableServerSideFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableServerSideFilter: Self = this.set("enableServerSideFilter", js.undefined)
    @scala.inline
    def setEnableServerSideSorting(value: Boolean): Self = this.set("enableServerSideSorting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableServerSideSorting: Self = this.set("enableServerSideSorting", js.undefined)
    @scala.inline
    def setEnableSorting(value: Boolean): Self = this.set("enableSorting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableSorting: Self = this.set("enableSorting", js.undefined)
    @scala.inline
    def setEnableStatusBar(value: Boolean): Self = this.set("enableStatusBar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableStatusBar: Self = this.set("enableStatusBar", js.undefined)
    @scala.inline
    def setEnsureDomOrder(value: Boolean): Self = this.set("ensureDomOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnsureDomOrder: Self = this.set("ensureDomOrder", js.undefined)
    @scala.inline
    def setEnterMovesDown(value: Boolean): Self = this.set("enterMovesDown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnterMovesDown: Self = this.set("enterMovesDown", js.undefined)
    @scala.inline
    def setEnterMovesDownAfterEdit(value: Boolean): Self = this.set("enterMovesDownAfterEdit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnterMovesDownAfterEdit: Self = this.set("enterMovesDownAfterEdit", js.undefined)
    @scala.inline
    def setExcelStylesVarargs(value: js.Any*): Self = this.set("excelStyles", js.Array(value :_*))
    @scala.inline
    def setExcelStyles(value: js.Array[_]): Self = this.set("excelStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcelStyles: Self = this.set("excelStyles", js.undefined)
    @scala.inline
    def setFloatingFilter(value: Boolean): Self = this.set("floatingFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloatingFilter: Self = this.set("floatingFilter", js.undefined)
    @scala.inline
    def setFloatingFiltersHeight(value: Double): Self = this.set("floatingFiltersHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloatingFiltersHeight: Self = this.set("floatingFiltersHeight", js.undefined)
    @scala.inline
    def setForPrint(value: Boolean): Self = this.set("forPrint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForPrint: Self = this.set("forPrint", js.undefined)
    @scala.inline
    def setFrameworkComponents(value: StringDictionary[InstantiableAny]): Self = this.set("frameworkComponents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrameworkComponents: Self = this.set("frameworkComponents", js.undefined)
    @scala.inline
    def setFullWidthCellRendererFunction1(value: /* params */ js.Any => HTMLElement | String): Self = this.set("fullWidthCellRenderer", js.Any.fromFunction1(value))
    @scala.inline
    def setFullWidthCellRenderer(value: InstantiableICellRendererComp | ICellRendererFunc | String): Self = this.set("fullWidthCellRenderer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullWidthCellRenderer: Self = this.set("fullWidthCellRenderer", js.undefined)
    @scala.inline
    def setFullWidthCellRendererFramework(value: js.Any): Self = this.set("fullWidthCellRendererFramework", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullWidthCellRendererFramework: Self = this.set("fullWidthCellRendererFramework", js.undefined)
    @scala.inline
    def setFullWidthCellRendererParams(value: js.Any): Self = this.set("fullWidthCellRendererParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullWidthCellRendererParams: Self = this.set("fullWidthCellRendererParams", js.undefined)
    @scala.inline
    def setFunctionsPassive(value: Boolean): Self = this.set("functionsPassive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFunctionsPassive: Self = this.set("functionsPassive", js.undefined)
    @scala.inline
    def setFunctionsReadOnly(value: Boolean): Self = this.set("functionsReadOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFunctionsReadOnly: Self = this.set("functionsReadOnly", js.undefined)
    @scala.inline
    def setGetBusinessKeyForNode(value: /* node */ RowNode => String): Self = this.set("getBusinessKeyForNode", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetBusinessKeyForNode: Self = this.set("getBusinessKeyForNode", js.undefined)
    @scala.inline
    def setGetChildCount(value: /* dataItem */ js.Any => Double): Self = this.set("getChildCount", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetChildCount: Self = this.set("getChildCount", js.undefined)
    @scala.inline
    def setGetContextMenuItems(value: /* params */ GetContextMenuItemsParams => js.Array[String | MenuItemDef]): Self = this.set("getContextMenuItems", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetContextMenuItems: Self = this.set("getContextMenuItems", js.undefined)
    @scala.inline
    def setGetDataPath(value: /* data */ js.Any => js.Array[String]): Self = this.set("getDataPath", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetDataPath: Self = this.set("getDataPath", js.undefined)
    @scala.inline
    def setGetDocument(value: () => Document): Self = this.set("getDocument", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetDocument: Self = this.set("getDocument", js.undefined)
    @scala.inline
    def setGetMainMenuItems(value: /* params */ GetMainMenuItemsParams => js.Array[String | MenuItemDef]): Self = this.set("getMainMenuItems", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetMainMenuItems: Self = this.set("getMainMenuItems", js.undefined)
    @scala.inline
    def setGetNodeChildDetails(value: /* dataItem */ js.Any => NodeChildDetails): Self = this.set("getNodeChildDetails", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetNodeChildDetails: Self = this.set("getNodeChildDetails", js.undefined)
    @scala.inline
    def setGetRowClass(value: /* params */ js.Any => String | js.Array[String]): Self = this.set("getRowClass", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetRowClass: Self = this.set("getRowClass", js.undefined)
    @scala.inline
    def setGetRowHeight(value: js.Function): Self = this.set("getRowHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGetRowHeight: Self = this.set("getRowHeight", js.undefined)
    @scala.inline
    def setGetRowNodeId(value: /* data */ js.Any => String): Self = this.set("getRowNodeId", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetRowNodeId: Self = this.set("getRowNodeId", js.undefined)
    @scala.inline
    def setGetRowStyle(value: js.Function): Self = this.set("getRowStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGetRowStyle: Self = this.set("getRowStyle", js.undefined)
    @scala.inline
    def setGridAutoHeight(value: Boolean): Self = this.set("gridAutoHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridAutoHeight: Self = this.set("gridAutoHeight", js.undefined)
    @scala.inline
    def setGroupColumnDef(value: ColDef): Self = this.set("groupColumnDef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupColumnDef: Self = this.set("groupColumnDef", js.undefined)
    @scala.inline
    def setGroupDefaultExpanded(value: Double): Self = this.set("groupDefaultExpanded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupDefaultExpanded: Self = this.set("groupDefaultExpanded", js.undefined)
    @scala.inline
    def setGroupHeaderHeight(value: Double): Self = this.set("groupHeaderHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupHeaderHeight: Self = this.set("groupHeaderHeight", js.undefined)
    @scala.inline
    def setGroupHideOpenParents(value: Boolean): Self = this.set("groupHideOpenParents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupHideOpenParents: Self = this.set("groupHideOpenParents", js.undefined)
    @scala.inline
    def setGroupIncludeFooter(value: Boolean): Self = this.set("groupIncludeFooter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupIncludeFooter: Self = this.set("groupIncludeFooter", js.undefined)
    @scala.inline
    def setGroupIncludeTotalFooter(value: Boolean): Self = this.set("groupIncludeTotalFooter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupIncludeTotalFooter: Self = this.set("groupIncludeTotalFooter", js.undefined)
    @scala.inline
    def setGroupMultiAutoColumn(value: Boolean): Self = this.set("groupMultiAutoColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupMultiAutoColumn: Self = this.set("groupMultiAutoColumn", js.undefined)
    @scala.inline
    def setGroupRemoveLowestSingleChildren(value: Boolean): Self = this.set("groupRemoveLowestSingleChildren", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupRemoveLowestSingleChildren: Self = this.set("groupRemoveLowestSingleChildren", js.undefined)
    @scala.inline
    def setGroupRemoveSingleChildren(value: Boolean): Self = this.set("groupRemoveSingleChildren", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupRemoveSingleChildren: Self = this.set("groupRemoveSingleChildren", js.undefined)
    @scala.inline
    def setGroupRowAggNodes(value: /* nodes */ js.Array[RowNode] => _): Self = this.set("groupRowAggNodes", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGroupRowAggNodes: Self = this.set("groupRowAggNodes", js.undefined)
    @scala.inline
    def setGroupRowInnerRendererFunction1(value: /* params */ js.Any => HTMLElement | String): Self = this.set("groupRowInnerRenderer", js.Any.fromFunction1(value))
    @scala.inline
    def setGroupRowInnerRenderer(value: InstantiableICellRendererComp | ICellRendererFunc | String): Self = this.set("groupRowInnerRenderer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupRowInnerRenderer: Self = this.set("groupRowInnerRenderer", js.undefined)
    @scala.inline
    def setGroupRowInnerRendererFramework(value: js.Any): Self = this.set("groupRowInnerRendererFramework", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupRowInnerRendererFramework: Self = this.set("groupRowInnerRendererFramework", js.undefined)
    @scala.inline
    def setGroupRowRendererFunction1(value: /* params */ js.Any => HTMLElement | String): Self = this.set("groupRowRenderer", js.Any.fromFunction1(value))
    @scala.inline
    def setGroupRowRenderer(value: InstantiableICellRendererComp | ICellRendererFunc | String): Self = this.set("groupRowRenderer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupRowRenderer: Self = this.set("groupRowRenderer", js.undefined)
    @scala.inline
    def setGroupRowRendererFramework(value: js.Any): Self = this.set("groupRowRendererFramework", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupRowRendererFramework: Self = this.set("groupRowRendererFramework", js.undefined)
    @scala.inline
    def setGroupRowRendererParams(value: js.Any): Self = this.set("groupRowRendererParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupRowRendererParams: Self = this.set("groupRowRendererParams", js.undefined)
    @scala.inline
    def setGroupSelectsChildren(value: Boolean): Self = this.set("groupSelectsChildren", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupSelectsChildren: Self = this.set("groupSelectsChildren", js.undefined)
    @scala.inline
    def setGroupSelectsFiltered(value: Boolean): Self = this.set("groupSelectsFiltered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupSelectsFiltered: Self = this.set("groupSelectsFiltered", js.undefined)
    @scala.inline
    def setGroupSuppressAutoColumn(value: Boolean): Self = this.set("groupSuppressAutoColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupSuppressAutoColumn: Self = this.set("groupSuppressAutoColumn", js.undefined)
    @scala.inline
    def setGroupSuppressBlankHeader(value: Boolean): Self = this.set("groupSuppressBlankHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupSuppressBlankHeader: Self = this.set("groupSuppressBlankHeader", js.undefined)
    @scala.inline
    def setGroupSuppressRow(value: Boolean): Self = this.set("groupSuppressRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupSuppressRow: Self = this.set("groupSuppressRow", js.undefined)
    @scala.inline
    def setGroupUseEntireRow(value: Boolean): Self = this.set("groupUseEntireRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupUseEntireRow: Self = this.set("groupUseEntireRow", js.undefined)
    @scala.inline
    def setHeaderHeight(value: Double): Self = this.set("headerHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderHeight: Self = this.set("headerHeight", js.undefined)
    @scala.inline
    def setIcons(value: js.Any): Self = this.set("icons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcons: Self = this.set("icons", js.undefined)
    @scala.inline
    def setInfiniteInitialRowCount(value: Double): Self = this.set("infiniteInitialRowCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfiniteInitialRowCount: Self = this.set("infiniteInitialRowCount", js.undefined)
    @scala.inline
    def setIsExternalFilterPresent(value: () => Boolean): Self = this.set("isExternalFilterPresent", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsExternalFilterPresent: Self = this.set("isExternalFilterPresent", js.undefined)
    @scala.inline
    def setIsFullWidthCell(value: /* rowNode */ RowNode => Boolean): Self = this.set("isFullWidthCell", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIsFullWidthCell: Self = this.set("isFullWidthCell", js.undefined)
    @scala.inline
    def setIsRowMaster(value: /* dataItem */ js.Any => Boolean): Self = this.set("isRowMaster", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIsRowMaster: Self = this.set("isRowMaster", js.undefined)
    @scala.inline
    def setIsRowSelectable(value: /* node */ RowNode => Boolean): Self = this.set("isRowSelectable", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIsRowSelectable: Self = this.set("isRowSelectable", js.undefined)
    @scala.inline
    def setLoadingOverlayComponent(value: InstantiableILoadingOverlayComp | String): Self = this.set("loadingOverlayComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadingOverlayComponent: Self = this.set("loadingOverlayComponent", js.undefined)
    @scala.inline
    def setLoadingOverlayComponentFramework(value: js.Any): Self = this.set("loadingOverlayComponentFramework", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadingOverlayComponentFramework: Self = this.set("loadingOverlayComponentFramework", js.undefined)
    @scala.inline
    def setLocaleText(value: js.Any): Self = this.set("localeText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocaleText: Self = this.set("localeText", js.undefined)
    @scala.inline
    def setLocaleTextFunc(value: js.Function): Self = this.set("localeTextFunc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocaleTextFunc: Self = this.set("localeTextFunc", js.undefined)
    @scala.inline
    def setMasterDetail(value: Boolean): Self = this.set("masterDetail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMasterDetail: Self = this.set("masterDetail", js.undefined)
    @scala.inline
    def setMaxBlocksInCache(value: Double): Self = this.set("maxBlocksInCache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxBlocksInCache: Self = this.set("maxBlocksInCache", js.undefined)
    @scala.inline
    def setMaxColWidth(value: Double): Self = this.set("maxColWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxColWidth: Self = this.set("maxColWidth", js.undefined)
    @scala.inline
    def setMaxConcurrentDatasourceRequests(value: Double): Self = this.set("maxConcurrentDatasourceRequests", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxConcurrentDatasourceRequests: Self = this.set("maxConcurrentDatasourceRequests", js.undefined)
    @scala.inline
    def setMinColWidth(value: Double): Self = this.set("minColWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinColWidth: Self = this.set("minColWidth", js.undefined)
    @scala.inline
    def setMultiSortKey(value: String): Self = this.set("multiSortKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiSortKey: Self = this.set("multiSortKey", js.undefined)
    @scala.inline
    def setNavigateToNextCell(value: /* params */ NavigateToNextCellParams => GridCellDef): Self = this.set("navigateToNextCell", js.Any.fromFunction1(value))
    @scala.inline
    def deleteNavigateToNextCell: Self = this.set("navigateToNextCell", js.undefined)
    @scala.inline
    def setNoRowsOverlayComponent(value: InstantiableINoRowsOverlayComp | String): Self = this.set("noRowsOverlayComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoRowsOverlayComponent: Self = this.set("noRowsOverlayComponent", js.undefined)
    @scala.inline
    def setNoRowsOverlayComponentFramework(value: js.Any): Self = this.set("noRowsOverlayComponentFramework", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoRowsOverlayComponentFramework: Self = this.set("noRowsOverlayComponentFramework", js.undefined)
    @scala.inline
    def setOnBodyScroll(value: /* event */ BodyScrollEvent => Unit): Self = this.set("onBodyScroll", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBodyScroll: Self = this.set("onBodyScroll", js.undefined)
    @scala.inline
    def setOnCellClicked(value: /* event */ CellClickedEvent => Unit): Self = this.set("onCellClicked", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCellClicked: Self = this.set("onCellClicked", js.undefined)
    @scala.inline
    def setOnCellContextMenu(value: /* event */ CellContextMenuEvent => Unit): Self = this.set("onCellContextMenu", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCellContextMenu: Self = this.set("onCellContextMenu", js.undefined)
    @scala.inline
    def setOnCellDoubleClicked(value: /* event */ CellDoubleClickedEvent => Unit): Self = this.set("onCellDoubleClicked", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCellDoubleClicked: Self = this.set("onCellDoubleClicked", js.undefined)
    @scala.inline
    def setOnCellEditingStarted(value: /* event */ CellEditingStartedEvent => Unit): Self = this.set("onCellEditingStarted", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCellEditingStarted: Self = this.set("onCellEditingStarted", js.undefined)
    @scala.inline
    def setOnCellEditingStopped(value: /* event */ CellEditingStoppedEvent => Unit): Self = this.set("onCellEditingStopped", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCellEditingStopped: Self = this.set("onCellEditingStopped", js.undefined)
    @scala.inline
    def setOnCellFocused(value: /* event */ CellFocusedEvent => Unit): Self = this.set("onCellFocused", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCellFocused: Self = this.set("onCellFocused", js.undefined)
    @scala.inline
    def setOnCellMouseDown(value: /* event */ CellMouseDownEvent => Unit): Self = this.set("onCellMouseDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCellMouseDown: Self = this.set("onCellMouseDown", js.undefined)
    @scala.inline
    def setOnCellMouseOut(value: /* event */ CellMouseOutEvent => Unit): Self = this.set("onCellMouseOut", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCellMouseOut: Self = this.set("onCellMouseOut", js.undefined)
    @scala.inline
    def setOnCellMouseOver(value: /* event */ CellMouseOverEvent => Unit): Self = this.set("onCellMouseOver", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCellMouseOver: Self = this.set("onCellMouseOver", js.undefined)
    @scala.inline
    def setOnCellValueChanged(value: /* event */ CellValueChangedEvent => Unit): Self = this.set("onCellValueChanged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCellValueChanged: Self = this.set("onCellValueChanged", js.undefined)
    @scala.inline
    def setOnColumnAggFuncChangeRequest(value: /* event */ ColumnAggFuncChangeRequestEvent => Unit): Self = this.set("onColumnAggFuncChangeRequest", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnColumnAggFuncChangeRequest: Self = this.set("onColumnAggFuncChangeRequest", js.undefined)
    @scala.inline
    def setOnColumnEverythingChanged(value: /* event */ ColumnEverythingChangedEvent => Unit): Self = this.set("onColumnEverythingChanged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnColumnEverythingChanged: Self = this.set("onColumnEverythingChanged", js.undefined)
    @scala.inline
    def setOnColumnGroupOpened(value: /* event */ ColumnGroupOpenedEvent => Unit): Self = this.set("onColumnGroupOpened", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnColumnGroupOpened: Self = this.set("onColumnGroupOpened", js.undefined)
    @scala.inline
    def setOnColumnMoved(value: /* event */ ColumnMovedEvent => Unit): Self = this.set("onColumnMoved", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnColumnMoved: Self = this.set("onColumnMoved", js.undefined)
    @scala.inline
    def setOnColumnPinned(value: /* event */ ColumnPinnedEvent => Unit): Self = this.set("onColumnPinned", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnColumnPinned: Self = this.set("onColumnPinned", js.undefined)
    @scala.inline
    def setOnColumnPivotChangeRequest(value: /* event */ ColumnPivotChangeRequestEvent => Unit): Self = this.set("onColumnPivotChangeRequest", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnColumnPivotChangeRequest: Self = this.set("onColumnPivotChangeRequest", js.undefined)
    @scala.inline
    def setOnColumnPivotChanged(value: /* event */ ColumnPivotChangedEvent => Unit): Self = this.set("onColumnPivotChanged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnColumnPivotChanged: Self = this.set("onColumnPivotChanged", js.undefined)
    @scala.inline
    def setOnColumnPivotModeChanged(value: /* event */ ColumnPivotModeChangedEvent => Unit): Self = this.set("onColumnPivotModeChanged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnColumnPivotModeChanged: Self = this.set("onColumnPivotModeChanged", js.undefined)
    @scala.inline
    def setOnColumnResized(value: /* event */ ColumnResizedEvent => Unit): Self = this.set("onColumnResized", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnColumnResized: Self = this.set("onColumnResized", js.undefined)
    @scala.inline
    def setOnColumnRowGroupChangeRequest(value: /* event */ ColumnRowGroupChangeRequestEvent => Unit): Self = this.set("onColumnRowGroupChangeRequest", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnColumnRowGroupChangeRequest: Self = this.set("onColumnRowGroupChangeRequest", js.undefined)
    @scala.inline
    def setOnColumnRowGroupChanged(value: /* event */ ColumnRowGroupChangedEvent => Unit): Self = this.set("onColumnRowGroupChanged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnColumnRowGroupChanged: Self = this.set("onColumnRowGroupChanged", js.undefined)
    @scala.inline
    def setOnColumnValueChangeRequest(value: /* event */ ColumnValueChangeRequestEvent => Unit): Self = this.set("onColumnValueChangeRequest", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnColumnValueChangeRequest: Self = this.set("onColumnValueChangeRequest", js.undefined)
    @scala.inline
    def setOnColumnValueChanged(value: /* event */ ColumnValueChangedEvent => Unit): Self = this.set("onColumnValueChanged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnColumnValueChanged: Self = this.set("onColumnValueChanged", js.undefined)
    @scala.inline
    def setOnColumnVisible(value: /* event */ ColumnVisibleEvent => Unit): Self = this.set("onColumnVisible", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnColumnVisible: Self = this.set("onColumnVisible", js.undefined)
    @scala.inline
    def setOnDisplayedColumnsChanged(value: /* event */ DisplayedColumnsChangedEvent => Unit): Self = this.set("onDisplayedColumnsChanged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDisplayedColumnsChanged: Self = this.set("onDisplayedColumnsChanged", js.undefined)
    @scala.inline
    def setOnDragStarted(value: /* event */ DragStartedEvent => Unit): Self = this.set("onDragStarted", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragStarted: Self = this.set("onDragStarted", js.undefined)
    @scala.inline
    def setOnDragStopped(value: /* event */ DragStoppedEvent => Unit): Self = this.set("onDragStopped", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragStopped: Self = this.set("onDragStopped", js.undefined)
    @scala.inline
    def setOnFilterChanged(value: /* event */ FilterChangedEvent => Unit): Self = this.set("onFilterChanged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFilterChanged: Self = this.set("onFilterChanged", js.undefined)
    @scala.inline
    def setOnFilterModified(value: /* event */ FilterModifiedEvent => Unit): Self = this.set("onFilterModified", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFilterModified: Self = this.set("onFilterModified", js.undefined)
    @scala.inline
    def setOnGridColumnsChanged(value: /* event */ GridColumnsChangedEvent => Unit): Self = this.set("onGridColumnsChanged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnGridColumnsChanged: Self = this.set("onGridColumnsChanged", js.undefined)
    @scala.inline
    def setOnGridReady(value: /* event */ GridReadyEvent => Unit): Self = this.set("onGridReady", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnGridReady: Self = this.set("onGridReady", js.undefined)
    @scala.inline
    def setOnGridSizeChanged(value: /* event */ js.Any => Unit): Self = this.set("onGridSizeChanged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnGridSizeChanged: Self = this.set("onGridSizeChanged", js.undefined)
    @scala.inline
    def setOnModelUpdated(value: /* event */ ModelUpdatedEvent => Unit): Self = this.set("onModelUpdated", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnModelUpdated: Self = this.set("onModelUpdated", js.undefined)
    @scala.inline
    def setOnNewColumnsLoaded(value: /* event */ NewColumnsLoadedEvent => Unit): Self = this.set("onNewColumnsLoaded", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnNewColumnsLoaded: Self = this.set("onNewColumnsLoaded", js.undefined)
    @scala.inline
    def setOnPaginationChanged(value: /* event */ PaginationChangedEvent => Unit): Self = this.set("onPaginationChanged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPaginationChanged: Self = this.set("onPaginationChanged", js.undefined)
    @scala.inline
    def setOnPasteEnd(value: /* event */ PasteEndEvent => Unit): Self = this.set("onPasteEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPasteEnd: Self = this.set("onPasteEnd", js.undefined)
    @scala.inline
    def setOnPasteStart(value: /* event */ PasteStartEvent => Unit): Self = this.set("onPasteStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPasteStart: Self = this.set("onPasteStart", js.undefined)
    @scala.inline
    def setOnPinnedRowDataChanged(value: /* event */ PinnedRowDataChangedEvent => Unit): Self = this.set("onPinnedRowDataChanged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPinnedRowDataChanged: Self = this.set("onPinnedRowDataChanged", js.undefined)
    @scala.inline
    def setOnRangeSelectionChanged(value: /* event */ RangeSelectionChangedEvent => Unit): Self = this.set("onRangeSelectionChanged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRangeSelectionChanged: Self = this.set("onRangeSelectionChanged", js.undefined)
    @scala.inline
    def setOnRowClicked(value: /* event */ RowClickedEvent => Unit): Self = this.set("onRowClicked", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRowClicked: Self = this.set("onRowClicked", js.undefined)
    @scala.inline
    def setOnRowDataChanged(value: /* event */ RowDataChangedEvent => Unit): Self = this.set("onRowDataChanged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRowDataChanged: Self = this.set("onRowDataChanged", js.undefined)
    @scala.inline
    def setOnRowDataUpdated(value: /* event */ RowDataUpdatedEvent => Unit): Self = this.set("onRowDataUpdated", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRowDataUpdated: Self = this.set("onRowDataUpdated", js.undefined)
    @scala.inline
    def setOnRowDoubleClicked(value: /* event */ RowDoubleClickedEvent => Unit): Self = this.set("onRowDoubleClicked", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRowDoubleClicked: Self = this.set("onRowDoubleClicked", js.undefined)
    @scala.inline
    def setOnRowDragEnd(value: /* event */ RowDragEvent => Unit): Self = this.set("onRowDragEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRowDragEnd: Self = this.set("onRowDragEnd", js.undefined)
    @scala.inline
    def setOnRowDragEnter(value: /* event */ RowDragEvent => Unit): Self = this.set("onRowDragEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRowDragEnter: Self = this.set("onRowDragEnter", js.undefined)
    @scala.inline
    def setOnRowDragLeave(value: /* event */ RowDragEvent => Unit): Self = this.set("onRowDragLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRowDragLeave: Self = this.set("onRowDragLeave", js.undefined)
    @scala.inline
    def setOnRowDragMove(value: /* event */ RowDragEvent => Unit): Self = this.set("onRowDragMove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRowDragMove: Self = this.set("onRowDragMove", js.undefined)
    @scala.inline
    def setOnRowEditingStarted(value: /* event */ RowEditingStartedEvent => Unit): Self = this.set("onRowEditingStarted", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRowEditingStarted: Self = this.set("onRowEditingStarted", js.undefined)
    @scala.inline
    def setOnRowEditingStopped(value: /* event */ RowEditingStoppedEvent => Unit): Self = this.set("onRowEditingStopped", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRowEditingStopped: Self = this.set("onRowEditingStopped", js.undefined)
    @scala.inline
    def setOnRowGroupOpened(value: /* event */ RowGroupOpenedEvent => Unit): Self = this.set("onRowGroupOpened", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRowGroupOpened: Self = this.set("onRowGroupOpened", js.undefined)
    @scala.inline
    def setOnRowSelected(value: /* event */ RowSelectedEvent => Unit): Self = this.set("onRowSelected", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRowSelected: Self = this.set("onRowSelected", js.undefined)
    @scala.inline
    def setOnRowValueChanged(value: /* event */ RowValueChangedEvent => Unit): Self = this.set("onRowValueChanged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRowValueChanged: Self = this.set("onRowValueChanged", js.undefined)
    @scala.inline
    def setOnSelectionChanged(value: /* event */ SelectionChangedEvent => Unit): Self = this.set("onSelectionChanged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSelectionChanged: Self = this.set("onSelectionChanged", js.undefined)
    @scala.inline
    def setOnSortChanged(value: /* event */ SortChangedEvent => Unit): Self = this.set("onSortChanged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSortChanged: Self = this.set("onSortChanged", js.undefined)
    @scala.inline
    def setOnViewportChanged(value: /* event */ ViewportChangedEvent => Unit): Self = this.set("onViewportChanged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnViewportChanged: Self = this.set("onViewportChanged", js.undefined)
    @scala.inline
    def setOnVirtualColumnsChanged(value: /* event */ VirtualColumnsChangedEvent => Unit): Self = this.set("onVirtualColumnsChanged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnVirtualColumnsChanged: Self = this.set("onVirtualColumnsChanged", js.undefined)
    @scala.inline
    def setOnVirtualRowRemoved(value: /* event */ VirtualRowRemovedEvent => Unit): Self = this.set("onVirtualRowRemoved", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnVirtualRowRemoved: Self = this.set("onVirtualRowRemoved", js.undefined)
    @scala.inline
    def setOverlayLoadingTemplate(value: String): Self = this.set("overlayLoadingTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlayLoadingTemplate: Self = this.set("overlayLoadingTemplate", js.undefined)
    @scala.inline
    def setOverlayNoRowsTemplate(value: String): Self = this.set("overlayNoRowsTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlayNoRowsTemplate: Self = this.set("overlayNoRowsTemplate", js.undefined)
    @scala.inline
    def setPagination(value: Boolean): Self = this.set("pagination", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePagination: Self = this.set("pagination", js.undefined)
    @scala.inline
    def setPaginationAutoPageSize(value: Boolean): Self = this.set("paginationAutoPageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaginationAutoPageSize: Self = this.set("paginationAutoPageSize", js.undefined)
    @scala.inline
    def setPaginationNumberFormatter(value: /* params */ PaginationNumberFormatterParams => String): Self = this.set("paginationNumberFormatter", js.Any.fromFunction1(value))
    @scala.inline
    def deletePaginationNumberFormatter: Self = this.set("paginationNumberFormatter", js.undefined)
    @scala.inline
    def setPaginationPageSize(value: Double): Self = this.set("paginationPageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaginationPageSize: Self = this.set("paginationPageSize", js.undefined)
    @scala.inline
    def setPaginationStartPage(value: Double): Self = this.set("paginationStartPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaginationStartPage: Self = this.set("paginationStartPage", js.undefined)
    @scala.inline
    def setPinnedBottomRowDataVarargs(value: js.Any*): Self = this.set("pinnedBottomRowData", js.Array(value :_*))
    @scala.inline
    def setPinnedBottomRowData(value: js.Array[_]): Self = this.set("pinnedBottomRowData", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePinnedBottomRowData: Self = this.set("pinnedBottomRowData", js.undefined)
    @scala.inline
    def setPinnedTopRowDataVarargs(value: js.Any*): Self = this.set("pinnedTopRowData", js.Array(value :_*))
    @scala.inline
    def setPinnedTopRowData(value: js.Array[_]): Self = this.set("pinnedTopRowData", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePinnedTopRowData: Self = this.set("pinnedTopRowData", js.undefined)
    @scala.inline
    def setPivotColumnGroupTotals(value: String): Self = this.set("pivotColumnGroupTotals", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePivotColumnGroupTotals: Self = this.set("pivotColumnGroupTotals", js.undefined)
    @scala.inline
    def setPivotGroupHeaderHeight(value: Double): Self = this.set("pivotGroupHeaderHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePivotGroupHeaderHeight: Self = this.set("pivotGroupHeaderHeight", js.undefined)
    @scala.inline
    def setPivotHeaderHeight(value: Double): Self = this.set("pivotHeaderHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePivotHeaderHeight: Self = this.set("pivotHeaderHeight", js.undefined)
    @scala.inline
    def setPivotMode(value: Boolean): Self = this.set("pivotMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePivotMode: Self = this.set("pivotMode", js.undefined)
    @scala.inline
    def setPivotPanelShow(value: String): Self = this.set("pivotPanelShow", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePivotPanelShow: Self = this.set("pivotPanelShow", js.undefined)
    @scala.inline
    def setPivotRowTotals(value: String): Self = this.set("pivotRowTotals", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePivotRowTotals: Self = this.set("pivotRowTotals", js.undefined)
    @scala.inline
    def setPivotTotals(value: Boolean): Self = this.set("pivotTotals", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePivotTotals: Self = this.set("pivotTotals", js.undefined)
    @scala.inline
    def setPopupParent(value: HTMLElement): Self = this.set("popupParent", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopupParent: Self = this.set("popupParent", js.undefined)
    @scala.inline
    def setPostProcessPopup(value: /* params */ PostProcessPopupParams => Unit): Self = this.set("postProcessPopup", js.Any.fromFunction1(value))
    @scala.inline
    def deletePostProcessPopup: Self = this.set("postProcessPopup", js.undefined)
    @scala.inline
    def setPostSort(value: /* nodes */ js.Array[RowNode] => Unit): Self = this.set("postSort", js.Any.fromFunction1(value))
    @scala.inline
    def deletePostSort: Self = this.set("postSort", js.undefined)
    @scala.inline
    def setProcessCellForClipboard(value: /* params */ ProcessCellForExportParams => _): Self = this.set("processCellForClipboard", js.Any.fromFunction1(value))
    @scala.inline
    def deleteProcessCellForClipboard: Self = this.set("processCellForClipboard", js.undefined)
    @scala.inline
    def setProcessCellFromClipboard(value: /* params */ ProcessCellForExportParams => _): Self = this.set("processCellFromClipboard", js.Any.fromFunction1(value))
    @scala.inline
    def deleteProcessCellFromClipboard: Self = this.set("processCellFromClipboard", js.undefined)
    @scala.inline
    def setProcessDataFromClipboard(value: /* params */ ProcessDataFromClipboardParams => js.Array[js.Array[String]]): Self = this.set("processDataFromClipboard", js.Any.fromFunction1(value))
    @scala.inline
    def deleteProcessDataFromClipboard: Self = this.set("processDataFromClipboard", js.undefined)
    @scala.inline
    def setProcessHeaderForClipboard(value: /* params */ ProcessHeaderForExportParams => _): Self = this.set("processHeaderForClipboard", js.Any.fromFunction1(value))
    @scala.inline
    def deleteProcessHeaderForClipboard: Self = this.set("processHeaderForClipboard", js.undefined)
    @scala.inline
    def setProcessRowPostCreate(value: /* params */ ProcessRowParams => Unit): Self = this.set("processRowPostCreate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteProcessRowPostCreate: Self = this.set("processRowPostCreate", js.undefined)
    @scala.inline
    def setProcessSecondaryColDef(value: /* colDef */ ColDef => Unit): Self = this.set("processSecondaryColDef", js.Any.fromFunction1(value))
    @scala.inline
    def deleteProcessSecondaryColDef: Self = this.set("processSecondaryColDef", js.undefined)
    @scala.inline
    def setProcessSecondaryColGroupDef(value: /* colGroupDef */ ColGroupDef => Unit): Self = this.set("processSecondaryColGroupDef", js.Any.fromFunction1(value))
    @scala.inline
    def deleteProcessSecondaryColGroupDef: Self = this.set("processSecondaryColGroupDef", js.undefined)
    @scala.inline
    def setPurgeClosedRowNodes(value: Boolean): Self = this.set("purgeClosedRowNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePurgeClosedRowNodes: Self = this.set("purgeClosedRowNodes", js.undefined)
    @scala.inline
    def setQuickFilterText(value: String): Self = this.set("quickFilterText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuickFilterText: Self = this.set("quickFilterText", js.undefined)
    @scala.inline
    def setRememberGroupStateWhenNewData(value: Boolean): Self = this.set("rememberGroupStateWhenNewData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRememberGroupStateWhenNewData: Self = this.set("rememberGroupStateWhenNewData", js.undefined)
    @scala.inline
    def setRowBuffer(value: Double): Self = this.set("rowBuffer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowBuffer: Self = this.set("rowBuffer", js.undefined)
    @scala.inline
    def setRowClassVarargs(value: String*): Self = this.set("rowClass", js.Array(value :_*))
    @scala.inline
    def setRowClass(value: String | js.Array[String]): Self = this.set("rowClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowClass: Self = this.set("rowClass", js.undefined)
    @scala.inline
    def setRowClassRules(value: StringDictionary[js.Function | String]): Self = this.set("rowClassRules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowClassRules: Self = this.set("rowClassRules", js.undefined)
    @scala.inline
    def setRowDataVarargs(value: js.Any*): Self = this.set("rowData", js.Array(value :_*))
    @scala.inline
    def setRowData(value: js.Array[_]): Self = this.set("rowData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowData: Self = this.set("rowData", js.undefined)
    @scala.inline
    def setRowDeselection(value: Boolean): Self = this.set("rowDeselection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowDeselection: Self = this.set("rowDeselection", js.undefined)
    @scala.inline
    def setRowDragManaged(value: Boolean): Self = this.set("rowDragManaged", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowDragManaged: Self = this.set("rowDragManaged", js.undefined)
    @scala.inline
    def setRowGroupPanelShow(value: String): Self = this.set("rowGroupPanelShow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowGroupPanelShow: Self = this.set("rowGroupPanelShow", js.undefined)
    @scala.inline
    def setRowHeight(value: Double): Self = this.set("rowHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowHeight: Self = this.set("rowHeight", js.undefined)
    @scala.inline
    def setRowModelType(value: String): Self = this.set("rowModelType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowModelType: Self = this.set("rowModelType", js.undefined)
    @scala.inline
    def setRowMultiSelectWithClick(value: Boolean): Self = this.set("rowMultiSelectWithClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowMultiSelectWithClick: Self = this.set("rowMultiSelectWithClick", js.undefined)
    @scala.inline
    def setRowSelection(value: String): Self = this.set("rowSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowSelection: Self = this.set("rowSelection", js.undefined)
    @scala.inline
    def setRowStyle(value: js.Any): Self = this.set("rowStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowStyle: Self = this.set("rowStyle", js.undefined)
    @scala.inline
    def setScrollbarWidth(value: Double): Self = this.set("scrollbarWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollbarWidth: Self = this.set("scrollbarWidth", js.undefined)
    @scala.inline
    def setSendToClipboard(value: /* params */ js.Any => Unit): Self = this.set("sendToClipboard", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSendToClipboard: Self = this.set("sendToClipboard", js.undefined)
    @scala.inline
    def setServerSideDatasource(value: IServerSideDatasource): Self = this.set("serverSideDatasource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerSideDatasource: Self = this.set("serverSideDatasource", js.undefined)
    @scala.inline
    def setServerSideSortingAlwaysResets(value: Boolean): Self = this.set("serverSideSortingAlwaysResets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerSideSortingAlwaysResets: Self = this.set("serverSideSortingAlwaysResets", js.undefined)
    @scala.inline
    def setShowToolPanel(value: Boolean): Self = this.set("showToolPanel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowToolPanel: Self = this.set("showToolPanel", js.undefined)
    @scala.inline
    def setSingleClickEdit(value: Boolean): Self = this.set("singleClickEdit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSingleClickEdit: Self = this.set("singleClickEdit", js.undefined)
    @scala.inline
    def setSlaveGridsVarargs(value: GridOptions*): Self = this.set("slaveGrids", js.Array(value :_*))
    @scala.inline
    def setSlaveGrids(value: js.Array[GridOptions]): Self = this.set("slaveGrids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlaveGrids: Self = this.set("slaveGrids", js.undefined)
    @scala.inline
    def setSortingOrderVarargs(value: String*): Self = this.set("sortingOrder", js.Array(value :_*))
    @scala.inline
    def setSortingOrder(value: js.Array[String]): Self = this.set("sortingOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortingOrder: Self = this.set("sortingOrder", js.undefined)
    @scala.inline
    def setStopEditingWhenGridLosesFocus(value: Boolean): Self = this.set("stopEditingWhenGridLosesFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStopEditingWhenGridLosesFocus: Self = this.set("stopEditingWhenGridLosesFocus", js.undefined)
    @scala.inline
    def setSuppressAggAtRootLevel(value: Boolean): Self = this.set("suppressAggAtRootLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressAggAtRootLevel: Self = this.set("suppressAggAtRootLevel", js.undefined)
    @scala.inline
    def setSuppressAggFuncInHeader(value: Boolean): Self = this.set("suppressAggFuncInHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressAggFuncInHeader: Self = this.set("suppressAggFuncInHeader", js.undefined)
    @scala.inline
    def setSuppressAnimationFrame(value: Boolean): Self = this.set("suppressAnimationFrame", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressAnimationFrame: Self = this.set("suppressAnimationFrame", js.undefined)
    @scala.inline
    def setSuppressAsyncEvents(value: Boolean): Self = this.set("suppressAsyncEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressAsyncEvents: Self = this.set("suppressAsyncEvents", js.undefined)
    @scala.inline
    def setSuppressAutoSize(value: Boolean): Self = this.set("suppressAutoSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressAutoSize: Self = this.set("suppressAutoSize", js.undefined)
    @scala.inline
    def setSuppressCellSelection(value: Boolean): Self = this.set("suppressCellSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressCellSelection: Self = this.set("suppressCellSelection", js.undefined)
    @scala.inline
    def setSuppressChangeDetection(value: Boolean): Self = this.set("suppressChangeDetection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressChangeDetection: Self = this.set("suppressChangeDetection", js.undefined)
    @scala.inline
    def setSuppressClickEdit(value: Boolean): Self = this.set("suppressClickEdit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressClickEdit: Self = this.set("suppressClickEdit", js.undefined)
    @scala.inline
    def setSuppressClipboardPaste(value: Boolean): Self = this.set("suppressClipboardPaste", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressClipboardPaste: Self = this.set("suppressClipboardPaste", js.undefined)
    @scala.inline
    def setSuppressColumnMoveAnimation(value: Boolean): Self = this.set("suppressColumnMoveAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressColumnMoveAnimation: Self = this.set("suppressColumnMoveAnimation", js.undefined)
    @scala.inline
    def setSuppressColumnVirtualisation(value: Boolean): Self = this.set("suppressColumnVirtualisation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressColumnVirtualisation: Self = this.set("suppressColumnVirtualisation", js.undefined)
    @scala.inline
    def setSuppressContextMenu(value: Boolean): Self = this.set("suppressContextMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressContextMenu: Self = this.set("suppressContextMenu", js.undefined)
    @scala.inline
    def setSuppressCopyRowsToClipboard(value: Boolean): Self = this.set("suppressCopyRowsToClipboard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressCopyRowsToClipboard: Self = this.set("suppressCopyRowsToClipboard", js.undefined)
    @scala.inline
    def setSuppressCsvExport(value: Boolean): Self = this.set("suppressCsvExport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressCsvExport: Self = this.set("suppressCsvExport", js.undefined)
    @scala.inline
    def setSuppressDragLeaveHidesColumns(value: Boolean): Self = this.set("suppressDragLeaveHidesColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressDragLeaveHidesColumns: Self = this.set("suppressDragLeaveHidesColumns", js.undefined)
    @scala.inline
    def setSuppressEnterpriseResetOnNewColumns(value: Boolean): Self = this.set("suppressEnterpriseResetOnNewColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressEnterpriseResetOnNewColumns: Self = this.set("suppressEnterpriseResetOnNewColumns", js.undefined)
    @scala.inline
    def setSuppressExcelExport(value: Boolean): Self = this.set("suppressExcelExport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressExcelExport: Self = this.set("suppressExcelExport", js.undefined)
    @scala.inline
    def setSuppressFieldDotNotation(value: Boolean): Self = this.set("suppressFieldDotNotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressFieldDotNotation: Self = this.set("suppressFieldDotNotation", js.undefined)
    @scala.inline
    def setSuppressFocusAfterRefresh(value: Boolean): Self = this.set("suppressFocusAfterRefresh", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressFocusAfterRefresh: Self = this.set("suppressFocusAfterRefresh", js.undefined)
    @scala.inline
    def setSuppressHorizontalScroll(value: Boolean): Self = this.set("suppressHorizontalScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressHorizontalScroll: Self = this.set("suppressHorizontalScroll", js.undefined)
    @scala.inline
    def setSuppressLoadingOverlay(value: Boolean): Self = this.set("suppressLoadingOverlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressLoadingOverlay: Self = this.set("suppressLoadingOverlay", js.undefined)
    @scala.inline
    def setSuppressMakeColumnVisibleAfterUnGroup(value: Boolean): Self = this.set("suppressMakeColumnVisibleAfterUnGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressMakeColumnVisibleAfterUnGroup: Self = this.set("suppressMakeColumnVisibleAfterUnGroup", js.undefined)
    @scala.inline
    def setSuppressMenuHide(value: Boolean): Self = this.set("suppressMenuHide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressMenuHide: Self = this.set("suppressMenuHide", js.undefined)
    @scala.inline
    def setSuppressMiddleClickScrolls(value: Boolean): Self = this.set("suppressMiddleClickScrolls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressMiddleClickScrolls: Self = this.set("suppressMiddleClickScrolls", js.undefined)
    @scala.inline
    def setSuppressMovableColumns(value: Boolean): Self = this.set("suppressMovableColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressMovableColumns: Self = this.set("suppressMovableColumns", js.undefined)
    @scala.inline
    def setSuppressMultiRangeSelection(value: Boolean): Self = this.set("suppressMultiRangeSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressMultiRangeSelection: Self = this.set("suppressMultiRangeSelection", js.undefined)
    @scala.inline
    def setSuppressMultiSort(value: Boolean): Self = this.set("suppressMultiSort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressMultiSort: Self = this.set("suppressMultiSort", js.undefined)
    @scala.inline
    def setSuppressNoRowsOverlay(value: Boolean): Self = this.set("suppressNoRowsOverlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressNoRowsOverlay: Self = this.set("suppressNoRowsOverlay", js.undefined)
    @scala.inline
    def setSuppressPaginationPanel(value: Boolean): Self = this.set("suppressPaginationPanel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressPaginationPanel: Self = this.set("suppressPaginationPanel", js.undefined)
    @scala.inline
    def setSuppressParentsInRowNodes(value: Boolean): Self = this.set("suppressParentsInRowNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressParentsInRowNodes: Self = this.set("suppressParentsInRowNodes", js.undefined)
    @scala.inline
    def setSuppressPreventDefaultOnMouseWheel(value: Boolean): Self = this.set("suppressPreventDefaultOnMouseWheel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressPreventDefaultOnMouseWheel: Self = this.set("suppressPreventDefaultOnMouseWheel", js.undefined)
    @scala.inline
    def setSuppressPropertyNamesCheck(value: Boolean): Self = this.set("suppressPropertyNamesCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressPropertyNamesCheck: Self = this.set("suppressPropertyNamesCheck", js.undefined)
    @scala.inline
    def setSuppressRowClickSelection(value: Boolean): Self = this.set("suppressRowClickSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressRowClickSelection: Self = this.set("suppressRowClickSelection", js.undefined)
    @scala.inline
    def setSuppressRowDrag(value: Boolean): Self = this.set("suppressRowDrag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressRowDrag: Self = this.set("suppressRowDrag", js.undefined)
    @scala.inline
    def setSuppressRowHoverHighlight(value: Boolean): Self = this.set("suppressRowHoverHighlight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressRowHoverHighlight: Self = this.set("suppressRowHoverHighlight", js.undefined)
    @scala.inline
    def setSuppressRowTransform(value: Boolean): Self = this.set("suppressRowTransform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressRowTransform: Self = this.set("suppressRowTransform", js.undefined)
    @scala.inline
    def setSuppressScrollOnNewData(value: Boolean): Self = this.set("suppressScrollOnNewData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressScrollOnNewData: Self = this.set("suppressScrollOnNewData", js.undefined)
    @scala.inline
    def setSuppressTabbing(value: Boolean): Self = this.set("suppressTabbing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressTabbing: Self = this.set("suppressTabbing", js.undefined)
    @scala.inline
    def setSuppressTouch(value: Boolean): Self = this.set("suppressTouch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressTouch: Self = this.set("suppressTouch", js.undefined)
    @scala.inline
    def setTabToNextCell(value: /* params */ TabToNextCellParams => GridCellDef): Self = this.set("tabToNextCell", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTabToNextCell: Self = this.set("tabToNextCell", js.undefined)
    @scala.inline
    def setToolPanelSuppressColumnExpandAll(value: Boolean): Self = this.set("toolPanelSuppressColumnExpandAll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolPanelSuppressColumnExpandAll: Self = this.set("toolPanelSuppressColumnExpandAll", js.undefined)
    @scala.inline
    def setToolPanelSuppressColumnFilter(value: Boolean): Self = this.set("toolPanelSuppressColumnFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolPanelSuppressColumnFilter: Self = this.set("toolPanelSuppressColumnFilter", js.undefined)
    @scala.inline
    def setToolPanelSuppressColumnSelectAll(value: Boolean): Self = this.set("toolPanelSuppressColumnSelectAll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolPanelSuppressColumnSelectAll: Self = this.set("toolPanelSuppressColumnSelectAll", js.undefined)
    @scala.inline
    def setToolPanelSuppressPivotMode(value: Boolean): Self = this.set("toolPanelSuppressPivotMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolPanelSuppressPivotMode: Self = this.set("toolPanelSuppressPivotMode", js.undefined)
    @scala.inline
    def setToolPanelSuppressPivots(value: Boolean): Self = this.set("toolPanelSuppressPivots", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolPanelSuppressPivots: Self = this.set("toolPanelSuppressPivots", js.undefined)
    @scala.inline
    def setToolPanelSuppressRowGroups(value: Boolean): Self = this.set("toolPanelSuppressRowGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolPanelSuppressRowGroups: Self = this.set("toolPanelSuppressRowGroups", js.undefined)
    @scala.inline
    def setToolPanelSuppressSideButtons(value: Boolean): Self = this.set("toolPanelSuppressSideButtons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolPanelSuppressSideButtons: Self = this.set("toolPanelSuppressSideButtons", js.undefined)
    @scala.inline
    def setToolPanelSuppressValues(value: Boolean): Self = this.set("toolPanelSuppressValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolPanelSuppressValues: Self = this.set("toolPanelSuppressValues", js.undefined)
    @scala.inline
    def setTreeData(value: Boolean): Self = this.set("treeData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTreeData: Self = this.set("treeData", js.undefined)
    @scala.inline
    def setUnSortIcon(value: Boolean): Self = this.set("unSortIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnSortIcon: Self = this.set("unSortIcon", js.undefined)
    @scala.inline
    def setValueCache(value: Boolean): Self = this.set("valueCache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueCache: Self = this.set("valueCache", js.undefined)
    @scala.inline
    def setValueCacheNeverExpires(value: Boolean): Self = this.set("valueCacheNeverExpires", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueCacheNeverExpires: Self = this.set("valueCacheNeverExpires", js.undefined)
    @scala.inline
    def setViewportDatasource(value: IViewportDatasource): Self = this.set("viewportDatasource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewportDatasource: Self = this.set("viewportDatasource", js.undefined)
    @scala.inline
    def setViewportRowModelBufferSize(value: Double): Self = this.set("viewportRowModelBufferSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewportRowModelBufferSize: Self = this.set("viewportRowModelBufferSize", js.undefined)
    @scala.inline
    def setViewportRowModelPageSize(value: Double): Self = this.set("viewportRowModelPageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewportRowModelPageSize: Self = this.set("viewportRowModelPageSize", js.undefined)
  }
  
}

