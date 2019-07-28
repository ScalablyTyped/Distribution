package typings.antd.esRadioGroupMod

import typings.antd.Anon_RadioGroupAnonDisabledEv
import typings.antd.esConfigDashProviderMod.ConfigConsumerProps
import typings.antd.esRadioInterfaceMod.RadioChangeEvent
import typings.antd.esRadioInterfaceMod.RadioGroupProps
import typings.antd.esRadioInterfaceMod.RadioGroupState
import typings.react.reactMod.Component
import typings.react.reactMod.Global.JSXNs.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RadioGroup
  extends Component[RadioGroupProps, RadioGroupState, js.Any] {
  def getChildContext(): Anon_RadioGroupAnonDisabledEv = js.native
  def onRadioChange(ev: RadioChangeEvent): Unit = js.native
  def renderGroup(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MRadioGroup(nextProps: RadioGroupProps, nextState: RadioGroupState): Boolean = js.native
}

