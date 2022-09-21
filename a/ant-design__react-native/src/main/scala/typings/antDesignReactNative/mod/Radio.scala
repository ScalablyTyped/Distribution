package typings.antDesignReactNative.mod

import org.scalablytyped.runtime.Shortcut
import typings.antDesignReactNative.radioItemMod.default
import typings.antDesignReactNative.radioMod.CompoundedComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Radio extends Shortcut {
  
  @JSImport("@ant-design/react-native", "Radio")
  @js.native
  val ^ : CompoundedComponent = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@ant-design/react-native", "Radio.RadioItem")
  @js.native
  open class RadioItem () extends default
  
  type _To = CompoundedComponent
  
  /* This means you don't have to write `^`, but can instead just say `Radio.foo` */
  override def _to: CompoundedComponent = ^
}
