package typings.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 地物对象的经纬度矩形范围
  */
trait Bounds extends js.Object {
  /**
    * 判断指定点坐标是否在矩形范围内
    * @param point 指定点
    */
  def contains(point: LngLat): Boolean
  /**
    * 获取当前Bounds的中心点经纬度坐标
    */
  def getCenter(): LngLat
  /**
    * 获取东北角坐标
    */
  def getNorthEast(): LngLat
  /**
    * 获取西南角坐标
    */
  def getSouthWest(): LngLat
}

object Bounds {
  @scala.inline
  def apply(
    contains: LngLat => Boolean,
    getCenter: () => LngLat,
    getNorthEast: () => LngLat,
    getSouthWest: () => LngLat
  ): Bounds = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), getCenter = js.Any.fromFunction0(getCenter), getNorthEast = js.Any.fromFunction0(getNorthEast), getSouthWest = js.Any.fromFunction0(getSouthWest))
    __obj.asInstanceOf[Bounds]
  }
}

