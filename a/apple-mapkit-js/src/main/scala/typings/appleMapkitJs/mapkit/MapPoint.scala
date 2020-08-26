package typings.appleMapkitJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A location on a map when the Earth's surface is projected onto a
  * two-dimensional surface.
  */
@js.native
trait MapPoint extends js.Object {
  /**
    * The location of the point along the x-axis of the map.
    */
  var x: Double = js.native
  /**
    * The location of the point along the y-axis of the map.
    */
  var y: Double = js.native
  /**
    * Returns a copy of a map point.
    */
  def copy(): MapPoint = js.native
  /**
    * Indicates whether two map points are equal.
    *
    * @param anotherPoint A map point to use for comparison.
    */
  def equals(anotherPoint: MapPoint): Boolean = js.native
  /**
    * Returns a coordinate containing the latitude and longitude corresponding
    * to a map point.
    */
  def toCoordinate(): Coordinate = js.native
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
  @scala.inline
  implicit class MapPointOps[Self <: MapPoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCopy(value: () => MapPoint): Self = this.set("copy", js.Any.fromFunction0(value))
    @scala.inline
    def setEquals(value: MapPoint => Boolean): Self = this.set("equals", js.Any.fromFunction1(value))
    @scala.inline
    def setToCoordinate(value: () => Coordinate): Self = this.set("toCoordinate", js.Any.fromFunction0(value))
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

