package typings.antd.libMentionMod

import typings.antd.libConfigDashProviderMod.ConfigConsumerProps
import typings.react.reactMod.Component
import typings.react.reactMod.FocusEvent
import typings.react.reactMod.Global.JSX.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mention
  extends Component[MentionProps, MentionState, js.Any] {
  var mentionEle: js.Any = js.native
  def defaultSearchChange(value: String): Unit = js.native
  def focus(): Unit = js.native
  def mentionRef(ele: js.Any): Unit = js.native
  def onBlur(ev: FocusEvent[HTMLElement]): Unit = js.native
  def onChange(editorState: js.Any): Unit = js.native
  def onFocus(ev: FocusEvent[HTMLElement]): Unit = js.native
  def onSearchChange(value: String, prefix: String): js.Any = js.native
  def renderMention(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
}

