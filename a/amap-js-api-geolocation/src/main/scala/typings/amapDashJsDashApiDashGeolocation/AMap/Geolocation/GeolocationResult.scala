package typings.amapDashJsDashApiDashGeolocation.AMap.Geolocation

import typings.amapDashJsDashApi.AMap.LngLat
import typings.amapDashJsDashApiDashGeocoder.AMap.Geocoder.Cross
import typings.amapDashJsDashApiDashGeocoder.AMap.Geocoder.ReGeocode
import typings.amapDashJsDashApiDashGeocoder.AMap.Geocoder.ReGeocodeAddressComponent
import typings.amapDashJsDashApiDashGeocoder.AMap.Geocoder.ReGeocodeAoi
import typings.amapDashJsDashApiDashGeocoder.AMap.Geocoder.ReGeocodePoi
import typings.amapDashJsDashApiDashGeocoder.AMap.Geocoder.Road
import typings.amapDashJsDashApiDashGeolocation.amapDashJsDashApiDashGeolocationNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeolocationResult extends ReGeocode {
  /**
    * 精度
    */
  var accuracy: Double | Null
  /**
    * 状态信息
    */
  var info: String
  /**
    * 是否已经转换成高德坐标
    */
  var isConverted: Boolean
  /**
    * 定位结果的来源
    */
  var location_type: LocationType
  /**
    * 形成当前定位结果的一些信息
    */
  var message: String
  /**
    * 定位结果
    */
  var position: LngLat
  /**
    * 状态码
    */
  var status: `1`
}

object GeolocationResult {
  @scala.inline
  def apply(
    addressComponent: ReGeocodeAddressComponent,
    crosses: js.Array[Cross],
    formattedAddress: String,
    info: String,
    isConverted: Boolean,
    location_type: LocationType,
    message: String,
    pois: js.Array[ReGeocodePoi],
    position: LngLat,
    roads: js.Array[Road],
    status: `1`,
    accuracy: Int | Double = null,
    aois: js.Array[ReGeocodeAoi] = null
  ): GeolocationResult = {
    val __obj = js.Dynamic.literal(addressComponent = addressComponent.asInstanceOf[js.Any], crosses = crosses.asInstanceOf[js.Any], formattedAddress = formattedAddress.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], isConverted = isConverted.asInstanceOf[js.Any], location_type = location_type.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], pois = pois.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], roads = roads.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (accuracy != null) __obj.updateDynamic("accuracy")(accuracy.asInstanceOf[js.Any])
    if (aois != null) __obj.updateDynamic("aois")(aois.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeolocationResult]
  }
}

