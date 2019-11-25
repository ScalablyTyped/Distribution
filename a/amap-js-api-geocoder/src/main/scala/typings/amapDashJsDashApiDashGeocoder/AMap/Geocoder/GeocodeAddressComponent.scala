package typings.amapDashJsDashApiDashGeocoder.AMap.Geocoder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeocodeAddressComponent extends js.Object {
  /**
    * 楼/大厦
    */
  var building: String
  /**
    * 楼类型
    */
  var buildingType: String
  /**
    * 城市
    */
  var city: String
  /**
    * 城市编码
    */
  var citycode: String
  /**
    * 区
    */
  var district: String
  /**
    * 社区
    */
  var neighborhood: String
  /**
    * 社区类型
    */
  var neighborhoodType: String
  /**
    * 省
    */
  var province: String
  /**
    * 街道
    */
  var street: String
  /**
    * 门牌号
    */
  var streetNumber: String
  /**
    * 乡镇
    */
  var township: String
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
}

