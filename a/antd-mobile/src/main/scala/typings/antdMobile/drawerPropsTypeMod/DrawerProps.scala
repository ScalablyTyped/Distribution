package typings.antdMobile.drawerPropsTypeMod

import typings.antdMobile.antdMobileStrings.bottom
import typings.antdMobile.antdMobileStrings.left
import typings.antdMobile.antdMobileStrings.right
import typings.antdMobile.antdMobileStrings.top
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrawerProps extends js.Object {
  
  var onOpenChange: js.UndefOr[js.Function1[/* isOpen */ Boolean, Unit]] = js.native
  
  var open: js.UndefOr[Boolean] = js.native
  
  var position: js.UndefOr[left | right | top | bottom] = js.native
  
  var sidebar: js.UndefOr[ReactNode] = js.native
}
object DrawerProps {
  
  @scala.inline
  def apply(): DrawerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawerProps]
  }
  
  @scala.inline
  implicit class DrawerPropsOps[Self <: DrawerProps] (val x: Self) extends AnyVal {
    
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
    def setOnOpenChange(value: /* isOpen */ Boolean => Unit): Self = this.set("onOpenChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnOpenChange: Self = this.set("onOpenChange", js.undefined)
    
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    
    @scala.inline
    def setPosition(value: left | right | top | bottom): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setSidebar(value: ReactNode): Self = this.set("sidebar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSidebar: Self = this.set("sidebar", js.undefined)
  }
}
