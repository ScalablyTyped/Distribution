package typings.antd

import typings.antd.contextMod.ConfigConsumerProps
import typings.antd.radioInterfaceMod.RadioChangeEvent
import typings.antd.radioInterfaceMod.RadioGroupContext
import typings.antd.radioInterfaceMod.RadioProps
import typings.react.mod.Component
import typings.react.mod._Global_.JSX.Element
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
    var contextTypes: AnonRadioGroup = js.native
    var defaultProps: AnonType = js.native
  }
  
}

