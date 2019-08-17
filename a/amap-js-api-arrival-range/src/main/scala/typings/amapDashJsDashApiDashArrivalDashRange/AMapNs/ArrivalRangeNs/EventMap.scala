package typings.amapDashJsDashApiDashArrivalDashRange.AMapNs.ArrivalRangeNs

import typings.amapDashJsDashApi.AMapNs.Event
import typings.amapDashJsDashApiDashArrivalDashRange.Anon_Info
import typings.amapDashJsDashApiDashArrivalDashRange.amapDashJsDashApiDashArrivalDashRangeStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var error: Event[
    typings.amapDashJsDashApiDashArrivalDashRange.amapDashJsDashApiDashArrivalDashRangeStrings.error, 
    Anon_Info
  ]
}

object EventMap {
  @scala.inline
  def apply(error: Event[error, Anon_Info]): EventMap = {
    val __obj = js.Dynamic.literal(error = error)
  
    __obj.asInstanceOf[EventMap]
  }
}

