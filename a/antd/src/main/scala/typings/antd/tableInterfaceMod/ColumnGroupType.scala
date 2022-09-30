package typings.antd.tableInterfaceMod

import typings.antd.anon.Compare
import typings.antd.antdStrings.menu
import typings.antd.antdStrings.tree
import typings.antd.responsiveObserveMod.Breakpoint
import typings.antd.tooltipMod.TooltipProps
import typings.rcTable.interfaceMod.AlignType
import typings.rcTable.interfaceMod.CellEllipsisType
import typings.rcTable.interfaceMod.FixedType
import typings.rcTable.interfaceMod.GetComponentProps
import typings.rcTable.interfaceMod.RenderedCell
import typings.react.mod.HTMLAttributes
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.TdHTMLAttributes
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<antd.antd/lib/table/interface.ColumnType<RecordType>, 'dataIndex'> */
trait ColumnGroupType[RecordType] extends StObject {
  
  var align: js.UndefOr[AlignType] = js.undefined
  
  var children: ColumnsType[RecordType]
  
  var className: js.UndefOr[String] = js.undefined
  
  var colSpan: js.UndefOr[Double] = js.undefined
  
  var defaultFilteredValue: js.UndefOr[FilterValue | Null] = js.undefined
  
  var defaultSortOrder: js.UndefOr[SortOrder] = js.undefined
  
  var ellipsis: js.UndefOr[CellEllipsisType] = js.undefined
  
  var filterDropdown: js.UndefOr[ReactNode | (js.Function1[/* props */ FilterDropdownProps, ReactNode])] = js.undefined
  
  var filterDropdownOpen: js.UndefOr[Boolean] = js.undefined
  
  var filterDropdownVisible: js.UndefOr[Boolean] = js.undefined
  
  var filterIcon: js.UndefOr[ReactNode | (js.Function1[/* filtered */ Boolean, ReactNode])] = js.undefined
  
  var filterMode: js.UndefOr[menu | tree] = js.undefined
  
  var filterMultiple: js.UndefOr[Boolean] = js.undefined
  
  var filterResetToDefaultFilteredValue: js.UndefOr[Boolean] = js.undefined
  
  var filterSearch: js.UndefOr[FilterSearchType[ColumnFilterItem]] = js.undefined
  
  var filtered: js.UndefOr[Boolean] = js.undefined
  
  var filteredValue: js.UndefOr[FilterValue | Null] = js.undefined
  
  var filters: js.UndefOr[js.Array[ColumnFilterItem]] = js.undefined
  
  var fixed: js.UndefOr[FixedType] = js.undefined
  
  var key: js.UndefOr[typings.rcTable.interfaceMod.Key] = js.undefined
  
  var onCell: js.UndefOr[GetComponentProps[RecordType]] = js.undefined
  
  var onCellClick: js.UndefOr[
    js.Function2[/* record */ RecordType, /* e */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]
  ] = js.undefined
  
  var onFilter: js.UndefOr[
    js.Function2[/* value */ String | Double | Boolean, /* record */ RecordType, Boolean]
  ] = js.undefined
  
  var onFilterDropdownOpenChange: js.UndefOr[js.Function1[/* open */ Boolean, Unit]] = js.undefined
  
  var onFilterDropdownVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
  
  var onHeaderCell: js.UndefOr[
    GetComponentProps[
      /* import warning: importer.ImportType#apply Failed type conversion: rc-table.rc-table/lib/interface.ColumnsType<RecordType>[number] */ js.Any
    ]
  ] = js.undefined
  
  var render: js.UndefOr[
    js.Function3[
      /* value */ Any, 
      /* record */ RecordType, 
      /* index */ Double, 
      ReactNode | RenderedCell[RecordType]
    ]
  ] = js.undefined
  
  var responsive: js.UndefOr[js.Array[Breakpoint]] = js.undefined
  
  var rowSpan: js.UndefOr[Double] = js.undefined
  
  var shouldCellUpdate: js.UndefOr[js.Function2[/* record */ RecordType, /* prevRecord */ RecordType, Boolean]] = js.undefined
  
  var showSorterTooltip: js.UndefOr[Boolean | TooltipProps] = js.undefined
  
  var sortDirections: js.UndefOr[js.Array[SortOrder]] = js.undefined
  
  var sortOrder: js.UndefOr[SortOrder] = js.undefined
  
  var sorter: js.UndefOr[Boolean | CompareFn[RecordType] | Compare[RecordType]] = js.undefined
  
  var title: js.UndefOr[ColumnTitle[RecordType]] = js.undefined
  
  var width: js.UndefOr[Double | String] = js.undefined
}
object ColumnGroupType {
  
  inline def apply[RecordType](children: ColumnsType[RecordType]): ColumnGroupType[RecordType] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnGroupType[RecordType]]
  }
  
  extension [Self <: ColumnGroupType[?], RecordType](x: Self & ColumnGroupType[RecordType]) {
    
    inline def setAlign(value: AlignType): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setChildren(value: ColumnsType[RecordType]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: (ColumnGroupType[RecordType] | ColumnType[RecordType])*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
    
    inline def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
    
    inline def setDefaultFilteredValue(value: FilterValue): Self = StObject.set(x, "defaultFilteredValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultFilteredValueNull: Self = StObject.set(x, "defaultFilteredValue", null)
    
    inline def setDefaultFilteredValueUndefined: Self = StObject.set(x, "defaultFilteredValue", js.undefined)
    
    inline def setDefaultFilteredValueVarargs(value: (Key | Boolean)*): Self = StObject.set(x, "defaultFilteredValue", js.Array(value*))
    
    inline def setDefaultSortOrder(value: SortOrder): Self = StObject.set(x, "defaultSortOrder", value.asInstanceOf[js.Any])
    
    inline def setDefaultSortOrderNull: Self = StObject.set(x, "defaultSortOrder", null)
    
    inline def setDefaultSortOrderUndefined: Self = StObject.set(x, "defaultSortOrder", js.undefined)
    
    inline def setEllipsis(value: CellEllipsisType): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
    
    inline def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
    
    inline def setFilterDropdown(value: ReactNode | (js.Function1[/* props */ FilterDropdownProps, ReactNode])): Self = StObject.set(x, "filterDropdown", value.asInstanceOf[js.Any])
    
    inline def setFilterDropdownFunction1(value: /* props */ FilterDropdownProps => ReactNode): Self = StObject.set(x, "filterDropdown", js.Any.fromFunction1(value))
    
    inline def setFilterDropdownOpen(value: Boolean): Self = StObject.set(x, "filterDropdownOpen", value.asInstanceOf[js.Any])
    
    inline def setFilterDropdownOpenUndefined: Self = StObject.set(x, "filterDropdownOpen", js.undefined)
    
    inline def setFilterDropdownUndefined: Self = StObject.set(x, "filterDropdown", js.undefined)
    
    inline def setFilterDropdownVisible(value: Boolean): Self = StObject.set(x, "filterDropdownVisible", value.asInstanceOf[js.Any])
    
    inline def setFilterDropdownVisibleUndefined: Self = StObject.set(x, "filterDropdownVisible", js.undefined)
    
    inline def setFilterIcon(value: ReactNode | (js.Function1[/* filtered */ Boolean, ReactNode])): Self = StObject.set(x, "filterIcon", value.asInstanceOf[js.Any])
    
    inline def setFilterIconFunction1(value: /* filtered */ Boolean => ReactNode): Self = StObject.set(x, "filterIcon", js.Any.fromFunction1(value))
    
    inline def setFilterIconUndefined: Self = StObject.set(x, "filterIcon", js.undefined)
    
    inline def setFilterMode(value: menu | tree): Self = StObject.set(x, "filterMode", value.asInstanceOf[js.Any])
    
    inline def setFilterModeUndefined: Self = StObject.set(x, "filterMode", js.undefined)
    
    inline def setFilterMultiple(value: Boolean): Self = StObject.set(x, "filterMultiple", value.asInstanceOf[js.Any])
    
    inline def setFilterMultipleUndefined: Self = StObject.set(x, "filterMultiple", js.undefined)
    
    inline def setFilterResetToDefaultFilteredValue(value: Boolean): Self = StObject.set(x, "filterResetToDefaultFilteredValue", value.asInstanceOf[js.Any])
    
    inline def setFilterResetToDefaultFilteredValueUndefined: Self = StObject.set(x, "filterResetToDefaultFilteredValue", js.undefined)
    
    inline def setFilterSearch(value: FilterSearchType[ColumnFilterItem]): Self = StObject.set(x, "filterSearch", value.asInstanceOf[js.Any])
    
    inline def setFilterSearchFunction2(value: (/* input */ String, ColumnFilterItem) => Boolean): Self = StObject.set(x, "filterSearch", js.Any.fromFunction2(value))
    
    inline def setFilterSearchUndefined: Self = StObject.set(x, "filterSearch", js.undefined)
    
    inline def setFiltered(value: Boolean): Self = StObject.set(x, "filtered", value.asInstanceOf[js.Any])
    
    inline def setFilteredUndefined: Self = StObject.set(x, "filtered", js.undefined)
    
    inline def setFilteredValue(value: FilterValue): Self = StObject.set(x, "filteredValue", value.asInstanceOf[js.Any])
    
    inline def setFilteredValueNull: Self = StObject.set(x, "filteredValue", null)
    
    inline def setFilteredValueUndefined: Self = StObject.set(x, "filteredValue", js.undefined)
    
    inline def setFilteredValueVarargs(value: (Key | Boolean)*): Self = StObject.set(x, "filteredValue", js.Array(value*))
    
    inline def setFilters(value: js.Array[ColumnFilterItem]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: ColumnFilterItem*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setFixed(value: FixedType): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
    
    inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
    
    inline def setKey(value: typings.rcTable.interfaceMod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setOnCell(value: (RecordType, /* index */ js.UndefOr[Double]) => HTMLAttributes[Any] | TdHTMLAttributes[Any]): Self = StObject.set(x, "onCell", js.Any.fromFunction2(value))
    
    inline def setOnCellClick(value: (/* record */ RecordType, /* e */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onCellClick", js.Any.fromFunction2(value))
    
    inline def setOnCellClickUndefined: Self = StObject.set(x, "onCellClick", js.undefined)
    
    inline def setOnCellUndefined: Self = StObject.set(x, "onCell", js.undefined)
    
    inline def setOnFilter(value: (/* value */ String | Double | Boolean, /* record */ RecordType) => Boolean): Self = StObject.set(x, "onFilter", js.Any.fromFunction2(value))
    
    inline def setOnFilterDropdownOpenChange(value: /* open */ Boolean => Unit): Self = StObject.set(x, "onFilterDropdownOpenChange", js.Any.fromFunction1(value))
    
    inline def setOnFilterDropdownOpenChangeUndefined: Self = StObject.set(x, "onFilterDropdownOpenChange", js.undefined)
    
    inline def setOnFilterDropdownVisibleChange(value: /* visible */ Boolean => Unit): Self = StObject.set(x, "onFilterDropdownVisibleChange", js.Any.fromFunction1(value))
    
    inline def setOnFilterDropdownVisibleChangeUndefined: Self = StObject.set(x, "onFilterDropdownVisibleChange", js.undefined)
    
    inline def setOnFilterUndefined: Self = StObject.set(x, "onFilter", js.undefined)
    
    inline def setOnHeaderCell(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: rc-table.rc-table/lib/interface.ColumnsType<RecordType>[number] */ js.Any, /* index */ js.UndefOr[Double]) => HTMLAttributes[Any] | TdHTMLAttributes[Any]
    ): Self = StObject.set(x, "onHeaderCell", js.Any.fromFunction2(value))
    
    inline def setOnHeaderCellUndefined: Self = StObject.set(x, "onHeaderCell", js.undefined)
    
    inline def setRender(
      value: (/* value */ Any, /* record */ RecordType, /* index */ Double) => ReactNode | RenderedCell[RecordType]
    ): Self = StObject.set(x, "render", js.Any.fromFunction3(value))
    
    inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    
    inline def setResponsive(value: js.Array[Breakpoint]): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
    
    inline def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
    
    inline def setResponsiveVarargs(value: Breakpoint*): Self = StObject.set(x, "responsive", js.Array(value*))
    
    inline def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
    
    inline def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
    
    inline def setShouldCellUpdate(value: (/* record */ RecordType, /* prevRecord */ RecordType) => Boolean): Self = StObject.set(x, "shouldCellUpdate", js.Any.fromFunction2(value))
    
    inline def setShouldCellUpdateUndefined: Self = StObject.set(x, "shouldCellUpdate", js.undefined)
    
    inline def setShowSorterTooltip(value: Boolean | TooltipProps): Self = StObject.set(x, "showSorterTooltip", value.asInstanceOf[js.Any])
    
    inline def setShowSorterTooltipUndefined: Self = StObject.set(x, "showSorterTooltip", js.undefined)
    
    inline def setSortDirections(value: js.Array[SortOrder]): Self = StObject.set(x, "sortDirections", value.asInstanceOf[js.Any])
    
    inline def setSortDirectionsUndefined: Self = StObject.set(x, "sortDirections", js.undefined)
    
    inline def setSortDirectionsVarargs(value: SortOrder*): Self = StObject.set(x, "sortDirections", js.Array(value*))
    
    inline def setSortOrder(value: SortOrder): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderNull: Self = StObject.set(x, "sortOrder", null)
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
    
    inline def setSorter(value: Boolean | CompareFn[RecordType] | Compare[RecordType]): Self = StObject.set(x, "sorter", value.asInstanceOf[js.Any])
    
    inline def setSorterFunction3(value: (RecordType, RecordType, /* sortOrder */ js.UndefOr[SortOrder]) => Double): Self = StObject.set(x, "sorter", js.Any.fromFunction3(value))
    
    inline def setSorterUndefined: Self = StObject.set(x, "sorter", js.undefined)
    
    inline def setTitle(value: ColumnTitle[RecordType]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleFunction1(value: /* props */ ColumnTitleProps[RecordType] => ReactNode): Self = StObject.set(x, "title", js.Any.fromFunction1(value))
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
