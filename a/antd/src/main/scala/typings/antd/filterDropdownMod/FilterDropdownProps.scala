package typings.antd.filterDropdownMod

import typings.antd.tableInterfaceMod.ColumnType
import typings.antd.tableInterfaceMod.GetPopupContainer
import typings.antd.tableInterfaceMod.Key
import typings.antd.tableInterfaceMod.TableLocale
import typings.antd.useFilterMod.FilterState
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterDropdownProps[RecordType] extends js.Object {
  var children: ReactNode
  var column: ColumnType[RecordType]
  var columnKey: Key
  var dropdownPrefixCls: String
  var filterMultiple: Boolean
  var filterState: js.UndefOr[FilterState[RecordType]] = js.undefined
  var getPopupContainer: js.UndefOr[GetPopupContainer] = js.undefined
  var locale: TableLocale
  var prefixCls: String
  def triggerFilter(filterState: FilterState[RecordType]): Unit
}

object FilterDropdownProps {
  @scala.inline
  def apply[RecordType](
    column: ColumnType[RecordType],
    columnKey: Key,
    dropdownPrefixCls: String,
    filterMultiple: Boolean,
    locale: TableLocale,
    prefixCls: String,
    triggerFilter: FilterState[RecordType] => Unit,
    children: ReactNode = null,
    filterState: FilterState[RecordType] = null,
    getPopupContainer: /* triggerNode */ HTMLElement => HTMLElement = null
  ): FilterDropdownProps[RecordType] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnKey = columnKey.asInstanceOf[js.Any], dropdownPrefixCls = dropdownPrefixCls.asInstanceOf[js.Any], filterMultiple = filterMultiple.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], triggerFilter = js.Any.fromFunction1(triggerFilter))
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (filterState != null) __obj.updateDynamic("filterState")(filterState.asInstanceOf[js.Any])
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1(getPopupContainer))
    __obj.asInstanceOf[FilterDropdownProps[RecordType]]
  }
}

