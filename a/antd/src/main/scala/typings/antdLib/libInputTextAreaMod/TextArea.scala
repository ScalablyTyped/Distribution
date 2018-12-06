package typings
package antdLib.libInputTextAreaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextArea
  extends reactLib.reactMod.Component[TextAreaProps, TextAreaState, js.Any] {
  var nextFrameActionId: scala.Double = js.native
  var resizeObserver: resizeDashObserverDashPolyfillLib.resizeDashObserverDashPolyfillMod.Global.ResizeObserver | scala.Null = js.native
  @JSName("state")
  var state_TextArea: antdLib.Anon_TextareaStyles = js.native
  var textAreaRef: js.Any = js.native
  def blur(): scala.Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MTextArea(): scala.Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MTextArea(prevProps: TextAreaProps): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MTextArea(): scala.Unit = js.native
  def focus(): scala.Unit = js.native
  def getTextAreaClassName(): js.Any = js.native
  def handleKeyDown(e: reactLib.reactMod.ReactNs.KeyboardEvent[reactLib.HTMLTextAreaElement]): scala.Unit = js.native
  def handleTextareaChange(e: reactLib.reactMod.ReactNs.ChangeEvent[reactLib.HTMLTextAreaElement]): scala.Unit = js.native
  def resizeOnNextFrame(): scala.Unit = js.native
  def resizeTextarea(): scala.Unit = js.native
  def saveTextAreaRef(textArea: reactLib.HTMLTextAreaElement): scala.Unit = js.native
  def updateResizeObserverHook(): scala.Unit = js.native
}

