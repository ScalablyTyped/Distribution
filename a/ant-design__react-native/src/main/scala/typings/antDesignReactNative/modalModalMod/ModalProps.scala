package typings.antDesignReactNative.modalModalMod

import typings.antDesignReactNative.libStyleMod.WithThemeStyles
import typings.antDesignReactNative.modalPropsTypeMod.CallbackOnBackHandler
import typings.antDesignReactNative.modalPropsTypeMod.ModalPropsType
import typings.antDesignReactNative.modalStyleMod.ModalStyle
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModalProps
  extends ModalPropsType[TextStyle]
     with WithThemeStyles[ModalStyle] {
  
  var bodyStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var onRequestClose: js.UndefOr[CallbackOnBackHandler] = js.native
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
}
object ModalProps {
  
  @scala.inline
  def apply(visible: Boolean): ModalProps = {
    val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalProps]
  }
  
  @scala.inline
  implicit class ModalPropsOps[Self <: ModalProps] (val x: Self) extends AnyVal {
    
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
    def setBodyStyle(value: StyleProp[ViewStyle]): Self = this.set("bodyStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBodyStyle: Self = this.set("bodyStyle", js.undefined)
    
    @scala.inline
    def setBodyStyleNull: Self = this.set("bodyStyle", null)
    
    @scala.inline
    def setOnRequestClose(value: () => Boolean): Self = this.set("onRequestClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnRequestClose: Self = this.set("onRequestClose", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
  }
}
