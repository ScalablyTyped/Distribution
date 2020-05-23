package typings.agGrid.colDefMod

import org.scalablytyped.runtime.StringDictionary
import typings.agGrid.anon.InstantiableAny
import typings.agGrid.anon.InstantiableICellEditorComp
import typings.agGrid.anon.InstantiableICellRendererComp
import typings.agGrid.anon.InstantiableIFilterComp
import typings.agGrid.anon.InstantiableIFloatingFilterComp
import typings.agGrid.columnMod.Column
import typings.agGrid.componentResolverMod.ComponentHolder
import typings.agGrid.componentResolverMod.DynamicComponentDef
import typings.agGrid.componentResolverMod.DynamicComponentParams
import typings.agGrid.eventsMod.CellClickedEvent
import typings.agGrid.eventsMod.CellContextMenuEvent
import typings.agGrid.eventsMod.CellDoubleClickedEvent
import typings.agGrid.iCellRendererMod.ICellRendererFunc
import typings.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColDef
  extends AbstractColDef
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
  var filterValueGetter: js.UndefOr[(js.Function1[/* params */ ValueGetterParams, _]) | String] = js.undefined
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
  var valueGetter: js.UndefOr[(js.Function1[/* params */ ValueGetterParams, _]) | String] = js.undefined
  /** Gets called after editing, converts the value in the cell. */
  var valueParser: js.UndefOr[js.Function1[/* params */ ValueParserParams, _ | String]] = js.undefined
  /** If not using a field, then this puts the value into the cell */
  var valueSetter: js.UndefOr[(js.Function1[/* params */ ValueSetterParams, Boolean]) | String] = js.undefined
  /** Initial width, in pixels, of the cell */
  var width: js.UndefOr[Double] = js.undefined
}

object ColDef {
  @scala.inline
  def apply(
    aggFunc: String | IAggFunc = null,
    allowedAggFuncs: js.Array[String] = null,
    autoHeight: js.UndefOr[Boolean] = js.undefined,
    cellClass: String | js.Array[String] | (js.Function1[/* cellClassParams */ CellClassParams, String | js.Array[String]]) = null,
    cellClassRules: StringDictionary[js.Function | String] = null,
    cellEditor: InstantiableICellEditorComp | String = null,
    cellEditorFramework: js.Any = null,
    cellEditorParams: js.Any = null,
    cellEditorSelector: /* params */ DynamicComponentParams => DynamicComponentDef = null,
    cellRenderer: InstantiableICellRendererComp | ICellRendererFunc | String = null,
    cellRendererFramework: js.Any = null,
    cellRendererParams: js.Any = null,
    cellRendererSelector: /* params */ DynamicComponentParams => DynamicComponentDef = null,
    cellStyle: js.Object | (js.Function1[/* params */ js.Any, js.Object]) = null,
    checkboxSelection: Boolean | (js.Function1[/* params */ js.Any, Boolean]) = null,
    colId: String = null,
    colSpan: /* params */ ColSpanParams => Double = null,
    columnGroupShow: String = null,
    comparator: (/* valueA */ js.Any, /* valueB */ js.Any, /* nodeA */ js.UndefOr[RowNode], /* nodeB */ js.UndefOr[RowNode], /* isInverted */ js.UndefOr[Boolean]) => Double = null,
    editable: Boolean | IsColumnFunc = null,
    enableCellChangeFlash: js.UndefOr[Boolean] = js.undefined,
    enablePivot: js.UndefOr[Boolean] = js.undefined,
    enableRowGroup: js.UndefOr[Boolean] = js.undefined,
    enableValue: js.UndefOr[Boolean] = js.undefined,
    equals: (/* valueA */ js.Any, /* valueB */ js.Any) => Boolean = null,
    field: String = null,
    filter: String | InstantiableIFilterComp = null,
    filterFramework: js.Any = null,
    filterParams: js.Any = null,
    filterValueGetter: (js.Function1[/* params */ ValueGetterParams, _]) | String = null,
    floatingFilterComponent: InstantiableIFloatingFilterComp = null,
    floatingFilterComponentFramework: InstantiableAny = null,
    floatingFilterComponentParams: js.Any = null,
    getQuickFilterText: /* params */ GetQuickFilterTextParams => String = null,
    headerCheckboxSelection: Boolean | (js.Function1[/* params */ js.Any, Boolean]) = null,
    headerCheckboxSelectionFilteredOnly: js.UndefOr[Boolean] = js.undefined,
    headerClass: String | js.Array[String] | (js.Function1[/* params */ js.Any, String | js.Array[String]]) = null,
    headerComponent: String | InstantiableAny = null,
    headerComponentFramework: InstantiableAny = null,
    headerComponentParams: js.Any = null,
    headerName: String = null,
    headerTooltip: String = null,
    headerValueGetter: String | js.Function = null,
    hide: js.UndefOr[Boolean] = js.undefined,
    icons: StringDictionary[String] = null,
    keyCreator: js.Function = null,
    lockPinned: js.UndefOr[Boolean] = js.undefined,
    lockPosition: js.UndefOr[Boolean] = js.undefined,
    lockVisible: js.UndefOr[Boolean] = js.undefined,
    maxWidth: js.UndefOr[Double] = js.undefined,
    menuTabs: js.Array[String] = null,
    minWidth: js.UndefOr[Double] = js.undefined,
    newValueHandler: /* params */ js.Any => Boolean = null,
    onCellClicked: /* event */ CellClickedEvent => Unit = null,
    onCellContextMenu: /* event */ CellContextMenuEvent => Unit = null,
    onCellDoubleClicked: /* event */ CellDoubleClickedEvent => Unit = null,
    onCellValueChanged: js.Function = null,
    pinned: Boolean | String = null,
    pinnedRowCellRenderer: InstantiableICellRendererComp | ICellRendererFunc | String = null,
    pinnedRowCellRendererFramework: js.Any = null,
    pinnedRowCellRendererParams: js.Any = null,
    pinnedRowValueFormatter: /* params */ ValueFormatterParams => String = null,
    pivot: js.UndefOr[Boolean] = js.undefined,
    pivotComparator: (/* valueA */ String, /* valueB */ String) => Double = null,
    pivotIndex: js.UndefOr[Double] = js.undefined,
    pivotKeys: js.Array[String] = null,
    pivotTotalColumnIds: js.Array[String] = null,
    pivotValueColumn: Column = null,
    refData: StringDictionary[String] = null,
    rowDrag: Boolean | (js.Function1[/* params */ js.Any, Boolean]) = null,
    rowGroup: js.UndefOr[Boolean] = js.undefined,
    rowGroupIndex: js.UndefOr[Double] = js.undefined,
    rowSpan: /* params */ RowSpanParams => Double = null,
    showRowGroup: String | Boolean = null,
    singleClickEdit: js.UndefOr[Boolean] = js.undefined,
    sort: String = null,
    sortedAt: js.UndefOr[Double] = js.undefined,
    sortingOrder: js.Array[String] = null,
    suppressAutoSize: js.UndefOr[Boolean] = js.undefined,
    suppressCellFlash: js.UndefOr[Boolean] = js.undefined,
    suppressFilter: js.UndefOr[Boolean] = js.undefined,
    suppressKeyboardEvent: /* params */ SuppressKeyboardEventParams => Boolean = null,
    suppressMenu: js.UndefOr[Boolean] = js.undefined,
    suppressMovable: js.UndefOr[Boolean] = js.undefined,
    suppressNavigable: Boolean | IsColumnFunc = null,
    suppressPaste: Boolean | IsColumnFunc = null,
    suppressResize: js.UndefOr[Boolean] = js.undefined,
    suppressSizeToFit: js.UndefOr[Boolean] = js.undefined,
    suppressSorting: js.UndefOr[Boolean] = js.undefined,
    suppressToolPanel: js.UndefOr[Boolean] = js.undefined,
    template: String = null,
    templateUrl: String = null,
    toolPanelClass: String | js.Array[String] | (js.Function1[/* params */ js.Any, String | js.Array[String]]) = null,
    tooltip: /* params */ TooltipParams => String = null,
    tooltipField: String = null,
    `type`: String | js.Array[String] = null,
    unSortIcon: js.UndefOr[Boolean] = js.undefined,
    valueFormatter: /* params */ ValueFormatterParams => String = null,
    valueGetter: (js.Function1[/* params */ ValueGetterParams, _]) | String = null,
    valueParser: /* params */ ValueParserParams => _ | String = null,
    valueSetter: (js.Function1[/* params */ ValueSetterParams, Boolean]) | String = null,
    width: js.UndefOr[Double] = js.undefined
  ): ColDef = {
    val __obj = js.Dynamic.literal()
    if (aggFunc != null) __obj.updateDynamic("aggFunc")(aggFunc.asInstanceOf[js.Any])
    if (allowedAggFuncs != null) __obj.updateDynamic("allowedAggFuncs")(allowedAggFuncs.asInstanceOf[js.Any])
    if (!js.isUndefined(autoHeight)) __obj.updateDynamic("autoHeight")(autoHeight.get.asInstanceOf[js.Any])
    if (cellClass != null) __obj.updateDynamic("cellClass")(cellClass.asInstanceOf[js.Any])
    if (cellClassRules != null) __obj.updateDynamic("cellClassRules")(cellClassRules.asInstanceOf[js.Any])
    if (cellEditor != null) __obj.updateDynamic("cellEditor")(cellEditor.asInstanceOf[js.Any])
    if (cellEditorFramework != null) __obj.updateDynamic("cellEditorFramework")(cellEditorFramework.asInstanceOf[js.Any])
    if (cellEditorParams != null) __obj.updateDynamic("cellEditorParams")(cellEditorParams.asInstanceOf[js.Any])
    if (cellEditorSelector != null) __obj.updateDynamic("cellEditorSelector")(js.Any.fromFunction1(cellEditorSelector))
    if (cellRenderer != null) __obj.updateDynamic("cellRenderer")(cellRenderer.asInstanceOf[js.Any])
    if (cellRendererFramework != null) __obj.updateDynamic("cellRendererFramework")(cellRendererFramework.asInstanceOf[js.Any])
    if (cellRendererParams != null) __obj.updateDynamic("cellRendererParams")(cellRendererParams.asInstanceOf[js.Any])
    if (cellRendererSelector != null) __obj.updateDynamic("cellRendererSelector")(js.Any.fromFunction1(cellRendererSelector))
    if (cellStyle != null) __obj.updateDynamic("cellStyle")(cellStyle.asInstanceOf[js.Any])
    if (checkboxSelection != null) __obj.updateDynamic("checkboxSelection")(checkboxSelection.asInstanceOf[js.Any])
    if (colId != null) __obj.updateDynamic("colId")(colId.asInstanceOf[js.Any])
    if (colSpan != null) __obj.updateDynamic("colSpan")(js.Any.fromFunction1(colSpan))
    if (columnGroupShow != null) __obj.updateDynamic("columnGroupShow")(columnGroupShow.asInstanceOf[js.Any])
    if (comparator != null) __obj.updateDynamic("comparator")(js.Any.fromFunction5(comparator))
    if (editable != null) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (!js.isUndefined(enableCellChangeFlash)) __obj.updateDynamic("enableCellChangeFlash")(enableCellChangeFlash.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePivot)) __obj.updateDynamic("enablePivot")(enablePivot.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRowGroup)) __obj.updateDynamic("enableRowGroup")(enableRowGroup.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableValue)) __obj.updateDynamic("enableValue")(enableValue.get.asInstanceOf[js.Any])
    if (equals != null) __obj.updateDynamic("equals")(js.Any.fromFunction2(equals))
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (filterFramework != null) __obj.updateDynamic("filterFramework")(filterFramework.asInstanceOf[js.Any])
    if (filterParams != null) __obj.updateDynamic("filterParams")(filterParams.asInstanceOf[js.Any])
    if (filterValueGetter != null) __obj.updateDynamic("filterValueGetter")(filterValueGetter.asInstanceOf[js.Any])
    if (floatingFilterComponent != null) __obj.updateDynamic("floatingFilterComponent")(floatingFilterComponent.asInstanceOf[js.Any])
    if (floatingFilterComponentFramework != null) __obj.updateDynamic("floatingFilterComponentFramework")(floatingFilterComponentFramework.asInstanceOf[js.Any])
    if (floatingFilterComponentParams != null) __obj.updateDynamic("floatingFilterComponentParams")(floatingFilterComponentParams.asInstanceOf[js.Any])
    if (getQuickFilterText != null) __obj.updateDynamic("getQuickFilterText")(js.Any.fromFunction1(getQuickFilterText))
    if (headerCheckboxSelection != null) __obj.updateDynamic("headerCheckboxSelection")(headerCheckboxSelection.asInstanceOf[js.Any])
    if (!js.isUndefined(headerCheckboxSelectionFilteredOnly)) __obj.updateDynamic("headerCheckboxSelectionFilteredOnly")(headerCheckboxSelectionFilteredOnly.get.asInstanceOf[js.Any])
    if (headerClass != null) __obj.updateDynamic("headerClass")(headerClass.asInstanceOf[js.Any])
    if (headerComponent != null) __obj.updateDynamic("headerComponent")(headerComponent.asInstanceOf[js.Any])
    if (headerComponentFramework != null) __obj.updateDynamic("headerComponentFramework")(headerComponentFramework.asInstanceOf[js.Any])
    if (headerComponentParams != null) __obj.updateDynamic("headerComponentParams")(headerComponentParams.asInstanceOf[js.Any])
    if (headerName != null) __obj.updateDynamic("headerName")(headerName.asInstanceOf[js.Any])
    if (headerTooltip != null) __obj.updateDynamic("headerTooltip")(headerTooltip.asInstanceOf[js.Any])
    if (headerValueGetter != null) __obj.updateDynamic("headerValueGetter")(headerValueGetter.asInstanceOf[js.Any])
    if (!js.isUndefined(hide)) __obj.updateDynamic("hide")(hide.get.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (keyCreator != null) __obj.updateDynamic("keyCreator")(keyCreator.asInstanceOf[js.Any])
    if (!js.isUndefined(lockPinned)) __obj.updateDynamic("lockPinned")(lockPinned.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lockPosition)) __obj.updateDynamic("lockPosition")(lockPosition.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lockVisible)) __obj.updateDynamic("lockVisible")(lockVisible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxWidth)) __obj.updateDynamic("maxWidth")(maxWidth.get.asInstanceOf[js.Any])
    if (menuTabs != null) __obj.updateDynamic("menuTabs")(menuTabs.asInstanceOf[js.Any])
    if (!js.isUndefined(minWidth)) __obj.updateDynamic("minWidth")(minWidth.get.asInstanceOf[js.Any])
    if (newValueHandler != null) __obj.updateDynamic("newValueHandler")(js.Any.fromFunction1(newValueHandler))
    if (onCellClicked != null) __obj.updateDynamic("onCellClicked")(js.Any.fromFunction1(onCellClicked))
    if (onCellContextMenu != null) __obj.updateDynamic("onCellContextMenu")(js.Any.fromFunction1(onCellContextMenu))
    if (onCellDoubleClicked != null) __obj.updateDynamic("onCellDoubleClicked")(js.Any.fromFunction1(onCellDoubleClicked))
    if (onCellValueChanged != null) __obj.updateDynamic("onCellValueChanged")(onCellValueChanged.asInstanceOf[js.Any])
    if (pinned != null) __obj.updateDynamic("pinned")(pinned.asInstanceOf[js.Any])
    if (pinnedRowCellRenderer != null) __obj.updateDynamic("pinnedRowCellRenderer")(pinnedRowCellRenderer.asInstanceOf[js.Any])
    if (pinnedRowCellRendererFramework != null) __obj.updateDynamic("pinnedRowCellRendererFramework")(pinnedRowCellRendererFramework.asInstanceOf[js.Any])
    if (pinnedRowCellRendererParams != null) __obj.updateDynamic("pinnedRowCellRendererParams")(pinnedRowCellRendererParams.asInstanceOf[js.Any])
    if (pinnedRowValueFormatter != null) __obj.updateDynamic("pinnedRowValueFormatter")(js.Any.fromFunction1(pinnedRowValueFormatter))
    if (!js.isUndefined(pivot)) __obj.updateDynamic("pivot")(pivot.get.asInstanceOf[js.Any])
    if (pivotComparator != null) __obj.updateDynamic("pivotComparator")(js.Any.fromFunction2(pivotComparator))
    if (!js.isUndefined(pivotIndex)) __obj.updateDynamic("pivotIndex")(pivotIndex.get.asInstanceOf[js.Any])
    if (pivotKeys != null) __obj.updateDynamic("pivotKeys")(pivotKeys.asInstanceOf[js.Any])
    if (pivotTotalColumnIds != null) __obj.updateDynamic("pivotTotalColumnIds")(pivotTotalColumnIds.asInstanceOf[js.Any])
    if (pivotValueColumn != null) __obj.updateDynamic("pivotValueColumn")(pivotValueColumn.asInstanceOf[js.Any])
    if (refData != null) __obj.updateDynamic("refData")(refData.asInstanceOf[js.Any])
    if (rowDrag != null) __obj.updateDynamic("rowDrag")(rowDrag.asInstanceOf[js.Any])
    if (!js.isUndefined(rowGroup)) __obj.updateDynamic("rowGroup")(rowGroup.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rowGroupIndex)) __obj.updateDynamic("rowGroupIndex")(rowGroupIndex.get.asInstanceOf[js.Any])
    if (rowSpan != null) __obj.updateDynamic("rowSpan")(js.Any.fromFunction1(rowSpan))
    if (showRowGroup != null) __obj.updateDynamic("showRowGroup")(showRowGroup.asInstanceOf[js.Any])
    if (!js.isUndefined(singleClickEdit)) __obj.updateDynamic("singleClickEdit")(singleClickEdit.get.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (!js.isUndefined(sortedAt)) __obj.updateDynamic("sortedAt")(sortedAt.get.asInstanceOf[js.Any])
    if (sortingOrder != null) __obj.updateDynamic("sortingOrder")(sortingOrder.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressAutoSize)) __obj.updateDynamic("suppressAutoSize")(suppressAutoSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressCellFlash)) __obj.updateDynamic("suppressCellFlash")(suppressCellFlash.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressFilter)) __obj.updateDynamic("suppressFilter")(suppressFilter.get.asInstanceOf[js.Any])
    if (suppressKeyboardEvent != null) __obj.updateDynamic("suppressKeyboardEvent")(js.Any.fromFunction1(suppressKeyboardEvent))
    if (!js.isUndefined(suppressMenu)) __obj.updateDynamic("suppressMenu")(suppressMenu.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressMovable)) __obj.updateDynamic("suppressMovable")(suppressMovable.get.asInstanceOf[js.Any])
    if (suppressNavigable != null) __obj.updateDynamic("suppressNavigable")(suppressNavigable.asInstanceOf[js.Any])
    if (suppressPaste != null) __obj.updateDynamic("suppressPaste")(suppressPaste.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressResize)) __obj.updateDynamic("suppressResize")(suppressResize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressSizeToFit)) __obj.updateDynamic("suppressSizeToFit")(suppressSizeToFit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressSorting)) __obj.updateDynamic("suppressSorting")(suppressSorting.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressToolPanel)) __obj.updateDynamic("suppressToolPanel")(suppressToolPanel.get.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (templateUrl != null) __obj.updateDynamic("templateUrl")(templateUrl.asInstanceOf[js.Any])
    if (toolPanelClass != null) __obj.updateDynamic("toolPanelClass")(toolPanelClass.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(js.Any.fromFunction1(tooltip))
    if (tooltipField != null) __obj.updateDynamic("tooltipField")(tooltipField.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(unSortIcon)) __obj.updateDynamic("unSortIcon")(unSortIcon.get.asInstanceOf[js.Any])
    if (valueFormatter != null) __obj.updateDynamic("valueFormatter")(js.Any.fromFunction1(valueFormatter))
    if (valueGetter != null) __obj.updateDynamic("valueGetter")(valueGetter.asInstanceOf[js.Any])
    if (valueParser != null) __obj.updateDynamic("valueParser")(js.Any.fromFunction1(valueParser))
    if (valueSetter != null) __obj.updateDynamic("valueSetter")(valueSetter.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColDef]
  }
}

