package typings.antd

import typings.antd.radioButtonMod.RadioButtonProps
import typings.antd.radioInterfaceMod.RadioGroupProps
import typings.antd.radioInterfaceMod.RadioProps
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.NamedExoticComponent
import typings.react.mod.RefAttributes
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/radio", JSImport.Namespace)
@js.native
object radioMod extends js.Object {
  @js.native
  trait CompoundedComponent extends ForwardRefExoticComponent[RadioProps with RefAttributes[HTMLElement]] {
    var Button: ForwardRefExoticComponent[RadioButtonProps with RefAttributes[_]] = js.native
    var Group: NamedExoticComponent[RadioGroupProps] = js.native
  }
  
  val Button: ForwardRefExoticComponent[RadioButtonProps with RefAttributes[_]] = js.native
  val Group: NamedExoticComponent[RadioGroupProps] = js.native
  val default: CompoundedComponent = js.native
}

