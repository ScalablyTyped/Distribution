package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnknownLayerLayerviewCreateErrorEvent extends js.Object {
  var error: Error
  var view: View
}

object UnknownLayerLayerviewCreateErrorEvent {
  @scala.inline
  def apply(error: Error, view: View): UnknownLayerLayerviewCreateErrorEvent = {
    val __obj = js.Dynamic.literal(error = error, view = view)
  
    __obj.asInstanceOf[UnknownLayerLayerviewCreateErrorEvent]
  }
}

