package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.active
import typings.arcgisJsApi.arcgisJsApiStrings.cancel
import typings.arcgisJsApi.arcgisJsApiStrings.circle
import typings.arcgisJsApi.arcgisJsApiStrings.complete
import typings.arcgisJsApi.arcgisJsApiStrings.create
import typings.arcgisJsApi.arcgisJsApiStrings.point
import typings.arcgisJsApi.arcgisJsApiStrings.polygon
import typings.arcgisJsApi.arcgisJsApiStrings.polyline
import typings.arcgisJsApi.arcgisJsApiStrings.rectangle
import typings.arcgisJsApi.arcgisJsApiStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchCreateEvent extends StObject {
  
  var graphic: Graphic
  
  var state: start | active | complete | cancel
  
  var tool: point | polyline | polygon | rectangle | circle
  
  var toolEventInfo: CreateToolEventInfo
  
  var `type`: create
}
object SketchCreateEvent {
  
  @scala.inline
  def apply(
    graphic: Graphic,
    state: start | active | complete | cancel,
    tool: point | polyline | polygon | rectangle | circle,
    toolEventInfo: CreateToolEventInfo
  ): SketchCreateEvent = {
    val __obj = js.Dynamic.literal(graphic = graphic.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tool = tool.asInstanceOf[js.Any], toolEventInfo = toolEventInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("create")
    __obj.asInstanceOf[SketchCreateEvent]
  }
  
  @scala.inline
  implicit class SketchCreateEventMutableBuilder[Self <: SketchCreateEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGraphic(value: Graphic): Self = StObject.set(x, "graphic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: start | active | complete | cancel): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTool(value: point | polyline | polygon | rectangle | circle): Self = StObject.set(x, "tool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolEventInfo(value: CreateToolEventInfo): Self = StObject.set(x, "toolEventInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: create): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
