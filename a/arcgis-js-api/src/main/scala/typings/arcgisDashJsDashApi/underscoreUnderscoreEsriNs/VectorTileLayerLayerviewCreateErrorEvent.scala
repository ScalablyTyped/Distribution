package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VectorTileLayerLayerviewCreateErrorEvent extends js.Object {
  var error: Error
  var view: View
}

object VectorTileLayerLayerviewCreateErrorEvent {
  @scala.inline
  def apply(error: Error, view: View): VectorTileLayerLayerviewCreateErrorEvent = {
    val __obj = js.Dynamic.literal(error = error, view = view)
  
    __obj.asInstanceOf[VectorTileLayerLayerviewCreateErrorEvent]
  }
}

