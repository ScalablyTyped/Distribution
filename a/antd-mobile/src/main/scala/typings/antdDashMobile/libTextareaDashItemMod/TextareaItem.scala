package typings.antdDashMobile.libTextareaDashItemMod

import typings.react.reactMod.ChangeEvent
import typings.react.reactMod.Component
import typings.react.reactMod.FocusEvent
import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextareaItem
  extends Component[TextareaItemProps, TextareaItemState, js.Any] {
  var debounceTimeout: js.Any = js.native
  var textareaRef: js.Any = js.native
  def clearInput(): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MTextareaItem(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MTextareaItem(): Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MTextareaItem(nextProps: TextareaItemProps): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MTextareaItem(): Unit = js.native
  def focus(): Unit = js.native
  def onBlur(e: FocusEvent[HTMLTextAreaElement]): Unit = js.native
  def onChange(e: ChangeEvent[HTMLTextAreaElement]): Unit = js.native
  def onErrorClick(): Unit = js.native
  def onFocus(e: FocusEvent[HTMLTextAreaElement]): Unit = js.native
  def reAlignHeight(): Unit = js.native
}

