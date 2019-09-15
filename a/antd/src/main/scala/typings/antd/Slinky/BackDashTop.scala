package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.antd.esBackDashTopMod.BackTopProps
import typings.antd.esBackDashTopMod.default
import typings.std.HTMLElement
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: onClick, style, className */
object BackDashTop
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.antd.esBackDashTopMod.default].asInstanceOf[String | js.Object]
  def apply(
    prefixCls: String = null,
    target: () => HTMLElement | Window = null,
    visibilityHeight: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (target != null) __obj.updateDynamic("target")(js.Any.fromFunction0(target))
    if (visibilityHeight != null) __obj.updateDynamic("visibilityHeight")(visibilityHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = BackTopProps
}

