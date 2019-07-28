package typings.antd.libBackDashTopMod

import typings.antd.libConfigDashProviderMod.ConfigConsumerProps
import typings.react.reactMod.Component
import typings.react.reactMod.Global.JSXNs.Element
import typings.react.reactMod.MouseEvent
import typings.std.HTMLDivElement
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
  def getCurrentScrollTop(): Double = js.native
  def handleScroll(): Unit = js.native
  def renderBackTop(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
  def scrollToTop(e: MouseEvent[HTMLDivElement, typings.std.MouseEvent]): Unit = js.native
  def setScrollTop(value: Double): Unit = js.native
}

