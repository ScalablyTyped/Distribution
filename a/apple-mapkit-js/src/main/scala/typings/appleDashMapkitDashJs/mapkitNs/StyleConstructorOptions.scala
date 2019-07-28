package typings.appleDashMapkitDashJs.mapkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleConstructorOptions extends js.Object {
  var fillColor: js.UndefOr[String] = js.undefined
  var fillOpacity: js.UndefOr[Double] = js.undefined
  var fillRule: js.UndefOr[String] = js.undefined
  var lineCap: js.UndefOr[String] = js.undefined
  var lineDash: js.UndefOr[js.Array[Double]] = js.undefined
  var lineDashOffset: js.UndefOr[Double] = js.undefined
  var lineJoin: js.UndefOr[String] = js.undefined
  var lineWidth: js.UndefOr[Double] = js.undefined
  var strokeColor: js.UndefOr[String] = js.undefined
  var strokeOpacity: js.UndefOr[Double] = js.undefined
}

object StyleConstructorOptions {
  @scala.inline
  def apply(
    fillColor: String = null,
    fillOpacity: Int | Double = null,
    fillRule: String = null,
    lineCap: String = null,
    lineDash: js.Array[Double] = null,
    lineDashOffset: Int | Double = null,
    lineJoin: String = null,
    lineWidth: Int | Double = null,
    strokeColor: String = null,
    strokeOpacity: Int | Double = null
  ): StyleConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor)
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (fillRule != null) __obj.updateDynamic("fillRule")(fillRule)
    if (lineCap != null) __obj.updateDynamic("lineCap")(lineCap)
    if (lineDash != null) __obj.updateDynamic("lineDash")(lineDash)
    if (lineDashOffset != null) __obj.updateDynamic("lineDashOffset")(lineDashOffset.asInstanceOf[js.Any])
    if (lineJoin != null) __obj.updateDynamic("lineJoin")(lineJoin)
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor)
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleConstructorOptions]
  }
}

