package typings.amapJsApiGeocoder.AMap.Geocoder

import typings.amapJsApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildingArea extends js.Object {
  /**
    * 唯一标识
    */
  var id: String = js.native
  /**
    * 中心点经纬度
    */
  var location: LngLat = js.native
  /**
    * 名称
    */
  var name: String = js.native
}

object BuildingArea {
  @scala.inline
  def apply(id: String, location: LngLat, name: String): BuildingArea = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildingArea]
  }
  @scala.inline
  implicit class BuildingAreaOps[Self <: BuildingArea] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation(value: LngLat): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

