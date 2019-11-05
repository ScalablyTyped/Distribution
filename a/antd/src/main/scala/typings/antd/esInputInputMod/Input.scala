package typings.antd.esInputInputMod

import typings.antd.esConfigDashProviderContextMod.ConfigConsumerProps
import typings.react.reactMod.ChangeEvent
import typings.react.reactMod.Component
import typings.react.reactMod.KeyboardEvent
import typings.react.reactMod._Global_.JSX.Element
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Input
  extends Component[InputProps, InputState, js.Any] {
  var clearableInput: typings.antd.esInputClearableLabeledInputMod.default = js.native
  var input: HTMLInputElement = js.native
  def blur(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MInput(): Unit = js.native
  def focus(): Unit = js.native
  @JSName("getSnapshotBeforeUpdate")
  def getSnapshotBeforeUpdate_MInput(prevProps: InputProps): Null = js.native
  def handleChange(e: ChangeEvent[HTMLInputElement]): Unit = js.native
  def handleKeyDown(e: KeyboardEvent[HTMLInputElement]): Unit = js.native
  def handleReset(e: typings.react.reactMod.MouseEvent[HTMLElement, MouseEvent]): Unit = js.native
  def renderComponent(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
  def renderInput(prefixCls: String): Element = js.native
  def saveClearableInput(input: typings.antd.esInputClearableLabeledInputMod.default): Unit = js.native
  def saveInput(input: HTMLInputElement): Unit = js.native
  def select(): Unit = js.native
  def setValue(value: String): Unit = js.native
  def setValue(value: String, callback: js.Function0[Unit]): Unit = js.native
}

