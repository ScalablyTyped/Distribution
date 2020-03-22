package typings.antd.tableInterfaceMod

import typings.antd.AnonCompare
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

trait ColumnType[RecordType]
  extends typings.rcTable.interfaceMod.ColumnType[RecordType] {
  var defaultFilteredValue: js.UndefOr[js.Array[Key] | Null] = js.undefined
  var defaultSortOrder: js.UndefOr[SortOrder] = js.undefined
  var filterDropdown: js.UndefOr[ReactNode | (js.Function1[/* props */ FilterDropdownProps, ReactNode])] = js.undefined
  var filterDropdownVisible: js.UndefOr[Boolean] = js.undefined
  var filterIcon: js.UndefOr[ReactNode | (js.Function1[/* filtered */ Boolean, ReactNode])] = js.undefined
  var filterMultiple: js.UndefOr[Boolean] = js.undefined
  var filteredValue: js.UndefOr[js.Array[Key] | Null] = js.undefined
  var filters: js.UndefOr[js.Array[ColumnFilterItem]] = js.undefined
  var onFilter: js.UndefOr[js.Function2[/* value */ js.Any, /* record */ RecordType, Boolean]] = js.undefined
  var onFilterDropdownVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
  var sortDirections: js.UndefOr[js.Array[SortOrder]] = js.undefined
  var sortOrder: js.UndefOr[SortOrder] = js.undefined
  var sorter: js.UndefOr[Boolean | CompareFn[RecordType] | AnonCompare[RecordType]] = js.undefined
}

object ColumnType {
  @scala.inline
  def apply[RecordType](
    align: AlignType = null,
    className: String = null,
    colSpan: Int | Double = null,
    dataIndex: DataIndex = null,
    defaultFilteredValue: js.Array[Key] = null,
    defaultSortOrder: SortOrder = null,
    ellipsis: js.UndefOr[Boolean] = js.undefined,
    filterDropdown: ReactNode | (js.Function1[/* props */ FilterDropdownProps, ReactNode]) = null,
    filterDropdownVisible: js.UndefOr[Boolean] = js.undefined,
    filterIcon: ReactNode | (js.Function1[/* filtered */ Boolean, ReactNode]) = null,
    filterMultiple: js.UndefOr[Boolean] = js.undefined,
    filteredValue: js.Array[Key] = null,
    filters: js.Array[ColumnFilterItem] = null,
    fixed: FixedType = null,
    key: typings.rcTable.interfaceMod.Key = null,
    onCell: (RecordType, /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement] = null,
    onCellClick: (RecordType, /* e */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit = null,
    onFilter: (/* value */ js.Any, /* record */ RecordType) => Boolean = null,
    onFilterDropdownVisibleChange: /* visible */ Boolean => Unit = null,
    onHeaderCell: (/* import warning: importer.ImportType#apply Failed type conversion: rc-table.rc-table/lib/interface.ColumnsType<RecordType>[number] */ js.Any, /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement] = null,
    render: (/* value */ js.Any, RecordType, /* index */ Double) => ReactNode | RenderedCell[RecordType] = null,
    rowSpan: Int | Double = null,
    sortDirections: js.Array[SortOrder] = null,
    sortOrder: SortOrder = null,
    sorter: Boolean | CompareFn[RecordType] | AnonCompare[RecordType] = null,
    title: ReactNode = null,
    width: Double | String = null
  ): ColumnType[RecordType] = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (colSpan != null) __obj.updateDynamic("colSpan")(colSpan.asInstanceOf[js.Any])
    if (dataIndex != null) __obj.updateDynamic("dataIndex")(dataIndex.asInstanceOf[js.Any])
    if (defaultFilteredValue != null) __obj.updateDynamic("defaultFilteredValue")(defaultFilteredValue.asInstanceOf[js.Any])
    if (defaultSortOrder != null) __obj.updateDynamic("defaultSortOrder")(defaultSortOrder.asInstanceOf[js.Any])
    if (!js.isUndefined(ellipsis)) __obj.updateDynamic("ellipsis")(ellipsis.asInstanceOf[js.Any])
    if (filterDropdown != null) __obj.updateDynamic("filterDropdown")(filterDropdown.asInstanceOf[js.Any])
    if (!js.isUndefined(filterDropdownVisible)) __obj.updateDynamic("filterDropdownVisible")(filterDropdownVisible.asInstanceOf[js.Any])
    if (filterIcon != null) __obj.updateDynamic("filterIcon")(filterIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(filterMultiple)) __obj.updateDynamic("filterMultiple")(filterMultiple.asInstanceOf[js.Any])
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
    if (rowSpan != null) __obj.updateDynamic("rowSpan")(rowSpan.asInstanceOf[js.Any])
    if (sortDirections != null) __obj.updateDynamic("sortDirections")(sortDirections.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    if (sorter != null) __obj.updateDynamic("sorter")(sorter.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnType[RecordType]]
  }
}

