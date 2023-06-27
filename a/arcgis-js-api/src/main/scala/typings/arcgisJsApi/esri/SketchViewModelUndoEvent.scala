package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.circle
import typings.arcgisJsApi.arcgisJsApiStrings.mesh
import typings.arcgisJsApi.arcgisJsApiStrings.move
import typings.arcgisJsApi.arcgisJsApiStrings.multipoint
import typings.arcgisJsApi.arcgisJsApiStrings.point
import typings.arcgisJsApi.arcgisJsApiStrings.polygon
import typings.arcgisJsApi.arcgisJsApiStrings.polyline
import typings.arcgisJsApi.arcgisJsApiStrings.rectangle
import typings.arcgisJsApi.arcgisJsApiStrings.reshape
import typings.arcgisJsApi.arcgisJsApiStrings.transform
import typings.arcgisJsApi.arcgisJsApiStrings.undo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchViewModelUndoEvent extends StObject {
  
  var graphics: js.Array[Graphic]
  
  var tool: point | multipoint | polyline | polygon | rectangle | circle | mesh | move | transform | reshape
  
  var `type`: undo
}
object SketchViewModelUndoEvent {
  
  inline def apply(
    graphics: js.Array[Graphic],
    tool: point | multipoint | polyline | polygon | rectangle | circle | mesh | move | transform | reshape
  ): SketchViewModelUndoEvent = {
    val __obj = js.Dynamic.literal(graphics = graphics.asInstanceOf[js.Any], tool = tool.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("undo")
    __obj.asInstanceOf[SketchViewModelUndoEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SketchViewModelUndoEvent] (val x: Self) extends AnyVal {
    
    inline def setGraphics(value: js.Array[Graphic]): Self = StObject.set(x, "graphics", value.asInstanceOf[js.Any])
    
    inline def setGraphicsVarargs(value: Graphic*): Self = StObject.set(x, "graphics", js.Array(value*))
    
    inline def setTool(
      value: point | multipoint | polyline | polygon | rectangle | circle | mesh | move | transform | reshape
    ): Self = StObject.set(x, "tool", value.asInstanceOf[js.Any])
    
    inline def setType(value: undo): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
