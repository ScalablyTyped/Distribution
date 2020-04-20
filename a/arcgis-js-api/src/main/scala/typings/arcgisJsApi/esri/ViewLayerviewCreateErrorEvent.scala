package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewLayerviewCreateErrorEvent extends js.Object {
  var error: Error
  var layer: Layer
}

object ViewLayerviewCreateErrorEvent {
  @scala.inline
  def apply(error: Error, layer: Layer): ViewLayerviewCreateErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewLayerviewCreateErrorEvent]
  }
}

