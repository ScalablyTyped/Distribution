package typings.antd.passwordMod

import typings.antd.configProviderContextMod.ConfigConsumerProps
import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.react.mod.global.JSX.Element
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Password
  extends Component[PasswordProps, PasswordState, js.Any] {
  var input: HTMLInputElement = js.native
  def blur(): Unit = js.native
  def focus(): Unit = js.native
  def getIcon(prefixCls: String): ReactElement = js.native
  def onVisibleChange(): Unit = js.native
  def renderPassword(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
  def saveInput(instance: typings.antd.inputInputMod.default): Unit = js.native
  def select(): Unit = js.native
}

