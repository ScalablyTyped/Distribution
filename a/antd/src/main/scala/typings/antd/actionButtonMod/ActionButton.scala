package typings.antd.actionButtonMod

import typings.antd.AnonLoading
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionButton
  extends Component[ActionButtonProps, ActionButtonState, js.Any] {
  var clicked: Boolean = js.native
  @JSName("state")
  var state_ActionButton: AnonLoading = js.native
  var timeoutId: Double = js.native
  @JSName("componentDidMount")
  def componentDidMount_MActionButton(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MActionButton(): Unit = js.native
  def handlePromiseOnOk(): Unit = js.native
  def handlePromiseOnOk(returnValueOfOnOk: js.Thenable[_]): Unit = js.native
  def onClick(): Unit = js.native
}

