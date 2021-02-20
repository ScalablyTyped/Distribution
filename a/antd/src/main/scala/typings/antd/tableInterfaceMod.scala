package typings.antd

import typings.antd.anon.Column
import typings.antd.anon.Compare
import typings.antd.anon.PartialOmitCheckboxPropsc
import typings.antd.paginationPaginationMod.PaginationProps
import typings.antd.responsiveObserveMod.Breakpoint
import typings.antd.useSelectionMod.INTERNAL_SELECTION_ITEM
import typings.rcTable.interfaceMod.AlignType
import typings.rcTable.interfaceMod.CellEllipsisType
import typings.rcTable.interfaceMod.FixedType
import typings.rcTable.interfaceMod.GetComponentProps
import typings.rcTable.interfaceMod.RenderedCell
import typings.react.mod.HTMLAttributes
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.Event
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableInterfaceMod {
  
  @js.native
  trait ColumnFilterItem extends StObject {
    
    var children: js.UndefOr[js.Array[ColumnFilterItem]] = js.native
    
    var text: ReactNode = js.native
    
    var value: String | Double | Boolean = js.native
  }
  object ColumnFilterItem {
    
    @scala.inline
    def apply(value: String | Double | Boolean): ColumnFilterItem = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnFilterItem]
    }
    
    @scala.inline
    implicit class ColumnFilterItemMutableBuilder[Self <: ColumnFilterItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[ColumnFilterItem]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: ColumnFilterItem*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setText(value: ReactNode): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setValue(value: String | Double | Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Omit<antd.antd/lib/table/interface.ColumnType<RecordType>, 'dataIndex'> */
  @js.native
  trait ColumnGroupType[RecordType] extends StObject {
    
    var align: js.UndefOr[AlignType] = js.native
    
    var children: ColumnsType[RecordType] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var colSpan: js.UndefOr[Double] = js.native
    
    var defaultFilteredValue: js.UndefOr[js.Array[Key] | Null] = js.native
    
    var defaultSortOrder: js.UndefOr[SortOrder] = js.native
    
    var ellipsis: js.UndefOr[CellEllipsisType] = js.native
    
    var filterDropdown: js.UndefOr[ReactNode | (js.Function1[/* props */ FilterDropdownProps, ReactNode])] = js.native
    
    var filterDropdownVisible: js.UndefOr[Boolean] = js.native
    
    var filterIcon: js.UndefOr[ReactNode | (js.Function1[/* filtered */ Boolean, ReactNode])] = js.native
    
    var filterMultiple: js.UndefOr[Boolean] = js.native
    
    var filtered: js.UndefOr[Boolean] = js.native
    
    var filteredValue: js.UndefOr[js.Array[Key] | Null] = js.native
    
    var filters: js.UndefOr[js.Array[ColumnFilterItem]] = js.native
    
    var fixed: js.UndefOr[FixedType] = js.native
    
    var key: js.UndefOr[typings.rcTable.interfaceMod.Key] = js.native
    
    var onCell: js.UndefOr[GetComponentProps[RecordType]] = js.native
    
    var onCellClick: js.UndefOr[
        js.Function2[/* record */ RecordType, /* e */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]
      ] = js.native
    
    var onFilter: js.UndefOr[
        js.Function2[/* value */ String | Double | Boolean, /* record */ RecordType, Boolean]
      ] = js.native
    
    var onFilterDropdownVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.native
    
    var onHeaderCell: js.UndefOr[
        GetComponentProps[
          /* import warning: importer.ImportType#apply Failed type conversion: rc-table.rc-table/lib/interface.ColumnsType<RecordType>[number] */ js.Any
        ]
      ] = js.native
    
    var render: js.UndefOr[
        js.Function3[
          /* value */ js.Any, 
          /* record */ RecordType, 
          /* index */ Double, 
          ReactNode | RenderedCell[RecordType]
        ]
      ] = js.native
    
    var responsive: js.UndefOr[js.Array[Breakpoint]] = js.native
    
    var rowSpan: js.UndefOr[Double] = js.native
    
    var shouldCellUpdate: js.UndefOr[js.Function2[/* record */ RecordType, /* prevRecord */ RecordType, Boolean]] = js.native
    
    var showSorterTooltip: js.UndefOr[Boolean] = js.native
    
    var sortDirections: js.UndefOr[js.Array[SortOrder]] = js.native
    
    var sortOrder: js.UndefOr[SortOrder] = js.native
    
    var sorter: js.UndefOr[Boolean | CompareFn[RecordType] | Compare[RecordType]] = js.native
    
    var title: js.UndefOr[ColumnTitle[RecordType]] = js.native
    
    var width: js.UndefOr[Double | String] = js.native
  }
  object ColumnGroupType {
    
    @scala.inline
    def apply[RecordType](children: ColumnsType[RecordType]): ColumnGroupType[RecordType] = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnGroupType[RecordType]]
    }
    
    @scala.inline
    implicit class ColumnGroupTypeMutableBuilder[Self <: ColumnGroupType[_], RecordType] (val x: Self with ColumnGroupType[RecordType]) extends AnyVal {
      
      @scala.inline
      def setAlign(value: AlignType): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setChildren(value: ColumnsType[RecordType]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenVarargs(value: (ColumnGroupType[RecordType] | ColumnType[RecordType])*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
      
      @scala.inline
      def setDefaultFilteredValue(value: js.Array[Key]): Self = StObject.set(x, "defaultFilteredValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultFilteredValueNull: Self = StObject.set(x, "defaultFilteredValue", null)
      
      @scala.inline
      def setDefaultFilteredValueUndefined: Self = StObject.set(x, "defaultFilteredValue", js.undefined)
      
      @scala.inline
      def setDefaultFilteredValueVarargs(value: Key*): Self = StObject.set(x, "defaultFilteredValue", js.Array(value :_*))
      
      @scala.inline
      def setDefaultSortOrder(value: SortOrder): Self = StObject.set(x, "defaultSortOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSortOrderNull: Self = StObject.set(x, "defaultSortOrder", null)
      
      @scala.inline
      def setDefaultSortOrderUndefined: Self = StObject.set(x, "defaultSortOrder", js.undefined)
      
      @scala.inline
      def setEllipsis(value: CellEllipsisType): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
      
      @scala.inline
      def setFilterDropdown(value: ReactNode | (js.Function1[/* props */ FilterDropdownProps, ReactNode])): Self = StObject.set(x, "filterDropdown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterDropdownFunction1(value: /* props */ FilterDropdownProps => ReactNode): Self = StObject.set(x, "filterDropdown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilterDropdownUndefined: Self = StObject.set(x, "filterDropdown", js.undefined)
      
      @scala.inline
      def setFilterDropdownVisible(value: Boolean): Self = StObject.set(x, "filterDropdownVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterDropdownVisibleUndefined: Self = StObject.set(x, "filterDropdownVisible", js.undefined)
      
      @scala.inline
      def setFilterIcon(value: ReactNode | (js.Function1[/* filtered */ Boolean, ReactNode])): Self = StObject.set(x, "filterIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterIconFunction1(value: /* filtered */ Boolean => ReactNode): Self = StObject.set(x, "filterIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilterIconUndefined: Self = StObject.set(x, "filterIcon", js.undefined)
      
      @scala.inline
      def setFilterMultiple(value: Boolean): Self = StObject.set(x, "filterMultiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterMultipleUndefined: Self = StObject.set(x, "filterMultiple", js.undefined)
      
      @scala.inline
      def setFiltered(value: Boolean): Self = StObject.set(x, "filtered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilteredUndefined: Self = StObject.set(x, "filtered", js.undefined)
      
      @scala.inline
      def setFilteredValue(value: js.Array[Key]): Self = StObject.set(x, "filteredValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilteredValueNull: Self = StObject.set(x, "filteredValue", null)
      
      @scala.inline
      def setFilteredValueUndefined: Self = StObject.set(x, "filteredValue", js.undefined)
      
      @scala.inline
      def setFilteredValueVarargs(value: Key*): Self = StObject.set(x, "filteredValue", js.Array(value :_*))
      
      @scala.inline
      def setFilters(value: js.Array[ColumnFilterItem]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: ColumnFilterItem*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setFixed(value: FixedType): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      @scala.inline
      def setKey(value: typings.rcTable.interfaceMod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setOnCell(value: (RecordType, /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement]): Self = StObject.set(x, "onCell", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnCellClick(value: (/* record */ RecordType, /* e */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onCellClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnCellClickUndefined: Self = StObject.set(x, "onCellClick", js.undefined)
      
      @scala.inline
      def setOnCellUndefined: Self = StObject.set(x, "onCell", js.undefined)
      
      @scala.inline
      def setOnFilter(value: (/* value */ String | Double | Boolean, /* record */ RecordType) => Boolean): Self = StObject.set(x, "onFilter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnFilterDropdownVisibleChange(value: /* visible */ Boolean => Unit): Self = StObject.set(x, "onFilterDropdownVisibleChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFilterDropdownVisibleChangeUndefined: Self = StObject.set(x, "onFilterDropdownVisibleChange", js.undefined)
      
      @scala.inline
      def setOnFilterUndefined: Self = StObject.set(x, "onFilter", js.undefined)
      
      @scala.inline
      def setOnHeaderCell(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: rc-table.rc-table/lib/interface.ColumnsType<RecordType>[number] */ js.Any, /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement]
      ): Self = StObject.set(x, "onHeaderCell", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnHeaderCellUndefined: Self = StObject.set(x, "onHeaderCell", js.undefined)
      
      @scala.inline
      def setRender(
        value: (/* value */ js.Any, /* record */ RecordType, /* index */ Double) => ReactNode | RenderedCell[RecordType]
      ): Self = StObject.set(x, "render", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      @scala.inline
      def setResponsive(value: js.Array[Breakpoint]): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
      
      @scala.inline
      def setResponsiveVarargs(value: Breakpoint*): Self = StObject.set(x, "responsive", js.Array(value :_*))
      
      @scala.inline
      def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
      
      @scala.inline
      def setShouldCellUpdate(value: (/* record */ RecordType, /* prevRecord */ RecordType) => Boolean): Self = StObject.set(x, "shouldCellUpdate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setShouldCellUpdateUndefined: Self = StObject.set(x, "shouldCellUpdate", js.undefined)
      
      @scala.inline
      def setShowSorterTooltip(value: Boolean): Self = StObject.set(x, "showSorterTooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowSorterTooltipUndefined: Self = StObject.set(x, "showSorterTooltip", js.undefined)
      
      @scala.inline
      def setSortDirections(value: js.Array[SortOrder]): Self = StObject.set(x, "sortDirections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortDirectionsUndefined: Self = StObject.set(x, "sortDirections", js.undefined)
      
      @scala.inline
      def setSortDirectionsVarargs(value: SortOrder*): Self = StObject.set(x, "sortDirections", js.Array(value :_*))
      
      @scala.inline
      def setSortOrder(value: SortOrder): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortOrderNull: Self = StObject.set(x, "sortOrder", null)
      
      @scala.inline
      def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
      
      @scala.inline
      def setSorter(value: Boolean | CompareFn[RecordType] | Compare[RecordType]): Self = StObject.set(x, "sorter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSorterFunction3(value: (RecordType, RecordType, /* sortOrder */ js.UndefOr[SortOrder]) => Double): Self = StObject.set(x, "sorter", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSorterUndefined: Self = StObject.set(x, "sorter", js.undefined)
      
      @scala.inline
      def setTitle(value: ColumnTitle[RecordType]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFunction1(value: /* props */ ColumnTitleProps[RecordType] => ReactNode): Self = StObject.set(x, "title", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type ColumnTitle[RecordType] = ReactNode | (js.Function1[/* props */ ColumnTitleProps[RecordType], ReactNode])
  
  @js.native
  trait ColumnTitleProps[RecordType] extends StObject {
    
    var filters: js.UndefOr[Record[String, js.Array[String]]] = js.native
    
    /** @deprecated Please use `sorterColumns` instead. */
    var sortColumn: js.UndefOr[ColumnType[RecordType]] = js.native
    
    var sortColumns: js.UndefOr[js.Array[Column[RecordType]]] = js.native
    
    /** @deprecated Please use `sorterColumns` instead. */
    var sortOrder: js.UndefOr[SortOrder] = js.native
  }
  object ColumnTitleProps {
    
    @scala.inline
    def apply[RecordType](): ColumnTitleProps[RecordType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnTitleProps[RecordType]]
    }
    
    @scala.inline
    implicit class ColumnTitlePropsMutableBuilder[Self <: ColumnTitleProps[_], RecordType] (val x: Self with ColumnTitleProps[RecordType]) extends AnyVal {
      
      @scala.inline
      def setFilters(value: Record[String, js.Array[String]]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setSortColumn(value: ColumnType[RecordType]): Self = StObject.set(x, "sortColumn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortColumnUndefined: Self = StObject.set(x, "sortColumn", js.undefined)
      
      @scala.inline
      def setSortColumns(value: js.Array[Column[RecordType]]): Self = StObject.set(x, "sortColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortColumnsUndefined: Self = StObject.set(x, "sortColumns", js.undefined)
      
      @scala.inline
      def setSortColumnsVarargs(value: Column[RecordType]*): Self = StObject.set(x, "sortColumns", js.Array(value :_*))
      
      @scala.inline
      def setSortOrder(value: SortOrder): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortOrderNull: Self = StObject.set(x, "sortOrder", null)
      
      @scala.inline
      def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
    }
  }
  
  @js.native
  trait ColumnType[RecordType]
    extends typings.rcTable.interfaceMod.ColumnType[RecordType] {
    
    var defaultFilteredValue: js.UndefOr[js.Array[Key] | Null] = js.native
    
    var defaultSortOrder: js.UndefOr[SortOrder] = js.native
    
    var filterDropdown: js.UndefOr[ReactNode | (js.Function1[/* props */ FilterDropdownProps, ReactNode])] = js.native
    
    var filterDropdownVisible: js.UndefOr[Boolean] = js.native
    
    var filterIcon: js.UndefOr[ReactNode | (js.Function1[/* filtered */ Boolean, ReactNode])] = js.native
    
    var filterMultiple: js.UndefOr[Boolean] = js.native
    
    var filtered: js.UndefOr[Boolean] = js.native
    
    var filteredValue: js.UndefOr[js.Array[Key] | Null] = js.native
    
    var filters: js.UndefOr[js.Array[ColumnFilterItem]] = js.native
    
    var onFilter: js.UndefOr[
        js.Function2[/* value */ String | Double | Boolean, /* record */ RecordType, Boolean]
      ] = js.native
    
    var onFilterDropdownVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.native
    
    var responsive: js.UndefOr[js.Array[Breakpoint]] = js.native
    
    var showSorterTooltip: js.UndefOr[Boolean] = js.native
    
    var sortDirections: js.UndefOr[js.Array[SortOrder]] = js.native
    
    var sortOrder: js.UndefOr[SortOrder] = js.native
    
    var sorter: js.UndefOr[Boolean | CompareFn[RecordType] | Compare[RecordType]] = js.native
  }
  object ColumnType {
    
    @scala.inline
    def apply[RecordType](): ColumnType[RecordType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnType[RecordType]]
    }
    
    @scala.inline
    implicit class ColumnTypeMutableBuilder[Self <: ColumnType[_], RecordType] (val x: Self with ColumnType[RecordType]) extends AnyVal {
      
      @scala.inline
      def setDefaultFilteredValue(value: js.Array[Key]): Self = StObject.set(x, "defaultFilteredValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultFilteredValueNull: Self = StObject.set(x, "defaultFilteredValue", null)
      
      @scala.inline
      def setDefaultFilteredValueUndefined: Self = StObject.set(x, "defaultFilteredValue", js.undefined)
      
      @scala.inline
      def setDefaultFilteredValueVarargs(value: Key*): Self = StObject.set(x, "defaultFilteredValue", js.Array(value :_*))
      
      @scala.inline
      def setDefaultSortOrder(value: SortOrder): Self = StObject.set(x, "defaultSortOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSortOrderNull: Self = StObject.set(x, "defaultSortOrder", null)
      
      @scala.inline
      def setDefaultSortOrderUndefined: Self = StObject.set(x, "defaultSortOrder", js.undefined)
      
      @scala.inline
      def setFilterDropdown(value: ReactNode | (js.Function1[/* props */ FilterDropdownProps, ReactNode])): Self = StObject.set(x, "filterDropdown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterDropdownFunction1(value: /* props */ FilterDropdownProps => ReactNode): Self = StObject.set(x, "filterDropdown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilterDropdownUndefined: Self = StObject.set(x, "filterDropdown", js.undefined)
      
      @scala.inline
      def setFilterDropdownVisible(value: Boolean): Self = StObject.set(x, "filterDropdownVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterDropdownVisibleUndefined: Self = StObject.set(x, "filterDropdownVisible", js.undefined)
      
      @scala.inline
      def setFilterIcon(value: ReactNode | (js.Function1[/* filtered */ Boolean, ReactNode])): Self = StObject.set(x, "filterIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterIconFunction1(value: /* filtered */ Boolean => ReactNode): Self = StObject.set(x, "filterIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilterIconUndefined: Self = StObject.set(x, "filterIcon", js.undefined)
      
      @scala.inline
      def setFilterMultiple(value: Boolean): Self = StObject.set(x, "filterMultiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterMultipleUndefined: Self = StObject.set(x, "filterMultiple", js.undefined)
      
      @scala.inline
      def setFiltered(value: Boolean): Self = StObject.set(x, "filtered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilteredUndefined: Self = StObject.set(x, "filtered", js.undefined)
      
      @scala.inline
      def setFilteredValue(value: js.Array[Key]): Self = StObject.set(x, "filteredValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilteredValueNull: Self = StObject.set(x, "filteredValue", null)
      
      @scala.inline
      def setFilteredValueUndefined: Self = StObject.set(x, "filteredValue", js.undefined)
      
      @scala.inline
      def setFilteredValueVarargs(value: Key*): Self = StObject.set(x, "filteredValue", js.Array(value :_*))
      
      @scala.inline
      def setFilters(value: js.Array[ColumnFilterItem]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: ColumnFilterItem*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setOnFilter(value: (/* value */ String | Double | Boolean, /* record */ RecordType) => Boolean): Self = StObject.set(x, "onFilter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnFilterDropdownVisibleChange(value: /* visible */ Boolean => Unit): Self = StObject.set(x, "onFilterDropdownVisibleChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFilterDropdownVisibleChangeUndefined: Self = StObject.set(x, "onFilterDropdownVisibleChange", js.undefined)
      
      @scala.inline
      def setOnFilterUndefined: Self = StObject.set(x, "onFilter", js.undefined)
      
      @scala.inline
      def setResponsive(value: js.Array[Breakpoint]): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
      
      @scala.inline
      def setResponsiveVarargs(value: Breakpoint*): Self = StObject.set(x, "responsive", js.Array(value :_*))
      
      @scala.inline
      def setShowSorterTooltip(value: Boolean): Self = StObject.set(x, "showSorterTooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowSorterTooltipUndefined: Self = StObject.set(x, "showSorterTooltip", js.undefined)
      
      @scala.inline
      def setSortDirections(value: js.Array[SortOrder]): Self = StObject.set(x, "sortDirections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortDirectionsUndefined: Self = StObject.set(x, "sortDirections", js.undefined)
      
      @scala.inline
      def setSortDirectionsVarargs(value: SortOrder*): Self = StObject.set(x, "sortDirections", js.Array(value :_*))
      
      @scala.inline
      def setSortOrder(value: SortOrder): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortOrderNull: Self = StObject.set(x, "sortOrder", null)
      
      @scala.inline
      def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
      
      @scala.inline
      def setSorter(value: Boolean | CompareFn[RecordType] | Compare[RecordType]): Self = StObject.set(x, "sorter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSorterFunction3(value: (RecordType, RecordType, /* sortOrder */ js.UndefOr[SortOrder]) => Double): Self = StObject.set(x, "sorter", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSorterUndefined: Self = StObject.set(x, "sorter", js.undefined)
    }
  }
  
  type ColumnsType[RecordType] = js.Array[ColumnGroupType[RecordType] | ColumnType[RecordType]]
  
  type CompareFn[T] = js.Function3[/* a */ T, /* b */ T, /* sortOrder */ js.UndefOr[SortOrder], Double]
  
  /* Rewritten from type alias, can be one of: 
    - scala.Null
    - typings.antd.antdStrings.row
    - typings.antd.antdStrings.nest
  */
  type ExpandType = _ExpandType | Null
  
  @js.native
  trait FilterDropdownProps extends StObject {
    
    var clearFilters: js.UndefOr[js.Function0[Unit]] = js.native
    
    def confirm(): Unit = js.native
    
    var filters: js.UndefOr[js.Array[ColumnFilterItem]] = js.native
    
    var prefixCls: String = js.native
    
    var selectedKeys: js.Array[typings.react.mod.Key] = js.native
    
    def setSelectedKeys(selectedKeys: js.Array[typings.react.mod.Key]): Unit = js.native
    
    var visible: Boolean = js.native
  }
  object FilterDropdownProps {
    
    @scala.inline
    def apply(
      confirm: () => Unit,
      prefixCls: String,
      selectedKeys: js.Array[typings.react.mod.Key],
      setSelectedKeys: js.Array[typings.react.mod.Key] => Unit,
      visible: Boolean
    ): FilterDropdownProps = {
      val __obj = js.Dynamic.literal(confirm = js.Any.fromFunction0(confirm), prefixCls = prefixCls.asInstanceOf[js.Any], selectedKeys = selectedKeys.asInstanceOf[js.Any], setSelectedKeys = js.Any.fromFunction1(setSelectedKeys), visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilterDropdownProps]
    }
    
    @scala.inline
    implicit class FilterDropdownPropsMutableBuilder[Self <: FilterDropdownProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClearFilters(value: () => Unit): Self = StObject.set(x, "clearFilters", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClearFiltersUndefined: Self = StObject.set(x, "clearFilters", js.undefined)
      
      @scala.inline
      def setConfirm(value: () => Unit): Self = StObject.set(x, "confirm", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFilters(value: js.Array[ColumnFilterItem]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: ColumnFilterItem*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedKeys(value: js.Array[typings.react.mod.Key]): Self = StObject.set(x, "selectedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedKeysVarargs(value: typings.react.mod.Key*): Self = StObject.set(x, "selectedKeys", js.Array(value :_*))
      
      @scala.inline
      def setSetSelectedKeys(value: js.Array[typings.react.mod.Key] => Unit): Self = StObject.set(x, "setSelectedKeys", js.Any.fromFunction1(value))
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
  
  type GetPopupContainer = js.Function1[/* triggerNode */ HTMLElement, HTMLElement]
  
  type Key = typings.react.mod.Key
  
  /* Rewritten from type alias, can be one of: 
    - typings.antd.antdStrings.checkbox
    - typings.antd.antdStrings.radio
  */
  trait RowSelectionType extends StObject
  object RowSelectionType {
    
    @scala.inline
    def checkbox: typings.antd.antdStrings.checkbox = "checkbox".asInstanceOf[typings.antd.antdStrings.checkbox]
    
    @scala.inline
    def radio: typings.antd.antdStrings.radio = "radio".asInstanceOf[typings.antd.antdStrings.radio]
  }
  
  @js.native
  trait SelectionItem extends INTERNAL_SELECTION_ITEM {
    
    var key: String = js.native
    
    var onSelect: js.UndefOr[SelectionItemSelectFn] = js.native
    
    var text: ReactNode = js.native
  }
  object SelectionItem {
    
    @scala.inline
    def apply(key: String): SelectionItem = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectionItem]
    }
    
    @scala.inline
    implicit class SelectionItemMutableBuilder[Self <: SelectionItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnSelect(value: /* currentRowKeys */ js.Array[Key] => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setText(value: ReactNode): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  type SelectionItemSelectFn = js.Function1[/* currentRowKeys */ js.Array[Key], Unit]
  
  type SelectionSelectFn[T] = js.Function4[
    /* record */ T, 
    /* selected */ Boolean, 
    /* selectedRows */ js.Array[js.Object], 
    /* nativeEvent */ Event, 
    Unit
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typings.antd.antdStrings.descend
    - typings.antd.antdStrings.ascend
    - scala.Null
  */
  type SortOrder = _SortOrder | Null
  
  @js.native
  trait SorterResult[RecordType] extends StObject {
    
    var column: js.UndefOr[ColumnType[RecordType]] = js.native
    
    var columnKey: js.UndefOr[Key] = js.native
    
    var field: js.UndefOr[Key | js.Array[Key]] = js.native
    
    var order: js.UndefOr[SortOrder] = js.native
  }
  object SorterResult {
    
    @scala.inline
    def apply[RecordType](): SorterResult[RecordType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SorterResult[RecordType]]
    }
    
    @scala.inline
    implicit class SorterResultMutableBuilder[Self <: SorterResult[_], RecordType] (val x: Self with SorterResult[RecordType]) extends AnyVal {
      
      @scala.inline
      def setColumn(value: ColumnType[RecordType]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnKey(value: Key): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnKeyUndefined: Self = StObject.set(x, "columnKey", js.undefined)
      
      @scala.inline
      def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      @scala.inline
      def setField(value: Key | js.Array[Key]): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      @scala.inline
      def setFieldVarargs(value: Key*): Self = StObject.set(x, "field", js.Array(value :_*))
      
      @scala.inline
      def setOrder(value: SortOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderNull: Self = StObject.set(x, "order", null)
      
      @scala.inline
      def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.antd.antdStrings.paginate
    - typings.antd.antdStrings.sort
    - typings.antd.antdStrings.filter
  */
  trait TableAction extends StObject
  
  @js.native
  trait TableCurrentDataSource[RecordType] extends StObject {
    
    var action: TableAction = js.native
    
    var currentDataSource: js.Array[RecordType] = js.native
  }
  object TableCurrentDataSource {
    
    @scala.inline
    def apply[RecordType](action: TableAction, currentDataSource: js.Array[RecordType]): TableCurrentDataSource[RecordType] = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], currentDataSource = currentDataSource.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableCurrentDataSource[RecordType]]
    }
    
    @scala.inline
    implicit class TableCurrentDataSourceMutableBuilder[Self <: TableCurrentDataSource[_], RecordType] (val x: Self with TableCurrentDataSource[RecordType]) extends AnyVal {
      
      @scala.inline
      def setAction(value: TableAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentDataSource(value: js.Array[RecordType]): Self = StObject.set(x, "currentDataSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentDataSourceVarargs(value: RecordType*): Self = StObject.set(x, "currentDataSource", js.Array(value :_*))
    }
  }
  
  @js.native
  trait TableLocale extends StObject {
    
    var cancelSort: js.UndefOr[String] = js.native
    
    var collapse: js.UndefOr[String] = js.native
    
    var emptyText: js.UndefOr[ReactNode | js.Function0[ReactNode]] = js.native
    
    var expand: js.UndefOr[String] = js.native
    
    var filterConfirm: js.UndefOr[ReactNode] = js.native
    
    var filterEmptyText: js.UndefOr[ReactNode] = js.native
    
    var filterReset: js.UndefOr[ReactNode] = js.native
    
    var filterTitle: js.UndefOr[String] = js.native
    
    var selectAll: js.UndefOr[ReactNode] = js.native
    
    var selectInvert: js.UndefOr[ReactNode] = js.native
    
    var selectionAll: js.UndefOr[ReactNode] = js.native
    
    var sortTitle: js.UndefOr[String] = js.native
    
    var triggerAsc: js.UndefOr[String] = js.native
    
    var triggerDesc: js.UndefOr[String] = js.native
  }
  object TableLocale {
    
    @scala.inline
    def apply(): TableLocale = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableLocale]
    }
    
    @scala.inline
    implicit class TableLocaleMutableBuilder[Self <: TableLocale] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancelSort(value: String): Self = StObject.set(x, "cancelSort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelSortUndefined: Self = StObject.set(x, "cancelSort", js.undefined)
      
      @scala.inline
      def setCollapse(value: String): Self = StObject.set(x, "collapse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
      
      @scala.inline
      def setEmptyText(value: ReactNode | js.Function0[ReactNode]): Self = StObject.set(x, "emptyText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyTextFunction0(value: () => ReactNode): Self = StObject.set(x, "emptyText", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEmptyTextUndefined: Self = StObject.set(x, "emptyText", js.undefined)
      
      @scala.inline
      def setExpand(value: String): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
      
      @scala.inline
      def setFilterConfirm(value: ReactNode): Self = StObject.set(x, "filterConfirm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterConfirmUndefined: Self = StObject.set(x, "filterConfirm", js.undefined)
      
      @scala.inline
      def setFilterEmptyText(value: ReactNode): Self = StObject.set(x, "filterEmptyText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterEmptyTextUndefined: Self = StObject.set(x, "filterEmptyText", js.undefined)
      
      @scala.inline
      def setFilterReset(value: ReactNode): Self = StObject.set(x, "filterReset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterResetUndefined: Self = StObject.set(x, "filterReset", js.undefined)
      
      @scala.inline
      def setFilterTitle(value: String): Self = StObject.set(x, "filterTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterTitleUndefined: Self = StObject.set(x, "filterTitle", js.undefined)
      
      @scala.inline
      def setSelectAll(value: ReactNode): Self = StObject.set(x, "selectAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectAllUndefined: Self = StObject.set(x, "selectAll", js.undefined)
      
      @scala.inline
      def setSelectInvert(value: ReactNode): Self = StObject.set(x, "selectInvert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectInvertUndefined: Self = StObject.set(x, "selectInvert", js.undefined)
      
      @scala.inline
      def setSelectionAll(value: ReactNode): Self = StObject.set(x, "selectionAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionAllUndefined: Self = StObject.set(x, "selectionAll", js.undefined)
      
      @scala.inline
      def setSortTitle(value: String): Self = StObject.set(x, "sortTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortTitleUndefined: Self = StObject.set(x, "sortTitle", js.undefined)
      
      @scala.inline
      def setTriggerAsc(value: String): Self = StObject.set(x, "triggerAsc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerAscUndefined: Self = StObject.set(x, "triggerAsc", js.undefined)
      
      @scala.inline
      def setTriggerDesc(value: String): Self = StObject.set(x, "triggerDesc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerDescUndefined: Self = StObject.set(x, "triggerDesc", js.undefined)
    }
  }
  
  @js.native
  trait TablePaginationConfig extends PaginationProps {
    
    var position: js.UndefOr[js.Array[TablePaginationPosition]] = js.native
  }
  object TablePaginationConfig {
    
    @scala.inline
    def apply(): TablePaginationConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TablePaginationConfig]
    }
    
    @scala.inline
    implicit class TablePaginationConfigMutableBuilder[Self <: TablePaginationConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPosition(value: js.Array[TablePaginationPosition]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setPositionVarargs(value: TablePaginationPosition*): Self = StObject.set(x, "position", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.antd.antdStrings.topLeft
    - typings.antd.antdStrings.topCenter
    - typings.antd.antdStrings.topRight
    - typings.antd.antdStrings.bottomLeft
    - typings.antd.antdStrings.bottomCenter
    - typings.antd.antdStrings.bottomRight
  */
  trait TablePaginationPosition extends StObject
  object TablePaginationPosition {
    
    @scala.inline
    def bottomCenter: typings.antd.antdStrings.bottomCenter = "bottomCenter".asInstanceOf[typings.antd.antdStrings.bottomCenter]
    
    @scala.inline
    def bottomLeft: typings.antd.antdStrings.bottomLeft = "bottomLeft".asInstanceOf[typings.antd.antdStrings.bottomLeft]
    
    @scala.inline
    def bottomRight: typings.antd.antdStrings.bottomRight = "bottomRight".asInstanceOf[typings.antd.antdStrings.bottomRight]
    
    @scala.inline
    def topCenter: typings.antd.antdStrings.topCenter = "topCenter".asInstanceOf[typings.antd.antdStrings.topCenter]
    
    @scala.inline
    def topLeft: typings.antd.antdStrings.topLeft = "topLeft".asInstanceOf[typings.antd.antdStrings.topLeft]
    
    @scala.inline
    def topRight: typings.antd.antdStrings.topRight = "topRight".asInstanceOf[typings.antd.antdStrings.topRight]
  }
  
  @js.native
  trait TableRowSelection[T] extends StObject {
    
    var checkStrictly: js.UndefOr[Boolean] = js.native
    
    var columnTitle: js.UndefOr[String | ReactNode] = js.native
    
    var columnWidth: js.UndefOr[String | Double] = js.native
    
    var fixed: js.UndefOr[Boolean] = js.native
    
    var getCheckboxProps: js.UndefOr[js.Function1[/* record */ T, PartialOmitCheckboxPropsc]] = js.native
    
    var hideSelectAll: js.UndefOr[Boolean] = js.native
    
    var onChange: js.UndefOr[
        js.Function2[/* selectedRowKeys */ js.Array[Key], /* selectedRows */ js.Array[T], Unit]
      ] = js.native
    
    var onSelect: js.UndefOr[SelectionSelectFn[T]] = js.native
    
    /** @deprecated This function is meaningless and should use `onChange` instead */
    var onSelectAll: js.UndefOr[
        js.Function3[
          /* selected */ Boolean, 
          /* selectedRows */ js.Array[T], 
          /* changeRows */ js.Array[T], 
          Unit
        ]
      ] = js.native
    
    /** @deprecated This function is meaningless and should use `onChange` instead */
    var onSelectInvert: js.UndefOr[js.Function1[/* selectedRowKeys */ js.Array[Key], Unit]] = js.native
    
    var onSelectMultiple: js.UndefOr[
        js.Function3[
          /* selected */ Boolean, 
          /* selectedRows */ js.Array[T], 
          /* changeRows */ js.Array[T], 
          Unit
        ]
      ] = js.native
    
    /** Keep the selection keys in list even the key not exist in `dataSource` anymore */
    var preserveSelectedRowKeys: js.UndefOr[Boolean] = js.native
    
    var renderCell: js.UndefOr[
        js.Function4[
          /* value */ Boolean, 
          /* record */ T, 
          /* index */ Double, 
          /* originNode */ ReactNode, 
          ReactNode | RenderedCell[T]
        ]
      ] = js.native
    
    var selectedRowKeys: js.UndefOr[js.Array[Key]] = js.native
    
    var selections: js.UndefOr[js.Array[INTERNAL_SELECTION_ITEM] | Boolean] = js.native
    
    var `type`: js.UndefOr[RowSelectionType] = js.native
  }
  object TableRowSelection {
    
    @scala.inline
    def apply[T](): TableRowSelection[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableRowSelection[T]]
    }
    
    @scala.inline
    implicit class TableRowSelectionMutableBuilder[Self <: TableRowSelection[_], T] (val x: Self with TableRowSelection[T]) extends AnyVal {
      
      @scala.inline
      def setCheckStrictly(value: Boolean): Self = StObject.set(x, "checkStrictly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckStrictlyUndefined: Self = StObject.set(x, "checkStrictly", js.undefined)
      
      @scala.inline
      def setColumnTitle(value: String | ReactNode): Self = StObject.set(x, "columnTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnTitleUndefined: Self = StObject.set(x, "columnTitle", js.undefined)
      
      @scala.inline
      def setColumnWidth(value: String | Double): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
      
      @scala.inline
      def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      @scala.inline
      def setGetCheckboxProps(value: /* record */ T => PartialOmitCheckboxPropsc): Self = StObject.set(x, "getCheckboxProps", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetCheckboxPropsUndefined: Self = StObject.set(x, "getCheckboxProps", js.undefined)
      
      @scala.inline
      def setHideSelectAll(value: Boolean): Self = StObject.set(x, "hideSelectAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideSelectAllUndefined: Self = StObject.set(x, "hideSelectAll", js.undefined)
      
      @scala.inline
      def setOnChange(value: (/* selectedRowKeys */ js.Array[Key], /* selectedRows */ js.Array[T]) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnSelect(
        value: (T, /* selected */ Boolean, /* selectedRows */ js.Array[js.Object], /* nativeEvent */ Event) => Unit
      ): Self = StObject.set(x, "onSelect", js.Any.fromFunction4(value))
      
      @scala.inline
      def setOnSelectAll(
        value: (/* selected */ Boolean, /* selectedRows */ js.Array[T], /* changeRows */ js.Array[T]) => Unit
      ): Self = StObject.set(x, "onSelectAll", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnSelectAllUndefined: Self = StObject.set(x, "onSelectAll", js.undefined)
      
      @scala.inline
      def setOnSelectInvert(value: /* selectedRowKeys */ js.Array[Key] => Unit): Self = StObject.set(x, "onSelectInvert", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectInvertUndefined: Self = StObject.set(x, "onSelectInvert", js.undefined)
      
      @scala.inline
      def setOnSelectMultiple(
        value: (/* selected */ Boolean, /* selectedRows */ js.Array[T], /* changeRows */ js.Array[T]) => Unit
      ): Self = StObject.set(x, "onSelectMultiple", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnSelectMultipleUndefined: Self = StObject.set(x, "onSelectMultiple", js.undefined)
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setPreserveSelectedRowKeys(value: Boolean): Self = StObject.set(x, "preserveSelectedRowKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveSelectedRowKeysUndefined: Self = StObject.set(x, "preserveSelectedRowKeys", js.undefined)
      
      @scala.inline
      def setRenderCell(
        value: (/* value */ Boolean, /* record */ T, /* index */ Double, /* originNode */ ReactNode) => ReactNode | RenderedCell[T]
      ): Self = StObject.set(x, "renderCell", js.Any.fromFunction4(value))
      
      @scala.inline
      def setRenderCellUndefined: Self = StObject.set(x, "renderCell", js.undefined)
      
      @scala.inline
      def setSelectedRowKeys(value: js.Array[Key]): Self = StObject.set(x, "selectedRowKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedRowKeysUndefined: Self = StObject.set(x, "selectedRowKeys", js.undefined)
      
      @scala.inline
      def setSelectedRowKeysVarargs(value: Key*): Self = StObject.set(x, "selectedRowKeys", js.Array(value :_*))
      
      @scala.inline
      def setSelections(value: js.Array[INTERNAL_SELECTION_ITEM] | Boolean): Self = StObject.set(x, "selections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionsUndefined: Self = StObject.set(x, "selections", js.undefined)
      
      @scala.inline
      def setSelectionsVarargs(value: INTERNAL_SELECTION_ITEM*): Self = StObject.set(x, "selections", js.Array(value :_*))
      
      @scala.inline
      def setType(value: RowSelectionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type TransformColumns[RecordType] = js.Function1[/* columns */ ColumnsType[RecordType], ColumnsType[RecordType]]
  
  trait _ExpandType extends StObject
  
  trait _SortOrder extends StObject
}
