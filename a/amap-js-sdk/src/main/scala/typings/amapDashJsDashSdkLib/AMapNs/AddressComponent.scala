package typings
package amapDashJsDashSdkLib.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddressComponent extends js.Object {
  var adcode: java.lang.String
  var building: java.lang.String
  var buildingType: java.lang.String
  var businessAreas: js.Array[BusinessArea]
  var city: java.lang.String
  var citycode: java.lang.String
  var district: java.lang.String
  var neighborhood: java.lang.String
  var neighborhoodType: java.lang.String
  var province: java.lang.String
  var street: java.lang.String
  var streetNumber: java.lang.String
  var township: java.lang.String
}

object AddressComponent {
  @scala.inline
  def apply(
    adcode: java.lang.String,
    building: java.lang.String,
    buildingType: java.lang.String,
    businessAreas: js.Array[BusinessArea],
    city: java.lang.String,
    citycode: java.lang.String,
    district: java.lang.String,
    neighborhood: java.lang.String,
    neighborhoodType: java.lang.String,
    province: java.lang.String,
    street: java.lang.String,
    streetNumber: java.lang.String,
    township: java.lang.String
  ): AddressComponent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("adcode")(adcode)
    __obj.updateDynamic("building")(building)
    __obj.updateDynamic("buildingType")(buildingType)
    __obj.updateDynamic("businessAreas")(businessAreas)
    __obj.updateDynamic("city")(city)
    __obj.updateDynamic("citycode")(citycode)
    __obj.updateDynamic("district")(district)
    __obj.updateDynamic("neighborhood")(neighborhood)
    __obj.updateDynamic("neighborhoodType")(neighborhoodType)
    __obj.updateDynamic("province")(province)
    __obj.updateDynamic("street")(street)
    __obj.updateDynamic("streetNumber")(streetNumber)
    __obj.updateDynamic("township")(township)
    __obj.asInstanceOf[AddressComponent]
  }
}

