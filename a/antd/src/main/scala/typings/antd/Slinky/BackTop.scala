package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.antd.esBackDashTopMod.BackTopProps
import typings.std.HTMLElement
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: onClick, style, className */
object BackTop
  extends ExternalComponentWithAttributesWithRefType[tag.type, typings.antd.esMod.BackTop] {
  override val component: String | js.Object = js.constructorOf[typings.antd.esMod.BackTop].asInstanceOf[String | js.Object]
  def apply(
    prefixCls: String = null,
    target: () => HTMLElement | Window = null,
    visibilityHeight: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): BuildingComponent[tag.type, typings.antd.esMod.BackTop] = {
    val __obj = js.Dynamic.literal()
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (target != null) __obj.updateDynamic("target")(js.Any.fromFunction0(target))
    if (visibilityHeight != null) __obj.updateDynamic("visibilityHeight")(visibilityHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = BackTopProps
}

