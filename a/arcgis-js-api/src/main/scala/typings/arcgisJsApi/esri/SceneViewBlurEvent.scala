package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneViewBlurEvent extends js.Object {
  var native: js.Any
  var target: View
}

object SceneViewBlurEvent {
  @scala.inline
  def apply(native: js.Any, target: View): SceneViewBlurEvent = {
    val __obj = js.Dynamic.literal(native = native.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SceneViewBlurEvent]
  }
}

