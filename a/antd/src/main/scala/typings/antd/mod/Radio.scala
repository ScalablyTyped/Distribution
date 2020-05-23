package typings.antd.mod

import typings.antd.anon.Type
import typings.antd.anon.TypeofRadioGroup
import typings.antd.radioButtonMod.RadioButtonProps
import typings.antd.radioInterfaceMod.RadioGroupContextProps
import typings.antd.radioMod.default
import typings.react.mod.Context
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd", "Radio")
@js.native
class Radio () extends default

/* static members */
@JSImport("antd", "Radio")
@js.native
object Radio extends js.Object {
  var Button: ForwardRefExoticComponent[RadioButtonProps with RefAttributes[_]] = js.native
  var Group: TypeofRadioGroup = js.native
  var contextType: Context[RadioGroupContextProps | Null] = js.native
  var defaultProps: Type = js.native
}

