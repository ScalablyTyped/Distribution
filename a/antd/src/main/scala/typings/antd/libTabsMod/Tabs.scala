package typings.antd.libTabsMod

import typings.antd.libConfigDashProviderMod.ConfigConsumerProps
import typings.react.reactMod.Component
import typings.react.reactMod.Global.JSX.Element
import typings.std.HTMLElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tabs
  extends Component[TabsProps, js.Any, js.Any] {
  @JSName("componentDidMount")
  def componentDidMount_MTabs(): Unit = js.native
  def createNewTab(targetKey: typings.react.reactMod.MouseEvent[HTMLElement, MouseEvent]): Unit = js.native
  def handleChange(activeKey: String): Unit = js.native
  def removeTab(targetKey: String, e: typings.react.reactMod.MouseEvent[HTMLElement, MouseEvent]): Unit = js.native
  def renderTabs(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
}

