package typings.amapJsApiGeocoder.AMap.Geocoder

import typings.amapJsApi.AMap.Event_
import typings.amapJsApiGeocoder.amapJsApiGeocoderStrings.complete
import typings.amapJsApiGeocoder.amapJsApiGeocoderStrings.error
import typings.amapJsApiGeocoder.anon.Info
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var complete: Event_[
    typings.amapJsApiGeocoder.amapJsApiGeocoderStrings.complete, 
    GeocodeResult | js.Object | ReGeocodeResult | BatchReGeocodeResult
  ]
  var error: Event_[typings.amapJsApiGeocoder.amapJsApiGeocoderStrings.error, Info]
}

object EventMap {
  @scala.inline
  def apply(
    complete: Event_[complete, GeocodeResult | js.Object | ReGeocodeResult | BatchReGeocodeResult],
    error: Event_[error, Info]
  ): EventMap = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventMap]
  }
}

