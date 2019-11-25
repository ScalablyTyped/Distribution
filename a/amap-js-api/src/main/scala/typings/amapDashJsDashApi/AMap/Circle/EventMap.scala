package typings.amapDashJsDashApi.AMap.Circle

import typings.amapDashJsDashApi.AMap.Event
import typings.amapDashJsDashApi.AMap.MapsEvent
import typings.amapDashJsDashApi.Anon_TargetI
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.change
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.click
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.dblclick
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.hide
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.mousedown
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.mousemove
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.mouseover
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.mouseup
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.options
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.rightclick
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.setCenter
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.setRadius
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.show
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.touchend
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.touchmove
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.touchstart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap[I]
  extends typings.amapDashJsDashApi.AMap.ShapeOverlay.EventMap[I] {
  var setCenter: Event[
    typings.amapDashJsDashApi.amapDashJsDashApiStrings.setCenter, 
    js.UndefOr[scala.Nothing]
  ]
  var setRadius: Event[
    typings.amapDashJsDashApi.amapDashJsDashApiStrings.setRadius, 
    js.UndefOr[scala.Nothing]
  ]
}

object EventMap {
  @scala.inline
  def apply[I](
    change: Event[change, Anon_TargetI[I]],
    click: MapsEvent[click, I],
    dblclick: MapsEvent[dblclick, I],
    hide: Event[hide, Anon_TargetI[I]],
    mousedown: MapsEvent[mousedown, I],
    mousemove: MapsEvent[mousemove, I],
    mouseover: MapsEvent[mouseover, I],
    mouseup: MapsEvent[mouseup, I],
    options: Event[options, js.UndefOr[scala.Nothing]],
    rightclick: MapsEvent[rightclick, I],
    setCenter: Event[setCenter, js.UndefOr[scala.Nothing]],
    setRadius: Event[setRadius, js.UndefOr[scala.Nothing]],
    show: Event[show, Anon_TargetI[I]],
    touchend: MapsEvent[touchend, I],
    touchmove: MapsEvent[touchmove, I],
    touchstart: MapsEvent[touchstart, I]
  ): EventMap[I] = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], hide = hide.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], rightclick = rightclick.asInstanceOf[js.Any], setCenter = setCenter.asInstanceOf[js.Any], setRadius = setRadius.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventMap[I]]
  }
}

