package typings.antd.tooltipMod

import typings.antd.contextMod.ConfigConsumerProps
import typings.react.mod.Component
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.react.mod._Global_.JSX.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tooltip
  extends Component[TooltipProps, js.Any, js.Any] {
  var tooltip: js.Any = js.native
  def getOverlay(): js.Object = js.native
  def getPlacements(): js.Any = js.native
  def getPopupDomNode(): js.Any = js.native
  def isNoTitle(): Boolean = js.native
  def onPopupAlign(domNode: HTMLElement, align: js.Any): Unit = js.native
  def onVisibleChange(visible: Boolean): Unit = js.native
  def renderTooltip(hasGetPopupContainerGetPrefixClsDirection: ConfigConsumerProps): Element = js.native
  def saveTooltip(
    node: ForwardRefExoticComponent[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RcTooltipProps */ js.Any) with RefAttributes[_]
    ]
  ): Unit = js.native
}

