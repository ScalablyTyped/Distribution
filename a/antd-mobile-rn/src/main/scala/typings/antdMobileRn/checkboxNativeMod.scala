package typings.antdMobileRn

import typings.antdMobileRn.anon.Styles
import typings.antdMobileRn.checkboxPropsTypeMod.CheckboxPropsType
import typings.antdMobileRn.checkboxStyleIndexNativeMod.ICheckboxStyle
import typings.react.mod.Component
import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.StyleProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkboxNativeMod {
  
  @JSImport("antd-mobile-rn/lib/checkbox/Checkbox.native", JSImport.Default)
  @js.native
  class default protected () extends Checkbox {
    def this(props: CheckboxPropsType, context: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("antd-mobile-rn/lib/checkbox/Checkbox.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/checkbox/Checkbox.native", "default.AgreeItem")
    @js.native
    def AgreeItem: js.Any = js.native
    @scala.inline
    def AgreeItem_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AgreeItem")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/checkbox/Checkbox.native", "default.CheckboxItem")
    @js.native
    def CheckboxItem: js.Any = js.native
    @scala.inline
    def CheckboxItem_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CheckboxItem")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/checkbox/Checkbox.native", "default.defaultProps")
    @js.native
    def defaultProps: Styles = js.native
    @scala.inline
    def defaultProps_=(x: Styles): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Checkbox
    extends Component[ICheckboxNativeProps, js.Any, js.Any] {
    
    @JSName("componentWillReceiveProps")
    def componentWillReceiveProps_MCheckbox(nextProps: CheckboxPropsType): Unit = js.native
    
    def handleClick(): Unit = js.native
  }
  
  @js.native
  trait ICheckboxNativeProps extends CheckboxPropsType {
    
    var style: js.UndefOr[StyleProp[ImageStyle]] = js.native
    
    var styles: js.UndefOr[ICheckboxStyle] = js.native
  }
  object ICheckboxNativeProps {
    
    @scala.inline
    def apply(): ICheckboxNativeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICheckboxNativeProps]
    }
    
    @scala.inline
    implicit class ICheckboxNativePropsMutableBuilder[Self <: ICheckboxNativeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStyle(value: StyleProp[ImageStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
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
