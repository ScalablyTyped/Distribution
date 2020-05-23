package typings.appleMapkitJs.global.mapkit

import typings.appleMapkitJs.mapkit.StyleConstructorOptions
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
class Style ()
  extends typings.appleMapkitJs.mapkit.Style {
  def this(options: StyleConstructorOptions) = this()
  /**
    * The fill color of a shape.
    */
  /* CompleteClass */
  override var fillColor: String = js.native
  /**
    * The opacity of the fill color.
    */
  /* CompleteClass */
  override var fillOpacity: Double = js.native
  /**
    * A rule for determining whether a point is inside or outside a polygon.
    */
  /* CompleteClass */
  override var fillRule: String = js.native
  /**
    * The style to use when drawing line endings.
    */
  /* CompleteClass */
  override var lineCap: String = js.native
  /**
    * An array of line and gap lengths, used to create a dashed line.
    */
  /* CompleteClass */
  override var lineDash: js.Array[Double] = js.native
  /**
    * The number of CSS pixels to offset drawing of a line's dash pattern.
    */
  /* CompleteClass */
  override var lineDashOffset: Double = js.native
  /**
    * The style to use when drawing joins between line segments.
    */
  /* CompleteClass */
  override var lineJoin: String = js.native
  /**
    * The width of a line's stroke, in CSS pixels.
    */
  /* CompleteClass */
  override var lineWidth: Double = js.native
  /**
    * The stroke color of a line.
    */
  /* CompleteClass */
  override var strokeColor: String = js.native
  /**
    * The opacity of the stroke color.
    */
  /* CompleteClass */
  override var strokeOpacity: Double = js.native
}

