package typings.antd.editableMod

import typings.antd.AnonCurrentString
import typings.react.mod.ChangeEventHandler
import typings.react.mod.Component
import typings.react.mod.FocusEventHandler
import typings.react.mod.KeyboardEventHandler
import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Editable
  extends Component[EditableProps, EditableState, js.Any] {
  var inComposition: js.UndefOr[Boolean] = js.native
  var lastKeyCode: js.UndefOr[Double] = js.native
  var onBlur: FocusEventHandler[HTMLTextAreaElement] = js.native
  var onChange: ChangeEventHandler[HTMLTextAreaElement] = js.native
  var onKeyDown: KeyboardEventHandler[HTMLTextAreaElement] = js.native
  var onKeyUp: KeyboardEventHandler[HTMLTextAreaElement] = js.native
  @JSName("state")
  var state_Editable: AnonCurrentString = js.native
  var textarea: js.UndefOr[typings.antd.textAreaMod.default] = js.native
  @JSName("componentDidMount")
  def componentDidMount_MEditable(): Unit = js.native
  def confirmChange(): Unit = js.native
  def onCompositionEnd(): Unit = js.native
  def onCompositionStart(): Unit = js.native
  def setTextarea(textarea: typings.antd.textAreaMod.default): Unit = js.native
}

