package typings.amapDashJsDashApiDashIndoorDashMap.AMapNs.IndoorMapNs

import typings.amapDashJsDashApi.AMapNs.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Building extends js.Object {
  /**
    * 所在楼层
    */
  var floor: Double
  var floor_details: FloorDetails
  /**
    * 所属楼宇ID
    */
  var id: String
  /**
    * 楼层的经纬度
    */
  var lnglat: LngLat
  /**
    * 楼层名称
    */
  var name: String
}

object Building {
  @scala.inline
  def apply(floor: Double, floor_details: FloorDetails, id: String, lnglat: LngLat, name: String): Building = {
    val __obj = js.Dynamic.literal(floor = floor, floor_details = floor_details, id = id, lnglat = lnglat, name = name)
  
    __obj.asInstanceOf[Building]
  }
}

