package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElevationLayerLayerviewCreateErrorEvent extends js.Object {
  var error: Error
  var view: View
}

object ElevationLayerLayerviewCreateErrorEvent {
  @scala.inline
  def apply(error: Error, view: View): ElevationLayerLayerviewCreateErrorEvent = {
    val __obj = js.Dynamic.literal(error = error, view = view)
  
    __obj.asInstanceOf[ElevationLayerLayerviewCreateErrorEvent]
  }
}

