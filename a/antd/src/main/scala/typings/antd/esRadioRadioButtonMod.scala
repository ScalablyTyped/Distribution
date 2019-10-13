package typings.antd

import typings.antd.esCheckboxCheckboxMod.AbstractCheckboxProps
import typings.antd.esConfigDashProviderMod.ConfigConsumerProps
import typings.antd.esRadioInterfaceMod.RadioChangeEvent
import typings.antd.esRadioRadioButtonMod.RadioButton
import typings.antd.esRadioRadioButtonMod.RadioButtonProps
import typings.react.reactMod.Component
import typings.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/es/radio/radioButton", JSImport.Namespace)
@js.native
object esRadioRadioButtonMod extends js.Object {
  @js.native
  trait RadioButton
    extends Component[RadioButtonProps, js.Any, js.Any] {
    def renderRadioButton(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
  }
  
  @js.native
  class default () extends RadioButton
  
  /* static members */
  @js.native
  object default extends js.Object {
    var contextTypes: Anon_RadioGroup = js.native
  }
  
  type RadioButtonProps = AbstractCheckboxProps[RadioChangeEvent]
}

