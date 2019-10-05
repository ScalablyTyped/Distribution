package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseTileLayerLayerviewCreateErrorEvent extends js.Object {
  var error: Error
  var view: View
}

object BaseTileLayerLayerviewCreateErrorEvent {
  @scala.inline
  def apply(error: Error, view: View): BaseTileLayerLayerviewCreateErrorEvent = {
    val __obj = js.Dynamic.literal(error = error, view = view)
  
    __obj.asInstanceOf[BaseTileLayerLayerviewCreateErrorEvent]
  }
}

