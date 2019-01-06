package typings
package antdLib.libMentionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mention
  extends reactLib.reactMod.Component[MentionProps, MentionState, js.Any] {
  var mentionEle: js.Any = js.native
  def defaultSearchChange(value: java.lang.String): scala.Unit = js.native
  def focus(): scala.Unit = js.native
  def mentionRef(ele: js.Any): scala.Unit = js.native
  def onBlur(ev: reactLib.reactMod.ReactNs.FocusEvent[reactLib.HTMLElement]): scala.Unit = js.native
  def onChange(editorState: js.Any): scala.Unit = js.native
  def onFocus(ev: reactLib.reactMod.ReactNs.FocusEvent[reactLib.HTMLElement]): scala.Unit = js.native
  def onSearchChange(value: java.lang.String, prefix: java.lang.String): js.Any = js.native
  def renderMention(hasGetPrefixCls: antdLib.libConfigDashProviderMod.ConfigConsumerProps): reactLib.reactMod.Global.JSXNs.Element = js.native
}

