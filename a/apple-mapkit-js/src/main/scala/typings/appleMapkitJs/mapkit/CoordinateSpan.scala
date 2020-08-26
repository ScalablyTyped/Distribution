package typings.appleMapkitJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The width and height of a map region.
  */
@js.native
trait CoordinateSpan extends js.Object {
  /**
    * The amount of north-to-south distance (measured in degrees) to display on
    * the map.
    */
  var latitudeDelta: Double = js.native
  /**
    * The amount of east-to-west distance (measured in degrees) to display for
    * the map region.
    */
  var longitudeDelta: Double = js.native
  /**
    * Returns a copy of the coordinate span.
    */
  def copy(): CoordinateSpan = js.native
  /**
    * Returns a Boolean value that indicates whether two spans are equal.
    */
  def equals(anotherSpan: CoordinateSpan): Boolean = js.native
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
  @scala.inline
  implicit class CoordinateSpanOps[Self <: CoordinateSpan] (val x: Self) extends AnyVal {
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
    def setCopy(value: () => CoordinateSpan): Self = this.set("copy", js.Any.fromFunction0(value))
    @scala.inline
    def setEquals(value: CoordinateSpan => Boolean): Self = this.set("equals", js.Any.fromFunction1(value))
    @scala.inline
    def setLatitudeDelta(value: Double): Self = this.set("latitudeDelta", value.asInstanceOf[js.Any])
    @scala.inline
    def setLongitudeDelta(value: Double): Self = this.set("longitudeDelta", value.asInstanceOf[js.Any])
  }
  
}

