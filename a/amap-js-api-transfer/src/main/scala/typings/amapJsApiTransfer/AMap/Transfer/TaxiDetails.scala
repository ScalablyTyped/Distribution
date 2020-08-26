package typings.amapJsApiTransfer.AMap.Transfer

import typings.amapJsApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaxiDetails extends js.Object {
  /**
    * 打车终点坐标
    */
  var destination: LngLat = js.native
  /**
    * 该方案的总距离，单位：米
    */
  var distance: Double = js.native
  /**
    * 打车起点坐标
    */
  var origin: LngLat = js.native
  /**
    * 起点名称
    */
  var sname: String = js.native
  /**
    * 耗时，单位：秒
    */
  var time: Double = js.native
  /**
    * 终点名称
    */
  var tname: String = js.native
}

object TaxiDetails {
  @scala.inline
  def apply(destination: LngLat, distance: Double, origin: LngLat, sname: String, time: Double, tname: String): TaxiDetails = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], sname = sname.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], tname = tname.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaxiDetails]
  }
  @scala.inline
  implicit class TaxiDetailsOps[Self <: TaxiDetails] (val x: Self) extends AnyVal {
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
    def setDestination(value: LngLat): Self = this.set("destination", value.asInstanceOf[js.Any])
    @scala.inline
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrigin(value: LngLat): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def setSname(value: String): Self = this.set("sname", value.asInstanceOf[js.Any])
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def setTname(value: String): Self = this.set("tname", value.asInstanceOf[js.Any])
  }
  
}

