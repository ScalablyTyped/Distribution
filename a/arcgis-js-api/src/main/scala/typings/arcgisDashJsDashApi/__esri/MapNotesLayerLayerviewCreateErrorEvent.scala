package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapNotesLayerLayerviewCreateErrorEvent extends js.Object {
  var error: Error
  var view: View
}

object MapNotesLayerLayerviewCreateErrorEvent {
  @scala.inline
  def apply(error: Error, view: View): MapNotesLayerLayerviewCreateErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MapNotesLayerLayerviewCreateErrorEvent]
  }
}

