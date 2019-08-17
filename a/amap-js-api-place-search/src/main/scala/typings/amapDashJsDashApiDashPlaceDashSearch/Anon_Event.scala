package typings.amapDashJsDashApiDashPlaceDashSearch

import typings.amapDashJsDashApi.AMapNs.InfoWindow
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
    val __obj = js.Dynamic.literal(event = event, infoWindow = infoWindow, infoWindowContentDom = infoWindowContentDom)
  
    __obj.asInstanceOf[Anon_Event]
  }
}

