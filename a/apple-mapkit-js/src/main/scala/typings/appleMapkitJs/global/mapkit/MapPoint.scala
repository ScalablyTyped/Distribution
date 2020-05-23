package typings.appleMapkitJs.global.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A location on a map when the Earth's surface is projected onto a
  * two-dimensional surface.
  */
@JSGlobal("mapkit.MapPoint")
@js.native
class MapPoint protected ()
  extends typings.appleMapkitJs.mapkit.MapPoint {
  /**
    * Initializes a MapPoint object.
    *
    * @param x The point along the east-west axis of the map projection.
    * @param  The point along the north-south axis of the map projection.
    */
  def this(x: Double, y: Double) = this()
  /**
    * The location of the point along the x-axis of the map.
    */
  /* CompleteClass */
  override var x: Double = js.native
  /**
    * The location of the point along the y-axis of the map.
    */
  /* CompleteClass */
  override var y: Double = js.native
  /**
    * Returns a copy of a map point.
    */
  /* CompleteClass */
  override def copy(): typings.appleMapkitJs.mapkit.MapPoint = js.native
  /**
    * Indicates whether two map points are equal.
    *
    * @param anotherPoint A map point to use for comparison.
    */
  /* CompleteClass */
  override def equals(anotherPoint: typings.appleMapkitJs.mapkit.MapPoint): Boolean = js.native
  /**
    * Returns a coordinate containing the latitude and longitude corresponding
    * to a map point.
    */
  /* CompleteClass */
  override def toCoordinate(): typings.appleMapkitJs.mapkit.Coordinate = js.native
}

