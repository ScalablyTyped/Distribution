package typings
package appleDashMapkitDashJsLib.mapkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleConstructorOptions extends js.Object {
  var fillColor: js.UndefOr[java.lang.String] = js.undefined
  var fillOpacity: js.UndefOr[scala.Double] = js.undefined
  var fillRule: js.UndefOr[java.lang.String] = js.undefined
  var lineCap: js.UndefOr[java.lang.String] = js.undefined
  var lineDash: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var lineDashOffset: js.UndefOr[scala.Double] = js.undefined
  var lineJoin: js.UndefOr[java.lang.String] = js.undefined
  var lineWidth: js.UndefOr[scala.Double] = js.undefined
  var strokeColor: js.UndefOr[java.lang.String] = js.undefined
  var strokeOpacity: js.UndefOr[scala.Double] = js.undefined
}

object StyleConstructorOptions {
  @scala.inline
  def apply(
    fillColor: java.lang.String = null,
    fillOpacity: scala.Int | scala.Double = null,
    fillRule: java.lang.String = null,
    lineCap: java.lang.String = null,
    lineDash: js.Array[scala.Double] = null,
    lineDashOffset: scala.Int | scala.Double = null,
    lineJoin: java.lang.String = null,
    lineWidth: scala.Int | scala.Double = null,
    strokeColor: java.lang.String = null,
    strokeOpacity: scala.Int | scala.Double = null
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

