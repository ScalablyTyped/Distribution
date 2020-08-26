package typings.amapJsApiTransfer.AMap.Transfer

import typings.amapJsApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RailStop extends js.Object {
  /**
    * 上、下车站点所在城市的adcode
    */
  var adcode: String = js.native
  /**
    * 上、下车站点ID
    */
  var id: String = js.native
  /**
    * 上、下站点经纬度信息
    */
  var location: LngLat = js.native
  /**
    * 上、下车站点名称
    */
  var name: String = js.native
  var segment: js.UndefOr[RailwaySegment] = js.native
  /**
    * 上下车点发车时间
    */
  var time: Double = js.native
  @JSName("wait")
  var wait_FRailStop: js.UndefOr[Double] = js.native
}

object RailStop {
  @scala.inline
  def apply(adcode: String, id: String, location: LngLat, name: String, time: Double): RailStop = {
    val __obj = js.Dynamic.literal(adcode = adcode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[RailStop]
  }
  @scala.inline
  implicit class RailStopOps[Self <: RailStop] (val x: Self) extends AnyVal {
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
    def setAdcode(value: String): Self = this.set("adcode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation(value: LngLat): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def setSegment(value: RailwaySegment): Self = this.set("segment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegment: Self = this.set("segment", js.undefined)
    @scala.inline
    def setWait(value: Double): Self = this.set("wait", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWait: Self = this.set("wait", js.undefined)
  }
  
}

