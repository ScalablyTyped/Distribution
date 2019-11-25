package typings.amapDashJsDashApiDashPlaceDashSearch

import typings.amapDashJsDashApi.AMap.InfoWindow
import typings.std.HTMLDivElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Event extends js.Object {
  var event: MouseEvent
  var infoWindow: InfoWindow[_]
  var infoWindowContentDom: HTMLDivElement
}

object Anon_Event {
  @scala.inline
  def apply(event: MouseEvent, infoWindow: InfoWindow[_], infoWindowContentDom: HTMLDivElement): Anon_Event = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], infoWindow = infoWindow.asInstanceOf[js.Any], infoWindowContentDom = infoWindowContentDom.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Event]
  }
}

