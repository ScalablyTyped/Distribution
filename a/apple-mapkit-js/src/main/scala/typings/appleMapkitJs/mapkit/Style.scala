package typings.appleMapkitJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of observable attributes for overlays, including color and opacity of
  * stroke and fill, and line styles.
  */
trait Style extends js.Object {
  /**
    * The fill color of a shape.
    */
  var fillColor: String
  /**
    * The opacity of the fill color.
    */
  var fillOpacity: Double
  /**
    * A rule for determining whether a point is inside or outside a polygon.
    */
  var fillRule: String
  /**
    * The style to use when drawing line endings.
    */
  var lineCap: String
  /**
    * An array of line and gap lengths, used to create a dashed line.
    */
  var lineDash: js.Array[Double]
  /**
    * The number of CSS pixels to offset drawing of a line's dash pattern.
    */
  var lineDashOffset: Double
  /**
    * The style to use when drawing joins between line segments.
    */
  var lineJoin: String
  /**
    * The width of a line's stroke, in CSS pixels.
    */
  var lineWidth: Double
  /**
    * The stroke color of a line.
    */
  var strokeColor: String
  /**
    * The opacity of the stroke color.
    */
  var strokeOpacity: Double
}

object Style {
  @scala.inline
  def apply(
    fillColor: String,
    fillOpacity: Double,
    fillRule: String,
    lineCap: String,
    lineDash: js.Array[Double],
    lineDashOffset: Double,
    lineJoin: String,
    lineWidth: Double,
    strokeColor: String,
    strokeOpacity: Double
  ): Style = {
    val __obj = js.Dynamic.literal(fillColor = fillColor.asInstanceOf[js.Any], fillOpacity = fillOpacity.asInstanceOf[js.Any], fillRule = fillRule.asInstanceOf[js.Any], lineCap = lineCap.asInstanceOf[js.Any], lineDash = lineDash.asInstanceOf[js.Any], lineDashOffset = lineDashOffset.asInstanceOf[js.Any], lineJoin = lineJoin.asInstanceOf[js.Any], lineWidth = lineWidth.asInstanceOf[js.Any], strokeColor = strokeColor.asInstanceOf[js.Any], strokeOpacity = strokeOpacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Style]
  }
}

