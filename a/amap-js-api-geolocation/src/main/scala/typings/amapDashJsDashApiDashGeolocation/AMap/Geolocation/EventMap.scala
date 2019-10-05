package typings.amapDashJsDashApiDashGeolocation.AMap.Geolocation

import typings.amapDashJsDashApi.AMap.Event
import typings.amapDashJsDashApiDashGeolocation.amapDashJsDashApiDashGeolocationStrings.complete
import typings.amapDashJsDashApiDashGeolocation.amapDashJsDashApiDashGeolocationStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var complete: Event[
    typings.amapDashJsDashApiDashGeolocation.amapDashJsDashApiDashGeolocationStrings.complete, 
    GeolocationResult
  ]
  var error: Event[
    typings.amapDashJsDashApiDashGeolocation.amapDashJsDashApiDashGeolocationStrings.error, 
    ErrorStatus
  ]
}

object EventMap {
  @scala.inline
  def apply(complete: Event[complete, GeolocationResult], error: Event[error, ErrorStatus]): EventMap = {
    val __obj = js.Dynamic.literal(complete = complete, error = error)
  
    __obj.asInstanceOf[EventMap]
  }
}

