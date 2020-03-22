package typings.antd.passwordMod

import typings.antDesignIcons.componentsAntdIconMod.AntdIconProps
import typings.react.mod.Component
import typings.react.mod.FunctionComponentElement
import typings.react.mod.RefAttributes
import typings.std.HTMLInputElement
import typings.std.HTMLSpanElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Password
  extends Component[PasswordProps, PasswordState, js.Any] {
  var input: HTMLInputElement = js.native
  def blur(): Unit = js.native
  def focus(): Unit = js.native
  def getIcon(): FunctionComponentElement[AntdIconProps with RefAttributes[HTMLSpanElement]] = js.native
  def onVisibleChange(): Unit = js.native
  def saveInput(instance: typings.antd.inputInputMod.default): Unit = js.native
  def select(): Unit = js.native
}

