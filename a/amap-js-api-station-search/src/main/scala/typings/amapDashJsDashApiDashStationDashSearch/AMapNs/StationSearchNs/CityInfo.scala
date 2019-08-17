package typings.amapDashJsDashApiDashStationDashSearch.AMapNs.StationSearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CityInfo extends js.Object {
  /**
    * 行政区编码
    */
  var adcode: String
  /**
    * 城市编码
    */
  var citycode: String
  /**
    * 该城市的建议结果数目
    */
  var count: Double
  /**
    * 城市名称
    */
  var name: String
}

object CityInfo {
  @scala.inline
  def apply(adcode: String, citycode: String, count: Double, name: String): CityInfo = {
    val __obj = js.Dynamic.literal(adcode = adcode, citycode = citycode, count = count, name = name)
  
    __obj.asInstanceOf[CityInfo]
  }
}

