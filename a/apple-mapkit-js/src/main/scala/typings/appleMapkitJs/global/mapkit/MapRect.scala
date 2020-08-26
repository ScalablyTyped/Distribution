package typings.appleMapkitJs.global.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A rectangular area on a two-dimensional map projection.
  */
@JSGlobal("mapkit.MapRect")
@js.native
class MapRect protected ()
  extends typings.appleMapkitJs.mapkit.MapRect {
  /**
    * Initializes a MapRect object.
    *
    * @param x The origin point along the east-west axis of the map projection.
    * @param y The origin point along the north-south axis of the map projection.
    * @param width The distance (measured using map points) along the east-west
    * axis of the map projection.
    * @param height The distance (measured using map points) along the north-south
    * axis of the map projection.
    */
  def this(x: Double, y: Double, width: Double, height: Double) = this()
}

