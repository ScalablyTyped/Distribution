package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseElevationLayerLayerviewCreateErrorEvent extends js.Object {
  var error: Error
  var view: View
}

object BaseElevationLayerLayerviewCreateErrorEvent {
  @scala.inline
  def apply(error: Error, view: View): BaseElevationLayerLayerviewCreateErrorEvent = {
    val __obj = js.Dynamic.literal(error = error, view = view)
  
    __obj.asInstanceOf[BaseElevationLayerLayerviewCreateErrorEvent]
  }
}

