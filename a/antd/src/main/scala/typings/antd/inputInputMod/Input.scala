package typings.antd.inputInputMod

import typings.antd.anon.AutoComplete
import typings.antd.configProviderContextMod.ConfigConsumerProps
import typings.antd.configProviderContextMod.DirectionType
import typings.antd.configProviderSizeContextMod.SizeType
import typings.react.mod.ChangeEvent
import typings.react.mod.Component
import typings.react.mod.FocusEventHandler
import typings.react.mod.KeyboardEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Input
  extends Component[InputProps, InputState, js.Any] {
  
  def blur(): Unit = js.native
  
  def clearPasswordValueAttribute(): Unit = js.native
  
  var clearableInput: typings.antd.clearableLabeledInputMod.default = js.native
  
  @JSName("componentDidMount")
  def componentDidMount_MInput(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MInput(): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MInput(): Unit = js.native
  
  var direction: DirectionType = js.native
  
  def focus(): Unit = js.native
  
  @JSName("getSnapshotBeforeUpdate")
  def getSnapshotBeforeUpdate_MInput(prevProps: InputProps): Null = js.native
  
  def handleChange(e: ChangeEvent[HTMLInputElement]): Unit = js.native
  
  def handleKeyDown(e: KeyboardEvent[HTMLInputElement]): Unit = js.native
  
  def handleReset(e: typings.react.mod.MouseEvent[HTMLElement, MouseEvent]): Unit = js.native
  
  var input: HTMLInputElement = js.native
  
  var onBlur: FocusEventHandler[HTMLInputElement] = js.native
  
  var onFocus: FocusEventHandler[HTMLInputElement] = js.native
  
  var removePasswordTimeout: Double = js.native
  
  def renderComponent(hasGetPrefixClsDirectionInput: ConfigConsumerProps): Element = js.native
  
  def renderInput(prefixCls: String, size: js.UndefOr[SizeType], bordered: Boolean): Element = js.native
  def renderInput(prefixCls: String, size: js.UndefOr[SizeType], bordered: Boolean, input: js.UndefOr[AutoComplete]): Element = js.native
  
  def saveClearableInput(input: typings.antd.clearableLabeledInputMod.default): Unit = js.native
  
  def saveInput(input: HTMLInputElement): Unit = js.native
  
  def select(): Unit = js.native
  
  def setValue(value: String): Unit = js.native
  def setValue(value: String, callback: js.Function0[Unit]): Unit = js.native
}
