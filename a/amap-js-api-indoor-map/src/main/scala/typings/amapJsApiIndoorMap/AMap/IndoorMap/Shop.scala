package typings.amapJsApiIndoorMap.AMap.IndoorMap

import typings.amapJsApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Shop extends js.Object {
  /**
    * 店铺所属楼宇ID
    */
  var building_id: String
  /**
    * 分类
    */
  var category: ShopCategory
  /**
    * 店铺的id
    */
  var id: String
  /**
    * 店铺的经纬度
    */
  var lnglat: LngLat
  /**
    * 店铺名称
    */
  var name: String
  /**
    * 兴趣点ID
    */
  var poiId: String
}

object Shop {
  @scala.inline
  def apply(
    building_id: String,
    category: ShopCategory,
    id: String,
    lnglat: LngLat,
    name: String,
    poiId: String
  ): Shop = {
    val __obj = js.Dynamic.literal(building_id = building_id.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lnglat = lnglat.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], poiId = poiId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Shop]
  }
}

