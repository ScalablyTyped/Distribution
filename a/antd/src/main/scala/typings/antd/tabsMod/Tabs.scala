package typings.antd.tabsMod

import typings.antd.configProviderContextMod.ConfigConsumerProps
import typings.react.mod.Component
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tabs
  extends Component[TabsProps, js.Any, js.Any] {
  @JSName("componentDidMount")
  def componentDidMount_MTabs(): Unit = js.native
  def createNewTab(targetKey: MouseEvent[HTMLElement, NativeMouseEvent]): Unit = js.native
  def handleChange(activeKey: String): Unit = js.native
  def removeTab(targetKey: String, e: MouseEvent[HTMLElement, NativeMouseEvent]): Unit = js.native
  def renderTabs(hasGetPrefixClsDirection: ConfigConsumerProps): Element = js.native
}

