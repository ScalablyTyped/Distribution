package typings.antdMobile.navBarPropsTypeMod

import typings.antdMobile.antdMobileStrings.dark
import typings.antdMobile.antdMobileStrings.light
import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavBarProps
  extends AllHTMLAttributes[HTMLDivElement]
     with ClassAttributes[HTMLDivElement] {
  
  var icon: js.UndefOr[ReactNode] = js.native
  
  var leftContent: js.UndefOr[ReactNode] = js.native
  
  var mode: js.UndefOr[dark | light] = js.native
  
  var onLeftClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  
  var prefixCls: js.UndefOr[String] = js.native
  
  var rightContent: js.UndefOr[ReactNode] = js.native
}
object NavBarProps {
  
  @scala.inline
  def apply(): NavBarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavBarProps]
  }
  
  @scala.inline
  implicit class NavBarPropsOps[Self <: NavBarProps] (val x: Self) extends AnyVal {
    
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
    def setIcon(value: ReactNode): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setLeftContent(value: ReactNode): Self = this.set("leftContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftContent: Self = this.set("leftContent", js.undefined)
    
    @scala.inline
    def setMode(value: dark | light): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setOnLeftClick(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = this.set("onLeftClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLeftClick: Self = this.set("onLeftClick", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    
    @scala.inline
    def setRightContent(value: ReactNode): Self = this.set("rightContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightContent: Self = this.set("rightContent", js.undefined)
  }
}
