package typings.agGrid.gridOptionsMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MenuItemDef extends js.Object {
  
  var action: js.UndefOr[js.Function0[Unit]] = js.native
  
  var checked: js.UndefOr[Boolean] = js.native
  
  var cssClasses: js.UndefOr[js.Array[String]] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var icon: js.UndefOr[HTMLElement | String] = js.native
  
  var name: String = js.native
  
  var shortcut: js.UndefOr[String] = js.native
  
  var subMenu: js.UndefOr[js.Array[MenuItemDef | String]] = js.native
  
  var tooltip: js.UndefOr[String] = js.native
}
object MenuItemDef {
  
  @scala.inline
  def apply(name: String): MenuItemDef = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuItemDef]
  }
  
  @scala.inline
  implicit class MenuItemDefOps[Self <: MenuItemDef] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAction(value: () => Unit): Self = this.set("action", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    
    @scala.inline
    def setCssClassesVarargs(value: String*): Self = this.set("cssClasses", js.Array(value :_*))
    
    @scala.inline
    def setCssClasses(value: js.Array[String]): Self = this.set("cssClasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssClasses: Self = this.set("cssClasses", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setIcon(value: HTMLElement | String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setShortcut(value: String): Self = this.set("shortcut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShortcut: Self = this.set("shortcut", js.undefined)
    
    @scala.inline
    def setSubMenuVarargs(value: (MenuItemDef | String)*): Self = this.set("subMenu", js.Array(value :_*))
    
    @scala.inline
    def setSubMenu(value: js.Array[MenuItemDef | String]): Self = this.set("subMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubMenu: Self = this.set("subMenu", js.undefined)
    
    @scala.inline
    def setTooltip(value: String): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
  }
}
