package typings.amapDashJsDashApi.AMap.TileLayer

import typings.amapDashJsDashApi.AMap.Event
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.complete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var complete: Event[
    typings.amapDashJsDashApi.amapDashJsDashApiStrings.complete, 
    js.UndefOr[scala.Nothing]
  ]
}

object EventMap {
  @scala.inline
  def apply(complete: Event[complete, js.UndefOr[scala.Nothing]]): EventMap = {
    val __obj = js.Dynamic.literal(complete = complete)
  
    __obj.asInstanceOf[EventMap]
  }
}

