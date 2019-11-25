package typings.amapDashJsDashApi.AMap.Marker

import typings.amapDashJsDashApi.AMap.Event
import typings.amapDashJsDashApi.AMap.MapsEvent
import typings.amapDashJsDashApi.Anon_PassedPath
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.click
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.dblclick
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.dragend
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.dragging
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.dragstart
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.mousedown
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.mousemove
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.mouseout
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.mouseover
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.mouseup
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.movealong
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.moveend
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.moving
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
  var dragend: MapsEvent[typings.amapDashJsDashApi.amapDashJsDashApiStrings.dragend, I]
  var dragging: MapsEvent[typings.amapDashJsDashApi.amapDashJsDashApiStrings.dragging, I]
  var dragstart: MapsEvent[typings.amapDashJsDashApi.amapDashJsDashApiStrings.dragstart, I]
  var mousedown: MapsEvent[typings.amapDashJsDashApi.amapDashJsDashApiStrings.mousedown, I]
  var mousemove: MapsEvent[typings.amapDashJsDashApi.amapDashJsDashApiStrings.mousemove, I]
  var mouseout: MapsEvent[typings.amapDashJsDashApi.amapDashJsDashApiStrings.mouseout, I]
  var mouseover: MapsEvent[typings.amapDashJsDashApi.amapDashJsDashApiStrings.mouseover, I]
  var mouseup: MapsEvent[typings.amapDashJsDashApi.amapDashJsDashApiStrings.mouseup, I]
  var movealong: Event[
    typings.amapDashJsDashApi.amapDashJsDashApiStrings.movealong, 
    js.UndefOr[scala.Nothing]
  ]
  var moveend: Event[
    typings.amapDashJsDashApi.amapDashJsDashApiStrings.moveend, 
    js.UndefOr[scala.Nothing]
  ]
  var moving: Event[typings.amapDashJsDashApi.amapDashJsDashApiStrings.moving, Anon_PassedPath]
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
    dragend: MapsEvent[dragend, I],
    dragging: MapsEvent[dragging, I],
    dragstart: MapsEvent[dragstart, I],
    mousedown: MapsEvent[mousedown, I],
    mousemove: MapsEvent[mousemove, I],
    mouseout: MapsEvent[mouseout, I],
    mouseover: MapsEvent[mouseover, I],
    mouseup: MapsEvent[mouseup, I],
    movealong: Event[movealong, js.UndefOr[scala.Nothing]],
    moveend: Event[moveend, js.UndefOr[scala.Nothing]],
    moving: Event[moving, Anon_PassedPath],
    rightclick: MapsEvent[rightclick, I],
    touchend: MapsEvent[touchend, I],
    touchmove: MapsEvent[touchmove, I],
    touchstart: MapsEvent[touchstart, I]
  ): EventMap[I] = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragging = dragging.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], movealong = movealong.asInstanceOf[js.Any], moveend = moveend.asInstanceOf[js.Any], moving = moving.asInstanceOf[js.Any], rightclick = rightclick.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventMap[I]]
  }
}

