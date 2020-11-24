package typings.antd.anon

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemIcon extends js.Object {
  
  var clearIcon: ReactNode = js.native
  
  var itemIcon: js.Object | Null = js.native
  
  var removeIcon: js.Object | Null = js.native
  
  var suffixIcon: js.Object | Null = js.native
}
object ItemIcon {
  
  @scala.inline
  def apply(): ItemIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemIcon]
  }
  
  @scala.inline
  implicit class ItemIconOps[Self <: ItemIcon] (val x: Self) extends AnyVal {
    
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
    def setClearIcon(value: ReactNode): Self = this.set("clearIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearIcon: Self = this.set("clearIcon", js.undefined)
    
    @scala.inline
    def setItemIcon(value: js.Object): Self = this.set("itemIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemIconNull: Self = this.set("itemIcon", null)
    
    @scala.inline
    def setRemoveIcon(value: js.Object): Self = this.set("removeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveIconNull: Self = this.set("removeIcon", null)
    
    @scala.inline
    def setSuffixIcon(value: js.Object): Self = this.set("suffixIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuffixIconNull: Self = this.set("suffixIcon", null)
  }
}
