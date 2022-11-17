package typings.antd

import typings.antd.anon.Column
import typings.antd.anon.Compare
import typings.antd.anon.PartialOmitCheckboxPropsc
import typings.antd.anon.Type
import typings.antd.libPaginationPaginationMod.PaginationProps
import typings.antd.libTableHooksUseSelectionMod.INTERNAL_SELECTION_ITEM
import typings.antd.libTooltipMod.TooltipProps
import typings.antd.libUtilResponsiveObserveMod.Breakpoint
import typings.rcTable.libInterfaceMod.AlignType
import typings.rcTable.libInterfaceMod.CellEllipsisType
import typings.rcTable.libInterfaceMod.DataIndex
import typings.rcTable.libInterfaceMod.FixedType
import typings.rcTable.libInterfaceMod.GetComponentProps
import typings.rcTable.libInterfaceMod.RenderedCell
import typings.rcTable.libInterfaceMod.RowScopeType
import typings.react.mod.HTMLAttributes
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.TdHTMLAttributes
import typings.std.Event
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTableInterfaceMod {
  
  trait ColumnFilterItem extends StObject {
    
    var children: js.UndefOr[js.Array[ColumnFilterItem]] = js.undefined
    
    var text: ReactNode
    
    var value: String | Double | Boolean
  }
  object ColumnFilterItem {
    
    inline def apply(value: String | Double | Boolean): ColumnFilterItem = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnFilterItem]
    }
    
    extension [Self <: ColumnFilterItem](x: Self) {
      
      inline def setChildren(value: js.Array[ColumnFilterItem]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: ColumnFilterItem*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setText(value: ReactNode): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setValue(value: String | Double | Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
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
    
    var filterMode: js.UndefOr["menu" | "tree"] = js.undefined
    
    var filterMultiple: js.UndefOr[Boolean] = js.undefined
    
    var filterResetToDefaultFilteredValue: js.UndefOr[Boolean] = js.undefined
    
    var filterSearch: js.UndefOr[FilterSearchType[ColumnFilterItem]] = js.undefined
    
    var filtered: js.UndefOr[Boolean] = js.undefined
    
    var filteredValue: js.UndefOr[FilterValue | Null] = js.undefined
    
    var filters: js.UndefOr[js.Array[ColumnFilterItem]] = js.undefined
    
    var fixed: js.UndefOr[FixedType] = js.undefined
    
    var key: js.UndefOr[typings.rcTable.libInterfaceMod.Key] = js.undefined
    
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
    
    var rowScope: js.UndefOr[RowScopeType] = js.undefined
    
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
      
      inline def setFilterMode(value: "menu" | "tree"): Self = StObject.set(x, "filterMode", value.asInstanceOf[js.Any])
      
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
      
      inline def setKey(value: typings.rcTable.libInterfaceMod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
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
      
      inline def setRowScope(value: RowScopeType): Self = StObject.set(x, "rowScope", value.asInstanceOf[js.Any])
      
      inline def setRowScopeUndefined: Self = StObject.set(x, "rowScope", js.undefined)
      
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
  
  type ColumnTitle[RecordType] = ReactNode | (js.Function1[/* props */ ColumnTitleProps[RecordType], ReactNode])
  
  trait ColumnTitleProps[RecordType] extends StObject {
    
    var filters: js.UndefOr[Record[String, FilterValue]] = js.undefined
    
    /** @deprecated Please use `sorterColumns` instead. */
    var sortColumn: js.UndefOr[ColumnType[RecordType]] = js.undefined
    
    var sortColumns: js.UndefOr[js.Array[Column[RecordType]]] = js.undefined
    
    /** @deprecated Please use `sorterColumns` instead. */
    var sortOrder: js.UndefOr[SortOrder] = js.undefined
  }
  object ColumnTitleProps {
    
    inline def apply[RecordType](): ColumnTitleProps[RecordType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnTitleProps[RecordType]]
    }
    
    extension [Self <: ColumnTitleProps[?], RecordType](x: Self & ColumnTitleProps[RecordType]) {
      
      inline def setFilters(value: Record[String, FilterValue]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setSortColumn(value: ColumnType[RecordType]): Self = StObject.set(x, "sortColumn", value.asInstanceOf[js.Any])
      
      inline def setSortColumnUndefined: Self = StObject.set(x, "sortColumn", js.undefined)
      
      inline def setSortColumns(value: js.Array[Column[RecordType]]): Self = StObject.set(x, "sortColumns", value.asInstanceOf[js.Any])
      
      inline def setSortColumnsUndefined: Self = StObject.set(x, "sortColumns", js.undefined)
      
      inline def setSortColumnsVarargs(value: Column[RecordType]*): Self = StObject.set(x, "sortColumns", js.Array(value*))
      
      inline def setSortOrder(value: SortOrder): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
      
      inline def setSortOrderNull: Self = StObject.set(x, "sortOrder", null)
      
      inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
    }
  }
  
  /* Inlined parent std.Omit<rc-table.rc-table/lib/interface.ColumnType<RecordType>, 'title'> */
  trait ColumnType[RecordType] extends StObject {
    
    var align: js.UndefOr[AlignType] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var colSpan: js.UndefOr[Double] = js.undefined
    
    var dataIndex: js.UndefOr[DataIndex] = js.undefined
    
    var defaultFilteredValue: js.UndefOr[FilterValue | Null] = js.undefined
    
    var defaultSortOrder: js.UndefOr[SortOrder] = js.undefined
    
    var ellipsis: js.UndefOr[CellEllipsisType] = js.undefined
    
    var filterDropdown: js.UndefOr[ReactNode | (js.Function1[/* props */ FilterDropdownProps, ReactNode])] = js.undefined
    
    var filterDropdownOpen: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @deprecated `filterDropdownVisible` is deprecated which will be removed in next major version.
      *   Please use `filterDropdownOpen` instead.
      */
    var filterDropdownVisible: js.UndefOr[Boolean] = js.undefined
    
    var filterIcon: js.UndefOr[ReactNode | (js.Function1[/* filtered */ Boolean, ReactNode])] = js.undefined
    
    var filterMode: js.UndefOr["menu" | "tree"] = js.undefined
    
    var filterMultiple: js.UndefOr[Boolean] = js.undefined
    
    var filterResetToDefaultFilteredValue: js.UndefOr[Boolean] = js.undefined
    
    var filterSearch: js.UndefOr[FilterSearchType[ColumnFilterItem]] = js.undefined
    
    var filtered: js.UndefOr[Boolean] = js.undefined
    
    var filteredValue: js.UndefOr[FilterValue | Null] = js.undefined
    
    var filters: js.UndefOr[js.Array[ColumnFilterItem]] = js.undefined
    
    var fixed: js.UndefOr[FixedType] = js.undefined
    
    var key: js.UndefOr[typings.rcTable.libInterfaceMod.Key] = js.undefined
    
    var onCell: js.UndefOr[GetComponentProps[RecordType]] = js.undefined
    
    var onCellClick: js.UndefOr[
        js.Function2[/* record */ RecordType, /* e */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]
      ] = js.undefined
    
    var onFilter: js.UndefOr[
        js.Function2[/* value */ String | Double | Boolean, /* record */ RecordType, Boolean]
      ] = js.undefined
    
    var onFilterDropdownOpenChange: js.UndefOr[js.Function1[/* open */ Boolean, Unit]] = js.undefined
    
    /**
      * @deprecated `onFilterDropdownVisibleChange` is deprecated which will be removed in next major
      *   version. Please use `onFilterDropdownOpenChange` instead.
      */
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
    
    var rowScope: js.UndefOr[RowScopeType] = js.undefined
    
    var rowSpan: js.UndefOr[Double] = js.undefined
    
    var shouldCellUpdate: js.UndefOr[js.Function2[/* record */ RecordType, /* prevRecord */ RecordType, Boolean]] = js.undefined
    
    var showSorterTooltip: js.UndefOr[Boolean | TooltipProps] = js.undefined
    
    var sortDirections: js.UndefOr[js.Array[SortOrder]] = js.undefined
    
    var sortOrder: js.UndefOr[SortOrder] = js.undefined
    
    var sorter: js.UndefOr[Boolean | CompareFn[RecordType] | Compare[RecordType]] = js.undefined
    
    var title: js.UndefOr[ColumnTitle[RecordType]] = js.undefined
    
    var width: js.UndefOr[Double | String] = js.undefined
  }
  object ColumnType {
    
    inline def apply[RecordType](): ColumnType[RecordType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnType[RecordType]]
    }
    
    extension [Self <: ColumnType[?], RecordType](x: Self & ColumnType[RecordType]) {
      
      inline def setAlign(value: AlignType): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
      
      inline def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
      
      inline def setDataIndex(value: DataIndex): Self = StObject.set(x, "dataIndex", value.asInstanceOf[js.Any])
      
      inline def setDataIndexUndefined: Self = StObject.set(x, "dataIndex", js.undefined)
      
      inline def setDataIndexVarargs(value: (String | Double)*): Self = StObject.set(x, "dataIndex", js.Array(value*))
      
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
      
      inline def setFilterMode(value: "menu" | "tree"): Self = StObject.set(x, "filterMode", value.asInstanceOf[js.Any])
      
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
      
      inline def setKey(value: typings.rcTable.libInterfaceMod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
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
      
      inline def setRowScope(value: RowScopeType): Self = StObject.set(x, "rowScope", value.asInstanceOf[js.Any])
      
      inline def setRowScopeUndefined: Self = StObject.set(x, "rowScope", js.undefined)
      
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
  
  type ColumnsType[RecordType] = js.Array[ColumnGroupType[RecordType] | ColumnType[RecordType]]
  
  type CompareFn[T] = js.Function3[/* a */ T, /* b */ T, /* sortOrder */ js.UndefOr[SortOrder], Double]
  
  type ExpandType = Null | "row" | "nest"
  
  trait FilterConfirmProps extends StObject {
    
    var closeDropdown: Boolean
  }
  object FilterConfirmProps {
    
    inline def apply(closeDropdown: Boolean): FilterConfirmProps = {
      val __obj = js.Dynamic.literal(closeDropdown = closeDropdown.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilterConfirmProps]
    }
    
    extension [Self <: FilterConfirmProps](x: Self) {
      
      inline def setCloseDropdown(value: Boolean): Self = StObject.set(x, "closeDropdown", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FilterDropdownProps extends StObject {
    
    var clearFilters: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** Only close filterDropdown */
    def close(): Unit = js.native
    
    /**
      * Confirm filter value, if you want to close dropdown before commit, you can call with
      * {closeDropdown: true}
      */
    def confirm(): Unit = js.native
    def confirm(param: FilterConfirmProps): Unit = js.native
    
    var filters: js.UndefOr[js.Array[ColumnFilterItem]] = js.native
    
    var prefixCls: String = js.native
    
    var selectedKeys: js.Array[typings.react.mod.Key] = js.native
    
    def setSelectedKeys(selectedKeys: js.Array[typings.react.mod.Key]): Unit = js.native
    
    var visible: Boolean = js.native
  }
  
  type FilterKey = js.Array[Key] | Null
  
  type FilterSearchType[RecordType] = Boolean | (js.Function2[/* input */ String, /* record */ RecordType, Boolean])
  
  type FilterValue = js.Array[Key | Boolean]
  
  type GetPopupContainer = js.Function1[/* triggerNode */ HTMLElement, HTMLElement]
  
  type Key = typings.react.mod.Key
  
  object RowSelectMethod {
    
    inline def all: "all" = "all".asInstanceOf["all"]
    
    inline def invert: "invert" = "invert".asInstanceOf["invert"]
    
    inline def multiple: "multiple" = "multiple".asInstanceOf["multiple"]
    
    inline def none: "none" = "none".asInstanceOf["none"]
    
    inline def single: "single" = "single".asInstanceOf["single"]
  }
  type RowSelectMethod = "all" | "none" | "invert" | "single" | "multiple"
  
  object RowSelectionType {
    
    inline def checkbox: "checkbox" = "checkbox".asInstanceOf["checkbox"]
    
    inline def radio: "radio" = "radio".asInstanceOf["radio"]
  }
  type RowSelectionType = "checkbox" | "radio"
  
  trait SelectionItem extends StObject {
    
    var key: String
    
    var onSelect: js.UndefOr[SelectionItemSelectFn] = js.undefined
    
    var text: ReactNode
  }
  object SelectionItem {
    
    inline def apply(key: String): SelectionItem = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectionItem]
    }
    
    extension [Self <: SelectionItem](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setOnSelect(value: /* currentRowKeys */ js.Array[Key] => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setText(value: ReactNode): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  type SelectionItemSelectFn = js.Function1[/* currentRowKeys */ js.Array[Key], Unit]
  
  type SelectionSelectFn[T] = js.Function4[
    /* record */ T, 
    /* selected */ Boolean, 
    /* selectedRows */ js.Array[T], 
    /* nativeEvent */ Event, 
    Unit
  ]
  
  type SortOrder = "descend" | "ascend" | Null
  
  trait SorterResult[RecordType] extends StObject {
    
    var column: js.UndefOr[ColumnType[RecordType]] = js.undefined
    
    var columnKey: js.UndefOr[Key] = js.undefined
    
    var field: js.UndefOr[Key | js.Array[Key]] = js.undefined
    
    var order: js.UndefOr[SortOrder] = js.undefined
  }
  object SorterResult {
    
    inline def apply[RecordType](): SorterResult[RecordType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SorterResult[RecordType]]
    }
    
    extension [Self <: SorterResult[?], RecordType](x: Self & SorterResult[RecordType]) {
      
      inline def setColumn(value: ColumnType[RecordType]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnKey(value: Key): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
      
      inline def setColumnKeyUndefined: Self = StObject.set(x, "columnKey", js.undefined)
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setField(value: Key | js.Array[Key]): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      inline def setFieldVarargs(value: Key*): Self = StObject.set(x, "field", js.Array(value*))
      
      inline def setOrder(value: SortOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderNull: Self = StObject.set(x, "order", null)
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    }
  }
  
  type TableAction = "paginate" | "sort" | "filter"
  
  trait TableCurrentDataSource[RecordType] extends StObject {
    
    var action: TableAction
    
    var currentDataSource: js.Array[RecordType]
  }
  object TableCurrentDataSource {
    
    inline def apply[RecordType](action: TableAction, currentDataSource: js.Array[RecordType]): TableCurrentDataSource[RecordType] = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], currentDataSource = currentDataSource.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableCurrentDataSource[RecordType]]
    }
    
    extension [Self <: TableCurrentDataSource[?], RecordType](x: Self & TableCurrentDataSource[RecordType]) {
      
      inline def setAction(value: TableAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setCurrentDataSource(value: js.Array[RecordType]): Self = StObject.set(x, "currentDataSource", value.asInstanceOf[js.Any])
      
      inline def setCurrentDataSourceVarargs(value: RecordType*): Self = StObject.set(x, "currentDataSource", js.Array(value*))
    }
  }
  
  trait TableLocale extends StObject {
    
    var cancelSort: js.UndefOr[String] = js.undefined
    
    var collapse: js.UndefOr[String] = js.undefined
    
    var emptyText: js.UndefOr[ReactNode | js.Function0[ReactNode]] = js.undefined
    
    var expand: js.UndefOr[String] = js.undefined
    
    var filterCheckall: js.UndefOr[ReactNode] = js.undefined
    
    var filterConfirm: js.UndefOr[ReactNode] = js.undefined
    
    var filterEmptyText: js.UndefOr[ReactNode] = js.undefined
    
    var filterReset: js.UndefOr[ReactNode] = js.undefined
    
    var filterSearchPlaceholder: js.UndefOr[String] = js.undefined
    
    var filterTitle: js.UndefOr[String] = js.undefined
    
    var selectAll: js.UndefOr[ReactNode] = js.undefined
    
    var selectInvert: js.UndefOr[ReactNode] = js.undefined
    
    var selectNone: js.UndefOr[ReactNode] = js.undefined
    
    var selectionAll: js.UndefOr[ReactNode] = js.undefined
    
    var sortTitle: js.UndefOr[String] = js.undefined
    
    var triggerAsc: js.UndefOr[String] = js.undefined
    
    var triggerDesc: js.UndefOr[String] = js.undefined
  }
  object TableLocale {
    
    inline def apply(): TableLocale = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableLocale]
    }
    
    extension [Self <: TableLocale](x: Self) {
      
      inline def setCancelSort(value: String): Self = StObject.set(x, "cancelSort", value.asInstanceOf[js.Any])
      
      inline def setCancelSortUndefined: Self = StObject.set(x, "cancelSort", js.undefined)
      
      inline def setCollapse(value: String): Self = StObject.set(x, "collapse", value.asInstanceOf[js.Any])
      
      inline def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
      
      inline def setEmptyText(value: ReactNode | js.Function0[ReactNode]): Self = StObject.set(x, "emptyText", value.asInstanceOf[js.Any])
      
      inline def setEmptyTextFunction0(value: () => ReactNode): Self = StObject.set(x, "emptyText", js.Any.fromFunction0(value))
      
      inline def setEmptyTextUndefined: Self = StObject.set(x, "emptyText", js.undefined)
      
      inline def setExpand(value: String): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
      
      inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
      
      inline def setFilterCheckall(value: ReactNode): Self = StObject.set(x, "filterCheckall", value.asInstanceOf[js.Any])
      
      inline def setFilterCheckallUndefined: Self = StObject.set(x, "filterCheckall", js.undefined)
      
      inline def setFilterConfirm(value: ReactNode): Self = StObject.set(x, "filterConfirm", value.asInstanceOf[js.Any])
      
      inline def setFilterConfirmUndefined: Self = StObject.set(x, "filterConfirm", js.undefined)
      
      inline def setFilterEmptyText(value: ReactNode): Self = StObject.set(x, "filterEmptyText", value.asInstanceOf[js.Any])
      
      inline def setFilterEmptyTextUndefined: Self = StObject.set(x, "filterEmptyText", js.undefined)
      
      inline def setFilterReset(value: ReactNode): Self = StObject.set(x, "filterReset", value.asInstanceOf[js.Any])
      
      inline def setFilterResetUndefined: Self = StObject.set(x, "filterReset", js.undefined)
      
      inline def setFilterSearchPlaceholder(value: String): Self = StObject.set(x, "filterSearchPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setFilterSearchPlaceholderUndefined: Self = StObject.set(x, "filterSearchPlaceholder", js.undefined)
      
      inline def setFilterTitle(value: String): Self = StObject.set(x, "filterTitle", value.asInstanceOf[js.Any])
      
      inline def setFilterTitleUndefined: Self = StObject.set(x, "filterTitle", js.undefined)
      
      inline def setSelectAll(value: ReactNode): Self = StObject.set(x, "selectAll", value.asInstanceOf[js.Any])
      
      inline def setSelectAllUndefined: Self = StObject.set(x, "selectAll", js.undefined)
      
      inline def setSelectInvert(value: ReactNode): Self = StObject.set(x, "selectInvert", value.asInstanceOf[js.Any])
      
      inline def setSelectInvertUndefined: Self = StObject.set(x, "selectInvert", js.undefined)
      
      inline def setSelectNone(value: ReactNode): Self = StObject.set(x, "selectNone", value.asInstanceOf[js.Any])
      
      inline def setSelectNoneUndefined: Self = StObject.set(x, "selectNone", js.undefined)
      
      inline def setSelectionAll(value: ReactNode): Self = StObject.set(x, "selectionAll", value.asInstanceOf[js.Any])
      
      inline def setSelectionAllUndefined: Self = StObject.set(x, "selectionAll", js.undefined)
      
      inline def setSortTitle(value: String): Self = StObject.set(x, "sortTitle", value.asInstanceOf[js.Any])
      
      inline def setSortTitleUndefined: Self = StObject.set(x, "sortTitle", js.undefined)
      
      inline def setTriggerAsc(value: String): Self = StObject.set(x, "triggerAsc", value.asInstanceOf[js.Any])
      
      inline def setTriggerAscUndefined: Self = StObject.set(x, "triggerAsc", js.undefined)
      
      inline def setTriggerDesc(value: String): Self = StObject.set(x, "triggerDesc", value.asInstanceOf[js.Any])
      
      inline def setTriggerDescUndefined: Self = StObject.set(x, "triggerDesc", js.undefined)
    }
  }
  
  trait TablePaginationConfig
    extends StObject
       with PaginationProps {
    
    var position: js.UndefOr[js.Array[TablePaginationPosition]] = js.undefined
  }
  object TablePaginationConfig {
    
    inline def apply(): TablePaginationConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TablePaginationConfig]
    }
    
    extension [Self <: TablePaginationConfig](x: Self) {
      
      inline def setPosition(value: js.Array[TablePaginationPosition]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setPositionVarargs(value: TablePaginationPosition*): Self = StObject.set(x, "position", js.Array(value*))
    }
  }
  
  object TablePaginationPosition {
    
    inline def bottomCenter: "bottomCenter" = "bottomCenter".asInstanceOf["bottomCenter"]
    
    inline def bottomLeft: "bottomLeft" = "bottomLeft".asInstanceOf["bottomLeft"]
    
    inline def bottomRight: "bottomRight" = "bottomRight".asInstanceOf["bottomRight"]
    
    inline def topCenter: "topCenter" = "topCenter".asInstanceOf["topCenter"]
    
    inline def topLeft: "topLeft" = "topLeft".asInstanceOf["topLeft"]
    
    inline def topRight: "topRight" = "topRight".asInstanceOf["topRight"]
  }
  type TablePaginationPosition = "topLeft" | "topCenter" | "topRight" | "bottomLeft" | "bottomCenter" | "bottomRight"
  
  trait TableRowSelection[T] extends StObject {
    
    var checkStrictly: js.UndefOr[Boolean] = js.undefined
    
    var columnTitle: js.UndefOr[String | ReactNode] = js.undefined
    
    var columnWidth: js.UndefOr[String | Double] = js.undefined
    
    var defaultSelectedRowKeys: js.UndefOr[js.Array[Key]] = js.undefined
    
    var fixed: js.UndefOr[FixedType] = js.undefined
    
    var getCheckboxProps: js.UndefOr[js.Function1[/* record */ T, PartialOmitCheckboxPropsc]] = js.undefined
    
    var hideSelectAll: js.UndefOr[Boolean] = js.undefined
    
    var onChange: js.UndefOr[
        js.Function3[
          /* selectedRowKeys */ js.Array[Key], 
          /* selectedRows */ js.Array[T], 
          /* info */ Type, 
          Unit
        ]
      ] = js.undefined
    
    var onSelect: js.UndefOr[SelectionSelectFn[T]] = js.undefined
    
    /** @deprecated This function is deprecated and should use `onChange` instead */
    var onSelectAll: js.UndefOr[
        js.Function3[
          /* selected */ Boolean, 
          /* selectedRows */ js.Array[T], 
          /* changeRows */ js.Array[T], 
          Unit
        ]
      ] = js.undefined
    
    /** @deprecated This function is deprecated and should use `onChange` instead */
    var onSelectInvert: js.UndefOr[js.Function1[/* selectedRowKeys */ js.Array[Key], Unit]] = js.undefined
    
    /** @deprecated This function is deprecated and should use `onChange` instead */
    var onSelectMultiple: js.UndefOr[
        js.Function3[
          /* selected */ Boolean, 
          /* selectedRows */ js.Array[T], 
          /* changeRows */ js.Array[T], 
          Unit
        ]
      ] = js.undefined
    
    /** @deprecated This function is deprecated and should use `onChange` instead */
    var onSelectNone: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** Keep the selection keys in list even the key not exist in `dataSource` anymore */
    var preserveSelectedRowKeys: js.UndefOr[Boolean] = js.undefined
    
    var renderCell: js.UndefOr[
        js.Function4[
          /* value */ Boolean, 
          /* record */ T, 
          /* index */ Double, 
          /* originNode */ ReactNode, 
          ReactNode | RenderedCell[T]
        ]
      ] = js.undefined
    
    var selectedRowKeys: js.UndefOr[js.Array[Key]] = js.undefined
    
    var selections: js.UndefOr[js.Array[INTERNAL_SELECTION_ITEM] | Boolean] = js.undefined
    
    var `type`: js.UndefOr[RowSelectionType] = js.undefined
  }
  object TableRowSelection {
    
    inline def apply[T](): TableRowSelection[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableRowSelection[T]]
    }
    
    extension [Self <: TableRowSelection[?], T](x: Self & TableRowSelection[T]) {
      
      inline def setCheckStrictly(value: Boolean): Self = StObject.set(x, "checkStrictly", value.asInstanceOf[js.Any])
      
      inline def setCheckStrictlyUndefined: Self = StObject.set(x, "checkStrictly", js.undefined)
      
      inline def setColumnTitle(value: String | ReactNode): Self = StObject.set(x, "columnTitle", value.asInstanceOf[js.Any])
      
      inline def setColumnTitleUndefined: Self = StObject.set(x, "columnTitle", js.undefined)
      
      inline def setColumnWidth(value: String | Double): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
      
      inline def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
      
      inline def setDefaultSelectedRowKeys(value: js.Array[Key]): Self = StObject.set(x, "defaultSelectedRowKeys", value.asInstanceOf[js.Any])
      
      inline def setDefaultSelectedRowKeysUndefined: Self = StObject.set(x, "defaultSelectedRowKeys", js.undefined)
      
      inline def setDefaultSelectedRowKeysVarargs(value: Key*): Self = StObject.set(x, "defaultSelectedRowKeys", js.Array(value*))
      
      inline def setFixed(value: FixedType): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      inline def setGetCheckboxProps(value: /* record */ T => PartialOmitCheckboxPropsc): Self = StObject.set(x, "getCheckboxProps", js.Any.fromFunction1(value))
      
      inline def setGetCheckboxPropsUndefined: Self = StObject.set(x, "getCheckboxProps", js.undefined)
      
      inline def setHideSelectAll(value: Boolean): Self = StObject.set(x, "hideSelectAll", value.asInstanceOf[js.Any])
      
      inline def setHideSelectAllUndefined: Self = StObject.set(x, "hideSelectAll", js.undefined)
      
      inline def setOnChange(
        value: (/* selectedRowKeys */ js.Array[Key], /* selectedRows */ js.Array[T], /* info */ Type) => Unit
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction3(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnSelect(
        value: (T, /* selected */ Boolean, /* selectedRows */ js.Array[T], /* nativeEvent */ Event) => Unit
      ): Self = StObject.set(x, "onSelect", js.Any.fromFunction4(value))
      
      inline def setOnSelectAll(
        value: (/* selected */ Boolean, /* selectedRows */ js.Array[T], /* changeRows */ js.Array[T]) => Unit
      ): Self = StObject.set(x, "onSelectAll", js.Any.fromFunction3(value))
      
      inline def setOnSelectAllUndefined: Self = StObject.set(x, "onSelectAll", js.undefined)
      
      inline def setOnSelectInvert(value: /* selectedRowKeys */ js.Array[Key] => Unit): Self = StObject.set(x, "onSelectInvert", js.Any.fromFunction1(value))
      
      inline def setOnSelectInvertUndefined: Self = StObject.set(x, "onSelectInvert", js.undefined)
      
      inline def setOnSelectMultiple(
        value: (/* selected */ Boolean, /* selectedRows */ js.Array[T], /* changeRows */ js.Array[T]) => Unit
      ): Self = StObject.set(x, "onSelectMultiple", js.Any.fromFunction3(value))
      
      inline def setOnSelectMultipleUndefined: Self = StObject.set(x, "onSelectMultiple", js.undefined)
      
      inline def setOnSelectNone(value: () => Unit): Self = StObject.set(x, "onSelectNone", js.Any.fromFunction0(value))
      
      inline def setOnSelectNoneUndefined: Self = StObject.set(x, "onSelectNone", js.undefined)
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setPreserveSelectedRowKeys(value: Boolean): Self = StObject.set(x, "preserveSelectedRowKeys", value.asInstanceOf[js.Any])
      
      inline def setPreserveSelectedRowKeysUndefined: Self = StObject.set(x, "preserveSelectedRowKeys", js.undefined)
      
      inline def setRenderCell(
        value: (/* value */ Boolean, /* record */ T, /* index */ Double, /* originNode */ ReactNode) => ReactNode | RenderedCell[T]
      ): Self = StObject.set(x, "renderCell", js.Any.fromFunction4(value))
      
      inline def setRenderCellUndefined: Self = StObject.set(x, "renderCell", js.undefined)
      
      inline def setSelectedRowKeys(value: js.Array[Key]): Self = StObject.set(x, "selectedRowKeys", value.asInstanceOf[js.Any])
      
      inline def setSelectedRowKeysUndefined: Self = StObject.set(x, "selectedRowKeys", js.undefined)
      
      inline def setSelectedRowKeysVarargs(value: Key*): Self = StObject.set(x, "selectedRowKeys", js.Array(value*))
      
      inline def setSelections(value: js.Array[INTERNAL_SELECTION_ITEM] | Boolean): Self = StObject.set(x, "selections", value.asInstanceOf[js.Any])
      
      inline def setSelectionsUndefined: Self = StObject.set(x, "selections", js.undefined)
      
      inline def setSelectionsVarargs(value: INTERNAL_SELECTION_ITEM*): Self = StObject.set(x, "selections", js.Array(value*))
      
      inline def setType(value: RowSelectionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type TransformColumns[RecordType] = js.Function1[/* columns */ ColumnsType[RecordType], ColumnsType[RecordType]]
}
