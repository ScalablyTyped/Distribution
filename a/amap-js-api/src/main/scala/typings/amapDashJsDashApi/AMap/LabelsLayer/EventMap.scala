package typings.amapDashJsDashApi.AMap.LabelsLayer

import typings.amapDashJsDashApi.AMap.Event
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.click
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.mousedown
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.mousemove
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.mouseout
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.mouseover
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.mouseup
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.touchend
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.touchstart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap[I] extends js.Object {
  var click: Event[typings.amapDashJsDashApi.amapDashJsDashApiStrings.click, LabelsLayerEvent[I]]
  var mousedown: Event[typings.amapDashJsDashApi.amapDashJsDashApiStrings.mousedown, LabelsLayerEvent[I]]
  var mousemove: Event[typings.amapDashJsDashApi.amapDashJsDashApiStrings.mousemove, LabelsLayerEvent[I]]
  var mouseout: Event[typings.amapDashJsDashApi.amapDashJsDashApiStrings.mouseout, LabelsLayerEvent[I]]
  var mouseover: Event[typings.amapDashJsDashApi.amapDashJsDashApiStrings.mouseover, LabelsLayerEvent[I]]
  var mouseup: Event[typings.amapDashJsDashApi.amapDashJsDashApiStrings.mouseup, LabelsLayerEvent[I]]
  var touchend: Event[typings.amapDashJsDashApi.amapDashJsDashApiStrings.touchend, LabelsLayerEvent[I]]
  var touchstart: Event[typings.amapDashJsDashApi.amapDashJsDashApiStrings.touchstart, LabelsLayerEvent[I]]
}

object EventMap {
  @scala.inline
  def apply[I](
    click: Event[click, LabelsLayerEvent[I]],
    mousedown: Event[mousedown, LabelsLayerEvent[I]],
    mousemove: Event[mousemove, LabelsLayerEvent[I]],
    mouseout: Event[mouseout, LabelsLayerEvent[I]],
    mouseover: Event[mouseover, LabelsLayerEvent[I]],
    mouseup: Event[mouseup, LabelsLayerEvent[I]],
    touchend: Event[touchend, LabelsLayerEvent[I]],
    touchstart: Event[touchstart, LabelsLayerEvent[I]]
  ): EventMap[I] = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventMap[I]]
  }
}

