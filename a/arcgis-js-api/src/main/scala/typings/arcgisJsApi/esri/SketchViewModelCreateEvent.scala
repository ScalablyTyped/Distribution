package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.active
import typings.arcgisJsApi.arcgisJsApiStrings.cancel
import typings.arcgisJsApi.arcgisJsApiStrings.circle
import typings.arcgisJsApi.arcgisJsApiStrings.complete
import typings.arcgisJsApi.arcgisJsApiStrings.create
import typings.arcgisJsApi.arcgisJsApiStrings.mesh
import typings.arcgisJsApi.arcgisJsApiStrings.multipoint
import typings.arcgisJsApi.arcgisJsApiStrings.point
import typings.arcgisJsApi.arcgisJsApiStrings.polygon
import typings.arcgisJsApi.arcgisJsApiStrings.polyline
import typings.arcgisJsApi.arcgisJsApiStrings.rectangle
import typings.arcgisJsApi.arcgisJsApiStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchViewModelCreateEvent extends StObject {
  
  var graphic: Graphic
  
  var state: start | active | complete | cancel
  
  var tool: point | multipoint | polyline | polygon | rectangle | circle | mesh
  
  var toolEventInfo: CreateToolEventInfo
  
  var `type`: create
}
object SketchViewModelCreateEvent {
  
  inline def apply(
    graphic: Graphic,
    state: start | active | complete | cancel,
    tool: point | multipoint | polyline | polygon | rectangle | circle | mesh,
    toolEventInfo: CreateToolEventInfo
  ): SketchViewModelCreateEvent = {
    val __obj = js.Dynamic.literal(graphic = graphic.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tool = tool.asInstanceOf[js.Any], toolEventInfo = toolEventInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("create")
    __obj.asInstanceOf[SketchViewModelCreateEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SketchViewModelCreateEvent] (val x: Self) extends AnyVal {
    
    inline def setGraphic(value: Graphic): Self = StObject.set(x, "graphic", value.asInstanceOf[js.Any])
    
    inline def setState(value: start | active | complete | cancel): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setTool(value: point | multipoint | polyline | polygon | rectangle | circle | mesh): Self = StObject.set(x, "tool", value.asInstanceOf[js.Any])
    
    inline def setToolEventInfo(value: CreateToolEventInfo): Self = StObject.set(x, "toolEventInfo", value.asInstanceOf[js.Any])
    
    inline def setType(value: create): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
