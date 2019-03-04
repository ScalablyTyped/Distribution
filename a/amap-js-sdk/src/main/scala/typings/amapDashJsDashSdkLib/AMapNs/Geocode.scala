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
    val __obj = js.Dynamic.literal(adcode = adcode, addressComponent = addressComponent, formattedAddress = formattedAddress, level = level, location = location)
  
    __obj.asInstanceOf[Geocode]
  }
}

