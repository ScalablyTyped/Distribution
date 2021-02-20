package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.radioButtonMod.RadioButtonProps
import typings.antd.radioInterfaceMod.RadioGroupProps
import typings.antd.radioInterfaceMod.RadioProps
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.MemoExoticComponent
import typings.react.mod.RefAttributes
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioMod extends Shortcut {
  
  @JSImport("antd/lib/radio", JSImport.Default)
  @js.native
  val default: CompoundedComponent = js.native
  
  @JSImport("antd/lib/radio", "Button")
  @js.native
  val Button: ForwardRefExoticComponent[RadioButtonProps with RefAttributes[_]] = js.native
  
  @JSImport("antd/lib/radio", "Group")
  @js.native
  val Group: MemoExoticComponent[ForwardRefExoticComponent[RadioGroupProps with RefAttributes[HTMLDivElement]]] = js.native
  
  @js.native
  trait CompoundedComponent extends ForwardRefExoticComponent[RadioProps with RefAttributes[HTMLElement]] {
    
    var Button: ForwardRefExoticComponent[RadioButtonProps with RefAttributes[_]] = js.native
    
    var Group: MemoExoticComponent[ForwardRefExoticComponent[RadioGroupProps with RefAttributes[HTMLDivElement]]] = js.native
  }
  
  type _To = CompoundedComponent
  
  /* This means you don't have to write `default`, but can instead just say `radioMod.foo` */
  override def _to: CompoundedComponent = default
}
