package typings.amapDashJsDashApiDashGeocoder.AMapNs.GeocoderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReGeocodeAddressComponent extends js.Object {
  /**
    * 区域编码
    */
  var adcode: String
  /**
    * 楼/大厦
    */
  var building: String
  /**
    * 楼类型
    */
  var buildingType: String
  /**
    * 所属商圈信息
    */
  var businessAreas: js.Array[BuildingArea]
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
    * 社区类型
    */
  var neighborhood: String
  /**
    * 社区
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

object ReGeocodeAddressComponent {
  @scala.inline
  def apply(
    adcode: String,
    building: String,
    buildingType: String,
    businessAreas: js.Array[BuildingArea],
    city: String,
    citycode: String,
    district: String,
    neighborhood: String,
    neighborhoodType: String,
    province: String,
    street: String,
    streetNumber: String,
    township: String
  ): ReGeocodeAddressComponent = {
    val __obj = js.Dynamic.literal(adcode = adcode, building = building, buildingType = buildingType, businessAreas = businessAreas, city = city, citycode = citycode, district = district, neighborhood = neighborhood, neighborhoodType = neighborhoodType, province = province, street = street, streetNumber = streetNumber, township = township)
  
    __obj.asInstanceOf[ReGeocodeAddressComponent]
  }
}

