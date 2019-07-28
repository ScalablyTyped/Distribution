package typings.antd.libMentionsMod

import typings.antd.Anon_Focused
import typings.antd.libConfigDashProviderMod.ConfigConsumerProps
import typings.antd.libConfigDashProviderRenderEmptyMod.RenderEmptyHandler
import typings.react.reactMod.Component
import typings.react.reactMod.FocusEventHandler
import typings.react.reactMod.Global.JSXNs.Element
import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mentions
  extends Component[MentionProps, MentionState, js.Any] {
  var onBlur: FocusEventHandler[HTMLTextAreaElement] = js.native
  var onFocus: FocusEventHandler[HTMLTextAreaElement] = js.native
  @JSName("state")
  var state_Mentions: Anon_Focused = js.native
  def getFilterOption(): js.Any = js.native
  def getNotFoundContent(renderEmpty: RenderEmptyHandler): js.UndefOr[js.Object | Null] = js.native
  def getOptions(): js.UndefOr[js.Object | Null] = js.native
  def renderMentions(hasGetPrefixClsRenderEmpty: ConfigConsumerProps): Element = js.native
}

