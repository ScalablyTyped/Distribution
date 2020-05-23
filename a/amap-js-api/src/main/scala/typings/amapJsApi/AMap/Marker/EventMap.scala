package typings.amapJsApi.AMap.Marker

import typings.amapJsApi.AMap.Event_
import typings.amapJsApi.AMap.MapsEvent
import typings.amapJsApi.amapJsApiStrings.click
import typings.amapJsApi.amapJsApiStrings.dblclick
import typings.amapJsApi.amapJsApiStrings.dragend
import typings.amapJsApi.amapJsApiStrings.dragging
import typings.amapJsApi.amapJsApiStrings.dragstart
import typings.amapJsApi.amapJsApiStrings.mousedown
import typings.amapJsApi.amapJsApiStrings.mousemove
import typings.amapJsApi.amapJsApiStrings.mouseout
import typings.amapJsApi.amapJsApiStrings.mouseover
import typings.amapJsApi.amapJsApiStrings.mouseup
import typings.amapJsApi.amapJsApiStrings.movealong
import typings.amapJsApi.amapJsApiStrings.moveend
import typings.amapJsApi.amapJsApiStrings.moving
import typings.amapJsApi.amapJsApiStrings.rightclick
import typings.amapJsApi.amapJsApiStrings.touchend
import typings.amapJsApi.amapJsApiStrings.touchmove
import typings.amapJsApi.amapJsApiStrings.touchstart
import typings.amapJsApi.anon.PassedPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap[I] extends js.Object {
  var click: MapsEvent[typings.amapJsApi.amapJsApiStrings.click, I]
  var dblclick: MapsEvent[typings.amapJsApi.amapJsApiStrings.dblclick, I]
  var dragend: MapsEvent[typings.amapJsApi.amapJsApiStrings.dragend, I]
  var dragging: MapsEvent[typings.amapJsApi.amapJsApiStrings.dragging, I]
  var dragstart: MapsEvent[typings.amapJsApi.amapJsApiStrings.dragstart, I]
  var mousedown: MapsEvent[typings.amapJsApi.amapJsApiStrings.mousedown, I]
  var mousemove: MapsEvent[typings.amapJsApi.amapJsApiStrings.mousemove, I]
  var mouseout: MapsEvent[typings.amapJsApi.amapJsApiStrings.mouseout, I]
  var mouseover: MapsEvent[typings.amapJsApi.amapJsApiStrings.mouseover, I]
  var mouseup: MapsEvent[typings.amapJsApi.amapJsApiStrings.mouseup, I]
  var movealong: Event_[typings.amapJsApi.amapJsApiStrings.movealong, js.UndefOr[scala.Nothing]]
  var moveend: Event_[typings.amapJsApi.amapJsApiStrings.moveend, js.UndefOr[scala.Nothing]]
  var moving: Event_[typings.amapJsApi.amapJsApiStrings.moving, PassedPath]
  var rightclick: MapsEvent[typings.amapJsApi.amapJsApiStrings.rightclick, I]
  var touchend: MapsEvent[typings.amapJsApi.amapJsApiStrings.touchend, I]
  var touchmove: MapsEvent[typings.amapJsApi.amapJsApiStrings.touchmove, I]
  var touchstart: MapsEvent[typings.amapJsApi.amapJsApiStrings.touchstart, I]
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
    movealong: Event_[movealong, js.UndefOr[scala.Nothing]],
    moveend: Event_[moveend, js.UndefOr[scala.Nothing]],
    moving: Event_[moving, PassedPath],
    rightclick: MapsEvent[rightclick, I],
    touchend: MapsEvent[touchend, I],
    touchmove: MapsEvent[touchmove, I],
    touchstart: MapsEvent[touchstart, I]
  ): EventMap[I] = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragging = dragging.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], movealong = movealong.asInstanceOf[js.Any], moveend = moveend.asInstanceOf[js.Any], moving = moving.asInstanceOf[js.Any], rightclick = rightclick.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventMap[I]]
  }
}

