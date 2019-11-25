package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupLayerLayerviewCreateErrorEvent extends js.Object {
  var error: Error
  var view: View
}

object GroupLayerLayerviewCreateErrorEvent {
  @scala.inline
  def apply(error: Error, view: View): GroupLayerLayerviewCreateErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GroupLayerLayerviewCreateErrorEvent]
  }
}

