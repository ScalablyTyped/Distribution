package typings.amapDashJsDashApi.AMap.ContextMenu

import typings.amapDashJsDashApi.AMap.Event
import typings.amapDashJsDashApi.Anon_Target
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.close
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.items
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap[I] extends js.Object {
  var close: Event[typings.amapDashJsDashApi.amapDashJsDashApiStrings.close, Anon_Target[I]]
  var items: Event[
    typings.amapDashJsDashApi.amapDashJsDashApiStrings.items, 
    js.UndefOr[scala.Nothing]
  ]
  var open: Event[typings.amapDashJsDashApi.amapDashJsDashApiStrings.open, Anon_Target[I]]
}

object EventMap {
  @scala.inline
  def apply[I](
    close: Event[close, Anon_Target[I]],
    items: Event[items, js.UndefOr[scala.Nothing]],
    open: Event[open, Anon_Target[I]]
  ): EventMap[I] = {
    val __obj = js.Dynamic.literal(close = close, items = items, open = open)
  
    __obj.asInstanceOf[EventMap[I]]
  }
}

