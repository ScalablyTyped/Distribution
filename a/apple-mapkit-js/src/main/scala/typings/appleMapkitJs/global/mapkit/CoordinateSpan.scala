package typings.appleMapkitJs.global.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The width and height of a map region.
  */
@JSGlobal("mapkit.CoordinateSpan")
@js.native
class CoordinateSpan protected ()
  extends typings.appleMapkitJs.mapkit.CoordinateSpan {
  /**
    * Creates a new coordinate span object with the specified latitude and
    * longitude deltas.
    *
    * @param latitudeDelta The amount of north-to-south distance (measured in
    * degrees) to display on the map.
    * @param longitudeDelta The amount of east-to-west distance (measured in
    * degrees) to display for the map region.
    */
  def this(latitudeDelta: Double, longitudeDelta: Double) = this()
  /**
    * The amount of north-to-south distance (measured in degrees) to display on
    * the map.
    */
  /* CompleteClass */
  override var latitudeDelta: Double = js.native
  /**
    * The amount of east-to-west distance (measured in degrees) to display for
    * the map region.
    */
  /* CompleteClass */
  override var longitudeDelta: Double = js.native
  /**
    * Returns a copy of the coordinate span.
    */
  /* CompleteClass */
  override def copy(): typings.appleMapkitJs.mapkit.CoordinateSpan = js.native
  /**
    * Returns a Boolean value that indicates whether two spans are equal.
    */
  /* CompleteClass */
  override def equals(anotherSpan: typings.appleMapkitJs.mapkit.CoordinateSpan): Boolean = js.native
}

