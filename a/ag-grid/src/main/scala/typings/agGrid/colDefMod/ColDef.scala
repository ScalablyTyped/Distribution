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
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColDef
  extends AbstractColDef
     with ComponentHolder {
  
  /** Name of function to use for aggregation. One of [sum,min,max,first,last] or a function. */
  var aggFunc: js.UndefOr[String | IAggFunc] = js.native
  
  /** Agg funcs allowed on this column. If missing, all installed agg funcs are allowed.
    * Can be eg ['sum','avg']. This will restrict what the GUI allows to select only.*/
  var allowedAggFuncs: js.UndefOr[js.Array[String]] = js.native
  
  /** True if this column should stretch rows height to fit contents */
  var autoHeight: js.UndefOr[Boolean] = js.native
  
  /** Class to use for the cell. Can be string, array of strings, or function. */
  var cellClass: js.UndefOr[
    String | js.Array[String] | (js.Function1[/* cellClassParams */ CellClassParams, String | js.Array[String]])
  ] = js.native
  
  /** Rules for applying css classes */
  var cellClassRules: js.UndefOr[StringDictionary[js.Function | String]] = js.native
  
  /** Cell editor */
  var cellEditor: js.UndefOr[InstantiableICellEditorComp | String] = js.native
  
  var cellEditorFramework: js.UndefOr[js.Any] = js.native
  
  var cellEditorParams: js.UndefOr[js.Any] = js.native
  
  var cellEditorSelector: js.UndefOr[js.Function1[/* params */ DynamicComponentParams, DynamicComponentDef]] = js.native
  
  /** A function for rendering a cell. */
  var cellRenderer: js.UndefOr[InstantiableICellRendererComp | ICellRendererFunc | String] = js.native
  
  var cellRendererFramework: js.UndefOr[js.Any] = js.native
  
  var cellRendererParams: js.UndefOr[js.Any] = js.native
  
  var cellRendererSelector: js.UndefOr[js.Function1[/* params */ DynamicComponentParams, DynamicComponentDef]] = js.native
  
  /** An object of css values. Or a function returning an object of css values. */
  var cellStyle: js.UndefOr[js.Object | (js.Function1[/* params */ js.Any, js.Object])] = js.native
  
  /** Set to true to render a selection checkbox in the column. */
  var checkboxSelection: js.UndefOr[Boolean | (js.Function1[/* params */ js.Any, Boolean])] = js.native
  
  /** The unique ID to give the column. This is optional. If missing, the ID will default to the field.
    *  If both field and colId are missing, a unique ID will be generated.
    *  This ID is used to identify the column in the API for sorting, filtering etc. */
  var colId: js.UndefOr[String] = js.native
  
  var colSpan: js.UndefOr[js.Function1[/* params */ ColSpanParams, Double]] = js.native
  
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
  ] = js.native
  
  /** Set to true if this col is editable, otherwise false. Can also be a function to have different rows editable. */
  var editable: js.UndefOr[Boolean | IsColumnFunc] = js.native
  
  /** If true, grid will flash cell after cell is refreshed */
  var enableCellChangeFlash: js.UndefOr[Boolean] = js.native
  
  /** If true, GUI will allow adding this columns as a pivot */
  var enablePivot: js.UndefOr[Boolean] = js.native
  
  /** If true, GUI will allow adding this columns as a row group */
  var enableRowGroup: js.UndefOr[Boolean] = js.native
  
  /** If true, GUI will allow adding this columns as a value */
  var enableValue: js.UndefOr[Boolean] = js.native
  
  /** Comparator for values, used by renderer to know if values have changed. Cells who's values have not changed don't get refreshed. */
  @JSName("equals")
  var equals_FColDef: js.UndefOr[js.Function2[/* valueA */ js.Any, /* valueB */ js.Any, Boolean]] = js.native
  
  /** The field of the row to get the cells data from */
  var field: js.UndefOr[String] = js.native
  
  /** one of the built in filter names: [set, number, text], or a filter function*/
  var filter: js.UndefOr[String | InstantiableIFilterComp] = js.native
  
  var filterFramework: js.UndefOr[js.Any] = js.native
  
  /** The filter params are specific to each filter! */
  var filterParams: js.UndefOr[js.Any] = js.native
  
  /** Expression or function to get the cells value for filtering. */
  var filterValueGetter: js.UndefOr[(js.Function1[/* params */ ValueGetterParams, _]) | String] = js.native
  
  /** The custom header component to be used for rendering the floating filter. If none specified the default ag-Grid is used**/
  var floatingFilterComponent: js.UndefOr[InstantiableIFloatingFilterComp] = js.native
  
  var floatingFilterComponentFramework: js.UndefOr[InstantiableAny] = js.native
  
  var floatingFilterComponentParams: js.UndefOr[js.Any] = js.native
  
  /** To create the quick filter text for this column, if toString is not good enough on the value. */
  var getQuickFilterText: js.UndefOr[js.Function1[/* params */ GetQuickFilterTextParams, String]] = js.native
  
  /** If true, a 'select all' checkbox will be put into the header */
  var headerCheckboxSelection: js.UndefOr[Boolean | (js.Function1[/* params */ js.Any, Boolean])] = js.native
  
  /** If true, the header checkbox selection will work on filtered items*/
  var headerCheckboxSelectionFilteredOnly: js.UndefOr[Boolean] = js.native
  
  /** The custom header component to be used for rendering the component header. If none specified the default ag-Grid is used**/
  var headerComponent: js.UndefOr[String | InstantiableAny] = js.native
  
  /** The custom header component to be used for rendering the component header in the hosting framework (ie: React/Angular). If none specified the default ag-Grid is used**/
  var headerComponentFramework: js.UndefOr[InstantiableAny] = js.native
  
  /** The custom header component parameters**/
  var headerComponentParams: js.UndefOr[js.Any] = js.native
  
  /** Set to true for this column to be hidden. Naturally you might think, it would make more sense to call this field 'visible' and mark it false to hide,
    *  however we want all default values to be false and we want columns to be visible by default. */
  var hide: js.UndefOr[Boolean] = js.native
  
  /** Icons for this column. Leave blank to use default. */
  var icons: js.UndefOr[StringDictionary[String]] = js.native
  
  /** Function to return the key for a value - use this if the value is an object (not a primitive type) and you
    * want to a) group by this field or b) use set filter on this field. */
  var keyCreator: js.UndefOr[js.Function] = js.native
  
  /** Set to true to block the user pinning the column, the column can only be pinned via definitions or API */
  var lockPinned: js.UndefOr[Boolean] = js.native
  
  /** Set to true to make sure this column is always first. Other columns, if movable, cannot move before this column. */
  var lockPosition: js.UndefOr[Boolean] = js.native
  
  /** Set to true to block the user showing / hiding the column, the column can only be shown / hidden via definitions or API */
  var lockVisible: js.UndefOr[Boolean] = js.native
  
  /** Max width, in pixels, of the cell */
  var maxWidth: js.UndefOr[Double] = js.native
  
  /** The menu tabs to show, and in which order, the valid values for this property are:
    * filterMenuTab, generalMenuTab, columnsMenuTab **/
  var menuTabs: js.UndefOr[js.Array[String]] = js.native
  
  /** Min width, in pixels, of the cell */
  var minWidth: js.UndefOr[Double] = js.native
  
  /** Callbacks for editing. See editing section for further details.
    * Return true if the update was successful, or false if not.
    * If false, then skips the UI refresh and no events are emitted.
    * Return false if the values are the same (ie no update). */
  var newValueHandler: js.UndefOr[js.Function1[/* params */ js.Any, Boolean]] = js.native
  
  /** Function callback, gets called when a cell is clicked. */
  var onCellClicked: js.UndefOr[js.Function1[/* event */ CellClickedEvent, Unit]] = js.native
  
  /** Function callback, gets called when a cell is right clicked. */
  var onCellContextMenu: js.UndefOr[js.Function1[/* event */ CellContextMenuEvent, Unit]] = js.native
  
  /** Function callback, gets called when a cell is double clicked. */
  var onCellDoubleClicked: js.UndefOr[js.Function1[/* event */ CellDoubleClickedEvent, Unit]] = js.native
  
  /** Callbacks for editing.See editing section for further details. */
  var onCellValueChanged: js.UndefOr[js.Function] = js.native
  
  /** Whether this column is pinned or not. */
  var pinned: js.UndefOr[Boolean | String] = js.native
  
  /** A function for rendering a pinned row cell. */
  var pinnedRowCellRenderer: js.UndefOr[InstantiableICellRendererComp | ICellRendererFunc | String] = js.native
  
  var pinnedRowCellRendererFramework: js.UndefOr[js.Any] = js.native
  
  var pinnedRowCellRendererParams: js.UndefOr[js.Any] = js.native
  
  /** A function to format a pinned row value, should return a string. Not used for CSV export or copy to clipboard, only for UI cell rendering. */
  var pinnedRowValueFormatter: js.UndefOr[js.Function1[/* params */ ValueFormatterParams, String]] = js.native
  
  var pivot: js.UndefOr[Boolean] = js.native
  
  /** Comparator for ordering the pivot columns */
  var pivotComparator: js.UndefOr[js.Function2[/* valueA */ String, /* valueB */ String, Double]] = js.native
  
  /** To pivot by this column by default, either provide an index (eg pivotIndex=1), or set pivot=true. */
  var pivotIndex: js.UndefOr[Double] = js.native
  
  /** Never set this, it is used internally by grid when doing in-grid pivoting */
  var pivotTotalColumnIds: js.UndefOr[js.Array[String]] = js.native
  
  /** Never set this, it is used internally by grid when doing in-grid pivoting */
  var pivotValueColumn: js.UndefOr[Column] = js.native
  
  var refData: js.UndefOr[StringDictionary[String]] = js.native
  
  var rowDrag: js.UndefOr[Boolean | (js.Function1[/* params */ js.Any, Boolean])] = js.native
  
  var rowGroup: js.UndefOr[Boolean] = js.native
  
  /** To group by this column by default, either provide an index (eg rowGroupIndex=1), or set rowGroup=true. */
  var rowGroupIndex: js.UndefOr[Double] = js.native
  
  var rowSpan: js.UndefOr[js.Function1[/* params */ RowSpanParams, Double]] = js.native
  
  /** Set to true to have the grid place the values for the group into the cell, or put the name of a grouped column to just show that group. */
  var showRowGroup: js.UndefOr[String | Boolean] = js.native
  
  /** If true, this cell will be in editing mode after first click. */
  var singleClickEdit: js.UndefOr[Boolean] = js.native
  
  /** If sorting by default, set it here. Set to 'asc' or 'desc' */
  var sort: js.UndefOr[String] = js.native
  
  /** If sorting more than one column by default, the milliseconds when this column was sorted, so we know what order to sort the columns in. */
  var sortedAt: js.UndefOr[Double] = js.native
  
  /** The sort order, provide an array with any of the following in any order ['asc','desc',null] */
  var sortingOrder: js.UndefOr[js.Array[String]] = js.native
  
  /** Set to true if you do not want this column to be auto-resizable by double clicking it's edge. */
  var suppressAutoSize: js.UndefOr[Boolean] = js.native
  
  /** Set to true to not flash this column for value changes */
  var suppressCellFlash: js.UndefOr[Boolean] = js.native
  
  /** Set to true to not allow filter on this column */
  var suppressFilter: js.UndefOr[Boolean] = js.native
  
  var suppressKeyboardEvent: js.UndefOr[js.Function1[/* params */ SuppressKeyboardEventParams, Boolean]] = js.native
  
  /** Set to true if no menu should be shown for this column header. */
  var suppressMenu: js.UndefOr[Boolean] = js.native
  
  /** Set to true to not allow moving this column via dragging it's header */
  var suppressMovable: js.UndefOr[Boolean] = js.native
  
  /** Set to tru if this col should not be navigable with the tab key. Can also be a function to have different rows editable. */
  var suppressNavigable: js.UndefOr[Boolean | IsColumnFunc] = js.native
  
  /** Set to true if this col should not be allowed take new values from teh clipboard . */
  var suppressPaste: js.UndefOr[Boolean | IsColumnFunc] = js.native
  
  /** Set to true if you do not want this column to be resizable by dragging it's edge. */
  var suppressResize: js.UndefOr[Boolean] = js.native
  
  /** Set to true if you want this columns width to be fixed during 'size to fit' operation. */
  var suppressSizeToFit: js.UndefOr[Boolean] = js.native
  
  /** Set to true if no sorting should be done for this column. */
  var suppressSorting: js.UndefOr[Boolean] = js.native
  
  /** Cell template to use for cell. Useful for AngularJS cells. */
  var template: js.UndefOr[String] = js.native
  
  /** Cell template URL to load template from to use for cell. Useful for AngularJS cells. */
  var templateUrl: js.UndefOr[String] = js.native
  
  /** The function used to calculate the tooltip of the object, tooltipField takes precedence*/
  var tooltip: js.UndefOr[js.Function1[/* params */ TooltipParams, String]] = js.native
  
  /** The field where we get the tooltip on the object */
  var tooltipField: js.UndefOr[String] = js.native
  
  /**
    * A comma separated string or array of strings containing ColumnType keys which can be used as a template for a column.
    * This helps to reduce duplication of properties when you have a lot of common column properties.
    */
  var `type`: js.UndefOr[String | js.Array[String]] = js.native
  
  /** Set to true if you want the unsorted icon to be shown when no sort is applied to this column. */
  var unSortIcon: js.UndefOr[Boolean] = js.native
  
  /** A function to format a value, should return a string. Not used for CSV export or copy to clipboard, only for UI cell rendering. */
  var valueFormatter: js.UndefOr[js.Function1[/* params */ ValueFormatterParams, String]] = js.native
  
  /** Expression or function to get the cells value. */
  var valueGetter: js.UndefOr[(js.Function1[/* params */ ValueGetterParams, _]) | String] = js.native
  
  /** Gets called after editing, converts the value in the cell. */
  var valueParser: js.UndefOr[js.Function1[/* params */ ValueParserParams, _ | String]] = js.native
  
  /** If not using a field, then this puts the value into the cell */
  var valueSetter: js.UndefOr[(js.Function1[/* params */ ValueSetterParams, Boolean]) | String] = js.native
  
  /** Initial width, in pixels, of the cell */
  var width: js.UndefOr[Double] = js.native
}
object ColDef {
  
  @scala.inline
  def apply(): ColDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColDef]
  }
  
  @scala.inline
  implicit class ColDefOps[Self <: ColDef] (val x: Self) extends AnyVal {
    
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
    def setAggFuncFunction1(value: /* input */ js.Array[js.Any] => js.Any): Self = this.set("aggFunc", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAggFunc(value: String | IAggFunc): Self = this.set("aggFunc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggFunc: Self = this.set("aggFunc", js.undefined)
    
    @scala.inline
    def setAllowedAggFuncsVarargs(value: String*): Self = this.set("allowedAggFuncs", js.Array(value :_*))
    
    @scala.inline
    def setAllowedAggFuncs(value: js.Array[String]): Self = this.set("allowedAggFuncs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedAggFuncs: Self = this.set("allowedAggFuncs", js.undefined)
    
    @scala.inline
    def setAutoHeight(value: Boolean): Self = this.set("autoHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoHeight: Self = this.set("autoHeight", js.undefined)
    
    @scala.inline
    def setCellClassVarargs(value: String*): Self = this.set("cellClass", js.Array(value :_*))
    
    @scala.inline
    def setCellClassFunction1(value: /* cellClassParams */ CellClassParams => String | js.Array[String]): Self = this.set("cellClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCellClass(
      value: String | js.Array[String] | (js.Function1[/* cellClassParams */ CellClassParams, String | js.Array[String]])
    ): Self = this.set("cellClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellClass: Self = this.set("cellClass", js.undefined)
    
    @scala.inline
    def setCellClassRules(value: StringDictionary[js.Function | String]): Self = this.set("cellClassRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellClassRules: Self = this.set("cellClassRules", js.undefined)
    
    @scala.inline
    def setCellEditor(value: InstantiableICellEditorComp | String): Self = this.set("cellEditor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellEditor: Self = this.set("cellEditor", js.undefined)
    
    @scala.inline
    def setCellEditorFramework(value: js.Any): Self = this.set("cellEditorFramework", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellEditorFramework: Self = this.set("cellEditorFramework", js.undefined)
    
    @scala.inline
    def setCellEditorParams(value: js.Any): Self = this.set("cellEditorParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellEditorParams: Self = this.set("cellEditorParams", js.undefined)
    
    @scala.inline
    def setCellEditorSelector(value: /* params */ DynamicComponentParams => DynamicComponentDef): Self = this.set("cellEditorSelector", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCellEditorSelector: Self = this.set("cellEditorSelector", js.undefined)
    
    @scala.inline
    def setCellRendererFunction1(value: /* params */ js.Any => HTMLElement | String): Self = this.set("cellRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCellRenderer(value: InstantiableICellRendererComp | ICellRendererFunc | String): Self = this.set("cellRenderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellRenderer: Self = this.set("cellRenderer", js.undefined)
    
    @scala.inline
    def setCellRendererFramework(value: js.Any): Self = this.set("cellRendererFramework", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellRendererFramework: Self = this.set("cellRendererFramework", js.undefined)
    
    @scala.inline
    def setCellRendererParams(value: js.Any): Self = this.set("cellRendererParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellRendererParams: Self = this.set("cellRendererParams", js.undefined)
    
    @scala.inline
    def setCellRendererSelector(value: /* params */ DynamicComponentParams => DynamicComponentDef): Self = this.set("cellRendererSelector", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCellRendererSelector: Self = this.set("cellRendererSelector", js.undefined)
    
    @scala.inline
    def setCellStyleFunction1(value: /* params */ js.Any => js.Object): Self = this.set("cellStyle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCellStyle(value: js.Object | (js.Function1[/* params */ js.Any, js.Object])): Self = this.set("cellStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellStyle: Self = this.set("cellStyle", js.undefined)
    
    @scala.inline
    def setCheckboxSelectionFunction1(value: /* params */ js.Any => Boolean): Self = this.set("checkboxSelection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCheckboxSelection(value: Boolean | (js.Function1[/* params */ js.Any, Boolean])): Self = this.set("checkboxSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckboxSelection: Self = this.set("checkboxSelection", js.undefined)
    
    @scala.inline
    def setColId(value: String): Self = this.set("colId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColId: Self = this.set("colId", js.undefined)
    
    @scala.inline
    def setColSpan(value: /* params */ ColSpanParams => Double): Self = this.set("colSpan", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteColSpan: Self = this.set("colSpan", js.undefined)
    
    @scala.inline
    def setComparator(
      value: (/* valueA */ js.Any, /* valueB */ js.Any, /* nodeA */ js.UndefOr[RowNode], /* nodeB */ js.UndefOr[RowNode], /* isInverted */ js.UndefOr[Boolean]) => Double
    ): Self = this.set("comparator", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteComparator: Self = this.set("comparator", js.undefined)
    
    @scala.inline
    def setEditableFunction1(value: /* params */ IsColumnFuncParams => Boolean): Self = this.set("editable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEditable(value: Boolean | IsColumnFunc): Self = this.set("editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditable: Self = this.set("editable", js.undefined)
    
    @scala.inline
    def setEnableCellChangeFlash(value: Boolean): Self = this.set("enableCellChangeFlash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableCellChangeFlash: Self = this.set("enableCellChangeFlash", js.undefined)
    
    @scala.inline
    def setEnablePivot(value: Boolean): Self = this.set("enablePivot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablePivot: Self = this.set("enablePivot", js.undefined)
    
    @scala.inline
    def setEnableRowGroup(value: Boolean): Self = this.set("enableRowGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableRowGroup: Self = this.set("enableRowGroup", js.undefined)
    
    @scala.inline
    def setEnableValue(value: Boolean): Self = this.set("enableValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableValue: Self = this.set("enableValue", js.undefined)
    
    @scala.inline
    def setEquals(value: (/* valueA */ js.Any, /* valueB */ js.Any) => Boolean): Self = this.set("equals", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteEquals: Self = this.set("equals", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    
    @scala.inline
    def setFilter(value: String | InstantiableIFilterComp): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setFilterFramework(value: js.Any): Self = this.set("filterFramework", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterFramework: Self = this.set("filterFramework", js.undefined)
    
    @scala.inline
    def setFilterParams(value: js.Any): Self = this.set("filterParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterParams: Self = this.set("filterParams", js.undefined)
    
    @scala.inline
    def setFilterValueGetterFunction1(value: /* params */ ValueGetterParams => _): Self = this.set("filterValueGetter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFilterValueGetter(value: (js.Function1[/* params */ ValueGetterParams, _]) | String): Self = this.set("filterValueGetter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterValueGetter: Self = this.set("filterValueGetter", js.undefined)
    
    @scala.inline
    def setFloatingFilterComponent(value: InstantiableIFloatingFilterComp): Self = this.set("floatingFilterComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloatingFilterComponent: Self = this.set("floatingFilterComponent", js.undefined)
    
    @scala.inline
    def setFloatingFilterComponentFramework(value: InstantiableAny): Self = this.set("floatingFilterComponentFramework", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloatingFilterComponentFramework: Self = this.set("floatingFilterComponentFramework", js.undefined)
    
    @scala.inline
    def setFloatingFilterComponentParams(value: js.Any): Self = this.set("floatingFilterComponentParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloatingFilterComponentParams: Self = this.set("floatingFilterComponentParams", js.undefined)
    
    @scala.inline
    def setGetQuickFilterText(value: /* params */ GetQuickFilterTextParams => String): Self = this.set("getQuickFilterText", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetQuickFilterText: Self = this.set("getQuickFilterText", js.undefined)
    
    @scala.inline
    def setHeaderCheckboxSelectionFunction1(value: /* params */ js.Any => Boolean): Self = this.set("headerCheckboxSelection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeaderCheckboxSelection(value: Boolean | (js.Function1[/* params */ js.Any, Boolean])): Self = this.set("headerCheckboxSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderCheckboxSelection: Self = this.set("headerCheckboxSelection", js.undefined)
    
    @scala.inline
    def setHeaderCheckboxSelectionFilteredOnly(value: Boolean): Self = this.set("headerCheckboxSelectionFilteredOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderCheckboxSelectionFilteredOnly: Self = this.set("headerCheckboxSelectionFilteredOnly", js.undefined)
    
    @scala.inline
    def setHeaderComponent(value: String | InstantiableAny): Self = this.set("headerComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderComponent: Self = this.set("headerComponent", js.undefined)
    
    @scala.inline
    def setHeaderComponentFramework(value: InstantiableAny): Self = this.set("headerComponentFramework", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderComponentFramework: Self = this.set("headerComponentFramework", js.undefined)
    
    @scala.inline
    def setHeaderComponentParams(value: js.Any): Self = this.set("headerComponentParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderComponentParams: Self = this.set("headerComponentParams", js.undefined)
    
    @scala.inline
    def setHide(value: Boolean): Self = this.set("hide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHide: Self = this.set("hide", js.undefined)
    
    @scala.inline
    def setIcons(value: StringDictionary[String]): Self = this.set("icons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcons: Self = this.set("icons", js.undefined)
    
    @scala.inline
    def setKeyCreator(value: js.Function): Self = this.set("keyCreator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyCreator: Self = this.set("keyCreator", js.undefined)
    
    @scala.inline
    def setLockPinned(value: Boolean): Self = this.set("lockPinned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLockPinned: Self = this.set("lockPinned", js.undefined)
    
    @scala.inline
    def setLockPosition(value: Boolean): Self = this.set("lockPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLockPosition: Self = this.set("lockPosition", js.undefined)
    
    @scala.inline
    def setLockVisible(value: Boolean): Self = this.set("lockVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLockVisible: Self = this.set("lockVisible", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    
    @scala.inline
    def setMenuTabsVarargs(value: String*): Self = this.set("menuTabs", js.Array(value :_*))
    
    @scala.inline
    def setMenuTabs(value: js.Array[String]): Self = this.set("menuTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenuTabs: Self = this.set("menuTabs", js.undefined)
    
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    
    @scala.inline
    def setNewValueHandler(value: /* params */ js.Any => Boolean): Self = this.set("newValueHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteNewValueHandler: Self = this.set("newValueHandler", js.undefined)
    
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
    def setOnCellValueChanged(value: js.Function): Self = this.set("onCellValueChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCellValueChanged: Self = this.set("onCellValueChanged", js.undefined)
    
    @scala.inline
    def setPinned(value: Boolean | String): Self = this.set("pinned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePinned: Self = this.set("pinned", js.undefined)
    
    @scala.inline
    def setPinnedRowCellRendererFunction1(value: /* params */ js.Any => HTMLElement | String): Self = this.set("pinnedRowCellRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPinnedRowCellRenderer(value: InstantiableICellRendererComp | ICellRendererFunc | String): Self = this.set("pinnedRowCellRenderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePinnedRowCellRenderer: Self = this.set("pinnedRowCellRenderer", js.undefined)
    
    @scala.inline
    def setPinnedRowCellRendererFramework(value: js.Any): Self = this.set("pinnedRowCellRendererFramework", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePinnedRowCellRendererFramework: Self = this.set("pinnedRowCellRendererFramework", js.undefined)
    
    @scala.inline
    def setPinnedRowCellRendererParams(value: js.Any): Self = this.set("pinnedRowCellRendererParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePinnedRowCellRendererParams: Self = this.set("pinnedRowCellRendererParams", js.undefined)
    
    @scala.inline
    def setPinnedRowValueFormatter(value: /* params */ ValueFormatterParams => String): Self = this.set("pinnedRowValueFormatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePinnedRowValueFormatter: Self = this.set("pinnedRowValueFormatter", js.undefined)
    
    @scala.inline
    def setPivot(value: Boolean): Self = this.set("pivot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePivot: Self = this.set("pivot", js.undefined)
    
    @scala.inline
    def setPivotComparator(value: (/* valueA */ String, /* valueB */ String) => Double): Self = this.set("pivotComparator", js.Any.fromFunction2(value))
    
    @scala.inline
    def deletePivotComparator: Self = this.set("pivotComparator", js.undefined)
    
    @scala.inline
    def setPivotIndex(value: Double): Self = this.set("pivotIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePivotIndex: Self = this.set("pivotIndex", js.undefined)
    
    @scala.inline
    def setPivotTotalColumnIdsVarargs(value: String*): Self = this.set("pivotTotalColumnIds", js.Array(value :_*))
    
    @scala.inline
    def setPivotTotalColumnIds(value: js.Array[String]): Self = this.set("pivotTotalColumnIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePivotTotalColumnIds: Self = this.set("pivotTotalColumnIds", js.undefined)
    
    @scala.inline
    def setPivotValueColumn(value: Column): Self = this.set("pivotValueColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePivotValueColumn: Self = this.set("pivotValueColumn", js.undefined)
    
    @scala.inline
    def setRefData(value: StringDictionary[String]): Self = this.set("refData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefData: Self = this.set("refData", js.undefined)
    
    @scala.inline
    def setRowDragFunction1(value: /* params */ js.Any => Boolean): Self = this.set("rowDrag", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRowDrag(value: Boolean | (js.Function1[/* params */ js.Any, Boolean])): Self = this.set("rowDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowDrag: Self = this.set("rowDrag", js.undefined)
    
    @scala.inline
    def setRowGroup(value: Boolean): Self = this.set("rowGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowGroup: Self = this.set("rowGroup", js.undefined)
    
    @scala.inline
    def setRowGroupIndex(value: Double): Self = this.set("rowGroupIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowGroupIndex: Self = this.set("rowGroupIndex", js.undefined)
    
    @scala.inline
    def setRowSpan(value: /* params */ RowSpanParams => Double): Self = this.set("rowSpan", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRowSpan: Self = this.set("rowSpan", js.undefined)
    
    @scala.inline
    def setShowRowGroup(value: String | Boolean): Self = this.set("showRowGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowRowGroup: Self = this.set("showRowGroup", js.undefined)
    
    @scala.inline
    def setSingleClickEdit(value: Boolean): Self = this.set("singleClickEdit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingleClickEdit: Self = this.set("singleClickEdit", js.undefined)
    
    @scala.inline
    def setSort(value: String): Self = this.set("sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    
    @scala.inline
    def setSortedAt(value: Double): Self = this.set("sortedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortedAt: Self = this.set("sortedAt", js.undefined)
    
    @scala.inline
    def setSortingOrderVarargs(value: String*): Self = this.set("sortingOrder", js.Array(value :_*))
    
    @scala.inline
    def setSortingOrder(value: js.Array[String]): Self = this.set("sortingOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortingOrder: Self = this.set("sortingOrder", js.undefined)
    
    @scala.inline
    def setSuppressAutoSize(value: Boolean): Self = this.set("suppressAutoSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressAutoSize: Self = this.set("suppressAutoSize", js.undefined)
    
    @scala.inline
    def setSuppressCellFlash(value: Boolean): Self = this.set("suppressCellFlash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressCellFlash: Self = this.set("suppressCellFlash", js.undefined)
    
    @scala.inline
    def setSuppressFilter(value: Boolean): Self = this.set("suppressFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressFilter: Self = this.set("suppressFilter", js.undefined)
    
    @scala.inline
    def setSuppressKeyboardEvent(value: /* params */ SuppressKeyboardEventParams => Boolean): Self = this.set("suppressKeyboardEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuppressKeyboardEvent: Self = this.set("suppressKeyboardEvent", js.undefined)
    
    @scala.inline
    def setSuppressMenu(value: Boolean): Self = this.set("suppressMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressMenu: Self = this.set("suppressMenu", js.undefined)
    
    @scala.inline
    def setSuppressMovable(value: Boolean): Self = this.set("suppressMovable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressMovable: Self = this.set("suppressMovable", js.undefined)
    
    @scala.inline
    def setSuppressNavigableFunction1(value: /* params */ IsColumnFuncParams => Boolean): Self = this.set("suppressNavigable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuppressNavigable(value: Boolean | IsColumnFunc): Self = this.set("suppressNavigable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressNavigable: Self = this.set("suppressNavigable", js.undefined)
    
    @scala.inline
    def setSuppressPasteFunction1(value: /* params */ IsColumnFuncParams => Boolean): Self = this.set("suppressPaste", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuppressPaste(value: Boolean | IsColumnFunc): Self = this.set("suppressPaste", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressPaste: Self = this.set("suppressPaste", js.undefined)
    
    @scala.inline
    def setSuppressResize(value: Boolean): Self = this.set("suppressResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressResize: Self = this.set("suppressResize", js.undefined)
    
    @scala.inline
    def setSuppressSizeToFit(value: Boolean): Self = this.set("suppressSizeToFit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressSizeToFit: Self = this.set("suppressSizeToFit", js.undefined)
    
    @scala.inline
    def setSuppressSorting(value: Boolean): Self = this.set("suppressSorting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressSorting: Self = this.set("suppressSorting", js.undefined)
    
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    
    @scala.inline
    def setTemplateUrl(value: String): Self = this.set("templateUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateUrl: Self = this.set("templateUrl", js.undefined)
    
    @scala.inline
    def setTooltip(value: /* params */ TooltipParams => String): Self = this.set("tooltip", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    
    @scala.inline
    def setTooltipField(value: String): Self = this.set("tooltipField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipField: Self = this.set("tooltipField", js.undefined)
    
    @scala.inline
    def setTypeVarargs(value: String*): Self = this.set("type", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String | js.Array[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUnSortIcon(value: Boolean): Self = this.set("unSortIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnSortIcon: Self = this.set("unSortIcon", js.undefined)
    
    @scala.inline
    def setValueFormatter(value: /* params */ ValueFormatterParams => String): Self = this.set("valueFormatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteValueFormatter: Self = this.set("valueFormatter", js.undefined)
    
    @scala.inline
    def setValueGetterFunction1(value: /* params */ ValueGetterParams => _): Self = this.set("valueGetter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValueGetter(value: (js.Function1[/* params */ ValueGetterParams, _]) | String): Self = this.set("valueGetter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueGetter: Self = this.set("valueGetter", js.undefined)
    
    @scala.inline
    def setValueParser(value: /* params */ ValueParserParams => _ | String): Self = this.set("valueParser", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteValueParser: Self = this.set("valueParser", js.undefined)
    
    @scala.inline
    def setValueSetterFunction1(value: /* params */ ValueSetterParams => Boolean): Self = this.set("valueSetter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValueSetter(value: (js.Function1[/* params */ ValueSetterParams, Boolean]) | String): Self = this.set("valueSetter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueSetter: Self = this.set("valueSetter", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
