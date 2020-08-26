package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapViewBlurEvent extends js.Object {
  var native: js.Any = js.native
  var target: View = js.native
}

object MapViewBlurEvent {
  @scala.inline
  def apply(native: js.Any, target: View): MapViewBlurEvent = {
    val __obj = js.Dynamic.literal(native = native.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapViewBlurEvent]
  }
  @scala.inline
  implicit class MapViewBlurEventOps[Self <: MapViewBlurEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNative(value: js.Any): Self = this.set("native", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: View): Self = this.set("target", value.asInstanceOf[js.Any])
  }
  
}

