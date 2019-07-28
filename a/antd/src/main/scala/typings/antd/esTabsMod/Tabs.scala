package typings.antd.esTabsMod

import typings.antd.esConfigDashProviderMod.ConfigConsumerProps
import typings.react.reactMod.Component
import typings.react.reactMod.Global.JSXNs.Element
import typings.react.reactMod.MouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tabs
  extends Component[TabsProps, js.Any, js.Any] {
  @JSName("componentDidMount")
  def componentDidMount_MTabs(): Unit = js.native
  def createNewTab(targetKey: MouseEvent[HTMLElement, typings.std.MouseEvent]): Unit = js.native
  def handleChange(activeKey: String): Unit = js.native
  def removeTab(targetKey: String, e: MouseEvent[HTMLElement, typings.std.MouseEvent]): Unit = js.native
  def renderTabs(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
}

