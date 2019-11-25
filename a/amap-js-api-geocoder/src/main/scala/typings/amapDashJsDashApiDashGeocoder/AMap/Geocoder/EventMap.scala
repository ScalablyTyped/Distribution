package typings.amapDashJsDashApiDashGeocoder.AMap.Geocoder

import typings.amapDashJsDashApi.AMap.Event
import typings.amapDashJsDashApiDashGeocoder.Anon_Info
import typings.amapDashJsDashApiDashGeocoder.amapDashJsDashApiDashGeocoderStrings.complete
import typings.amapDashJsDashApiDashGeocoder.amapDashJsDashApiDashGeocoderStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var complete: Event[
    typings.amapDashJsDashApiDashGeocoder.amapDashJsDashApiDashGeocoderStrings.complete, 
    GeocodeResult | js.Object | ReGeocodeResult | BatchReGeocodeResult
  ]
  var error: Event[
    typings.amapDashJsDashApiDashGeocoder.amapDashJsDashApiDashGeocoderStrings.error, 
    Anon_Info
  ]
}

object EventMap {
  @scala.inline
  def apply(
    complete: Event[complete, GeocodeResult | js.Object | ReGeocodeResult | BatchReGeocodeResult],
    error: Event[error, Anon_Info]
  ): EventMap = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventMap]
  }
}

