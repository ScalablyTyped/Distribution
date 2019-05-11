package typings
package antdLib.libTableInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnProps[T] extends js.Object {
  var align: js.UndefOr[
    antdLib.antdLibStrings.left | antdLib.antdLibStrings.right | antdLib.antdLibStrings.center
  ] = js.undefined
  var children: js.UndefOr[js.Array[ColumnProps[T]]] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var colSpan: js.UndefOr[scala.Double] = js.undefined
  var dataIndex: js.UndefOr[java.lang.String] = js.undefined
  var defaultSortOrder: js.UndefOr[SortOrder] = js.undefined
  var filterDropdown: js.UndefOr[
    reactLib.reactMod.ReactNode | (js.Function1[/* props */ js.Object, reactLib.reactMod.ReactNode])
  ] = js.undefined
  var filterDropdownVisible: js.UndefOr[scala.Boolean] = js.undefined
  var filterIcon: js.UndefOr[
    reactLib.reactMod.ReactNode | (js.Function1[/* filtered */ scala.Boolean, reactLib.reactMod.ReactNode])
  ] = js.undefined
  var filterMultiple: js.UndefOr[scala.Boolean] = js.undefined
  var filteredValue: js.UndefOr[js.Array[_]] = js.undefined
  var filters: js.UndefOr[js.Array[ColumnFilterItem]] = js.undefined
  var fixed: js.UndefOr[scala.Boolean | antdLib.antdLibStrings.left | antdLib.antdLibStrings.right] = js.undefined
  var key: js.UndefOr[reactLib.reactMod.Key] = js.undefined
  var onCell: js.UndefOr[js.Function2[/* record */ T, /* rowIndex */ scala.Double, _]] = js.undefined
  var onCellClick: js.UndefOr[js.Function2[/* record */ T, /* event */ js.Any, scala.Unit]] = js.undefined
  var onFilter: js.UndefOr[js.Function2[/* value */ js.Any, /* record */ T, scala.Boolean]] = js.undefined
  var onFilterDropdownVisibleChange: js.UndefOr[js.Function1[/* visible */ scala.Boolean, scala.Unit]] = js.undefined
  var onHeaderCell: js.UndefOr[js.Function1[/* props */ ColumnProps[T], _]] = js.undefined
  var render: js.UndefOr[
    js.Function3[
      /* text */ js.Any, 
      /* record */ T, 
      /* index */ scala.Double, 
      reactLib.reactMod.ReactNode
    ]
  ] = js.undefined
  var sortDirections: js.UndefOr[js.Array[SortOrder]] = js.undefined
  var sortOrder: js.UndefOr[SortOrder | scala.Boolean] = js.undefined
  var sorter: js.UndefOr[scala.Boolean | CompareFn[T]] = js.undefined
  var title: js.UndefOr[
    reactLib.reactMod.ReactNode | (js.Function1[/* options */ antdLib.Anon_FiltersSortOrder, reactLib.reactMod.ReactNode])
  ] = js.undefined
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object ColumnProps {
  @scala.inline
  def apply[T](
    align: antdLib.antdLibStrings.left | antdLib.antdLibStrings.right | antdLib.antdLibStrings.center = null,
    children: js.Array[ColumnProps[T]] = null,
    className: java.lang.String = null,
    colSpan: scala.Int | scala.Double = null,
    dataIndex: java.lang.String = null,
    defaultSortOrder: SortOrder = null,
    filterDropdown: reactLib.reactMod.ReactNode | (js.Function1[/* props */ js.Object, reactLib.reactMod.ReactNode]) = null,
    filterDropdownVisible: js.UndefOr[scala.Boolean] = js.undefined,
    filterIcon: reactLib.reactMod.ReactNode | (js.Function1[/* filtered */ scala.Boolean, reactLib.reactMod.ReactNode]) = null,
    filterMultiple: js.UndefOr[scala.Boolean] = js.undefined,
    filteredValue: js.Array[_] = null,
    filters: js.Array[ColumnFilterItem] = null,
    fixed: scala.Boolean | antdLib.antdLibStrings.left | antdLib.antdLibStrings.right = null,
    key: reactLib.reactMod.Key = null,
    onCell: (/* record */ T, /* rowIndex */ scala.Double) => _ = null,
    onCellClick: (/* record */ T, /* event */ js.Any) => scala.Unit = null,
    onFilter: (/* value */ js.Any, /* record */ T) => scala.Boolean = null,
    onFilterDropdownVisibleChange: /* visible */ scala.Boolean => scala.Unit = null,
    onHeaderCell: /* props */ ColumnProps[T] => _ = null,
    render: (/* text */ js.Any, /* record */ T, /* index */ scala.Double) => reactLib.reactMod.ReactNode = null,
    sortDirections: js.Array[SortOrder] = null,
    sortOrder: SortOrder | scala.Boolean = null,
    sorter: scala.Boolean | CompareFn[T] = null,
    title: reactLib.reactMod.ReactNode | (js.Function1[/* options */ antdLib.Anon_FiltersSortOrder, reactLib.reactMod.ReactNode]) = null,
    width: java.lang.String | scala.Double = null
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

