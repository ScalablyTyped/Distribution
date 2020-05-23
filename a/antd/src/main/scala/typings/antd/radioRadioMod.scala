package typings.antd

import typings.antd.anon.Type
import typings.antd.anon.TypeofRadioGroup
import typings.antd.configProviderContextMod.ConfigConsumerProps
import typings.antd.radioButtonMod.RadioButtonProps
import typings.antd.radioInterfaceMod.RadioChangeEvent
import typings.antd.radioInterfaceMod.RadioGroupContextProps
import typings.antd.radioInterfaceMod.RadioProps
import typings.react.mod.Component
import typings.react.mod.Context
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/radio/radio", JSImport.Namespace)
@js.native
object radioRadioMod extends js.Object {
  @js.native
  trait Radio
    extends Component[RadioProps, js.Object, js.Any] {
    var rcCheckbox: js.Any = js.native
    def blur(): Unit = js.native
    def focus(): Unit = js.native
    def onChange(e: RadioChangeEvent): Unit = js.native
    def renderRadio(hasGetPrefixClsDirection: ConfigConsumerProps): Element = js.native
    def saveCheckbox(node: js.Any): Unit = js.native
  }
  
  @js.native
  class default () extends Radio
  
  /* static members */
  @js.native
  object default extends js.Object {
    var Button: ForwardRefExoticComponent[RadioButtonProps with RefAttributes[_]] = js.native
    var Group: TypeofRadioGroup = js.native
    var contextType: Context[RadioGroupContextProps | Null] = js.native
    var defaultProps: Type = js.native
  }
  
}

