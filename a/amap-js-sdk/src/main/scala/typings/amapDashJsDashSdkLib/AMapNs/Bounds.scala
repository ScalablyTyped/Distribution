package typings
package amapDashJsDashSdkLib.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 地物对象的经纬度矩形范围
  */
@JSGlobal("AMap.Bounds")
@js.native
class Bounds protected () extends js.Object {
  /**
    * 构造一个矩形范围
    * @param southWest 西南角经纬度坐标
    * @param northEast 东北角经纬度坐标
    */
  def this(southWest: LngLat, northEast: LngLat) = this()
  /**
    * 判断指定点坐标是否在矩形范围内
    * @param point 指定点
    */
  def contains(point: LngLat): scala.Boolean = js.native
  /**
    * 获取当前Bounds的中心点经纬度坐标
    */
  def getCenter(): LngLat = js.native
  /**
    * 获取东北角坐标
    */
  def getNorthEast(): LngLat = js.native
  /**
    * 获取西南角坐标
    */
  def getSouthWest(): LngLat = js.native
}

