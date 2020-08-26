package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.delete
import typings.arcgisJsApi.arcgisJsApiStrings.move
import typings.arcgisJsApi.arcgisJsApiStrings.reshape
import typings.arcgisJsApi.arcgisJsApiStrings.transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchDeleteEvent extends js.Object {
  var graphics: js.Array[Graphic] = js.native
  var tool: move | reshape | transform = js.native
  var `type`: delete = js.native
}

object SketchDeleteEvent {
  @scala.inline
  def apply(graphics: js.Array[Graphic], tool: move | reshape | transform, `type`: delete): SketchDeleteEvent = {
    val __obj = js.Dynamic.literal(graphics = graphics.asInstanceOf[js.Any], tool = tool.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchDeleteEvent]
  }
  @scala.inline
  implicit class SketchDeleteEventOps[Self <: SketchDeleteEvent] (val x: Self) extends AnyVal {
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
    def setGraphicsVarargs(value: Graphic*): Self = this.set("graphics", js.Array(value :_*))
    @scala.inline
    def setGraphics(value: js.Array[Graphic]): Self = this.set("graphics", value.asInstanceOf[js.Any])
    @scala.inline
    def setTool(value: move | reshape | transform): Self = this.set("tool", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: delete): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

