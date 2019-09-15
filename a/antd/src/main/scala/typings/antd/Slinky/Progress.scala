package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typings.antd.antdStrings.active
import typings.antd.antdStrings.bottom
import typings.antd.antdStrings.exception
import typings.antd.antdStrings.left
import typings.antd.antdStrings.normal
import typings.antd.antdStrings.right
import typings.antd.antdStrings.success
import typings.antd.antdStrings.top
import typings.antd.esProgressMod.default
import typings.antd.esProgressProgressMod.ProgressGradient
import typings.antd.esProgressProgressMod.ProgressProps
import typings.antd.esProgressProgressMod.ProgressSize
import typings.antd.esProgressProgressMod.ProgressType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: style, strokeLinecap, className */
object Progress
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.antd.esProgressMod.default].asInstanceOf[String | js.Object]
  def apply(
    format: (/* percent */ js.UndefOr[Double], /* successPercent */ js.UndefOr[Double]) => TagMod[Any] = null,
    gapDegree: Int | Double = null,
    gapPosition: top | bottom | left | right = null,
    percent: Int | Double = null,
    prefixCls: String = null,
    showInfo: js.UndefOr[Boolean] = js.undefined,
    size: ProgressSize = null,
    status: normal | exception | active | success = null,
    strokeColor: String | ProgressGradient = null,
    strokeWidth: Int | Double = null,
    successPercent: Int | Double = null,
    trailColor: String = null,
    `type`: ProgressType = null,
    width: Int | Double = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction2(format))
    if (gapDegree != null) __obj.updateDynamic("gapDegree")(gapDegree.asInstanceOf[js.Any])
    if (gapPosition != null) __obj.updateDynamic("gapPosition")(gapPosition.asInstanceOf[js.Any])
    if (percent != null) __obj.updateDynamic("percent")(percent.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (!js.isUndefined(showInfo)) __obj.updateDynamic("showInfo")(showInfo)
    if (size != null) __obj.updateDynamic("size")(size)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (successPercent != null) __obj.updateDynamic("successPercent")(successPercent.asInstanceOf[js.Any])
    if (trailColor != null) __obj.updateDynamic("trailColor")(trailColor)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ProgressProps
}

