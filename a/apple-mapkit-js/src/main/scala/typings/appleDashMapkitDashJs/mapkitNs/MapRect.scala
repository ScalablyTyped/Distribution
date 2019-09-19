package typings.appleDashMapkitDashJs.mapkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A rectangular area on a two-dimensional map projection.
  */
@JSGlobal("mapkit.MapRect")
@js.native
class MapRect protected () extends js.Object {
  /**
    * Initializes a MapRect object.
    *
    * @param x The origin point along the east-west axis of the map projection.
    * @param y The origin point along the north-south axis of the map projection.
    * @param width The distance (measured using map points) along the east-west
    * axis of the map projection.
    * @param height The distance (measured using map points) along the north-south
    * axis of the map projection.
    */
  def this(x: Double, y: Double, width: Double, height: Double) = this()
  /**
    * The maximum x-axis value of a rectangle.
    */
  var maxX: Double = js.native
  /**
    * The maximum y-axis value of a rectangle.
    */
  var maxY: Double = js.native
  /**
    * The mid-point along the x-axis of a rectangle.
    */
  var midX: Double = js.native
  /**
    * The mid-point along the y-axis of a rectangle.
    */
  var midY: Double = js.native
  /**
    * The minimum x-axis value of a rectangle.
    */
  var minX: Double = js.native
  /**
    * The minimum y-axis value of a rectangle.
    */
  var minY: Double = js.native
  /**
    * The origin point of a rectangle.
    */
  var origin: MapPoint = js.native
  /**
    * The width and height of a rectangle, starting from the origin point.
    */
  var size: MapSize = js.native
  /**
    * Returns a copy of a map rectangle.
    */
  def copy(): MapRect = js.native
  /**
    * Indicates whether two map rectangles are equal.
    *
    * @param anotherRect The map rectangle to equate to.
    */
  def equals(anotherRect: MapRect): Boolean = js.native
  /**
    * @param scaleFactor The scale factor.
    * @param scaleCenter The center map point for scaling.
    */
  def scale(scaleFactor: Double, scaleCenter: MapPoint): MapRect = js.native
  /**
    * Returns the region that corresponds to a map rectangle.
    */
  def toCoordinateRegion(): CoordinateRegion = js.native
}

