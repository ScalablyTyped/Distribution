package typings
package amapDashJsDashSdkLib.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReGeocode extends js.Object {
  var addressComponent: AddressComponent
  var crosses: js.Array[Cross]
  var formattedAddress: java.lang.String
  var pois: js.Array[ReGeocodePoi]
  var roads: js.Array[Road]
}

object ReGeocode {
  @scala.inline
  def apply(
    addressComponent: AddressComponent,
    crosses: js.Array[Cross],
    formattedAddress: java.lang.String,
    pois: js.Array[ReGeocodePoi],
    roads: js.Array[Road]
  ): ReGeocode = {
    val __obj = js.Dynamic.literal(addressComponent = addressComponent, crosses = crosses, formattedAddress = formattedAddress, pois = pois, roads = roads)
  
    __obj.asInstanceOf[ReGeocode]
  }
}

