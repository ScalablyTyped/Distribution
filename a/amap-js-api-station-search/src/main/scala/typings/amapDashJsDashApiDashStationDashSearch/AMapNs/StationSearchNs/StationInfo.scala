package typings.amapDashJsDashApiDashStationDashSearch.AMapNs.StationSearchNs

import typings.amapDashJsDashApi.AMapNs.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StationInfo extends js.Object {
  /**
    * 区域编码
    */
  var adcode: String
  /**
    * 途经此站点的公交路线列表
    */
  var buslines: js.Array[Busline]
  /**
    * 城市编码
    */
  var citycode: String
  /**
    * 公交站点id，该id是唯一标识
    */
  var id: String
  /**
    * 公交站点经纬度
    */
  var location: LngLat
  /**
    * 公交站点名称
    */
  var name: String
}

object StationInfo {
  @scala.inline
  def apply(
    adcode: String,
    buslines: js.Array[Busline],
    citycode: String,
    id: String,
    location: LngLat,
    name: String
  ): StationInfo = {
    val __obj = js.Dynamic.literal(adcode = adcode, buslines = buslines, citycode = citycode, id = id, location = location, name = name)
  
    __obj.asInstanceOf[StationInfo]
  }
}

