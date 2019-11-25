package typings.amapDashJsDashApi.AMap.InfoWindow

import typings.amapDashJsDashApi.AMap.Event
import typings.amapDashJsDashApi.Anon_Target
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.change
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.close
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap[I] extends js.Object {
  var change: Event[typings.amapDashJsDashApi.amapDashJsDashApiStrings.change, Anon_Target[I]]
  var close: Event[typings.amapDashJsDashApi.amapDashJsDashApiStrings.close, Anon_Target[I]]
  var open: Event[typings.amapDashJsDashApi.amapDashJsDashApiStrings.open, Anon_Target[I]]
}

object EventMap {
  @scala.inline
  def apply[I](
    change: Event[change, Anon_Target[I]],
    close: Event[close, Anon_Target[I]],
    open: Event[open, Anon_Target[I]]
  ): EventMap[I] = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventMap[I]]
  }
}

