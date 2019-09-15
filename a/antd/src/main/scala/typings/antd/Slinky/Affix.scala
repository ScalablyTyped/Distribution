package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.antd.esAffixMod.AffixProps
import typings.antd.esAffixMod.default
import typings.std.HTMLElement
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: style, className */
object Affix
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.antd.esAffixMod.default].asInstanceOf[String | js.Object]
  def apply(
    offset: Int | Double = null,
    offsetBottom: Int | Double = null,
    offsetTop: Int | Double = null,
    onChange: /* affixed */ js.UndefOr[Boolean] => Unit = null,
    prefixCls: String = null,
    target: () => Window | HTMLElement | Null = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (offsetBottom != null) __obj.updateDynamic("offsetBottom")(offsetBottom.asInstanceOf[js.Any])
    if (offsetTop != null) __obj.updateDynamic("offsetTop")(offsetTop.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (target != null) __obj.updateDynamic("target")(js.Any.fromFunction0(target))
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = AffixProps
}

