package typings.amapDashJsDashApiDashOverview.AMapNs.OverViewNs

import typings.amapDashJsDashApi.AMapNs.Event
import typings.amapDashJsDashApiDashOverview.amapDashJsDashApiDashOverviewStrings.close
import typings.amapDashJsDashApiDashOverview.amapDashJsDashApiDashOverviewStrings.hide
import typings.amapDashJsDashApiDashOverview.amapDashJsDashApiDashOverviewStrings.open
import typings.amapDashJsDashApiDashOverview.amapDashJsDashApiDashOverviewStrings.show
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var close: Event[
    typings.amapDashJsDashApiDashOverview.amapDashJsDashApiDashOverviewStrings.close, 
    js.UndefOr[scala.Nothing]
  ]
  var hide: Event[
    typings.amapDashJsDashApiDashOverview.amapDashJsDashApiDashOverviewStrings.hide, 
    js.UndefOr[scala.Nothing]
  ]
  var open: Event[
    typings.amapDashJsDashApiDashOverview.amapDashJsDashApiDashOverviewStrings.open, 
    js.UndefOr[scala.Nothing]
  ]
  var show: Event[
    typings.amapDashJsDashApiDashOverview.amapDashJsDashApiDashOverviewStrings.show, 
    js.UndefOr[scala.Nothing]
  ]
}

object EventMap {
  @scala.inline
  def apply(
    close: Event[close, js.UndefOr[scala.Nothing]],
    hide: Event[hide, js.UndefOr[scala.Nothing]],
    open: Event[open, js.UndefOr[scala.Nothing]],
    show: Event[show, js.UndefOr[scala.Nothing]]
  ): EventMap = {
    val __obj = js.Dynamic.literal(close = close, hide = hide, open = open, show = show)
  
    __obj.asInstanceOf[EventMap]
  }
}

