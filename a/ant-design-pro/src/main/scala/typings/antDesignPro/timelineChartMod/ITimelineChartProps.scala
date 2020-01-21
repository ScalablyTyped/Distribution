package typings.antDesignPro.timelineChartMod

import typings.antDesignPro.AnonXY1
import typings.antDesignPro.AnonY1
import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITimelineChartProps extends js.Object {
  var data: js.Array[AnonXY1]
  var height: js.UndefOr[Double] = js.undefined
  var padding: js.UndefOr[js.Tuple4[Double, Double, Double, Double]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var titleMap: AnonY1
}

object ITimelineChartProps {
  @scala.inline
  def apply(
    data: js.Array[AnonXY1],
    titleMap: AnonY1,
    height: Int | Double = null,
    padding: js.Tuple4[Double, Double, Double, Double] = null,
    style: CSSProperties = null
  ): ITimelineChartProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], titleMap = titleMap.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITimelineChartProps]
  }
}

