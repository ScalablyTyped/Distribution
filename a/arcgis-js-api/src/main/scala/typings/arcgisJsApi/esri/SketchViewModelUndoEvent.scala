package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.circle
import typings.arcgisJsApi.arcgisJsApiStrings.move
import typings.arcgisJsApi.arcgisJsApiStrings.multipoint
import typings.arcgisJsApi.arcgisJsApiStrings.point
import typings.arcgisJsApi.arcgisJsApiStrings.polygon
import typings.arcgisJsApi.arcgisJsApiStrings.polyline
import typings.arcgisJsApi.arcgisJsApiStrings.rectangle
import typings.arcgisJsApi.arcgisJsApiStrings.reshape
import typings.arcgisJsApi.arcgisJsApiStrings.transform
import typings.arcgisJsApi.arcgisJsApiStrings.undo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchViewModelUndoEvent extends js.Object {
  
  var graphics: js.Array[Graphic] = js.native
  
  var tool: point | multipoint | polyline | polygon | rectangle | circle | move | transform | reshape = js.native
  
  var `type`: undo = js.native
}
object SketchViewModelUndoEvent {
  
  @scala.inline
  def apply(
    graphics: js.Array[Graphic],
    tool: point | multipoint | polyline | polygon | rectangle | circle | move | transform | reshape,
    `type`: undo
  ): SketchViewModelUndoEvent = {
    val __obj = js.Dynamic.literal(graphics = graphics.asInstanceOf[js.Any], tool = tool.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchViewModelUndoEvent]
  }
  
  @scala.inline
  implicit class SketchViewModelUndoEventOps[Self <: SketchViewModelUndoEvent] (val x: Self) extends AnyVal {
    
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
    def setTool(value: point | multipoint | polyline | polygon | rectangle | circle | move | transform | reshape): Self = this.set("tool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: undo): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
