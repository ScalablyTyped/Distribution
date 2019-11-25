package typings.amapDashJsDashApiDashGeocoder.AMap.Geocoder

import typings.amapDashJsDashApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildingArea extends js.Object {
  /**
    * 唯一标识
    */
  var id: String
  /**
    * 中心点经纬度
    */
  var location: LngLat
  /**
    * 名称
    */
  var name: String
}

object BuildingArea {
  @scala.inline
  def apply(id: String, location: LngLat, name: String): BuildingArea = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BuildingArea]
  }
}

