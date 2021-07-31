package typings.agGrid

import org.scalablytyped.runtime.StringDictionary
import typings.agGrid.anon.InstantiableAny
import typings.agGrid.anon.InstantiableICellEditorComp
import typings.agGrid.anon.InstantiableICellRendererComp
import typings.agGrid.anon.InstantiableIFilterComp
import typings.agGrid.anon.InstantiableIFloatingFilterComp
import typings.agGrid.anon.InstantiableIHeaderGroupComp
import typings.agGrid.columnApiMod.ColumnApi
import typings.agGrid.columnMod.Column
import typings.agGrid.componentResolverMod.ComponentHolder
import typings.agGrid.componentResolverMod.DynamicComponentDef
import typings.agGrid.componentResolverMod.DynamicComponentParams
import typings.agGrid.eventsMod.CellClickedEvent
import typings.agGrid.eventsMod.CellContextMenuEvent
import typings.agGrid.eventsMod.CellDoubleClickedEvent
import typings.agGrid.gridApiMod.GridApi
import typings.agGrid.iCellRendererMod.ICellRendererFunc
import typings.agGrid.rowNodeMod.RowNode
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colDefMod {
  
  trait AbstractColDef extends StObject {
    
    /** Whether to show the column when the group is open / closed. */
    var columnGroupShow: js.UndefOr[String] = js.undefined
    
    /** CSS class for the header */
    var headerClass: js.UndefOr[
        String | js.Array[String] | (js.Function1[/* params */ js.Any, String | js.Array[String]])
      ] = js.undefined
    
    /** The name to render in the column header */
    var headerName: js.UndefOr[String] = js.undefined
    
    /** Tooltip for the column header */
    var headerTooltip: js.UndefOr[String] = js.undefined
    
    /** Expression or function to get the cells value. */
    var headerValueGetter: js.UndefOr[String | js.Function] = js.undefined
    
    /** Never set this, it is used internally by grid when doing in-grid pivoting */
    var pivotKeys: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Set to true to not include this column in the toolpanel */
    var suppressToolPanel: js.UndefOr[Boolean] = js.undefined
    
    /** CSS class for the header */
    var toolPanelClass: js.UndefOr[
        String | js.Array[String] | (js.Function1[/* params */ js.Any, String | js.Array[String]])
      ] = js.undefined
  }
  object AbstractColDef {
    
    @scala.inline
    def apply(): AbstractColDef = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AbstractColDef]
    }
    
    @scala.inline
    implicit class AbstractColDefMutableBuilder[Self <: AbstractColDef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumnGroupShow(value: String): Self = StObject.set(x, "columnGroupShow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnGroupShowUndefined: Self = StObject.set(x, "columnGroupShow", js.undefined)
      
      @scala.inline
      def setHeaderClass(value: String | js.Array[String] | (js.Function1[/* params */ js.Any, String | js.Array[String]])): Self = StObject.set(x, "headerClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderClassFunction1(value: /* params */ js.Any => String | js.Array[String]): Self = StObject.set(x, "headerClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHeaderClassUndefined: Self = StObject.set(x, "headerClass", js.undefined)
      
      @scala.inline
      def setHeaderClassVarargs(value: String*): Self = StObject.set(x, "headerClass", js.Array(value :_*))
      
      @scala.inline
      def setHeaderName(value: String): Self = StObject.set(x, "headerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderNameUndefined: Self = StObject.set(x, "headerName", js.undefined)
      
      @scala.inline
      def setHeaderTooltip(value: String): Self = StObject.set(x, "headerTooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderTooltipUndefined: Self = StObject.set(x, "headerTooltip", js.undefined)
      
      @scala.inline
      def setHeaderValueGetter(value: String | js.Function): Self = StObject.set(x, "headerValueGetter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderValueGetterUndefined: Self = StObject.set(x, "headerValueGetter", js.undefined)
      
      @scala.inline
      def setPivotKeys(value: js.Array[String]): Self = StObject.set(x, "pivotKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPivotKeysUndefined: Self = StObject.set(x, "pivotKeys", js.undefined)
      
      @scala.inline
      def setPivotKeysVarargs(value: String*): Self = StObject.set(x, "pivotKeys", js.Array(value :_*))
      
      @scala.inline
      def setSuppressToolPanel(value: Boolean): Self = StObject.set(x, "suppressToolPanel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressToolPanelUndefined: Self = StObject.set(x, "suppressToolPanel", js.undefined)
      
      @scala.inline
      def setToolPanelClass(value: String | js.Array[String] | (js.Function1[/* params */ js.Any, String | js.Array[String]])): Self = StObject.set(x, "toolPanelClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolPanelClassFunction1(value: /* params */ js.Any => String | js.Array[String]): Self = StObject.set(x, "toolPanelClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToolPanelClassUndefined: Self = StObject.set(x, "toolPanelClass", js.undefined)
      
      @scala.inline
      def setToolPanelClassVarargs(value: String*): Self = StObject.set(x, "toolPanelClass", js.Array(value :_*))
    }
  }
  
  trait BaseColDefParams extends StObject {
    
    var api: GridApi
    
    var colDef: ColDef
    
    var column: Column
    
    var columnApi: ColumnApi
    
    var context: js.Any
    
    var data: js.Any
    
    var node: RowNode
  }
  object BaseColDefParams {
    
    @scala.inline
    def apply(
      api: GridApi,
      colDef: ColDef,
      column: Column,
      columnApi: ColumnApi,
      context: js.Any,
      data: js.Any,
      node: RowNode
    ): BaseColDefParams = {
      val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], colDef = colDef.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseColDefParams]
    }
    
    @scala.inline
    implicit class BaseColDefParamsMutableBuilder[Self <: BaseColDefParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApi(value: GridApi): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColDef(value: ColDef): Self = StObject.set(x, "colDef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumn(value: Column): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnApi(value: ColumnApi): Self = StObject.set(x, "columnApi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: RowNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  trait BaseWithValueColDefParams
    extends StObject
       with BaseColDefParams {
    
    var value: js.Any
  }
  object BaseWithValueColDefParams {
    
    @scala.inline
    def apply(
      api: GridApi,
      colDef: ColDef,
      column: Column,
      columnApi: ColumnApi,
      context: js.Any,
      data: js.Any,
      node: RowNode,
      value: js.Any
    ): BaseWithValueColDefParams = {
      val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], colDef = colDef.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseWithValueColDefParams]
    }
    
    @scala.inline
    implicit class BaseWithValueColDefParamsMutableBuilder[Self <: BaseWithValueColDefParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait CellClassParams extends StObject {
    
    @JSName("$scope")
    var $scope: js.Any
    
    var api: GridApi
    
    var colDef: ColDef
    
    var context: js.Any
    
    var data: js.Any
    
    var node: RowNode
    
    var rowIndex: Double
    
    var value: js.Any
  }
  object CellClassParams {
    
    @scala.inline
    def apply(
      $scope: js.Any,
      api: GridApi,
      colDef: ColDef,
      context: js.Any,
      data: js.Any,
      node: RowNode,
      rowIndex: Double,
      value: js.Any
    ): CellClassParams = {
      val __obj = js.Dynamic.literal($scope = $scope.asInstanceOf[js.Any], api = api.asInstanceOf[js.Any], colDef = colDef.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[CellClassParams]
    }
    
    @scala.inline
    implicit class CellClassParamsMutableBuilder[Self <: CellClassParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$scope(value: js.Any): Self = StObject.set(x, "$scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApi(value: GridApi): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColDef(value: ColDef): Self = StObject.set(x, "colDef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: RowNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ColDef
    extends StObject
       with AbstractColDef
       with ComponentHolder {
    
    /** Name of function to use for aggregation. One of [sum,min,max,first,last] or a function. */
    var aggFunc: js.UndefOr[String | IAggFunc] = js.undefined
    
    /** Agg funcs allowed on this column. If missing, all installed agg funcs are allowed.
      * Can be eg ['sum','avg']. This will restrict what the GUI allows to select only.*/
    var allowedAggFuncs: js.UndefOr[js.Array[String]] = js.undefined
    
    /** True if this column should stretch rows height to fit contents */
    var autoHeight: js.UndefOr[Boolean] = js.undefined
    
    /** Class to use for the cell. Can be string, array of strings, or function. */
    var cellClass: js.UndefOr[
        String | js.Array[String] | (js.Function1[/* cellClassParams */ CellClassParams, String | js.Array[String]])
      ] = js.undefined
    
    /** Rules for applying css classes */
    var cellClassRules: js.UndefOr[StringDictionary[js.Function | String]] = js.undefined
    
    /** Cell editor */
    var cellEditor: js.UndefOr[InstantiableICellEditorComp | String] = js.undefined
    
    var cellEditorFramework: js.UndefOr[js.Any] = js.undefined
    
    var cellEditorParams: js.UndefOr[js.Any] = js.undefined
    
    var cellEditorSelector: js.UndefOr[js.Function1[/* params */ DynamicComponentParams, DynamicComponentDef]] = js.undefined
    
    /** A function for rendering a cell. */
    var cellRenderer: js.UndefOr[InstantiableICellRendererComp | ICellRendererFunc | String] = js.undefined
    
    var cellRendererFramework: js.UndefOr[js.Any] = js.undefined
    
    var cellRendererParams: js.UndefOr[js.Any] = js.undefined
    
    var cellRendererSelector: js.UndefOr[js.Function1[/* params */ DynamicComponentParams, DynamicComponentDef]] = js.undefined
    
    /** An object of css values. Or a function returning an object of css values. */
    var cellStyle: js.UndefOr[js.Object | (js.Function1[/* params */ js.Any, js.Object])] = js.undefined
    
    /** Set to true to render a selection checkbox in the column. */
    var checkboxSelection: js.UndefOr[Boolean | (js.Function1[/* params */ js.Any, Boolean])] = js.undefined
    
    /** The unique ID to give the column. This is optional. If missing, the ID will default to the field.
      *  If both field and colId are missing, a unique ID will be generated.
      *  This ID is used to identify the column in the API for sorting, filtering etc. */
    var colId: js.UndefOr[String] = js.undefined
    
    var colSpan: js.UndefOr[js.Function1[/* params */ ColSpanParams, Double]] = js.undefined
    
    /** Comparator function for custom sorting. */
    var comparator: js.UndefOr[
        js.Function5[
          /* valueA */ js.Any, 
          /* valueB */ js.Any, 
          /* nodeA */ js.UndefOr[RowNode], 
          /* nodeB */ js.UndefOr[RowNode], 
          /* isInverted */ js.UndefOr[Boolean], 
          Double
        ]
      ] = js.undefined
    
    /** Set to true if this col is editable, otherwise false. Can also be a function to have different rows editable. */
    var editable: js.UndefOr[Boolean | IsColumnFunc] = js.undefined
    
    /** If true, grid will flash cell after cell is refreshed */
    var enableCellChangeFlash: js.UndefOr[Boolean] = js.undefined
    
    /** If true, GUI will allow adding this columns as a pivot */
    var enablePivot: js.UndefOr[Boolean] = js.undefined
    
    /** If true, GUI will allow adding this columns as a row group */
    var enableRowGroup: js.UndefOr[Boolean] = js.undefined
    
    /** If true, GUI will allow adding this columns as a value */
    var enableValue: js.UndefOr[Boolean] = js.undefined
    
    /** Comparator for values, used by renderer to know if values have changed. Cells who's values have not changed don't get refreshed. */
    @JSName("equals")
    var equals_FColDef: js.UndefOr[js.Function2[/* valueA */ js.Any, /* valueB */ js.Any, Boolean]] = js.undefined
    
    /** The field of the row to get the cells data from */
    var field: js.UndefOr[String] = js.undefined
    
    /** one of the built in filter names: [set, number, text], or a filter function*/
    var filter: js.UndefOr[String | InstantiableIFilterComp] = js.undefined
    
    var filterFramework: js.UndefOr[js.Any] = js.undefined
    
    /** The filter params are specific to each filter! */
    var filterParams: js.UndefOr[js.Any] = js.undefined
    
    /** Expression or function to get the cells value for filtering. */
    var filterValueGetter: js.UndefOr[(js.Function1[/* params */ ValueGetterParams, js.Any]) | String] = js.undefined
    
    /** The custom header component to be used for rendering the floating filter. If none specified the default ag-Grid is used**/
    var floatingFilterComponent: js.UndefOr[InstantiableIFloatingFilterComp] = js.undefined
    
    var floatingFilterComponentFramework: js.UndefOr[InstantiableAny] = js.undefined
    
    var floatingFilterComponentParams: js.UndefOr[js.Any] = js.undefined
    
    /** To create the quick filter text for this column, if toString is not good enough on the value. */
    var getQuickFilterText: js.UndefOr[js.Function1[/* params */ GetQuickFilterTextParams, String]] = js.undefined
    
    /** If true, a 'select all' checkbox will be put into the header */
    var headerCheckboxSelection: js.UndefOr[Boolean | (js.Function1[/* params */ js.Any, Boolean])] = js.undefined
    
    /** If true, the header checkbox selection will work on filtered items*/
    var headerCheckboxSelectionFilteredOnly: js.UndefOr[Boolean] = js.undefined
    
    /** The custom header component to be used for rendering the component header. If none specified the default ag-Grid is used**/
    var headerComponent: js.UndefOr[String | InstantiableAny] = js.undefined
    
    /** The custom header component to be used for rendering the component header in the hosting framework (ie: React/Angular). If none specified the default ag-Grid is used**/
    var headerComponentFramework: js.UndefOr[InstantiableAny] = js.undefined
    
    /** The custom header component parameters**/
    var headerComponentParams: js.UndefOr[js.Any] = js.undefined
    
    /** Set to true for this column to be hidden. Naturally you might think, it would make more sense to call this field 'visible' and mark it false to hide,
      *  however we want all default values to be false and we want columns to be visible by default. */
    var hide: js.UndefOr[Boolean] = js.undefined
    
    /** Icons for this column. Leave blank to use default. */
    var icons: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /** Function to return the key for a value - use this if the value is an object (not a primitive type) and you
      * want to a) group by this field or b) use set filter on this field. */
    var keyCreator: js.UndefOr[js.Function] = js.undefined
    
    /** Set to true to block the user pinning the column, the column can only be pinned via definitions or API */
    var lockPinned: js.UndefOr[Boolean] = js.undefined
    
    /** Set to true to make sure this column is always first. Other columns, if movable, cannot move before this column. */
    var lockPosition: js.UndefOr[Boolean] = js.undefined
    
    /** Set to true to block the user showing / hiding the column, the column can only be shown / hidden via definitions or API */
    var lockVisible: js.UndefOr[Boolean] = js.undefined
    
    /** Max width, in pixels, of the cell */
    var maxWidth: js.UndefOr[Double] = js.undefined
    
    /** The menu tabs to show, and in which order, the valid values for this property are:
      * filterMenuTab, generalMenuTab, columnsMenuTab **/
    var menuTabs: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Min width, in pixels, of the cell */
    var minWidth: js.UndefOr[Double] = js.undefined
    
    /** Callbacks for editing. See editing section for further details.
      * Return true if the update was successful, or false if not.
      * If false, then skips the UI refresh and no events are emitted.
      * Return false if the values are the same (ie no update). */
    var newValueHandler: js.UndefOr[js.Function1[/* params */ js.Any, Boolean]] = js.undefined
    
    /** Function callback, gets called when a cell is clicked. */
    var onCellClicked: js.UndefOr[js.Function1[/* event */ CellClickedEvent, Unit]] = js.undefined
    
    /** Function callback, gets called when a cell is right clicked. */
    var onCellContextMenu: js.UndefOr[js.Function1[/* event */ CellContextMenuEvent, Unit]] = js.undefined
    
    /** Function callback, gets called when a cell is double clicked. */
    var onCellDoubleClicked: js.UndefOr[js.Function1[/* event */ CellDoubleClickedEvent, Unit]] = js.undefined
    
    /** Callbacks for editing.See editing section for further details. */
    var onCellValueChanged: js.UndefOr[js.Function] = js.undefined
    
    /** Whether this column is pinned or not. */
    var pinned: js.UndefOr[Boolean | String] = js.undefined
    
    /** A function for rendering a pinned row cell. */
    var pinnedRowCellRenderer: js.UndefOr[InstantiableICellRendererComp | ICellRendererFunc | String] = js.undefined
    
    var pinnedRowCellRendererFramework: js.UndefOr[js.Any] = js.undefined
    
    var pinnedRowCellRendererParams: js.UndefOr[js.Any] = js.undefined
    
    /** A function to format a pinned row value, should return a string. Not used for CSV export or copy to clipboard, only for UI cell rendering. */
    var pinnedRowValueFormatter: js.UndefOr[js.Function1[/* params */ ValueFormatterParams, String]] = js.undefined
    
    var pivot: js.UndefOr[Boolean] = js.undefined
    
    /** Comparator for ordering the pivot columns */
    var pivotComparator: js.UndefOr[js.Function2[/* valueA */ String, /* valueB */ String, Double]] = js.undefined
    
    /** To pivot by this column by default, either provide an index (eg pivotIndex=1), or set pivot=true. */
    var pivotIndex: js.UndefOr[Double] = js.undefined
    
    /** Never set this, it is used internally by grid when doing in-grid pivoting */
    var pivotTotalColumnIds: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Never set this, it is used internally by grid when doing in-grid pivoting */
    var pivotValueColumn: js.UndefOr[Column] = js.undefined
    
    var refData: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var rowDrag: js.UndefOr[Boolean | (js.Function1[/* params */ js.Any, Boolean])] = js.undefined
    
    var rowGroup: js.UndefOr[Boolean] = js.undefined
    
    /** To group by this column by default, either provide an index (eg rowGroupIndex=1), or set rowGroup=true. */
    var rowGroupIndex: js.UndefOr[Double] = js.undefined
    
    var rowSpan: js.UndefOr[js.Function1[/* params */ RowSpanParams, Double]] = js.undefined
    
    /** Set to true to have the grid place the values for the group into the cell, or put the name of a grouped column to just show that group. */
    var showRowGroup: js.UndefOr[String | Boolean] = js.undefined
    
    /** If true, this cell will be in editing mode after first click. */
    var singleClickEdit: js.UndefOr[Boolean] = js.undefined
    
    /** If sorting by default, set it here. Set to 'asc' or 'desc' */
    var sort: js.UndefOr[String] = js.undefined
    
    /** If sorting more than one column by default, the milliseconds when this column was sorted, so we know what order to sort the columns in. */
    var sortedAt: js.UndefOr[Double] = js.undefined
    
    /** The sort order, provide an array with any of the following in any order ['asc','desc',null] */
    var sortingOrder: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Set to true if you do not want this column to be auto-resizable by double clicking it's edge. */
    var suppressAutoSize: js.UndefOr[Boolean] = js.undefined
    
    /** Set to true to not flash this column for value changes */
    var suppressCellFlash: js.UndefOr[Boolean] = js.undefined
    
    /** Set to true to not allow filter on this column */
    var suppressFilter: js.UndefOr[Boolean] = js.undefined
    
    var suppressKeyboardEvent: js.UndefOr[js.Function1[/* params */ SuppressKeyboardEventParams, Boolean]] = js.undefined
    
    /** Set to true if no menu should be shown for this column header. */
    var suppressMenu: js.UndefOr[Boolean] = js.undefined
    
    /** Set to true to not allow moving this column via dragging it's header */
    var suppressMovable: js.UndefOr[Boolean] = js.undefined
    
    /** Set to tru if this col should not be navigable with the tab key. Can also be a function to have different rows editable. */
    var suppressNavigable: js.UndefOr[Boolean | IsColumnFunc] = js.undefined
    
    /** Set to true if this col should not be allowed take new values from teh clipboard . */
    var suppressPaste: js.UndefOr[Boolean | IsColumnFunc] = js.undefined
    
    /** Set to true if you do not want this column to be resizable by dragging it's edge. */
    var suppressResize: js.UndefOr[Boolean] = js.undefined
    
    /** Set to true if you want this columns width to be fixed during 'size to fit' operation. */
    var suppressSizeToFit: js.UndefOr[Boolean] = js.undefined
    
    /** Set to true if no sorting should be done for this column. */
    var suppressSorting: js.UndefOr[Boolean] = js.undefined
    
    /** Cell template to use for cell. Useful for AngularJS cells. */
    var template: js.UndefOr[String] = js.undefined
    
    /** Cell template URL to load template from to use for cell. Useful for AngularJS cells. */
    var templateUrl: js.UndefOr[String] = js.undefined
    
    /** The function used to calculate the tooltip of the object, tooltipField takes precedence*/
    var tooltip: js.UndefOr[js.Function1[/* params */ TooltipParams, String]] = js.undefined
    
    /** The field where we get the tooltip on the object */
    var tooltipField: js.UndefOr[String] = js.undefined
    
    /**
      * A comma separated string or array of strings containing ColumnType keys which can be used as a template for a column.
      * This helps to reduce duplication of properties when you have a lot of common column properties.
      */
    var `type`: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /** Set to true if you want the unsorted icon to be shown when no sort is applied to this column. */
    var unSortIcon: js.UndefOr[Boolean] = js.undefined
    
    /** A function to format a value, should return a string. Not used for CSV export or copy to clipboard, only for UI cell rendering. */
    var valueFormatter: js.UndefOr[js.Function1[/* params */ ValueFormatterParams, String]] = js.undefined
    
    /** Expression or function to get the cells value. */
    var valueGetter: js.UndefOr[(js.Function1[/* params */ ValueGetterParams, js.Any]) | String] = js.undefined
    
    /** Gets called after editing, converts the value in the cell. */
    var valueParser: js.UndefOr[js.Function1[/* params */ ValueParserParams, js.Any | String]] = js.undefined
    
    /** If not using a field, then this puts the value into the cell */
    var valueSetter: js.UndefOr[(js.Function1[/* params */ ValueSetterParams, Boolean]) | String] = js.undefined
    
    /** Initial width, in pixels, of the cell */
    var width: js.UndefOr[Double] = js.undefined
  }
  object ColDef {
    
    @scala.inline
    def apply(): ColDef = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColDef]
    }
    
    @scala.inline
    implicit class ColDefMutableBuilder[Self <: ColDef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAggFunc(value: String | IAggFunc): Self = StObject.set(x, "aggFunc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAggFuncFunction1(value: /* input */ js.Array[js.Any] => js.Any): Self = StObject.set(x, "aggFunc", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAggFuncUndefined: Self = StObject.set(x, "aggFunc", js.undefined)
      
      @scala.inline
      def setAllowedAggFuncs(value: js.Array[String]): Self = StObject.set(x, "allowedAggFuncs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedAggFuncsUndefined: Self = StObject.set(x, "allowedAggFuncs", js.undefined)
      
      @scala.inline
      def setAllowedAggFuncsVarargs(value: String*): Self = StObject.set(x, "allowedAggFuncs", js.Array(value :_*))
      
      @scala.inline
      def setAutoHeight(value: Boolean): Self = StObject.set(x, "autoHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoHeightUndefined: Self = StObject.set(x, "autoHeight", js.undefined)
      
      @scala.inline
      def setCellClass(
        value: String | js.Array[String] | (js.Function1[/* cellClassParams */ CellClassParams, String | js.Array[String]])
      ): Self = StObject.set(x, "cellClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellClassFunction1(value: /* cellClassParams */ CellClassParams => String | js.Array[String]): Self = StObject.set(x, "cellClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCellClassRules(value: StringDictionary[js.Function | String]): Self = StObject.set(x, "cellClassRules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellClassRulesUndefined: Self = StObject.set(x, "cellClassRules", js.undefined)
      
      @scala.inline
      def setCellClassUndefined: Self = StObject.set(x, "cellClass", js.undefined)
      
      @scala.inline
      def setCellClassVarargs(value: String*): Self = StObject.set(x, "cellClass", js.Array(value :_*))
      
      @scala.inline
      def setCellEditor(value: InstantiableICellEditorComp | String): Self = StObject.set(x, "cellEditor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellEditorFramework(value: js.Any): Self = StObject.set(x, "cellEditorFramework", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellEditorFrameworkUndefined: Self = StObject.set(x, "cellEditorFramework", js.undefined)
      
      @scala.inline
      def setCellEditorParams(value: js.Any): Self = StObject.set(x, "cellEditorParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellEditorParamsUndefined: Self = StObject.set(x, "cellEditorParams", js.undefined)
      
      @scala.inline
      def setCellEditorSelector(value: /* params */ DynamicComponentParams => DynamicComponentDef): Self = StObject.set(x, "cellEditorSelector", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCellEditorSelectorUndefined: Self = StObject.set(x, "cellEditorSelector", js.undefined)
      
      @scala.inline
      def setCellEditorUndefined: Self = StObject.set(x, "cellEditor", js.undefined)
      
      @scala.inline
      def setCellRenderer(value: InstantiableICellRendererComp | ICellRendererFunc | String): Self = StObject.set(x, "cellRenderer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellRendererFramework(value: js.Any): Self = StObject.set(x, "cellRendererFramework", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellRendererFrameworkUndefined: Self = StObject.set(x, "cellRendererFramework", js.undefined)
      
      @scala.inline
      def setCellRendererFunction1(value: /* params */ js.Any => HTMLElement | String): Self = StObject.set(x, "cellRenderer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCellRendererParams(value: js.Any): Self = StObject.set(x, "cellRendererParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellRendererParamsUndefined: Self = StObject.set(x, "cellRendererParams", js.undefined)
      
      @scala.inline
      def setCellRendererSelector(value: /* params */ DynamicComponentParams => DynamicComponentDef): Self = StObject.set(x, "cellRendererSelector", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCellRendererSelectorUndefined: Self = StObject.set(x, "cellRendererSelector", js.undefined)
      
      @scala.inline
      def setCellRendererUndefined: Self = StObject.set(x, "cellRenderer", js.undefined)
      
      @scala.inline
      def setCellStyle(value: js.Object | (js.Function1[/* params */ js.Any, js.Object])): Self = StObject.set(x, "cellStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellStyleFunction1(value: /* params */ js.Any => js.Object): Self = StObject.set(x, "cellStyle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCellStyleUndefined: Self = StObject.set(x, "cellStyle", js.undefined)
      
      @scala.inline
      def setCheckboxSelection(value: Boolean | (js.Function1[/* params */ js.Any, Boolean])): Self = StObject.set(x, "checkboxSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckboxSelectionFunction1(value: /* params */ js.Any => Boolean): Self = StObject.set(x, "checkboxSelection", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCheckboxSelectionUndefined: Self = StObject.set(x, "checkboxSelection", js.undefined)
      
      @scala.inline
      def setColId(value: String): Self = StObject.set(x, "colId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColIdUndefined: Self = StObject.set(x, "colId", js.undefined)
      
      @scala.inline
      def setColSpan(value: /* params */ ColSpanParams => Double): Self = StObject.set(x, "colSpan", js.Any.fromFunction1(value))
      
      @scala.inline
      def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
      
      @scala.inline
      def setComparator(
        value: (/* valueA */ js.Any, /* valueB */ js.Any, /* nodeA */ js.UndefOr[RowNode], /* nodeB */ js.UndefOr[RowNode], /* isInverted */ js.UndefOr[Boolean]) => Double
      ): Self = StObject.set(x, "comparator", js.Any.fromFunction5(value))
      
      @scala.inline
      def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
      
      @scala.inline
      def setEditable(value: Boolean | IsColumnFunc): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditableFunction1(value: /* params */ IsColumnFuncParams => Boolean): Self = StObject.set(x, "editable", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
      
      @scala.inline
      def setEnableCellChangeFlash(value: Boolean): Self = StObject.set(x, "enableCellChangeFlash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableCellChangeFlashUndefined: Self = StObject.set(x, "enableCellChangeFlash", js.undefined)
      
      @scala.inline
      def setEnablePivot(value: Boolean): Self = StObject.set(x, "enablePivot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnablePivotUndefined: Self = StObject.set(x, "enablePivot", js.undefined)
      
      @scala.inline
      def setEnableRowGroup(value: Boolean): Self = StObject.set(x, "enableRowGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableRowGroupUndefined: Self = StObject.set(x, "enableRowGroup", js.undefined)
      
      @scala.inline
      def setEnableValue(value: Boolean): Self = StObject.set(x, "enableValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableValueUndefined: Self = StObject.set(x, "enableValue", js.undefined)
      
      @scala.inline
      def setEquals_(value: (/* valueA */ js.Any, /* valueB */ js.Any) => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEquals_Undefined: Self = StObject.set(x, "equals", js.undefined)
      
      @scala.inline
      def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      @scala.inline
      def setFilter(value: String | InstantiableIFilterComp): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterFramework(value: js.Any): Self = StObject.set(x, "filterFramework", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterFrameworkUndefined: Self = StObject.set(x, "filterFramework", js.undefined)
      
      @scala.inline
      def setFilterParams(value: js.Any): Self = StObject.set(x, "filterParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterParamsUndefined: Self = StObject.set(x, "filterParams", js.undefined)
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setFilterValueGetter(value: (js.Function1[/* params */ ValueGetterParams, js.Any]) | String): Self = StObject.set(x, "filterValueGetter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterValueGetterFunction1(value: /* params */ ValueGetterParams => js.Any): Self = StObject.set(x, "filterValueGetter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilterValueGetterUndefined: Self = StObject.set(x, "filterValueGetter", js.undefined)
      
      @scala.inline
      def setFloatingFilterComponent(value: InstantiableIFloatingFilterComp): Self = StObject.set(x, "floatingFilterComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloatingFilterComponentFramework(value: InstantiableAny): Self = StObject.set(x, "floatingFilterComponentFramework", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloatingFilterComponentFrameworkUndefined: Self = StObject.set(x, "floatingFilterComponentFramework", js.undefined)
      
      @scala.inline
      def setFloatingFilterComponentParams(value: js.Any): Self = StObject.set(x, "floatingFilterComponentParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloatingFilterComponentParamsUndefined: Self = StObject.set(x, "floatingFilterComponentParams", js.undefined)
      
      @scala.inline
      def setFloatingFilterComponentUndefined: Self = StObject.set(x, "floatingFilterComponent", js.undefined)
      
      @scala.inline
      def setGetQuickFilterText(value: /* params */ GetQuickFilterTextParams => String): Self = StObject.set(x, "getQuickFilterText", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetQuickFilterTextUndefined: Self = StObject.set(x, "getQuickFilterText", js.undefined)
      
      @scala.inline
      def setHeaderCheckboxSelection(value: Boolean | (js.Function1[/* params */ js.Any, Boolean])): Self = StObject.set(x, "headerCheckboxSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderCheckboxSelectionFilteredOnly(value: Boolean): Self = StObject.set(x, "headerCheckboxSelectionFilteredOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderCheckboxSelectionFilteredOnlyUndefined: Self = StObject.set(x, "headerCheckboxSelectionFilteredOnly", js.undefined)
      
      @scala.inline
      def setHeaderCheckboxSelectionFunction1(value: /* params */ js.Any => Boolean): Self = StObject.set(x, "headerCheckboxSelection", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHeaderCheckboxSelectionUndefined: Self = StObject.set(x, "headerCheckboxSelection", js.undefined)
      
      @scala.inline
      def setHeaderComponent(value: String | InstantiableAny): Self = StObject.set(x, "headerComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderComponentFramework(value: InstantiableAny): Self = StObject.set(x, "headerComponentFramework", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderComponentFrameworkUndefined: Self = StObject.set(x, "headerComponentFramework", js.undefined)
      
      @scala.inline
      def setHeaderComponentParams(value: js.Any): Self = StObject.set(x, "headerComponentParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderComponentParamsUndefined: Self = StObject.set(x, "headerComponentParams", js.undefined)
      
      @scala.inline
      def setHeaderComponentUndefined: Self = StObject.set(x, "headerComponent", js.undefined)
      
      @scala.inline
      def setHide(value: Boolean): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
      
      @scala.inline
      def setIcons(value: StringDictionary[String]): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
      
      @scala.inline
      def setKeyCreator(value: js.Function): Self = StObject.set(x, "keyCreator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyCreatorUndefined: Self = StObject.set(x, "keyCreator", js.undefined)
      
      @scala.inline
      def setLockPinned(value: Boolean): Self = StObject.set(x, "lockPinned", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLockPinnedUndefined: Self = StObject.set(x, "lockPinned", js.undefined)
      
      @scala.inline
      def setLockPosition(value: Boolean): Self = StObject.set(x, "lockPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLockPositionUndefined: Self = StObject.set(x, "lockPosition", js.undefined)
      
      @scala.inline
      def setLockVisible(value: Boolean): Self = StObject.set(x, "lockVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLockVisibleUndefined: Self = StObject.set(x, "lockVisible", js.undefined)
      
      @scala.inline
      def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      @scala.inline
      def setMenuTabs(value: js.Array[String]): Self = StObject.set(x, "menuTabs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuTabsUndefined: Self = StObject.set(x, "menuTabs", js.undefined)
      
      @scala.inline
      def setMenuTabsVarargs(value: String*): Self = StObject.set(x, "menuTabs", js.Array(value :_*))
      
      @scala.inline
      def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      @scala.inline
      def setNewValueHandler(value: /* params */ js.Any => Boolean): Self = StObject.set(x, "newValueHandler", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNewValueHandlerUndefined: Self = StObject.set(x, "newValueHandler", js.undefined)
      
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
      def setOnCellValueChanged(value: js.Function): Self = StObject.set(x, "onCellValueChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCellValueChangedUndefined: Self = StObject.set(x, "onCellValueChanged", js.undefined)
      
      @scala.inline
      def setPinned(value: Boolean | String): Self = StObject.set(x, "pinned", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPinnedRowCellRenderer(value: InstantiableICellRendererComp | ICellRendererFunc | String): Self = StObject.set(x, "pinnedRowCellRenderer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPinnedRowCellRendererFramework(value: js.Any): Self = StObject.set(x, "pinnedRowCellRendererFramework", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPinnedRowCellRendererFrameworkUndefined: Self = StObject.set(x, "pinnedRowCellRendererFramework", js.undefined)
      
      @scala.inline
      def setPinnedRowCellRendererFunction1(value: /* params */ js.Any => HTMLElement | String): Self = StObject.set(x, "pinnedRowCellRenderer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPinnedRowCellRendererParams(value: js.Any): Self = StObject.set(x, "pinnedRowCellRendererParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPinnedRowCellRendererParamsUndefined: Self = StObject.set(x, "pinnedRowCellRendererParams", js.undefined)
      
      @scala.inline
      def setPinnedRowCellRendererUndefined: Self = StObject.set(x, "pinnedRowCellRenderer", js.undefined)
      
      @scala.inline
      def setPinnedRowValueFormatter(value: /* params */ ValueFormatterParams => String): Self = StObject.set(x, "pinnedRowValueFormatter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPinnedRowValueFormatterUndefined: Self = StObject.set(x, "pinnedRowValueFormatter", js.undefined)
      
      @scala.inline
      def setPinnedUndefined: Self = StObject.set(x, "pinned", js.undefined)
      
      @scala.inline
      def setPivot(value: Boolean): Self = StObject.set(x, "pivot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPivotComparator(value: (/* valueA */ String, /* valueB */ String) => Double): Self = StObject.set(x, "pivotComparator", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPivotComparatorUndefined: Self = StObject.set(x, "pivotComparator", js.undefined)
      
      @scala.inline
      def setPivotIndex(value: Double): Self = StObject.set(x, "pivotIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPivotIndexUndefined: Self = StObject.set(x, "pivotIndex", js.undefined)
      
      @scala.inline
      def setPivotTotalColumnIds(value: js.Array[String]): Self = StObject.set(x, "pivotTotalColumnIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPivotTotalColumnIdsUndefined: Self = StObject.set(x, "pivotTotalColumnIds", js.undefined)
      
      @scala.inline
      def setPivotTotalColumnIdsVarargs(value: String*): Self = StObject.set(x, "pivotTotalColumnIds", js.Array(value :_*))
      
      @scala.inline
      def setPivotUndefined: Self = StObject.set(x, "pivot", js.undefined)
      
      @scala.inline
      def setPivotValueColumn(value: Column): Self = StObject.set(x, "pivotValueColumn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPivotValueColumnUndefined: Self = StObject.set(x, "pivotValueColumn", js.undefined)
      
      @scala.inline
      def setRefData(value: StringDictionary[String]): Self = StObject.set(x, "refData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefDataUndefined: Self = StObject.set(x, "refData", js.undefined)
      
      @scala.inline
      def setRowDrag(value: Boolean | (js.Function1[/* params */ js.Any, Boolean])): Self = StObject.set(x, "rowDrag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowDragFunction1(value: /* params */ js.Any => Boolean): Self = StObject.set(x, "rowDrag", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRowDragUndefined: Self = StObject.set(x, "rowDrag", js.undefined)
      
      @scala.inline
      def setRowGroup(value: Boolean): Self = StObject.set(x, "rowGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowGroupIndex(value: Double): Self = StObject.set(x, "rowGroupIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowGroupIndexUndefined: Self = StObject.set(x, "rowGroupIndex", js.undefined)
      
      @scala.inline
      def setRowGroupUndefined: Self = StObject.set(x, "rowGroup", js.undefined)
      
      @scala.inline
      def setRowSpan(value: /* params */ RowSpanParams => Double): Self = StObject.set(x, "rowSpan", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
      
      @scala.inline
      def setShowRowGroup(value: String | Boolean): Self = StObject.set(x, "showRowGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowRowGroupUndefined: Self = StObject.set(x, "showRowGroup", js.undefined)
      
      @scala.inline
      def setSingleClickEdit(value: Boolean): Self = StObject.set(x, "singleClickEdit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSingleClickEditUndefined: Self = StObject.set(x, "singleClickEdit", js.undefined)
      
      @scala.inline
      def setSort(value: String): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      @scala.inline
      def setSortedAt(value: Double): Self = StObject.set(x, "sortedAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortedAtUndefined: Self = StObject.set(x, "sortedAt", js.undefined)
      
      @scala.inline
      def setSortingOrder(value: js.Array[String]): Self = StObject.set(x, "sortingOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortingOrderUndefined: Self = StObject.set(x, "sortingOrder", js.undefined)
      
      @scala.inline
      def setSortingOrderVarargs(value: String*): Self = StObject.set(x, "sortingOrder", js.Array(value :_*))
      
      @scala.inline
      def setSuppressAutoSize(value: Boolean): Self = StObject.set(x, "suppressAutoSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressAutoSizeUndefined: Self = StObject.set(x, "suppressAutoSize", js.undefined)
      
      @scala.inline
      def setSuppressCellFlash(value: Boolean): Self = StObject.set(x, "suppressCellFlash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressCellFlashUndefined: Self = StObject.set(x, "suppressCellFlash", js.undefined)
      
      @scala.inline
      def setSuppressFilter(value: Boolean): Self = StObject.set(x, "suppressFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressFilterUndefined: Self = StObject.set(x, "suppressFilter", js.undefined)
      
      @scala.inline
      def setSuppressKeyboardEvent(value: /* params */ SuppressKeyboardEventParams => Boolean): Self = StObject.set(x, "suppressKeyboardEvent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSuppressKeyboardEventUndefined: Self = StObject.set(x, "suppressKeyboardEvent", js.undefined)
      
      @scala.inline
      def setSuppressMenu(value: Boolean): Self = StObject.set(x, "suppressMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressMenuUndefined: Self = StObject.set(x, "suppressMenu", js.undefined)
      
      @scala.inline
      def setSuppressMovable(value: Boolean): Self = StObject.set(x, "suppressMovable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressMovableUndefined: Self = StObject.set(x, "suppressMovable", js.undefined)
      
      @scala.inline
      def setSuppressNavigable(value: Boolean | IsColumnFunc): Self = StObject.set(x, "suppressNavigable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressNavigableFunction1(value: /* params */ IsColumnFuncParams => Boolean): Self = StObject.set(x, "suppressNavigable", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSuppressNavigableUndefined: Self = StObject.set(x, "suppressNavigable", js.undefined)
      
      @scala.inline
      def setSuppressPaste(value: Boolean | IsColumnFunc): Self = StObject.set(x, "suppressPaste", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressPasteFunction1(value: /* params */ IsColumnFuncParams => Boolean): Self = StObject.set(x, "suppressPaste", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSuppressPasteUndefined: Self = StObject.set(x, "suppressPaste", js.undefined)
      
      @scala.inline
      def setSuppressResize(value: Boolean): Self = StObject.set(x, "suppressResize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressResizeUndefined: Self = StObject.set(x, "suppressResize", js.undefined)
      
      @scala.inline
      def setSuppressSizeToFit(value: Boolean): Self = StObject.set(x, "suppressSizeToFit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressSizeToFitUndefined: Self = StObject.set(x, "suppressSizeToFit", js.undefined)
      
      @scala.inline
      def setSuppressSorting(value: Boolean): Self = StObject.set(x, "suppressSorting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressSortingUndefined: Self = StObject.set(x, "suppressSorting", js.undefined)
      
      @scala.inline
      def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      @scala.inline
      def setTemplateUrl(value: String): Self = StObject.set(x, "templateUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateUrlUndefined: Self = StObject.set(x, "templateUrl", js.undefined)
      
      @scala.inline
      def setTooltip(value: /* params */ TooltipParams => String): Self = StObject.set(x, "tooltip", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTooltipField(value: String): Self = StObject.set(x, "tooltipField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipFieldUndefined: Self = StObject.set(x, "tooltipField", js.undefined)
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      @scala.inline
      def setType(value: String | js.Array[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setTypeVarargs(value: String*): Self = StObject.set(x, "type", js.Array(value :_*))
      
      @scala.inline
      def setUnSortIcon(value: Boolean): Self = StObject.set(x, "unSortIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnSortIconUndefined: Self = StObject.set(x, "unSortIcon", js.undefined)
      
      @scala.inline
      def setValueFormatter(value: /* params */ ValueFormatterParams => String): Self = StObject.set(x, "valueFormatter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValueFormatterUndefined: Self = StObject.set(x, "valueFormatter", js.undefined)
      
      @scala.inline
      def setValueGetter(value: (js.Function1[/* params */ ValueGetterParams, js.Any]) | String): Self = StObject.set(x, "valueGetter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueGetterFunction1(value: /* params */ ValueGetterParams => js.Any): Self = StObject.set(x, "valueGetter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValueGetterUndefined: Self = StObject.set(x, "valueGetter", js.undefined)
      
      @scala.inline
      def setValueParser(value: /* params */ ValueParserParams => js.Any | String): Self = StObject.set(x, "valueParser", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValueParserUndefined: Self = StObject.set(x, "valueParser", js.undefined)
      
      @scala.inline
      def setValueSetter(value: (js.Function1[/* params */ ValueSetterParams, Boolean]) | String): Self = StObject.set(x, "valueSetter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueSetterFunction1(value: /* params */ ValueSetterParams => Boolean): Self = StObject.set(x, "valueSetter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValueSetterUndefined: Self = StObject.set(x, "valueSetter", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait ColGroupDef
    extends StObject
       with AbstractColDef
       with ComponentHolder {
    
    /** Columns in this group */
    var children: js.Array[ColDef | ColGroupDef]
    
    /** Group ID */
    var groupId: js.UndefOr[String] = js.undefined
    
    /** The custom header group component to be used for rendering the component header. If none specified the default ag-Grid is used**/
    var headerGroupComponent: js.UndefOr[String | InstantiableIHeaderGroupComp] = js.undefined
    
    /** The custom header group component to be used for rendering the component header in the hosting framework (ie: React/Angular). If none specified the default ag-Grid is used**/
    var headerGroupComponentFramework: js.UndefOr[InstantiableAny] = js.undefined
    
    /** The custom header group component to be used for rendering the component header. If none specified the default ag-Grid is used**/
    var headerGroupComponentParams: js.UndefOr[js.Any] = js.undefined
    
    /** If true, group cannot be broken up by column moving, child columns will always appear side by side, however you can rearrange child columns within the group */
    var marryChildren: js.UndefOr[Boolean] = js.undefined
    
    /** Open by Default */
    var openByDefault: js.UndefOr[Boolean] = js.undefined
  }
  object ColGroupDef {
    
    @scala.inline
    def apply(children: js.Array[ColDef | ColGroupDef]): ColGroupDef = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColGroupDef]
    }
    
    @scala.inline
    implicit class ColGroupDefMutableBuilder[Self <: ColGroupDef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[ColDef | ColGroupDef]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenVarargs(value: (ColDef | ColGroupDef)*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
      
      @scala.inline
      def setHeaderGroupComponent(value: String | InstantiableIHeaderGroupComp): Self = StObject.set(x, "headerGroupComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderGroupComponentFramework(value: InstantiableAny): Self = StObject.set(x, "headerGroupComponentFramework", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderGroupComponentFrameworkUndefined: Self = StObject.set(x, "headerGroupComponentFramework", js.undefined)
      
      @scala.inline
      def setHeaderGroupComponentParams(value: js.Any): Self = StObject.set(x, "headerGroupComponentParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderGroupComponentParamsUndefined: Self = StObject.set(x, "headerGroupComponentParams", js.undefined)
      
      @scala.inline
      def setHeaderGroupComponentUndefined: Self = StObject.set(x, "headerGroupComponent", js.undefined)
      
      @scala.inline
      def setMarryChildren(value: Boolean): Self = StObject.set(x, "marryChildren", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarryChildrenUndefined: Self = StObject.set(x, "marryChildren", js.undefined)
      
      @scala.inline
      def setOpenByDefault(value: Boolean): Self = StObject.set(x, "openByDefault", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenByDefaultUndefined: Self = StObject.set(x, "openByDefault", js.undefined)
    }
  }
  
  type ColSpanParams = BaseColDefParams
  
  trait GetQuickFilterTextParams extends StObject {
    
    var colDef: ColDef
    
    var column: Column
    
    var data: js.Any
    
    var node: RowNode
    
    var value: js.Any
  }
  object GetQuickFilterTextParams {
    
    @scala.inline
    def apply(colDef: ColDef, column: Column, data: js.Any, node: RowNode, value: js.Any): GetQuickFilterTextParams = {
      val __obj = js.Dynamic.literal(colDef = colDef.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetQuickFilterTextParams]
    }
    
    @scala.inline
    implicit class GetQuickFilterTextParamsMutableBuilder[Self <: GetQuickFilterTextParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColDef(value: ColDef): Self = StObject.set(x, "colDef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumn(value: Column): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: RowNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type IAggFunc = js.Function1[/* input */ js.Array[js.Any], js.Any]
  
  type IsColumnFunc = js.Function1[/* params */ IsColumnFuncParams, Boolean]
  
  trait IsColumnFuncParams extends StObject {
    
    var api: GridApi
    
    var colDef: ColDef
    
    var column: Column
    
    var columnApi: ColumnApi
    
    var context: js.Any
    
    var data: js.Any
    
    var node: RowNode
  }
  object IsColumnFuncParams {
    
    @scala.inline
    def apply(
      api: GridApi,
      colDef: ColDef,
      column: Column,
      columnApi: ColumnApi,
      context: js.Any,
      data: js.Any,
      node: RowNode
    ): IsColumnFuncParams = {
      val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], colDef = colDef.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsColumnFuncParams]
    }
    
    @scala.inline
    implicit class IsColumnFuncParamsMutableBuilder[Self <: IsColumnFuncParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApi(value: GridApi): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColDef(value: ColDef): Self = StObject.set(x, "colDef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumn(value: Column): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnApi(value: ColumnApi): Self = StObject.set(x, "columnApi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: RowNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  trait NewValueParams
    extends StObject
       with BaseColDefParams {
    
    var newValue: js.Any
    
    var oldValue: js.Any
  }
  object NewValueParams {
    
    @scala.inline
    def apply(
      api: GridApi,
      colDef: ColDef,
      column: Column,
      columnApi: ColumnApi,
      context: js.Any,
      data: js.Any,
      newValue: js.Any,
      node: RowNode,
      oldValue: js.Any
    ): NewValueParams = {
      val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], colDef = colDef.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewValueParams]
    }
    
    @scala.inline
    implicit class NewValueParamsMutableBuilder[Self <: NewValueParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNewValue(value: js.Any): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldValue(value: js.Any): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    }
  }
  
  type RowSpanParams = BaseColDefParams
  
  trait SuppressKeyboardEventParams
    extends StObject
       with IsColumnFuncParams {
    
    var editing: Boolean
    
    var event: KeyboardEvent
  }
  object SuppressKeyboardEventParams {
    
    @scala.inline
    def apply(
      api: GridApi,
      colDef: ColDef,
      column: Column,
      columnApi: ColumnApi,
      context: js.Any,
      data: js.Any,
      editing: Boolean,
      event: KeyboardEvent,
      node: RowNode
    ): SuppressKeyboardEventParams = {
      val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], colDef = colDef.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], editing = editing.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[SuppressKeyboardEventParams]
    }
    
    @scala.inline
    implicit class SuppressKeyboardEventParamsMutableBuilder[Self <: SuppressKeyboardEventParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEditing(value: Boolean): Self = StObject.set(x, "editing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvent(value: KeyboardEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    }
  }
  
  trait TooltipParams extends StObject {
    
    @JSName("$scope")
    var $scope: js.Any
    
    var api: GridApi
    
    var colDef: ColDef
    
    var context: js.Any
    
    var data: js.Any
    
    var node: RowNode
    
    var rowIndex: Double
    
    var value: js.Any
    
    var valueFormatted: js.Any
  }
  object TooltipParams {
    
    @scala.inline
    def apply(
      $scope: js.Any,
      api: GridApi,
      colDef: ColDef,
      context: js.Any,
      data: js.Any,
      node: RowNode,
      rowIndex: Double,
      value: js.Any,
      valueFormatted: js.Any
    ): TooltipParams = {
      val __obj = js.Dynamic.literal($scope = $scope.asInstanceOf[js.Any], api = api.asInstanceOf[js.Any], colDef = colDef.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueFormatted = valueFormatted.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipParams]
    }
    
    @scala.inline
    implicit class TooltipParamsMutableBuilder[Self <: TooltipParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$scope(value: js.Any): Self = StObject.set(x, "$scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApi(value: GridApi): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColDef(value: ColDef): Self = StObject.set(x, "colDef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: RowNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueFormatted(value: js.Any): Self = StObject.set(x, "valueFormatted", value.asInstanceOf[js.Any])
    }
  }
  
  type ValueFormatterParams = BaseWithValueColDefParams
  
  trait ValueGetterParams
    extends StObject
       with BaseColDefParams {
    
    def getValue(field: String): js.Any
  }
  object ValueGetterParams {
    
    @scala.inline
    def apply(
      api: GridApi,
      colDef: ColDef,
      column: Column,
      columnApi: ColumnApi,
      context: js.Any,
      data: js.Any,
      getValue: String => js.Any,
      node: RowNode
    ): ValueGetterParams = {
      val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], colDef = colDef.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], getValue = js.Any.fromFunction1(getValue), node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueGetterParams]
    }
    
    @scala.inline
    implicit class ValueGetterParamsMutableBuilder[Self <: ValueGetterParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetValue(value: String => js.Any): Self = StObject.set(x, "getValue", js.Any.fromFunction1(value))
    }
  }
  
  type ValueParserParams = NewValueParams
  
  type ValueSetterParams = NewValueParams
}
