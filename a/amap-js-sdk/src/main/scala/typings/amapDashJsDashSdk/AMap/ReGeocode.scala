package typings.amapDashJsDashSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReGeocode extends js.Object {
  var addressComponent: AddressComponent
  var crosses: js.Array[Cross]
  var formattedAddress: String
  var pois: js.Array[ReGeocodePoi]
  var roads: js.Array[Road]
}

object ReGeocode {
  @scala.inline
  def apply(
    addressComponent: AddressComponent,
    crosses: js.Array[Cross],
    formattedAddress: String,
    pois: js.Array[ReGeocodePoi],
    roads: js.Array[Road]
  ): ReGeocode = {
    val __obj = js.Dynamic.literal(addressComponent = addressComponent.asInstanceOf[js.Any], crosses = crosses.asInstanceOf[js.Any], formattedAddress = formattedAddress.asInstanceOf[js.Any], pois = pois.asInstanceOf[js.Any], roads = roads.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReGeocode]
  }
}

