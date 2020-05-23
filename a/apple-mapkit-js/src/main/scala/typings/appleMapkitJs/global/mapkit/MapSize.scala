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
  /**
    * The height value, in map point units.
    */
  /* CompleteClass */
  override var height: Double = js.native
  /**
    * The width value, in map point units.
    */
  /* CompleteClass */
  override var width: Double = js.native
  /**
    * Returns a copy of a map size.
    */
  /* CompleteClass */
  override def copy(): typings.appleMapkitJs.mapkit.MapSize = js.native
  /**
    * Indicates whether two map sizes are equal.
    *
    * @param anotherSize The map size to equate to.
    */
  /* CompleteClass */
  override def equals(anotherSize: typings.appleMapkitJs.mapkit.MapSize): Boolean = js.native
}

