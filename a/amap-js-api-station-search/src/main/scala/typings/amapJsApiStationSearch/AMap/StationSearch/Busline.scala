package typings.amapJsApiStationSearch.AMap.StationSearch

import typings.amapJsApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Busline extends js.Object {
  /**
    * 首发站名称
    */
  var end_stop: String
  /**
    * 公交线路id，该id是唯一标识
    */
  var id: String
  /**
    * 公交线路途经此站的经纬度
    */
  var location: LngLat
  /**
    * 公交线路名称
    */
  var name: String
  /**
    * 首发站名称
    */
  var start_stop: String
}

object Busline {
  @scala.inline
  def apply(end_stop: String, id: String, location: LngLat, name: String, start_stop: String): Busline = {
    val __obj = js.Dynamic.literal(end_stop = end_stop.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start_stop = start_stop.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Busline]
  }
}

