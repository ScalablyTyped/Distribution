package typings.appleMapkitJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of observable attributes for overlays, including color and opacity of
  * stroke and fill, and line styles.
  */
@JSGlobal("mapkit.Style")
@js.native
/**
  * Creates and initializes a style object.
  */
class Style () extends js.Object {
  def this(options: StyleConstructorOptions) = this()
  /**
    * The fill color of a shape.
    */
  var fillColor: String = js.native
  /**
    * The opacity of the fill color.
    */
  var fillOpacity: Double = js.native
  /**
    * A rule for determining whether a point is inside or outside a polygon.
    */
  var fillRule: String = js.native
  /**
    * The style to use when drawing line endings.
    */
  var lineCap: String = js.native
  /**
    * An array of line and gap lengths, used to create a dashed line.
    */
  var lineDash: js.Array[Double] = js.native
  /**
    * The number of CSS pixels to offset drawing of a line's dash pattern.
    */
  var lineDashOffset: Double = js.native
  /**
    * The style to use when drawing joins between line segments.
    */
  var lineJoin: String = js.native
  /**
    * The width of a line's stroke, in CSS pixels.
    */
  var lineWidth: Double = js.native
  /**
    * The stroke color of a line.
    */
  var strokeColor: String = js.native
  /**
    * The opacity of the stroke color.
    */
  var strokeOpacity: Double = js.native
}

