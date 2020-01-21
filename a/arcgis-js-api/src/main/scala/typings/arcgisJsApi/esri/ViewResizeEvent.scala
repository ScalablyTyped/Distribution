package typings.arcgisJsApi.esri

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
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], oldHeight = oldHeight.asInstanceOf[js.Any], oldWidth = oldWidth.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ViewResizeEvent]
  }
}

