package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typings.antd.Anon_Filters
import typings.antd.antdStrings.center
import typings.antd.antdStrings.left
import typings.antd.antdStrings.right
import typings.antd.esTableColumnMod.default
import typings.antd.esTableInterfaceMod.ColumnFilterItem
import typings.antd.esTableInterfaceMod.ColumnProps
import typings.antd.esTableInterfaceMod.CompareFn
import typings.antd.esTableInterfaceMod.FilterDropdownProps
import typings.antd.esTableInterfaceMod.SortOrder
import typings.antd.esTableInterfaceMod.TableEventListeners
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: className, colSpan, width */
object Column
  extends ExternalComponentWithAttributesWithRefType[tag.type, default[js.Any]] {
  override val component: String | js.Object = js.constructorOf[typings.antd.esTableColumnMod.default[js.Any]].asInstanceOf[String | js.Object]
  def apply[T](
    align: left | right | center = null,
    dataIndex: String = null,
    defaultSortOrder: SortOrder = null,
    filterDropdown: TagMod[Any] | (js.Function1[/* props */ FilterDropdownProps, TagMod[Any]]) = null,
    filterDropdownVisible: js.UndefOr[Boolean] = js.undefined,
    filterIcon: TagMod[Any] | (js.Function1[/* filtered */ Boolean, TagMod[Any]]) = null,
    filterMultiple: js.UndefOr[Boolean] = js.undefined,
    filteredValue: js.Array[_] = null,
    filters: js.Array[ColumnFilterItem] = null,
    fixed: Boolean | left | right = null,
    onCell: (/* record */ T, /* rowIndex */ Double) => TableEventListeners = null,
    onCellClick: (/* record */ T, /* event */ Event) => Unit = null,
    onFilter: (/* value */ js.Any, /* record */ T) => Boolean = null,
    onFilterDropdownVisibleChange: /* visible */ Boolean => Unit = null,
    onHeaderCell: /* props */ ColumnProps[T] => TableEventListeners = null,
    render: (/* text */ js.Any, /* record */ T, /* index */ Double) => TagMod[Any] = null,
    sortDirections: js.Array[SortOrder] = null,
    sortOrder: SortOrder | Boolean = null,
    sorter: Boolean | CompareFn[T] = null,
    title: TagMod[Any] | (js.Function1[/* options */ Anon_Filters, TagMod[Any]]) = null
  ): BuildingComponent[tag.type, default[js.Any]] = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (dataIndex != null) __obj.updateDynamic("dataIndex")(dataIndex)
    if (defaultSortOrder != null) __obj.updateDynamic("defaultSortOrder")(defaultSortOrder)
    if (filterDropdown != null) __obj.updateDynamic("filterDropdown")(filterDropdown.asInstanceOf[js.Any])
    if (!js.isUndefined(filterDropdownVisible)) __obj.updateDynamic("filterDropdownVisible")(filterDropdownVisible)
    if (filterIcon != null) __obj.updateDynamic("filterIcon")(filterIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(filterMultiple)) __obj.updateDynamic("filterMultiple")(filterMultiple)
    if (filteredValue != null) __obj.updateDynamic("filteredValue")(filteredValue)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (fixed != null) __obj.updateDynamic("fixed")(fixed.asInstanceOf[js.Any])
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
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typings.antd.esTableColumnMod.default[js.Any]]]
  }
  type Props = ColumnProps[js.Any]
}

