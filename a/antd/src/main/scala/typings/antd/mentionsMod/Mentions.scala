package typings.antd.mentionsMod

import typings.antd.AnonFocused
import typings.antd.contextMod.ConfigConsumerProps
import typings.antd.renderEmptyMod.RenderEmptyHandler
import typings.react.mod.Component
import typings.react.mod.FocusEventHandler
import typings.react.mod._Global_.JSX.Element
import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mentions
  extends Component[MentionProps, MentionState, js.Any] {
  var onBlur: FocusEventHandler[HTMLTextAreaElement] = js.native
  var onFocus: FocusEventHandler[HTMLTextAreaElement] = js.native
  var rcMentions: js.Any = js.native
  @JSName("state")
  var state_Mentions: AnonFocused = js.native
  def blur(): Unit = js.native
  def focus(): Unit = js.native
  def getFilterOption(): js.Any = js.native
  def getNotFoundContent(renderEmpty: RenderEmptyHandler): js.UndefOr[js.Object | Null] = js.native
  def getOptions(): js.UndefOr[js.Object | Null] = js.native
  def renderMentions(hasGetPrefixClsRenderEmptyDirection: ConfigConsumerProps): Element = js.native
  def saveMentions(node: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof RcMentions */ js.Any): Unit = js.native
}

