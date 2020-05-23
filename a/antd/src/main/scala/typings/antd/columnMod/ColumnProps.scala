package typings.antd.columnMod

import typings.antd.anon.Compare
import typings.antd.responsiveObserveMod.Breakpoint
import typings.antd.tableInterfaceMod.ColumnFilterItem
import typings.antd.tableInterfaceMod.ColumnType
import typings.antd.tableInterfaceMod.CompareFn
import typings.antd.tableInterfaceMod.FilterDropdownProps
import typings.antd.tableInterfaceMod.Key
import typings.antd.tableInterfaceMod.SortOrder
import typings.rcTable.interfaceMod.AlignType
import typings.rcTable.interfaceMod.DataIndex
import typings.rcTable.interfaceMod.FixedType
import typings.rcTable.interfaceMod.RenderedCell
import typings.react.mod.HTMLAttributes
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnProps[RecordType] extends ColumnType[RecordType] {
  var children: js.UndefOr[Null] = js.undefined
}

object ColumnProps {
  @scala.inline
  def apply[RecordType](
    align: AlignType = null,
    className: String = null,
    colSpan: js.UndefOr[Double] = js.undefined,
    dataIndex: DataIndex = null,
    defaultFilteredValue: js.UndefOr[Null | js.Array[Key]] = js.undefined,
    defaultSortOrder: js.UndefOr[Null | SortOrder] = js.undefined,
    ellipsis: js.UndefOr[Boolean] = js.undefined,
    filterDropdown: ReactNode | (js.Function1[/* props */ FilterDropdownProps, ReactNode]) = null,
    filterDropdownVisible: js.UndefOr[Boolean] = js.undefined,
    filterIcon: ReactNode | (js.Function1[/* filtered */ Boolean, ReactNode]) = null,
    filterMultiple: js.UndefOr[Boolean] = js.undefined,
    filtered: js.UndefOr[Boolean] = js.undefined,
    filteredValue: js.UndefOr[Null | js.Array[Key]] = js.undefined,
    filters: js.Array[ColumnFilterItem] = null,
    fixed: FixedType = null,
    key: typings.rcTable.interfaceMod.Key = null,
    onCell: (RecordType, /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement] = null,
    onCellClick: (RecordType, /* e */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit = null,
    onFilter: (/* value */ String | Double | Boolean, RecordType) => Boolean = null,
    onFilterDropdownVisibleChange: /* visible */ Boolean => Unit = null,
    onHeaderCell: (/* import warning: importer.ImportType#apply Failed type conversion: rc-table.rc-table/lib/interface.ColumnsType<RecordType>[number] */ js.Any, /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement] = null,
    render: (/* value */ js.Any, RecordType, /* index */ Double) => ReactNode | RenderedCell[RecordType] = null,
    responsive: js.Array[Breakpoint] = null,
    rowSpan: js.UndefOr[Double] = js.undefined,
    showSorterTooltip: js.UndefOr[Boolean] = js.undefined,
    sortDirections: js.Array[SortOrder] = null,
    sortOrder: js.UndefOr[Null | SortOrder] = js.undefined,
    sorter: Boolean | CompareFn[RecordType] | Compare[RecordType] = null,
    title: ReactNode = null,
    width: Double | String = null
  ): ColumnProps[RecordType] = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(colSpan)) __obj.updateDynamic("colSpan")(colSpan.get.asInstanceOf[js.Any])
    if (dataIndex != null) __obj.updateDynamic("dataIndex")(dataIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultFilteredValue)) __obj.updateDynamic("defaultFilteredValue")(defaultFilteredValue.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultSortOrder)) __obj.updateDynamic("defaultSortOrder")(defaultSortOrder.asInstanceOf[js.Any])
    if (!js.isUndefined(ellipsis)) __obj.updateDynamic("ellipsis")(ellipsis.get.asInstanceOf[js.Any])
    if (filterDropdown != null) __obj.updateDynamic("filterDropdown")(filterDropdown.asInstanceOf[js.Any])
    if (!js.isUndefined(filterDropdownVisible)) __obj.updateDynamic("filterDropdownVisible")(filterDropdownVisible.get.asInstanceOf[js.Any])
    if (filterIcon != null) __obj.updateDynamic("filterIcon")(filterIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(filterMultiple)) __obj.updateDynamic("filterMultiple")(filterMultiple.get.asInstanceOf[js.Any])
    if (!js.isUndefined(filtered)) __obj.updateDynamic("filtered")(filtered.get.asInstanceOf[js.Any])
    if (!js.isUndefined(filteredValue)) __obj.updateDynamic("filteredValue")(filteredValue.asInstanceOf[js.Any])
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
    if (!js.isUndefined(showSorterTooltip)) __obj.updateDynamic("showSorterTooltip")(showSorterTooltip.get.asInstanceOf[js.Any])
    if (sortDirections != null) __obj.updateDynamic("sortDirections")(sortDirections.asInstanceOf[js.Any])
    if (!js.isUndefined(sortOrder)) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    if (sorter != null) __obj.updateDynamic("sorter")(sorter.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnProps[RecordType]]
  }
}

