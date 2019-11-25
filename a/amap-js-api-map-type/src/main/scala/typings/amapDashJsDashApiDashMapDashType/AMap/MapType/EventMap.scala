package typings.amapDashJsDashApiDashMapDashType.AMap.MapType

import typings.amapDashJsDashApi.AMap.Event
import typings.amapDashJsDashApiDashMapDashType.amapDashJsDashApiDashMapDashTypeStrings.hide
import typings.amapDashJsDashApiDashMapDashType.amapDashJsDashApiDashMapDashTypeStrings.show
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var hide: Event[
    typings.amapDashJsDashApiDashMapDashType.amapDashJsDashApiDashMapDashTypeStrings.hide, 
    js.UndefOr[scala.Nothing]
  ]
  var show: Event[
    typings.amapDashJsDashApiDashMapDashType.amapDashJsDashApiDashMapDashTypeStrings.show, 
    js.UndefOr[scala.Nothing]
  ]
}

object EventMap {
  @scala.inline
  def apply(hide: Event[hide, js.UndefOr[scala.Nothing]], show: Event[show, js.UndefOr[scala.Nothing]]): EventMap = {
    val __obj = js.Dynamic.literal(hide = hide.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventMap]
  }
}

