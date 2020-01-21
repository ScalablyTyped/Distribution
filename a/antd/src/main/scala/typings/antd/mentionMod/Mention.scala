package typings.antd.mentionMod

import typings.antd.contextMod.ConfigConsumerProps
import typings.react.mod.Component
import typings.react.mod.FocusEvent
import typings.react.mod._Global_.JSX.Element
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

