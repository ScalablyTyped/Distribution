package typings.amapJsSdk.AMap

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
    val __obj = js.Dynamic.literal(adcode = adcode.asInstanceOf[js.Any], building = building.asInstanceOf[js.Any], buildingType = buildingType.asInstanceOf[js.Any], businessAreas = businessAreas.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], citycode = citycode.asInstanceOf[js.Any], district = district.asInstanceOf[js.Any], neighborhood = neighborhood.asInstanceOf[js.Any], neighborhoodType = neighborhoodType.asInstanceOf[js.Any], province = province.asInstanceOf[js.Any], street = street.asInstanceOf[js.Any], streetNumber = streetNumber.asInstanceOf[js.Any], township = township.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AddressComponent]
  }
}

