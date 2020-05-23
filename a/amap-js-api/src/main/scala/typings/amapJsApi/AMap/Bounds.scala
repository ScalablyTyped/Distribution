package typings.amapJsApi.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bounds extends js.Object {
  /**
    * 指定点坐标是否在矩形范围内
    * @param point 制定坐标
    */
  def contains(point: LocationValue): Boolean
  /**
    * 获取当前Bounds的中心点经纬度坐标
    */
  def getCenter(): LngLat
  /**
    * 获取东北角坐标
    */
  def getNorthEast(): LngLat
  /**
    * 获取西北角坐标
    */
  def getNorthWest(): LngLat
  /**
    * 获取东南角坐标
    */
  def getSouthEast(): LngLat
  /**
    * 获取西南角坐标
    */
  def getSouthWest(): LngLat
}

object Bounds {
  @scala.inline
  def apply(
    contains: LocationValue => Boolean,
    getCenter: () => LngLat,
    getNorthEast: () => LngLat,
    getNorthWest: () => LngLat,
    getSouthEast: () => LngLat,
    getSouthWest: () => LngLat
  ): Bounds = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), getCenter = js.Any.fromFunction0(getCenter), getNorthEast = js.Any.fromFunction0(getNorthEast), getNorthWest = js.Any.fromFunction0(getNorthWest), getSouthEast = js.Any.fromFunction0(getSouthEast), getSouthWest = js.Any.fromFunction0(getSouthWest))
    __obj.asInstanceOf[Bounds]
  }
}

