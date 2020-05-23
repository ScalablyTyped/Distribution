package typings.appleMapkitJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A rectangular area on a map defined by a center coordinate and a span,
  * expressed in degrees of latitude and longitude.
  */
trait CoordinateRegion extends js.Object {
  /**
    * The center point of the region.
    */
  var center: Coordinate
  /**
    * The horizontal and vertical span representing the amount of map to display.
    */
  var span: CoordinateSpan
  /**
    * Returns a copy of the calling coordinate region.
    */
  def copy(): CoordinateRegion
  /**
    * Returns a Boolean value indicating whether two regions are equal.
    */
  def equals(anotherRegion: CoordinateRegion): Boolean
  /**
    * Returns the bounding region that corresponds to the calling coordinate region.
    */
  def toBoundingRegion(): BoundingRegion
  /**
    * Returns the map rectangle that corresponds to the calling coordinate region.
    */
  def toMapRect(): MapRect
}

object CoordinateRegion {
  @scala.inline
  def apply(
    center: Coordinate,
    copy: () => CoordinateRegion,
    equals: CoordinateRegion => Boolean,
    span: CoordinateSpan,
    toBoundingRegion: () => BoundingRegion,
    toMapRect: () => MapRect
  ): CoordinateRegion = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], copy = js.Any.fromFunction0(copy), equals = js.Any.fromFunction1(equals), span = span.asInstanceOf[js.Any], toBoundingRegion = js.Any.fromFunction0(toBoundingRegion), toMapRect = js.Any.fromFunction0(toMapRect))
    __obj.asInstanceOf[CoordinateRegion]
  }
}

