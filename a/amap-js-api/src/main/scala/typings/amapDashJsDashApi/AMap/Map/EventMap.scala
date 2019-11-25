package typings.amapDashJsDashApi.AMap.Map

import typings.amapDashJsDashApi.AMap.Event
import typings.amapDashJsDashApi.AMap.MapsEvent
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
  var click: MapsEvent[
    typings.amapDashJsDashApi.amapDashJsDashApiStrings.click, 
    typings.amapDashJsDashApi.AMap.Map
  ]
  var complete: Event[
    typings.amapDashJsDashApi.amapDashJsDashApiStrings.complete, 
    js.UndefOr[scala.Nothing]
  ]
  var contextmenu: MapsEvent[
    typings.amapDashJsDashApi.amapDashJsDashApiStrings.contextmenu, 
    typings.amapDashJsDashApi.AMap.Map
  ]
  var dblclick: MapsEvent[
    typings.amapDashJsDashApi.amapDashJsDashApiStrings.dblclick, 
    typings.amapDashJsDashApi.AMap.Map
  ]
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
  var mousedown: MapsEvent[
    typings.amapDashJsDashApi.amapDashJsDashApiStrings.mousedown, 
    typings.amapDashJsDashApi.AMap.Map
  ]
  var mousemove: MapsEvent[
    typings.amapDashJsDashApi.amapDashJsDashApiStrings.mousemove, 
    typings.amapDashJsDashApi.AMap.Map
  ]
  var mouseout: MapsEvent[
    typings.amapDashJsDashApi.amapDashJsDashApiStrings.mouseout, 
    typings.amapDashJsDashApi.AMap.Map
  ]
  var mouseover: MapsEvent[
    typings.amapDashJsDashApi.amapDashJsDashApiStrings.mouseover, 
    typings.amapDashJsDashApi.AMap.Map
  ]
  var mouseup: MapsEvent[
    typings.amapDashJsDashApi.amapDashJsDashApiStrings.mouseup, 
    typings.amapDashJsDashApi.AMap.Map
  ]
  var mousewheel: MapsEvent[
    typings.amapDashJsDashApi.amapDashJsDashApiStrings.mousewheel, 
    typings.amapDashJsDashApi.AMap.Map
  ]
  var moveend: Event[
    typings.amapDashJsDashApi.amapDashJsDashApiStrings.moveend, 
    js.UndefOr[scala.Nothing]
  ]
  var movestart: Event[
    typings.amapDashJsDashApi.amapDashJsDashApiStrings.movestart, 
    js.UndefOr[scala.Nothing]
  ]
  var rdblclick: MapsEvent[
    typings.amapDashJsDashApi.amapDashJsDashApiStrings.rdblclick, 
    typings.amapDashJsDashApi.AMap.Map
  ]
  var resize: Event[
    typings.amapDashJsDashApi.amapDashJsDashApiStrings.resize, 
    js.UndefOr[scala.Nothing]
  ]
  var rightclick: MapsEvent[
    typings.amapDashJsDashApi.amapDashJsDashApiStrings.rightclick, 
    typings.amapDashJsDashApi.AMap.Map
  ]
  var touchend: MapsEvent[
    typings.amapDashJsDashApi.amapDashJsDashApiStrings.touchend, 
    typings.amapDashJsDashApi.AMap.Map
  ]
  var touchmove: MapsEvent[
    typings.amapDashJsDashApi.amapDashJsDashApiStrings.touchmove, 
    typings.amapDashJsDashApi.AMap.Map
  ]
  var touchstart: MapsEvent[
    typings.amapDashJsDashApi.amapDashJsDashApiStrings.touchstart, 
    typings.amapDashJsDashApi.AMap.Map
  ]
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
    click: MapsEvent[click, typings.amapDashJsDashApi.AMap.Map],
    complete: Event[complete, js.UndefOr[scala.Nothing]],
    contextmenu: MapsEvent[contextmenu, typings.amapDashJsDashApi.AMap.Map],
    dblclick: MapsEvent[dblclick, typings.amapDashJsDashApi.AMap.Map],
    dragend: Event[dragend, js.UndefOr[scala.Nothing]],
    dragging: Event[dragging, js.UndefOr[scala.Nothing]],
    dragstart: Event[dragstart, js.UndefOr[scala.Nothing]],
    hotspotclick: HotspotEvent[hotspotclick],
    hotspotout: HotspotEvent[hotspotout],
    hotspotover: HotspotEvent[hotspotover],
    mapmove: Event[mapmove, js.UndefOr[scala.Nothing]],
    mousedown: MapsEvent[mousedown, typings.amapDashJsDashApi.AMap.Map],
    mousemove: MapsEvent[mousemove, typings.amapDashJsDashApi.AMap.Map],
    mouseout: MapsEvent[mouseout, typings.amapDashJsDashApi.AMap.Map],
    mouseover: MapsEvent[mouseover, typings.amapDashJsDashApi.AMap.Map],
    mouseup: MapsEvent[mouseup, typings.amapDashJsDashApi.AMap.Map],
    mousewheel: MapsEvent[mousewheel, typings.amapDashJsDashApi.AMap.Map],
    moveend: Event[moveend, js.UndefOr[scala.Nothing]],
    movestart: Event[movestart, js.UndefOr[scala.Nothing]],
    rdblclick: MapsEvent[rdblclick, typings.amapDashJsDashApi.AMap.Map],
    resize: Event[resize, js.UndefOr[scala.Nothing]],
    rightclick: MapsEvent[rightclick, typings.amapDashJsDashApi.AMap.Map],
    touchend: MapsEvent[touchend, typings.amapDashJsDashApi.AMap.Map],
    touchmove: MapsEvent[touchmove, typings.amapDashJsDashApi.AMap.Map],
    touchstart: MapsEvent[touchstart, typings.amapDashJsDashApi.AMap.Map],
    zoomchange: Event[zoomchange, js.UndefOr[scala.Nothing]],
    zoomend: Event[zoomend, js.UndefOr[scala.Nothing]],
    zoomstart: Event[zoomstart, js.UndefOr[scala.Nothing]]
  ): EventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragging = dragging.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], hotspotclick = hotspotclick.asInstanceOf[js.Any], hotspotout = hotspotout.asInstanceOf[js.Any], hotspotover = hotspotover.asInstanceOf[js.Any], mapmove = mapmove.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], mousewheel = mousewheel.asInstanceOf[js.Any], moveend = moveend.asInstanceOf[js.Any], movestart = movestart.asInstanceOf[js.Any], rdblclick = rdblclick.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], rightclick = rightclick.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], zoomchange = zoomchange.asInstanceOf[js.Any], zoomend = zoomend.asInstanceOf[js.Any], zoomstart = zoomstart.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventMap]
  }
}

