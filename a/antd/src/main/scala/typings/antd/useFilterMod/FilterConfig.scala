package typings.antd.useFilterMod

import typings.antd.tableInterfaceMod.ColumnGroupType
import typings.antd.tableInterfaceMod.ColumnType
import typings.antd.tableInterfaceMod.ColumnsType
import typings.antd.tableInterfaceMod.GetPopupContainer
import typings.antd.tableInterfaceMod.Key
import typings.antd.tableInterfaceMod.TableLocale
import typings.std.HTMLElement
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterConfig[RecordType] extends js.Object {
  var dropdownPrefixCls: String = js.native
  var getPopupContainer: js.UndefOr[GetPopupContainer] = js.native
  var locale: TableLocale = js.native
  var mergedColumns: ColumnsType[RecordType] = js.native
  var prefixCls: String = js.native
  def onFilterChange(filters: Record[String, js.Array[Key] | Null], filterStates: js.Array[FilterState[RecordType]]): Unit = js.native
}

object FilterConfig {
  @scala.inline
  def apply[RecordType](
    dropdownPrefixCls: String,
    locale: TableLocale,
    mergedColumns: ColumnsType[RecordType],
    onFilterChange: (Record[String, js.Array[Key] | Null], js.Array[FilterState[RecordType]]) => Unit,
    prefixCls: String
  ): FilterConfig[RecordType] = {
    val __obj = js.Dynamic.literal(dropdownPrefixCls = dropdownPrefixCls.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], mergedColumns = mergedColumns.asInstanceOf[js.Any], onFilterChange = js.Any.fromFunction2(onFilterChange), prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterConfig[RecordType]]
  }
  @scala.inline
  implicit class FilterConfigOps[Self <: FilterConfig[_], RecordType] (val x: Self with FilterConfig[RecordType]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDropdownPrefixCls(value: String): Self = this.set("dropdownPrefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocale(value: TableLocale): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def setMergedColumnsVarargs(value: (ColumnGroupType[RecordType] | ColumnType[RecordType])*): Self = this.set("mergedColumns", js.Array(value :_*))
    @scala.inline
    def setMergedColumns(value: ColumnsType[RecordType]): Self = this.set("mergedColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnFilterChange(value: (Record[String, js.Array[Key] | Null], js.Array[FilterState[RecordType]]) => Unit): Self = this.set("onFilterChange", js.Any.fromFunction2(value))
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): Self = this.set("getPopupContainer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetPopupContainer: Self = this.set("getPopupContainer", js.undefined)
  }
  
}

