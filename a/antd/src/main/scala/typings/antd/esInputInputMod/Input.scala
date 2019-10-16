package typings.antd.esInputInputMod

import typings.antd.esConfigDashProviderContextMod.ConfigConsumerProps
import typings.react.reactMod.ChangeEvent
import typings.react.reactMod.Component
import typings.react.reactMod.KeyboardEvent
import typings.react.reactMod.ReactElement
import typings.react.reactMod._Global_.JSX.Element
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Input
  extends Component[InputProps, js.Any, js.Any] {
  var input: HTMLInputElement = js.native
  def blur(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MInput(): Unit = js.native
  def focus(): Unit = js.native
  def getInputClassName(prefixCls: String): String = js.native
  @JSName("getSnapshotBeforeUpdate")
  def getSnapshotBeforeUpdate_MInput(prevProps: InputProps): Null = js.native
  def handleChange(e: ChangeEvent[HTMLInputElement]): Unit = js.native
  def handleKeyDown(e: KeyboardEvent[HTMLInputElement]): Unit = js.native
  def handleReset(e: typings.react.reactMod.MouseEvent[HTMLElement, MouseEvent]): Unit = js.native
  def renderClearIcon(prefixCls: String): Element | Null = js.native
  def renderComponent(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
  def renderInput(prefixCls: String): Element = js.native
  def renderLabeledIcon(prefixCls: String, children: ReactElement): Element = js.native
  def renderLabeledInput(prefixCls: String, children: ReactElement): Element = js.native
  def renderSuffix(prefixCls: String): Element | Null = js.native
  def saveInput(node: HTMLInputElement): Unit = js.native
  def select(): Unit = js.native
  def setValue(value: String, e: ChangeEvent[HTMLInputElement]): Unit = js.native
  def setValue(value: String, e: ChangeEvent[HTMLInputElement], callback: js.Function0[Unit]): Unit = js.native
  def setValue(value: String, e: typings.react.reactMod.MouseEvent[HTMLElement, MouseEvent]): Unit = js.native
  def setValue(
    value: String,
    e: typings.react.reactMod.MouseEvent[HTMLElement, MouseEvent],
    callback: js.Function0[Unit]
  ): Unit = js.native
}

