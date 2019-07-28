package typings.antd.libRadioGroupMod

import typings.antd.Anon_RadioGroupAnonDisabledEvName
import typings.antd.libConfigDashProviderMod.ConfigConsumerProps
import typings.antd.libRadioInterfaceMod.RadioChangeEvent
import typings.antd.libRadioInterfaceMod.RadioGroupProps
import typings.antd.libRadioInterfaceMod.RadioGroupState
import typings.react.reactMod.Component
import typings.react.reactMod.Global.JSXNs.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RadioGroup
  extends Component[RadioGroupProps, RadioGroupState, js.Any] {
  def getChildContext(): Anon_RadioGroupAnonDisabledEvName = js.native
  def onRadioChange(ev: RadioChangeEvent): Unit = js.native
  def renderGroup(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MRadioGroup(nextProps: RadioGroupProps, nextState: RadioGroupState): Boolean = js.native
}

