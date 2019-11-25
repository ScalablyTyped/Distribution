package typings.amapDashJsDashApiDashRiding.AMap.Riding

import typings.amapDashJsDashApi.AMap.Event
import typings.amapDashJsDashApiDashRiding.Anon_Info
import typings.amapDashJsDashApiDashRiding.amapDashJsDashApiDashRidingStrings.complete
import typings.amapDashJsDashApiDashRiding.amapDashJsDashApiDashRidingStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var complete: Event[
    typings.amapDashJsDashApiDashRiding.amapDashJsDashApiDashRidingStrings.complete, 
    SearchResult
  ]
  var error: Event[
    typings.amapDashJsDashApiDashRiding.amapDashJsDashApiDashRidingStrings.error, 
    Anon_Info
  ]
}

object EventMap {
  @scala.inline
  def apply(complete: Event[complete, SearchResult], error: Event[error, Anon_Info]): EventMap = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventMap]
  }
}

