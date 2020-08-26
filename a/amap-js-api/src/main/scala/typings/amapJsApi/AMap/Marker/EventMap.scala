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

@js.native
trait EventMap[I] extends js.Object {
  var click: MapsEvent[typings.amapJsApi.amapJsApiStrings.click, I] = js.native
  var dblclick: MapsEvent[typings.amapJsApi.amapJsApiStrings.dblclick, I] = js.native
  var dragend: MapsEvent[typings.amapJsApi.amapJsApiStrings.dragend, I] = js.native
  var dragging: MapsEvent[typings.amapJsApi.amapJsApiStrings.dragging, I] = js.native
  var dragstart: MapsEvent[typings.amapJsApi.amapJsApiStrings.dragstart, I] = js.native
  var mousedown: MapsEvent[typings.amapJsApi.amapJsApiStrings.mousedown, I] = js.native
  var mousemove: MapsEvent[typings.amapJsApi.amapJsApiStrings.mousemove, I] = js.native
  var mouseout: MapsEvent[typings.amapJsApi.amapJsApiStrings.mouseout, I] = js.native
  var mouseover: MapsEvent[typings.amapJsApi.amapJsApiStrings.mouseover, I] = js.native
  var mouseup: MapsEvent[typings.amapJsApi.amapJsApiStrings.mouseup, I] = js.native
  var movealong: Event_[typings.amapJsApi.amapJsApiStrings.movealong, js.UndefOr[scala.Nothing]] = js.native
  var moveend: Event_[typings.amapJsApi.amapJsApiStrings.moveend, js.UndefOr[scala.Nothing]] = js.native
  var moving: Event_[typings.amapJsApi.amapJsApiStrings.moving, PassedPath] = js.native
  var rightclick: MapsEvent[typings.amapJsApi.amapJsApiStrings.rightclick, I] = js.native
  var touchend: MapsEvent[typings.amapJsApi.amapJsApiStrings.touchend, I] = js.native
  var touchmove: MapsEvent[typings.amapJsApi.amapJsApiStrings.touchmove, I] = js.native
  var touchstart: MapsEvent[typings.amapJsApi.amapJsApiStrings.touchstart, I] = js.native
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
  @scala.inline
  implicit class EventMapOps[Self <: EventMap[_], I] (val x: Self with EventMap[I]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClick(value: MapsEvent[click, I]): Self = this.set("click", value.asInstanceOf[js.Any])
    @scala.inline
    def setDblclick(value: MapsEvent[dblclick, I]): Self = this.set("dblclick", value.asInstanceOf[js.Any])
    @scala.inline
    def setDragend(value: MapsEvent[dragend, I]): Self = this.set("dragend", value.asInstanceOf[js.Any])
    @scala.inline
    def setDragging(value: MapsEvent[dragging, I]): Self = this.set("dragging", value.asInstanceOf[js.Any])
    @scala.inline
    def setDragstart(value: MapsEvent[dragstart, I]): Self = this.set("dragstart", value.asInstanceOf[js.Any])
    @scala.inline
    def setMousedown(value: MapsEvent[mousedown, I]): Self = this.set("mousedown", value.asInstanceOf[js.Any])
    @scala.inline
    def setMousemove(value: MapsEvent[mousemove, I]): Self = this.set("mousemove", value.asInstanceOf[js.Any])
    @scala.inline
    def setMouseout(value: MapsEvent[mouseout, I]): Self = this.set("mouseout", value.asInstanceOf[js.Any])
    @scala.inline
    def setMouseover(value: MapsEvent[mouseover, I]): Self = this.set("mouseover", value.asInstanceOf[js.Any])
    @scala.inline
    def setMouseup(value: MapsEvent[mouseup, I]): Self = this.set("mouseup", value.asInstanceOf[js.Any])
    @scala.inline
    def setMovealong(value: Event_[movealong, js.UndefOr[scala.Nothing]]): Self = this.set("movealong", value.asInstanceOf[js.Any])
    @scala.inline
    def setMoveend(value: Event_[moveend, js.UndefOr[scala.Nothing]]): Self = this.set("moveend", value.asInstanceOf[js.Any])
    @scala.inline
    def setMoving(value: Event_[moving, PassedPath]): Self = this.set("moving", value.asInstanceOf[js.Any])
    @scala.inline
    def setRightclick(value: MapsEvent[rightclick, I]): Self = this.set("rightclick", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchend(value: MapsEvent[touchend, I]): Self = this.set("touchend", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchmove(value: MapsEvent[touchmove, I]): Self = this.set("touchmove", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchstart(value: MapsEvent[touchstart, I]): Self = this.set("touchstart", value.asInstanceOf[js.Any])
  }
  
}

