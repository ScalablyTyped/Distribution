package typings.antd

import typings.antd.esConfigDashProviderMod.ConfigConsumerProps
import typings.antd.esRadioGroupMod.RadioGroup
import typings.antd.esRadioInterfaceMod.RadioChangeEvent
import typings.antd.esRadioInterfaceMod.RadioGroupProps
import typings.antd.esRadioInterfaceMod.RadioGroupState
import typings.react.reactMod.Component
import typings.react.reactMod.Global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/es/radio/group", JSImport.Namespace)
@js.native
object esRadioGroupMod extends js.Object {
  @js.native
  trait RadioGroup
    extends Component[RadioGroupProps, RadioGroupState, js.Any] {
    def getChildContext(): Anon_RadioGroupAnonDisabledEv = js.native
    def onRadioChange(ev: RadioChangeEvent): Unit = js.native
    def renderGroup(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MRadioGroup(nextProps: RadioGroupProps, nextState: RadioGroupState): Boolean = js.native
  }
  
  @js.native
  class default protected () extends RadioGroup {
    def this(props: RadioGroupProps) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var childContextTypes: Anon_RadioGroup = js.native
    var defaultProps: Anon_ButtonStyle = js.native
    def getDerivedStateFromProps(nextProps: RadioGroupProps): Anon_ValueAny | Null = js.native
  }
  
}

