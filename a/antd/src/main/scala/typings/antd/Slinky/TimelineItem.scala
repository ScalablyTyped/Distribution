package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typings.antd.esTimelineTimelineItemMod.TimeLineItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: style, color, className */
object TimelineItem
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  override val component: String | js.Object = typings.antd.esTimelineTimelineItemMod.^.default.asInstanceOf[String | js.Object]
  def apply(
    dot: TagMod[Any] = null,
    pending: js.UndefOr[Boolean] = js.undefined,
    position: String = null,
    prefixCls: String = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (dot != null) __obj.updateDynamic("dot")(dot)
    if (!js.isUndefined(pending)) __obj.updateDynamic("pending")(pending)
    if (position != null) __obj.updateDynamic("position")(position)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TimeLineItemProps
}

