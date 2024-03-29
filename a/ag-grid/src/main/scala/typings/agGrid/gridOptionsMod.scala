package typings.agGrid

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
import typings.agGrid.columnMod.Column
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
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.Touch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gridOptionsMod {
  
  type GetContextMenuItems = js.Function1[/* params */ GetContextMenuItemsParams, js.Array[String | MenuItemDef]]
  
  trait GetContextMenuItemsParams extends StObject {
    
    var api: GridApi
    
    var column: Column
    
    var columnApi: ColumnApi
    
    var context: js.Any
    
    var defaultItems: js.Array[String]
    
    var node: RowNode
    
    var value: js.Any
  }
  object GetContextMenuItemsParams {
    
    inline def apply(
      api: GridApi,
      column: Column,
      columnApi: ColumnApi,
      context: js.Any,
      defaultItems: js.Array[String],
      node: RowNode,
      value: js.Any
    ): GetContextMenuItemsParams = {
      val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], defaultItems = defaultItems.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetContextMenuItemsParams]
    }
    
    extension [Self <: GetContextMenuItemsParams](x: Self) {
      
      inline def setApi(value: GridApi): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      inline def setColumn(value: Column): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnApi(value: ColumnApi): Self = StObject.set(x, "columnApi", value.asInstanceOf[js.Any])
      
      inline def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setDefaultItems(value: js.Array[String]): Self = StObject.set(x, "defaultItems", value.asInstanceOf[js.Any])
      
      inline def setDefaultItemsVarargs(value: String*): Self = StObject.set(x, "defaultItems", js.Array(value :_*))
      
      inline def setNode(value: RowNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type GetDataPath = js.Function1[/* data */ js.Any, js.Array[String]]
  
  type GetMainMenuItems = js.Function1[/* params */ GetMainMenuItemsParams, js.Array[String | MenuItemDef]]
  
  trait GetMainMenuItemsParams extends StObject {
    
    var api: GridApi
    
    var column: Column
    
    var columnApi: ColumnApi
    
    var context: js.Any
    
    var defaultItems: js.Array[String]
  }
  object GetMainMenuItemsParams {
    
    inline def apply(
      api: GridApi,
      column: Column,
      columnApi: ColumnApi,
      context: js.Any,
      defaultItems: js.Array[String]
    ): GetMainMenuItemsParams = {
      val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], defaultItems = defaultItems.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetMainMenuItemsParams]
    }
    
    extension [Self <: GetMainMenuItemsParams](x: Self) {
      
      inline def setApi(value: GridApi): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      inline def setColumn(value: Column): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnApi(value: ColumnApi): Self = StObject.set(x, "columnApi", value.asInstanceOf[js.Any])
      
      inline def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setDefaultItems(value: js.Array[String]): Self = StObject.set(x, "defaultItems", value.asInstanceOf[js.Any])
      
      inline def setDefaultItemsVarargs(value: String*): Self = StObject.set(x, "defaultItems", js.Array(value :_*))
    }
  }
  
  type GetNodeChildDetails = js.Function1[/* dataItem */ js.Any, NodeChildDetails]
  
  type GetRowNodeIdFunc = js.Function1[/* data */ js.Any, String]
  
  trait GridOptions
    extends StObject
       with ComponentHolder {
    
    var accentedSort: js.UndefOr[Boolean] = js.undefined
    
    var aggFuncs: js.UndefOr[StringDictionary[IAggFunc]] = js.undefined
    
    var aggregateOnlyChangedColumns: js.UndefOr[Boolean] = js.undefined
    
    var alignedGrids: js.UndefOr[js.Array[GridOptions]] = js.undefined
    
    var allowContextMenuWithControlKey: js.UndefOr[Boolean] = js.undefined
    
    var alwaysShowStatusBar: js.UndefOr[Boolean] = js.undefined
    
    var angularCompileFilters: js.UndefOr[Boolean] = js.undefined
    
    var angularCompileHeaders: js.UndefOr[Boolean] = js.undefined
    
    var angularCompileRows: js.UndefOr[Boolean] = js.undefined
    
    var animateRows: js.UndefOr[Boolean] = js.undefined
    
    /****************************************************************
      * Don't forget to update ComponentUtil if changing this class. *
      ****************************************************************/
    var api: js.UndefOr[GridApi] = js.undefined
    
    var autoGroupColumnDef: js.UndefOr[ColDef] = js.undefined
    
    var autoSizePadding: js.UndefOr[Double] = js.undefined
    
    var batchUpdateWaitMillis: js.UndefOr[Double] = js.undefined
    
    var cacheBlockSize: js.UndefOr[Double] = js.undefined
    
    var cacheOverflowSize: js.UndefOr[Double] = js.undefined
    
    var cacheQuickFilter: js.UndefOr[Boolean] = js.undefined
    
    var clipboardDeliminator: js.UndefOr[String] = js.undefined
    
    var colResizeDefault: js.UndefOr[String] = js.undefined
    
    var colWidth: js.UndefOr[Double] = js.undefined
    
    var columnApi: js.UndefOr[ColumnApi] = js.undefined
    
    var columnDefs: js.UndefOr[js.Array[ColDef | ColGroupDef]] = js.undefined
    
    var columnTypes: js.UndefOr[StringDictionary[ColDef]] = js.undefined
    
    var components: js.UndefOr[StringDictionary[AgGridRegisteredComponentInput[IComponent[js.Any]]]] = js.undefined
    
    /****************************************************************
      * Don't forget to update ComponentUtil if changing this class. *
      ****************************************************************/
    var context: js.UndefOr[js.Any] = js.undefined
    
    var contractColumnSelection: js.UndefOr[Boolean] = js.undefined
    
    var datasource: js.UndefOr[IDatasource] = js.undefined
    
    var dateComponent: js.UndefOr[Instantiable] = js.undefined
    
    var dateComponentFramework: js.UndefOr[js.Any] = js.undefined
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var defaultColDef: js.UndefOr[ColDef] = js.undefined
    
    var defaultColGroupDef: js.UndefOr[ColGroupDef] = js.undefined
    
    var defaultExportParams: js.UndefOr[CsvExportParams] = js.undefined
    
    var defaultGroupSortComparator: js.UndefOr[js.Function2[/* nodeA */ RowNode, /* nodeB */ RowNode, Double]] = js.undefined
    
    var deltaRowDataMode: js.UndefOr[Boolean] = js.undefined
    
    var detailCellRenderer: js.UndefOr[InstantiableICellRendererComp | ICellRendererFunc | String] = js.undefined
    
    var detailCellRendererFramework: js.UndefOr[js.Any] = js.undefined
    
    var detailCellRendererParams: js.UndefOr[js.Any] = js.undefined
    
    var detailRowHeight: js.UndefOr[Double] = js.undefined
    
    var doesDataFlower: js.UndefOr[js.Function1[/* dataItem */ js.Any, Boolean]] = js.undefined
    
    var doesExternalFilterPass: js.UndefOr[js.Function1[/* node */ RowNode, Boolean]] = js.undefined
    
    var domLayout: js.UndefOr[String] = js.undefined
    
    var editType: js.UndefOr[String] = js.undefined
    
    var embedFullWidthRows: js.UndefOr[Boolean] = js.undefined
    
    var enableCellChangeFlash: js.UndefOr[Boolean] = js.undefined
    
    var enableCellExpressions: js.UndefOr[Boolean] = js.undefined
    
    var enableColResize: js.UndefOr[Boolean] = js.undefined
    
    var enableFilter: js.UndefOr[Boolean] = js.undefined
    
    var enableGroupEdit: js.UndefOr[Boolean] = js.undefined
    
    var enableOldSetFilterModel: js.UndefOr[Boolean] = js.undefined
    
    var enableRangeSelection: js.UndefOr[Boolean] = js.undefined
    
    var enableRtl: js.UndefOr[Boolean] = js.undefined
    
    var enableServerSideFilter: js.UndefOr[Boolean] = js.undefined
    
    var enableServerSideSorting: js.UndefOr[Boolean] = js.undefined
    
    var enableSorting: js.UndefOr[Boolean] = js.undefined
    
    var enableStatusBar: js.UndefOr[Boolean] = js.undefined
    
    var ensureDomOrder: js.UndefOr[Boolean] = js.undefined
    
    var enterMovesDown: js.UndefOr[Boolean] = js.undefined
    
    var enterMovesDownAfterEdit: js.UndefOr[Boolean] = js.undefined
    
    var excelStyles: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var floatingFilter: js.UndefOr[Boolean] = js.undefined
    
    var floatingFiltersHeight: js.UndefOr[Double] = js.undefined
    
    var forPrint: js.UndefOr[Boolean] = js.undefined
    
    var frameworkComponents: js.UndefOr[StringDictionary[InstantiableAny]] = js.undefined
    
    var fullWidthCellRenderer: js.UndefOr[InstantiableICellRendererComp | ICellRendererFunc | String] = js.undefined
    
    var fullWidthCellRendererFramework: js.UndefOr[js.Any] = js.undefined
    
    var fullWidthCellRendererParams: js.UndefOr[js.Any] = js.undefined
    
    var functionsPassive: js.UndefOr[Boolean] = js.undefined
    
    var functionsReadOnly: js.UndefOr[Boolean] = js.undefined
    
    var getBusinessKeyForNode: js.UndefOr[js.Function1[/* node */ RowNode, String]] = js.undefined
    
    var getChildCount: js.UndefOr[js.Function1[/* dataItem */ js.Any, Double]] = js.undefined
    
    var getContextMenuItems: js.UndefOr[GetContextMenuItems] = js.undefined
    
    var getDataPath: js.UndefOr[GetDataPath] = js.undefined
    
    var getDocument: js.UndefOr[js.Function0[Document]] = js.undefined
    
    var getMainMenuItems: js.UndefOr[GetMainMenuItems] = js.undefined
    
    var getNodeChildDetails: js.UndefOr[GetNodeChildDetails] = js.undefined
    
    var getRowClass: js.UndefOr[js.Function1[/* params */ js.Any, String | js.Array[String]]] = js.undefined
    
    var getRowHeight: js.UndefOr[js.Function] = js.undefined
    
    var getRowNodeId: js.UndefOr[GetRowNodeIdFunc] = js.undefined
    
    var getRowStyle: js.UndefOr[js.Function] = js.undefined
    
    var gridAutoHeight: js.UndefOr[Boolean] = js.undefined
    
    var groupColumnDef: js.UndefOr[ColDef] = js.undefined
    
    var groupDefaultExpanded: js.UndefOr[Double] = js.undefined
    
    var groupHeaderHeight: js.UndefOr[Double] = js.undefined
    
    var groupHideOpenParents: js.UndefOr[Boolean] = js.undefined
    
    var groupIncludeFooter: js.UndefOr[Boolean] = js.undefined
    
    var groupIncludeTotalFooter: js.UndefOr[Boolean] = js.undefined
    
    var groupMultiAutoColumn: js.UndefOr[Boolean] = js.undefined
    
    var groupRemoveLowestSingleChildren: js.UndefOr[Boolean] = js.undefined
    
    var groupRemoveSingleChildren: js.UndefOr[Boolean] = js.undefined
    
    var groupRowAggNodes: js.UndefOr[js.Function1[/* nodes */ js.Array[RowNode], js.Any]] = js.undefined
    
    var groupRowInnerRenderer: js.UndefOr[InstantiableICellRendererComp | ICellRendererFunc | String] = js.undefined
    
    var groupRowInnerRendererFramework: js.UndefOr[js.Any] = js.undefined
    
    var groupRowRenderer: js.UndefOr[InstantiableICellRendererComp | ICellRendererFunc | String] = js.undefined
    
    var groupRowRendererFramework: js.UndefOr[js.Any] = js.undefined
    
    var groupRowRendererParams: js.UndefOr[js.Any] = js.undefined
    
    var groupSelectsChildren: js.UndefOr[Boolean] = js.undefined
    
    var groupSelectsFiltered: js.UndefOr[Boolean] = js.undefined
    
    /****************************************************************
      * Don't forget to update ComponentUtil if changing this class. *
      ****************************************************************/
    var groupSuppressAutoColumn: js.UndefOr[Boolean] = js.undefined
    
    var groupSuppressBlankHeader: js.UndefOr[Boolean] = js.undefined
    
    var groupSuppressRow: js.UndefOr[Boolean] = js.undefined
    
    var groupUseEntireRow: js.UndefOr[Boolean] = js.undefined
    
    var headerHeight: js.UndefOr[Double] = js.undefined
    
    var icons: js.UndefOr[js.Any] = js.undefined
    
    var infiniteInitialRowCount: js.UndefOr[Double] = js.undefined
    
    var isExternalFilterPresent: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    var isFullWidthCell: js.UndefOr[js.Function1[/* rowNode */ RowNode, Boolean]] = js.undefined
    
    var isRowMaster: js.UndefOr[IsRowMaster] = js.undefined
    
    var isRowSelectable: js.UndefOr[IsRowSelectable] = js.undefined
    
    var loadingOverlayComponent: js.UndefOr[InstantiableILoadingOverlayComp | String] = js.undefined
    
    var loadingOverlayComponentFramework: js.UndefOr[js.Any] = js.undefined
    
    /****************************************************************
      * Don't forget to update ComponentUtil if changing this class. *
      ****************************************************************/
    var localeText: js.UndefOr[js.Any] = js.undefined
    
    var localeTextFunc: js.UndefOr[js.Function] = js.undefined
    
    var masterDetail: js.UndefOr[Boolean] = js.undefined
    
    var maxBlocksInCache: js.UndefOr[Double] = js.undefined
    
    var maxColWidth: js.UndefOr[Double] = js.undefined
    
    var maxConcurrentDatasourceRequests: js.UndefOr[Double] = js.undefined
    
    var minColWidth: js.UndefOr[Double] = js.undefined
    
    var multiSortKey: js.UndefOr[String] = js.undefined
    
    var navigateToNextCell: js.UndefOr[js.Function1[/* params */ NavigateToNextCellParams, GridCellDef]] = js.undefined
    
    var noRowsOverlayComponent: js.UndefOr[InstantiableINoRowsOverlayComp | String] = js.undefined
    
    var noRowsOverlayComponentFramework: js.UndefOr[js.Any] = js.undefined
    
    var onBodyScroll: js.UndefOr[js.Function1[/* event */ BodyScrollEvent, Unit]] = js.undefined
    
    var onCellClicked: js.UndefOr[js.Function1[/* event */ CellClickedEvent, Unit]] = js.undefined
    
    var onCellContextMenu: js.UndefOr[js.Function1[/* event */ CellContextMenuEvent, Unit]] = js.undefined
    
    var onCellDoubleClicked: js.UndefOr[js.Function1[/* event */ CellDoubleClickedEvent, Unit]] = js.undefined
    
    var onCellEditingStarted: js.UndefOr[js.Function1[/* event */ CellEditingStartedEvent, Unit]] = js.undefined
    
    var onCellEditingStopped: js.UndefOr[js.Function1[/* event */ CellEditingStoppedEvent, Unit]] = js.undefined
    
    var onCellFocused: js.UndefOr[js.Function1[/* event */ CellFocusedEvent, Unit]] = js.undefined
    
    var onCellMouseDown: js.UndefOr[js.Function1[/* event */ CellMouseDownEvent, Unit]] = js.undefined
    
    var onCellMouseOut: js.UndefOr[js.Function1[/* event */ CellMouseOutEvent, Unit]] = js.undefined
    
    var onCellMouseOver: js.UndefOr[js.Function1[/* event */ CellMouseOverEvent, Unit]] = js.undefined
    
    var onCellValueChanged: js.UndefOr[js.Function1[/* event */ CellValueChangedEvent, Unit]] = js.undefined
    
    var onColumnAggFuncChangeRequest: js.UndefOr[js.Function1[/* event */ ColumnAggFuncChangeRequestEvent, Unit]] = js.undefined
    
    /****************************************************************
      * Don't forget to update ComponentUtil if changing this class. *
      ****************************************************************/
    var onColumnEverythingChanged: js.UndefOr[js.Function1[/* event */ ColumnEverythingChangedEvent, Unit]] = js.undefined
    
    var onColumnGroupOpened: js.UndefOr[js.Function1[/* event */ ColumnGroupOpenedEvent, Unit]] = js.undefined
    
    var onColumnMoved: js.UndefOr[js.Function1[/* event */ ColumnMovedEvent, Unit]] = js.undefined
    
    var onColumnPinned: js.UndefOr[js.Function1[/* event */ ColumnPinnedEvent, Unit]] = js.undefined
    
    var onColumnPivotChangeRequest: js.UndefOr[js.Function1[/* event */ ColumnPivotChangeRequestEvent, Unit]] = js.undefined
    
    var onColumnPivotChanged: js.UndefOr[js.Function1[/* event */ ColumnPivotChangedEvent, Unit]] = js.undefined
    
    var onColumnPivotModeChanged: js.UndefOr[js.Function1[/* event */ ColumnPivotModeChangedEvent, Unit]] = js.undefined
    
    var onColumnResized: js.UndefOr[js.Function1[/* event */ ColumnResizedEvent, Unit]] = js.undefined
    
    var onColumnRowGroupChangeRequest: js.UndefOr[js.Function1[/* event */ ColumnRowGroupChangeRequestEvent, Unit]] = js.undefined
    
    var onColumnRowGroupChanged: js.UndefOr[js.Function1[/* event */ ColumnRowGroupChangedEvent, Unit]] = js.undefined
    
    var onColumnValueChangeRequest: js.UndefOr[js.Function1[/* event */ ColumnValueChangeRequestEvent, Unit]] = js.undefined
    
    var onColumnValueChanged: js.UndefOr[js.Function1[/* event */ ColumnValueChangedEvent, Unit]] = js.undefined
    
    var onColumnVisible: js.UndefOr[js.Function1[/* event */ ColumnVisibleEvent, Unit]] = js.undefined
    
    var onDisplayedColumnsChanged: js.UndefOr[js.Function1[/* event */ DisplayedColumnsChangedEvent, Unit]] = js.undefined
    
    var onDragStarted: js.UndefOr[js.Function1[/* event */ DragStartedEvent, Unit]] = js.undefined
    
    var onDragStopped: js.UndefOr[js.Function1[/* event */ DragStoppedEvent, Unit]] = js.undefined
    
    var onFilterChanged: js.UndefOr[js.Function1[/* event */ FilterChangedEvent, Unit]] = js.undefined
    
    var onFilterModified: js.UndefOr[js.Function1[/* event */ FilterModifiedEvent, Unit]] = js.undefined
    
    var onGridColumnsChanged: js.UndefOr[js.Function1[/* event */ GridColumnsChangedEvent, Unit]] = js.undefined
    
    var onGridReady: js.UndefOr[js.Function1[/* event */ GridReadyEvent, Unit]] = js.undefined
    
    var onGridSizeChanged: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.undefined
    
    var onModelUpdated: js.UndefOr[js.Function1[/* event */ ModelUpdatedEvent, Unit]] = js.undefined
    
    var onNewColumnsLoaded: js.UndefOr[js.Function1[/* event */ NewColumnsLoadedEvent, Unit]] = js.undefined
    
    var onPaginationChanged: js.UndefOr[js.Function1[/* event */ PaginationChangedEvent, Unit]] = js.undefined
    
    var onPasteEnd: js.UndefOr[js.Function1[/* event */ PasteEndEvent, Unit]] = js.undefined
    
    var onPasteStart: js.UndefOr[js.Function1[/* event */ PasteStartEvent, Unit]] = js.undefined
    
    var onPinnedRowDataChanged: js.UndefOr[js.Function1[/* event */ PinnedRowDataChangedEvent, Unit]] = js.undefined
    
    var onRangeSelectionChanged: js.UndefOr[js.Function1[/* event */ RangeSelectionChangedEvent, Unit]] = js.undefined
    
    var onRowClicked: js.UndefOr[js.Function1[/* event */ RowClickedEvent, Unit]] = js.undefined
    
    var onRowDataChanged: js.UndefOr[js.Function1[/* event */ RowDataChangedEvent, Unit]] = js.undefined
    
    var onRowDataUpdated: js.UndefOr[js.Function1[/* event */ RowDataUpdatedEvent, Unit]] = js.undefined
    
    var onRowDoubleClicked: js.UndefOr[js.Function1[/* event */ RowDoubleClickedEvent, Unit]] = js.undefined
    
    var onRowDragEnd: js.UndefOr[js.Function1[/* event */ RowDragEvent, Unit]] = js.undefined
    
    var onRowDragEnter: js.UndefOr[js.Function1[/* event */ RowDragEvent, Unit]] = js.undefined
    
    var onRowDragLeave: js.UndefOr[js.Function1[/* event */ RowDragEvent, Unit]] = js.undefined
    
    var onRowDragMove: js.UndefOr[js.Function1[/* event */ RowDragEvent, Unit]] = js.undefined
    
    var onRowEditingStarted: js.UndefOr[js.Function1[/* event */ RowEditingStartedEvent, Unit]] = js.undefined
    
    var onRowEditingStopped: js.UndefOr[js.Function1[/* event */ RowEditingStoppedEvent, Unit]] = js.undefined
    
    var onRowGroupOpened: js.UndefOr[js.Function1[/* event */ RowGroupOpenedEvent, Unit]] = js.undefined
    
    var onRowSelected: js.UndefOr[js.Function1[/* event */ RowSelectedEvent, Unit]] = js.undefined
    
    var onRowValueChanged: js.UndefOr[js.Function1[/* event */ RowValueChangedEvent, Unit]] = js.undefined
    
    var onSelectionChanged: js.UndefOr[js.Function1[/* event */ SelectionChangedEvent, Unit]] = js.undefined
    
    var onSortChanged: js.UndefOr[js.Function1[/* event */ SortChangedEvent, Unit]] = js.undefined
    
    var onViewportChanged: js.UndefOr[js.Function1[/* event */ ViewportChangedEvent, Unit]] = js.undefined
    
    var onVirtualColumnsChanged: js.UndefOr[js.Function1[/* event */ VirtualColumnsChangedEvent, Unit]] = js.undefined
    
    var onVirtualRowRemoved: js.UndefOr[js.Function1[/* event */ VirtualRowRemovedEvent, Unit]] = js.undefined
    
    var overlayLoadingTemplate: js.UndefOr[String] = js.undefined
    
    var overlayNoRowsTemplate: js.UndefOr[String] = js.undefined
    
    var pagination: js.UndefOr[Boolean] = js.undefined
    
    var paginationAutoPageSize: js.UndefOr[Boolean] = js.undefined
    
    /****************************************************************
      * Don't forget to update ComponentUtil if changing this class. *
      ****************************************************************/
    var paginationNumberFormatter: js.UndefOr[js.Function1[/* params */ PaginationNumberFormatterParams, String]] = js.undefined
    
    var paginationPageSize: js.UndefOr[Double] = js.undefined
    
    var paginationStartPage: js.UndefOr[Double] = js.undefined
    
    var pinnedBottomRowData: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var pinnedTopRowData: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var pivotColumnGroupTotals: js.UndefOr[String] = js.undefined
    
    var pivotGroupHeaderHeight: js.UndefOr[Double] = js.undefined
    
    var pivotHeaderHeight: js.UndefOr[Double] = js.undefined
    
    var pivotMode: js.UndefOr[Boolean] = js.undefined
    
    var pivotPanelShow: js.UndefOr[String] = js.undefined
    
    var pivotRowTotals: js.UndefOr[String] = js.undefined
    
    var pivotTotals: js.UndefOr[Boolean] = js.undefined
    
    var popupParent: js.UndefOr[HTMLElement] = js.undefined
    
    var postProcessPopup: js.UndefOr[js.Function1[/* params */ PostProcessPopupParams, Unit]] = js.undefined
    
    var postSort: js.UndefOr[js.Function1[/* nodes */ js.Array[RowNode], Unit]] = js.undefined
    
    var processCellForClipboard: js.UndefOr[js.Function1[/* params */ ProcessCellForExportParams, js.Any]] = js.undefined
    
    var processCellFromClipboard: js.UndefOr[js.Function1[/* params */ ProcessCellForExportParams, js.Any]] = js.undefined
    
    var processDataFromClipboard: js.UndefOr[
        js.Function1[/* params */ ProcessDataFromClipboardParams, js.Array[js.Array[String]]]
      ] = js.undefined
    
    var processHeaderForClipboard: js.UndefOr[js.Function1[/* params */ ProcessHeaderForExportParams, js.Any]] = js.undefined
    
    var processRowPostCreate: js.UndefOr[js.Function1[/* params */ ProcessRowParams, Unit]] = js.undefined
    
    var processSecondaryColDef: js.UndefOr[js.Function1[/* colDef */ ColDef, Unit]] = js.undefined
    
    var processSecondaryColGroupDef: js.UndefOr[js.Function1[/* colGroupDef */ ColGroupDef, Unit]] = js.undefined
    
    var purgeClosedRowNodes: js.UndefOr[Boolean] = js.undefined
    
    var quickFilterText: js.UndefOr[String] = js.undefined
    
    var rememberGroupStateWhenNewData: js.UndefOr[Boolean] = js.undefined
    
    var rowBuffer: js.UndefOr[Double] = js.undefined
    
    var rowClass: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var rowClassRules: js.UndefOr[StringDictionary[js.Function | String]] = js.undefined
    
    /****************************************************************
      * Don't forget to update ComponentUtil if changing this class. *
      ****************************************************************/
    var rowData: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var rowDeselection: js.UndefOr[Boolean] = js.undefined
    
    /****************************************************************
      * Don't forget to update ComponentUtil if changing this class. PLEASE!*
      ****************************************************************/
    var rowDragManaged: js.UndefOr[Boolean] = js.undefined
    
    var rowGroupPanelShow: js.UndefOr[String] = js.undefined
    
    var rowHeight: js.UndefOr[Double] = js.undefined
    
    var rowModelType: js.UndefOr[String] = js.undefined
    
    var rowMultiSelectWithClick: js.UndefOr[Boolean] = js.undefined
    
    var rowSelection: js.UndefOr[String] = js.undefined
    
    var rowStyle: js.UndefOr[js.Any] = js.undefined
    
    var scrollbarWidth: js.UndefOr[Double] = js.undefined
    
    var sendToClipboard: js.UndefOr[js.Function1[/* params */ js.Any, Unit]] = js.undefined
    
    var serverSideDatasource: js.UndefOr[IServerSideDatasource] = js.undefined
    
    var serverSideSortingAlwaysResets: js.UndefOr[Boolean] = js.undefined
    
    var showToolPanel: js.UndefOr[Boolean] = js.undefined
    
    var singleClickEdit: js.UndefOr[Boolean] = js.undefined
    
    var slaveGrids: js.UndefOr[js.Array[GridOptions]] = js.undefined
    
    var sortingOrder: js.UndefOr[js.Array[String]] = js.undefined
    
    var stopEditingWhenGridLosesFocus: js.UndefOr[Boolean] = js.undefined
    
    var suppressAggAtRootLevel: js.UndefOr[Boolean] = js.undefined
    
    var suppressAggFuncInHeader: js.UndefOr[Boolean] = js.undefined
    
    var suppressAnimationFrame: js.UndefOr[Boolean] = js.undefined
    
    var suppressAsyncEvents: js.UndefOr[Boolean] = js.undefined
    
    var suppressAutoSize: js.UndefOr[Boolean] = js.undefined
    
    var suppressCellSelection: js.UndefOr[Boolean] = js.undefined
    
    var suppressChangeDetection: js.UndefOr[Boolean] = js.undefined
    
    var suppressClickEdit: js.UndefOr[Boolean] = js.undefined
    
    var suppressClipboardPaste: js.UndefOr[Boolean] = js.undefined
    
    var suppressColumnMoveAnimation: js.UndefOr[Boolean] = js.undefined
    
    var suppressColumnVirtualisation: js.UndefOr[Boolean] = js.undefined
    
    var suppressContextMenu: js.UndefOr[Boolean] = js.undefined
    
    var suppressCopyRowsToClipboard: js.UndefOr[Boolean] = js.undefined
    
    var suppressCsvExport: js.UndefOr[Boolean] = js.undefined
    
    var suppressDragLeaveHidesColumns: js.UndefOr[Boolean] = js.undefined
    
    var suppressEnterpriseResetOnNewColumns: js.UndefOr[Boolean] = js.undefined
    
    var suppressExcelExport: js.UndefOr[Boolean] = js.undefined
    
    var suppressFieldDotNotation: js.UndefOr[Boolean] = js.undefined
    
    var suppressFocusAfterRefresh: js.UndefOr[Boolean] = js.undefined
    
    var suppressHorizontalScroll: js.UndefOr[Boolean] = js.undefined
    
    var suppressLoadingOverlay: js.UndefOr[Boolean] = js.undefined
    
    var suppressMakeColumnVisibleAfterUnGroup: js.UndefOr[Boolean] = js.undefined
    
    var suppressMenuHide: js.UndefOr[Boolean] = js.undefined
    
    var suppressMiddleClickScrolls: js.UndefOr[Boolean] = js.undefined
    
    var suppressMovableColumns: js.UndefOr[Boolean] = js.undefined
    
    var suppressMultiRangeSelection: js.UndefOr[Boolean] = js.undefined
    
    var suppressMultiSort: js.UndefOr[Boolean] = js.undefined
    
    var suppressNoRowsOverlay: js.UndefOr[Boolean] = js.undefined
    
    var suppressPaginationPanel: js.UndefOr[Boolean] = js.undefined
    
    var suppressParentsInRowNodes: js.UndefOr[Boolean] = js.undefined
    
    var suppressPreventDefaultOnMouseWheel: js.UndefOr[Boolean] = js.undefined
    
    var suppressPropertyNamesCheck: js.UndefOr[Boolean] = js.undefined
    
    var suppressRowClickSelection: js.UndefOr[Boolean] = js.undefined
    
    var suppressRowDrag: js.UndefOr[Boolean] = js.undefined
    
    var suppressRowHoverHighlight: js.UndefOr[Boolean] = js.undefined
    
    var suppressRowTransform: js.UndefOr[Boolean] = js.undefined
    
    var suppressScrollOnNewData: js.UndefOr[Boolean] = js.undefined
    
    var suppressTabbing: js.UndefOr[Boolean] = js.undefined
    
    var suppressTouch: js.UndefOr[Boolean] = js.undefined
    
    var tabToNextCell: js.UndefOr[js.Function1[/* params */ TabToNextCellParams, GridCellDef]] = js.undefined
    
    var toolPanelSuppressColumnExpandAll: js.UndefOr[Boolean] = js.undefined
    
    var toolPanelSuppressColumnFilter: js.UndefOr[Boolean] = js.undefined
    
    var toolPanelSuppressColumnSelectAll: js.UndefOr[Boolean] = js.undefined
    
    var toolPanelSuppressPivotMode: js.UndefOr[Boolean] = js.undefined
    
    var toolPanelSuppressPivots: js.UndefOr[Boolean] = js.undefined
    
    var toolPanelSuppressRowGroups: js.UndefOr[Boolean] = js.undefined
    
    var toolPanelSuppressSideButtons: js.UndefOr[Boolean] = js.undefined
    
    var toolPanelSuppressValues: js.UndefOr[Boolean] = js.undefined
    
    var treeData: js.UndefOr[Boolean] = js.undefined
    
    var unSortIcon: js.UndefOr[Boolean] = js.undefined
    
    var valueCache: js.UndefOr[Boolean] = js.undefined
    
    var valueCacheNeverExpires: js.UndefOr[Boolean] = js.undefined
    
    var viewportDatasource: js.UndefOr[IViewportDatasource] = js.undefined
    
    var viewportRowModelBufferSize: js.UndefOr[Double] = js.undefined
    
    var viewportRowModelPageSize: js.UndefOr[Double] = js.undefined
  }
  object GridOptions {
    
    inline def apply(): GridOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridOptions]
    }
    
    extension [Self <: GridOptions](x: Self) {
      
      inline def setAccentedSort(value: Boolean): Self = StObject.set(x, "accentedSort", value.asInstanceOf[js.Any])
      
      inline def setAccentedSortUndefined: Self = StObject.set(x, "accentedSort", js.undefined)
      
      inline def setAggFuncs(value: StringDictionary[IAggFunc]): Self = StObject.set(x, "aggFuncs", value.asInstanceOf[js.Any])
      
      inline def setAggFuncsUndefined: Self = StObject.set(x, "aggFuncs", js.undefined)
      
      inline def setAggregateOnlyChangedColumns(value: Boolean): Self = StObject.set(x, "aggregateOnlyChangedColumns", value.asInstanceOf[js.Any])
      
      inline def setAggregateOnlyChangedColumnsUndefined: Self = StObject.set(x, "aggregateOnlyChangedColumns", js.undefined)
      
      inline def setAlignedGrids(value: js.Array[GridOptions]): Self = StObject.set(x, "alignedGrids", value.asInstanceOf[js.Any])
      
      inline def setAlignedGridsUndefined: Self = StObject.set(x, "alignedGrids", js.undefined)
      
      inline def setAlignedGridsVarargs(value: GridOptions*): Self = StObject.set(x, "alignedGrids", js.Array(value :_*))
      
      inline def setAllowContextMenuWithControlKey(value: Boolean): Self = StObject.set(x, "allowContextMenuWithControlKey", value.asInstanceOf[js.Any])
      
      inline def setAllowContextMenuWithControlKeyUndefined: Self = StObject.set(x, "allowContextMenuWithControlKey", js.undefined)
      
      inline def setAlwaysShowStatusBar(value: Boolean): Self = StObject.set(x, "alwaysShowStatusBar", value.asInstanceOf[js.Any])
      
      inline def setAlwaysShowStatusBarUndefined: Self = StObject.set(x, "alwaysShowStatusBar", js.undefined)
      
      inline def setAngularCompileFilters(value: Boolean): Self = StObject.set(x, "angularCompileFilters", value.asInstanceOf[js.Any])
      
      inline def setAngularCompileFiltersUndefined: Self = StObject.set(x, "angularCompileFilters", js.undefined)
      
      inline def setAngularCompileHeaders(value: Boolean): Self = StObject.set(x, "angularCompileHeaders", value.asInstanceOf[js.Any])
      
      inline def setAngularCompileHeadersUndefined: Self = StObject.set(x, "angularCompileHeaders", js.undefined)
      
      inline def setAngularCompileRows(value: Boolean): Self = StObject.set(x, "angularCompileRows", value.asInstanceOf[js.Any])
      
      inline def setAngularCompileRowsUndefined: Self = StObject.set(x, "angularCompileRows", js.undefined)
      
      inline def setAnimateRows(value: Boolean): Self = StObject.set(x, "animateRows", value.asInstanceOf[js.Any])
      
      inline def setAnimateRowsUndefined: Self = StObject.set(x, "animateRows", js.undefined)
      
      inline def setApi(value: GridApi): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      inline def setApiUndefined: Self = StObject.set(x, "api", js.undefined)
      
      inline def setAutoGroupColumnDef(value: ColDef): Self = StObject.set(x, "autoGroupColumnDef", value.asInstanceOf[js.Any])
      
      inline def setAutoGroupColumnDefUndefined: Self = StObject.set(x, "autoGroupColumnDef", js.undefined)
      
      inline def setAutoSizePadding(value: Double): Self = StObject.set(x, "autoSizePadding", value.asInstanceOf[js.Any])
      
      inline def setAutoSizePaddingUndefined: Self = StObject.set(x, "autoSizePadding", js.undefined)
      
      inline def setBatchUpdateWaitMillis(value: Double): Self = StObject.set(x, "batchUpdateWaitMillis", value.asInstanceOf[js.Any])
      
      inline def setBatchUpdateWaitMillisUndefined: Self = StObject.set(x, "batchUpdateWaitMillis", js.undefined)
      
      inline def setCacheBlockSize(value: Double): Self = StObject.set(x, "cacheBlockSize", value.asInstanceOf[js.Any])
      
      inline def setCacheBlockSizeUndefined: Self = StObject.set(x, "cacheBlockSize", js.undefined)
      
      inline def setCacheOverflowSize(value: Double): Self = StObject.set(x, "cacheOverflowSize", value.asInstanceOf[js.Any])
      
      inline def setCacheOverflowSizeUndefined: Self = StObject.set(x, "cacheOverflowSize", js.undefined)
      
      inline def setCacheQuickFilter(value: Boolean): Self = StObject.set(x, "cacheQuickFilter", value.asInstanceOf[js.Any])
      
      inline def setCacheQuickFilterUndefined: Self = StObject.set(x, "cacheQuickFilter", js.undefined)
      
      inline def setClipboardDeliminator(value: String): Self = StObject.set(x, "clipboardDeliminator", value.asInstanceOf[js.Any])
      
      inline def setClipboardDeliminatorUndefined: Self = StObject.set(x, "clipboardDeliminator", js.undefined)
      
      inline def setColResizeDefault(value: String): Self = StObject.set(x, "colResizeDefault", value.asInstanceOf[js.Any])
      
      inline def setColResizeDefaultUndefined: Self = StObject.set(x, "colResizeDefault", js.undefined)
      
      inline def setColWidth(value: Double): Self = StObject.set(x, "colWidth", value.asInstanceOf[js.Any])
      
      inline def setColWidthUndefined: Self = StObject.set(x, "colWidth", js.undefined)
      
      inline def setColumnApi(value: ColumnApi): Self = StObject.set(x, "columnApi", value.asInstanceOf[js.Any])
      
      inline def setColumnApiUndefined: Self = StObject.set(x, "columnApi", js.undefined)
      
      inline def setColumnDefs(value: js.Array[ColDef | ColGroupDef]): Self = StObject.set(x, "columnDefs", value.asInstanceOf[js.Any])
      
      inline def setColumnDefsUndefined: Self = StObject.set(x, "columnDefs", js.undefined)
      
      inline def setColumnDefsVarargs(value: (ColDef | ColGroupDef)*): Self = StObject.set(x, "columnDefs", js.Array(value :_*))
      
      inline def setColumnTypes(value: StringDictionary[ColDef]): Self = StObject.set(x, "columnTypes", value.asInstanceOf[js.Any])
      
      inline def setColumnTypesUndefined: Self = StObject.set(x, "columnTypes", js.undefined)
      
      inline def setComponents(value: StringDictionary[AgGridRegisteredComponentInput[IComponent[js.Any]]]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      inline def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setContractColumnSelection(value: Boolean): Self = StObject.set(x, "contractColumnSelection", value.asInstanceOf[js.Any])
      
      inline def setContractColumnSelectionUndefined: Self = StObject.set(x, "contractColumnSelection", js.undefined)
      
      inline def setDatasource(value: IDatasource): Self = StObject.set(x, "datasource", value.asInstanceOf[js.Any])
      
      inline def setDatasourceUndefined: Self = StObject.set(x, "datasource", js.undefined)
      
      inline def setDateComponent(value: Instantiable): Self = StObject.set(x, "dateComponent", value.asInstanceOf[js.Any])
      
      inline def setDateComponentFramework(value: js.Any): Self = StObject.set(x, "dateComponentFramework", value.asInstanceOf[js.Any])
      
      inline def setDateComponentFrameworkUndefined: Self = StObject.set(x, "dateComponentFramework", js.undefined)
      
      inline def setDateComponentUndefined: Self = StObject.set(x, "dateComponent", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDefaultColDef(value: ColDef): Self = StObject.set(x, "defaultColDef", value.asInstanceOf[js.Any])
      
      inline def setDefaultColDefUndefined: Self = StObject.set(x, "defaultColDef", js.undefined)
      
      inline def setDefaultColGroupDef(value: ColGroupDef): Self = StObject.set(x, "defaultColGroupDef", value.asInstanceOf[js.Any])
      
      inline def setDefaultColGroupDefUndefined: Self = StObject.set(x, "defaultColGroupDef", js.undefined)
      
      inline def setDefaultExportParams(value: CsvExportParams): Self = StObject.set(x, "defaultExportParams", value.asInstanceOf[js.Any])
      
      inline def setDefaultExportParamsUndefined: Self = StObject.set(x, "defaultExportParams", js.undefined)
      
      inline def setDefaultGroupSortComparator(value: (/* nodeA */ RowNode, /* nodeB */ RowNode) => Double): Self = StObject.set(x, "defaultGroupSortComparator", js.Any.fromFunction2(value))
      
      inline def setDefaultGroupSortComparatorUndefined: Self = StObject.set(x, "defaultGroupSortComparator", js.undefined)
      
      inline def setDeltaRowDataMode(value: Boolean): Self = StObject.set(x, "deltaRowDataMode", value.asInstanceOf[js.Any])
      
      inline def setDeltaRowDataModeUndefined: Self = StObject.set(x, "deltaRowDataMode", js.undefined)
      
      inline def setDetailCellRenderer(value: InstantiableICellRendererComp | ICellRendererFunc | String): Self = StObject.set(x, "detailCellRenderer", value.asInstanceOf[js.Any])
      
      inline def setDetailCellRendererFramework(value: js.Any): Self = StObject.set(x, "detailCellRendererFramework", value.asInstanceOf[js.Any])
      
      inline def setDetailCellRendererFrameworkUndefined: Self = StObject.set(x, "detailCellRendererFramework", js.undefined)
      
      inline def setDetailCellRendererFunction1(value: /* params */ js.Any => HTMLElement | String): Self = StObject.set(x, "detailCellRenderer", js.Any.fromFunction1(value))
      
      inline def setDetailCellRendererParams(value: js.Any): Self = StObject.set(x, "detailCellRendererParams", value.asInstanceOf[js.Any])
      
      inline def setDetailCellRendererParamsUndefined: Self = StObject.set(x, "detailCellRendererParams", js.undefined)
      
      inline def setDetailCellRendererUndefined: Self = StObject.set(x, "detailCellRenderer", js.undefined)
      
      inline def setDetailRowHeight(value: Double): Self = StObject.set(x, "detailRowHeight", value.asInstanceOf[js.Any])
      
      inline def setDetailRowHeightUndefined: Self = StObject.set(x, "detailRowHeight", js.undefined)
      
      inline def setDoesDataFlower(value: /* dataItem */ js.Any => Boolean): Self = StObject.set(x, "doesDataFlower", js.Any.fromFunction1(value))
      
      inline def setDoesDataFlowerUndefined: Self = StObject.set(x, "doesDataFlower", js.undefined)
      
      inline def setDoesExternalFilterPass(value: /* node */ RowNode => Boolean): Self = StObject.set(x, "doesExternalFilterPass", js.Any.fromFunction1(value))
      
      inline def setDoesExternalFilterPassUndefined: Self = StObject.set(x, "doesExternalFilterPass", js.undefined)
      
      inline def setDomLayout(value: String): Self = StObject.set(x, "domLayout", value.asInstanceOf[js.Any])
      
      inline def setDomLayoutUndefined: Self = StObject.set(x, "domLayout", js.undefined)
      
      inline def setEditType(value: String): Self = StObject.set(x, "editType", value.asInstanceOf[js.Any])
      
      inline def setEditTypeUndefined: Self = StObject.set(x, "editType", js.undefined)
      
      inline def setEmbedFullWidthRows(value: Boolean): Self = StObject.set(x, "embedFullWidthRows", value.asInstanceOf[js.Any])
      
      inline def setEmbedFullWidthRowsUndefined: Self = StObject.set(x, "embedFullWidthRows", js.undefined)
      
      inline def setEnableCellChangeFlash(value: Boolean): Self = StObject.set(x, "enableCellChangeFlash", value.asInstanceOf[js.Any])
      
      inline def setEnableCellChangeFlashUndefined: Self = StObject.set(x, "enableCellChangeFlash", js.undefined)
      
      inline def setEnableCellExpressions(value: Boolean): Self = StObject.set(x, "enableCellExpressions", value.asInstanceOf[js.Any])
      
      inline def setEnableCellExpressionsUndefined: Self = StObject.set(x, "enableCellExpressions", js.undefined)
      
      inline def setEnableColResize(value: Boolean): Self = StObject.set(x, "enableColResize", value.asInstanceOf[js.Any])
      
      inline def setEnableColResizeUndefined: Self = StObject.set(x, "enableColResize", js.undefined)
      
      inline def setEnableFilter(value: Boolean): Self = StObject.set(x, "enableFilter", value.asInstanceOf[js.Any])
      
      inline def setEnableFilterUndefined: Self = StObject.set(x, "enableFilter", js.undefined)
      
      inline def setEnableGroupEdit(value: Boolean): Self = StObject.set(x, "enableGroupEdit", value.asInstanceOf[js.Any])
      
      inline def setEnableGroupEditUndefined: Self = StObject.set(x, "enableGroupEdit", js.undefined)
      
      inline def setEnableOldSetFilterModel(value: Boolean): Self = StObject.set(x, "enableOldSetFilterModel", value.asInstanceOf[js.Any])
      
      inline def setEnableOldSetFilterModelUndefined: Self = StObject.set(x, "enableOldSetFilterModel", js.undefined)
      
      inline def setEnableRangeSelection(value: Boolean): Self = StObject.set(x, "enableRangeSelection", value.asInstanceOf[js.Any])
      
      inline def setEnableRangeSelectionUndefined: Self = StObject.set(x, "enableRangeSelection", js.undefined)
      
      inline def setEnableRtl(value: Boolean): Self = StObject.set(x, "enableRtl", value.asInstanceOf[js.Any])
      
      inline def setEnableRtlUndefined: Self = StObject.set(x, "enableRtl", js.undefined)
      
      inline def setEnableServerSideFilter(value: Boolean): Self = StObject.set(x, "enableServerSideFilter", value.asInstanceOf[js.Any])
      
      inline def setEnableServerSideFilterUndefined: Self = StObject.set(x, "enableServerSideFilter", js.undefined)
      
      inline def setEnableServerSideSorting(value: Boolean): Self = StObject.set(x, "enableServerSideSorting", value.asInstanceOf[js.Any])
      
      inline def setEnableServerSideSortingUndefined: Self = StObject.set(x, "enableServerSideSorting", js.undefined)
      
      inline def setEnableSorting(value: Boolean): Self = StObject.set(x, "enableSorting", value.asInstanceOf[js.Any])
      
      inline def setEnableSortingUndefined: Self = StObject.set(x, "enableSorting", js.undefined)
      
      inline def setEnableStatusBar(value: Boolean): Self = StObject.set(x, "enableStatusBar", value.asInstanceOf[js.Any])
      
      inline def setEnableStatusBarUndefined: Self = StObject.set(x, "enableStatusBar", js.undefined)
      
      inline def setEnsureDomOrder(value: Boolean): Self = StObject.set(x, "ensureDomOrder", value.asInstanceOf[js.Any])
      
      inline def setEnsureDomOrderUndefined: Self = StObject.set(x, "ensureDomOrder", js.undefined)
      
      inline def setEnterMovesDown(value: Boolean): Self = StObject.set(x, "enterMovesDown", value.asInstanceOf[js.Any])
      
      inline def setEnterMovesDownAfterEdit(value: Boolean): Self = StObject.set(x, "enterMovesDownAfterEdit", value.asInstanceOf[js.Any])
      
      inline def setEnterMovesDownAfterEditUndefined: Self = StObject.set(x, "enterMovesDownAfterEdit", js.undefined)
      
      inline def setEnterMovesDownUndefined: Self = StObject.set(x, "enterMovesDown", js.undefined)
      
      inline def setExcelStyles(value: js.Array[js.Any]): Self = StObject.set(x, "excelStyles", value.asInstanceOf[js.Any])
      
      inline def setExcelStylesUndefined: Self = StObject.set(x, "excelStyles", js.undefined)
      
      inline def setExcelStylesVarargs(value: js.Any*): Self = StObject.set(x, "excelStyles", js.Array(value :_*))
      
      inline def setFloatingFilter(value: Boolean): Self = StObject.set(x, "floatingFilter", value.asInstanceOf[js.Any])
      
      inline def setFloatingFilterUndefined: Self = StObject.set(x, "floatingFilter", js.undefined)
      
      inline def setFloatingFiltersHeight(value: Double): Self = StObject.set(x, "floatingFiltersHeight", value.asInstanceOf[js.Any])
      
      inline def setFloatingFiltersHeightUndefined: Self = StObject.set(x, "floatingFiltersHeight", js.undefined)
      
      inline def setForPrint(value: Boolean): Self = StObject.set(x, "forPrint", value.asInstanceOf[js.Any])
      
      inline def setForPrintUndefined: Self = StObject.set(x, "forPrint", js.undefined)
      
      inline def setFrameworkComponents(value: StringDictionary[InstantiableAny]): Self = StObject.set(x, "frameworkComponents", value.asInstanceOf[js.Any])
      
      inline def setFrameworkComponentsUndefined: Self = StObject.set(x, "frameworkComponents", js.undefined)
      
      inline def setFullWidthCellRenderer(value: InstantiableICellRendererComp | ICellRendererFunc | String): Self = StObject.set(x, "fullWidthCellRenderer", value.asInstanceOf[js.Any])
      
      inline def setFullWidthCellRendererFramework(value: js.Any): Self = StObject.set(x, "fullWidthCellRendererFramework", value.asInstanceOf[js.Any])
      
      inline def setFullWidthCellRendererFrameworkUndefined: Self = StObject.set(x, "fullWidthCellRendererFramework", js.undefined)
      
      inline def setFullWidthCellRendererFunction1(value: /* params */ js.Any => HTMLElement | String): Self = StObject.set(x, "fullWidthCellRenderer", js.Any.fromFunction1(value))
      
      inline def setFullWidthCellRendererParams(value: js.Any): Self = StObject.set(x, "fullWidthCellRendererParams", value.asInstanceOf[js.Any])
      
      inline def setFullWidthCellRendererParamsUndefined: Self = StObject.set(x, "fullWidthCellRendererParams", js.undefined)
      
      inline def setFullWidthCellRendererUndefined: Self = StObject.set(x, "fullWidthCellRenderer", js.undefined)
      
      inline def setFunctionsPassive(value: Boolean): Self = StObject.set(x, "functionsPassive", value.asInstanceOf[js.Any])
      
      inline def setFunctionsPassiveUndefined: Self = StObject.set(x, "functionsPassive", js.undefined)
      
      inline def setFunctionsReadOnly(value: Boolean): Self = StObject.set(x, "functionsReadOnly", value.asInstanceOf[js.Any])
      
      inline def setFunctionsReadOnlyUndefined: Self = StObject.set(x, "functionsReadOnly", js.undefined)
      
      inline def setGetBusinessKeyForNode(value: /* node */ RowNode => String): Self = StObject.set(x, "getBusinessKeyForNode", js.Any.fromFunction1(value))
      
      inline def setGetBusinessKeyForNodeUndefined: Self = StObject.set(x, "getBusinessKeyForNode", js.undefined)
      
      inline def setGetChildCount(value: /* dataItem */ js.Any => Double): Self = StObject.set(x, "getChildCount", js.Any.fromFunction1(value))
      
      inline def setGetChildCountUndefined: Self = StObject.set(x, "getChildCount", js.undefined)
      
      inline def setGetContextMenuItems(value: /* params */ GetContextMenuItemsParams => js.Array[String | MenuItemDef]): Self = StObject.set(x, "getContextMenuItems", js.Any.fromFunction1(value))
      
      inline def setGetContextMenuItemsUndefined: Self = StObject.set(x, "getContextMenuItems", js.undefined)
      
      inline def setGetDataPath(value: /* data */ js.Any => js.Array[String]): Self = StObject.set(x, "getDataPath", js.Any.fromFunction1(value))
      
      inline def setGetDataPathUndefined: Self = StObject.set(x, "getDataPath", js.undefined)
      
      inline def setGetDocument(value: () => Document): Self = StObject.set(x, "getDocument", js.Any.fromFunction0(value))
      
      inline def setGetDocumentUndefined: Self = StObject.set(x, "getDocument", js.undefined)
      
      inline def setGetMainMenuItems(value: /* params */ GetMainMenuItemsParams => js.Array[String | MenuItemDef]): Self = StObject.set(x, "getMainMenuItems", js.Any.fromFunction1(value))
      
      inline def setGetMainMenuItemsUndefined: Self = StObject.set(x, "getMainMenuItems", js.undefined)
      
      inline def setGetNodeChildDetails(value: /* dataItem */ js.Any => NodeChildDetails): Self = StObject.set(x, "getNodeChildDetails", js.Any.fromFunction1(value))
      
      inline def setGetNodeChildDetailsUndefined: Self = StObject.set(x, "getNodeChildDetails", js.undefined)
      
      inline def setGetRowClass(value: /* params */ js.Any => String | js.Array[String]): Self = StObject.set(x, "getRowClass", js.Any.fromFunction1(value))
      
      inline def setGetRowClassUndefined: Self = StObject.set(x, "getRowClass", js.undefined)
      
      inline def setGetRowHeight(value: js.Function): Self = StObject.set(x, "getRowHeight", value.asInstanceOf[js.Any])
      
      inline def setGetRowHeightUndefined: Self = StObject.set(x, "getRowHeight", js.undefined)
      
      inline def setGetRowNodeId(value: /* data */ js.Any => String): Self = StObject.set(x, "getRowNodeId", js.Any.fromFunction1(value))
      
      inline def setGetRowNodeIdUndefined: Self = StObject.set(x, "getRowNodeId", js.undefined)
      
      inline def setGetRowStyle(value: js.Function): Self = StObject.set(x, "getRowStyle", value.asInstanceOf[js.Any])
      
      inline def setGetRowStyleUndefined: Self = StObject.set(x, "getRowStyle", js.undefined)
      
      inline def setGridAutoHeight(value: Boolean): Self = StObject.set(x, "gridAutoHeight", value.asInstanceOf[js.Any])
      
      inline def setGridAutoHeightUndefined: Self = StObject.set(x, "gridAutoHeight", js.undefined)
      
      inline def setGroupColumnDef(value: ColDef): Self = StObject.set(x, "groupColumnDef", value.asInstanceOf[js.Any])
      
      inline def setGroupColumnDefUndefined: Self = StObject.set(x, "groupColumnDef", js.undefined)
      
      inline def setGroupDefaultExpanded(value: Double): Self = StObject.set(x, "groupDefaultExpanded", value.asInstanceOf[js.Any])
      
      inline def setGroupDefaultExpandedUndefined: Self = StObject.set(x, "groupDefaultExpanded", js.undefined)
      
      inline def setGroupHeaderHeight(value: Double): Self = StObject.set(x, "groupHeaderHeight", value.asInstanceOf[js.Any])
      
      inline def setGroupHeaderHeightUndefined: Self = StObject.set(x, "groupHeaderHeight", js.undefined)
      
      inline def setGroupHideOpenParents(value: Boolean): Self = StObject.set(x, "groupHideOpenParents", value.asInstanceOf[js.Any])
      
      inline def setGroupHideOpenParentsUndefined: Self = StObject.set(x, "groupHideOpenParents", js.undefined)
      
      inline def setGroupIncludeFooter(value: Boolean): Self = StObject.set(x, "groupIncludeFooter", value.asInstanceOf[js.Any])
      
      inline def setGroupIncludeFooterUndefined: Self = StObject.set(x, "groupIncludeFooter", js.undefined)
      
      inline def setGroupIncludeTotalFooter(value: Boolean): Self = StObject.set(x, "groupIncludeTotalFooter", value.asInstanceOf[js.Any])
      
      inline def setGroupIncludeTotalFooterUndefined: Self = StObject.set(x, "groupIncludeTotalFooter", js.undefined)
      
      inline def setGroupMultiAutoColumn(value: Boolean): Self = StObject.set(x, "groupMultiAutoColumn", value.asInstanceOf[js.Any])
      
      inline def setGroupMultiAutoColumnUndefined: Self = StObject.set(x, "groupMultiAutoColumn", js.undefined)
      
      inline def setGroupRemoveLowestSingleChildren(value: Boolean): Self = StObject.set(x, "groupRemoveLowestSingleChildren", value.asInstanceOf[js.Any])
      
      inline def setGroupRemoveLowestSingleChildrenUndefined: Self = StObject.set(x, "groupRemoveLowestSingleChildren", js.undefined)
      
      inline def setGroupRemoveSingleChildren(value: Boolean): Self = StObject.set(x, "groupRemoveSingleChildren", value.asInstanceOf[js.Any])
      
      inline def setGroupRemoveSingleChildrenUndefined: Self = StObject.set(x, "groupRemoveSingleChildren", js.undefined)
      
      inline def setGroupRowAggNodes(value: /* nodes */ js.Array[RowNode] => js.Any): Self = StObject.set(x, "groupRowAggNodes", js.Any.fromFunction1(value))
      
      inline def setGroupRowAggNodesUndefined: Self = StObject.set(x, "groupRowAggNodes", js.undefined)
      
      inline def setGroupRowInnerRenderer(value: InstantiableICellRendererComp | ICellRendererFunc | String): Self = StObject.set(x, "groupRowInnerRenderer", value.asInstanceOf[js.Any])
      
      inline def setGroupRowInnerRendererFramework(value: js.Any): Self = StObject.set(x, "groupRowInnerRendererFramework", value.asInstanceOf[js.Any])
      
      inline def setGroupRowInnerRendererFrameworkUndefined: Self = StObject.set(x, "groupRowInnerRendererFramework", js.undefined)
      
      inline def setGroupRowInnerRendererFunction1(value: /* params */ js.Any => HTMLElement | String): Self = StObject.set(x, "groupRowInnerRenderer", js.Any.fromFunction1(value))
      
      inline def setGroupRowInnerRendererUndefined: Self = StObject.set(x, "groupRowInnerRenderer", js.undefined)
      
      inline def setGroupRowRenderer(value: InstantiableICellRendererComp | ICellRendererFunc | String): Self = StObject.set(x, "groupRowRenderer", value.asInstanceOf[js.Any])
      
      inline def setGroupRowRendererFramework(value: js.Any): Self = StObject.set(x, "groupRowRendererFramework", value.asInstanceOf[js.Any])
      
      inline def setGroupRowRendererFrameworkUndefined: Self = StObject.set(x, "groupRowRendererFramework", js.undefined)
      
      inline def setGroupRowRendererFunction1(value: /* params */ js.Any => HTMLElement | String): Self = StObject.set(x, "groupRowRenderer", js.Any.fromFunction1(value))
      
      inline def setGroupRowRendererParams(value: js.Any): Self = StObject.set(x, "groupRowRendererParams", value.asInstanceOf[js.Any])
      
      inline def setGroupRowRendererParamsUndefined: Self = StObject.set(x, "groupRowRendererParams", js.undefined)
      
      inline def setGroupRowRendererUndefined: Self = StObject.set(x, "groupRowRenderer", js.undefined)
      
      inline def setGroupSelectsChildren(value: Boolean): Self = StObject.set(x, "groupSelectsChildren", value.asInstanceOf[js.Any])
      
      inline def setGroupSelectsChildrenUndefined: Self = StObject.set(x, "groupSelectsChildren", js.undefined)
      
      inline def setGroupSelectsFiltered(value: Boolean): Self = StObject.set(x, "groupSelectsFiltered", value.asInstanceOf[js.Any])
      
      inline def setGroupSelectsFilteredUndefined: Self = StObject.set(x, "groupSelectsFiltered", js.undefined)
      
      inline def setGroupSuppressAutoColumn(value: Boolean): Self = StObject.set(x, "groupSuppressAutoColumn", value.asInstanceOf[js.Any])
      
      inline def setGroupSuppressAutoColumnUndefined: Self = StObject.set(x, "groupSuppressAutoColumn", js.undefined)
      
      inline def setGroupSuppressBlankHeader(value: Boolean): Self = StObject.set(x, "groupSuppressBlankHeader", value.asInstanceOf[js.Any])
      
      inline def setGroupSuppressBlankHeaderUndefined: Self = StObject.set(x, "groupSuppressBlankHeader", js.undefined)
      
      inline def setGroupSuppressRow(value: Boolean): Self = StObject.set(x, "groupSuppressRow", value.asInstanceOf[js.Any])
      
      inline def setGroupSuppressRowUndefined: Self = StObject.set(x, "groupSuppressRow", js.undefined)
      
      inline def setGroupUseEntireRow(value: Boolean): Self = StObject.set(x, "groupUseEntireRow", value.asInstanceOf[js.Any])
      
      inline def setGroupUseEntireRowUndefined: Self = StObject.set(x, "groupUseEntireRow", js.undefined)
      
      inline def setHeaderHeight(value: Double): Self = StObject.set(x, "headerHeight", value.asInstanceOf[js.Any])
      
      inline def setHeaderHeightUndefined: Self = StObject.set(x, "headerHeight", js.undefined)
      
      inline def setIcons(value: js.Any): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
      
      inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
      
      inline def setInfiniteInitialRowCount(value: Double): Self = StObject.set(x, "infiniteInitialRowCount", value.asInstanceOf[js.Any])
      
      inline def setInfiniteInitialRowCountUndefined: Self = StObject.set(x, "infiniteInitialRowCount", js.undefined)
      
      inline def setIsExternalFilterPresent(value: () => Boolean): Self = StObject.set(x, "isExternalFilterPresent", js.Any.fromFunction0(value))
      
      inline def setIsExternalFilterPresentUndefined: Self = StObject.set(x, "isExternalFilterPresent", js.undefined)
      
      inline def setIsFullWidthCell(value: /* rowNode */ RowNode => Boolean): Self = StObject.set(x, "isFullWidthCell", js.Any.fromFunction1(value))
      
      inline def setIsFullWidthCellUndefined: Self = StObject.set(x, "isFullWidthCell", js.undefined)
      
      inline def setIsRowMaster(value: /* dataItem */ js.Any => Boolean): Self = StObject.set(x, "isRowMaster", js.Any.fromFunction1(value))
      
      inline def setIsRowMasterUndefined: Self = StObject.set(x, "isRowMaster", js.undefined)
      
      inline def setIsRowSelectable(value: /* node */ RowNode => Boolean): Self = StObject.set(x, "isRowSelectable", js.Any.fromFunction1(value))
      
      inline def setIsRowSelectableUndefined: Self = StObject.set(x, "isRowSelectable", js.undefined)
      
      inline def setLoadingOverlayComponent(value: InstantiableILoadingOverlayComp | String): Self = StObject.set(x, "loadingOverlayComponent", value.asInstanceOf[js.Any])
      
      inline def setLoadingOverlayComponentFramework(value: js.Any): Self = StObject.set(x, "loadingOverlayComponentFramework", value.asInstanceOf[js.Any])
      
      inline def setLoadingOverlayComponentFrameworkUndefined: Self = StObject.set(x, "loadingOverlayComponentFramework", js.undefined)
      
      inline def setLoadingOverlayComponentUndefined: Self = StObject.set(x, "loadingOverlayComponent", js.undefined)
      
      inline def setLocaleText(value: js.Any): Self = StObject.set(x, "localeText", value.asInstanceOf[js.Any])
      
      inline def setLocaleTextFunc(value: js.Function): Self = StObject.set(x, "localeTextFunc", value.asInstanceOf[js.Any])
      
      inline def setLocaleTextFuncUndefined: Self = StObject.set(x, "localeTextFunc", js.undefined)
      
      inline def setLocaleTextUndefined: Self = StObject.set(x, "localeText", js.undefined)
      
      inline def setMasterDetail(value: Boolean): Self = StObject.set(x, "masterDetail", value.asInstanceOf[js.Any])
      
      inline def setMasterDetailUndefined: Self = StObject.set(x, "masterDetail", js.undefined)
      
      inline def setMaxBlocksInCache(value: Double): Self = StObject.set(x, "maxBlocksInCache", value.asInstanceOf[js.Any])
      
      inline def setMaxBlocksInCacheUndefined: Self = StObject.set(x, "maxBlocksInCache", js.undefined)
      
      inline def setMaxColWidth(value: Double): Self = StObject.set(x, "maxColWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxColWidthUndefined: Self = StObject.set(x, "maxColWidth", js.undefined)
      
      inline def setMaxConcurrentDatasourceRequests(value: Double): Self = StObject.set(x, "maxConcurrentDatasourceRequests", value.asInstanceOf[js.Any])
      
      inline def setMaxConcurrentDatasourceRequestsUndefined: Self = StObject.set(x, "maxConcurrentDatasourceRequests", js.undefined)
      
      inline def setMinColWidth(value: Double): Self = StObject.set(x, "minColWidth", value.asInstanceOf[js.Any])
      
      inline def setMinColWidthUndefined: Self = StObject.set(x, "minColWidth", js.undefined)
      
      inline def setMultiSortKey(value: String): Self = StObject.set(x, "multiSortKey", value.asInstanceOf[js.Any])
      
      inline def setMultiSortKeyUndefined: Self = StObject.set(x, "multiSortKey", js.undefined)
      
      inline def setNavigateToNextCell(value: /* params */ NavigateToNextCellParams => GridCellDef): Self = StObject.set(x, "navigateToNextCell", js.Any.fromFunction1(value))
      
      inline def setNavigateToNextCellUndefined: Self = StObject.set(x, "navigateToNextCell", js.undefined)
      
      inline def setNoRowsOverlayComponent(value: InstantiableINoRowsOverlayComp | String): Self = StObject.set(x, "noRowsOverlayComponent", value.asInstanceOf[js.Any])
      
      inline def setNoRowsOverlayComponentFramework(value: js.Any): Self = StObject.set(x, "noRowsOverlayComponentFramework", value.asInstanceOf[js.Any])
      
      inline def setNoRowsOverlayComponentFrameworkUndefined: Self = StObject.set(x, "noRowsOverlayComponentFramework", js.undefined)
      
      inline def setNoRowsOverlayComponentUndefined: Self = StObject.set(x, "noRowsOverlayComponent", js.undefined)
      
      inline def setOnBodyScroll(value: /* event */ BodyScrollEvent => Unit): Self = StObject.set(x, "onBodyScroll", js.Any.fromFunction1(value))
      
      inline def setOnBodyScrollUndefined: Self = StObject.set(x, "onBodyScroll", js.undefined)
      
      inline def setOnCellClicked(value: /* event */ CellClickedEvent => Unit): Self = StObject.set(x, "onCellClicked", js.Any.fromFunction1(value))
      
      inline def setOnCellClickedUndefined: Self = StObject.set(x, "onCellClicked", js.undefined)
      
      inline def setOnCellContextMenu(value: /* event */ CellContextMenuEvent => Unit): Self = StObject.set(x, "onCellContextMenu", js.Any.fromFunction1(value))
      
      inline def setOnCellContextMenuUndefined: Self = StObject.set(x, "onCellContextMenu", js.undefined)
      
      inline def setOnCellDoubleClicked(value: /* event */ CellDoubleClickedEvent => Unit): Self = StObject.set(x, "onCellDoubleClicked", js.Any.fromFunction1(value))
      
      inline def setOnCellDoubleClickedUndefined: Self = StObject.set(x, "onCellDoubleClicked", js.undefined)
      
      inline def setOnCellEditingStarted(value: /* event */ CellEditingStartedEvent => Unit): Self = StObject.set(x, "onCellEditingStarted", js.Any.fromFunction1(value))
      
      inline def setOnCellEditingStartedUndefined: Self = StObject.set(x, "onCellEditingStarted", js.undefined)
      
      inline def setOnCellEditingStopped(value: /* event */ CellEditingStoppedEvent => Unit): Self = StObject.set(x, "onCellEditingStopped", js.Any.fromFunction1(value))
      
      inline def setOnCellEditingStoppedUndefined: Self = StObject.set(x, "onCellEditingStopped", js.undefined)
      
      inline def setOnCellFocused(value: /* event */ CellFocusedEvent => Unit): Self = StObject.set(x, "onCellFocused", js.Any.fromFunction1(value))
      
      inline def setOnCellFocusedUndefined: Self = StObject.set(x, "onCellFocused", js.undefined)
      
      inline def setOnCellMouseDown(value: /* event */ CellMouseDownEvent => Unit): Self = StObject.set(x, "onCellMouseDown", js.Any.fromFunction1(value))
      
      inline def setOnCellMouseDownUndefined: Self = StObject.set(x, "onCellMouseDown", js.undefined)
      
      inline def setOnCellMouseOut(value: /* event */ CellMouseOutEvent => Unit): Self = StObject.set(x, "onCellMouseOut", js.Any.fromFunction1(value))
      
      inline def setOnCellMouseOutUndefined: Self = StObject.set(x, "onCellMouseOut", js.undefined)
      
      inline def setOnCellMouseOver(value: /* event */ CellMouseOverEvent => Unit): Self = StObject.set(x, "onCellMouseOver", js.Any.fromFunction1(value))
      
      inline def setOnCellMouseOverUndefined: Self = StObject.set(x, "onCellMouseOver", js.undefined)
      
      inline def setOnCellValueChanged(value: /* event */ CellValueChangedEvent => Unit): Self = StObject.set(x, "onCellValueChanged", js.Any.fromFunction1(value))
      
      inline def setOnCellValueChangedUndefined: Self = StObject.set(x, "onCellValueChanged", js.undefined)
      
      inline def setOnColumnAggFuncChangeRequest(value: /* event */ ColumnAggFuncChangeRequestEvent => Unit): Self = StObject.set(x, "onColumnAggFuncChangeRequest", js.Any.fromFunction1(value))
      
      inline def setOnColumnAggFuncChangeRequestUndefined: Self = StObject.set(x, "onColumnAggFuncChangeRequest", js.undefined)
      
      inline def setOnColumnEverythingChanged(value: /* event */ ColumnEverythingChangedEvent => Unit): Self = StObject.set(x, "onColumnEverythingChanged", js.Any.fromFunction1(value))
      
      inline def setOnColumnEverythingChangedUndefined: Self = StObject.set(x, "onColumnEverythingChanged", js.undefined)
      
      inline def setOnColumnGroupOpened(value: /* event */ ColumnGroupOpenedEvent => Unit): Self = StObject.set(x, "onColumnGroupOpened", js.Any.fromFunction1(value))
      
      inline def setOnColumnGroupOpenedUndefined: Self = StObject.set(x, "onColumnGroupOpened", js.undefined)
      
      inline def setOnColumnMoved(value: /* event */ ColumnMovedEvent => Unit): Self = StObject.set(x, "onColumnMoved", js.Any.fromFunction1(value))
      
      inline def setOnColumnMovedUndefined: Self = StObject.set(x, "onColumnMoved", js.undefined)
      
      inline def setOnColumnPinned(value: /* event */ ColumnPinnedEvent => Unit): Self = StObject.set(x, "onColumnPinned", js.Any.fromFunction1(value))
      
      inline def setOnColumnPinnedUndefined: Self = StObject.set(x, "onColumnPinned", js.undefined)
      
      inline def setOnColumnPivotChangeRequest(value: /* event */ ColumnPivotChangeRequestEvent => Unit): Self = StObject.set(x, "onColumnPivotChangeRequest", js.Any.fromFunction1(value))
      
      inline def setOnColumnPivotChangeRequestUndefined: Self = StObject.set(x, "onColumnPivotChangeRequest", js.undefined)
      
      inline def setOnColumnPivotChanged(value: /* event */ ColumnPivotChangedEvent => Unit): Self = StObject.set(x, "onColumnPivotChanged", js.Any.fromFunction1(value))
      
      inline def setOnColumnPivotChangedUndefined: Self = StObject.set(x, "onColumnPivotChanged", js.undefined)
      
      inline def setOnColumnPivotModeChanged(value: /* event */ ColumnPivotModeChangedEvent => Unit): Self = StObject.set(x, "onColumnPivotModeChanged", js.Any.fromFunction1(value))
      
      inline def setOnColumnPivotModeChangedUndefined: Self = StObject.set(x, "onColumnPivotModeChanged", js.undefined)
      
      inline def setOnColumnResized(value: /* event */ ColumnResizedEvent => Unit): Self = StObject.set(x, "onColumnResized", js.Any.fromFunction1(value))
      
      inline def setOnColumnResizedUndefined: Self = StObject.set(x, "onColumnResized", js.undefined)
      
      inline def setOnColumnRowGroupChangeRequest(value: /* event */ ColumnRowGroupChangeRequestEvent => Unit): Self = StObject.set(x, "onColumnRowGroupChangeRequest", js.Any.fromFunction1(value))
      
      inline def setOnColumnRowGroupChangeRequestUndefined: Self = StObject.set(x, "onColumnRowGroupChangeRequest", js.undefined)
      
      inline def setOnColumnRowGroupChanged(value: /* event */ ColumnRowGroupChangedEvent => Unit): Self = StObject.set(x, "onColumnRowGroupChanged", js.Any.fromFunction1(value))
      
      inline def setOnColumnRowGroupChangedUndefined: Self = StObject.set(x, "onColumnRowGroupChanged", js.undefined)
      
      inline def setOnColumnValueChangeRequest(value: /* event */ ColumnValueChangeRequestEvent => Unit): Self = StObject.set(x, "onColumnValueChangeRequest", js.Any.fromFunction1(value))
      
      inline def setOnColumnValueChangeRequestUndefined: Self = StObject.set(x, "onColumnValueChangeRequest", js.undefined)
      
      inline def setOnColumnValueChanged(value: /* event */ ColumnValueChangedEvent => Unit): Self = StObject.set(x, "onColumnValueChanged", js.Any.fromFunction1(value))
      
      inline def setOnColumnValueChangedUndefined: Self = StObject.set(x, "onColumnValueChanged", js.undefined)
      
      inline def setOnColumnVisible(value: /* event */ ColumnVisibleEvent => Unit): Self = StObject.set(x, "onColumnVisible", js.Any.fromFunction1(value))
      
      inline def setOnColumnVisibleUndefined: Self = StObject.set(x, "onColumnVisible", js.undefined)
      
      inline def setOnDisplayedColumnsChanged(value: /* event */ DisplayedColumnsChangedEvent => Unit): Self = StObject.set(x, "onDisplayedColumnsChanged", js.Any.fromFunction1(value))
      
      inline def setOnDisplayedColumnsChangedUndefined: Self = StObject.set(x, "onDisplayedColumnsChanged", js.undefined)
      
      inline def setOnDragStarted(value: /* event */ DragStartedEvent => Unit): Self = StObject.set(x, "onDragStarted", js.Any.fromFunction1(value))
      
      inline def setOnDragStartedUndefined: Self = StObject.set(x, "onDragStarted", js.undefined)
      
      inline def setOnDragStopped(value: /* event */ DragStoppedEvent => Unit): Self = StObject.set(x, "onDragStopped", js.Any.fromFunction1(value))
      
      inline def setOnDragStoppedUndefined: Self = StObject.set(x, "onDragStopped", js.undefined)
      
      inline def setOnFilterChanged(value: /* event */ FilterChangedEvent => Unit): Self = StObject.set(x, "onFilterChanged", js.Any.fromFunction1(value))
      
      inline def setOnFilterChangedUndefined: Self = StObject.set(x, "onFilterChanged", js.undefined)
      
      inline def setOnFilterModified(value: /* event */ FilterModifiedEvent => Unit): Self = StObject.set(x, "onFilterModified", js.Any.fromFunction1(value))
      
      inline def setOnFilterModifiedUndefined: Self = StObject.set(x, "onFilterModified", js.undefined)
      
      inline def setOnGridColumnsChanged(value: /* event */ GridColumnsChangedEvent => Unit): Self = StObject.set(x, "onGridColumnsChanged", js.Any.fromFunction1(value))
      
      inline def setOnGridColumnsChangedUndefined: Self = StObject.set(x, "onGridColumnsChanged", js.undefined)
      
      inline def setOnGridReady(value: /* event */ GridReadyEvent => Unit): Self = StObject.set(x, "onGridReady", js.Any.fromFunction1(value))
      
      inline def setOnGridReadyUndefined: Self = StObject.set(x, "onGridReady", js.undefined)
      
      inline def setOnGridSizeChanged(value: /* event */ js.Any => Unit): Self = StObject.set(x, "onGridSizeChanged", js.Any.fromFunction1(value))
      
      inline def setOnGridSizeChangedUndefined: Self = StObject.set(x, "onGridSizeChanged", js.undefined)
      
      inline def setOnModelUpdated(value: /* event */ ModelUpdatedEvent => Unit): Self = StObject.set(x, "onModelUpdated", js.Any.fromFunction1(value))
      
      inline def setOnModelUpdatedUndefined: Self = StObject.set(x, "onModelUpdated", js.undefined)
      
      inline def setOnNewColumnsLoaded(value: /* event */ NewColumnsLoadedEvent => Unit): Self = StObject.set(x, "onNewColumnsLoaded", js.Any.fromFunction1(value))
      
      inline def setOnNewColumnsLoadedUndefined: Self = StObject.set(x, "onNewColumnsLoaded", js.undefined)
      
      inline def setOnPaginationChanged(value: /* event */ PaginationChangedEvent => Unit): Self = StObject.set(x, "onPaginationChanged", js.Any.fromFunction1(value))
      
      inline def setOnPaginationChangedUndefined: Self = StObject.set(x, "onPaginationChanged", js.undefined)
      
      inline def setOnPasteEnd(value: /* event */ PasteEndEvent => Unit): Self = StObject.set(x, "onPasteEnd", js.Any.fromFunction1(value))
      
      inline def setOnPasteEndUndefined: Self = StObject.set(x, "onPasteEnd", js.undefined)
      
      inline def setOnPasteStart(value: /* event */ PasteStartEvent => Unit): Self = StObject.set(x, "onPasteStart", js.Any.fromFunction1(value))
      
      inline def setOnPasteStartUndefined: Self = StObject.set(x, "onPasteStart", js.undefined)
      
      inline def setOnPinnedRowDataChanged(value: /* event */ PinnedRowDataChangedEvent => Unit): Self = StObject.set(x, "onPinnedRowDataChanged", js.Any.fromFunction1(value))
      
      inline def setOnPinnedRowDataChangedUndefined: Self = StObject.set(x, "onPinnedRowDataChanged", js.undefined)
      
      inline def setOnRangeSelectionChanged(value: /* event */ RangeSelectionChangedEvent => Unit): Self = StObject.set(x, "onRangeSelectionChanged", js.Any.fromFunction1(value))
      
      inline def setOnRangeSelectionChangedUndefined: Self = StObject.set(x, "onRangeSelectionChanged", js.undefined)
      
      inline def setOnRowClicked(value: /* event */ RowClickedEvent => Unit): Self = StObject.set(x, "onRowClicked", js.Any.fromFunction1(value))
      
      inline def setOnRowClickedUndefined: Self = StObject.set(x, "onRowClicked", js.undefined)
      
      inline def setOnRowDataChanged(value: /* event */ RowDataChangedEvent => Unit): Self = StObject.set(x, "onRowDataChanged", js.Any.fromFunction1(value))
      
      inline def setOnRowDataChangedUndefined: Self = StObject.set(x, "onRowDataChanged", js.undefined)
      
      inline def setOnRowDataUpdated(value: /* event */ RowDataUpdatedEvent => Unit): Self = StObject.set(x, "onRowDataUpdated", js.Any.fromFunction1(value))
      
      inline def setOnRowDataUpdatedUndefined: Self = StObject.set(x, "onRowDataUpdated", js.undefined)
      
      inline def setOnRowDoubleClicked(value: /* event */ RowDoubleClickedEvent => Unit): Self = StObject.set(x, "onRowDoubleClicked", js.Any.fromFunction1(value))
      
      inline def setOnRowDoubleClickedUndefined: Self = StObject.set(x, "onRowDoubleClicked", js.undefined)
      
      inline def setOnRowDragEnd(value: /* event */ RowDragEvent => Unit): Self = StObject.set(x, "onRowDragEnd", js.Any.fromFunction1(value))
      
      inline def setOnRowDragEndUndefined: Self = StObject.set(x, "onRowDragEnd", js.undefined)
      
      inline def setOnRowDragEnter(value: /* event */ RowDragEvent => Unit): Self = StObject.set(x, "onRowDragEnter", js.Any.fromFunction1(value))
      
      inline def setOnRowDragEnterUndefined: Self = StObject.set(x, "onRowDragEnter", js.undefined)
      
      inline def setOnRowDragLeave(value: /* event */ RowDragEvent => Unit): Self = StObject.set(x, "onRowDragLeave", js.Any.fromFunction1(value))
      
      inline def setOnRowDragLeaveUndefined: Self = StObject.set(x, "onRowDragLeave", js.undefined)
      
      inline def setOnRowDragMove(value: /* event */ RowDragEvent => Unit): Self = StObject.set(x, "onRowDragMove", js.Any.fromFunction1(value))
      
      inline def setOnRowDragMoveUndefined: Self = StObject.set(x, "onRowDragMove", js.undefined)
      
      inline def setOnRowEditingStarted(value: /* event */ RowEditingStartedEvent => Unit): Self = StObject.set(x, "onRowEditingStarted", js.Any.fromFunction1(value))
      
      inline def setOnRowEditingStartedUndefined: Self = StObject.set(x, "onRowEditingStarted", js.undefined)
      
      inline def setOnRowEditingStopped(value: /* event */ RowEditingStoppedEvent => Unit): Self = StObject.set(x, "onRowEditingStopped", js.Any.fromFunction1(value))
      
      inline def setOnRowEditingStoppedUndefined: Self = StObject.set(x, "onRowEditingStopped", js.undefined)
      
      inline def setOnRowGroupOpened(value: /* event */ RowGroupOpenedEvent => Unit): Self = StObject.set(x, "onRowGroupOpened", js.Any.fromFunction1(value))
      
      inline def setOnRowGroupOpenedUndefined: Self = StObject.set(x, "onRowGroupOpened", js.undefined)
      
      inline def setOnRowSelected(value: /* event */ RowSelectedEvent => Unit): Self = StObject.set(x, "onRowSelected", js.Any.fromFunction1(value))
      
      inline def setOnRowSelectedUndefined: Self = StObject.set(x, "onRowSelected", js.undefined)
      
      inline def setOnRowValueChanged(value: /* event */ RowValueChangedEvent => Unit): Self = StObject.set(x, "onRowValueChanged", js.Any.fromFunction1(value))
      
      inline def setOnRowValueChangedUndefined: Self = StObject.set(x, "onRowValueChanged", js.undefined)
      
      inline def setOnSelectionChanged(value: /* event */ SelectionChangedEvent => Unit): Self = StObject.set(x, "onSelectionChanged", js.Any.fromFunction1(value))
      
      inline def setOnSelectionChangedUndefined: Self = StObject.set(x, "onSelectionChanged", js.undefined)
      
      inline def setOnSortChanged(value: /* event */ SortChangedEvent => Unit): Self = StObject.set(x, "onSortChanged", js.Any.fromFunction1(value))
      
      inline def setOnSortChangedUndefined: Self = StObject.set(x, "onSortChanged", js.undefined)
      
      inline def setOnViewportChanged(value: /* event */ ViewportChangedEvent => Unit): Self = StObject.set(x, "onViewportChanged", js.Any.fromFunction1(value))
      
      inline def setOnViewportChangedUndefined: Self = StObject.set(x, "onViewportChanged", js.undefined)
      
      inline def setOnVirtualColumnsChanged(value: /* event */ VirtualColumnsChangedEvent => Unit): Self = StObject.set(x, "onVirtualColumnsChanged", js.Any.fromFunction1(value))
      
      inline def setOnVirtualColumnsChangedUndefined: Self = StObject.set(x, "onVirtualColumnsChanged", js.undefined)
      
      inline def setOnVirtualRowRemoved(value: /* event */ VirtualRowRemovedEvent => Unit): Self = StObject.set(x, "onVirtualRowRemoved", js.Any.fromFunction1(value))
      
      inline def setOnVirtualRowRemovedUndefined: Self = StObject.set(x, "onVirtualRowRemoved", js.undefined)
      
      inline def setOverlayLoadingTemplate(value: String): Self = StObject.set(x, "overlayLoadingTemplate", value.asInstanceOf[js.Any])
      
      inline def setOverlayLoadingTemplateUndefined: Self = StObject.set(x, "overlayLoadingTemplate", js.undefined)
      
      inline def setOverlayNoRowsTemplate(value: String): Self = StObject.set(x, "overlayNoRowsTemplate", value.asInstanceOf[js.Any])
      
      inline def setOverlayNoRowsTemplateUndefined: Self = StObject.set(x, "overlayNoRowsTemplate", js.undefined)
      
      inline def setPagination(value: Boolean): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
      
      inline def setPaginationAutoPageSize(value: Boolean): Self = StObject.set(x, "paginationAutoPageSize", value.asInstanceOf[js.Any])
      
      inline def setPaginationAutoPageSizeUndefined: Self = StObject.set(x, "paginationAutoPageSize", js.undefined)
      
      inline def setPaginationNumberFormatter(value: /* params */ PaginationNumberFormatterParams => String): Self = StObject.set(x, "paginationNumberFormatter", js.Any.fromFunction1(value))
      
      inline def setPaginationNumberFormatterUndefined: Self = StObject.set(x, "paginationNumberFormatter", js.undefined)
      
      inline def setPaginationPageSize(value: Double): Self = StObject.set(x, "paginationPageSize", value.asInstanceOf[js.Any])
      
      inline def setPaginationPageSizeUndefined: Self = StObject.set(x, "paginationPageSize", js.undefined)
      
      inline def setPaginationStartPage(value: Double): Self = StObject.set(x, "paginationStartPage", value.asInstanceOf[js.Any])
      
      inline def setPaginationStartPageUndefined: Self = StObject.set(x, "paginationStartPage", js.undefined)
      
      inline def setPaginationUndefined: Self = StObject.set(x, "pagination", js.undefined)
      
      inline def setPinnedBottomRowData(value: js.Array[js.Any]): Self = StObject.set(x, "pinnedBottomRowData", value.asInstanceOf[js.Any])
      
      inline def setPinnedBottomRowDataUndefined: Self = StObject.set(x, "pinnedBottomRowData", js.undefined)
      
      inline def setPinnedBottomRowDataVarargs(value: js.Any*): Self = StObject.set(x, "pinnedBottomRowData", js.Array(value :_*))
      
      inline def setPinnedTopRowData(value: js.Array[js.Any]): Self = StObject.set(x, "pinnedTopRowData", value.asInstanceOf[js.Any])
      
      inline def setPinnedTopRowDataUndefined: Self = StObject.set(x, "pinnedTopRowData", js.undefined)
      
      inline def setPinnedTopRowDataVarargs(value: js.Any*): Self = StObject.set(x, "pinnedTopRowData", js.Array(value :_*))
      
      inline def setPivotColumnGroupTotals(value: String): Self = StObject.set(x, "pivotColumnGroupTotals", value.asInstanceOf[js.Any])
      
      inline def setPivotColumnGroupTotalsUndefined: Self = StObject.set(x, "pivotColumnGroupTotals", js.undefined)
      
      inline def setPivotGroupHeaderHeight(value: Double): Self = StObject.set(x, "pivotGroupHeaderHeight", value.asInstanceOf[js.Any])
      
      inline def setPivotGroupHeaderHeightUndefined: Self = StObject.set(x, "pivotGroupHeaderHeight", js.undefined)
      
      inline def setPivotHeaderHeight(value: Double): Self = StObject.set(x, "pivotHeaderHeight", value.asInstanceOf[js.Any])
      
      inline def setPivotHeaderHeightUndefined: Self = StObject.set(x, "pivotHeaderHeight", js.undefined)
      
      inline def setPivotMode(value: Boolean): Self = StObject.set(x, "pivotMode", value.asInstanceOf[js.Any])
      
      inline def setPivotModeUndefined: Self = StObject.set(x, "pivotMode", js.undefined)
      
      inline def setPivotPanelShow(value: String): Self = StObject.set(x, "pivotPanelShow", value.asInstanceOf[js.Any])
      
      inline def setPivotPanelShowUndefined: Self = StObject.set(x, "pivotPanelShow", js.undefined)
      
      inline def setPivotRowTotals(value: String): Self = StObject.set(x, "pivotRowTotals", value.asInstanceOf[js.Any])
      
      inline def setPivotRowTotalsUndefined: Self = StObject.set(x, "pivotRowTotals", js.undefined)
      
      inline def setPivotTotals(value: Boolean): Self = StObject.set(x, "pivotTotals", value.asInstanceOf[js.Any])
      
      inline def setPivotTotalsUndefined: Self = StObject.set(x, "pivotTotals", js.undefined)
      
      inline def setPopupParent(value: HTMLElement): Self = StObject.set(x, "popupParent", value.asInstanceOf[js.Any])
      
      inline def setPopupParentUndefined: Self = StObject.set(x, "popupParent", js.undefined)
      
      inline def setPostProcessPopup(value: /* params */ PostProcessPopupParams => Unit): Self = StObject.set(x, "postProcessPopup", js.Any.fromFunction1(value))
      
      inline def setPostProcessPopupUndefined: Self = StObject.set(x, "postProcessPopup", js.undefined)
      
      inline def setPostSort(value: /* nodes */ js.Array[RowNode] => Unit): Self = StObject.set(x, "postSort", js.Any.fromFunction1(value))
      
      inline def setPostSortUndefined: Self = StObject.set(x, "postSort", js.undefined)
      
      inline def setProcessCellForClipboard(value: /* params */ ProcessCellForExportParams => js.Any): Self = StObject.set(x, "processCellForClipboard", js.Any.fromFunction1(value))
      
      inline def setProcessCellForClipboardUndefined: Self = StObject.set(x, "processCellForClipboard", js.undefined)
      
      inline def setProcessCellFromClipboard(value: /* params */ ProcessCellForExportParams => js.Any): Self = StObject.set(x, "processCellFromClipboard", js.Any.fromFunction1(value))
      
      inline def setProcessCellFromClipboardUndefined: Self = StObject.set(x, "processCellFromClipboard", js.undefined)
      
      inline def setProcessDataFromClipboard(value: /* params */ ProcessDataFromClipboardParams => js.Array[js.Array[String]]): Self = StObject.set(x, "processDataFromClipboard", js.Any.fromFunction1(value))
      
      inline def setProcessDataFromClipboardUndefined: Self = StObject.set(x, "processDataFromClipboard", js.undefined)
      
      inline def setProcessHeaderForClipboard(value: /* params */ ProcessHeaderForExportParams => js.Any): Self = StObject.set(x, "processHeaderForClipboard", js.Any.fromFunction1(value))
      
      inline def setProcessHeaderForClipboardUndefined: Self = StObject.set(x, "processHeaderForClipboard", js.undefined)
      
      inline def setProcessRowPostCreate(value: /* params */ ProcessRowParams => Unit): Self = StObject.set(x, "processRowPostCreate", js.Any.fromFunction1(value))
      
      inline def setProcessRowPostCreateUndefined: Self = StObject.set(x, "processRowPostCreate", js.undefined)
      
      inline def setProcessSecondaryColDef(value: /* colDef */ ColDef => Unit): Self = StObject.set(x, "processSecondaryColDef", js.Any.fromFunction1(value))
      
      inline def setProcessSecondaryColDefUndefined: Self = StObject.set(x, "processSecondaryColDef", js.undefined)
      
      inline def setProcessSecondaryColGroupDef(value: /* colGroupDef */ ColGroupDef => Unit): Self = StObject.set(x, "processSecondaryColGroupDef", js.Any.fromFunction1(value))
      
      inline def setProcessSecondaryColGroupDefUndefined: Self = StObject.set(x, "processSecondaryColGroupDef", js.undefined)
      
      inline def setPurgeClosedRowNodes(value: Boolean): Self = StObject.set(x, "purgeClosedRowNodes", value.asInstanceOf[js.Any])
      
      inline def setPurgeClosedRowNodesUndefined: Self = StObject.set(x, "purgeClosedRowNodes", js.undefined)
      
      inline def setQuickFilterText(value: String): Self = StObject.set(x, "quickFilterText", value.asInstanceOf[js.Any])
      
      inline def setQuickFilterTextUndefined: Self = StObject.set(x, "quickFilterText", js.undefined)
      
      inline def setRememberGroupStateWhenNewData(value: Boolean): Self = StObject.set(x, "rememberGroupStateWhenNewData", value.asInstanceOf[js.Any])
      
      inline def setRememberGroupStateWhenNewDataUndefined: Self = StObject.set(x, "rememberGroupStateWhenNewData", js.undefined)
      
      inline def setRowBuffer(value: Double): Self = StObject.set(x, "rowBuffer", value.asInstanceOf[js.Any])
      
      inline def setRowBufferUndefined: Self = StObject.set(x, "rowBuffer", js.undefined)
      
      inline def setRowClass(value: String | js.Array[String]): Self = StObject.set(x, "rowClass", value.asInstanceOf[js.Any])
      
      inline def setRowClassRules(value: StringDictionary[js.Function | String]): Self = StObject.set(x, "rowClassRules", value.asInstanceOf[js.Any])
      
      inline def setRowClassRulesUndefined: Self = StObject.set(x, "rowClassRules", js.undefined)
      
      inline def setRowClassUndefined: Self = StObject.set(x, "rowClass", js.undefined)
      
      inline def setRowClassVarargs(value: String*): Self = StObject.set(x, "rowClass", js.Array(value :_*))
      
      inline def setRowData(value: js.Array[js.Any]): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
      
      inline def setRowDataUndefined: Self = StObject.set(x, "rowData", js.undefined)
      
      inline def setRowDataVarargs(value: js.Any*): Self = StObject.set(x, "rowData", js.Array(value :_*))
      
      inline def setRowDeselection(value: Boolean): Self = StObject.set(x, "rowDeselection", value.asInstanceOf[js.Any])
      
      inline def setRowDeselectionUndefined: Self = StObject.set(x, "rowDeselection", js.undefined)
      
      inline def setRowDragManaged(value: Boolean): Self = StObject.set(x, "rowDragManaged", value.asInstanceOf[js.Any])
      
      inline def setRowDragManagedUndefined: Self = StObject.set(x, "rowDragManaged", js.undefined)
      
      inline def setRowGroupPanelShow(value: String): Self = StObject.set(x, "rowGroupPanelShow", value.asInstanceOf[js.Any])
      
      inline def setRowGroupPanelShowUndefined: Self = StObject.set(x, "rowGroupPanelShow", js.undefined)
      
      inline def setRowHeight(value: Double): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
      
      inline def setRowHeightUndefined: Self = StObject.set(x, "rowHeight", js.undefined)
      
      inline def setRowModelType(value: String): Self = StObject.set(x, "rowModelType", value.asInstanceOf[js.Any])
      
      inline def setRowModelTypeUndefined: Self = StObject.set(x, "rowModelType", js.undefined)
      
      inline def setRowMultiSelectWithClick(value: Boolean): Self = StObject.set(x, "rowMultiSelectWithClick", value.asInstanceOf[js.Any])
      
      inline def setRowMultiSelectWithClickUndefined: Self = StObject.set(x, "rowMultiSelectWithClick", js.undefined)
      
      inline def setRowSelection(value: String): Self = StObject.set(x, "rowSelection", value.asInstanceOf[js.Any])
      
      inline def setRowSelectionUndefined: Self = StObject.set(x, "rowSelection", js.undefined)
      
      inline def setRowStyle(value: js.Any): Self = StObject.set(x, "rowStyle", value.asInstanceOf[js.Any])
      
      inline def setRowStyleUndefined: Self = StObject.set(x, "rowStyle", js.undefined)
      
      inline def setScrollbarWidth(value: Double): Self = StObject.set(x, "scrollbarWidth", value.asInstanceOf[js.Any])
      
      inline def setScrollbarWidthUndefined: Self = StObject.set(x, "scrollbarWidth", js.undefined)
      
      inline def setSendToClipboard(value: /* params */ js.Any => Unit): Self = StObject.set(x, "sendToClipboard", js.Any.fromFunction1(value))
      
      inline def setSendToClipboardUndefined: Self = StObject.set(x, "sendToClipboard", js.undefined)
      
      inline def setServerSideDatasource(value: IServerSideDatasource): Self = StObject.set(x, "serverSideDatasource", value.asInstanceOf[js.Any])
      
      inline def setServerSideDatasourceUndefined: Self = StObject.set(x, "serverSideDatasource", js.undefined)
      
      inline def setServerSideSortingAlwaysResets(value: Boolean): Self = StObject.set(x, "serverSideSortingAlwaysResets", value.asInstanceOf[js.Any])
      
      inline def setServerSideSortingAlwaysResetsUndefined: Self = StObject.set(x, "serverSideSortingAlwaysResets", js.undefined)
      
      inline def setShowToolPanel(value: Boolean): Self = StObject.set(x, "showToolPanel", value.asInstanceOf[js.Any])
      
      inline def setShowToolPanelUndefined: Self = StObject.set(x, "showToolPanel", js.undefined)
      
      inline def setSingleClickEdit(value: Boolean): Self = StObject.set(x, "singleClickEdit", value.asInstanceOf[js.Any])
      
      inline def setSingleClickEditUndefined: Self = StObject.set(x, "singleClickEdit", js.undefined)
      
      inline def setSlaveGrids(value: js.Array[GridOptions]): Self = StObject.set(x, "slaveGrids", value.asInstanceOf[js.Any])
      
      inline def setSlaveGridsUndefined: Self = StObject.set(x, "slaveGrids", js.undefined)
      
      inline def setSlaveGridsVarargs(value: GridOptions*): Self = StObject.set(x, "slaveGrids", js.Array(value :_*))
      
      inline def setSortingOrder(value: js.Array[String]): Self = StObject.set(x, "sortingOrder", value.asInstanceOf[js.Any])
      
      inline def setSortingOrderUndefined: Self = StObject.set(x, "sortingOrder", js.undefined)
      
      inline def setSortingOrderVarargs(value: String*): Self = StObject.set(x, "sortingOrder", js.Array(value :_*))
      
      inline def setStopEditingWhenGridLosesFocus(value: Boolean): Self = StObject.set(x, "stopEditingWhenGridLosesFocus", value.asInstanceOf[js.Any])
      
      inline def setStopEditingWhenGridLosesFocusUndefined: Self = StObject.set(x, "stopEditingWhenGridLosesFocus", js.undefined)
      
      inline def setSuppressAggAtRootLevel(value: Boolean): Self = StObject.set(x, "suppressAggAtRootLevel", value.asInstanceOf[js.Any])
      
      inline def setSuppressAggAtRootLevelUndefined: Self = StObject.set(x, "suppressAggAtRootLevel", js.undefined)
      
      inline def setSuppressAggFuncInHeader(value: Boolean): Self = StObject.set(x, "suppressAggFuncInHeader", value.asInstanceOf[js.Any])
      
      inline def setSuppressAggFuncInHeaderUndefined: Self = StObject.set(x, "suppressAggFuncInHeader", js.undefined)
      
      inline def setSuppressAnimationFrame(value: Boolean): Self = StObject.set(x, "suppressAnimationFrame", value.asInstanceOf[js.Any])
      
      inline def setSuppressAnimationFrameUndefined: Self = StObject.set(x, "suppressAnimationFrame", js.undefined)
      
      inline def setSuppressAsyncEvents(value: Boolean): Self = StObject.set(x, "suppressAsyncEvents", value.asInstanceOf[js.Any])
      
      inline def setSuppressAsyncEventsUndefined: Self = StObject.set(x, "suppressAsyncEvents", js.undefined)
      
      inline def setSuppressAutoSize(value: Boolean): Self = StObject.set(x, "suppressAutoSize", value.asInstanceOf[js.Any])
      
      inline def setSuppressAutoSizeUndefined: Self = StObject.set(x, "suppressAutoSize", js.undefined)
      
      inline def setSuppressCellSelection(value: Boolean): Self = StObject.set(x, "suppressCellSelection", value.asInstanceOf[js.Any])
      
      inline def setSuppressCellSelectionUndefined: Self = StObject.set(x, "suppressCellSelection", js.undefined)
      
      inline def setSuppressChangeDetection(value: Boolean): Self = StObject.set(x, "suppressChangeDetection", value.asInstanceOf[js.Any])
      
      inline def setSuppressChangeDetectionUndefined: Self = StObject.set(x, "suppressChangeDetection", js.undefined)
      
      inline def setSuppressClickEdit(value: Boolean): Self = StObject.set(x, "suppressClickEdit", value.asInstanceOf[js.Any])
      
      inline def setSuppressClickEditUndefined: Self = StObject.set(x, "suppressClickEdit", js.undefined)
      
      inline def setSuppressClipboardPaste(value: Boolean): Self = StObject.set(x, "suppressClipboardPaste", value.asInstanceOf[js.Any])
      
      inline def setSuppressClipboardPasteUndefined: Self = StObject.set(x, "suppressClipboardPaste", js.undefined)
      
      inline def setSuppressColumnMoveAnimation(value: Boolean): Self = StObject.set(x, "suppressColumnMoveAnimation", value.asInstanceOf[js.Any])
      
      inline def setSuppressColumnMoveAnimationUndefined: Self = StObject.set(x, "suppressColumnMoveAnimation", js.undefined)
      
      inline def setSuppressColumnVirtualisation(value: Boolean): Self = StObject.set(x, "suppressColumnVirtualisation", value.asInstanceOf[js.Any])
      
      inline def setSuppressColumnVirtualisationUndefined: Self = StObject.set(x, "suppressColumnVirtualisation", js.undefined)
      
      inline def setSuppressContextMenu(value: Boolean): Self = StObject.set(x, "suppressContextMenu", value.asInstanceOf[js.Any])
      
      inline def setSuppressContextMenuUndefined: Self = StObject.set(x, "suppressContextMenu", js.undefined)
      
      inline def setSuppressCopyRowsToClipboard(value: Boolean): Self = StObject.set(x, "suppressCopyRowsToClipboard", value.asInstanceOf[js.Any])
      
      inline def setSuppressCopyRowsToClipboardUndefined: Self = StObject.set(x, "suppressCopyRowsToClipboard", js.undefined)
      
      inline def setSuppressCsvExport(value: Boolean): Self = StObject.set(x, "suppressCsvExport", value.asInstanceOf[js.Any])
      
      inline def setSuppressCsvExportUndefined: Self = StObject.set(x, "suppressCsvExport", js.undefined)
      
      inline def setSuppressDragLeaveHidesColumns(value: Boolean): Self = StObject.set(x, "suppressDragLeaveHidesColumns", value.asInstanceOf[js.Any])
      
      inline def setSuppressDragLeaveHidesColumnsUndefined: Self = StObject.set(x, "suppressDragLeaveHidesColumns", js.undefined)
      
      inline def setSuppressEnterpriseResetOnNewColumns(value: Boolean): Self = StObject.set(x, "suppressEnterpriseResetOnNewColumns", value.asInstanceOf[js.Any])
      
      inline def setSuppressEnterpriseResetOnNewColumnsUndefined: Self = StObject.set(x, "suppressEnterpriseResetOnNewColumns", js.undefined)
      
      inline def setSuppressExcelExport(value: Boolean): Self = StObject.set(x, "suppressExcelExport", value.asInstanceOf[js.Any])
      
      inline def setSuppressExcelExportUndefined: Self = StObject.set(x, "suppressExcelExport", js.undefined)
      
      inline def setSuppressFieldDotNotation(value: Boolean): Self = StObject.set(x, "suppressFieldDotNotation", value.asInstanceOf[js.Any])
      
      inline def setSuppressFieldDotNotationUndefined: Self = StObject.set(x, "suppressFieldDotNotation", js.undefined)
      
      inline def setSuppressFocusAfterRefresh(value: Boolean): Self = StObject.set(x, "suppressFocusAfterRefresh", value.asInstanceOf[js.Any])
      
      inline def setSuppressFocusAfterRefreshUndefined: Self = StObject.set(x, "suppressFocusAfterRefresh", js.undefined)
      
      inline def setSuppressHorizontalScroll(value: Boolean): Self = StObject.set(x, "suppressHorizontalScroll", value.asInstanceOf[js.Any])
      
      inline def setSuppressHorizontalScrollUndefined: Self = StObject.set(x, "suppressHorizontalScroll", js.undefined)
      
      inline def setSuppressLoadingOverlay(value: Boolean): Self = StObject.set(x, "suppressLoadingOverlay", value.asInstanceOf[js.Any])
      
      inline def setSuppressLoadingOverlayUndefined: Self = StObject.set(x, "suppressLoadingOverlay", js.undefined)
      
      inline def setSuppressMakeColumnVisibleAfterUnGroup(value: Boolean): Self = StObject.set(x, "suppressMakeColumnVisibleAfterUnGroup", value.asInstanceOf[js.Any])
      
      inline def setSuppressMakeColumnVisibleAfterUnGroupUndefined: Self = StObject.set(x, "suppressMakeColumnVisibleAfterUnGroup", js.undefined)
      
      inline def setSuppressMenuHide(value: Boolean): Self = StObject.set(x, "suppressMenuHide", value.asInstanceOf[js.Any])
      
      inline def setSuppressMenuHideUndefined: Self = StObject.set(x, "suppressMenuHide", js.undefined)
      
      inline def setSuppressMiddleClickScrolls(value: Boolean): Self = StObject.set(x, "suppressMiddleClickScrolls", value.asInstanceOf[js.Any])
      
      inline def setSuppressMiddleClickScrollsUndefined: Self = StObject.set(x, "suppressMiddleClickScrolls", js.undefined)
      
      inline def setSuppressMovableColumns(value: Boolean): Self = StObject.set(x, "suppressMovableColumns", value.asInstanceOf[js.Any])
      
      inline def setSuppressMovableColumnsUndefined: Self = StObject.set(x, "suppressMovableColumns", js.undefined)
      
      inline def setSuppressMultiRangeSelection(value: Boolean): Self = StObject.set(x, "suppressMultiRangeSelection", value.asInstanceOf[js.Any])
      
      inline def setSuppressMultiRangeSelectionUndefined: Self = StObject.set(x, "suppressMultiRangeSelection", js.undefined)
      
      inline def setSuppressMultiSort(value: Boolean): Self = StObject.set(x, "suppressMultiSort", value.asInstanceOf[js.Any])
      
      inline def setSuppressMultiSortUndefined: Self = StObject.set(x, "suppressMultiSort", js.undefined)
      
      inline def setSuppressNoRowsOverlay(value: Boolean): Self = StObject.set(x, "suppressNoRowsOverlay", value.asInstanceOf[js.Any])
      
      inline def setSuppressNoRowsOverlayUndefined: Self = StObject.set(x, "suppressNoRowsOverlay", js.undefined)
      
      inline def setSuppressPaginationPanel(value: Boolean): Self = StObject.set(x, "suppressPaginationPanel", value.asInstanceOf[js.Any])
      
      inline def setSuppressPaginationPanelUndefined: Self = StObject.set(x, "suppressPaginationPanel", js.undefined)
      
      inline def setSuppressParentsInRowNodes(value: Boolean): Self = StObject.set(x, "suppressParentsInRowNodes", value.asInstanceOf[js.Any])
      
      inline def setSuppressParentsInRowNodesUndefined: Self = StObject.set(x, "suppressParentsInRowNodes", js.undefined)
      
      inline def setSuppressPreventDefaultOnMouseWheel(value: Boolean): Self = StObject.set(x, "suppressPreventDefaultOnMouseWheel", value.asInstanceOf[js.Any])
      
      inline def setSuppressPreventDefaultOnMouseWheelUndefined: Self = StObject.set(x, "suppressPreventDefaultOnMouseWheel", js.undefined)
      
      inline def setSuppressPropertyNamesCheck(value: Boolean): Self = StObject.set(x, "suppressPropertyNamesCheck", value.asInstanceOf[js.Any])
      
      inline def setSuppressPropertyNamesCheckUndefined: Self = StObject.set(x, "suppressPropertyNamesCheck", js.undefined)
      
      inline def setSuppressRowClickSelection(value: Boolean): Self = StObject.set(x, "suppressRowClickSelection", value.asInstanceOf[js.Any])
      
      inline def setSuppressRowClickSelectionUndefined: Self = StObject.set(x, "suppressRowClickSelection", js.undefined)
      
      inline def setSuppressRowDrag(value: Boolean): Self = StObject.set(x, "suppressRowDrag", value.asInstanceOf[js.Any])
      
      inline def setSuppressRowDragUndefined: Self = StObject.set(x, "suppressRowDrag", js.undefined)
      
      inline def setSuppressRowHoverHighlight(value: Boolean): Self = StObject.set(x, "suppressRowHoverHighlight", value.asInstanceOf[js.Any])
      
      inline def setSuppressRowHoverHighlightUndefined: Self = StObject.set(x, "suppressRowHoverHighlight", js.undefined)
      
      inline def setSuppressRowTransform(value: Boolean): Self = StObject.set(x, "suppressRowTransform", value.asInstanceOf[js.Any])
      
      inline def setSuppressRowTransformUndefined: Self = StObject.set(x, "suppressRowTransform", js.undefined)
      
      inline def setSuppressScrollOnNewData(value: Boolean): Self = StObject.set(x, "suppressScrollOnNewData", value.asInstanceOf[js.Any])
      
      inline def setSuppressScrollOnNewDataUndefined: Self = StObject.set(x, "suppressScrollOnNewData", js.undefined)
      
      inline def setSuppressTabbing(value: Boolean): Self = StObject.set(x, "suppressTabbing", value.asInstanceOf[js.Any])
      
      inline def setSuppressTabbingUndefined: Self = StObject.set(x, "suppressTabbing", js.undefined)
      
      inline def setSuppressTouch(value: Boolean): Self = StObject.set(x, "suppressTouch", value.asInstanceOf[js.Any])
      
      inline def setSuppressTouchUndefined: Self = StObject.set(x, "suppressTouch", js.undefined)
      
      inline def setTabToNextCell(value: /* params */ TabToNextCellParams => GridCellDef): Self = StObject.set(x, "tabToNextCell", js.Any.fromFunction1(value))
      
      inline def setTabToNextCellUndefined: Self = StObject.set(x, "tabToNextCell", js.undefined)
      
      inline def setToolPanelSuppressColumnExpandAll(value: Boolean): Self = StObject.set(x, "toolPanelSuppressColumnExpandAll", value.asInstanceOf[js.Any])
      
      inline def setToolPanelSuppressColumnExpandAllUndefined: Self = StObject.set(x, "toolPanelSuppressColumnExpandAll", js.undefined)
      
      inline def setToolPanelSuppressColumnFilter(value: Boolean): Self = StObject.set(x, "toolPanelSuppressColumnFilter", value.asInstanceOf[js.Any])
      
      inline def setToolPanelSuppressColumnFilterUndefined: Self = StObject.set(x, "toolPanelSuppressColumnFilter", js.undefined)
      
      inline def setToolPanelSuppressColumnSelectAll(value: Boolean): Self = StObject.set(x, "toolPanelSuppressColumnSelectAll", value.asInstanceOf[js.Any])
      
      inline def setToolPanelSuppressColumnSelectAllUndefined: Self = StObject.set(x, "toolPanelSuppressColumnSelectAll", js.undefined)
      
      inline def setToolPanelSuppressPivotMode(value: Boolean): Self = StObject.set(x, "toolPanelSuppressPivotMode", value.asInstanceOf[js.Any])
      
      inline def setToolPanelSuppressPivotModeUndefined: Self = StObject.set(x, "toolPanelSuppressPivotMode", js.undefined)
      
      inline def setToolPanelSuppressPivots(value: Boolean): Self = StObject.set(x, "toolPanelSuppressPivots", value.asInstanceOf[js.Any])
      
      inline def setToolPanelSuppressPivotsUndefined: Self = StObject.set(x, "toolPanelSuppressPivots", js.undefined)
      
      inline def setToolPanelSuppressRowGroups(value: Boolean): Self = StObject.set(x, "toolPanelSuppressRowGroups", value.asInstanceOf[js.Any])
      
      inline def setToolPanelSuppressRowGroupsUndefined: Self = StObject.set(x, "toolPanelSuppressRowGroups", js.undefined)
      
      inline def setToolPanelSuppressSideButtons(value: Boolean): Self = StObject.set(x, "toolPanelSuppressSideButtons", value.asInstanceOf[js.Any])
      
      inline def setToolPanelSuppressSideButtonsUndefined: Self = StObject.set(x, "toolPanelSuppressSideButtons", js.undefined)
      
      inline def setToolPanelSuppressValues(value: Boolean): Self = StObject.set(x, "toolPanelSuppressValues", value.asInstanceOf[js.Any])
      
      inline def setToolPanelSuppressValuesUndefined: Self = StObject.set(x, "toolPanelSuppressValues", js.undefined)
      
      inline def setTreeData(value: Boolean): Self = StObject.set(x, "treeData", value.asInstanceOf[js.Any])
      
      inline def setTreeDataUndefined: Self = StObject.set(x, "treeData", js.undefined)
      
      inline def setUnSortIcon(value: Boolean): Self = StObject.set(x, "unSortIcon", value.asInstanceOf[js.Any])
      
      inline def setUnSortIconUndefined: Self = StObject.set(x, "unSortIcon", js.undefined)
      
      inline def setValueCache(value: Boolean): Self = StObject.set(x, "valueCache", value.asInstanceOf[js.Any])
      
      inline def setValueCacheNeverExpires(value: Boolean): Self = StObject.set(x, "valueCacheNeverExpires", value.asInstanceOf[js.Any])
      
      inline def setValueCacheNeverExpiresUndefined: Self = StObject.set(x, "valueCacheNeverExpires", js.undefined)
      
      inline def setValueCacheUndefined: Self = StObject.set(x, "valueCache", js.undefined)
      
      inline def setViewportDatasource(value: IViewportDatasource): Self = StObject.set(x, "viewportDatasource", value.asInstanceOf[js.Any])
      
      inline def setViewportDatasourceUndefined: Self = StObject.set(x, "viewportDatasource", js.undefined)
      
      inline def setViewportRowModelBufferSize(value: Double): Self = StObject.set(x, "viewportRowModelBufferSize", value.asInstanceOf[js.Any])
      
      inline def setViewportRowModelBufferSizeUndefined: Self = StObject.set(x, "viewportRowModelBufferSize", js.undefined)
      
      inline def setViewportRowModelPageSize(value: Double): Self = StObject.set(x, "viewportRowModelPageSize", value.asInstanceOf[js.Any])
      
      inline def setViewportRowModelPageSizeUndefined: Self = StObject.set(x, "viewportRowModelPageSize", js.undefined)
    }
  }
  
  type IsRowMaster = js.Function1[/* dataItem */ js.Any, Boolean]
  
  type IsRowSelectable = js.Function1[/* node */ RowNode, Boolean]
  
  trait MenuItemDef extends StObject {
    
    var action: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var checked: js.UndefOr[Boolean] = js.undefined
    
    var cssClasses: js.UndefOr[js.Array[String]] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var icon: js.UndefOr[HTMLElement | String] = js.undefined
    
    var name: String
    
    var shortcut: js.UndefOr[String] = js.undefined
    
    var subMenu: js.UndefOr[js.Array[MenuItemDef | String]] = js.undefined
    
    var tooltip: js.UndefOr[String] = js.undefined
  }
  object MenuItemDef {
    
    inline def apply(name: String): MenuItemDef = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuItemDef]
    }
    
    extension [Self <: MenuItemDef](x: Self) {
      
      inline def setAction(value: () => Unit): Self = StObject.set(x, "action", js.Any.fromFunction0(value))
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setCssClasses(value: js.Array[String]): Self = StObject.set(x, "cssClasses", value.asInstanceOf[js.Any])
      
      inline def setCssClassesUndefined: Self = StObject.set(x, "cssClasses", js.undefined)
      
      inline def setCssClassesVarargs(value: String*): Self = StObject.set(x, "cssClasses", js.Array(value :_*))
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIcon(value: HTMLElement | String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setShortcut(value: String): Self = StObject.set(x, "shortcut", value.asInstanceOf[js.Any])
      
      inline def setShortcutUndefined: Self = StObject.set(x, "shortcut", js.undefined)
      
      inline def setSubMenu(value: js.Array[MenuItemDef | String]): Self = StObject.set(x, "subMenu", value.asInstanceOf[js.Any])
      
      inline def setSubMenuUndefined: Self = StObject.set(x, "subMenu", js.undefined)
      
      inline def setSubMenuVarargs(value: (MenuItemDef | String)*): Self = StObject.set(x, "subMenu", js.Array(value :_*))
      
      inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
  
  trait NavigateToNextCellParams extends StObject {
    
    var event: KeyboardEvent
    
    var key: Double
    
    var nextCellDef: GridCellDef
    
    var previousCellDef: GridCellDef
  }
  object NavigateToNextCellParams {
    
    inline def apply(event: KeyboardEvent, key: Double, nextCellDef: GridCellDef, previousCellDef: GridCellDef): NavigateToNextCellParams = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], nextCellDef = nextCellDef.asInstanceOf[js.Any], previousCellDef = previousCellDef.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavigateToNextCellParams]
    }
    
    extension [Self <: NavigateToNextCellParams](x: Self) {
      
      inline def setEvent(value: KeyboardEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setNextCellDef(value: GridCellDef): Self = StObject.set(x, "nextCellDef", value.asInstanceOf[js.Any])
      
      inline def setPreviousCellDef(value: GridCellDef): Self = StObject.set(x, "previousCellDef", value.asInstanceOf[js.Any])
    }
  }
  
  trait NodeChildDetails extends StObject {
    
    var children: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var expanded: js.UndefOr[Boolean] = js.undefined
    
    var field: js.UndefOr[String] = js.undefined
    
    var group: Boolean
    
    var key: js.UndefOr[js.Any] = js.undefined
  }
  object NodeChildDetails {
    
    inline def apply(group: Boolean): NodeChildDetails = {
      val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeChildDetails]
    }
    
    extension [Self <: NodeChildDetails](x: Self) {
      
      inline def setChildren(value: js.Array[js.Any]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: js.Any*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      inline def setGroup(value: Boolean): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setKey(value: js.Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
  
  trait PaginationNumberFormatterParams extends StObject {
    
    var value: Double
  }
  object PaginationNumberFormatterParams {
    
    inline def apply(value: Double): PaginationNumberFormatterParams = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaginationNumberFormatterParams]
    }
    
    extension [Self <: PaginationNumberFormatterParams](x: Self) {
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait PostProcessPopupParams extends StObject {
    
    var column: js.UndefOr[Column] = js.undefined
    
    var ePopup: HTMLElement
    
    var eventSource: js.UndefOr[HTMLElement] = js.undefined
    
    var mouseEvent: js.UndefOr[MouseEvent | Touch] = js.undefined
    
    var rowNode: js.UndefOr[RowNode] = js.undefined
    
    var `type`: String
  }
  object PostProcessPopupParams {
    
    inline def apply(ePopup: HTMLElement, `type`: String): PostProcessPopupParams = {
      val __obj = js.Dynamic.literal(ePopup = ePopup.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PostProcessPopupParams]
    }
    
    extension [Self <: PostProcessPopupParams](x: Self) {
      
      inline def setColumn(value: Column): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setEPopup(value: HTMLElement): Self = StObject.set(x, "ePopup", value.asInstanceOf[js.Any])
      
      inline def setEventSource(value: HTMLElement): Self = StObject.set(x, "eventSource", value.asInstanceOf[js.Any])
      
      inline def setEventSourceUndefined: Self = StObject.set(x, "eventSource", js.undefined)
      
      inline def setMouseEvent(value: MouseEvent | Touch): Self = StObject.set(x, "mouseEvent", value.asInstanceOf[js.Any])
      
      inline def setMouseEventUndefined: Self = StObject.set(x, "mouseEvent", js.undefined)
      
      inline def setRowNode(value: RowNode): Self = StObject.set(x, "rowNode", value.asInstanceOf[js.Any])
      
      inline def setRowNodeUndefined: Self = StObject.set(x, "rowNode", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProcessDataFromClipboardParams extends StObject {
    
    var data: js.Array[js.Array[String]]
  }
  object ProcessDataFromClipboardParams {
    
    inline def apply(data: js.Array[js.Array[String]]): ProcessDataFromClipboardParams = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcessDataFromClipboardParams]
    }
    
    extension [Self <: ProcessDataFromClipboardParams](x: Self) {
      
      inline def setData(value: js.Array[js.Array[String]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: js.Array[String]*): Self = StObject.set(x, "data", js.Array(value :_*))
    }
  }
  
  trait ProcessRowParams extends StObject {
    
    def addRenderedRowListener(eventType: String, listener: js.Function): Unit
    
    var api: GridApi
    
    var columnApi: ColumnApi
    
    var context: js.Any
    
    var ePinnedLeftRow: HTMLElement
    
    var ePinnedRightRow: HTMLElement
    
    var eRow: HTMLElement
    
    var node: RowNode
    
    var rowIndex: Double
  }
  object ProcessRowParams {
    
    inline def apply(
      addRenderedRowListener: (String, js.Function) => Unit,
      api: GridApi,
      columnApi: ColumnApi,
      context: js.Any,
      ePinnedLeftRow: HTMLElement,
      ePinnedRightRow: HTMLElement,
      eRow: HTMLElement,
      node: RowNode,
      rowIndex: Double
    ): ProcessRowParams = {
      val __obj = js.Dynamic.literal(addRenderedRowListener = js.Any.fromFunction2(addRenderedRowListener), api = api.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], ePinnedLeftRow = ePinnedLeftRow.asInstanceOf[js.Any], ePinnedRightRow = ePinnedRightRow.asInstanceOf[js.Any], eRow = eRow.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcessRowParams]
    }
    
    extension [Self <: ProcessRowParams](x: Self) {
      
      inline def setAddRenderedRowListener(value: (String, js.Function) => Unit): Self = StObject.set(x, "addRenderedRowListener", js.Any.fromFunction2(value))
      
      inline def setApi(value: GridApi): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      inline def setColumnApi(value: ColumnApi): Self = StObject.set(x, "columnApi", value.asInstanceOf[js.Any])
      
      inline def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setEPinnedLeftRow(value: HTMLElement): Self = StObject.set(x, "ePinnedLeftRow", value.asInstanceOf[js.Any])
      
      inline def setEPinnedRightRow(value: HTMLElement): Self = StObject.set(x, "ePinnedRightRow", value.asInstanceOf[js.Any])
      
      inline def setERow(value: HTMLElement): Self = StObject.set(x, "eRow", value.asInstanceOf[js.Any])
      
      inline def setNode(value: RowNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    }
  }
  
  trait TabToNextCellParams extends StObject {
    
    var backwards: Boolean
    
    var editing: Boolean
    
    var nextCellDef: GridCellDef
    
    var previousCellDef: GridCellDef
  }
  object TabToNextCellParams {
    
    inline def apply(backwards: Boolean, editing: Boolean, nextCellDef: GridCellDef, previousCellDef: GridCellDef): TabToNextCellParams = {
      val __obj = js.Dynamic.literal(backwards = backwards.asInstanceOf[js.Any], editing = editing.asInstanceOf[js.Any], nextCellDef = nextCellDef.asInstanceOf[js.Any], previousCellDef = previousCellDef.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabToNextCellParams]
    }
    
    extension [Self <: TabToNextCellParams](x: Self) {
      
      inline def setBackwards(value: Boolean): Self = StObject.set(x, "backwards", value.asInstanceOf[js.Any])
      
      inline def setEditing(value: Boolean): Self = StObject.set(x, "editing", value.asInstanceOf[js.Any])
      
      inline def setNextCellDef(value: GridCellDef): Self = StObject.set(x, "nextCellDef", value.asInstanceOf[js.Any])
      
      inline def setPreviousCellDef(value: GridCellDef): Self = StObject.set(x, "previousCellDef", value.asInstanceOf[js.Any])
    }
  }
}
