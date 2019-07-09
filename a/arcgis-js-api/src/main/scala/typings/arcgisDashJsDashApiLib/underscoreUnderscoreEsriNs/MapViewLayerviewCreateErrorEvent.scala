package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapViewLayerviewCreateErrorEvent extends js.Object {
  var error: Error
  var layer: Layer
}

object MapViewLayerviewCreateErrorEvent {
  @scala.inline
  def apply(error: Error, layer: Layer): MapViewLayerviewCreateErrorEvent = {
    val __obj = js.Dynamic.literal(error = error, layer = layer)
  
    __obj.asInstanceOf[MapViewLayerviewCreateErrorEvent]
  }
}

