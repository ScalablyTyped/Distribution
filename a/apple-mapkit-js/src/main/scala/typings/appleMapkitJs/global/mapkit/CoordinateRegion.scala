package typings.appleMapkitJs.global.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A rectangular area on a map defined by a center coordinate and a span,
  * expressed in degrees of latitude and longitude.
  */
@JSGlobal("mapkit.CoordinateRegion")
@js.native
class CoordinateRegion protected ()
  extends typings.appleMapkitJs.mapkit.CoordinateRegion {
  /**
    * Creates A rectangular geographic region centered around a latitude and
    * longitude coordinate.
    *
    * @param center Coordinate that is center point of the region.
    * @param span A CoordinateSpan that represents the amount of map to
    * display. The span also defines the current zoom level used by the map object.
    */
  def this(center: typings.appleMapkitJs.mapkit.Coordinate, span: typings.appleMapkitJs.mapkit.CoordinateSpan) = this()
}

