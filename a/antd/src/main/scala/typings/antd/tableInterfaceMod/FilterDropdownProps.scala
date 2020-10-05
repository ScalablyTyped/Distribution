package typings.antd.tableInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterDropdownProps extends js.Object {
  var clearFilters: js.UndefOr[js.Function0[Unit]] = js.native
  var filters: js.UndefOr[js.Array[ColumnFilterItem]] = js.native
  var prefixCls: String = js.native
  var selectedKeys: js.Array[typings.react.mod.Key] = js.native
  var visible: Boolean = js.native
  def confirm(): Unit = js.native
  def setSelectedKeys(selectedKeys: js.Array[typings.react.mod.Key]): Unit = js.native
}

object FilterDropdownProps {
  @scala.inline
  def apply(
    confirm: () => Unit,
    prefixCls: String,
    selectedKeys: js.Array[typings.react.mod.Key],
    setSelectedKeys: js.Array[typings.react.mod.Key] => Unit,
    visible: Boolean
  ): FilterDropdownProps = {
    val __obj = js.Dynamic.literal(confirm = js.Any.fromFunction0(confirm), prefixCls = prefixCls.asInstanceOf[js.Any], selectedKeys = selectedKeys.asInstanceOf[js.Any], setSelectedKeys = js.Any.fromFunction1(setSelectedKeys), visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterDropdownProps]
  }
  @scala.inline
  implicit class FilterDropdownPropsOps[Self <: FilterDropdownProps] (val x: Self) extends AnyVal {
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
    def setConfirm(value: () => Unit): Self = this.set("confirm", js.Any.fromFunction0(value))
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectedKeysVarargs(value: typings.react.mod.Key*): Self = this.set("selectedKeys", js.Array(value :_*))
    @scala.inline
    def setSelectedKeys(value: js.Array[typings.react.mod.Key]): Self = this.set("selectedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetSelectedKeys(value: js.Array[typings.react.mod.Key] => Unit): Self = this.set("setSelectedKeys", js.Any.fromFunction1(value))
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def setClearFilters(value: () => Unit): Self = this.set("clearFilters", js.Any.fromFunction0(value))
    @scala.inline
    def deleteClearFilters: Self = this.set("clearFilters", js.undefined)
    @scala.inline
    def setFiltersVarargs(value: ColumnFilterItem*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[ColumnFilterItem]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
  }
  
}

