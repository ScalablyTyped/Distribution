package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewResizeEvent extends js.Object {
  var height: Double
  var oldHeight: Double
  var oldWidth: Double
  var width: Double
}

object ViewResizeEvent {
  @scala.inline
  def apply(height: Double, oldHeight: Double, oldWidth: Double, width: Double): ViewResizeEvent = {
    val __obj = js.Dynamic.literal(height = height, oldHeight = oldHeight, oldWidth = oldWidth, width = width)
  
    __obj.asInstanceOf[ViewResizeEvent]
  }
}

