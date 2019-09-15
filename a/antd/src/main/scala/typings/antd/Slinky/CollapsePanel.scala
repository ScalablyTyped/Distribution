package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typings.antd.esCollapseCollapsePanelMod.CollapsePanelProps
import typings.antd.esCollapseCollapsePanelMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: style, id, className, disabled */
object CollapsePanel
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.antd.esCollapseCollapsePanelMod.default].asInstanceOf[String | js.Object]
  def apply(
    header: TagMod[Any],
    extra: TagMod[Any] = null,
    forceRender: js.UndefOr[Boolean] = js.undefined,
    prefixCls: String = null,
    showArrow: js.UndefOr[Boolean] = js.undefined
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(header = header)
    if (extra != null) __obj.updateDynamic("extra")(extra)
    if (!js.isUndefined(forceRender)) __obj.updateDynamic("forceRender")(forceRender)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (!js.isUndefined(showArrow)) __obj.updateDynamic("showArrow")(showArrow)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = CollapsePanelProps
}

