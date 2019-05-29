package typings
package antdLib.libMentionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mentions
  extends reactLib.reactMod.Component[MentionProps, MentionState, js.Any] {
  var onBlur: reactLib.reactMod.FocusEventHandler[stdLib.HTMLTextAreaElement] = js.native
  var onFocus: reactLib.reactMod.FocusEventHandler[stdLib.HTMLTextAreaElement] = js.native
  @JSName("state")
  var state_Mentions: antdLib.Anon_Focused = js.native
  def getFilterOption(): js.Any = js.native
  def getNotFoundContent(renderEmpty: antdLib.libConfigDashProviderRenderEmptyMod.RenderEmptyHandler): js.UndefOr[js.Object | scala.Null] = js.native
  def getOptions(): js.UndefOr[js.Object | scala.Null] = js.native
  def renderMentions(hasGetPrefixClsRenderEmpty: antdLib.libConfigDashProviderMod.ConfigConsumerProps): reactLib.reactMod.Global.JSXNs.Element = js.native
}

