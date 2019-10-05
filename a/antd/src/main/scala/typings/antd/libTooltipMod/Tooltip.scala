package typings.antd.libTooltipMod

import typings.antd.libConfigDashProviderMod.ConfigConsumerProps
import typings.react.reactMod.Component
import typings.react.reactMod.Global.JSX.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tooltip
  extends Component[TooltipProps, js.Any, js.Any] {
  var tooltip: js.Any = js.native
  def getPlacements(): js.Any = js.native
  def getPopupDomNode(): js.Any = js.native
  def isNoTitle(): Boolean = js.native
  def onPopupAlign(domNode: HTMLElement, align: js.Any): Unit = js.native
  def onVisibleChange(visible: Boolean): Unit = js.native
  def renderTooltip(hasGetPopupContainerGetPrefixCls: ConfigConsumerProps): Element = js.native
  def saveTooltip(node: js.Any): Unit = js.native
}

