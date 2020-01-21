package typings.antd.anchorLinkMod

import typings.antd.AnonAntAnchor578726292
import typings.antd.contextMod.ConfigConsumerProps
import typings.react.mod.Component
import typings.react.mod._Global_.JSX.Element
import typings.std.HTMLElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnchorLink
  extends Component[AnchorLinkProps, js.Any, js.Any] {
  @JSName("context")
  var context_AnchorLink: AnonAntAnchor578726292 = js.native
  @JSName("componentDidMount")
  def componentDidMount_MAnchorLink(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MAnchorLink(hasHref: AnchorLinkProps): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MAnchorLink(): Unit = js.native
  def handleClick(e: typings.react.mod.MouseEvent[HTMLElement, MouseEvent]): Unit = js.native
  def renderAnchorLink(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
}

