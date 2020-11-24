package typings.antDesignReactNative.modalViewMod

import typings.antDesignReactNative.antDesignReactNativeStrings.`slide-down`
import typings.antDesignReactNative.antDesignReactNativeStrings.`slide-up`
import typings.antDesignReactNative.antDesignReactNativeStrings.fade
import typings.antDesignReactNative.antDesignReactNativeStrings.none
import typings.antDesignReactNative.modalPropsTypeMod.CallbackOnBackHandler
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IModalPropTypes extends js.Object {
  
  var animateAppear: js.UndefOr[Boolean] = js.native
  
  var animationDuration: js.UndefOr[Double] = js.native
  
  var animationType: none | fade | `slide-up` | `slide-down` = js.native
  
  var maskClosable: js.UndefOr[Boolean] = js.native
  
  var maskStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var onAnimationEnd: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.native
  
  var onClose: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onRequestClose: js.UndefOr[CallbackOnBackHandler] = js.native
  
  var style: js.UndefOr[js.Object] = js.native
  
  var visible: Boolean = js.native
  
  var wrapStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
}
object IModalPropTypes {
  
  @scala.inline
  def apply(animationType: none | fade | `slide-up` | `slide-down`, visible: Boolean): IModalPropTypes = {
    val __obj = js.Dynamic.literal(animationType = animationType.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModalPropTypes]
  }
  
  @scala.inline
  implicit class IModalPropTypesOps[Self <: IModalPropTypes] (val x: Self) extends AnyVal {
    
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
    def setAnimationType(value: none | fade | `slide-up` | `slide-down`): Self = this.set("animationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateAppear(value: Boolean): Self = this.set("animateAppear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimateAppear: Self = this.set("animateAppear", js.undefined)
    
    @scala.inline
    def setAnimationDuration(value: Double): Self = this.set("animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationDuration: Self = this.set("animationDuration", js.undefined)
    
    @scala.inline
    def setMaskClosable(value: Boolean): Self = this.set("maskClosable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskClosable: Self = this.set("maskClosable", js.undefined)
    
    @scala.inline
    def setMaskStyle(value: StyleProp[ViewStyle]): Self = this.set("maskStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskStyle: Self = this.set("maskStyle", js.undefined)
    
    @scala.inline
    def setMaskStyleNull: Self = this.set("maskStyle", null)
    
    @scala.inline
    def setOnAnimationEnd(value: /* visible */ Boolean => Unit): Self = this.set("onAnimationEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAnimationEnd: Self = this.set("onAnimationEnd", js.undefined)
    
    @scala.inline
    def setOnClose(value: () => Unit): Self = this.set("onClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    
    @scala.inline
    def setOnRequestClose(value: () => Boolean): Self = this.set("onRequestClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnRequestClose: Self = this.set("onRequestClose", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setWrapStyle(value: StyleProp[ViewStyle]): Self = this.set("wrapStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapStyle: Self = this.set("wrapStyle", js.undefined)
    
    @scala.inline
    def setWrapStyleNull: Self = this.set("wrapStyle", null)
  }
}
