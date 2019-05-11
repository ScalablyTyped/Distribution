package typings
package antdLib.esTabsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tabs
  extends reactLib.reactMod.Component[TabsProps, js.Any, js.Any] {
  @JSName("componentDidMount")
  def componentDidMount_MTabs(): scala.Unit = js.native
  def createNewTab(targetKey: reactLib.reactMod.MouseEvent[stdLib.HTMLElement, stdLib.MouseEvent]): scala.Unit = js.native
  def handleChange(activeKey: java.lang.String): scala.Unit = js.native
  def removeTab(
    targetKey: java.lang.String,
    e: reactLib.reactMod.MouseEvent[stdLib.HTMLElement, stdLib.MouseEvent]
  ): scala.Unit = js.native
  def renderTabs(hasGetPrefixCls: antdLib.esConfigDashProviderMod.ConfigConsumerProps): reactLib.reactMod.Global.JSXNs.Element = js.native
}

