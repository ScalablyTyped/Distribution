package typings.antdMobileRn

import typings.antdMobileRn.anon.Styles
import typings.antdMobileRn.checkboxPropsTypeMod.CheckboxPropsType
import typings.antdMobileRn.checkboxStyleIndexNativeMod.ICheckboxStyle
import typings.react.mod.Component
import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object agreeItemNativeMod {
  
  @JSImport("antd-mobile-rn/lib/checkbox/AgreeItem.native", JSImport.Default)
  @js.native
  class default () extends AgreeItem
  /* static members */
  object default {
    
    @JSImport("antd-mobile-rn/lib/checkbox/AgreeItem.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/checkbox/AgreeItem.native", "default.defaultProps")
    @js.native
    def defaultProps: Styles = js.native
    @scala.inline
    def defaultProps_=(x: Styles): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait AgreeItem
    extends Component[AgreeItemNativeProps, js.Any, js.Any] {
    
    def handleClick(): Unit = js.native
  }
  
  trait AgreeItemNativeProps
    extends StObject
       with CheckboxPropsType {
    
    var checkboxStyle: js.UndefOr[StyleProp[ImageStyle]] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var styles: js.UndefOr[ICheckboxStyle] = js.undefined
  }
  object AgreeItemNativeProps {
    
    @scala.inline
    def apply(): AgreeItemNativeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AgreeItemNativeProps]
    }
    
    @scala.inline
    implicit class AgreeItemNativePropsMutableBuilder[Self <: AgreeItemNativeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckboxStyle(value: StyleProp[ImageStyle]): Self = StObject.set(x, "checkboxStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckboxStyleNull: Self = StObject.set(x, "checkboxStyle", null)
      
      @scala.inline
      def setCheckboxStyleUndefined: Self = StObject.set(x, "checkboxStyle", js.undefined)
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setStyles(value: ICheckboxStyle): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
}
