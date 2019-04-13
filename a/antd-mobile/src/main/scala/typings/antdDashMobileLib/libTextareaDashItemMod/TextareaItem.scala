package typings
package antdDashMobileLib.libTextareaDashItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextareaItem
  extends reactLib.reactMod.Component[TextareaItemProps, TextareaItemState, js.Any] {
  var debounceTimeout: js.Any = js.native
  var textareaRef: js.Any = js.native
  def clearInput(): scala.Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MTextareaItem(): scala.Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MTextareaItem(): scala.Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MTextareaItem(nextProps: TextareaItemProps): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MTextareaItem(): scala.Unit = js.native
  def focus(): scala.Unit = js.native
  def onBlur(e: reactLib.reactMod.FocusEvent[stdLib.HTMLTextAreaElement]): scala.Unit = js.native
  def onChange(e: reactLib.reactMod.ChangeEvent[stdLib.HTMLTextAreaElement]): scala.Unit = js.native
  def onErrorClick(): scala.Unit = js.native
  def onFocus(e: reactLib.reactMod.FocusEvent[stdLib.HTMLTextAreaElement]): scala.Unit = js.native
  def reAlignHeight(): scala.Unit = js.native
}

