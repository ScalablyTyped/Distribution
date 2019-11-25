package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapViewResizeEvent extends js.Object {
  var height: Double
  var oldHeight: Double
  var oldWidth: Double
  var width: Double
}

object MapViewResizeEvent {
  @scala.inline
  def apply(height: Double, oldHeight: Double, oldWidth: Double, width: Double): MapViewResizeEvent = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], oldHeight = oldHeight.asInstanceOf[js.Any], oldWidth = oldWidth.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MapViewResizeEvent]
  }
}

