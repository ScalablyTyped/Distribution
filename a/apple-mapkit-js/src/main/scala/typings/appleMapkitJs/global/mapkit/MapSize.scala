package typings.appleMapkitJs.global.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A pair of values in map units that define the width and height of a
  * projected coordinate span.
  */
@JSGlobal("mapkit.MapSize")
@js.native
class MapSize protected ()
  extends typings.appleMapkitJs.mapkit.MapSize {
  /**
    * Initializes a MapSize object.
    *
    * @param width The distance (measured using map points) along the east-west
    * axis of the map projection.
    * @param height The distance (measured using map points) along the
    * north-south axis of the map projection.
    */
  def this(width: Double, height: Double) = this()
}

