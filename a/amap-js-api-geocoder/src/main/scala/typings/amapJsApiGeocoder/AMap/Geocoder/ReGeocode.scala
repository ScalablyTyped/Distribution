package typings.amapJsApiGeocoder.AMap.Geocoder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReGeocode extends js.Object {
  /**
    * 地址组成元素
    */
  var addressComponent: ReGeocodeAddressComponent
  var aois: js.UndefOr[js.Array[ReGeocodeAoi]] = js.undefined
  /**
    * 道路路口列表
    */
  var crosses: js.Array[Cross]
  /**
    * 格式化地址
    */
  var formattedAddress: String
  /**
    * 兴趣点列表
    */
  var pois: js.Array[ReGeocodePoi]
  /**
    * 道路信息列表
    */
  var roads: js.Array[Road]
}

object ReGeocode {
  @scala.inline
  def apply(
    addressComponent: ReGeocodeAddressComponent,
    crosses: js.Array[Cross],
    formattedAddress: String,
    pois: js.Array[ReGeocodePoi],
    roads: js.Array[Road],
    aois: js.Array[ReGeocodeAoi] = null
  ): ReGeocode = {
    val __obj = js.Dynamic.literal(addressComponent = addressComponent.asInstanceOf[js.Any], crosses = crosses.asInstanceOf[js.Any], formattedAddress = formattedAddress.asInstanceOf[js.Any], pois = pois.asInstanceOf[js.Any], roads = roads.asInstanceOf[js.Any])
    if (aois != null) __obj.updateDynamic("aois")(aois.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReGeocode]
  }
}

