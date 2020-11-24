package typings.antdMobileRn.popoverIndexNativeMod

import typings.antdMobileRn.popoverPropsTypeMod.PopoverPropsType
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopoverProps extends PopoverPropsType {
  
  var contextStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var overlayStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var renderOverlayComponent: js.UndefOr[js.Function1[/* values */ js.Any, Element]] = js.native
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var triggerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
}
object PopoverProps {
  
  @scala.inline
  def apply(): PopoverProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopoverProps]
  }
  
  @scala.inline
  implicit class PopoverPropsOps[Self <: PopoverProps] (val x: Self) extends AnyVal {
    
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
    def setContextStyle(value: StyleProp[ViewStyle]): Self = this.set("contextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextStyle: Self = this.set("contextStyle", js.undefined)
    
    @scala.inline
    def setContextStyleNull: Self = this.set("contextStyle", null)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOverlayStyle(value: StyleProp[ViewStyle]): Self = this.set("overlayStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlayStyle: Self = this.set("overlayStyle", js.undefined)
    
    @scala.inline
    def setOverlayStyleNull: Self = this.set("overlayStyle", null)
    
    @scala.inline
    def setRenderOverlayComponent(value: /* values */ js.Any => Element): Self = this.set("renderOverlayComponent", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderOverlayComponent: Self = this.set("renderOverlayComponent", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
    
    @scala.inline
    def setTriggerStyle(value: StyleProp[ViewStyle]): Self = this.set("triggerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriggerStyle: Self = this.set("triggerStyle", js.undefined)
    
    @scala.inline
    def setTriggerStyleNull: Self = this.set("triggerStyle", null)
  }
}
