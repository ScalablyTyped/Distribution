package typings.antd.tableInterfaceMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableLocale extends js.Object {
  
  var cancelSort: js.UndefOr[String] = js.native
  
  var collapse: js.UndefOr[String] = js.native
  
  var emptyText: js.UndefOr[ReactNode | js.Function0[ReactNode]] = js.native
  
  var expand: js.UndefOr[String] = js.native
  
  var filterConfirm: js.UndefOr[ReactNode] = js.native
  
  var filterEmptyText: js.UndefOr[ReactNode] = js.native
  
  var filterReset: js.UndefOr[ReactNode] = js.native
  
  var filterTitle: js.UndefOr[String] = js.native
  
  var selectAll: js.UndefOr[ReactNode] = js.native
  
  var selectInvert: js.UndefOr[ReactNode] = js.native
  
  var selectionAll: js.UndefOr[ReactNode] = js.native
  
  var sortTitle: js.UndefOr[String] = js.native
  
  var triggerAsc: js.UndefOr[String] = js.native
  
  var triggerDesc: js.UndefOr[String] = js.native
}
object TableLocale {
  
  @scala.inline
  def apply(): TableLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableLocale]
  }
  
  @scala.inline
  implicit class TableLocaleOps[Self <: TableLocale] (val x: Self) extends AnyVal {
    
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
    def setCancelSort(value: String): Self = this.set("cancelSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelSort: Self = this.set("cancelSort", js.undefined)
    
    @scala.inline
    def setCollapse(value: String): Self = this.set("collapse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapse: Self = this.set("collapse", js.undefined)
    
    @scala.inline
    def setEmptyTextFunction0(value: () => ReactNode): Self = this.set("emptyText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEmptyText(value: ReactNode | js.Function0[ReactNode]): Self = this.set("emptyText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmptyText: Self = this.set("emptyText", js.undefined)
    
    @scala.inline
    def setExpand(value: String): Self = this.set("expand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpand: Self = this.set("expand", js.undefined)
    
    @scala.inline
    def setFilterConfirm(value: ReactNode): Self = this.set("filterConfirm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterConfirm: Self = this.set("filterConfirm", js.undefined)
    
    @scala.inline
    def setFilterEmptyText(value: ReactNode): Self = this.set("filterEmptyText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterEmptyText: Self = this.set("filterEmptyText", js.undefined)
    
    @scala.inline
    def setFilterReset(value: ReactNode): Self = this.set("filterReset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterReset: Self = this.set("filterReset", js.undefined)
    
    @scala.inline
    def setFilterTitle(value: String): Self = this.set("filterTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterTitle: Self = this.set("filterTitle", js.undefined)
    
    @scala.inline
    def setSelectAll(value: ReactNode): Self = this.set("selectAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectAll: Self = this.set("selectAll", js.undefined)
    
    @scala.inline
    def setSelectInvert(value: ReactNode): Self = this.set("selectInvert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectInvert: Self = this.set("selectInvert", js.undefined)
    
    @scala.inline
    def setSelectionAll(value: ReactNode): Self = this.set("selectionAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionAll: Self = this.set("selectionAll", js.undefined)
    
    @scala.inline
    def setSortTitle(value: String): Self = this.set("sortTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortTitle: Self = this.set("sortTitle", js.undefined)
    
    @scala.inline
    def setTriggerAsc(value: String): Self = this.set("triggerAsc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriggerAsc: Self = this.set("triggerAsc", js.undefined)
    
    @scala.inline
    def setTriggerDesc(value: String): Self = this.set("triggerDesc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriggerDesc: Self = this.set("triggerDesc", js.undefined)
  }
}
