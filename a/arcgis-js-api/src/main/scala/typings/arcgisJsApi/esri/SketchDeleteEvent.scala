package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.delete
import typings.arcgisJsApi.arcgisJsApiStrings.move
import typings.arcgisJsApi.arcgisJsApiStrings.reshape
import typings.arcgisJsApi.arcgisJsApiStrings.transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchDeleteEvent extends StObject {
  
  var graphics: js.Array[Graphic]
  
  var tool: move | reshape | transform
  
  var `type`: delete
}
object SketchDeleteEvent {
  
  @scala.inline
  def apply(graphics: js.Array[Graphic], tool: move | reshape | transform): SketchDeleteEvent = {
    val __obj = js.Dynamic.literal(graphics = graphics.asInstanceOf[js.Any], tool = tool.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("delete")
    __obj.asInstanceOf[SketchDeleteEvent]
  }
  
  @scala.inline
  implicit class SketchDeleteEventMutableBuilder[Self <: SketchDeleteEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGraphics(value: js.Array[Graphic]): Self = StObject.set(x, "graphics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraphicsVarargs(value: Graphic*): Self = StObject.set(x, "graphics", js.Array(value :_*))
    
    @scala.inline
    def setTool(value: move | reshape | transform): Self = StObject.set(x, "tool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: delete): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
