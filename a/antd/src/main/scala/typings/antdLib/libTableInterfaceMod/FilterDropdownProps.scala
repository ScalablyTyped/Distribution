package typings
package antdLib.libTableInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterDropdownProps extends js.Object {
  var clearFilters: js.UndefOr[js.Function1[/* selectedKeys */ js.Array[java.lang.String], scala.Unit]] = js.undefined
  var confirm: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var filters: js.UndefOr[js.Array[ColumnFilterItem]] = js.undefined
  var getPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ stdLib.HTMLElement, stdLib.HTMLElement]] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var selectedKeys: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var setSelectedKeys: js.UndefOr[js.Function1[/* selectedKeys */ js.Array[java.lang.String], scala.Unit]] = js.undefined
}

object FilterDropdownProps {
  @scala.inline
  def apply(
    clearFilters: /* selectedKeys */ js.Array[java.lang.String] => scala.Unit = null,
    confirm: () => scala.Unit = null,
    filters: js.Array[ColumnFilterItem] = null,
    getPopupContainer: /* triggerNode */ stdLib.HTMLElement => stdLib.HTMLElement = null,
    prefixCls: java.lang.String = null,
    selectedKeys: js.Array[java.lang.String] = null,
    setSelectedKeys: /* selectedKeys */ js.Array[java.lang.String] => scala.Unit = null
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

