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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterDropdownProps[RecordType] extends js.Object {
  
  var children: ReactNode = js.native
  
  var column: ColumnType[RecordType] = js.native
  
  var columnKey: Key = js.native
  
  var dropdownPrefixCls: String = js.native
  
  var filterMultiple: Boolean = js.native
  
  var filterState: js.UndefOr[FilterState[RecordType]] = js.native
  
  var getPopupContainer: js.UndefOr[GetPopupContainer] = js.native
  
  var locale: TableLocale = js.native
  
  var prefixCls: String = js.native
  
  def triggerFilter(filterState: FilterState[RecordType]): Unit = js.native
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
    triggerFilter: FilterState[RecordType] => Unit
  ): FilterDropdownProps[RecordType] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnKey = columnKey.asInstanceOf[js.Any], dropdownPrefixCls = dropdownPrefixCls.asInstanceOf[js.Any], filterMultiple = filterMultiple.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], triggerFilter = js.Any.fromFunction1(triggerFilter))
    __obj.asInstanceOf[FilterDropdownProps[RecordType]]
  }
  
  @scala.inline
  implicit class FilterDropdownPropsOps[Self <: FilterDropdownProps[_], RecordType] (val x: Self with FilterDropdownProps[RecordType]) extends AnyVal {
    
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
    def setColumn(value: ColumnType[RecordType]): Self = this.set("column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnKey(value: Key): Self = this.set("columnKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropdownPrefixCls(value: String): Self = this.set("dropdownPrefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterMultiple(value: Boolean): Self = this.set("filterMultiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: TableLocale): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerFilter(value: FilterState[RecordType] => Unit): Self = this.set("triggerFilter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setFilterState(value: FilterState[RecordType]): Self = this.set("filterState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterState: Self = this.set("filterState", js.undefined)
    
    @scala.inline
    def setGetPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): Self = this.set("getPopupContainer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetPopupContainer: Self = this.set("getPopupContainer", js.undefined)
  }
}
