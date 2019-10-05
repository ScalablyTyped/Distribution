package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnsupportedLayerLayerviewCreateErrorEvent extends js.Object {
  var error: Error
  var view: View
}

object UnsupportedLayerLayerviewCreateErrorEvent {
  @scala.inline
  def apply(error: Error, view: View): UnsupportedLayerLayerviewCreateErrorEvent = {
    val __obj = js.Dynamic.literal(error = error, view = view)
  
    __obj.asInstanceOf[UnsupportedLayerLayerviewCreateErrorEvent]
  }
}

