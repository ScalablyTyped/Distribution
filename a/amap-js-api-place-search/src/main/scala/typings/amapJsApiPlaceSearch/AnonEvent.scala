package typings.amapJsApiPlaceSearch

import typings.amapJsApi.AMap.InfoWindow
import typings.std.HTMLDivElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEvent extends js.Object {
  var event: MouseEvent
  var infoWindow: InfoWindow[_]
  var infoWindowContentDom: HTMLDivElement
}

object AnonEvent {
  @scala.inline
  def apply(event: MouseEvent, infoWindow: InfoWindow[_], infoWindowContentDom: HTMLDivElement): AnonEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], infoWindow = infoWindow.asInstanceOf[js.Any], infoWindowContentDom = infoWindowContentDom.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEvent]
  }
}

