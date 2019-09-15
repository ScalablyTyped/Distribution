package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typings.antd.esCollapseCollapseMod.CollapseProps
import typings.antd.esCollapseCollapseMod.ExpandIconPosition
import typings.antd.esCollapseCollapseMod.PanelProps
import typings.antd.esCollapseMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: style, className */
object Collapse
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.antd.esCollapseMod.default].asInstanceOf[String | js.Object]
  def apply(
    accordion: js.UndefOr[Boolean] = js.undefined,
    activeKey: (js.Array[String | Double]) | String | Double = null,
    bordered: js.UndefOr[Boolean] = js.undefined,
    defaultActiveKey: (js.Array[String | Double]) | String | Double = null,
    destroyInactivePanel: js.UndefOr[Boolean] = js.undefined,
    expandIcon: /* panelProps */ PanelProps => TagMod[Any] = null,
    expandIconPosition: ExpandIconPosition = null,
    onChange: /* key */ String | js.Array[String] => Unit = null,
    prefixCls: String = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(accordion)) __obj.updateDynamic("accordion")(accordion)
    if (activeKey != null) __obj.updateDynamic("activeKey")(activeKey.asInstanceOf[js.Any])
    if (!js.isUndefined(bordered)) __obj.updateDynamic("bordered")(bordered)
    if (defaultActiveKey != null) __obj.updateDynamic("defaultActiveKey")(defaultActiveKey.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyInactivePanel)) __obj.updateDynamic("destroyInactivePanel")(destroyInactivePanel)
    if (expandIcon != null) __obj.updateDynamic("expandIcon")(js.Any.fromFunction1(expandIcon))
    if (expandIconPosition != null) __obj.updateDynamic("expandIconPosition")(expandIconPosition)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = CollapseProps
}

