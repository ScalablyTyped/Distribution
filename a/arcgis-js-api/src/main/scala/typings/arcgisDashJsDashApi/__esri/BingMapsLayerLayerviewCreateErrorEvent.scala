package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BingMapsLayerLayerviewCreateErrorEvent extends js.Object {
  var error: Error
  var view: View
}

object BingMapsLayerLayerviewCreateErrorEvent {
  @scala.inline
  def apply(error: Error, view: View): BingMapsLayerLayerviewCreateErrorEvent = {
    val __obj = js.Dynamic.literal(error = error, view = view)
  
    __obj.asInstanceOf[BingMapsLayerLayerviewCreateErrorEvent]
  }
}

