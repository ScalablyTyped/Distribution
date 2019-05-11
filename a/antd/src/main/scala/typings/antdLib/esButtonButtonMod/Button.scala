package typings
package antdLib.esButtonButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Button
  extends reactLib.reactMod.Component[ButtonProps, ButtonState, js.Any] {
  var buttonNode: js.Any = js.native
  var delayTimeout: js.Any = js.native
  @JSName("handleClick")
  var handleClick_Original: reactLib.reactMod.MouseEventHandler[stdLib.HTMLButtonElement | stdLib.HTMLAnchorElement] = js.native
  @JSName("componentDidMount")
  def componentDidMount_MButton(): scala.Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MButton(prevProps: ButtonProps): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MButton(): scala.Unit = js.native
  def fixTwoCNChar(): scala.Unit = js.native
  def handleClick(
    event: reactLib.reactMod.MouseEvent[stdLib.HTMLButtonElement | stdLib.HTMLAnchorElement, reactLib.NativeMouseEvent]
  ): scala.Unit = js.native
  def isNeedInserted(): scala.Boolean = js.native
  def renderButton(hasGetPrefixClsAutoInsertSpaceInButton: antdLib.esConfigDashProviderMod.ConfigConsumerProps): reactLib.reactMod.Global.JSXNs.Element = js.native
  def saveButtonRef(): scala.Unit = js.native
  def saveButtonRef(node: stdLib.HTMLElement): scala.Unit = js.native
}

