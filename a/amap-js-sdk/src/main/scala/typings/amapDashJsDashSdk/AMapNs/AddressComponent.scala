package typings.amapDashJsDashSdk.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddressComponent extends js.Object {
  var adcode: String
  var building: String
  var buildingType: String
  var businessAreas: js.Array[BusinessArea]
  var city: String
  var citycode: String
  var district: String
  var neighborhood: String
  var neighborhoodType: String
  var province: String
  var street: String
  var streetNumber: String
  var township: String
}

object AddressComponent {
  @scala.inline
  def apply(
    adcode: String,
    building: String,
    buildingType: String,
    businessAreas: js.Array[BusinessArea],
    city: String,
    citycode: String,
    district: String,
    neighborhood: String,
    neighborhoodType: String,
    province: String,
    street: String,
    streetNumber: String,
    township: String
  ): AddressComponent = {
    val __obj = js.Dynamic.literal(adcode = adcode, building = building, buildingType = buildingType, businessAreas = businessAreas, city = city, citycode = citycode, district = district, neighborhood = neighborhood, neighborhoodType = neighborhoodType, province = province, street = street, streetNumber = streetNumber, township = township)
  
    __obj.asInstanceOf[AddressComponent]
  }
}

