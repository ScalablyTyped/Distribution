package typings
package antdLib.esMentionsMod

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
  def getFilterOption(): js.UndefOr[
    antdLib.antdLibNumbers.`false` | (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof imported__rc-mentions@0.3.1@rc-mentions/lib/util.filterOption */ js.Any)
  ] = js.native
  def getNotFoundContent(renderEmpty: antdLib.esConfigDashProviderRenderEmptyMod.RenderEmptyHandler): js.UndefOr[js.Object | scala.Null] = js.native
  def getOptions(): js.UndefOr[js.Object | scala.Null] = js.native
  def renderMentions(hasGetPrefixClsRenderEmpty: antdLib.esConfigDashProviderMod.ConfigConsumerProps): reactLib.reactMod.Global.JSXNs.Element = js.native
}

