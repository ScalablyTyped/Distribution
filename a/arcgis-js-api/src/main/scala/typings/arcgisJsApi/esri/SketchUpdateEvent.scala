package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.active
import typings.arcgisJsApi.arcgisJsApiStrings.complete
import typings.arcgisJsApi.arcgisJsApiStrings.move
import typings.arcgisJsApi.arcgisJsApiStrings.reshape
import typings.arcgisJsApi.arcgisJsApiStrings.start
import typings.arcgisJsApi.arcgisJsApiStrings.transform
import typings.arcgisJsApi.arcgisJsApiStrings.update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchUpdateEvent extends StObject {
  
  var aborted: Boolean
  
  var graphics: js.Array[Graphic]
  
  var state: start | active | complete
  
  var tool: move | transform | reshape
  
  var toolEventInfo: UpdateToolEventInfo
  
  var `type`: update
}
object SketchUpdateEvent {
  
  inline def apply(
    aborted: Boolean,
    graphics: js.Array[Graphic],
    state: start | active | complete,
    tool: move | transform | reshape,
    toolEventInfo: UpdateToolEventInfo
  ): SketchUpdateEvent = {
    val __obj = js.Dynamic.literal(aborted = aborted.asInstanceOf[js.Any], graphics = graphics.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tool = tool.asInstanceOf[js.Any], toolEventInfo = toolEventInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("update")
    __obj.asInstanceOf[SketchUpdateEvent]
  }
  
  extension [Self <: SketchUpdateEvent](x: Self) {
    
    inline def setAborted(value: Boolean): Self = StObject.set(x, "aborted", value.asInstanceOf[js.Any])
    
    inline def setGraphics(value: js.Array[Graphic]): Self = StObject.set(x, "graphics", value.asInstanceOf[js.Any])
    
    inline def setGraphicsVarargs(value: Graphic*): Self = StObject.set(x, "graphics", js.Array(value :_*))
    
    inline def setState(value: start | active | complete): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setTool(value: move | transform | reshape): Self = StObject.set(x, "tool", value.asInstanceOf[js.Any])
    
    inline def setToolEventInfo(value: UpdateToolEventInfo): Self = StObject.set(x, "toolEventInfo", value.asInstanceOf[js.Any])
    
    inline def setType(value: update): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
