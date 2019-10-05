package typings.amapDashJsDashApiDashIndoorDashMap.AMap.IndoorMap

import typings.amapDashJsDashApi.AMap.Event
import typings.amapDashJsDashApiDashIndoorDashMap.amapDashJsDashApiDashIndoorDashMapStrings.click
import typings.amapDashJsDashApiDashIndoorDashMap.amapDashJsDashApiDashIndoorDashMapStrings.complete
import typings.amapDashJsDashApiDashIndoorDashMap.amapDashJsDashApiDashIndoorDashMapStrings.floor_complete
import typings.amapDashJsDashApiDashIndoorDashMap.amapDashJsDashApiDashIndoorDashMapStrings.mouseout
import typings.amapDashJsDashApiDashIndoorDashMap.amapDashJsDashApiDashIndoorDashMapStrings.mouseover
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var click: MouseEvent[
    typings.amapDashJsDashApiDashIndoorDashMap.amapDashJsDashApiDashIndoorDashMapStrings.click
  ]
  var complete: Event[
    typings.amapDashJsDashApiDashIndoorDashMap.amapDashJsDashApiDashIndoorDashMapStrings.complete, 
    js.UndefOr[scala.Nothing]
  ]
  var floor_complete: Event[
    typings.amapDashJsDashApiDashIndoorDashMap.amapDashJsDashApiDashIndoorDashMapStrings.floor_complete, 
    SearchResult
  ]
  var mouseout: MouseEvent[
    typings.amapDashJsDashApiDashIndoorDashMap.amapDashJsDashApiDashIndoorDashMapStrings.mouseout
  ]
  var mouseover: MouseEvent[
    typings.amapDashJsDashApiDashIndoorDashMap.amapDashJsDashApiDashIndoorDashMapStrings.mouseover
  ]
}

object EventMap {
  @scala.inline
  def apply(
    click: MouseEvent[click],
    complete: Event[complete, js.UndefOr[scala.Nothing]],
    floor_complete: Event[floor_complete, SearchResult],
    mouseout: MouseEvent[mouseout],
    mouseover: MouseEvent[mouseover]
  ): EventMap = {
    val __obj = js.Dynamic.literal(click = click, complete = complete, floor_complete = floor_complete, mouseout = mouseout, mouseover = mouseover)
  
    __obj.asInstanceOf[EventMap]
  }
}

