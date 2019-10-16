package typings.antd.esInputTextAreaMod

import typings.antd.Anon_Resizing
import typings.antd.esConfigDashProviderContextMod.ConfigConsumerProps
import typings.react.reactMod.ChangeEvent
import typings.react.reactMod.Component
import typings.react.reactMod.KeyboardEvent
import typings.react.reactMod._Global_.JSX.Element
import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextArea
  extends Component[TextAreaProps, TextAreaState, js.Any] {
  var nextFrameActionId: Double = js.native
  var resizeFrameId: Double = js.native
  @JSName("state")
  var state_TextArea: Anon_Resizing = js.native
  var textAreaRef: js.Any = js.native
  def blur(): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MTextArea(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MTextArea(prevProps: TextAreaProps): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MTextArea(): Unit = js.native
  def focus(): Unit = js.native
  def handleKeyDown(e: KeyboardEvent[HTMLTextAreaElement]): Unit = js.native
  def handleTextareaChange(e: ChangeEvent[HTMLTextAreaElement]): Unit = js.native
  def renderTextArea(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
  def resizeOnNextFrame(): Unit = js.native
  def resizeTextarea(): Unit = js.native
  def saveTextAreaRef(textArea: HTMLTextAreaElement): Unit = js.native
}

