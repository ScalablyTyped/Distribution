package typings.antd.libRadioRadioMod

import typings.antd.libConfigDashProviderMod.ConfigConsumerProps
import typings.antd.libRadioInterfaceMod.RadioChangeEvent
import typings.antd.libRadioInterfaceMod.RadioGroupContext
import typings.antd.libRadioInterfaceMod.RadioProps
import typings.react.reactMod.Component
import typings.react.reactMod.Global.JSXNs.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

