package typings.antd.esBackDashTopMod

import typings.antd.esConfigDashProviderMod.ConfigConsumerProps
import typings.react.reactMod.Component
import typings.react.reactMod.Global.JSX.Element
import typings.std.HTMLDivElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackTop
  extends Component[BackTopProps, js.Any, js.Any] {
  var scrollEvent: js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MBackTop(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MBackTop(): Unit = js.native
  def handleScroll(): Unit = js.native
  def renderBackTop(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
  def scrollToTop(e: typings.react.reactMod.MouseEvent[HTMLDivElement, MouseEvent]): Unit = js.native
}

