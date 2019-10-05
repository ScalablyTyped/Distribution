package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphicsLayerLayerviewCreateErrorEvent extends js.Object {
  var error: Error
  var view: View
}

object GraphicsLayerLayerviewCreateErrorEvent {
  @scala.inline
  def apply(error: Error, view: View): GraphicsLayerLayerviewCreateErrorEvent = {
    val __obj = js.Dynamic.literal(error = error, view = view)
  
    __obj.asInstanceOf[GraphicsLayerLayerviewCreateErrorEvent]
  }
}

