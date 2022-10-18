package typings.antDesignReactNative

import org.scalablytyped.runtime.Shortcut
import typings.antDesignReactNative.libCheckboxPropsTypeMod.CheckboxPropsType
import typings.antDesignReactNative.libCheckboxStyleMod.CheckboxStyle
import typings.antDesignReactNative.libStyleMod.WithThemeStyles
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactNative.mod.AccessibilityProps
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCheckboxCheckboxMod extends Shortcut {
  
  @JSImport("@ant-design/react-native/lib/checkbox/Checkbox", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[CheckboxProps & RefAttributes[Any]] = js.native
  
  trait CheckboxProps
    extends StObject
       with CheckboxPropsType
       with WithThemeStyles[CheckboxStyle]
       with AccessibilityProps {
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object CheckboxProps {
    
    inline def apply(): CheckboxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckboxProps]
    }
    
    extension [Self <: CheckboxProps](x: Self) {
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait RefCheckboxProps extends StObject {
    
    def onPress(): Unit
  }
  object RefCheckboxProps {
    
    inline def apply(onPress: () => Unit): RefCheckboxProps = {
      val __obj = js.Dynamic.literal(onPress = js.Any.fromFunction0(onPress))
      __obj.asInstanceOf[RefCheckboxProps]
    }
    
    extension [Self <: RefCheckboxProps](x: Self) {
      
      inline def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
    }
  }
  
  type _To = ForwardRefExoticComponent[CheckboxProps & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `libCheckboxCheckboxMod.foo` */
  override def _to: ForwardRefExoticComponent[CheckboxProps & RefAttributes[Any]] = default
}
