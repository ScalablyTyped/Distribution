package typings.antvComponent.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerTpl extends StObject {
  
  var animate: Boolean
  
  var animateOption: Appear
  
  var capture: Boolean
  
  var container: js.Any
  
  var containerClassName: String
  
  var containerTpl: String
  
  var crosshairTpl: String
  
  var defaultCfg: `0`
  
  var defaultStyles: StringDictionary[BackgroundColor | BackgroundColorColor | ColorFontFamily]
  
  var domStyles: js.Any
  
  var end: X
  
  var events: js.Any
  
  var id: String
  
  var locationType: String
  
  var name: String
  
  var offsetX: Double
  
  var offsetY: Double
  
  var parent: js.Any
  
  var start: X
  
  var text: js.Any
  
  var textTpl: String
  
  var `type`: String
  
  var updateAutoRender: Boolean
  
  var visible: Boolean
}
object ContainerTpl {
  
  inline def apply(
    animate: Boolean,
    animateOption: Appear,
    capture: Boolean,
    container: js.Any,
    containerClassName: String,
    containerTpl: String,
    crosshairTpl: String,
    defaultCfg: `0`,
    defaultStyles: StringDictionary[BackgroundColor | BackgroundColorColor | ColorFontFamily],
    domStyles: js.Any,
    end: X,
    events: js.Any,
    id: String,
    locationType: String,
    name: String,
    offsetX: Double,
    offsetY: Double,
    parent: js.Any,
    start: X,
    text: js.Any,
    textTpl: String,
    `type`: String,
    updateAutoRender: Boolean,
    visible: Boolean
  ): ContainerTpl = {
    val __obj = js.Dynamic.literal(animate = animate.asInstanceOf[js.Any], animateOption = animateOption.asInstanceOf[js.Any], capture = capture.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], containerClassName = containerClassName.asInstanceOf[js.Any], containerTpl = containerTpl.asInstanceOf[js.Any], crosshairTpl = crosshairTpl.asInstanceOf[js.Any], defaultCfg = defaultCfg.asInstanceOf[js.Any], defaultStyles = defaultStyles.asInstanceOf[js.Any], domStyles = domStyles.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], locationType = locationType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textTpl = textTpl.asInstanceOf[js.Any], updateAutoRender = updateAutoRender.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerTpl]
  }
  
  extension [Self <: ContainerTpl](x: Self) {
    
    inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateOption(value: Appear): Self = StObject.set(x, "animateOption", value.asInstanceOf[js.Any])
    
    inline def setCapture(value: Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
    
    inline def setContainer(value: js.Any): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerClassName(value: String): Self = StObject.set(x, "containerClassName", value.asInstanceOf[js.Any])
    
    inline def setContainerTpl(value: String): Self = StObject.set(x, "containerTpl", value.asInstanceOf[js.Any])
    
    inline def setCrosshairTpl(value: String): Self = StObject.set(x, "crosshairTpl", value.asInstanceOf[js.Any])
    
    inline def setDefaultCfg(value: `0`): Self = StObject.set(x, "defaultCfg", value.asInstanceOf[js.Any])
    
    inline def setDefaultStyles(value: StringDictionary[BackgroundColor | BackgroundColorColor | ColorFontFamily]): Self = StObject.set(x, "defaultStyles", value.asInstanceOf[js.Any])
    
    inline def setDomStyles(value: js.Any): Self = StObject.set(x, "domStyles", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: X): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEvents(value: js.Any): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLocationType(value: String): Self = StObject.set(x, "locationType", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setStart(value: X): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setText(value: js.Any): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextTpl(value: String): Self = StObject.set(x, "textTpl", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUpdateAutoRender(value: Boolean): Self = StObject.set(x, "updateAutoRender", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
