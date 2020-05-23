package typings.amapJsApi.anon

import typings.amapJsApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined amap-js-api.AMap.LngLat & {  controlPoints  :std.Array<amap-js-api.AMap.LngLat>} */
@js.native
trait LngLatcontrolPointsArrayL extends js.Object {
  var controlPoints: js.Array[LngLat] = js.native
  // internal
  def add(lnglat: LngLat): LngLat = js.native
  def add(lnglat: LngLat, noAutofix: Boolean): LngLat = js.native
  def distance(lnglat: js.Array[LngLat]): Double = js.native
  /**
    * 当前经纬度和传入经纬度或者经纬度数组连线之间的地面距离，单位为米
    * @param lnglat 对比目标
    */
  def distance(lnglat: LngLat): Double = js.native
  def divideBy(num: Double): LngLat = js.native
  def divideBy(num: Double, noAutofix: Boolean): LngLat = js.native
  /**
    * 判断当前坐标对象与传入坐标对象是否相等
    * @param lnglat 判断目标
    */
  def equals(lnglat: LngLat): Boolean = js.native
  /**
    * 获取纬度值
    */
  def getLat(): Double = js.native
  /**
    * 获取经度值
    */
  def getLng(): Double = js.native
  def multiplyBy(num: Double): LngLat = js.native
  def multiplyBy(num: Double, noAutofix: Boolean): LngLat = js.native
  /**
    * 移动当前经纬度坐标得到新的坐标
    * @param east 移动经度，向右为正值
    * @param north 移动维度，向上为正值
    */
  def offset(east: Double, north: Double): LngLat = js.native
  def subtract(lnglat: LngLat): LngLat = js.native
  def subtract(lnglat: LngLat, noAutofix: Boolean): LngLat = js.native
}

