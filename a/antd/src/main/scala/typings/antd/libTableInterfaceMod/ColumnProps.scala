package typings.antd.libTableInterfaceMod

import typings.antd.Anon_FiltersSortOrder
import typings.antd.antdStrings.center
import typings.antd.antdStrings.left
import typings.antd.antdStrings.right
import typings.react.reactMod.Key
import typings.react.reactMod.ReactNode
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnProps[T] extends js.Object {
  var align: js.UndefOr[left | right | center] = js.undefined
  var children: js.UndefOr[js.Array[ColumnProps[T]]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var colSpan: js.UndefOr[Double] = js.undefined
  var dataIndex: js.UndefOr[String] = js.undefined
  var defaultSortOrder: js.UndefOr[SortOrder] = js.undefined
  var filterDropdown: js.UndefOr[ReactNode | (js.Function1[/* props */ FilterDropdownProps, ReactNode])] = js.undefined
  var filterDropdownVisible: js.UndefOr[Boolean] = js.undefined
  var filterIcon: js.UndefOr[ReactNode | (js.Function1[/* filtered */ Boolean, ReactNode])] = js.undefined
  var filterMultiple: js.UndefOr[Boolean] = js.undefined
  var filteredValue: js.UndefOr[js.Array[_]] = js.undefined
  var filters: js.UndefOr[js.Array[ColumnFilterItem]] = js.undefined
  var fixed: js.UndefOr[Boolean | left | right] = js.undefined
  var key: js.UndefOr[Key] = js.undefined
  var onCell: js.UndefOr[js.Function2[/* record */ T, /* rowIndex */ Double, TableEventListeners]] = js.undefined
  var onCellClick: js.UndefOr[js.Function2[/* record */ T, /* event */ Event, Unit]] = js.undefined
  var onFilter: js.UndefOr[js.Function2[/* value */ js.Any, /* record */ T, Boolean]] = js.undefined
  var onFilterDropdownVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
  var onHeaderCell: js.UndefOr[js.Function1[/* props */ ColumnProps[T], TableEventListeners]] = js.undefined
  var render: js.UndefOr[js.Function3[/* text */ js.Any, /* record */ T, /* index */ Double, ReactNode]] = js.undefined
  var sortDirections: js.UndefOr[js.Array[SortOrder]] = js.undefined
  var sortOrder: js.UndefOr[SortOrder | Boolean] = js.undefined
  var sorter: js.UndefOr[Boolean | CompareFn[T]] = js.undefined
  var title: js.UndefOr[ReactNode | (js.Function1[/* options */ Anon_FiltersSortOrder, ReactNode])] = js.undefined
  var width: js.UndefOr[String | Double] = js.undefined
}

object ColumnProps {
  @scala.inline
  def apply[T](
    align: left | right | center = null,
    children: js.Array[ColumnProps[T]] = null,
    className: String = null,
    colSpan: Int | Double = null,
    dataIndex: String = null,
    defaultSortOrder: SortOrder = null,
    filterDropdown: ReactNode | (js.Function1[/* props */ FilterDropdownProps, ReactNode]) = null,
    filterDropdownVisible: js.UndefOr[Boolean] = js.undefined,
    filterIcon: ReactNode | (js.Function1[/* filtered */ Boolean, ReactNode]) = null,
    filterMultiple: js.UndefOr[Boolean] = js.undefined,
    filteredValue: js.Array[_] = null,
    filters: js.Array[ColumnFilterItem] = null,
    fixed: Boolean | left | right = null,
    key: Key = null,
    onCell: (/* record */ T, /* rowIndex */ Double) => TableEventListeners = null,
    onCellClick: (/* record */ T, /* event */ Event) => Unit = null,
    onFilter: (/* value */ js.Any, /* record */ T) => Boolean = null,
    onFilterDropdownVisibleChange: /* visible */ Boolean => Unit = null,
    onHeaderCell: /* props */ ColumnProps[T] => TableEventListeners = null,
    render: (/* text */ js.Any, /* record */ T, /* index */ Double) => ReactNode = null,
    sortDirections: js.Array[SortOrder] = null,
    sortOrder: SortOrder | Boolean = null,
    sorter: Boolean | CompareFn[T] = null,
    title: ReactNode | (js.Function1[/* options */ Anon_FiltersSortOrder, ReactNode]) = null,
    width: String | Double = null
  ): ColumnProps[T] = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children)
    if (className != null) __obj.updateDynamic("className")(className)
    if (colSpan != null) __obj.updateDynamic("colSpan")(colSpan.asInstanceOf[js.Any])
    if (dataIndex != null) __obj.updateDynamic("dataIndex")(dataIndex)
    if (defaultSortOrder != null) __obj.updateDynamic("defaultSortOrder")(defaultSortOrder)
    if (filterDropdown != null) __obj.updateDynamic("filterDropdown")(filterDropdown.asInstanceOf[js.Any])
    if (!js.isUndefined(filterDropdownVisible)) __obj.updateDynamic("filterDropdownVisible")(filterDropdownVisible)
    if (filterIcon != null) __obj.updateDynamic("filterIcon")(filterIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(filterMultiple)) __obj.updateDynamic("filterMultiple")(filterMultiple)
    if (filteredValue != null) __obj.updateDynamic("filteredValue")(filteredValue)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (fixed != null) __obj.updateDynamic("fixed")(fixed.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onCell != null) __obj.updateDynamic("onCell")(js.Any.fromFunction2(onCell))
    if (onCellClick != null) __obj.updateDynamic("onCellClick")(js.Any.fromFunction2(onCellClick))
    if (onFilter != null) __obj.updateDynamic("onFilter")(js.Any.fromFunction2(onFilter))
    if (onFilterDropdownVisibleChange != null) __obj.updateDynamic("onFilterDropdownVisibleChange")(js.Any.fromFunction1(onFilterDropdownVisibleChange))
    if (onHeaderCell != null) __obj.updateDynamic("onHeaderCell")(js.Any.fromFunction1(onHeaderCell))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction3(render))
    if (sortDirections != null) __obj.updateDynamic("sortDirections")(sortDirections)
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    if (sorter != null) __obj.updateDynamic("sorter")(sorter.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnProps[T]]
  }
}

