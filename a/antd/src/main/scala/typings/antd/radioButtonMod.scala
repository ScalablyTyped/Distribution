package typings.antd

import typings.antd.checkboxCheckboxMod.AbstractCheckboxProps
import typings.antd.radioInterfaceMod.RadioChangeEvent
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/radio/radioButton", JSImport.Namespace)
@js.native
object radioButtonMod extends js.Object {
  val default: ForwardRefExoticComponent[RadioButtonProps with RefAttributes[_]] = js.native
  type RadioButtonProps = AbstractCheckboxProps[RadioChangeEvent]
}

