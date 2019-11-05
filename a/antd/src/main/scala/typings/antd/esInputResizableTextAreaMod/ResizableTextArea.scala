package typings.antd.esInputResizableTextAreaMod

import typings.antd.esInputTextAreaMod.TextAreaProps
import typings.react.reactMod.Component
import typings.react.reactMod._Global_.JSX.Element
import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResizableTextArea
  extends Component[TextAreaProps, TextAreaState, js.Any] {
  var nextFrameActionId: Double = js.native
  var resizeFrameId: Double = js.native
  var textArea: HTMLTextAreaElement = js.native
  @JSName("componentDidMount")
  def componentDidMount_MResizableTextArea(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MResizableTextArea(prevProps: TextAreaProps): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MResizableTextArea(): Unit = js.native
  def renderTextArea(): Element = js.native
  def resizeOnNextFrame(): Unit = js.native
  def resizeTextarea(): Unit = js.native
  def saveTextArea(textArea: HTMLTextAreaElement): Unit = js.native
}

