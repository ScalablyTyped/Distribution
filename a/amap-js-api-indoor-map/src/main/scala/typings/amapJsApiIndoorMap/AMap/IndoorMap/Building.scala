package typings.amapJsApiIndoorMap.AMap.IndoorMap

import typings.amapJsApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Building extends js.Object {
  /**
    * 所在楼层
    */
  var floor: Double = js.native
  var floor_details: FloorDetails = js.native
  /**
    * 所属楼宇ID
    */
  var id: String = js.native
  /**
    * 楼层的经纬度
    */
  var lnglat: LngLat = js.native
  /**
    * 楼层名称
    */
  var name: String = js.native
}

object Building {
  @scala.inline
  def apply(floor: Double, floor_details: FloorDetails, id: String, lnglat: LngLat, name: String): Building = {
    val __obj = js.Dynamic.literal(floor = floor.asInstanceOf[js.Any], floor_details = floor_details.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lnglat = lnglat.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Building]
  }
  @scala.inline
  implicit class BuildingOps[Self <: Building] (val x: Self) extends AnyVal {
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
    def setFloor(value: Double): Self = this.set("floor", value.asInstanceOf[js.Any])
    @scala.inline
    def setFloor_details(value: FloorDetails): Self = this.set("floor_details", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLnglat(value: LngLat): Self = this.set("lnglat", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

