package typings.antDesignPro.miniAreaMod

import typings.antDesignPro.AnonXY
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMiniAreaProps extends js.Object {
  var animate: js.UndefOr[Boolean] = js.undefined
  var borderColor: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var data: js.Array[AnonXY]
  var height: Double
  var line: js.UndefOr[Boolean] = js.undefined
  var xAxis: js.UndefOr[IAxis] = js.undefined
  var yAxis: js.UndefOr[IAxis] = js.undefined
}

object IMiniAreaProps {
  @scala.inline
  def apply(
    data: js.Array[AnonXY],
    height: Double,
    animate: js.UndefOr[Boolean] = js.undefined,
    borderColor: String = null,
    color: String = null,
    line: js.UndefOr[Boolean] = js.undefined,
    xAxis: IAxis = null,
    yAxis: IAxis = null
  ): IMiniAreaProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(line)) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (xAxis != null) __obj.updateDynamic("xAxis")(xAxis.asInstanceOf[js.Any])
    if (yAxis != null) __obj.updateDynamic("yAxis")(yAxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMiniAreaProps]
  }
}

