package typings.appleMapkitJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A location on a map when the Earth's surface is projected onto a
  * two-dimensional surface.
  */
trait MapPoint extends js.Object {
  /**
    * The location of the point along the x-axis of the map.
    */
  var x: Double
  /**
    * The location of the point along the y-axis of the map.
    */
  var y: Double
  /**
    * Returns a copy of a map point.
    */
  def copy(): MapPoint
  /**
    * Indicates whether two map points are equal.
    *
    * @param anotherPoint A map point to use for comparison.
    */
  def equals(anotherPoint: MapPoint): Boolean
  /**
    * Returns a coordinate containing the latitude and longitude corresponding
    * to a map point.
    */
  def toCoordinate(): Coordinate
}

object MapPoint {
  @scala.inline
  def apply(
    copy: () => MapPoint,
    equals: MapPoint => Boolean,
    toCoordinate: () => Coordinate,
    x: Double,
    y: Double
  ): MapPoint = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction0(copy), equals = js.Any.fromFunction1(equals), toCoordinate = js.Any.fromFunction0(toCoordinate), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapPoint]
  }
}

