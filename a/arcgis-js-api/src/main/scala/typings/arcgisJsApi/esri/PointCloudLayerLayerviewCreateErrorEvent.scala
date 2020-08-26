package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointCloudLayerLayerviewCreateErrorEvent extends js.Object {
  var error: Error = js.native
  var view: View = js.native
}

object PointCloudLayerLayerviewCreateErrorEvent {
  @scala.inline
  def apply(error: Error, view: View): PointCloudLayerLayerviewCreateErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointCloudLayerLayerviewCreateErrorEvent]
  }
  @scala.inline
  implicit class PointCloudLayerLayerviewCreateErrorEventOps[Self <: PointCloudLayerLayerviewCreateErrorEvent] (val x: Self) extends AnyVal {
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
    def setError(value: Error): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setView(value: View): Self = this.set("view", value.asInstanceOf[js.Any])
  }
  
}

