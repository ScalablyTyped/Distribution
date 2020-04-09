package typings.antd.useFilterMod

import typings.antd.tableInterfaceMod.ColumnsType
import typings.antd.tableInterfaceMod.GetPopupContainer
import typings.antd.tableInterfaceMod.Key
import typings.antd.tableInterfaceMod.TableLocale
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterConfig[RecordType] extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var columns: js.UndefOr[ColumnsType[RecordType]] = js.undefined
  var dropdownPrefixCls: String
  var getPopupContainer: js.UndefOr[GetPopupContainer] = js.undefined
  var locale: TableLocale
  var prefixCls: String
  def onFilterChange(filters: Record[String, js.Array[Key] | Null], filterStates: js.Array[FilterState[RecordType]]): Unit
}

object FilterConfig {
  @scala.inline
  def apply[RecordType](
    dropdownPrefixCls: String,
    locale: TableLocale,
    onFilterChange: (Record[String, js.Array[Key] | Null], js.Array[FilterState[RecordType]]) => Unit,
    prefixCls: String,
    children: ReactNode = null,
    columns: ColumnsType[RecordType] = null,
    getPopupContainer: /* triggerNode */ HTMLElement => HTMLElement = null
  ): FilterConfig[RecordType] = {
    val __obj = js.Dynamic.literal(dropdownPrefixCls = dropdownPrefixCls.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], onFilterChange = js.Any.fromFunction2(onFilterChange), prefixCls = prefixCls.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1(getPopupContainer))
    __obj.asInstanceOf[FilterConfig[RecordType]]
  }
}

