package typings.appleMapkitJs.global.mapkit

import typings.appleMapkitJs.mapkit.StylesOverlayOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An overlay made up of one or more points, forming a closed shape.
  */
@JSGlobal("mapkit.PolygonOverlay")
@js.native
class PolygonOverlay protected ()
  extends typings.appleMapkitJs.mapkit.PolygonOverlay {
  /**
    * Creates a polygon overlay with an array of points and style options.
    *
    * @param points The points in the polygon as an array of arrays of
    * Coordinate, or an array of Coordinate. If it's the latter,
    * the array is auto-wrapped by an enclosing array.
    * @param options An object literal of options with which to initialize the
    * polygon.
    */
  def this(points: js.Array[typings.appleMapkitJs.mapkit.Coordinate]) = this()
  def this(points: js.Array[typings.appleMapkitJs.mapkit.Coordinate], options: StylesOverlayOptions) = this()
}

