package typings
package amapDashJsDashSdkLib.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Geocode extends js.Object {
  var adcode: java.lang.String
  var addressComponent: AddressComponent
  var formattedAddress: java.lang.String
  var level: java.lang.String
  var location: LngLat
}

object Geocode {
  @scala.inline
  def apply(
    adcode: java.lang.String,
    addressComponent: AddressComponent,
    formattedAddress: java.lang.String,
    level: java.lang.String,
    location: LngLat
  ): Geocode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("adcode")(adcode)
    __obj.updateDynamic("addressComponent")(addressComponent)
    __obj.updateDynamic("formattedAddress")(formattedAddress)
    __obj.updateDynamic("level")(level)
    __obj.updateDynamic("location")(location)
    __obj.asInstanceOf[Geocode]
  }
}

