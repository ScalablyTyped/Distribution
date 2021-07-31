package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.circle
import typings.arcgisJsApi.arcgisJsApiStrings.move
import typings.arcgisJsApi.arcgisJsApiStrings.multipoint
import typings.arcgisJsApi.arcgisJsApiStrings.point
import typings.arcgisJsApi.arcgisJsApiStrings.polygon
import typings.arcgisJsApi.arcgisJsApiStrings.polyline
import typings.arcgisJsApi.arcgisJsApiStrings.rectangle
import typings.arcgisJsApi.arcgisJsApiStrings.redo
import typings.arcgisJsApi.arcgisJsApiStrings.reshape
import typings.arcgisJsApi.arcgisJsApiStrings.transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchViewModelRedoEvent extends StObject {
  
  var graphics: js.Array[Graphic]
  
  var tool: point | multipoint | polyline | polygon | rectangle | circle | move | transform | reshape
  
  var `type`: redo
}
object SketchViewModelRedoEvent {
  
  @scala.inline
  def apply(
    graphics: js.Array[Graphic],
    tool: point | multipoint | polyline | polygon | rectangle | circle | move | transform | reshape
  ): SketchViewModelRedoEvent = {
    val __obj = js.Dynamic.literal(graphics = graphics.asInstanceOf[js.Any], tool = tool.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("redo")
    __obj.asInstanceOf[SketchViewModelRedoEvent]
  }
  
  @scala.inline
  implicit class SketchViewModelRedoEventMutableBuilder[Self <: SketchViewModelRedoEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGraphics(value: js.Array[Graphic]): Self = StObject.set(x, "graphics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraphicsVarargs(value: Graphic*): Self = StObject.set(x, "graphics", js.Array(value :_*))
    
    @scala.inline
    def setTool(value: point | multipoint | polyline | polygon | rectangle | circle | move | transform | reshape): Self = StObject.set(x, "tool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: redo): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
