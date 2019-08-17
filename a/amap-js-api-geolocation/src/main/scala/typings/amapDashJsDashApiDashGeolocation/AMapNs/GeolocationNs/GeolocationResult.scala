package typings.amapDashJsDashApiDashGeolocation.AMapNs.GeolocationNs

import typings.amapDashJsDashApi.AMapNs.LngLat
import typings.amapDashJsDashApiDashGeocoder.AMapNs.GeocoderNs.Cross
import typings.amapDashJsDashApiDashGeocoder.AMapNs.GeocoderNs.ReGeocode
import typings.amapDashJsDashApiDashGeocoder.AMapNs.GeocoderNs.ReGeocodeAddressComponent
import typings.amapDashJsDashApiDashGeocoder.AMapNs.GeocoderNs.ReGeocodeAoi
import typings.amapDashJsDashApiDashGeocoder.AMapNs.GeocoderNs.ReGeocodePoi
import typings.amapDashJsDashApiDashGeocoder.AMapNs.GeocoderNs.Road
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
    val __obj = js.Dynamic.literal(addressComponent = addressComponent, crosses = crosses, formattedAddress = formattedAddress, info = info, isConverted = isConverted, location_type = location_type, message = message, pois = pois, position = position, roads = roads, status = status)
    if (accuracy != null) __obj.updateDynamic("accuracy")(accuracy.asInstanceOf[js.Any])
    if (aois != null) __obj.updateDynamic("aois")(aois)
    __obj.asInstanceOf[GeolocationResult]
  }
}

