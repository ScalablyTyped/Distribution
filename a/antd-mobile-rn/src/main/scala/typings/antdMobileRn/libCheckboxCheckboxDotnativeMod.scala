package typings.antdMobileRn

import typings.antdMobileRn.anon.Styles
import typings.antdMobileRn.libCheckboxPropsTypeMod.CheckboxPropsType
import typings.antdMobileRn.libCheckboxStyleIndexDotnativeMod.ICheckboxStyle
import typings.react.mod.Component
import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.StyleProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCheckboxCheckboxDotnativeMod {
  
  @JSImport("antd-mobile-rn/lib/checkbox/Checkbox.native", JSImport.Default)
  @js.native
  open class default protected () extends Checkbox {
    def this(props: CheckboxPropsType, context: Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("antd-mobile-rn/lib/checkbox/Checkbox.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/checkbox/Checkbox.native", "default.AgreeItem")
    @js.native
    def AgreeItem: Any = js.native
    inline def AgreeItem_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AgreeItem")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/checkbox/Checkbox.native", "default.CheckboxItem")
    @js.native
    def CheckboxItem: Any = js.native
    inline def CheckboxItem_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CheckboxItem")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/checkbox/Checkbox.native", "default.defaultProps")
    @js.native
    def defaultProps: Styles = js.native
    inline def defaultProps_=(x: Styles): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Checkbox extends Component[ICheckboxNativeProps, Any, Any] {
    
    @JSName("componentWillReceiveProps")
    def componentWillReceiveProps_MCheckbox(nextProps: CheckboxPropsType): Unit = js.native
    
    def handleClick(): Unit = js.native
  }
  
  trait ICheckboxNativeProps
    extends StObject
       with CheckboxPropsType {
    
    var style: js.UndefOr[StyleProp[ImageStyle]] = js.undefined
    
    var styles: js.UndefOr[ICheckboxStyle] = js.undefined
  }
  object ICheckboxNativeProps {
    
    inline def apply(): ICheckboxNativeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICheckboxNativeProps]
    }
    
    extension [Self <: ICheckboxNativeProps](x: Self) {
      
      inline def setStyle(value: StyleProp[ImageStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStyles(value: ICheckboxStyle): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
}
