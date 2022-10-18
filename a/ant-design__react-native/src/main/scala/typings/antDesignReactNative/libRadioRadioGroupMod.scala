package typings.antDesignReactNative

import org.scalablytyped.runtime.Shortcut
import typings.antDesignReactNative.libCheckboxStyleMod.CheckboxStyle
import typings.antDesignReactNative.libRadioPropsTypeMod.RadioGroupPropsType
import typings.antDesignReactNative.libStyleMod.WithThemeStyles
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.MemoExoticComponent
import typings.react.mod.RefAttributes
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRadioRadioGroupMod extends Shortcut {
  
  @JSImport("@ant-design/react-native/lib/radio/RadioGroup", JSImport.Default)
  @js.native
  val default: MemoExoticComponent[ForwardRefExoticComponent[RadioGroupProps & RefAttributes[Any]]] = js.native
  
  trait RadioGroupProps
    extends StObject
       with RadioGroupPropsType
       with WithThemeStyles[CheckboxStyle] {
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object RadioGroupProps {
    
    inline def apply(): RadioGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RadioGroupProps]
    }
    
    extension [Self <: RadioGroupProps](x: Self) {
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type _To = MemoExoticComponent[ForwardRefExoticComponent[RadioGroupProps & RefAttributes[Any]]]
  
  /* This means you don't have to write `default`, but can instead just say `libRadioRadioGroupMod.foo` */
  override def _to: MemoExoticComponent[ForwardRefExoticComponent[RadioGroupProps & RefAttributes[Any]]] = default
}
