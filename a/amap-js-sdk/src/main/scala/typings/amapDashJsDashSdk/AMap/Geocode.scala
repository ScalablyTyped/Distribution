package typings.amapDashJsDashSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Geocode extends js.Object {
  var adcode: String
  var addressComponent: AddressComponent
  var formattedAddress: String
  var level: String
  var location: LngLat
}

object Geocode {
  @scala.inline
  def apply(
    adcode: String,
    addressComponent: AddressComponent,
    formattedAddress: String,
    level: String,
    location: LngLat
  ): Geocode = {
    val __obj = js.Dynamic.literal(adcode = adcode, addressComponent = addressComponent, formattedAddress = formattedAddress, level = level, location = location)
  
    __obj.asInstanceOf[Geocode]
  }
}

