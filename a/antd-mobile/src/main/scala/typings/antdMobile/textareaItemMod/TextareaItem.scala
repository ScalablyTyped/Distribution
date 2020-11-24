package typings.antdMobile.textareaItemMod

import typings.react.mod.ChangeEvent
import typings.react.mod.Component
import typings.react.mod.FocusEvent
import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextareaItem
  extends Component[TextareaItemProps, TextareaItemState, js.Any] {
  
  def clearInput(): Unit = js.native
  
  @JSName("componentDidMount")
  def componentDidMount_MTextareaItem(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MTextareaItem(): Unit = js.native
  
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MTextareaItem(nextProps: TextareaItemProps): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MTextareaItem(): Unit = js.native
  
  var debounceTimeout: js.Any = js.native
  
  def focus(): Unit = js.native
  
  def onBlur(e: FocusEvent[HTMLTextAreaElement]): Unit = js.native
  
  def onChange(e: ChangeEvent[HTMLTextAreaElement]): Unit = js.native
  
  def onErrorClick(): Unit = js.native
  
  def onFocus(e: FocusEvent[HTMLTextAreaElement]): Unit = js.native
  
  def reAlignHeight(): Unit = js.native
  
  var textareaRef: js.Any = js.native
}
