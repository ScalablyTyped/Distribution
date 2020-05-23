package typings.amapJsApi.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayBounds extends js.Object {
  var bounds: js.Array[LngLat]
  /**
    * 判断传入的点是否在ArrayBounds内
    * @param point 目标点
    */
  def contains(point: LocationValue): Boolean
  def getCenter(): LngLat
  // internal
  def toBounds(): Bounds
}

object ArrayBounds {
  @scala.inline
  def apply(
    bounds: js.Array[LngLat],
    contains: LocationValue => Boolean,
    getCenter: () => LngLat,
    toBounds: () => Bounds
  ): ArrayBounds = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], contains = js.Any.fromFunction1(contains), getCenter = js.Any.fromFunction0(getCenter), toBounds = js.Any.fromFunction0(toBounds))
    __obj.asInstanceOf[ArrayBounds]
  }
}

