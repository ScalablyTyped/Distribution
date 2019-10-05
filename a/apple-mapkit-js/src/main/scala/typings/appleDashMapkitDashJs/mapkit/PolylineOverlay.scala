package typings.appleDashMapkitDashJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An overlay made up of connected line segments that do not form a closed shape.
  */
@JSGlobal("mapkit.PolylineOverlay")
@js.native
class PolylineOverlay protected () extends Overlay {
  /**
    * Creates a polyline overlay with coordinate points and style options.
    *
    * @param points The points in the polyline as an array of Coordinate
    * @param options An object literal of style options with which to initialize
    * the polyline.
    */
  def this(points: js.Array[Coordinate]) = this()
  def this(points: js.Array[Coordinate], options: StylesOverlayOptions) = this()
  /**
    * An array of coordinate points that define the polyline overlay's shape.
    */
  var points: js.Array[Coordinate] = js.native
}

