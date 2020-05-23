package typings.appleMapkitJs.global.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object representing the latitude and longitude for a point on the
  * Earth's surface.
  */
@JSGlobal("mapkit.Coordinate")
@js.native
class Coordinate protected ()
  extends typings.appleMapkitJs.mapkit.Coordinate {
  /**
    * Creates a coordinate object with the specified latitude and longitude.
    */
  def this(latitude: Double, longitude: Double) = this()
  /**
    * The latitude in degrees.
    */
  /* CompleteClass */
  override var latitude: Double = js.native
  /**
    * The longitude in degrees.
    */
  /* CompleteClass */
  override var longitude: Double = js.native
  /**
    * Returns a copy of the coordinate.
    */
  /* CompleteClass */
  override def copy(): typings.appleMapkitJs.mapkit.Coordinate = js.native
  /**
    * Returns a Boolean value indicating whether two coordinates are equal.
    */
  /* CompleteClass */
  override def equals(anotherCoordinate: typings.appleMapkitJs.mapkit.Coordinate): Boolean = js.native
  /**
    * Returns the map point that corresponds to the coordinate.
    */
  /* CompleteClass */
  override def toMapPoint(): typings.appleMapkitJs.mapkit.MapPoint = js.native
  /**
    * Returns the unwrapped map point that corresponds to the coordinate.
    */
  /* CompleteClass */
  override def toUnwrappedMapPoint(): typings.appleMapkitJs.mapkit.MapPoint = js.native
}

