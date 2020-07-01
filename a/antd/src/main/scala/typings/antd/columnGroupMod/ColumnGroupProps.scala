package typings.antd.columnGroupMod

import typings.antd.anon.Compare
import typings.antd.responsiveObserveMod.Breakpoint
import typings.antd.tableInterfaceMod.ColumnFilterItem
import typings.antd.tableInterfaceMod.ColumnTitle
import typings.antd.tableInterfaceMod.CompareFn
import typings.antd.tableInterfaceMod.FilterDropdownProps
import typings.antd.tableInterfaceMod.Key
import typings.antd.tableInterfaceMod.SortOrder
import typings.rcTable.interfaceMod.AlignType
import typings.rcTable.interfaceMod.CellEllipsisType
import typings.rcTable.interfaceMod.DataIndex
import typings.rcTable.interfaceMod.FixedType
import typings.rcTable.interfaceMod.GetComponentProps
import typings.rcTable.interfaceMod.RenderedCell
import typings.react.mod.HTMLAttributes
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Omit<antd.antd/lib/table/interface.ColumnType<RecordType>, 'children'> */
trait ColumnGroupProps[RecordType] extends js.Object {
  var align: js.UndefOr[AlignType] = js.undefined
  var children: ReactElement | js.Array[ReactElement]
  var className: js.UndefOr[String] = js.undefined
  var colSpan: js.UndefOr[Double] = js.undefined
  var dataIndex: js.UndefOr[DataIndex] = js.undefined
  var defaultFilteredValue: js.UndefOr[js.Array[Key]] = js.undefined
  var defaultSortOrder: js.UndefOr[SortOrder] = js.undefined
  var ellipsis: js.UndefOr[CellEllipsisType] = js.undefined
  var filterDropdown: js.UndefOr[ReactNode | (js.Function1[/* props */ FilterDropdownProps, ReactNode])] = js.undefined
  var filterDropdownVisible: js.UndefOr[Boolean] = js.undefined
  var filterIcon: js.UndefOr[ReactNode | (js.Function1[/* filtered */ Boolean, ReactNode])] = js.undefined
  var filterMultiple: js.UndefOr[Boolean] = js.undefined
  var filtered: js.UndefOr[Boolean] = js.undefined
  var filteredValue: js.UndefOr[js.Array[Key]] = js.undefined
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
  var onFilterDropdownVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
  var onHeaderCell: js.UndefOr[
    GetComponentProps[
      /* import warning: importer.ImportType#apply Failed type conversion: rc-table.rc-table/lib/interface.ColumnsType<RecordType>[number] */ js.Any
    ]
  ] = js.undefined
  var render: js.UndefOr[
    js.Function3[
      /* value */ js.Any, 
      /* record */ RecordType, 
      /* index */ Double, 
      ReactNode | RenderedCell[RecordType]
    ]
  ] = js.undefined
  var responsive: js.UndefOr[js.Array[Breakpoint]] = js.undefined
  var rowSpan: js.UndefOr[Double] = js.undefined
  var shouldCellUpdate: js.UndefOr[js.Function2[/* record */ RecordType, /* prevRecord */ RecordType, Boolean]] = js.undefined
  var showSorterTooltip: js.UndefOr[Boolean] = js.undefined
  var sortDirections: js.UndefOr[js.Array[SortOrder]] = js.undefined
  var sortOrder: js.UndefOr[SortOrder] = js.undefined
  var sorter: js.UndefOr[Boolean | CompareFn[RecordType] | Compare[RecordType]] = js.undefined
  var title: js.UndefOr[ColumnTitle[RecordType]] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
}

object ColumnGroupProps {
  @scala.inline
  def apply[RecordType](
    children: ReactElement | js.Array[ReactElement],
    align: AlignType = null,
    className: String = null,
    colSpan: js.UndefOr[Double] = js.undefined,
    dataIndex: DataIndex = null,
    defaultFilteredValue: js.Array[Key] = null,
    defaultSortOrder: js.UndefOr[Null | SortOrder] = js.undefined,
    ellipsis: CellEllipsisType = null,
    filterDropdown: ReactNode | (js.Function1[/* props */ FilterDropdownProps, ReactNode]) = null,
    filterDropdownVisible: js.UndefOr[Boolean] = js.undefined,
    filterIcon: ReactNode | (js.Function1[/* filtered */ Boolean, ReactNode]) = null,
    filterMultiple: js.UndefOr[Boolean] = js.undefined,
    filtered: js.UndefOr[Boolean] = js.undefined,
    filteredValue: js.Array[Key] = null,
    filters: js.Array[ColumnFilterItem] = null,
    fixed: FixedType = null,
    key: typings.rcTable.interfaceMod.Key = null,
    onCell: (RecordType, /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement] = null,
    onCellClick: (/* record */ RecordType, /* e */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit = null,
    onFilter: (/* value */ String | Double | Boolean, /* record */ RecordType) => Boolean = null,
    onFilterDropdownVisibleChange: /* visible */ Boolean => Unit = null,
    onHeaderCell: (/* import warning: importer.ImportType#apply Failed type conversion: rc-table.rc-table/lib/interface.ColumnsType<RecordType>[number] */ js.Any, /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement] = null,
    render: (/* value */ js.Any, /* record */ RecordType, /* index */ Double) => ReactNode | RenderedCell[RecordType] = null,
    responsive: js.Array[Breakpoint] = null,
    rowSpan: js.UndefOr[Double] = js.undefined,
    shouldCellUpdate: (/* record */ RecordType, /* prevRecord */ RecordType) => Boolean = null,
    showSorterTooltip: js.UndefOr[Boolean] = js.undefined,
    sortDirections: js.Array[SortOrder] = null,
    sortOrder: js.UndefOr[Null | SortOrder] = js.undefined,
    sorter: Boolean | CompareFn[RecordType] | Compare[RecordType] = null,
    title: ColumnTitle[RecordType] = null,
    width: Double | String = null
  ): ColumnGroupProps[RecordType] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(colSpan)) __obj.updateDynamic("colSpan")(colSpan.get.asInstanceOf[js.Any])
    if (dataIndex != null) __obj.updateDynamic("dataIndex")(dataIndex.asInstanceOf[js.Any])
    if (defaultFilteredValue != null) __obj.updateDynamic("defaultFilteredValue")(defaultFilteredValue.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultSortOrder)) __obj.updateDynamic("defaultSortOrder")(defaultSortOrder.asInstanceOf[js.Any])
    if (ellipsis != null) __obj.updateDynamic("ellipsis")(ellipsis.asInstanceOf[js.Any])
    if (filterDropdown != null) __obj.updateDynamic("filterDropdown")(filterDropdown.asInstanceOf[js.Any])
    if (!js.isUndefined(filterDropdownVisible)) __obj.updateDynamic("filterDropdownVisible")(filterDropdownVisible.get.asInstanceOf[js.Any])
    if (filterIcon != null) __obj.updateDynamic("filterIcon")(filterIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(filterMultiple)) __obj.updateDynamic("filterMultiple")(filterMultiple.get.asInstanceOf[js.Any])
    if (!js.isUndefined(filtered)) __obj.updateDynamic("filtered")(filtered.get.asInstanceOf[js.Any])
    if (filteredValue != null) __obj.updateDynamic("filteredValue")(filteredValue.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (fixed != null) __obj.updateDynamic("fixed")(fixed.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onCell != null) __obj.updateDynamic("onCell")(js.Any.fromFunction2(onCell))
    if (onCellClick != null) __obj.updateDynamic("onCellClick")(js.Any.fromFunction2(onCellClick))
    if (onFilter != null) __obj.updateDynamic("onFilter")(js.Any.fromFunction2(onFilter))
    if (onFilterDropdownVisibleChange != null) __obj.updateDynamic("onFilterDropdownVisibleChange")(js.Any.fromFunction1(onFilterDropdownVisibleChange))
    if (onHeaderCell != null) __obj.updateDynamic("onHeaderCell")(js.Any.fromFunction2(onHeaderCell))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction3(render))
    if (responsive != null) __obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
    if (!js.isUndefined(rowSpan)) __obj.updateDynamic("rowSpan")(rowSpan.get.asInstanceOf[js.Any])
    if (shouldCellUpdate != null) __obj.updateDynamic("shouldCellUpdate")(js.Any.fromFunction2(shouldCellUpdate))
    if (!js.isUndefined(showSorterTooltip)) __obj.updateDynamic("showSorterTooltip")(showSorterTooltip.get.asInstanceOf[js.Any])
    if (sortDirections != null) __obj.updateDynamic("sortDirections")(sortDirections.asInstanceOf[js.Any])
    if (!js.isUndefined(sortOrder)) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    if (sorter != null) __obj.updateDynamic("sorter")(sorter.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnGroupProps[RecordType]]
  }
}

