package typings.antd.libAnchorAnchorLinkMod

import typings.antd.Anon_AntAnchor_141676980
import typings.antd.libConfigDashProviderMod.ConfigConsumerProps
import typings.react.reactMod.Component
import typings.react.reactMod.Global.JSXNs.Element
import typings.react.reactMod.MouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnchorLink
  extends Component[AnchorLinkProps, js.Any, js.Any] {
  @JSName("context")
  var context_AnchorLink: Anon_AntAnchor_141676980 = js.native
  @JSName("componentDidMount")
  def componentDidMount_MAnchorLink(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MAnchorLink(hasHref: AnchorLinkProps): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MAnchorLink(): Unit = js.native
  def handleClick(e: MouseEvent[HTMLElement, typings.std.MouseEvent]): Unit = js.native
  def renderAnchorLink(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
}

