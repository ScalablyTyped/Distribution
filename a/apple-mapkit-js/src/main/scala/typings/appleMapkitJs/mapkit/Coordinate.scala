package typings.appleMapkitJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object representing the latitude and longitude for a point on the
  * Earth's surface.
  */
trait Coordinate extends js.Object {
  /**
    * The latitude in degrees.
    */
  var latitude: Double
  /**
    * The longitude in degrees.
    */
  var longitude: Double
  /**
    * Returns a copy of the coordinate.
    */
  def copy(): Coordinate
  /**
    * Returns a Boolean value indicating whether two coordinates are equal.
    */
  def equals(anotherCoordinate: Coordinate): Boolean
  /**
    * Returns the map point that corresponds to the coordinate.
    */
  def toMapPoint(): MapPoint
  /**
    * Returns the unwrapped map point that corresponds to the coordinate.
    */
  def toUnwrappedMapPoint(): MapPoint
}

object Coordinate {
  @scala.inline
  def apply(
    copy: () => Coordinate,
    equals: Coordinate => Boolean,
    latitude: Double,
    longitude: Double,
    toMapPoint: () => MapPoint,
    toUnwrappedMapPoint: () => MapPoint
  ): Coordinate = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction0(copy), equals = js.Any.fromFunction1(equals), latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], toMapPoint = js.Any.fromFunction0(toMapPoint), toUnwrappedMapPoint = js.Any.fromFunction0(toUnwrappedMapPoint))
    __obj.asInstanceOf[Coordinate]
  }
}

