package typings.antDesignReactNative

import typings.antDesignReactNative.libStyleMod.Theme
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSwitchStyleMod {
  
  @JSImport("@ant-design/react-native/lib/switch/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(theme: Theme): SwitchStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(theme.asInstanceOf[js.Any]).asInstanceOf[SwitchStyle]
  
  trait SwitchStyle extends StObject {
    
    var switch: ViewStyle
    
    var switch_checked: ViewStyle
    
    var switch_checked_disabled: ViewStyle
    
    var switch_handle: ViewStyle
    
    var switch_handle_checked: ViewStyle
    
    var switch_handle_disabled: ViewStyle
    
    var switch_handle_unchecked: ViewStyle
    
    var switch_inner: ViewStyle
    
    var switch_inner_checked: ViewStyle
    
    var switch_inner_unchecked: ViewStyle
    
    var switch_unchecked: ViewStyle
    
    var switch_unchecked_disabled: ViewStyle
  }
  object SwitchStyle {
    
    inline def apply(
      switch: ViewStyle,
      switch_checked: ViewStyle,
      switch_checked_disabled: ViewStyle,
      switch_handle: ViewStyle,
      switch_handle_checked: ViewStyle,
      switch_handle_disabled: ViewStyle,
      switch_handle_unchecked: ViewStyle,
      switch_inner: ViewStyle,
      switch_inner_checked: ViewStyle,
      switch_inner_unchecked: ViewStyle,
      switch_unchecked: ViewStyle,
      switch_unchecked_disabled: ViewStyle
    ): SwitchStyle = {
      val __obj = js.Dynamic.literal(switch = switch.asInstanceOf[js.Any], switch_checked = switch_checked.asInstanceOf[js.Any], switch_checked_disabled = switch_checked_disabled.asInstanceOf[js.Any], switch_handle = switch_handle.asInstanceOf[js.Any], switch_handle_checked = switch_handle_checked.asInstanceOf[js.Any], switch_handle_disabled = switch_handle_disabled.asInstanceOf[js.Any], switch_handle_unchecked = switch_handle_unchecked.asInstanceOf[js.Any], switch_inner = switch_inner.asInstanceOf[js.Any], switch_inner_checked = switch_inner_checked.asInstanceOf[js.Any], switch_inner_unchecked = switch_inner_unchecked.asInstanceOf[js.Any], switch_unchecked = switch_unchecked.asInstanceOf[js.Any], switch_unchecked_disabled = switch_unchecked_disabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[SwitchStyle]
    }
    
    extension [Self <: SwitchStyle](x: Self) {
      
      inline def setSwitch(value: ViewStyle): Self = StObject.set(x, "switch", value.asInstanceOf[js.Any])
      
      inline def setSwitch_checked(value: ViewStyle): Self = StObject.set(x, "switch_checked", value.asInstanceOf[js.Any])
      
      inline def setSwitch_checked_disabled(value: ViewStyle): Self = StObject.set(x, "switch_checked_disabled", value.asInstanceOf[js.Any])
      
      inline def setSwitch_handle(value: ViewStyle): Self = StObject.set(x, "switch_handle", value.asInstanceOf[js.Any])
      
      inline def setSwitch_handle_checked(value: ViewStyle): Self = StObject.set(x, "switch_handle_checked", value.asInstanceOf[js.Any])
      
      inline def setSwitch_handle_disabled(value: ViewStyle): Self = StObject.set(x, "switch_handle_disabled", value.asInstanceOf[js.Any])
      
      inline def setSwitch_handle_unchecked(value: ViewStyle): Self = StObject.set(x, "switch_handle_unchecked", value.asInstanceOf[js.Any])
      
      inline def setSwitch_inner(value: ViewStyle): Self = StObject.set(x, "switch_inner", value.asInstanceOf[js.Any])
      
      inline def setSwitch_inner_checked(value: ViewStyle): Self = StObject.set(x, "switch_inner_checked", value.asInstanceOf[js.Any])
      
      inline def setSwitch_inner_unchecked(value: ViewStyle): Self = StObject.set(x, "switch_inner_unchecked", value.asInstanceOf[js.Any])
      
      inline def setSwitch_unchecked(value: ViewStyle): Self = StObject.set(x, "switch_unchecked", value.asInstanceOf[js.Any])
      
      inline def setSwitch_unchecked_disabled(value: ViewStyle): Self = StObject.set(x, "switch_unchecked_disabled", value.asInstanceOf[js.Any])
    }
  }
}
