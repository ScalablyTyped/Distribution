package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapViewFocusEvent extends js.Object {
  var native: js.Any
  var target: View
}

object MapViewFocusEvent {
  @scala.inline
  def apply(native: js.Any, target: View): MapViewFocusEvent = {
    val __obj = js.Dynamic.literal(native = native.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MapViewFocusEvent]
  }
}

