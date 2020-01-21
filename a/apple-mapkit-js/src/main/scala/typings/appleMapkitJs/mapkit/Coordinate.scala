package typings.appleMapkitJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object representing the latitude and longitude for a point on the
  * Earth's surface.
  */
@JSGlobal("mapkit.Coordinate")
@js.native
class Coordinate protected () extends js.Object {
  /**
    * Creates a coordinate object with the specified latitude and longitude.
    */
  def this(latitude: Double, longitude: Double) = this()
  /**
    * The latitude in degrees.
    */
  var latitude: Double = js.native
  /**
    * The longitude in degrees.
    */
  var longitude: Double = js.native
  /**
    * Returns a copy of the coordinate.
    */
  def copy(): Coordinate = js.native
  /**
    * Returns a Boolean value indicating whether two coordinates are equal.
    */
  def equals(anotherCoordinate: Coordinate): Boolean = js.native
  /**
    * Returns the map point that corresponds to the coordinate.
    */
  def toMapPoint(): MapPoint = js.native
  /**
    * Returns the unwrapped map point that corresponds to the coordinate.
    */
  def toUnwrappedMapPoint(): MapPoint = js.native
}

