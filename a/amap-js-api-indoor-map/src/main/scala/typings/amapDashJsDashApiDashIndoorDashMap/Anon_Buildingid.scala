package typings.amapDashJsDashApiDashIndoorDashMap

import typings.amapDashJsDashApi.AMapNs.LngLat
import typings.amapDashJsDashApiDashIndoorDashMap.AMapNs.IndoorMapNs.Shop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Buildingid extends js.Object {
  /**
    * 店铺所属楼宇信息
    */
  var building_id: String
  /**
    * 楼层
    */
  var floor: Double
  /**
    * 经纬度
    */
  var lnglat: LngLat
  /**
    * 商店
    */
  var shop: Shop
}

object Anon_Buildingid {
  @scala.inline
  def apply(building_id: String, floor: Double, lnglat: LngLat, shop: Shop): Anon_Buildingid = {
    val __obj = js.Dynamic.literal(building_id = building_id, floor = floor, lnglat = lnglat, shop = shop)
  
    __obj.asInstanceOf[Anon_Buildingid]
  }
}

