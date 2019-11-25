package typings.amapDashJsDashApiDashIndoorDashMap.AMap.IndoorMap

import typings.amapDashJsDashApi.AMap.LngLat
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
    val __obj = js.Dynamic.literal(floor = floor.asInstanceOf[js.Any], floor_details = floor_details.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lnglat = lnglat.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Building]
  }
}

