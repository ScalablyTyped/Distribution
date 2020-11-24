package typings.amapJsApi.AMap.Map

import typings.amapJsApi.AMap.Event_
import typings.amapJsApi.AMap.MapsEvent
import typings.amapJsApi.amapJsApiStrings.click
import typings.amapJsApi.amapJsApiStrings.complete
import typings.amapJsApi.amapJsApiStrings.contextmenu
import typings.amapJsApi.amapJsApiStrings.dblclick
import typings.amapJsApi.amapJsApiStrings.dragend
import typings.amapJsApi.amapJsApiStrings.dragging
import typings.amapJsApi.amapJsApiStrings.dragstart
import typings.amapJsApi.amapJsApiStrings.hotspotclick
import typings.amapJsApi.amapJsApiStrings.hotspotout
import typings.amapJsApi.amapJsApiStrings.hotspotover
import typings.amapJsApi.amapJsApiStrings.mapmove
import typings.amapJsApi.amapJsApiStrings.mousedown
import typings.amapJsApi.amapJsApiStrings.mousemove
import typings.amapJsApi.amapJsApiStrings.mouseout
import typings.amapJsApi.amapJsApiStrings.mouseover
import typings.amapJsApi.amapJsApiStrings.mouseup
import typings.amapJsApi.amapJsApiStrings.mousewheel
import typings.amapJsApi.amapJsApiStrings.moveend
import typings.amapJsApi.amapJsApiStrings.movestart
import typings.amapJsApi.amapJsApiStrings.rdblclick
import typings.amapJsApi.amapJsApiStrings.resize
import typings.amapJsApi.amapJsApiStrings.rightclick
import typings.amapJsApi.amapJsApiStrings.touchend
import typings.amapJsApi.amapJsApiStrings.touchmove
import typings.amapJsApi.amapJsApiStrings.touchstart
import typings.amapJsApi.amapJsApiStrings.zoomchange
import typings.amapJsApi.amapJsApiStrings.zoomend
import typings.amapJsApi.amapJsApiStrings.zoomstart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventMap extends js.Object {
  
  var click: MapsEvent[typings.amapJsApi.amapJsApiStrings.click, typings.amapJsApi.AMap.Map] = js.native
  
  var complete: Event_[typings.amapJsApi.amapJsApiStrings.complete, js.UndefOr[scala.Nothing]] = js.native
  
  var contextmenu: MapsEvent[typings.amapJsApi.amapJsApiStrings.contextmenu, typings.amapJsApi.AMap.Map] = js.native
  
  var dblclick: MapsEvent[typings.amapJsApi.amapJsApiStrings.dblclick, typings.amapJsApi.AMap.Map] = js.native
  
  var dragend: Event_[typings.amapJsApi.amapJsApiStrings.dragend, js.UndefOr[scala.Nothing]] = js.native
  
  var dragging: Event_[typings.amapJsApi.amapJsApiStrings.dragging, js.UndefOr[scala.Nothing]] = js.native
  
  var dragstart: Event_[typings.amapJsApi.amapJsApiStrings.dragstart, js.UndefOr[scala.Nothing]] = js.native
  
  var hotspotclick: HotspotEvent[typings.amapJsApi.amapJsApiStrings.hotspotclick] = js.native
  
  var hotspotout: HotspotEvent[typings.amapJsApi.amapJsApiStrings.hotspotout] = js.native
  
  var hotspotover: HotspotEvent[typings.amapJsApi.amapJsApiStrings.hotspotover] = js.native
  
  var mapmove: Event_[typings.amapJsApi.amapJsApiStrings.mapmove, js.UndefOr[scala.Nothing]] = js.native
  
  var mousedown: MapsEvent[typings.amapJsApi.amapJsApiStrings.mousedown, typings.amapJsApi.AMap.Map] = js.native
  
  var mousemove: MapsEvent[typings.amapJsApi.amapJsApiStrings.mousemove, typings.amapJsApi.AMap.Map] = js.native
  
  var mouseout: MapsEvent[typings.amapJsApi.amapJsApiStrings.mouseout, typings.amapJsApi.AMap.Map] = js.native
  
  var mouseover: MapsEvent[typings.amapJsApi.amapJsApiStrings.mouseover, typings.amapJsApi.AMap.Map] = js.native
  
  var mouseup: MapsEvent[typings.amapJsApi.amapJsApiStrings.mouseup, typings.amapJsApi.AMap.Map] = js.native
  
  var mousewheel: MapsEvent[typings.amapJsApi.amapJsApiStrings.mousewheel, typings.amapJsApi.AMap.Map] = js.native
  
  var moveend: Event_[typings.amapJsApi.amapJsApiStrings.moveend, js.UndefOr[scala.Nothing]] = js.native
  
  var movestart: Event_[typings.amapJsApi.amapJsApiStrings.movestart, js.UndefOr[scala.Nothing]] = js.native
  
  var rdblclick: MapsEvent[typings.amapJsApi.amapJsApiStrings.rdblclick, typings.amapJsApi.AMap.Map] = js.native
  
  var resize: Event_[typings.amapJsApi.amapJsApiStrings.resize, js.UndefOr[scala.Nothing]] = js.native
  
  var rightclick: MapsEvent[typings.amapJsApi.amapJsApiStrings.rightclick, typings.amapJsApi.AMap.Map] = js.native
  
  var touchend: MapsEvent[typings.amapJsApi.amapJsApiStrings.touchend, typings.amapJsApi.AMap.Map] = js.native
  
  var touchmove: MapsEvent[typings.amapJsApi.amapJsApiStrings.touchmove, typings.amapJsApi.AMap.Map] = js.native
  
  var touchstart: MapsEvent[typings.amapJsApi.amapJsApiStrings.touchstart, typings.amapJsApi.AMap.Map] = js.native
  
  var zoomchange: Event_[typings.amapJsApi.amapJsApiStrings.zoomchange, js.UndefOr[scala.Nothing]] = js.native
  
  var zoomend: Event_[typings.amapJsApi.amapJsApiStrings.zoomend, js.UndefOr[scala.Nothing]] = js.native
  
  var zoomstart: Event_[typings.amapJsApi.amapJsApiStrings.zoomstart, js.UndefOr[scala.Nothing]] = js.native
}
object EventMap {
  
  @scala.inline
  def apply(
    click: MapsEvent[click, typings.amapJsApi.AMap.Map],
    complete: Event_[complete, js.UndefOr[scala.Nothing]],
    contextmenu: MapsEvent[contextmenu, typings.amapJsApi.AMap.Map],
    dblclick: MapsEvent[dblclick, typings.amapJsApi.AMap.Map],
    dragend: Event_[dragend, js.UndefOr[scala.Nothing]],
    dragging: Event_[dragging, js.UndefOr[scala.Nothing]],
    dragstart: Event_[dragstart, js.UndefOr[scala.Nothing]],
    hotspotclick: HotspotEvent[hotspotclick],
    hotspotout: HotspotEvent[hotspotout],
    hotspotover: HotspotEvent[hotspotover],
    mapmove: Event_[mapmove, js.UndefOr[scala.Nothing]],
    mousedown: MapsEvent[mousedown, typings.amapJsApi.AMap.Map],
    mousemove: MapsEvent[mousemove, typings.amapJsApi.AMap.Map],
    mouseout: MapsEvent[mouseout, typings.amapJsApi.AMap.Map],
    mouseover: MapsEvent[mouseover, typings.amapJsApi.AMap.Map],
    mouseup: MapsEvent[mouseup, typings.amapJsApi.AMap.Map],
    mousewheel: MapsEvent[mousewheel, typings.amapJsApi.AMap.Map],
    moveend: Event_[moveend, js.UndefOr[scala.Nothing]],
    movestart: Event_[movestart, js.UndefOr[scala.Nothing]],
    rdblclick: MapsEvent[rdblclick, typings.amapJsApi.AMap.Map],
    resize: Event_[resize, js.UndefOr[scala.Nothing]],
    rightclick: MapsEvent[rightclick, typings.amapJsApi.AMap.Map],
    touchend: MapsEvent[touchend, typings.amapJsApi.AMap.Map],
    touchmove: MapsEvent[touchmove, typings.amapJsApi.AMap.Map],
    touchstart: MapsEvent[touchstart, typings.amapJsApi.AMap.Map],
    zoomchange: Event_[zoomchange, js.UndefOr[scala.Nothing]],
    zoomend: Event_[zoomend, js.UndefOr[scala.Nothing]],
    zoomstart: Event_[zoomstart, js.UndefOr[scala.Nothing]]
  ): EventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragging = dragging.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], hotspotclick = hotspotclick.asInstanceOf[js.Any], hotspotout = hotspotout.asInstanceOf[js.Any], hotspotover = hotspotover.asInstanceOf[js.Any], mapmove = mapmove.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], mousewheel = mousewheel.asInstanceOf[js.Any], moveend = moveend.asInstanceOf[js.Any], movestart = movestart.asInstanceOf[js.Any], rdblclick = rdblclick.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], rightclick = rightclick.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], zoomchange = zoomchange.asInstanceOf[js.Any], zoomend = zoomend.asInstanceOf[js.Any], zoomstart = zoomstart.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventMap]
  }
  
  @scala.inline
  implicit class EventMapOps[Self <: EventMap] (val x: Self) extends AnyVal {
    
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
    def setClick(value: MapsEvent[click, typings.amapJsApi.AMap.Map]): Self = this.set("click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplete(value: Event_[complete, js.UndefOr[scala.Nothing]]): Self = this.set("complete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextmenu(value: MapsEvent[contextmenu, typings.amapJsApi.AMap.Map]): Self = this.set("contextmenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDblclick(value: MapsEvent[dblclick, typings.amapJsApi.AMap.Map]): Self = this.set("dblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragend(value: Event_[dragend, js.UndefOr[scala.Nothing]]): Self = this.set("dragend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragging(value: Event_[dragging, js.UndefOr[scala.Nothing]]): Self = this.set("dragging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragstart(value: Event_[dragstart, js.UndefOr[scala.Nothing]]): Self = this.set("dragstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHotspotclick(value: HotspotEvent[hotspotclick]): Self = this.set("hotspotclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHotspotout(value: HotspotEvent[hotspotout]): Self = this.set("hotspotout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHotspotover(value: HotspotEvent[hotspotover]): Self = this.set("hotspotover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapmove(value: Event_[mapmove, js.UndefOr[scala.Nothing]]): Self = this.set("mapmove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMousedown(value: MapsEvent[mousedown, typings.amapJsApi.AMap.Map]): Self = this.set("mousedown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMousemove(value: MapsEvent[mousemove, typings.amapJsApi.AMap.Map]): Self = this.set("mousemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseout(value: MapsEvent[mouseout, typings.amapJsApi.AMap.Map]): Self = this.set("mouseout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseover(value: MapsEvent[mouseover, typings.amapJsApi.AMap.Map]): Self = this.set("mouseover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseup(value: MapsEvent[mouseup, typings.amapJsApi.AMap.Map]): Self = this.set("mouseup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMousewheel(value: MapsEvent[mousewheel, typings.amapJsApi.AMap.Map]): Self = this.set("mousewheel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveend(value: Event_[moveend, js.UndefOr[scala.Nothing]]): Self = this.set("moveend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMovestart(value: Event_[movestart, js.UndefOr[scala.Nothing]]): Self = this.set("movestart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRdblclick(value: MapsEvent[rdblclick, typings.amapJsApi.AMap.Map]): Self = this.set("rdblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResize(value: Event_[resize, js.UndefOr[scala.Nothing]]): Self = this.set("resize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightclick(value: MapsEvent[rightclick, typings.amapJsApi.AMap.Map]): Self = this.set("rightclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchend(value: MapsEvent[touchend, typings.amapJsApi.AMap.Map]): Self = this.set("touchend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchmove(value: MapsEvent[touchmove, typings.amapJsApi.AMap.Map]): Self = this.set("touchmove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchstart(value: MapsEvent[touchstart, typings.amapJsApi.AMap.Map]): Self = this.set("touchstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomchange(value: Event_[zoomchange, js.UndefOr[scala.Nothing]]): Self = this.set("zoomchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomend(value: Event_[zoomend, js.UndefOr[scala.Nothing]]): Self = this.set("zoomend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomstart(value: Event_[zoomstart, js.UndefOr[scala.Nothing]]): Self = this.set("zoomstart", value.asInstanceOf[js.Any])
  }
}
