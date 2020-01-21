package typings.antd.dropdownDropdownMod

import typings.antd.AnonAdjustX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Align extends js.Object {
  var offset: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var overflow: js.UndefOr[AnonAdjustX] = js.undefined
  var points: js.UndefOr[js.Tuple2[String, String]] = js.undefined
  var targetOffset: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var useCssBottom: js.UndefOr[Boolean] = js.undefined
  var useCssRight: js.UndefOr[Boolean] = js.undefined
  var useCssTransform: js.UndefOr[Boolean] = js.undefined
}

object Align {
  @scala.inline
  def apply(
    offset: js.Tuple2[Double, Double] = null,
    overflow: AnonAdjustX = null,
    points: js.Tuple2[String, String] = null,
    targetOffset: js.Tuple2[Double, Double] = null,
    useCssBottom: js.UndefOr[Boolean] = js.undefined,
    useCssRight: js.UndefOr[Boolean] = js.undefined,
    useCssTransform: js.UndefOr[Boolean] = js.undefined
  ): Align = {
    val __obj = js.Dynamic.literal()
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (overflow != null) __obj.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
    if (points != null) __obj.updateDynamic("points")(points.asInstanceOf[js.Any])
    if (targetOffset != null) __obj.updateDynamic("targetOffset")(targetOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(useCssBottom)) __obj.updateDynamic("useCssBottom")(useCssBottom.asInstanceOf[js.Any])
    if (!js.isUndefined(useCssRight)) __obj.updateDynamic("useCssRight")(useCssRight.asInstanceOf[js.Any])
    if (!js.isUndefined(useCssTransform)) __obj.updateDynamic("useCssTransform")(useCssTransform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Align]
  }
}

