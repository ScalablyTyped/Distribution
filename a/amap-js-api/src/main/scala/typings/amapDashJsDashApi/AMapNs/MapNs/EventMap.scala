package typings.amapDashJsDashApi.AMapNs.MapNs

import typings.amapDashJsDashApi.AMapNs.Event
import typings.amapDashJsDashApi.AMapNs.Map
import typings.amapDashJsDashApi.AMapNs.MapsEvent
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.click
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.complete
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.contextmenu
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.dblclick
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.dragend
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.dragging
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.dragstart
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.hotspotclick
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.hotspotout
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.hotspotover
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.mapmove
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.mousedown
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.mousemove
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.mouseout
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.mouseover
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.mouseup
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.mousewheel
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.moveend
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.movestart
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.rdblclick
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.resize
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.rightclick
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.touchend
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.touchmove
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.touchstart
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.zoomchange
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.zoomend
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.zoomstart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var click: MapsEvent[typings.amapDashJsDashApi.amapDashJsDashApiStrings.click, Map]
  var complete: Event[
    typings.amapDashJsDashApi.amapDashJsDashApiStrings.complete, 
    js.UndefOr[scala.Nothing]
  ]
  var contextmenu: MapsEvent[typings.amapDashJsDashApi.amapDashJsDashApiStrings.contextmenu, Map]
  var dblclick: MapsEvent[typings.amapDashJsDashApi.amapDashJsDashApiStrings.dblclick, Map]
  var dragend: Event[
    typings.amapDashJsDashApi.amapDashJsDashApiStrings.dragend, 
    js.UndefOr[scala.Nothing]
  ]
  var dragging: Event[
    typings.amapDashJsDashApi.amapDashJsDashApiStrings.dragging, 
    js.UndefOr[scala.Nothing]
  ]
  var dragstart: Event[
    typings.amapDashJsDashApi.amapDashJsDashApiStrings.dragstart, 
    js.UndefOr[scala.Nothing]
  ]
  var hotspotclick: HotspotEvent[typings.amapDashJsDashApi.amapDashJsDashApiStrings.hotspotclick]
  var hotspotout: HotspotEvent[typings.amapDashJsDashApi.amapDashJsDashApiStrings.hotspotout]
  var hotspotover: HotspotEvent[typings.amapDashJsDashApi.amapDashJsDashApiStrings.hotspotover]
  var mapmove: Event[
    typings.amapDashJsDashApi.amapDashJsDashApiStrings.mapmove, 
    js.UndefOr[scala.Nothing]
  ]
  var mousedown: MapsEvent[typings.amapDashJsDashApi.amapDashJsDashApiStrings.mousedown, Map]
  var mousemove: MapsEvent[typings.amapDashJsDashApi.amapDashJsDashApiStrings.mousemove, Map]
  var mouseout: MapsEvent[typings.amapDashJsDashApi.amapDashJsDashApiStrings.mouseout, Map]
  var mouseover: MapsEvent[typings.amapDashJsDashApi.amapDashJsDashApiStrings.mouseover, Map]
  var mouseup: MapsEvent[typings.amapDashJsDashApi.amapDashJsDashApiStrings.mouseup, Map]
  var mousewheel: MapsEvent[typings.amapDashJsDashApi.amapDashJsDashApiStrings.mousewheel, Map]
  var moveend: Event[
    typings.amapDashJsDashApi.amapDashJsDashApiStrings.moveend, 
    js.UndefOr[scala.Nothing]
  ]
  var movestart: Event[
    typings.amapDashJsDashApi.amapDashJsDashApiStrings.movestart, 
    js.UndefOr[scala.Nothing]
  ]
  var rdblclick: MapsEvent[typings.amapDashJsDashApi.amapDashJsDashApiStrings.rdblclick, Map]
  var resize: Event[
    typings.amapDashJsDashApi.amapDashJsDashApiStrings.resize, 
    js.UndefOr[scala.Nothing]
  ]
  var rightclick: MapsEvent[typings.amapDashJsDashApi.amapDashJsDashApiStrings.rightclick, Map]
  var touchend: MapsEvent[typings.amapDashJsDashApi.amapDashJsDashApiStrings.touchend, Map]
  var touchmove: MapsEvent[typings.amapDashJsDashApi.amapDashJsDashApiStrings.touchmove, Map]
  var touchstart: MapsEvent[typings.amapDashJsDashApi.amapDashJsDashApiStrings.touchstart, Map]
  var zoomchange: Event[
    typings.amapDashJsDashApi.amapDashJsDashApiStrings.zoomchange, 
    js.UndefOr[scala.Nothing]
  ]
  var zoomend: Event[
    typings.amapDashJsDashApi.amapDashJsDashApiStrings.zoomend, 
    js.UndefOr[scala.Nothing]
  ]
  var zoomstart: Event[
    typings.amapDashJsDashApi.amapDashJsDashApiStrings.zoomstart, 
    js.UndefOr[scala.Nothing]
  ]
}

object EventMap {
  @scala.inline
  def apply(
    click: MapsEvent[click, Map],
    complete: Event[complete, js.UndefOr[scala.Nothing]],
    contextmenu: MapsEvent[contextmenu, Map],
    dblclick: MapsEvent[dblclick, Map],
    dragend: Event[dragend, js.UndefOr[scala.Nothing]],
    dragging: Event[dragging, js.UndefOr[scala.Nothing]],
    dragstart: Event[dragstart, js.UndefOr[scala.Nothing]],
    hotspotclick: HotspotEvent[hotspotclick],
    hotspotout: HotspotEvent[hotspotout],
    hotspotover: HotspotEvent[hotspotover],
    mapmove: Event[mapmove, js.UndefOr[scala.Nothing]],
    mousedown: MapsEvent[mousedown, Map],
    mousemove: MapsEvent[mousemove, Map],
    mouseout: MapsEvent[mouseout, Map],
    mouseover: MapsEvent[mouseover, Map],
    mouseup: MapsEvent[mouseup, Map],
    mousewheel: MapsEvent[mousewheel, Map],
    moveend: Event[moveend, js.UndefOr[scala.Nothing]],
    movestart: Event[movestart, js.UndefOr[scala.Nothing]],
    rdblclick: MapsEvent[rdblclick, Map],
    resize: Event[resize, js.UndefOr[scala.Nothing]],
    rightclick: MapsEvent[rightclick, Map],
    touchend: MapsEvent[touchend, Map],
    touchmove: MapsEvent[touchmove, Map],
    touchstart: MapsEvent[touchstart, Map],
    zoomchange: Event[zoomchange, js.UndefOr[scala.Nothing]],
    zoomend: Event[zoomend, js.UndefOr[scala.Nothing]],
    zoomstart: Event[zoomstart, js.UndefOr[scala.Nothing]]
  ): EventMap = {
    val __obj = js.Dynamic.literal(click = click, complete = complete, contextmenu = contextmenu, dblclick = dblclick, dragend = dragend, dragging = dragging, dragstart = dragstart, hotspotclick = hotspotclick, hotspotout = hotspotout, hotspotover = hotspotover, mapmove = mapmove, mousedown = mousedown, mousemove = mousemove, mouseout = mouseout, mouseover = mouseover, mouseup = mouseup, mousewheel = mousewheel, moveend = moveend, movestart = movestart, rdblclick = rdblclick, resize = resize, rightclick = rightclick, touchend = touchend, touchmove = touchmove, touchstart = touchstart, zoomchange = zoomchange, zoomend = zoomend, zoomstart = zoomstart)
  
    __obj.asInstanceOf[EventMap]
  }
}

