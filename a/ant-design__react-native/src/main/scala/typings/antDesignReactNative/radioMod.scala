package typings.antDesignReactNative

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import typings.antDesignReactNative.anon.RadioPropsrefRefRadioForw
import typings.antDesignReactNative.radioGroupMod.RadioGroupProps
import typings.antDesignReactNative.radioItemMod.default
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.MemoExoticComponent
import typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioMod {
  
  object default extends Shortcut {
    
    @JSImport("@ant-design/react-native/lib/radio", JSImport.Default)
    @js.native
    val ^ : CompoundedComponent = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@ant-design/react-native/lib/radio", "default.RadioItem")
    @js.native
    open class RadioItem ()
      extends typings.antDesignReactNative.radioItemMod.default
    
    type _To = CompoundedComponent
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: CompoundedComponent = ^
  }
  
  @js.native
  trait CompoundedComponent
    extends StObject
       with ForwardRefExoticComponent[RadioPropsrefRefRadioForw] {
    
    var Group: MemoExoticComponent[ForwardRefExoticComponent[RadioGroupProps & RefAttributes[Any]]] = js.native
    
    var RadioItem: Instantiable0[default] = js.native
    
    var __ANTM_CHECKBOX: Boolean = js.native
    
    def onPress(): Unit = js.native
  }
}
