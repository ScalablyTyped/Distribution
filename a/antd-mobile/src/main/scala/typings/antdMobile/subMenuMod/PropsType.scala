package typings.antdMobile.subMenuMod

import typings.antdMobile.menuPropsTypeMod.DataItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropsType extends js.Object {
  
  var multiSelect: js.UndefOr[Boolean] = js.native
  
  def onSel(dataItem: DataItem): Unit = js.native
  
  var radioPrefixCls: js.UndefOr[String] = js.native
  
  var selItem: js.Array[DataItem] = js.native
  
  var showSelect: Boolean = js.native
  
  var subMenuData: js.Array[DataItem] = js.native
  
  var subMenuPrefixCls: js.UndefOr[String] = js.native
}
object PropsType {
  
  @scala.inline
  def apply(
    onSel: DataItem => Unit,
    selItem: js.Array[DataItem],
    showSelect: Boolean,
    subMenuData: js.Array[DataItem]
  ): PropsType = {
    val __obj = js.Dynamic.literal(onSel = js.Any.fromFunction1(onSel), selItem = selItem.asInstanceOf[js.Any], showSelect = showSelect.asInstanceOf[js.Any], subMenuData = subMenuData.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsType]
  }
  
  @scala.inline
  implicit class PropsTypeOps[Self <: PropsType] (val x: Self) extends AnyVal {
    
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
    def setOnSel(value: DataItem => Unit): Self = this.set("onSel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelItemVarargs(value: DataItem*): Self = this.set("selItem", js.Array(value :_*))
    
    @scala.inline
    def setSelItem(value: js.Array[DataItem]): Self = this.set("selItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowSelect(value: Boolean): Self = this.set("showSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubMenuDataVarargs(value: DataItem*): Self = this.set("subMenuData", js.Array(value :_*))
    
    @scala.inline
    def setSubMenuData(value: js.Array[DataItem]): Self = this.set("subMenuData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiSelect(value: Boolean): Self = this.set("multiSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiSelect: Self = this.set("multiSelect", js.undefined)
    
    @scala.inline
    def setRadioPrefixCls(value: String): Self = this.set("radioPrefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadioPrefixCls: Self = this.set("radioPrefixCls", js.undefined)
    
    @scala.inline
    def setSubMenuPrefixCls(value: String): Self = this.set("subMenuPrefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubMenuPrefixCls: Self = this.set("subMenuPrefixCls", js.undefined)
  }
}
