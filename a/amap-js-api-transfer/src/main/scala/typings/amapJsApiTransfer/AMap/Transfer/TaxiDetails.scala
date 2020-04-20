package typings.amapJsApiTransfer.AMap.Transfer

import typings.amapJsApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaxiDetails extends js.Object {
  /**
    * 打车终点坐标
    */
  var destination: LngLat
  /**
    * 该方案的总距离，单位：米
    */
  var distance: Double
  /**
    * 打车起点坐标
    */
  var origin: LngLat
  /**
    * 起点名称
    */
  var sname: String
  /**
    * 耗时，单位：秒
    */
  var time: Double
  /**
    * 终点名称
    */
  var tname: String
}

object TaxiDetails {
  @scala.inline
  def apply(destination: LngLat, distance: Double, origin: LngLat, sname: String, time: Double, tname: String): TaxiDetails = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], sname = sname.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], tname = tname.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaxiDetails]
  }
}

