package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamLayerViewDataReceivedEvent extends js.Object {
  var attributes: js.Any
  var geometry: js.Any
}

object StreamLayerViewDataReceivedEvent {
  @scala.inline
  def apply(attributes: js.Any, geometry: js.Any): StreamLayerViewDataReceivedEvent = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamLayerViewDataReceivedEvent]
  }
}

