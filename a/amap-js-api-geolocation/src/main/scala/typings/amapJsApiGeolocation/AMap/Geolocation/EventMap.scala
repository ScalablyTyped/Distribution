package typings.amapJsApiGeolocation.AMap.Geolocation

import typings.amapJsApi.AMap.Event_
import typings.amapJsApiGeolocation.amapJsApiGeolocationStrings.complete
import typings.amapJsApiGeolocation.amapJsApiGeolocationStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var complete: Event_[
    typings.amapJsApiGeolocation.amapJsApiGeolocationStrings.complete, 
    GeolocationResult
  ]
  var error: Event_[typings.amapJsApiGeolocation.amapJsApiGeolocationStrings.error, ErrorStatus]
}

object EventMap {
  @scala.inline
  def apply(complete: Event_[complete, GeolocationResult], error: Event_[error, ErrorStatus]): EventMap = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventMap]
  }
}

