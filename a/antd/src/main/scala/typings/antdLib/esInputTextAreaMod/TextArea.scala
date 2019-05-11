package typings
package antdLib.esInputTextAreaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextArea
  extends reactLib.reactMod.Component[TextAreaProps, TextAreaState, js.Any] {
  var nextFrameActionId: scala.Double = js.native
  @JSName("state")
  var state_TextArea: antdLib.Anon_TextareaStyles = js.native
  var textAreaRef: js.Any = js.native
  def blur(): scala.Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MTextArea(): scala.Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MTextArea(prevProps: TextAreaProps): scala.Unit = js.native
  def focus(): scala.Unit = js.native
  def handleKeyDown(e: reactLib.reactMod.KeyboardEvent[stdLib.HTMLTextAreaElement]): scala.Unit = js.native
  def handleTextareaChange(e: reactLib.reactMod.ChangeEvent[stdLib.HTMLTextAreaElement]): scala.Unit = js.native
  def renderTextArea(hasGetPrefixCls: antdLib.esConfigDashProviderMod.ConfigConsumerProps): reactLib.reactMod.Global.JSXNs.Element = js.native
  def resizeOnNextFrame(): scala.Unit = js.native
  def resizeTextarea(): scala.Unit = js.native
  def saveTextAreaRef(textArea: stdLib.HTMLTextAreaElement): scala.Unit = js.native
}

