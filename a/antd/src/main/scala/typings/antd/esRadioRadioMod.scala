package typings.antd

import typings.antd.esConfigDashProviderMod.ConfigConsumerProps
import typings.antd.esRadioInterfaceMod.RadioChangeEvent
import typings.antd.esRadioInterfaceMod.RadioGroupContext
import typings.antd.esRadioInterfaceMod.RadioProps
import typings.antd.esRadioRadioMod.Radio
import typings.react.reactMod.Component
import typings.react.reactMod.Global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/es/radio/radio", JSImport.Namespace)
@js.native
object esRadioRadioMod extends js.Object {
  @js.native
  trait Radio
    extends Component[RadioProps, js.Object, js.Any] {
    var rcCheckbox: js.Any = js.native
    def blur(): Unit = js.native
    def focus(): Unit = js.native
    def onChange(e: RadioChangeEvent): Unit = js.native
    def renderRadio(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
    def saveCheckbox(node: js.Any): Unit = js.native
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MRadio(nextProps: RadioProps, nextState: js.Object, nextContext: RadioGroupContext): Boolean = js.native
  }
  
  @js.native
  class default () extends Radio
  
  /* static members */
  @js.native
  object default extends js.Object {
    var Button: TypeofClassRadioButton = js.native
    var Group: TypeofClassRadioGroup = js.native
    var contextTypes: Anon_RadioGroup = js.native
    var defaultProps: Anon_Type = js.native
  }
  
}

