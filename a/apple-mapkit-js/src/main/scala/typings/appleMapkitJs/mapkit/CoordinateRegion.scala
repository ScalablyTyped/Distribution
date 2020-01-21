package typings.appleMapkitJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A rectangular area on a map defined by a center coordinate and a span,
  * expressed in degrees of latitude and longitude.
  */
@JSGlobal("mapkit.CoordinateRegion")
@js.native
class CoordinateRegion protected () extends js.Object {
  /**
    * Creates A rectangular geographic region centered around a latitude and
    * longitude coordinate.
    *
    * @param center Coordinate that is center point of the region.
    * @param span A CoordinateSpan that represents the amount of map to
    * display. The span also defines the current zoom level used by the map object.
    */
  def this(center: Coordinate, span: CoordinateSpan) = this()
  /**
    * The center point of the region.
    */
  var center: Coordinate = js.native
  /**
    * The horizontal and vertical span representing the amount of map to display.
    */
  var span: CoordinateSpan = js.native
  /**
    * Returns a copy of the calling coordinate region.
    */
  def copy(): CoordinateRegion = js.native
  /**
    * Returns a Boolean value indicating whether two regions are equal.
    */
  def equals(anotherRegion: CoordinateRegion): Boolean = js.native
  /**
    * Returns the bounding region that corresponds to the calling coordinate region.
    */
  def toBoundingRegion(): BoundingRegion = js.native
  /**
    * Returns the map rectangle that corresponds to the calling coordinate region.
    */
  def toMapRect(): MapRect = js.native
}

