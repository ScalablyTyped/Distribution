package typings.antd.esPopoverMod

import typings.antd.esConfigDashProviderMod.ConfigConsumerProps
import typings.react.reactMod.Component
import typings.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Popover
  extends Component[PopoverProps, js.Object, js.Any] {
  var tooltip: js.Any = js.native
  def getOverlay(prefixCls: String): Element = js.native
  def getPopupDomNode(): js.Any = js.native
  def renderPopover(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
  def saveTooltip(node: js.Any): Unit = js.native
}

