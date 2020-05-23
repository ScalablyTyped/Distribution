package typings.appleMapkitJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Initial values of options for applying style to overlays.
  */
trait StyleConstructorOptions extends js.Object {
  /**
    * The fill color of a shape.
    */
  var fillColor: js.UndefOr[String] = js.undefined
  /**
    * The opacity of the fill color.
    */
  var fillOpacity: js.UndefOr[Double] = js.undefined
  /**
    * A rule for determining whether a point is inside or outside a polygon.
    */
  var fillRule: js.UndefOr[String] = js.undefined
  /**
    * The style to use when drawing line endings.
    */
  var lineCap: js.UndefOr[String] = js.undefined
  /**
    * An array of line and gap lengths, used to create a dashed line.
    */
  var lineDash: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * The number of CSS pixels to offset drawing of a line's dash pattern.
    */
  var lineDashOffset: js.UndefOr[Double] = js.undefined
  /**
    * The style to use when drawing joins between line segments.
    */
  var lineJoin: js.UndefOr[String] = js.undefined
  /**
    * The width of a line's stroke, in CSS pixels.
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
  /**
    * The stroke color of a line.
    */
  var strokeColor: js.UndefOr[String] = js.undefined
  /**
    * The opacity of the stroke color.
    */
  var strokeOpacity: js.UndefOr[Double] = js.undefined
}

object StyleConstructorOptions {
  @scala.inline
  def apply(
    fillColor: String = null,
    fillOpacity: js.UndefOr[Double] = js.undefined,
    fillRule: String = null,
    lineCap: String = null,
    lineDash: js.Array[Double] = null,
    lineDashOffset: js.UndefOr[Double] = js.undefined,
    lineJoin: String = null,
    lineWidth: js.UndefOr[Double] = js.undefined,
    strokeColor: String = null,
    strokeOpacity: js.UndefOr[Double] = js.undefined
  ): StyleConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (!js.isUndefined(fillOpacity)) __obj.updateDynamic("fillOpacity")(fillOpacity.get.asInstanceOf[js.Any])
    if (fillRule != null) __obj.updateDynamic("fillRule")(fillRule.asInstanceOf[js.Any])
    if (lineCap != null) __obj.updateDynamic("lineCap")(lineCap.asInstanceOf[js.Any])
    if (lineDash != null) __obj.updateDynamic("lineDash")(lineDash.asInstanceOf[js.Any])
    if (!js.isUndefined(lineDashOffset)) __obj.updateDynamic("lineDashOffset")(lineDashOffset.get.asInstanceOf[js.Any])
    if (lineJoin != null) __obj.updateDynamic("lineJoin")(lineJoin.asInstanceOf[js.Any])
    if (!js.isUndefined(lineWidth)) __obj.updateDynamic("lineWidth")(lineWidth.get.asInstanceOf[js.Any])
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor.asInstanceOf[js.Any])
    if (!js.isUndefined(strokeOpacity)) __obj.updateDynamic("strokeOpacity")(strokeOpacity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleConstructorOptions]
  }
}

