package typings.antDashDesignDashPro.libChartsMiniProgressMod

import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMiniProgressProps extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var percent: js.UndefOr[Double] = js.undefined
  var strokeWidth: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var target: Double
  var targetLabel: String
}

object IMiniProgressProps {
  @scala.inline
  def apply(
    target: Double,
    targetLabel: String,
    color: String = null,
    percent: Int | Double = null,
    strokeWidth: Int | Double = null,
    style: CSSProperties = null
  ): IMiniProgressProps = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any], targetLabel = targetLabel.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (percent != null) __obj.updateDynamic("percent")(percent.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMiniProgressProps]
  }
}

