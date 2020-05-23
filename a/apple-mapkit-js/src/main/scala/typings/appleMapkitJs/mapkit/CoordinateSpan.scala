package typings.appleMapkitJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The width and height of a map region.
  */
trait CoordinateSpan extends js.Object {
  /**
    * The amount of north-to-south distance (measured in degrees) to display on
    * the map.
    */
  var latitudeDelta: Double
  /**
    * The amount of east-to-west distance (measured in degrees) to display for
    * the map region.
    */
  var longitudeDelta: Double
  /**
    * Returns a copy of the coordinate span.
    */
  def copy(): CoordinateSpan
  /**
    * Returns a Boolean value that indicates whether two spans are equal.
    */
  def equals(anotherSpan: CoordinateSpan): Boolean
}

object CoordinateSpan {
  @scala.inline
  def apply(
    copy: () => CoordinateSpan,
    equals: CoordinateSpan => Boolean,
    latitudeDelta: Double,
    longitudeDelta: Double
  ): CoordinateSpan = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction0(copy), equals = js.Any.fromFunction1(equals), latitudeDelta = latitudeDelta.asInstanceOf[js.Any], longitudeDelta = longitudeDelta.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoordinateSpan]
  }
}

