package typings.antDesignPro.timelineChartMod

import typings.antDesignPro.anon.Y1
import typings.antDesignPro.anon.Y2
import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITimelineChartProps extends js.Object {
  var data: js.Array[Y1]
  var height: js.UndefOr[Double] = js.undefined
  var padding: js.UndefOr[js.Tuple4[Double, Double, Double, Double]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var titleMap: Y2
}

object ITimelineChartProps {
  @scala.inline
  def apply(
    data: js.Array[Y1],
    titleMap: Y2,
    height: js.UndefOr[Double] = js.undefined,
    padding: js.Tuple4[Double, Double, Double, Double] = null,
    style: CSSProperties = null
  ): ITimelineChartProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], titleMap = titleMap.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITimelineChartProps]
  }
}

