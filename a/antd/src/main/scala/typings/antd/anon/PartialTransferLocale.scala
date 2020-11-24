package typings.antd.anon

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<antd.antd/lib/transfer.TransferLocale> */
@js.native
trait PartialTransferLocale extends js.Object {
  
  var itemUnit: js.UndefOr[String] = js.native
  
  var itemsUnit: js.UndefOr[String] = js.native
  
  var notFoundContent: js.UndefOr[ReactNode] = js.native
  
  var remove: js.UndefOr[String] = js.native
  
  var removeAll: js.UndefOr[String] = js.native
  
  var removeCurrent: js.UndefOr[String] = js.native
  
  var searchPlaceholder: js.UndefOr[String] = js.native
  
  var selectAll: js.UndefOr[String] = js.native
  
  var selectCurrent: js.UndefOr[String] = js.native
  
  var selectInvert: js.UndefOr[String] = js.native
  
  var titles: js.UndefOr[js.Array[String]] = js.native
}
object PartialTransferLocale {
  
  @scala.inline
  def apply(): PartialTransferLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTransferLocale]
  }
  
  @scala.inline
  implicit class PartialTransferLocaleOps[Self <: PartialTransferLocale] (val x: Self) extends AnyVal {
    
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
    def setItemUnit(value: String): Self = this.set("itemUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemUnit: Self = this.set("itemUnit", js.undefined)
    
    @scala.inline
    def setItemsUnit(value: String): Self = this.set("itemsUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemsUnit: Self = this.set("itemsUnit", js.undefined)
    
    @scala.inline
    def setNotFoundContent(value: ReactNode): Self = this.set("notFoundContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotFoundContent: Self = this.set("notFoundContent", js.undefined)
    
    @scala.inline
    def setRemove(value: String): Self = this.set("remove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    
    @scala.inline
    def setRemoveAll(value: String): Self = this.set("removeAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveAll: Self = this.set("removeAll", js.undefined)
    
    @scala.inline
    def setRemoveCurrent(value: String): Self = this.set("removeCurrent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveCurrent: Self = this.set("removeCurrent", js.undefined)
    
    @scala.inline
    def setSearchPlaceholder(value: String): Self = this.set("searchPlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchPlaceholder: Self = this.set("searchPlaceholder", js.undefined)
    
    @scala.inline
    def setSelectAll(value: String): Self = this.set("selectAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectAll: Self = this.set("selectAll", js.undefined)
    
    @scala.inline
    def setSelectCurrent(value: String): Self = this.set("selectCurrent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectCurrent: Self = this.set("selectCurrent", js.undefined)
    
    @scala.inline
    def setSelectInvert(value: String): Self = this.set("selectInvert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectInvert: Self = this.set("selectInvert", js.undefined)
    
    @scala.inline
    def setTitlesVarargs(value: String*): Self = this.set("titles", js.Array(value :_*))
    
    @scala.inline
    def setTitles(value: js.Array[String]): Self = this.set("titles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitles: Self = this.set("titles", js.undefined)
  }
}
