package typings.antd

import typings.antd.libConfigDashProviderMod.ConfigConsumerProps
import typings.antd.libRadioGroupMod.RadioGroup
import typings.antd.libRadioInterfaceMod.RadioChangeEvent
import typings.antd.libRadioInterfaceMod.RadioGroupProps
import typings.antd.libRadioInterfaceMod.RadioGroupState
import typings.react.reactMod.Component
import typings.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/radio/group", JSImport.Namespace)
@js.native
object libRadioGroupMod extends js.Object {
  @js.native
  trait RadioGroup
    extends Component[RadioGroupProps, RadioGroupState, js.Any] {
    def getChildContext(): Anon_RadioGroupAnonDisabledEvName = js.native
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
    var defaultProps: Anon_ButtonStyleRadioGroupButtonStyle = js.native
    def getDerivedStateFromProps(nextProps: RadioGroupProps): Anon_ValueAny | Null = js.native
  }
  
}

