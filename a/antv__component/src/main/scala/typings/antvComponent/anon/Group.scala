package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Group extends StObject {
  
  var animate: Boolean
  
  var animateOption: Appear
  
  var capture: Boolean
  
  var container: Any
  
  var defaultCfg: Label
  
  var events: Any
  
  var group: Any
  
  var id: String
  
  var isInit: Boolean
  
  var isRegister: Boolean
  
  var isUpdating: Boolean
  
  var locationType: String
  
  var name: String
  
  var offsetX: Double
  
  var offsetY: Double
  
  var overlapOrder: js.Array[String]
  
  var subTickLine: Any
  
  var ticks: js.Array[Any]
  
  var title: Any
  
  var `type`: String
  
  var updateAutoRender: Boolean
  
  /**
    * 垂直于坐标轴方向的因子，决定文本、title、tickLine 在坐标轴的哪一侧
    */
  var verticalFactor: Double
  
  var verticalLimitLength: Any
  
  var visible: Boolean
}
object Group {
  
  inline def apply(
    animate: Boolean,
    animateOption: Appear,
    capture: Boolean,
    container: Any,
    defaultCfg: Label,
    events: Any,
    group: Any,
    id: String,
    isInit: Boolean,
    isRegister: Boolean,
    isUpdating: Boolean,
    locationType: String,
    name: String,
    offsetX: Double,
    offsetY: Double,
    overlapOrder: js.Array[String],
    subTickLine: Any,
    ticks: js.Array[Any],
    title: Any,
    `type`: String,
    updateAutoRender: Boolean,
    verticalFactor: Double,
    verticalLimitLength: Any,
    visible: Boolean
  ): Group = {
    val __obj = js.Dynamic.literal(animate = animate.asInstanceOf[js.Any], animateOption = animateOption.asInstanceOf[js.Any], capture = capture.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], defaultCfg = defaultCfg.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isInit = isInit.asInstanceOf[js.Any], isRegister = isRegister.asInstanceOf[js.Any], isUpdating = isUpdating.asInstanceOf[js.Any], locationType = locationType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], overlapOrder = overlapOrder.asInstanceOf[js.Any], subTickLine = subTickLine.asInstanceOf[js.Any], ticks = ticks.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updateAutoRender = updateAutoRender.asInstanceOf[js.Any], verticalFactor = verticalFactor.asInstanceOf[js.Any], verticalLimitLength = verticalLimitLength.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Group]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Group] (val x: Self) extends AnyVal {
    
    inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateOption(value: Appear): Self = StObject.set(x, "animateOption", value.asInstanceOf[js.Any])
    
    inline def setCapture(value: Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
    
    inline def setContainer(value: Any): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setDefaultCfg(value: Label): Self = StObject.set(x, "defaultCfg", value.asInstanceOf[js.Any])
    
    inline def setEvents(value: Any): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setGroup(value: Any): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsInit(value: Boolean): Self = StObject.set(x, "isInit", value.asInstanceOf[js.Any])
    
    inline def setIsRegister(value: Boolean): Self = StObject.set(x, "isRegister", value.asInstanceOf[js.Any])
    
    inline def setIsUpdating(value: Boolean): Self = StObject.set(x, "isUpdating", value.asInstanceOf[js.Any])
    
    inline def setLocationType(value: String): Self = StObject.set(x, "locationType", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setOverlapOrder(value: js.Array[String]): Self = StObject.set(x, "overlapOrder", value.asInstanceOf[js.Any])
    
    inline def setOverlapOrderVarargs(value: String*): Self = StObject.set(x, "overlapOrder", js.Array(value*))
    
    inline def setSubTickLine(value: Any): Self = StObject.set(x, "subTickLine", value.asInstanceOf[js.Any])
    
    inline def setTicks(value: js.Array[Any]): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
    
    inline def setTicksVarargs(value: Any*): Self = StObject.set(x, "ticks", js.Array(value*))
    
    inline def setTitle(value: Any): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUpdateAutoRender(value: Boolean): Self = StObject.set(x, "updateAutoRender", value.asInstanceOf[js.Any])
    
    inline def setVerticalFactor(value: Double): Self = StObject.set(x, "verticalFactor", value.asInstanceOf[js.Any])
    
    inline def setVerticalLimitLength(value: Any): Self = StObject.set(x, "verticalLimitLength", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
