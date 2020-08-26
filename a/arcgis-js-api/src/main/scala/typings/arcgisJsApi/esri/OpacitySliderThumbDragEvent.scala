package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`thumb-drag`
import typings.arcgisJsApi.arcgisJsApiStrings.drag
import typings.arcgisJsApi.arcgisJsApiStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpacitySliderThumbDragEvent extends js.Object {
  var index: Double = js.native
  var state: start | drag = js.native
  var `type`: `thumb-drag` = js.native
  var value: Double = js.native
}

object OpacitySliderThumbDragEvent {
  @scala.inline
  def apply(index: Double, state: start | drag, `type`: `thumb-drag`, value: Double): OpacitySliderThumbDragEvent = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpacitySliderThumbDragEvent]
  }
  @scala.inline
  implicit class OpacitySliderThumbDragEventOps[Self <: OpacitySliderThumbDragEvent] (val x: Self) extends AnyVal {
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: start | drag): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: `thumb-drag`): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

