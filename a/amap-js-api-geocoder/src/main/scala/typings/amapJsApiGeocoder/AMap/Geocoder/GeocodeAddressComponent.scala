package typings.amapJsApiGeocoder.AMap.Geocoder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeocodeAddressComponent extends js.Object {
  /**
    * 楼/大厦
    */
  var building: String = js.native
  /**
    * 楼类型
    */
  var buildingType: String = js.native
  /**
    * 城市
    */
  var city: String = js.native
  /**
    * 城市编码
    */
  var citycode: String = js.native
  /**
    * 区
    */
  var district: String = js.native
  /**
    * 社区
    */
  var neighborhood: String = js.native
  /**
    * 社区类型
    */
  var neighborhoodType: String = js.native
  /**
    * 省
    */
  var province: String = js.native
  /**
    * 街道
    */
  var street: String = js.native
  /**
    * 门牌号
    */
  var streetNumber: String = js.native
  /**
    * 乡镇
    */
  var township: String = js.native
}

object GeocodeAddressComponent {
  @scala.inline
  def apply(
    building: String,
    buildingType: String,
    city: String,
    citycode: String,
    district: String,
    neighborhood: String,
    neighborhoodType: String,
    province: String,
    street: String,
    streetNumber: String,
    township: String
  ): GeocodeAddressComponent = {
    val __obj = js.Dynamic.literal(building = building.asInstanceOf[js.Any], buildingType = buildingType.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], citycode = citycode.asInstanceOf[js.Any], district = district.asInstanceOf[js.Any], neighborhood = neighborhood.asInstanceOf[js.Any], neighborhoodType = neighborhoodType.asInstanceOf[js.Any], province = province.asInstanceOf[js.Any], street = street.asInstanceOf[js.Any], streetNumber = streetNumber.asInstanceOf[js.Any], township = township.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeocodeAddressComponent]
  }
  @scala.inline
  implicit class GeocodeAddressComponentOps[Self <: GeocodeAddressComponent] (val x: Self) extends AnyVal {
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
    def setBuilding(value: String): Self = this.set("building", value.asInstanceOf[js.Any])
    @scala.inline
    def setBuildingType(value: String): Self = this.set("buildingType", value.asInstanceOf[js.Any])
    @scala.inline
    def setCity(value: String): Self = this.set("city", value.asInstanceOf[js.Any])
    @scala.inline
    def setCitycode(value: String): Self = this.set("citycode", value.asInstanceOf[js.Any])
    @scala.inline
    def setDistrict(value: String): Self = this.set("district", value.asInstanceOf[js.Any])
    @scala.inline
    def setNeighborhood(value: String): Self = this.set("neighborhood", value.asInstanceOf[js.Any])
    @scala.inline
    def setNeighborhoodType(value: String): Self = this.set("neighborhoodType", value.asInstanceOf[js.Any])
    @scala.inline
    def setProvince(value: String): Self = this.set("province", value.asInstanceOf[js.Any])
    @scala.inline
    def setStreet(value: String): Self = this.set("street", value.asInstanceOf[js.Any])
    @scala.inline
    def setStreetNumber(value: String): Self = this.set("streetNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setTownship(value: String): Self = this.set("township", value.asInstanceOf[js.Any])
  }
  
}

