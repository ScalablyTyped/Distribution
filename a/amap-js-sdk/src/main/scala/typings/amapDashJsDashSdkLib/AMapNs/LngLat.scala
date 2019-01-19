package typings
package amapDashJsDashSdkLib.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 经纬度坐标，确定地图上的一个点
  */
@JSGlobal("AMap.LngLat")
@js.native
class LngLat protected () extends js.Object {
  /**
    * 构造一个地理坐标对象
    * @param lng 经度
    * @param lat 纬度
    */
  def this(lng: scala.Double, lat: scala.Double) = this()
  /**
    * 计算当前经纬度和传入经纬度或者经纬度数组连线之间的地面距离，单位为米
    *
    * @param lnglat 传入的经纬度
    */
  def distance(lnglat: LngLat): scala.Double = js.native
  def distance(lnglat: js.Tuple2[scala.Double, scala.Double]): scala.Double = js.native
  /**
    * 判断当前坐标对象与传入坐标对象是否相等
    *
    * @param lnglat 传入坐标对象
    */
  def equals(lnglat: LngLat): scala.Boolean = js.native
  /**
    * 获取纬度值
    */
  def getLat(): scala.Double = js.native
  /**
    * 获取经度值
    */
  def getLng(): scala.Double = js.native
  /**
    * 当前经纬度坐标值经度移动w，纬度移动s，得到新的坐标。
    *
    * @param w 经度，向右移为正值，单位：米
    * @param s 纬度，向上移为正值，单位：米
    */
  def offset(w: scala.Double, s: scala.Double): LngLat = js.native
}

