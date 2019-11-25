package typings.amapDashJsDashApiDashDriving.AMap.Driving

import typings.amapDashJsDashApi.AMap.Event
import typings.amapDashJsDashApiDashDriving.Anon_Info
import typings.amapDashJsDashApiDashDriving.amapDashJsDashApiDashDrivingStrings.complete
import typings.amapDashJsDashApiDashDriving.amapDashJsDashApiDashDrivingStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var complete: Event[
    typings.amapDashJsDashApiDashDriving.amapDashJsDashApiDashDrivingStrings.complete, 
    SearchResult | Anon_Info
  ]
  var error: Event[
    typings.amapDashJsDashApiDashDriving.amapDashJsDashApiDashDrivingStrings.error, 
    Anon_Info
  ]
}

object EventMap {
  @scala.inline
  def apply(complete: Event[complete, SearchResult | Anon_Info], error: Event[error, Anon_Info]): EventMap = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventMap]
  }
}

