package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlignX extends StObject {
  
  var alignX: String
  
  var alignY: String
  
  var animate: Boolean
  
  var animateOption: Appear
  
  var capture: Boolean
  
  var containerTpl: String
  
  var events: js.Any
  
  var html: String
  
  var id: String
  
  var locationType: String
  
  var name: String
  
  var offsetX: Double
  
  var offsetY: Double
  
  var `type`: String
  
  var updateAutoRender: Boolean
  
  var visible: Boolean
  
  var x: Double
  
  var y: Double
  
  var zIndex: Double
}
object AlignX {
  
  inline def apply(
    alignX: String,
    alignY: String,
    animate: Boolean,
    animateOption: Appear,
    capture: Boolean,
    containerTpl: String,
    events: js.Any,
    html: String,
    id: String,
    locationType: String,
    name: String,
    offsetX: Double,
    offsetY: Double,
    `type`: String,
    updateAutoRender: Boolean,
    visible: Boolean,
    x: Double,
    y: Double,
    zIndex: Double
  ): AlignX = {
    val __obj = js.Dynamic.literal(alignX = alignX.asInstanceOf[js.Any], alignY = alignY.asInstanceOf[js.Any], animate = animate.asInstanceOf[js.Any], animateOption = animateOption.asInstanceOf[js.Any], capture = capture.asInstanceOf[js.Any], containerTpl = containerTpl.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], locationType = locationType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], updateAutoRender = updateAutoRender.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlignX]
  }
  
  extension [Self <: AlignX](x: Self) {
    
    inline def setAlignX(value: String): Self = StObject.set(x, "alignX", value.asInstanceOf[js.Any])
    
    inline def setAlignY(value: String): Self = StObject.set(x, "alignY", value.asInstanceOf[js.Any])
    
    inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateOption(value: Appear): Self = StObject.set(x, "animateOption", value.asInstanceOf[js.Any])
    
    inline def setCapture(value: Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
    
    inline def setContainerTpl(value: String): Self = StObject.set(x, "containerTpl", value.asInstanceOf[js.Any])
    
    inline def setEvents(value: js.Any): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLocationType(value: String): Self = StObject.set(x, "locationType", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUpdateAutoRender(value: Boolean): Self = StObject.set(x, "updateAutoRender", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
  }
}
