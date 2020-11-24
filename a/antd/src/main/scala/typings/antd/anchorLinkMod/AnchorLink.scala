package typings.antd.anchorLinkMod

import typings.antd.anchorAnchorMod.AntAnchor
import typings.antd.configProviderContextMod.ConfigConsumerProps
import typings.react.mod.Component
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnchorLink
  extends Component[AnchorLinkProps, js.Any, AntAnchor] {
  
  @JSName("componentDidMount")
  def componentDidMount_MAnchorLink(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MAnchorLink(hasHref: AnchorLinkProps): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MAnchorLink(): Unit = js.native
  
  @JSName("context")
  var context_AnchorLink: AntAnchor = js.native
  
  def handleClick(e: MouseEvent[HTMLElement, NativeMouseEvent]): Unit = js.native
  
  def renderAnchorLink(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
}
