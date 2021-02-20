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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gridOptionsMod {
  
  type GetContextMenuItems = js.Function1[/* params */ GetContextMenuItemsParams, js.Array[String | MenuItemDef]]
  
  @js.native
  trait GetContextMenuItemsParams extends StObject {
    
    var api: GridApi = js.native
    
    var column: Column = js.native
    
    var columnApi: ColumnApi = js.native
    
    var context: js.Any = js.native
    
    var defaultItems: js.Array[String] = js.native
    
    var node: RowNode = js.native
    
    var value: js.Any = js.native
  }
  object GetContextMenuItemsParams {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class GetContextMenuItemsParamsMutableBuilder[Self <: GetContextMenuItemsParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApi(value: GridApi): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumn(value: Column): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnApi(value: ColumnApi): Self = StObject.set(x, "columnApi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultItems(value: js.Array[String]): Self = StObject.set(x, "defaultItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultItemsVarargs(value: String*): Self = StObject.set(x, "defaultItems", js.Array(value :_*))
      
      @scala.inline
      def setNode(value: RowNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type GetDataPath = js.Function1[/* data */ js.Any, js.Array[String]]
  
  type GetMainMenuItems = js.Function1[/* params */ GetMainMenuItemsParams, js.Array[String | MenuItemDef]]
  
  @js.native
  trait GetMainMenuItemsParams extends StObject {
    
    var api: GridApi = js.native
    
    var column: Column = js.native
    
    var columnApi: ColumnApi = js.native
    
    var context: js.Any = js.native
    
    var defaultItems: js.Array[String] = js.native
  }
  object GetMainMenuItemsParams {
    
    @scala.inline
    def apply(
      api: GridApi,
      column: Column,
      columnApi: ColumnApi,
      context: js.Any,
      defaultItems: js.Array[String]
    ): GetMainMenuItemsParams = {
      val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], defaultItems = defaultItems.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetMainMenuItemsParams]
    }
    
    @scala.inline
    implicit class GetMainMenuItemsParamsMutableBuilder[Self <: GetMainMenuItemsParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApi(value: GridApi): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumn(value: Column): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnApi(value: ColumnApi): Self = StObject.set(x, "columnApi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultItems(value: js.Array[String]): Self = StObject.set(x, "defaultItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultItemsVarargs(value: String*): Self = StObject.set(x, "defaultItems", js.Array(value :_*))
    }
  }
  
  type GetNodeChildDetails = js.Function1[/* dataItem */ js.Any, NodeChildDetails]
  
  type GetRowNodeIdFunc = js.Function1[/* data */ js.Any, String]
  
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
    implicit class GridOptionsMutableBuilder[Self <: GridOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccentedSort(value: Boolean): Self = StObject.set(x, "accentedSort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccentedSortUndefined: Self = StObject.set(x, "accentedSort", js.undefined)
      
      @scala.inline
      def setAggFuncs(value: StringDictionary[IAggFunc]): Self = StObject.set(x, "aggFuncs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAggFuncsUndefined: Self = StObject.set(x, "aggFuncs", js.undefined)
      
      @scala.inline
      def setAggregateOnlyChangedColumns(value: Boolean): Self = StObject.set(x, "aggregateOnlyChangedColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAggregateOnlyChangedColumnsUndefined: Self = StObject.set(x, "aggregateOnlyChangedColumns", js.undefined)
      
      @scala.inline
      def setAlignedGrids(value: js.Array[GridOptions]): Self = StObject.set(x, "alignedGrids", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignedGridsUndefined: Self = StObject.set(x, "alignedGrids", js.undefined)
      
      @scala.inline
      def setAlignedGridsVarargs(value: GridOptions*): Self = StObject.set(x, "alignedGrids", js.Array(value :_*))
      
      @scala.inline
      def setAllowContextMenuWithControlKey(value: Boolean): Self = StObject.set(x, "allowContextMenuWithControlKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowContextMenuWithControlKeyUndefined: Self = StObject.set(x, "allowContextMenuWithControlKey", js.undefined)
      
      @scala.inline
      def setAlwaysShowStatusBar(value: Boolean): Self = StObject.set(x, "alwaysShowStatusBar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlwaysShowStatusBarUndefined: Self = StObject.set(x, "alwaysShowStatusBar", js.undefined)
      
      @scala.inline
      def setAngularCompileFilters(value: Boolean): Self = StObject.set(x, "angularCompileFilters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAngularCompileFiltersUndefined: Self = StObject.set(x, "angularCompileFilters", js.undefined)
      
      @scala.inline
      def setAngularCompileHeaders(value: Boolean): Self = StObject.set(x, "angularCompileHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAngularCompileHeadersUndefined: Self = StObject.set(x, "angularCompileHeaders", js.undefined)
      
      @scala.inline
      def setAngularCompileRows(value: Boolean): Self = StObject.set(x, "angularCompileRows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAngularCompileRowsUndefined: Self = StObject.set(x, "angularCompileRows", js.undefined)
      
      @scala.inline
      def setAnimateRows(value: Boolean): Self = StObject.set(x, "animateRows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimateRowsUndefined: Self = StObject.set(x, "animateRows", js.undefined)
      
      @scala.inline
      def setApi(value: GridApi): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiUndefined: Self = StObject.set(x, "api", js.undefined)
      
      @scala.inline
      def setAutoGroupColumnDef(value: ColDef): Self = StObject.set(x, "autoGroupColumnDef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoGroupColumnDefUndefined: Self = StObject.set(x, "autoGroupColumnDef", js.undefined)
      
      @scala.inline
      def setAutoSizePadding(value: Double): Self = StObject.set(x, "autoSizePadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoSizePaddingUndefined: Self = StObject.set(x, "autoSizePadding", js.undefined)
      
      @scala.inline
      def setBatchUpdateWaitMillis(value: Double): Self = StObject.set(x, "batchUpdateWaitMillis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBatchUpdateWaitMillisUndefined: Self = StObject.set(x, "batchUpdateWaitMillis", js.undefined)
      
      @scala.inline
      def setCacheBlockSize(value: Double): Self = StObject.set(x, "cacheBlockSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheBlockSizeUndefined: Self = StObject.set(x, "cacheBlockSize", js.undefined)
      
      @scala.inline
      def setCacheOverflowSize(value: Double): Self = StObject.set(x, "cacheOverflowSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheOverflowSizeUndefined: Self = StObject.set(x, "cacheOverflowSize", js.undefined)
      
      @scala.inline
      def setCacheQuickFilter(value: Boolean): Self = StObject.set(x, "cacheQuickFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheQuickFilterUndefined: Self = StObject.set(x, "cacheQuickFilter", js.undefined)
      
      @scala.inline
      def setClipboardDeliminator(value: String): Self = StObject.set(x, "clipboardDeliminator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipboardDeliminatorUndefined: Self = StObject.set(x, "clipboardDeliminator", js.undefined)
      
      @scala.inline
      def setColResizeDefault(value: String): Self = StObject.set(x, "colResizeDefault", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColResizeDefaultUndefined: Self = StObject.set(x, "colResizeDefault", js.undefined)
      
      @scala.inline
      def setColWidth(value: Double): Self = StObject.set(x, "colWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColWidthUndefined: Self = StObject.set(x, "colWidth", js.undefined)
      
      @scala.inline
      def setColumnApi(value: ColumnApi): Self = StObject.set(x, "columnApi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnApiUndefined: Self = StObject.set(x, "columnApi", js.undefined)
      
      @scala.inline
      def setColumnDefs(value: js.Array[ColDef | ColGroupDef]): Self = StObject.set(x, "columnDefs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnDefsUndefined: Self = StObject.set(x, "columnDefs", js.undefined)
      
      @scala.inline
      def setColumnDefsVarargs(value: (ColDef | ColGroupDef)*): Self = StObject.set(x, "columnDefs", js.Array(value :_*))
      
      @scala.inline
      def setColumnTypes(value: StringDictionary[ColDef]): Self = StObject.set(x, "columnTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnTypesUndefined: Self = StObject.set(x, "columnTypes", js.undefined)
      
      @scala.inline
      def setComponents(value: StringDictionary[AgGridRegisteredComponentInput[IComponent[_]]]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setContractColumnSelection(value: Boolean): Self = StObject.set(x, "contractColumnSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContractColumnSelectionUndefined: Self = StObject.set(x, "contractColumnSelection", js.undefined)
      
      @scala.inline
      def setDatasource(value: IDatasource): Self = StObject.set(x, "datasource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatasourceUndefined: Self = StObject.set(x, "datasource", js.undefined)
      
      @scala.inline
      def setDateComponent(value: Instantiable): Self = StObject.set(x, "dateComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateComponentFramework(value: js.Any): Self = StObject.set(x, "dateComponentFramework", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateComponentFrameworkUndefined: Self = StObject.set(x, "dateComponentFramework", js.undefined)
      
      @scala.inline
      def setDateComponentUndefined: Self = StObject.set(x, "dateComponent", js.undefined)
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setDefaultColDef(value: ColDef): Self = StObject.set(x, "defaultColDef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultColDefUndefined: Self = StObject.set(x, "defaultColDef", js.undefined)
      
      @scala.inline
      def setDefaultColGroupDef(value: ColGroupDef): Self = StObject.set(x, "defaultColGroupDef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultColGroupDefUndefined: Self = StObject.set(x, "defaultColGroupDef", js.undefined)
      
      @scala.inline
      def setDefaultExportParams(value: CsvExportParams): Self = StObject.set(x, "defaultExportParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultExportParamsUndefined: Self = StObject.set(x, "defaultExportParams", js.undefined)
      
      @scala.inline
      def setDefaultGroupSortComparator(value: (/* nodeA */ RowNode, /* nodeB */ RowNode) => Double): Self = StObject.set(x, "defaultGroupSortComparator", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDefaultGroupSortComparatorUndefined: Self = StObject.set(x, "defaultGroupSortComparator", js.undefined)
      
      @scala.inline
      def setDeltaRowDataMode(value: Boolean): Self = StObject.set(x, "deltaRowDataMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeltaRowDataModeUndefined: Self = StObject.set(x, "deltaRowDataMode", js.undefined)
      
      @scala.inline
      def setDetailCellRenderer(value: InstantiableICellRendererComp | ICellRendererFunc | String): Self = StObject.set(x, "detailCellRenderer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailCellRendererFramework(value: js.Any): Self = StObject.set(x, "detailCellRendererFramework", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailCellRendererFrameworkUndefined: Self = StObject.set(x, "detailCellRendererFramework", js.undefined)
      
      @scala.inline
      def setDetailCellRendererFunction1(value: /* params */ js.Any => HTMLElement | String): Self = StObject.set(x, "detailCellRenderer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDetailCellRendererParams(value: js.Any): Self = StObject.set(x, "detailCellRendererParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailCellRendererParamsUndefined: Self = StObject.set(x, "detailCellRendererParams", js.undefined)
      
      @scala.inline
      def setDetailCellRendererUndefined: Self = StObject.set(x, "detailCellRenderer", js.undefined)
      
      @scala.inline
      def setDetailRowHeight(value: Double): Self = StObject.set(x, "detailRowHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailRowHeightUndefined: Self = StObject.set(x, "detailRowHeight", js.undefined)
      
      @scala.inline
      def setDoesDataFlower(value: /* dataItem */ js.Any => Boolean): Self = StObject.set(x, "doesDataFlower", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDoesDataFlowerUndefined: Self = StObject.set(x, "doesDataFlower", js.undefined)
      
      @scala.inline
      def setDoesExternalFilterPass(value: /* node */ RowNode => Boolean): Self = StObject.set(x, "doesExternalFilterPass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDoesExternalFilterPassUndefined: Self = StObject.set(x, "doesExternalFilterPass", js.undefined)
      
      @scala.inline
      def setDomLayout(value: String): Self = StObject.set(x, "domLayout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomLayoutUndefined: Self = StObject.set(x, "domLayout", js.undefined)
      
      @scala.inline
      def setEditType(value: String): Self = StObject.set(x, "editType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditTypeUndefined: Self = StObject.set(x, "editType", js.undefined)
      
      @scala.inline
      def setEmbedFullWidthRows(value: Boolean): Self = StObject.set(x, "embedFullWidthRows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmbedFullWidthRowsUndefined: Self = StObject.set(x, "embedFullWidthRows", js.undefined)
      
      @scala.inline
      def setEnableCellChangeFlash(value: Boolean): Self = StObject.set(x, "enableCellChangeFlash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableCellChangeFlashUndefined: Self = StObject.set(x, "enableCellChangeFlash", js.undefined)
      
      @scala.inline
      def setEnableCellExpressions(value: Boolean): Self = StObject.set(x, "enableCellExpressions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableCellExpressionsUndefined: Self = StObject.set(x, "enableCellExpressions", js.undefined)
      
      @scala.inline
      def setEnableColResize(value: Boolean): Self = StObject.set(x, "enableColResize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableColResizeUndefined: Self = StObject.set(x, "enableColResize", js.undefined)
      
      @scala.inline
      def setEnableFilter(value: Boolean): Self = StObject.set(x, "enableFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableFilterUndefined: Self = StObject.set(x, "enableFilter", js.undefined)
      
      @scala.inline
      def setEnableGroupEdit(value: Boolean): Self = StObject.set(x, "enableGroupEdit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableGroupEditUndefined: Self = StObject.set(x, "enableGroupEdit", js.undefined)
      
      @scala.inline
      def setEnableOldSetFilterModel(value: Boolean): Self = StObject.set(x, "enableOldSetFilterModel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableOldSetFilterModelUndefined: Self = StObject.set(x, "enableOldSetFilterModel", js.undefined)
      
      @scala.inline
      def setEnableRangeSelection(value: Boolean): Self = StObject.set(x, "enableRangeSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableRangeSelectionUndefined: Self = StObject.set(x, "enableRangeSelection", js.undefined)
      
      @scala.inline
      def setEnableRtl(value: Boolean): Self = StObject.set(x, "enableRtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableRtlUndefined: Self = StObject.set(x, "enableRtl", js.undefined)
      
      @scala.inline
      def setEnableServerSideFilter(value: Boolean): Self = StObject.set(x, "enableServerSideFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableServerSideFilterUndefined: Self = StObject.set(x, "enableServerSideFilter", js.undefined)
      
      @scala.inline
      def setEnableServerSideSorting(value: Boolean): Self = StObject.set(x, "enableServerSideSorting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableServerSideSortingUndefined: Self = StObject.set(x, "enableServerSideSorting", js.undefined)
      
      @scala.inline
      def setEnableSorting(value: Boolean): Self = StObject.set(x, "enableSorting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableSortingUndefined: Self = StObject.set(x, "enableSorting", js.undefined)
      
      @scala.inline
      def setEnableStatusBar(value: Boolean): Self = StObject.set(x, "enableStatusBar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableStatusBarUndefined: Self = StObject.set(x, "enableStatusBar", js.undefined)
      
      @scala.inline
      def setEnsureDomOrder(value: Boolean): Self = StObject.set(x, "ensureDomOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnsureDomOrderUndefined: Self = StObject.set(x, "ensureDomOrder", js.undefined)
      
      @scala.inline
      def setEnterMovesDown(value: Boolean): Self = StObject.set(x, "enterMovesDown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnterMovesDownAfterEdit(value: Boolean): Self = StObject.set(x, "enterMovesDownAfterEdit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnterMovesDownAfterEditUndefined: Self = StObject.set(x, "enterMovesDownAfterEdit", js.undefined)
      
      @scala.inline
      def setEnterMovesDownUndefined: Self = StObject.set(x, "enterMovesDown", js.undefined)
      
      @scala.inline
      def setExcelStyles(value: js.Array[_]): Self = StObject.set(x, "excelStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcelStylesUndefined: Self = StObject.set(x, "excelStyles", js.undefined)
      
      @scala.inline
      def setExcelStylesVarargs(value: js.Any*): Self = StObject.set(x, "excelStyles", js.Array(value :_*))
      
      @scala.inline
      def setFloatingFilter(value: Boolean): Self = StObject.set(x, "floatingFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloatingFilterUndefined: Self = StObject.set(x, "floatingFilter", js.undefined)
      
      @scala.inline
      def setFloatingFiltersHeight(value: Double): Self = StObject.set(x, "floatingFiltersHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloatingFiltersHeightUndefined: Self = StObject.set(x, "floatingFiltersHeight", js.undefined)
      
      @scala.inline
      def setForPrint(value: Boolean): Self = StObject.set(x, "forPrint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForPrintUndefined: Self = StObject.set(x, "forPrint", js.undefined)
      
      @scala.inline
      def setFrameworkComponents(value: StringDictionary[InstantiableAny]): Self = StObject.set(x, "frameworkComponents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameworkComponentsUndefined: Self = StObject.set(x, "frameworkComponents", js.undefined)
      
      @scala.inline
      def setFullWidthCellRenderer(value: InstantiableICellRendererComp | ICellRendererFunc | String): Self = StObject.set(x, "fullWidthCellRenderer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullWidthCellRendererFramework(value: js.Any): Self = StObject.set(x, "fullWidthCellRendererFramework", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullWidthCellRendererFrameworkUndefined: Self = StObject.set(x, "fullWidthCellRendererFramework", js.undefined)
      
      @scala.inline
      def setFullWidthCellRendererFunction1(value: /* params */ js.Any => HTMLElement | String): Self = StObject.set(x, "fullWidthCellRenderer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFullWidthCellRendererParams(value: js.Any): Self = StObject.set(x, "fullWidthCellRendererParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullWidthCellRendererParamsUndefined: Self = StObject.set(x, "fullWidthCellRendererParams", js.undefined)
      
      @scala.inline
      def setFullWidthCellRendererUndefined: Self = StObject.set(x, "fullWidthCellRenderer", js.undefined)
      
      @scala.inline
      def setFunctionsPassive(value: Boolean): Self = StObject.set(x, "functionsPassive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionsPassiveUndefined: Self = StObject.set(x, "functionsPassive", js.undefined)
      
      @scala.inline
      def setFunctionsReadOnly(value: Boolean): Self = StObject.set(x, "functionsReadOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionsReadOnlyUndefined: Self = StObject.set(x, "functionsReadOnly", js.undefined)
      
      @scala.inline
      def setGetBusinessKeyForNode(value: /* node */ RowNode => String): Self = StObject.set(x, "getBusinessKeyForNode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetBusinessKeyForNodeUndefined: Self = StObject.set(x, "getBusinessKeyForNode", js.undefined)
      
      @scala.inline
      def setGetChildCount(value: /* dataItem */ js.Any => Double): Self = StObject.set(x, "getChildCount", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetChildCountUndefined: Self = StObject.set(x, "getChildCount", js.undefined)
      
      @scala.inline
      def setGetContextMenuItems(value: /* params */ GetContextMenuItemsParams => js.Array[String | MenuItemDef]): Self = StObject.set(x, "getContextMenuItems", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetContextMenuItemsUndefined: Self = StObject.set(x, "getContextMenuItems", js.undefined)
      
      @scala.inline
      def setGetDataPath(value: /* data */ js.Any => js.Array[String]): Self = StObject.set(x, "getDataPath", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetDataPathUndefined: Self = StObject.set(x, "getDataPath", js.undefined)
      
      @scala.inline
      def setGetDocument(value: () => Document): Self = StObject.set(x, "getDocument", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDocumentUndefined: Self = StObject.set(x, "getDocument", js.undefined)
      
      @scala.inline
      def setGetMainMenuItems(value: /* params */ GetMainMenuItemsParams => js.Array[String | MenuItemDef]): Self = StObject.set(x, "getMainMenuItems", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetMainMenuItemsUndefined: Self = StObject.set(x, "getMainMenuItems", js.undefined)
      
      @scala.inline
      def setGetNodeChildDetails(value: /* dataItem */ js.Any => NodeChildDetails): Self = StObject.set(x, "getNodeChildDetails", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetNodeChildDetailsUndefined: Self = StObject.set(x, "getNodeChildDetails", js.undefined)
      
      @scala.inline
      def setGetRowClass(value: /* params */ js.Any => String | js.Array[String]): Self = StObject.set(x, "getRowClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetRowClassUndefined: Self = StObject.set(x, "getRowClass", js.undefined)
      
      @scala.inline
      def setGetRowHeight(value: js.Function): Self = StObject.set(x, "getRowHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetRowHeightUndefined: Self = StObject.set(x, "getRowHeight", js.undefined)
      
      @scala.inline
      def setGetRowNodeId(value: /* data */ js.Any => String): Self = StObject.set(x, "getRowNodeId", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetRowNodeIdUndefined: Self = StObject.set(x, "getRowNodeId", js.undefined)
      
      @scala.inline
      def setGetRowStyle(value: js.Function): Self = StObject.set(x, "getRowStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetRowStyleUndefined: Self = StObject.set(x, "getRowStyle", js.undefined)
      
      @scala.inline
      def setGridAutoHeight(value: Boolean): Self = StObject.set(x, "gridAutoHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridAutoHeightUndefined: Self = StObject.set(x, "gridAutoHeight", js.undefined)
      
      @scala.inline
      def setGroupColumnDef(value: ColDef): Self = StObject.set(x, "groupColumnDef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupColumnDefUndefined: Self = StObject.set(x, "groupColumnDef", js.undefined)
      
      @scala.inline
      def setGroupDefaultExpanded(value: Double): Self = StObject.set(x, "groupDefaultExpanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupDefaultExpandedUndefined: Self = StObject.set(x, "groupDefaultExpanded", js.undefined)
      
      @scala.inline
      def setGroupHeaderHeight(value: Double): Self = StObject.set(x, "groupHeaderHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupHeaderHeightUndefined: Self = StObject.set(x, "groupHeaderHeight", js.undefined)
      
      @scala.inline
      def setGroupHideOpenParents(value: Boolean): Self = StObject.set(x, "groupHideOpenParents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupHideOpenParentsUndefined: Self = StObject.set(x, "groupHideOpenParents", js.undefined)
      
      @scala.inline
      def setGroupIncludeFooter(value: Boolean): Self = StObject.set(x, "groupIncludeFooter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupIncludeFooterUndefined: Self = StObject.set(x, "groupIncludeFooter", js.undefined)
      
      @scala.inline
      def setGroupIncludeTotalFooter(value: Boolean): Self = StObject.set(x, "groupIncludeTotalFooter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupIncludeTotalFooterUndefined: Self = StObject.set(x, "groupIncludeTotalFooter", js.undefined)
      
      @scala.inline
      def setGroupMultiAutoColumn(value: Boolean): Self = StObject.set(x, "groupMultiAutoColumn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupMultiAutoColumnUndefined: Self = StObject.set(x, "groupMultiAutoColumn", js.undefined)
      
      @scala.inline
      def setGroupRemoveLowestSingleChildren(value: Boolean): Self = StObject.set(x, "groupRemoveLowestSingleChildren", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupRemoveLowestSingleChildrenUndefined: Self = StObject.set(x, "groupRemoveLowestSingleChildren", js.undefined)
      
      @scala.inline
      def setGroupRemoveSingleChildren(value: Boolean): Self = StObject.set(x, "groupRemoveSingleChildren", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupRemoveSingleChildrenUndefined: Self = StObject.set(x, "groupRemoveSingleChildren", js.undefined)
      
      @scala.inline
      def setGroupRowAggNodes(value: /* nodes */ js.Array[RowNode] => _): Self = StObject.set(x, "groupRowAggNodes", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGroupRowAggNodesUndefined: Self = StObject.set(x, "groupRowAggNodes", js.undefined)
      
      @scala.inline
      def setGroupRowInnerRenderer(value: InstantiableICellRendererComp | ICellRendererFunc | String): Self = StObject.set(x, "groupRowInnerRenderer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupRowInnerRendererFramework(value: js.Any): Self = StObject.set(x, "groupRowInnerRendererFramework", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupRowInnerRendererFrameworkUndefined: Self = StObject.set(x, "groupRowInnerRendererFramework", js.undefined)
      
      @scala.inline
      def setGroupRowInnerRendererFunction1(value: /* params */ js.Any => HTMLElement | String): Self = StObject.set(x, "groupRowInnerRenderer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGroupRowInnerRendererUndefined: Self = StObject.set(x, "groupRowInnerRenderer", js.undefined)
      
      @scala.inline
      def setGroupRowRenderer(value: InstantiableICellRendererComp | ICellRendererFunc | String): Self = StObject.set(x, "groupRowRenderer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupRowRendererFramework(value: js.Any): Self = StObject.set(x, "groupRowRendererFramework", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupRowRendererFrameworkUndefined: Self = StObject.set(x, "groupRowRendererFramework", js.undefined)
      
      @scala.inline
      def setGroupRowRendererFunction1(value: /* params */ js.Any => HTMLElement | String): Self = StObject.set(x, "groupRowRenderer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGroupRowRendererParams(value: js.Any): Self = StObject.set(x, "groupRowRendererParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupRowRendererParamsUndefined: Self = StObject.set(x, "groupRowRendererParams", js.undefined)
      
      @scala.inline
      def setGroupRowRendererUndefined: Self = StObject.set(x, "groupRowRenderer", js.undefined)
      
      @scala.inline
      def setGroupSelectsChildren(value: Boolean): Self = StObject.set(x, "groupSelectsChildren", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupSelectsChildrenUndefined: Self = StObject.set(x, "groupSelectsChildren", js.undefined)
      
      @scala.inline
      def setGroupSelectsFiltered(value: Boolean): Self = StObject.set(x, "groupSelectsFiltered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupSelectsFilteredUndefined: Self = StObject.set(x, "groupSelectsFiltered", js.undefined)
      
      @scala.inline
      def setGroupSuppressAutoColumn(value: Boolean): Self = StObject.set(x, "groupSuppressAutoColumn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupSuppressAutoColumnUndefined: Self = StObject.set(x, "groupSuppressAutoColumn", js.undefined)
      
      @scala.inline
      def setGroupSuppressBlankHeader(value: Boolean): Self = StObject.set(x, "groupSuppressBlankHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupSuppressBlankHeaderUndefined: Self = StObject.set(x, "groupSuppressBlankHeader", js.undefined)
      
      @scala.inline
      def setGroupSuppressRow(value: Boolean): Self = StObject.set(x, "groupSuppressRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupSuppressRowUndefined: Self = StObject.set(x, "groupSuppressRow", js.undefined)
      
      @scala.inline
      def setGroupUseEntireRow(value: Boolean): Self = StObject.set(x, "groupUseEntireRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupUseEntireRowUndefined: Self = StObject.set(x, "groupUseEntireRow", js.undefined)
      
      @scala.inline
      def setHeaderHeight(value: Double): Self = StObject.set(x, "headerHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderHeightUndefined: Self = StObject.set(x, "headerHeight", js.undefined)
      
      @scala.inline
      def setIcons(value: js.Any): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
      
      @scala.inline
      def setInfiniteInitialRowCount(value: Double): Self = StObject.set(x, "infiniteInitialRowCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfiniteInitialRowCountUndefined: Self = StObject.set(x, "infiniteInitialRowCount", js.undefined)
      
      @scala.inline
      def setIsExternalFilterPresent(value: () => Boolean): Self = StObject.set(x, "isExternalFilterPresent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsExternalFilterPresentUndefined: Self = StObject.set(x, "isExternalFilterPresent", js.undefined)
      
      @scala.inline
      def setIsFullWidthCell(value: /* rowNode */ RowNode => Boolean): Self = StObject.set(x, "isFullWidthCell", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsFullWidthCellUndefined: Self = StObject.set(x, "isFullWidthCell", js.undefined)
      
      @scala.inline
      def setIsRowMaster(value: /* dataItem */ js.Any => Boolean): Self = StObject.set(x, "isRowMaster", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsRowMasterUndefined: Self = StObject.set(x, "isRowMaster", js.undefined)
      
      @scala.inline
      def setIsRowSelectable(value: /* node */ RowNode => Boolean): Self = StObject.set(x, "isRowSelectable", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsRowSelectableUndefined: Self = StObject.set(x, "isRowSelectable", js.undefined)
      
      @scala.inline
      def setLoadingOverlayComponent(value: InstantiableILoadingOverlayComp | String): Self = StObject.set(x, "loadingOverlayComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingOverlayComponentFramework(value: js.Any): Self = StObject.set(x, "loadingOverlayComponentFramework", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingOverlayComponentFrameworkUndefined: Self = StObject.set(x, "loadingOverlayComponentFramework", js.undefined)
      
      @scala.inline
      def setLoadingOverlayComponentUndefined: Self = StObject.set(x, "loadingOverlayComponent", js.undefined)
      
      @scala.inline
      def setLocaleText(value: js.Any): Self = StObject.set(x, "localeText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleTextFunc(value: js.Function): Self = StObject.set(x, "localeTextFunc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleTextFuncUndefined: Self = StObject.set(x, "localeTextFunc", js.undefined)
      
      @scala.inline
      def setLocaleTextUndefined: Self = StObject.set(x, "localeText", js.undefined)
      
      @scala.inline
      def setMasterDetail(value: Boolean): Self = StObject.set(x, "masterDetail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMasterDetailUndefined: Self = StObject.set(x, "masterDetail", js.undefined)
      
      @scala.inline
      def setMaxBlocksInCache(value: Double): Self = StObject.set(x, "maxBlocksInCache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxBlocksInCacheUndefined: Self = StObject.set(x, "maxBlocksInCache", js.undefined)
      
      @scala.inline
      def setMaxColWidth(value: Double): Self = StObject.set(x, "maxColWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxColWidthUndefined: Self = StObject.set(x, "maxColWidth", js.undefined)
      
      @scala.inline
      def setMaxConcurrentDatasourceRequests(value: Double): Self = StObject.set(x, "maxConcurrentDatasourceRequests", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxConcurrentDatasourceRequestsUndefined: Self = StObject.set(x, "maxConcurrentDatasourceRequests", js.undefined)
      
      @scala.inline
      def setMinColWidth(value: Double): Self = StObject.set(x, "minColWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinColWidthUndefined: Self = StObject.set(x, "minColWidth", js.undefined)
      
      @scala.inline
      def setMultiSortKey(value: String): Self = StObject.set(x, "multiSortKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiSortKeyUndefined: Self = StObject.set(x, "multiSortKey", js.undefined)
      
      @scala.inline
      def setNavigateToNextCell(value: /* params */ NavigateToNextCellParams => GridCellDef): Self = StObject.set(x, "navigateToNextCell", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNavigateToNextCellUndefined: Self = StObject.set(x, "navigateToNextCell", js.undefined)
      
      @scala.inline
      def setNoRowsOverlayComponent(value: InstantiableINoRowsOverlayComp | String): Self = StObject.set(x, "noRowsOverlayComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoRowsOverlayComponentFramework(value: js.Any): Self = StObject.set(x, "noRowsOverlayComponentFramework", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoRowsOverlayComponentFrameworkUndefined: Self = StObject.set(x, "noRowsOverlayComponentFramework", js.undefined)
      
      @scala.inline
      def setNoRowsOverlayComponentUndefined: Self = StObject.set(x, "noRowsOverlayComponent", js.undefined)
      
      @scala.inline
      def setOnBodyScroll(value: /* event */ BodyScrollEvent => Unit): Self = StObject.set(x, "onBodyScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBodyScrollUndefined: Self = StObject.set(x, "onBodyScroll", js.undefined)
      
      @scala.inline
      def setOnCellClicked(value: /* event */ CellClickedEvent => Unit): Self = StObject.set(x, "onCellClicked", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCellClickedUndefined: Self = StObject.set(x, "onCellClicked", js.undefined)
      
      @scala.inline
      def setOnCellContextMenu(value: /* event */ CellContextMenuEvent => Unit): Self = StObject.set(x, "onCellContextMenu", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCellContextMenuUndefined: Self = StObject.set(x, "onCellContextMenu", js.undefined)
      
      @scala.inline
      def setOnCellDoubleClicked(value: /* event */ CellDoubleClickedEvent => Unit): Self = StObject.set(x, "onCellDoubleClicked", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCellDoubleClickedUndefined: Self = StObject.set(x, "onCellDoubleClicked", js.undefined)
      
      @scala.inline
      def setOnCellEditingStarted(value: /* event */ CellEditingStartedEvent => Unit): Self = StObject.set(x, "onCellEditingStarted", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCellEditingStartedUndefined: Self = StObject.set(x, "onCellEditingStarted", js.undefined)
      
      @scala.inline
      def setOnCellEditingStopped(value: /* event */ CellEditingStoppedEvent => Unit): Self = StObject.set(x, "onCellEditingStopped", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCellEditingStoppedUndefined: Self = StObject.set(x, "onCellEditingStopped", js.undefined)
      
      @scala.inline
      def setOnCellFocused(value: /* event */ CellFocusedEvent => Unit): Self = StObject.set(x, "onCellFocused", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCellFocusedUndefined: Self = StObject.set(x, "onCellFocused", js.undefined)
      
      @scala.inline
      def setOnCellMouseDown(value: /* event */ CellMouseDownEvent => Unit): Self = StObject.set(x, "onCellMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCellMouseDownUndefined: Self = StObject.set(x, "onCellMouseDown", js.undefined)
      
      @scala.inline
      def setOnCellMouseOut(value: /* event */ CellMouseOutEvent => Unit): Self = StObject.set(x, "onCellMouseOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCellMouseOutUndefined: Self = StObject.set(x, "onCellMouseOut", js.undefined)
      
      @scala.inline
      def setOnCellMouseOver(value: /* event */ CellMouseOverEvent => Unit): Self = StObject.set(x, "onCellMouseOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCellMouseOverUndefined: Self = StObject.set(x, "onCellMouseOver", js.undefined)
      
      @scala.inline
      def setOnCellValueChanged(value: /* event */ CellValueChangedEvent => Unit): Self = StObject.set(x, "onCellValueChanged", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCellValueChangedUndefined: Self = StObject.set(x, "onCellValueChanged", js.undefined)
      
      @scala.inline
      def setOnColumnAggFuncChangeRequest(value: /* event */ ColumnAggFuncChangeRequestEvent => Unit): Self = StObject.set(x, "onColumnAggFuncChangeRequest", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnColumnAggFuncChangeRequestUndefined: Self = StObject.set(x, "onColumnAggFuncChangeRequest", js.undefined)
      
      @scala.inline
      def setOnColumnEverythingChanged(value: /* event */ ColumnEverythingChangedEvent => Unit): Self = StObject.set(x, "onColumnEverythingChanged", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnColumnEverythingChangedUndefined: Self = StObject.set(x, "onColumnEverythingChanged", js.undefined)
      
      @scala.inline
      def setOnColumnGroupOpened(value: /* event */ ColumnGroupOpenedEvent => Unit): Self = StObject.set(x, "onColumnGroupOpened", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnColumnGroupOpenedUndefined: Self = StObject.set(x, "onColumnGroupOpened", js.undefined)
      
      @scala.inline
      def setOnColumnMoved(value: /* event */ ColumnMovedEvent => Unit): Self = StObject.set(x, "onColumnMoved", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnColumnMovedUndefined: Self = StObject.set(x, "onColumnMoved", js.undefined)
      
      @scala.inline
      def setOnColumnPinned(value: /* event */ ColumnPinnedEvent => Unit): Self = StObject.set(x, "onColumnPinned", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnColumnPinnedUndefined: Self = StObject.set(x, "onColumnPinned", js.undefined)
      
      @scala.inline
      def setOnColumnPivotChangeRequest(value: /* event */ ColumnPivotChangeRequestEvent => Unit): Self = StObject.set(x, "onColumnPivotChangeRequest", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnColumnPivotChangeRequestUndefined: Self = StObject.set(x, "onColumnPivotChangeRequest", js.undefined)
      
      @scala.inline
      def setOnColumnPivotChanged(value: /* event */ ColumnPivotChangedEvent => Unit): Self = StObject.set(x, "onColumnPivotChanged", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnColumnPivotChangedUndefined: Self = StObject.set(x, "onColumnPivotChanged", js.undefined)
      
      @scala.inline
      def setOnColumnPivotModeChanged(value: /* event */ ColumnPivotModeChangedEvent => Unit): Self = StObject.set(x, "onColumnPivotModeChanged", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnColumnPivotModeChangedUndefined: Self = StObject.set(x, "onColumnPivotModeChanged", js.undefined)
      
      @scala.inline
      def setOnColumnResized(value: /* event */ ColumnResizedEvent => Unit): Self = StObject.set(x, "onColumnResized", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnColumnResizedUndefined: Self = StObject.set(x, "onColumnResized", js.undefined)
      
      @scala.inline
      def setOnColumnRowGroupChangeRequest(value: /* event */ ColumnRowGroupChangeRequestEvent => Unit): Self = StObject.set(x, "onColumnRowGroupChangeRequest", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnColumnRowGroupChangeRequestUndefined: Self = StObject.set(x, "onColumnRowGroupChangeRequest", js.undefined)
      
      @scala.inline
      def setOnColumnRowGroupChanged(value: /* event */ ColumnRowGroupChangedEvent => Unit): Self = StObject.set(x, "onColumnRowGroupChanged", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnColumnRowGroupChangedUndefined: Self = StObject.set(x, "onColumnRowGroupChanged", js.undefined)
      
      @scala.inline
      def setOnColumnValueChangeRequest(value: /* event */ ColumnValueChangeRequestEvent => Unit): Self = StObject.set(x, "onColumnValueChangeRequest", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnColumnValueChangeRequestUndefined: Self = StObject.set(x, "onColumnValueChangeRequest", js.undefined)
      
      @scala.inline
      def setOnColumnValueChanged(value: /* event */ ColumnValueChangedEvent => Unit): Self = StObject.set(x, "onColumnValueChanged", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnColumnValueChangedUndefined: Self = StObject.set(x, "onColumnValueChanged", js.undefined)
      
      @scala.inline
      def setOnColumnVisible(value: /* event */ ColumnVisibleEvent => Unit): Self = StObject.set(x, "onColumnVisible", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnColumnVisibleUndefined: Self = StObject.set(x, "onColumnVisible", js.undefined)
      
      @scala.inline
      def setOnDisplayedColumnsChanged(value: /* event */ DisplayedColumnsChangedEvent => Unit): Self = StObject.set(x, "onDisplayedColumnsChanged", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDisplayedColumnsChangedUndefined: Self = StObject.set(x, "onDisplayedColumnsChanged", js.undefined)
      
      @scala.inline
      def setOnDragStarted(value: /* event */ DragStartedEvent => Unit): Self = StObject.set(x, "onDragStarted", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragStartedUndefined: Self = StObject.set(x, "onDragStarted", js.undefined)
      
      @scala.inline
      def setOnDragStopped(value: /* event */ DragStoppedEvent => Unit): Self = StObject.set(x, "onDragStopped", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragStoppedUndefined: Self = StObject.set(x, "onDragStopped", js.undefined)
      
      @scala.inline
      def setOnFilterChanged(value: /* event */ FilterChangedEvent => Unit): Self = StObject.set(x, "onFilterChanged", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFilterChangedUndefined: Self = StObject.set(x, "onFilterChanged", js.undefined)
      
      @scala.inline
      def setOnFilterModified(value: /* event */ FilterModifiedEvent => Unit): Self = StObject.set(x, "onFilterModified", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFilterModifiedUndefined: Self = StObject.set(x, "onFilterModified", js.undefined)
      
      @scala.inline
      def setOnGridColumnsChanged(value: /* event */ GridColumnsChangedEvent => Unit): Self = StObject.set(x, "onGridColumnsChanged", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnGridColumnsChangedUndefined: Self = StObject.set(x, "onGridColumnsChanged", js.undefined)
      
      @scala.inline
      def setOnGridReady(value: /* event */ GridReadyEvent => Unit): Self = StObject.set(x, "onGridReady", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnGridReadyUndefined: Self = StObject.set(x, "onGridReady", js.undefined)
      
      @scala.inline
      def setOnGridSizeChanged(value: /* event */ js.Any => Unit): Self = StObject.set(x, "onGridSizeChanged", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnGridSizeChangedUndefined: Self = StObject.set(x, "onGridSizeChanged", js.undefined)
      
      @scala.inline
      def setOnModelUpdated(value: /* event */ ModelUpdatedEvent => Unit): Self = StObject.set(x, "onModelUpdated", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnModelUpdatedUndefined: Self = StObject.set(x, "onModelUpdated", js.undefined)
      
      @scala.inline
      def setOnNewColumnsLoaded(value: /* event */ NewColumnsLoadedEvent => Unit): Self = StObject.set(x, "onNewColumnsLoaded", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnNewColumnsLoadedUndefined: Self = StObject.set(x, "onNewColumnsLoaded", js.undefined)
      
      @scala.inline
      def setOnPaginationChanged(value: /* event */ PaginationChangedEvent => Unit): Self = StObject.set(x, "onPaginationChanged", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPaginationChangedUndefined: Self = StObject.set(x, "onPaginationChanged", js.undefined)
      
      @scala.inline
      def setOnPasteEnd(value: /* event */ PasteEndEvent => Unit): Self = StObject.set(x, "onPasteEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPasteEndUndefined: Self = StObject.set(x, "onPasteEnd", js.undefined)
      
      @scala.inline
      def setOnPasteStart(value: /* event */ PasteStartEvent => Unit): Self = StObject.set(x, "onPasteStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPasteStartUndefined: Self = StObject.set(x, "onPasteStart", js.undefined)
      
      @scala.inline
      def setOnPinnedRowDataChanged(value: /* event */ PinnedRowDataChangedEvent => Unit): Self = StObject.set(x, "onPinnedRowDataChanged", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPinnedRowDataChangedUndefined: Self = StObject.set(x, "onPinnedRowDataChanged", js.undefined)
      
      @scala.inline
      def setOnRangeSelectionChanged(value: /* event */ RangeSelectionChangedEvent => Unit): Self = StObject.set(x, "onRangeSelectionChanged", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRangeSelectionChangedUndefined: Self = StObject.set(x, "onRangeSelectionChanged", js.undefined)
      
      @scala.inline
      def setOnRowClicked(value: /* event */ RowClickedEvent => Unit): Self = StObject.set(x, "onRowClicked", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRowClickedUndefined: Self = StObject.set(x, "onRowClicked", js.undefined)
      
      @scala.inline
      def setOnRowDataChanged(value: /* event */ RowDataChangedEvent => Unit): Self = StObject.set(x, "onRowDataChanged", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRowDataChangedUndefined: Self = StObject.set(x, "onRowDataChanged", js.undefined)
      
      @scala.inline
      def setOnRowDataUpdated(value: /* event */ RowDataUpdatedEvent => Unit): Self = StObject.set(x, "onRowDataUpdated", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRowDataUpdatedUndefined: Self = StObject.set(x, "onRowDataUpdated", js.undefined)
      
      @scala.inline
      def setOnRowDoubleClicked(value: /* event */ RowDoubleClickedEvent => Unit): Self = StObject.set(x, "onRowDoubleClicked", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRowDoubleClickedUndefined: Self = StObject.set(x, "onRowDoubleClicked", js.undefined)
      
      @scala.inline
      def setOnRowDragEnd(value: /* event */ RowDragEvent => Unit): Self = StObject.set(x, "onRowDragEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRowDragEndUndefined: Self = StObject.set(x, "onRowDragEnd", js.undefined)
      
      @scala.inline
      def setOnRowDragEnter(value: /* event */ RowDragEvent => Unit): Self = StObject.set(x, "onRowDragEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRowDragEnterUndefined: Self = StObject.set(x, "onRowDragEnter", js.undefined)
      
      @scala.inline
      def setOnRowDragLeave(value: /* event */ RowDragEvent => Unit): Self = StObject.set(x, "onRowDragLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRowDragLeaveUndefined: Self = StObject.set(x, "onRowDragLeave", js.undefined)
      
      @scala.inline
      def setOnRowDragMove(value: /* event */ RowDragEvent => Unit): Self = StObject.set(x, "onRowDragMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRowDragMoveUndefined: Self = StObject.set(x, "onRowDragMove", js.undefined)
      
      @scala.inline
      def setOnRowEditingStarted(value: /* event */ RowEditingStartedEvent => Unit): Self = StObject.set(x, "onRowEditingStarted", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRowEditingStartedUndefined: Self = StObject.set(x, "onRowEditingStarted", js.undefined)
      
      @scala.inline
      def setOnRowEditingStopped(value: /* event */ RowEditingStoppedEvent => Unit): Self = StObject.set(x, "onRowEditingStopped", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRowEditingStoppedUndefined: Self = StObject.set(x, "onRowEditingStopped", js.undefined)
      
      @scala.inline
      def setOnRowGroupOpened(value: /* event */ RowGroupOpenedEvent => Unit): Self = StObject.set(x, "onRowGroupOpened", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRowGroupOpenedUndefined: Self = StObject.set(x, "onRowGroupOpened", js.undefined)
      
      @scala.inline
      def setOnRowSelected(value: /* event */ RowSelectedEvent => Unit): Self = StObject.set(x, "onRowSelected", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRowSelectedUndefined: Self = StObject.set(x, "onRowSelected", js.undefined)
      
      @scala.inline
      def setOnRowValueChanged(value: /* event */ RowValueChangedEvent => Unit): Self = StObject.set(x, "onRowValueChanged", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRowValueChangedUndefined: Self = StObject.set(x, "onRowValueChanged", js.undefined)
      
      @scala.inline
      def setOnSelectionChanged(value: /* event */ SelectionChangedEvent => Unit): Self = StObject.set(x, "onSelectionChanged", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectionChangedUndefined: Self = StObject.set(x, "onSelectionChanged", js.undefined)
      
      @scala.inline
      def setOnSortChanged(value: /* event */ SortChangedEvent => Unit): Self = StObject.set(x, "onSortChanged", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSortChangedUndefined: Self = StObject.set(x, "onSortChanged", js.undefined)
      
      @scala.inline
      def setOnViewportChanged(value: /* event */ ViewportChangedEvent => Unit): Self = StObject.set(x, "onViewportChanged", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnViewportChangedUndefined: Self = StObject.set(x, "onViewportChanged", js.undefined)
      
      @scala.inline
      def setOnVirtualColumnsChanged(value: /* event */ VirtualColumnsChangedEvent => Unit): Self = StObject.set(x, "onVirtualColumnsChanged", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnVirtualColumnsChangedUndefined: Self = StObject.set(x, "onVirtualColumnsChanged", js.undefined)
      
      @scala.inline
      def setOnVirtualRowRemoved(value: /* event */ VirtualRowRemovedEvent => Unit): Self = StObject.set(x, "onVirtualRowRemoved", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnVirtualRowRemovedUndefined: Self = StObject.set(x, "onVirtualRowRemoved", js.undefined)
      
      @scala.inline
      def setOverlayLoadingTemplate(value: String): Self = StObject.set(x, "overlayLoadingTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayLoadingTemplateUndefined: Self = StObject.set(x, "overlayLoadingTemplate", js.undefined)
      
      @scala.inline
      def setOverlayNoRowsTemplate(value: String): Self = StObject.set(x, "overlayNoRowsTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayNoRowsTemplateUndefined: Self = StObject.set(x, "overlayNoRowsTemplate", js.undefined)
      
      @scala.inline
      def setPagination(value: Boolean): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaginationAutoPageSize(value: Boolean): Self = StObject.set(x, "paginationAutoPageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaginationAutoPageSizeUndefined: Self = StObject.set(x, "paginationAutoPageSize", js.undefined)
      
      @scala.inline
      def setPaginationNumberFormatter(value: /* params */ PaginationNumberFormatterParams => String): Self = StObject.set(x, "paginationNumberFormatter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPaginationNumberFormatterUndefined: Self = StObject.set(x, "paginationNumberFormatter", js.undefined)
      
      @scala.inline
      def setPaginationPageSize(value: Double): Self = StObject.set(x, "paginationPageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaginationPageSizeUndefined: Self = StObject.set(x, "paginationPageSize", js.undefined)
      
      @scala.inline
      def setPaginationStartPage(value: Double): Self = StObject.set(x, "paginationStartPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaginationStartPageUndefined: Self = StObject.set(x, "paginationStartPage", js.undefined)
      
      @scala.inline
      def setPaginationUndefined: Self = StObject.set(x, "pagination", js.undefined)
      
      @scala.inline
      def setPinnedBottomRowData(value: js.Array[_]): Self = StObject.set(x, "pinnedBottomRowData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPinnedBottomRowDataUndefined: Self = StObject.set(x, "pinnedBottomRowData", js.undefined)
      
      @scala.inline
      def setPinnedBottomRowDataVarargs(value: js.Any*): Self = StObject.set(x, "pinnedBottomRowData", js.Array(value :_*))
      
      @scala.inline
      def setPinnedTopRowData(value: js.Array[_]): Self = StObject.set(x, "pinnedTopRowData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPinnedTopRowDataUndefined: Self = StObject.set(x, "pinnedTopRowData", js.undefined)
      
      @scala.inline
      def setPinnedTopRowDataVarargs(value: js.Any*): Self = StObject.set(x, "pinnedTopRowData", js.Array(value :_*))
      
      @scala.inline
      def setPivotColumnGroupTotals(value: String): Self = StObject.set(x, "pivotColumnGroupTotals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPivotColumnGroupTotalsUndefined: Self = StObject.set(x, "pivotColumnGroupTotals", js.undefined)
      
      @scala.inline
      def setPivotGroupHeaderHeight(value: Double): Self = StObject.set(x, "pivotGroupHeaderHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPivotGroupHeaderHeightUndefined: Self = StObject.set(x, "pivotGroupHeaderHeight", js.undefined)
      
      @scala.inline
      def setPivotHeaderHeight(value: Double): Self = StObject.set(x, "pivotHeaderHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPivotHeaderHeightUndefined: Self = StObject.set(x, "pivotHeaderHeight", js.undefined)
      
      @scala.inline
      def setPivotMode(value: Boolean): Self = StObject.set(x, "pivotMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPivotModeUndefined: Self = StObject.set(x, "pivotMode", js.undefined)
      
      @scala.inline
      def setPivotPanelShow(value: String): Self = StObject.set(x, "pivotPanelShow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPivotPanelShowUndefined: Self = StObject.set(x, "pivotPanelShow", js.undefined)
      
      @scala.inline
      def setPivotRowTotals(value: String): Self = StObject.set(x, "pivotRowTotals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPivotRowTotalsUndefined: Self = StObject.set(x, "pivotRowTotals", js.undefined)
      
      @scala.inline
      def setPivotTotals(value: Boolean): Self = StObject.set(x, "pivotTotals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPivotTotalsUndefined: Self = StObject.set(x, "pivotTotals", js.undefined)
      
      @scala.inline
      def setPopupParent(value: HTMLElement): Self = StObject.set(x, "popupParent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupParentUndefined: Self = StObject.set(x, "popupParent", js.undefined)
      
      @scala.inline
      def setPostProcessPopup(value: /* params */ PostProcessPopupParams => Unit): Self = StObject.set(x, "postProcessPopup", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPostProcessPopupUndefined: Self = StObject.set(x, "postProcessPopup", js.undefined)
      
      @scala.inline
      def setPostSort(value: /* nodes */ js.Array[RowNode] => Unit): Self = StObject.set(x, "postSort", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPostSortUndefined: Self = StObject.set(x, "postSort", js.undefined)
      
      @scala.inline
      def setProcessCellForClipboard(value: /* params */ ProcessCellForExportParams => _): Self = StObject.set(x, "processCellForClipboard", js.Any.fromFunction1(value))
      
      @scala.inline
      def setProcessCellForClipboardUndefined: Self = StObject.set(x, "processCellForClipboard", js.undefined)
      
      @scala.inline
      def setProcessCellFromClipboard(value: /* params */ ProcessCellForExportParams => _): Self = StObject.set(x, "processCellFromClipboard", js.Any.fromFunction1(value))
      
      @scala.inline
      def setProcessCellFromClipboardUndefined: Self = StObject.set(x, "processCellFromClipboard", js.undefined)
      
      @scala.inline
      def setProcessDataFromClipboard(value: /* params */ ProcessDataFromClipboardParams => js.Array[js.Array[String]]): Self = StObject.set(x, "processDataFromClipboard", js.Any.fromFunction1(value))
      
      @scala.inline
      def setProcessDataFromClipboardUndefined: Self = StObject.set(x, "processDataFromClipboard", js.undefined)
      
      @scala.inline
      def setProcessHeaderForClipboard(value: /* params */ ProcessHeaderForExportParams => _): Self = StObject.set(x, "processHeaderForClipboard", js.Any.fromFunction1(value))
      
      @scala.inline
      def setProcessHeaderForClipboardUndefined: Self = StObject.set(x, "processHeaderForClipboard", js.undefined)
      
      @scala.inline
      def setProcessRowPostCreate(value: /* params */ ProcessRowParams => Unit): Self = StObject.set(x, "processRowPostCreate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setProcessRowPostCreateUndefined: Self = StObject.set(x, "processRowPostCreate", js.undefined)
      
      @scala.inline
      def setProcessSecondaryColDef(value: /* colDef */ ColDef => Unit): Self = StObject.set(x, "processSecondaryColDef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setProcessSecondaryColDefUndefined: Self = StObject.set(x, "processSecondaryColDef", js.undefined)
      
      @scala.inline
      def setProcessSecondaryColGroupDef(value: /* colGroupDef */ ColGroupDef => Unit): Self = StObject.set(x, "processSecondaryColGroupDef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setProcessSecondaryColGroupDefUndefined: Self = StObject.set(x, "processSecondaryColGroupDef", js.undefined)
      
      @scala.inline
      def setPurgeClosedRowNodes(value: Boolean): Self = StObject.set(x, "purgeClosedRowNodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPurgeClosedRowNodesUndefined: Self = StObject.set(x, "purgeClosedRowNodes", js.undefined)
      
      @scala.inline
      def setQuickFilterText(value: String): Self = StObject.set(x, "quickFilterText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuickFilterTextUndefined: Self = StObject.set(x, "quickFilterText", js.undefined)
      
      @scala.inline
      def setRememberGroupStateWhenNewData(value: Boolean): Self = StObject.set(x, "rememberGroupStateWhenNewData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRememberGroupStateWhenNewDataUndefined: Self = StObject.set(x, "rememberGroupStateWhenNewData", js.undefined)
      
      @scala.inline
      def setRowBuffer(value: Double): Self = StObject.set(x, "rowBuffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowBufferUndefined: Self = StObject.set(x, "rowBuffer", js.undefined)
      
      @scala.inline
      def setRowClass(value: String | js.Array[String]): Self = StObject.set(x, "rowClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowClassRules(value: StringDictionary[js.Function | String]): Self = StObject.set(x, "rowClassRules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowClassRulesUndefined: Self = StObject.set(x, "rowClassRules", js.undefined)
      
      @scala.inline
      def setRowClassUndefined: Self = StObject.set(x, "rowClass", js.undefined)
      
      @scala.inline
      def setRowClassVarargs(value: String*): Self = StObject.set(x, "rowClass", js.Array(value :_*))
      
      @scala.inline
      def setRowData(value: js.Array[_]): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowDataUndefined: Self = StObject.set(x, "rowData", js.undefined)
      
      @scala.inline
      def setRowDataVarargs(value: js.Any*): Self = StObject.set(x, "rowData", js.Array(value :_*))
      
      @scala.inline
      def setRowDeselection(value: Boolean): Self = StObject.set(x, "rowDeselection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowDeselectionUndefined: Self = StObject.set(x, "rowDeselection", js.undefined)
      
      @scala.inline
      def setRowDragManaged(value: Boolean): Self = StObject.set(x, "rowDragManaged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowDragManagedUndefined: Self = StObject.set(x, "rowDragManaged", js.undefined)
      
      @scala.inline
      def setRowGroupPanelShow(value: String): Self = StObject.set(x, "rowGroupPanelShow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowGroupPanelShowUndefined: Self = StObject.set(x, "rowGroupPanelShow", js.undefined)
      
      @scala.inline
      def setRowHeight(value: Double): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowHeightUndefined: Self = StObject.set(x, "rowHeight", js.undefined)
      
      @scala.inline
      def setRowModelType(value: String): Self = StObject.set(x, "rowModelType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowModelTypeUndefined: Self = StObject.set(x, "rowModelType", js.undefined)
      
      @scala.inline
      def setRowMultiSelectWithClick(value: Boolean): Self = StObject.set(x, "rowMultiSelectWithClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowMultiSelectWithClickUndefined: Self = StObject.set(x, "rowMultiSelectWithClick", js.undefined)
      
      @scala.inline
      def setRowSelection(value: String): Self = StObject.set(x, "rowSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowSelectionUndefined: Self = StObject.set(x, "rowSelection", js.undefined)
      
      @scala.inline
      def setRowStyle(value: js.Any): Self = StObject.set(x, "rowStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowStyleUndefined: Self = StObject.set(x, "rowStyle", js.undefined)
      
      @scala.inline
      def setScrollbarWidth(value: Double): Self = StObject.set(x, "scrollbarWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollbarWidthUndefined: Self = StObject.set(x, "scrollbarWidth", js.undefined)
      
      @scala.inline
      def setSendToClipboard(value: /* params */ js.Any => Unit): Self = StObject.set(x, "sendToClipboard", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSendToClipboardUndefined: Self = StObject.set(x, "sendToClipboard", js.undefined)
      
      @scala.inline
      def setServerSideDatasource(value: IServerSideDatasource): Self = StObject.set(x, "serverSideDatasource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerSideDatasourceUndefined: Self = StObject.set(x, "serverSideDatasource", js.undefined)
      
      @scala.inline
      def setServerSideSortingAlwaysResets(value: Boolean): Self = StObject.set(x, "serverSideSortingAlwaysResets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerSideSortingAlwaysResetsUndefined: Self = StObject.set(x, "serverSideSortingAlwaysResets", js.undefined)
      
      @scala.inline
      def setShowToolPanel(value: Boolean): Self = StObject.set(x, "showToolPanel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowToolPanelUndefined: Self = StObject.set(x, "showToolPanel", js.undefined)
      
      @scala.inline
      def setSingleClickEdit(value: Boolean): Self = StObject.set(x, "singleClickEdit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSingleClickEditUndefined: Self = StObject.set(x, "singleClickEdit", js.undefined)
      
      @scala.inline
      def setSlaveGrids(value: js.Array[GridOptions]): Self = StObject.set(x, "slaveGrids", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlaveGridsUndefined: Self = StObject.set(x, "slaveGrids", js.undefined)
      
      @scala.inline
      def setSlaveGridsVarargs(value: GridOptions*): Self = StObject.set(x, "slaveGrids", js.Array(value :_*))
      
      @scala.inline
      def setSortingOrder(value: js.Array[String]): Self = StObject.set(x, "sortingOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortingOrderUndefined: Self = StObject.set(x, "sortingOrder", js.undefined)
      
      @scala.inline
      def setSortingOrderVarargs(value: String*): Self = StObject.set(x, "sortingOrder", js.Array(value :_*))
      
      @scala.inline
      def setStopEditingWhenGridLosesFocus(value: Boolean): Self = StObject.set(x, "stopEditingWhenGridLosesFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopEditingWhenGridLosesFocusUndefined: Self = StObject.set(x, "stopEditingWhenGridLosesFocus", js.undefined)
      
      @scala.inline
      def setSuppressAggAtRootLevel(value: Boolean): Self = StObject.set(x, "suppressAggAtRootLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressAggAtRootLevelUndefined: Self = StObject.set(x, "suppressAggAtRootLevel", js.undefined)
      
      @scala.inline
      def setSuppressAggFuncInHeader(value: Boolean): Self = StObject.set(x, "suppressAggFuncInHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressAggFuncInHeaderUndefined: Self = StObject.set(x, "suppressAggFuncInHeader", js.undefined)
      
      @scala.inline
      def setSuppressAnimationFrame(value: Boolean): Self = StObject.set(x, "suppressAnimationFrame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressAnimationFrameUndefined: Self = StObject.set(x, "suppressAnimationFrame", js.undefined)
      
      @scala.inline
      def setSuppressAsyncEvents(value: Boolean): Self = StObject.set(x, "suppressAsyncEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressAsyncEventsUndefined: Self = StObject.set(x, "suppressAsyncEvents", js.undefined)
      
      @scala.inline
      def setSuppressAutoSize(value: Boolean): Self = StObject.set(x, "suppressAutoSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressAutoSizeUndefined: Self = StObject.set(x, "suppressAutoSize", js.undefined)
      
      @scala.inline
      def setSuppressCellSelection(value: Boolean): Self = StObject.set(x, "suppressCellSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressCellSelectionUndefined: Self = StObject.set(x, "suppressCellSelection", js.undefined)
      
      @scala.inline
      def setSuppressChangeDetection(value: Boolean): Self = StObject.set(x, "suppressChangeDetection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressChangeDetectionUndefined: Self = StObject.set(x, "suppressChangeDetection", js.undefined)
      
      @scala.inline
      def setSuppressClickEdit(value: Boolean): Self = StObject.set(x, "suppressClickEdit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressClickEditUndefined: Self = StObject.set(x, "suppressClickEdit", js.undefined)
      
      @scala.inline
      def setSuppressClipboardPaste(value: Boolean): Self = StObject.set(x, "suppressClipboardPaste", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressClipboardPasteUndefined: Self = StObject.set(x, "suppressClipboardPaste", js.undefined)
      
      @scala.inline
      def setSuppressColumnMoveAnimation(value: Boolean): Self = StObject.set(x, "suppressColumnMoveAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressColumnMoveAnimationUndefined: Self = StObject.set(x, "suppressColumnMoveAnimation", js.undefined)
      
      @scala.inline
      def setSuppressColumnVirtualisation(value: Boolean): Self = StObject.set(x, "suppressColumnVirtualisation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressColumnVirtualisationUndefined: Self = StObject.set(x, "suppressColumnVirtualisation", js.undefined)
      
      @scala.inline
      def setSuppressContextMenu(value: Boolean): Self = StObject.set(x, "suppressContextMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressContextMenuUndefined: Self = StObject.set(x, "suppressContextMenu", js.undefined)
      
      @scala.inline
      def setSuppressCopyRowsToClipboard(value: Boolean): Self = StObject.set(x, "suppressCopyRowsToClipboard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressCopyRowsToClipboardUndefined: Self = StObject.set(x, "suppressCopyRowsToClipboard", js.undefined)
      
      @scala.inline
      def setSuppressCsvExport(value: Boolean): Self = StObject.set(x, "suppressCsvExport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressCsvExportUndefined: Self = StObject.set(x, "suppressCsvExport", js.undefined)
      
      @scala.inline
      def setSuppressDragLeaveHidesColumns(value: Boolean): Self = StObject.set(x, "suppressDragLeaveHidesColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressDragLeaveHidesColumnsUndefined: Self = StObject.set(x, "suppressDragLeaveHidesColumns", js.undefined)
      
      @scala.inline
      def setSuppressEnterpriseResetOnNewColumns(value: Boolean): Self = StObject.set(x, "suppressEnterpriseResetOnNewColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressEnterpriseResetOnNewColumnsUndefined: Self = StObject.set(x, "suppressEnterpriseResetOnNewColumns", js.undefined)
      
      @scala.inline
      def setSuppressExcelExport(value: Boolean): Self = StObject.set(x, "suppressExcelExport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressExcelExportUndefined: Self = StObject.set(x, "suppressExcelExport", js.undefined)
      
      @scala.inline
      def setSuppressFieldDotNotation(value: Boolean): Self = StObject.set(x, "suppressFieldDotNotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressFieldDotNotationUndefined: Self = StObject.set(x, "suppressFieldDotNotation", js.undefined)
      
      @scala.inline
      def setSuppressFocusAfterRefresh(value: Boolean): Self = StObject.set(x, "suppressFocusAfterRefresh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressFocusAfterRefreshUndefined: Self = StObject.set(x, "suppressFocusAfterRefresh", js.undefined)
      
      @scala.inline
      def setSuppressHorizontalScroll(value: Boolean): Self = StObject.set(x, "suppressHorizontalScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressHorizontalScrollUndefined: Self = StObject.set(x, "suppressHorizontalScroll", js.undefined)
      
      @scala.inline
      def setSuppressLoadingOverlay(value: Boolean): Self = StObject.set(x, "suppressLoadingOverlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressLoadingOverlayUndefined: Self = StObject.set(x, "suppressLoadingOverlay", js.undefined)
      
      @scala.inline
      def setSuppressMakeColumnVisibleAfterUnGroup(value: Boolean): Self = StObject.set(x, "suppressMakeColumnVisibleAfterUnGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressMakeColumnVisibleAfterUnGroupUndefined: Self = StObject.set(x, "suppressMakeColumnVisibleAfterUnGroup", js.undefined)
      
      @scala.inline
      def setSuppressMenuHide(value: Boolean): Self = StObject.set(x, "suppressMenuHide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressMenuHideUndefined: Self = StObject.set(x, "suppressMenuHide", js.undefined)
      
      @scala.inline
      def setSuppressMiddleClickScrolls(value: Boolean): Self = StObject.set(x, "suppressMiddleClickScrolls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressMiddleClickScrollsUndefined: Self = StObject.set(x, "suppressMiddleClickScrolls", js.undefined)
      
      @scala.inline
      def setSuppressMovableColumns(value: Boolean): Self = StObject.set(x, "suppressMovableColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressMovableColumnsUndefined: Self = StObject.set(x, "suppressMovableColumns", js.undefined)
      
      @scala.inline
      def setSuppressMultiRangeSelection(value: Boolean): Self = StObject.set(x, "suppressMultiRangeSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressMultiRangeSelectionUndefined: Self = StObject.set(x, "suppressMultiRangeSelection", js.undefined)
      
      @scala.inline
      def setSuppressMultiSort(value: Boolean): Self = StObject.set(x, "suppressMultiSort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressMultiSortUndefined: Self = StObject.set(x, "suppressMultiSort", js.undefined)
      
      @scala.inline
      def setSuppressNoRowsOverlay(value: Boolean): Self = StObject.set(x, "suppressNoRowsOverlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressNoRowsOverlayUndefined: Self = StObject.set(x, "suppressNoRowsOverlay", js.undefined)
      
      @scala.inline
      def setSuppressPaginationPanel(value: Boolean): Self = StObject.set(x, "suppressPaginationPanel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressPaginationPanelUndefined: Self = StObject.set(x, "suppressPaginationPanel", js.undefined)
      
      @scala.inline
      def setSuppressParentsInRowNodes(value: Boolean): Self = StObject.set(x, "suppressParentsInRowNodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressParentsInRowNodesUndefined: Self = StObject.set(x, "suppressParentsInRowNodes", js.undefined)
      
      @scala.inline
      def setSuppressPreventDefaultOnMouseWheel(value: Boolean): Self = StObject.set(x, "suppressPreventDefaultOnMouseWheel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressPreventDefaultOnMouseWheelUndefined: Self = StObject.set(x, "suppressPreventDefaultOnMouseWheel", js.undefined)
      
      @scala.inline
      def setSuppressPropertyNamesCheck(value: Boolean): Self = StObject.set(x, "suppressPropertyNamesCheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressPropertyNamesCheckUndefined: Self = StObject.set(x, "suppressPropertyNamesCheck", js.undefined)
      
      @scala.inline
      def setSuppressRowClickSelection(value: Boolean): Self = StObject.set(x, "suppressRowClickSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressRowClickSelectionUndefined: Self = StObject.set(x, "suppressRowClickSelection", js.undefined)
      
      @scala.inline
      def setSuppressRowDrag(value: Boolean): Self = StObject.set(x, "suppressRowDrag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressRowDragUndefined: Self = StObject.set(x, "suppressRowDrag", js.undefined)
      
      @scala.inline
      def setSuppressRowHoverHighlight(value: Boolean): Self = StObject.set(x, "suppressRowHoverHighlight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressRowHoverHighlightUndefined: Self = StObject.set(x, "suppressRowHoverHighlight", js.undefined)
      
      @scala.inline
      def setSuppressRowTransform(value: Boolean): Self = StObject.set(x, "suppressRowTransform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressRowTransformUndefined: Self = StObject.set(x, "suppressRowTransform", js.undefined)
      
      @scala.inline
      def setSuppressScrollOnNewData(value: Boolean): Self = StObject.set(x, "suppressScrollOnNewData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressScrollOnNewDataUndefined: Self = StObject.set(x, "suppressScrollOnNewData", js.undefined)
      
      @scala.inline
      def setSuppressTabbing(value: Boolean): Self = StObject.set(x, "suppressTabbing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressTabbingUndefined: Self = StObject.set(x, "suppressTabbing", js.undefined)
      
      @scala.inline
      def setSuppressTouch(value: Boolean): Self = StObject.set(x, "suppressTouch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressTouchUndefined: Self = StObject.set(x, "suppressTouch", js.undefined)
      
      @scala.inline
      def setTabToNextCell(value: /* params */ TabToNextCellParams => GridCellDef): Self = StObject.set(x, "tabToNextCell", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTabToNextCellUndefined: Self = StObject.set(x, "tabToNextCell", js.undefined)
      
      @scala.inline
      def setToolPanelSuppressColumnExpandAll(value: Boolean): Self = StObject.set(x, "toolPanelSuppressColumnExpandAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolPanelSuppressColumnExpandAllUndefined: Self = StObject.set(x, "toolPanelSuppressColumnExpandAll", js.undefined)
      
      @scala.inline
      def setToolPanelSuppressColumnFilter(value: Boolean): Self = StObject.set(x, "toolPanelSuppressColumnFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolPanelSuppressColumnFilterUndefined: Self = StObject.set(x, "toolPanelSuppressColumnFilter", js.undefined)
      
      @scala.inline
      def setToolPanelSuppressColumnSelectAll(value: Boolean): Self = StObject.set(x, "toolPanelSuppressColumnSelectAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolPanelSuppressColumnSelectAllUndefined: Self = StObject.set(x, "toolPanelSuppressColumnSelectAll", js.undefined)
      
      @scala.inline
      def setToolPanelSuppressPivotMode(value: Boolean): Self = StObject.set(x, "toolPanelSuppressPivotMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolPanelSuppressPivotModeUndefined: Self = StObject.set(x, "toolPanelSuppressPivotMode", js.undefined)
      
      @scala.inline
      def setToolPanelSuppressPivots(value: Boolean): Self = StObject.set(x, "toolPanelSuppressPivots", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolPanelSuppressPivotsUndefined: Self = StObject.set(x, "toolPanelSuppressPivots", js.undefined)
      
      @scala.inline
      def setToolPanelSuppressRowGroups(value: Boolean): Self = StObject.set(x, "toolPanelSuppressRowGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolPanelSuppressRowGroupsUndefined: Self = StObject.set(x, "toolPanelSuppressRowGroups", js.undefined)
      
      @scala.inline
      def setToolPanelSuppressSideButtons(value: Boolean): Self = StObject.set(x, "toolPanelSuppressSideButtons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolPanelSuppressSideButtonsUndefined: Self = StObject.set(x, "toolPanelSuppressSideButtons", js.undefined)
      
      @scala.inline
      def setToolPanelSuppressValues(value: Boolean): Self = StObject.set(x, "toolPanelSuppressValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolPanelSuppressValuesUndefined: Self = StObject.set(x, "toolPanelSuppressValues", js.undefined)
      
      @scala.inline
      def setTreeData(value: Boolean): Self = StObject.set(x, "treeData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeDataUndefined: Self = StObject.set(x, "treeData", js.undefined)
      
      @scala.inline
      def setUnSortIcon(value: Boolean): Self = StObject.set(x, "unSortIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnSortIconUndefined: Self = StObject.set(x, "unSortIcon", js.undefined)
      
      @scala.inline
      def setValueCache(value: Boolean): Self = StObject.set(x, "valueCache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueCacheNeverExpires(value: Boolean): Self = StObject.set(x, "valueCacheNeverExpires", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueCacheNeverExpiresUndefined: Self = StObject.set(x, "valueCacheNeverExpires", js.undefined)
      
      @scala.inline
      def setValueCacheUndefined: Self = StObject.set(x, "valueCache", js.undefined)
      
      @scala.inline
      def setViewportDatasource(value: IViewportDatasource): Self = StObject.set(x, "viewportDatasource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewportDatasourceUndefined: Self = StObject.set(x, "viewportDatasource", js.undefined)
      
      @scala.inline
      def setViewportRowModelBufferSize(value: Double): Self = StObject.set(x, "viewportRowModelBufferSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewportRowModelBufferSizeUndefined: Self = StObject.set(x, "viewportRowModelBufferSize", js.undefined)
      
      @scala.inline
      def setViewportRowModelPageSize(value: Double): Self = StObject.set(x, "viewportRowModelPageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewportRowModelPageSizeUndefined: Self = StObject.set(x, "viewportRowModelPageSize", js.undefined)
    }
  }
  
  type IsRowMaster = js.Function1[/* dataItem */ js.Any, Boolean]
  
  type IsRowSelectable = js.Function1[/* node */ RowNode, Boolean]
  
  @js.native
  trait MenuItemDef extends StObject {
    
    var action: js.UndefOr[js.Function0[Unit]] = js.native
    
    var checked: js.UndefOr[Boolean] = js.native
    
    var cssClasses: js.UndefOr[js.Array[String]] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var icon: js.UndefOr[HTMLElement | String] = js.native
    
    var name: String = js.native
    
    var shortcut: js.UndefOr[String] = js.native
    
    var subMenu: js.UndefOr[js.Array[MenuItemDef | String]] = js.native
    
    var tooltip: js.UndefOr[String] = js.native
  }
  object MenuItemDef {
    
    @scala.inline
    def apply(name: String): MenuItemDef = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuItemDef]
    }
    
    @scala.inline
    implicit class MenuItemDefMutableBuilder[Self <: MenuItemDef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: () => Unit): Self = StObject.set(x, "action", js.Any.fromFunction0(value))
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      @scala.inline
      def setCssClasses(value: js.Array[String]): Self = StObject.set(x, "cssClasses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssClassesUndefined: Self = StObject.set(x, "cssClasses", js.undefined)
      
      @scala.inline
      def setCssClassesVarargs(value: String*): Self = StObject.set(x, "cssClasses", js.Array(value :_*))
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setIcon(value: HTMLElement | String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortcut(value: String): Self = StObject.set(x, "shortcut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortcutUndefined: Self = StObject.set(x, "shortcut", js.undefined)
      
      @scala.inline
      def setSubMenu(value: js.Array[MenuItemDef | String]): Self = StObject.set(x, "subMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubMenuUndefined: Self = StObject.set(x, "subMenu", js.undefined)
      
      @scala.inline
      def setSubMenuVarargs(value: (MenuItemDef | String)*): Self = StObject.set(x, "subMenu", js.Array(value :_*))
      
      @scala.inline
      def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
  
  @js.native
  trait NavigateToNextCellParams extends StObject {
    
    var event: KeyboardEvent = js.native
    
    var key: Double = js.native
    
    var nextCellDef: GridCellDef = js.native
    
    var previousCellDef: GridCellDef = js.native
  }
  object NavigateToNextCellParams {
    
    @scala.inline
    def apply(event: KeyboardEvent, key: Double, nextCellDef: GridCellDef, previousCellDef: GridCellDef): NavigateToNextCellParams = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], nextCellDef = nextCellDef.asInstanceOf[js.Any], previousCellDef = previousCellDef.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavigateToNextCellParams]
    }
    
    @scala.inline
    implicit class NavigateToNextCellParamsMutableBuilder[Self <: NavigateToNextCellParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEvent(value: KeyboardEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextCellDef(value: GridCellDef): Self = StObject.set(x, "nextCellDef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousCellDef(value: GridCellDef): Self = StObject.set(x, "previousCellDef", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NodeChildDetails extends StObject {
    
    var children: js.UndefOr[js.Array[_]] = js.native
    
    var expanded: js.UndefOr[Boolean] = js.native
    
    var field: js.UndefOr[String] = js.native
    
    var group: Boolean = js.native
    
    var key: js.UndefOr[js.Any] = js.native
  }
  object NodeChildDetails {
    
    @scala.inline
    def apply(group: Boolean): NodeChildDetails = {
      val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeChildDetails]
    }
    
    @scala.inline
    implicit class NodeChildDetailsMutableBuilder[Self <: NodeChildDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[_]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: js.Any*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      @scala.inline
      def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      @scala.inline
      def setGroup(value: Boolean): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: js.Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
  
  @js.native
  trait PaginationNumberFormatterParams extends StObject {
    
    var value: Double = js.native
  }
  object PaginationNumberFormatterParams {
    
    @scala.inline
    def apply(value: Double): PaginationNumberFormatterParams = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaginationNumberFormatterParams]
    }
    
    @scala.inline
    implicit class PaginationNumberFormatterParamsMutableBuilder[Self <: PaginationNumberFormatterParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PostProcessPopupParams extends StObject {
    
    var column: js.UndefOr[Column] = js.native
    
    var ePopup: HTMLElement = js.native
    
    var eventSource: js.UndefOr[HTMLElement] = js.native
    
    var mouseEvent: js.UndefOr[MouseEvent | Touch] = js.native
    
    var rowNode: js.UndefOr[RowNode] = js.native
    
    var `type`: String = js.native
  }
  object PostProcessPopupParams {
    
    @scala.inline
    def apply(ePopup: HTMLElement, `type`: String): PostProcessPopupParams = {
      val __obj = js.Dynamic.literal(ePopup = ePopup.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PostProcessPopupParams]
    }
    
    @scala.inline
    implicit class PostProcessPopupParamsMutableBuilder[Self <: PostProcessPopupParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: Column): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      @scala.inline
      def setEPopup(value: HTMLElement): Self = StObject.set(x, "ePopup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventSource(value: HTMLElement): Self = StObject.set(x, "eventSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventSourceUndefined: Self = StObject.set(x, "eventSource", js.undefined)
      
      @scala.inline
      def setMouseEvent(value: MouseEvent | Touch): Self = StObject.set(x, "mouseEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouseEventUndefined: Self = StObject.set(x, "mouseEvent", js.undefined)
      
      @scala.inline
      def setRowNode(value: RowNode): Self = StObject.set(x, "rowNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowNodeUndefined: Self = StObject.set(x, "rowNode", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ProcessDataFromClipboardParams extends StObject {
    
    var data: js.Array[js.Array[String]] = js.native
  }
  object ProcessDataFromClipboardParams {
    
    @scala.inline
    def apply(data: js.Array[js.Array[String]]): ProcessDataFromClipboardParams = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcessDataFromClipboardParams]
    }
    
    @scala.inline
    implicit class ProcessDataFromClipboardParamsMutableBuilder[Self <: ProcessDataFromClipboardParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Array[js.Array[String]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: js.Array[String]*): Self = StObject.set(x, "data", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ProcessRowParams extends StObject {
    
    def addRenderedRowListener(eventType: String, listener: js.Function): Unit = js.native
    
    var api: GridApi = js.native
    
    var columnApi: ColumnApi = js.native
    
    var context: js.Any = js.native
    
    var ePinnedLeftRow: HTMLElement = js.native
    
    var ePinnedRightRow: HTMLElement = js.native
    
    var eRow: HTMLElement = js.native
    
    var node: RowNode = js.native
    
    var rowIndex: Double = js.native
  }
  object ProcessRowParams {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class ProcessRowParamsMutableBuilder[Self <: ProcessRowParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddRenderedRowListener(value: (String, js.Function) => Unit): Self = StObject.set(x, "addRenderedRowListener", js.Any.fromFunction2(value))
      
      @scala.inline
      def setApi(value: GridApi): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnApi(value: ColumnApi): Self = StObject.set(x, "columnApi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEPinnedLeftRow(value: HTMLElement): Self = StObject.set(x, "ePinnedLeftRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEPinnedRightRow(value: HTMLElement): Self = StObject.set(x, "ePinnedRightRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setERow(value: HTMLElement): Self = StObject.set(x, "eRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: RowNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TabToNextCellParams extends StObject {
    
    var backwards: Boolean = js.native
    
    var editing: Boolean = js.native
    
    var nextCellDef: GridCellDef = js.native
    
    var previousCellDef: GridCellDef = js.native
  }
  object TabToNextCellParams {
    
    @scala.inline
    def apply(backwards: Boolean, editing: Boolean, nextCellDef: GridCellDef, previousCellDef: GridCellDef): TabToNextCellParams = {
      val __obj = js.Dynamic.literal(backwards = backwards.asInstanceOf[js.Any], editing = editing.asInstanceOf[js.Any], nextCellDef = nextCellDef.asInstanceOf[js.Any], previousCellDef = previousCellDef.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabToNextCellParams]
    }
    
    @scala.inline
    implicit class TabToNextCellParamsMutableBuilder[Self <: TabToNextCellParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackwards(value: Boolean): Self = StObject.set(x, "backwards", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditing(value: Boolean): Self = StObject.set(x, "editing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextCellDef(value: GridCellDef): Self = StObject.set(x, "nextCellDef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousCellDef(value: GridCellDef): Self = StObject.set(x, "previousCellDef", value.asInstanceOf[js.Any])
    }
  }
}
