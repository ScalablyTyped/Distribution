package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typings.antd.antdStrings.error
import typings.antd.antdStrings.processing
import typings.antd.antdStrings.success
import typings.antd.antdStrings.warning
import typings.antd.esBadgeMod.BadgeProps
import typings.antd.esBadgeMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: style, color, className, title */
object Badge
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.antd.esBadgeMod.default].asInstanceOf[String | js.Object]
  def apply(
    count: TagMod[Any] = null,
    dot: js.UndefOr[Boolean] = js.undefined,
    offset: js.Tuple2[Double | String, Double | String] = null,
    overflowCount: Int | Double = null,
    prefixCls: String = null,
    scrollNumberPrefixCls: String = null,
    showZero: js.UndefOr[Boolean] = js.undefined,
    status: success | processing | typings.antd.antdStrings.default | error | warning = null,
    text: TagMod[Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count)
    if (!js.isUndefined(dot)) __obj.updateDynamic("dot")(dot)
    if (offset != null) __obj.updateDynamic("offset")(offset)
    if (overflowCount != null) __obj.updateDynamic("overflowCount")(overflowCount.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (scrollNumberPrefixCls != null) __obj.updateDynamic("scrollNumberPrefixCls")(scrollNumberPrefixCls)
    if (!js.isUndefined(showZero)) __obj.updateDynamic("showZero")(showZero)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = BadgeProps
}

