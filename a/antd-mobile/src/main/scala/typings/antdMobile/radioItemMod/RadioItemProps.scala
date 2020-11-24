package typings.antdMobile.radioItemMod

import typings.antdMobile.radioPropsTypeMod.RadioItemPropsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RadioItemProps extends RadioItemPropsType {
  
  var className: js.UndefOr[String] = js.native
  
  var listPrefixCls: js.UndefOr[String] = js.native
  
  var prefixCls: js.UndefOr[String] = js.native
}
object RadioItemProps {
  
  @scala.inline
  def apply(): RadioItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadioItemProps]
  }
  
  @scala.inline
  implicit class RadioItemPropsOps[Self <: RadioItemProps] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setListPrefixCls(value: String): Self = this.set("listPrefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListPrefixCls: Self = this.set("listPrefixCls", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
  }
}
