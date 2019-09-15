package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typings.antd.esTimelineMod.default
import typings.antd.esTimelineTimelineMod.TimelineProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: style, className, mode */
object Timeline
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.antd.esTimelineMod.default].asInstanceOf[String | js.Object]
  def apply(
    pending: TagMod[Any] = null,
    pendingDot: TagMod[Any] = null,
    prefixCls: String = null,
    reverse: js.UndefOr[Boolean] = js.undefined
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (pending != null) __obj.updateDynamic("pending")(pending)
    if (pendingDot != null) __obj.updateDynamic("pendingDot")(pendingDot)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TimelineProps
}

