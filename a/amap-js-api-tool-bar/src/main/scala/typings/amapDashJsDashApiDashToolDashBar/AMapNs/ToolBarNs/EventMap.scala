package typings.amapDashJsDashApiDashToolDashBar.AMapNs.ToolBarNs

import typings.amapDashJsDashApi.AMapNs.Event
import typings.amapDashJsDashApiDashToolDashBar.Anon_Lnglat
import typings.amapDashJsDashApiDashToolDashBar.amapDashJsDashApiDashToolDashBarStrings.`location-failed`
import typings.amapDashJsDashApiDashToolDashBar.amapDashJsDashApiDashToolDashBarStrings.`location-success`
import typings.amapDashJsDashApiDashToolDashBar.amapDashJsDashApiDashToolDashBarStrings.hide
import typings.amapDashJsDashApiDashToolDashBar.amapDashJsDashApiDashToolDashBarStrings.location
import typings.amapDashJsDashApiDashToolDashBar.amapDashJsDashApiDashToolDashBarStrings.show
import typings.amapDashJsDashApiDashToolDashBar.amapDashJsDashApiDashToolDashBarStrings.zoomin
import typings.amapDashJsDashApiDashToolDashBar.amapDashJsDashApiDashToolDashBarStrings.zoomout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var hide: Event[
    typings.amapDashJsDashApiDashToolDashBar.amapDashJsDashApiDashToolDashBarStrings.hide, 
    js.UndefOr[scala.Nothing]
  ]
  var location: Event[
    typings.amapDashJsDashApiDashToolDashBar.amapDashJsDashApiDashToolDashBarStrings.location, 
    Anon_Lnglat
  ]
   // TODO geolocation.getCurrentPosition
  var `location-failed`: Event[
    typings.amapDashJsDashApiDashToolDashBar.amapDashJsDashApiDashToolDashBarStrings.`location-failed`, 
    js.UndefOr[scala.Nothing]
  ]
  // internal
  var `location-success`: Event[
    typings.amapDashJsDashApiDashToolDashBar.amapDashJsDashApiDashToolDashBarStrings.`location-success`, 
    js.UndefOr[scala.Nothing]
  ]
  var show: Event[
    typings.amapDashJsDashApiDashToolDashBar.amapDashJsDashApiDashToolDashBarStrings.show, 
    js.UndefOr[scala.Nothing]
  ]
  var zoomchanged: Event[zoomin | zoomout, js.UndefOr[scala.Nothing]]
}

object EventMap {
  @scala.inline
  def apply(
    hide: Event[hide, js.UndefOr[scala.Nothing]],
    location: Event[location, Anon_Lnglat],
    `location-failed`: Event[`location-failed`, js.UndefOr[scala.Nothing]],
    `location-success`: Event[`location-success`, js.UndefOr[scala.Nothing]],
    show: Event[show, js.UndefOr[scala.Nothing]],
    zoomchanged: Event[zoomin | zoomout, js.UndefOr[scala.Nothing]]
  ): EventMap = {
    val __obj = js.Dynamic.literal(hide = hide, location = location, show = show, zoomchanged = zoomchanged)
    __obj.updateDynamic("location-failed")(`location-failed`)
    __obj.updateDynamic("location-success")(`location-success`)
    __obj.asInstanceOf[EventMap]
  }
}

