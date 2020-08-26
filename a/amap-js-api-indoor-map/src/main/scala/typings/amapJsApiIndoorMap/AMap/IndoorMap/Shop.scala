package typings.amapJsApiIndoorMap.AMap.IndoorMap

import typings.amapJsApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shop extends js.Object {
  /**
    * 店铺所属楼宇ID
    */
  var building_id: String = js.native
  /**
    * 分类
    */
  var category: ShopCategory = js.native
  /**
    * 店铺的id
    */
  var id: String = js.native
  /**
    * 店铺的经纬度
    */
  var lnglat: LngLat = js.native
  /**
    * 店铺名称
    */
  var name: String = js.native
  /**
    * 兴趣点ID
    */
  var poiId: String = js.native
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
  @scala.inline
  implicit class ShopOps[Self <: Shop] (val x: Self) extends AnyVal {
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
    def setBuilding_id(value: String): Self = this.set("building_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setCategory(value: ShopCategory): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLnglat(value: LngLat): Self = this.set("lnglat", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPoiId(value: String): Self = this.set("poiId", value.asInstanceOf[js.Any])
  }
  
}

