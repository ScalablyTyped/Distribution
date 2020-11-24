package typings.antd

import typings.antd.radioButtonMod.RadioButtonProps
import typings.antd.radioInterfaceMod.RadioGroupProps
import typings.antd.radioInterfaceMod.RadioProps
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.MemoExoticComponent
import typings.react.mod.RefAttributes
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd/lib/radio", JSImport.Namespace)
@js.native
object radioMod extends js.Object {
  
  val Button: ForwardRefExoticComponent[RadioButtonProps with RefAttributes[_]] = js.native
  
  val Group: MemoExoticComponent[ForwardRefExoticComponent[RadioGroupProps with RefAttributes[HTMLDivElement]]] = js.native
  
  val default: CompoundedComponent = js.native
  
  @js.native
  trait CompoundedComponent extends ForwardRefExoticComponent[RadioProps with RefAttributes[HTMLElement]] {
    
    var Button: ForwardRefExoticComponent[RadioButtonProps with RefAttributes[_]] = js.native
    
    var Group: MemoExoticComponent[ForwardRefExoticComponent[RadioGroupProps with RefAttributes[HTMLDivElement]]] = js.native
  }
}
