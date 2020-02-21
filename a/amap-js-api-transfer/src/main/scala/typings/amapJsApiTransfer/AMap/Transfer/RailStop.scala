package typings.amapJsApiTransfer.AMap.Transfer

import typings.amapJsApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RailStop extends js.Object {
  /**
    * 上、下车站点所在城市的adcode
    */
  var adcode: String
  /**
    * 上、下车站点ID
    */
  var id: String
  /**
    * 上、下站点经纬度信息
    */
  var location: LngLat
  /**
    * 上、下车站点名称
    */
  var name: String
  var segment: js.UndefOr[RailwaySegment] = js.undefined
  /**
    * 上下车点发车时间
    */
  var time: Double
  @JSName("wait")
  var wait_FRailStop: js.UndefOr[Double] = js.undefined
}

object RailStop {
  @scala.inline
  def apply(
    adcode: String,
    id: String,
    location: LngLat,
    name: String,
    time: Double,
    segment: RailwaySegment = null,
    wait: Int | Double = null
  ): RailStop = {
    val __obj = js.Dynamic.literal(adcode = adcode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    if (segment != null) __obj.updateDynamic("segment")(segment.asInstanceOf[js.Any])
    if (wait != null) __obj.updateDynamic("wait")(wait.asInstanceOf[js.Any])
    __obj.asInstanceOf[RailStop]
  }
}

