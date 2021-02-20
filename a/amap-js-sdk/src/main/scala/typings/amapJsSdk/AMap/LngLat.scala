package typings.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 经纬度坐标，确定地图上的一个点
  */
@js.native
trait LngLat extends StObject {
  
  def distance(lnglat: js.Tuple2[Double, Double]): Double = js.native
  /**
    * 计算当前经纬度和传入经纬度或者经纬度数组连线之间的地面距离，单位为米
    *
    * @param lnglat 传入的经纬度
    */
  def distance(lnglat: LngLat): Double = js.native
  
  /**
    * 判断当前坐标对象与传入坐标对象是否相等
    *
    * @param lnglat 传入坐标对象
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
  
  /**
    * 当前经纬度坐标值经度移动w，纬度移动s，得到新的坐标。
    *
    * @param w 经度，向右移为正值，单位：米
    * @param s 纬度，向上移为正值，单位：米
    */
  def offset(w: Double, s: Double): LngLat = js.native
}
