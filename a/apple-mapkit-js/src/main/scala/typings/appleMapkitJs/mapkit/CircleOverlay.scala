package typings.appleMapkitJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A circular overlay with a configurable radius, centered on a specific
  * geographic coordinate.
  */
@JSGlobal("mapkit.CircleOverlay")
@js.native
class CircleOverlay protected () extends Overlay {
  /**
    * Creates a circle overlay with a center coordinate, radius, and style options.
    *
    * @param coordinate The coordinate of the circle's center.
    * @param radius The circle's radius, in meters.
    * @param options An object literal of Overlay properties used to initialize
    * the circle.
    */
  def this(coordinate: Coordinate, radius: Double) = this()
  def this(coordinate: Coordinate, radius: Double, options: StylesOverlayOptions) = this()
  /**
    * The coordinate of the circle overlay's center.
    */
  var coordinate: Coordinate = js.native
  /**
    * The circle overlay's radius in meters.
    */
  var radius: Double = js.native
}

