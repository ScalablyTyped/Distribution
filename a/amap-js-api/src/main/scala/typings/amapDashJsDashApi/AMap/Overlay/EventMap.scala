package typings.amapDashJsDashApi.AMap.Overlay

import typings.amapDashJsDashApi.AMap.MapsEvent
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.click
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.dblclick
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.mousedown
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.mousemove
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.mouseover
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.mouseup
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.rightclick
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.touchend
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.touchmove
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.touchstart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap[I] extends js.Object {
  var click: MapsEvent[typings.amapDashJsDashApi.amapDashJsDashApiStrings.click, I]
  var dblclick: MapsEvent[typings.amapDashJsDashApi.amapDashJsDashApiStrings.dblclick, I]
  var mousedown: MapsEvent[typings.amapDashJsDashApi.amapDashJsDashApiStrings.mousedown, I]
  var mousemove: MapsEvent[typings.amapDashJsDashApi.amapDashJsDashApiStrings.mousemove, I]
  var mouseover: MapsEvent[typings.amapDashJsDashApi.amapDashJsDashApiStrings.mouseover, I]
  var mouseup: MapsEvent[typings.amapDashJsDashApi.amapDashJsDashApiStrings.mouseup, I]
  var rightclick: MapsEvent[typings.amapDashJsDashApi.amapDashJsDashApiStrings.rightclick, I]
  var touchend: MapsEvent[typings.amapDashJsDashApi.amapDashJsDashApiStrings.touchend, I]
  var touchmove: MapsEvent[typings.amapDashJsDashApi.amapDashJsDashApiStrings.touchmove, I]
  var touchstart: MapsEvent[typings.amapDashJsDashApi.amapDashJsDashApiStrings.touchstart, I]
}

object EventMap {
  @scala.inline
  def apply[I](
    click: MapsEvent[click, I],
    dblclick: MapsEvent[dblclick, I],
    mousedown: MapsEvent[mousedown, I],
    mousemove: MapsEvent[mousemove, I],
    mouseover: MapsEvent[mouseover, I],
    mouseup: MapsEvent[mouseup, I],
    rightclick: MapsEvent[rightclick, I],
    touchend: MapsEvent[touchend, I],
    touchmove: MapsEvent[touchmove, I],
    touchstart: MapsEvent[touchstart, I]
  ): EventMap[I] = {
    val __obj = js.Dynamic.literal(click = click, dblclick = dblclick, mousedown = mousedown, mousemove = mousemove, mouseover = mouseover, mouseup = mouseup, rightclick = rightclick, touchend = touchend, touchmove = touchmove, touchstart = touchstart)
  
    __obj.asInstanceOf[EventMap[I]]
  }
}

