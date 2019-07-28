package typings.antd.esTableInterfaceMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterDropdownProps extends js.Object {
  var clearFilters: js.UndefOr[js.Function1[/* selectedKeys */ js.Array[String], Unit]] = js.undefined
  var confirm: js.UndefOr[js.Function0[Unit]] = js.undefined
  var filters: js.UndefOr[js.Array[ColumnFilterItem]] = js.undefined
  var getPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ HTMLElement, HTMLElement]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var selectedKeys: js.UndefOr[js.Array[String]] = js.undefined
  var setSelectedKeys: js.UndefOr[js.Function1[/* selectedKeys */ js.Array[String], Unit]] = js.undefined
}

object FilterDropdownProps {
  @scala.inline
  def apply(
    clearFilters: /* selectedKeys */ js.Array[String] => Unit = null,
    confirm: () => Unit = null,
    filters: js.Array[ColumnFilterItem] = null,
    getPopupContainer: /* triggerNode */ HTMLElement => HTMLElement = null,
    prefixCls: String = null,
    selectedKeys: js.Array[String] = null,
    setSelectedKeys: /* selectedKeys */ js.Array[String] => Unit = null
  ): FilterDropdownProps = {
    val __obj = js.Dynamic.literal()
    if (clearFilters != null) __obj.updateDynamic("clearFilters")(js.Any.fromFunction1(clearFilters))
    if (confirm != null) __obj.updateDynamic("confirm")(js.Any.fromFunction0(confirm))
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1(getPopupContainer))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (selectedKeys != null) __obj.updateDynamic("selectedKeys")(selectedKeys)
    if (setSelectedKeys != null) __obj.updateDynamic("setSelectedKeys")(js.Any.fromFunction1(setSelectedKeys))
    __obj.asInstanceOf[FilterDropdownProps]
  }
}

