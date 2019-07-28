package typings.antd.libSwitchMod

import typings.antd.libConfigDashProviderMod.ConfigConsumerProps
import typings.react.reactMod.Component
import typings.react.reactMod.Global.JSXNs.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Switch
  extends Component[SwitchProps, js.Object, js.Any] {
  var rcSwitch: js.Any = js.native
  def blur(): Unit = js.native
  def focus(): Unit = js.native
  def renderSwitch(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
  def saveSwitch(node: js.Any): Unit = js.native
}

