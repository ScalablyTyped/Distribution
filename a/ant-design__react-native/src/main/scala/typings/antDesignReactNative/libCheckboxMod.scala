package typings.antDesignReactNative

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import typings.antDesignReactNative.anon.CheckboxPropsrefRefCheckb
import typings.antDesignReactNative.libCheckboxCheckboxItemMod.default
import typings.antDesignReactNative.libCheckboxCheckboxMod.CheckboxProps
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCheckboxMod {
  
  object default extends Shortcut {
    
    @JSImport("@ant-design/react-native/lib/checkbox", JSImport.Default)
    @js.native
    val ^ : CompoundedComponent = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@ant-design/react-native/lib/checkbox", "default.CheckboxItem")
    @js.native
    open class CheckboxItem ()
      extends typings.antDesignReactNative.libCheckboxCheckboxItemMod.default
    
    type _To = CompoundedComponent
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: CompoundedComponent = ^
  }
  
  @js.native
  trait CompoundedComponent
    extends StObject
       with ForwardRefExoticComponent[CheckboxPropsrefRefCheckb] {
    
    var AgreeItem: js.Function1[/* props */ CheckboxProps, Element] = js.native
    
    var CheckboxItem: Instantiable0[default] = js.native
    
    var __ANTM_CHECKBOX: Boolean = js.native
    
    def onPress(): Unit = js.native
  }
}
