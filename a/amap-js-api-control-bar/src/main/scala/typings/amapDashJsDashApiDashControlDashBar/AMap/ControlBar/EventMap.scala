package typings.amapDashJsDashApiDashControlDashBar.AMap.ControlBar

import typings.amapDashJsDashApi.AMap.Event
import typings.amapDashJsDashApiDashControlDashBar.amapDashJsDashApiDashControlDashBarStrings.hide
import typings.amapDashJsDashApiDashControlDashBar.amapDashJsDashApiDashControlDashBarStrings.show
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var hide: Event[
    typings.amapDashJsDashApiDashControlDashBar.amapDashJsDashApiDashControlDashBarStrings.hide, 
    js.UndefOr[scala.Nothing]
  ]
  var show: Event[
    typings.amapDashJsDashApiDashControlDashBar.amapDashJsDashApiDashControlDashBarStrings.show, 
    js.UndefOr[scala.Nothing]
  ]
}

object EventMap {
  @scala.inline
  def apply(hide: Event[hide, js.UndefOr[scala.Nothing]], show: Event[show, js.UndefOr[scala.Nothing]]): EventMap = {
    val __obj = js.Dynamic.literal(hide = hide, show = show)
  
    __obj.asInstanceOf[EventMap]
  }
}

