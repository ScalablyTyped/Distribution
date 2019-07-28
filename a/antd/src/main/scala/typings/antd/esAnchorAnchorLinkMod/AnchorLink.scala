package typings.antd.esAnchorAnchorLinkMod

import typings.antd.Anon_AntAnchor_870227935
import typings.antd.esConfigDashProviderMod.ConfigConsumerProps
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
  var context_AnchorLink: Anon_AntAnchor_870227935 = js.native
  @JSName("componentDidMount")
  def componentDidMount_MAnchorLink(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MAnchorLink(hasHref: AnchorLinkProps): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MAnchorLink(): Unit = js.native
  def handleClick(e: MouseEvent[HTMLElement, typings.std.MouseEvent]): Unit = js.native
  def renderAnchorLink(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
}

