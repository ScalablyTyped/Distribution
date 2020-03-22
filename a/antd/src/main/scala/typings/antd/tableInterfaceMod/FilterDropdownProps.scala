package typings.antd.tableInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterDropdownProps extends js.Object {
  var clearFilters: js.UndefOr[js.Function0[Unit]] = js.undefined
  var filters: js.UndefOr[js.Array[ColumnFilterItem]] = js.undefined
  var prefixCls: String
  var selectedKeys: js.Array[typings.react.mod.Key]
  var visible: Boolean
  def confirm(): Unit
  def setSelectedKeys(selectedKeys: js.Array[String]): Unit
}

object FilterDropdownProps {
  @scala.inline
  def apply(
    confirm: () => Unit,
    prefixCls: String,
    selectedKeys: js.Array[typings.react.mod.Key],
    setSelectedKeys: js.Array[String] => Unit,
    visible: Boolean,
    clearFilters: () => Unit = null,
    filters: js.Array[ColumnFilterItem] = null
  ): FilterDropdownProps = {
    val __obj = js.Dynamic.literal(confirm = js.Any.fromFunction0(confirm), prefixCls = prefixCls.asInstanceOf[js.Any], selectedKeys = selectedKeys.asInstanceOf[js.Any], setSelectedKeys = js.Any.fromFunction1(setSelectedKeys), visible = visible.asInstanceOf[js.Any])
    if (clearFilters != null) __obj.updateDynamic("clearFilters")(js.Any.fromFunction0(clearFilters))
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterDropdownProps]
  }
}

