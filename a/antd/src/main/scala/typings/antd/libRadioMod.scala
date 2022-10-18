package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.libRadioInterfaceMod.RadioGroupProps
import typings.antd.libRadioInterfaceMod.RadioProps
import typings.antd.libRadioRadioButtonMod.RadioButtonProps
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.MemoExoticComponent
import typings.react.mod.RefAttributes
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRadioMod extends Shortcut {
  
  @JSImport("antd/lib/radio", JSImport.Default)
  @js.native
  val default: CompoundedComponent = js.native
  
  @JSImport("antd/lib/radio", "Button")
  @js.native
  val Button: ForwardRefExoticComponent[RadioButtonProps & RefAttributes[Any]] = js.native
  
  @JSImport("antd/lib/radio", "Group")
  @js.native
  val Group: MemoExoticComponent[ForwardRefExoticComponent[RadioGroupProps & RefAttributes[HTMLDivElement]]] = js.native
  
  @js.native
  trait CompoundedComponent
    extends StObject
       with ForwardRefExoticComponent[RadioProps & RefAttributes[HTMLElement]] {
    
    var Button: ForwardRefExoticComponent[RadioButtonProps & RefAttributes[Any]] = js.native
    
    var Group: MemoExoticComponent[ForwardRefExoticComponent[RadioGroupProps & RefAttributes[HTMLDivElement]]] = js.native
  }
  
  type _To = CompoundedComponent
  
  /* This means you don't have to write `default`, but can instead just say `libRadioMod.foo` */
  override def _to: CompoundedComponent = default
}
