package typings.appleMapkitJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A rectangular area on a two-dimensional map projection.
  */
trait MapRect extends js.Object {
  /**
    * The maximum x-axis value of a rectangle.
    */
  var maxX: Double
  /**
    * The maximum y-axis value of a rectangle.
    */
  var maxY: Double
  /**
    * The mid-point along the x-axis of a rectangle.
    */
  var midX: Double
  /**
    * The mid-point along the y-axis of a rectangle.
    */
  var midY: Double
  /**
    * The minimum x-axis value of a rectangle.
    */
  var minX: Double
  /**
    * The minimum y-axis value of a rectangle.
    */
  var minY: Double
  /**
    * The origin point of a rectangle.
    */
  var origin: MapPoint
  /**
    * The width and height of a rectangle, starting from the origin point.
    */
  var size: MapSize
  /**
    * Returns a copy of a map rectangle.
    */
  def copy(): MapRect
  /**
    * Indicates whether two map rectangles are equal.
    *
    * @param anotherRect The map rectangle to equate to.
    */
  def equals(anotherRect: MapRect): Boolean
  /**
    * @param scaleFactor The scale factor.
    * @param scaleCenter The center map point for scaling.
    */
  def scale(scaleFactor: Double, scaleCenter: MapPoint): MapRect
  /**
    * Returns the region that corresponds to a map rectangle.
    */
  def toCoordinateRegion(): CoordinateRegion
}

object MapRect {
  @scala.inline
  def apply(
    copy: () => MapRect,
    equals: MapRect => Boolean,
    maxX: Double,
    maxY: Double,
    midX: Double,
    midY: Double,
    minX: Double,
    minY: Double,
    origin: MapPoint,
    scale: (Double, MapPoint) => MapRect,
    size: MapSize,
    toCoordinateRegion: () => CoordinateRegion
  ): MapRect = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction0(copy), equals = js.Any.fromFunction1(equals), maxX = maxX.asInstanceOf[js.Any], maxY = maxY.asInstanceOf[js.Any], midX = midX.asInstanceOf[js.Any], midY = midY.asInstanceOf[js.Any], minX = minX.asInstanceOf[js.Any], minY = minY.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], scale = js.Any.fromFunction2(scale), size = size.asInstanceOf[js.Any], toCoordinateRegion = js.Any.fromFunction0(toCoordinateRegion))
    __obj.asInstanceOf[MapRect]
  }
}

