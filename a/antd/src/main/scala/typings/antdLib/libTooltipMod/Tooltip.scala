package typings
package antdLib.libTooltipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tooltip
  extends reactLib.reactMod.Component[TooltipProps, js.Any, js.Any] {
  var tooltip: js.Any = js.native
  def getDisabledCompatibleChildren(element: reactLib.reactMod.ReactElement[_]): reactLib.reactMod.Global.JSXNs.Element = js.native
  def getPlacements(): js.Any = js.native
  def getPopupDomNode(): js.Any = js.native
  def isNoTitle(): scala.Boolean = js.native
  def onPopupAlign(domNode: stdLib.HTMLElement, align: js.Any): scala.Unit = js.native
  def onVisibleChange(visible: scala.Boolean): scala.Unit = js.native
  def renderTooltip(hasGetPopupContainerGetPrefixCls: antdLib.libConfigDashProviderMod.ConfigConsumerProps): reactLib.reactMod.Global.JSXNs.Element = js.native
  def saveTooltip(node: js.Any): scala.Unit = js.native
}

