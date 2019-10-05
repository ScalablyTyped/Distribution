package typings.antd.esInputPasswordMod

import typings.react.reactMod.Component
import typings.react.reactMod.Global.JSX.Element
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
  def getIcon(): Element = js.native
  def onChange(): Unit = js.native
  def saveInput(instance: typings.antd.esInputInputMod.default): Unit = js.native
  def select(): Unit = js.native
}

