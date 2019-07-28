package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneViewLayerviewCreateErrorEvent extends js.Object {
  var error: Error
  var layer: Layer
}

object SceneViewLayerviewCreateErrorEvent {
  @scala.inline
  def apply(error: Error, layer: Layer): SceneViewLayerviewCreateErrorEvent = {
    val __obj = js.Dynamic.literal(error = error, layer = layer)
  
    __obj.asInstanceOf[SceneViewLayerviewCreateErrorEvent]
  }
}

