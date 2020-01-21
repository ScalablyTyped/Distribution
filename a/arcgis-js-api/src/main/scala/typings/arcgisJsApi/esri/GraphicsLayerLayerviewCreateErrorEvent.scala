package typings.arcgisJsApi.esri

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
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GraphicsLayerLayerviewCreateErrorEvent]
  }
}

