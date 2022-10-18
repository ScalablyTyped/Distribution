package typings.antDesignReactNative.mod

import org.scalablytyped.runtime.Shortcut
import typings.antDesignReactNative.libCheckboxCheckboxItemMod.default
import typings.antDesignReactNative.libCheckboxMod.CompoundedComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Checkbox extends Shortcut {
  
  @JSImport("@ant-design/react-native", "Checkbox")
  @js.native
  val ^ : CompoundedComponent = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@ant-design/react-native", "Checkbox.CheckboxItem")
  @js.native
  open class CheckboxItem () extends default
  
  type _To = CompoundedComponent
  
  /* This means you don't have to write `^`, but can instead just say `Checkbox.foo` */
  override def _to: CompoundedComponent = ^
}
