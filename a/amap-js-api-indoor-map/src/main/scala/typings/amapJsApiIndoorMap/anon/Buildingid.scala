package typings.amapJsApiIndoorMap.anon

import typings.amapJsApi.AMap.LngLat
import typings.amapJsApiIndoorMap.AMap.IndoorMap.Shop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Buildingid extends js.Object {
  /**
    * 店铺所属楼宇信息
    */
  var building_id: String = js.native
  /**
    * 楼层
    */
  var floor: Double = js.native
  /**
    * 经纬度
    */
  var lnglat: LngLat = js.native
  /**
    * 商店
    */
  var shop: Shop = js.native
}

object Buildingid {
  @scala.inline
  def apply(building_id: String, floor: Double, lnglat: LngLat, shop: Shop): Buildingid = {
    val __obj = js.Dynamic.literal(building_id = building_id.asInstanceOf[js.Any], floor = floor.asInstanceOf[js.Any], lnglat = lnglat.asInstanceOf[js.Any], shop = shop.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buildingid]
  }
  @scala.inline
  implicit class BuildingidOps[Self <: Buildingid] (val x: Self) extends AnyVal {
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
    def setFloor(value: Double): Self = this.set("floor", value.asInstanceOf[js.Any])
    @scala.inline
    def setLnglat(value: LngLat): Self = this.set("lnglat", value.asInstanceOf[js.Any])
    @scala.inline
    def setShop(value: Shop): Self = this.set("shop", value.asInstanceOf[js.Any])
  }
  
}

