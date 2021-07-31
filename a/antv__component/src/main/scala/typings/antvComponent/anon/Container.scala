package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Container extends StObject {
  
  var animate: Boolean
  
  var animateOption: Appear
  
  var capture: Boolean
  
  var container: js.Any
  
  var defaultCfg: Region
  
  var events: js.Any
  
  var group: js.Any
  
  var id: String
  
  var isInit: Boolean
  
  var isRegister: Boolean
  
  var isUpdating: Boolean
  
  var lineLength: Double
  
  var locationType: String
  
  var name: String
  
  var offsetX: Double
  
  var offsetY: Double
  
  var points: js.Array[js.Any]
  
  var `type`: String
  
  var updateAutoRender: Boolean
  
  var visible: Boolean
}
object Container {
  
  @scala.inline
  def apply(
    animate: Boolean,
    animateOption: Appear,
    capture: Boolean,
    container: js.Any,
    defaultCfg: Region,
    events: js.Any,
    group: js.Any,
    id: String,
    isInit: Boolean,
    isRegister: Boolean,
    isUpdating: Boolean,
    lineLength: Double,
    locationType: String,
    name: String,
    offsetX: Double,
    offsetY: Double,
    points: js.Array[js.Any],
    `type`: String,
    updateAutoRender: Boolean,
    visible: Boolean
  ): Container = {
    val __obj = js.Dynamic.literal(animate = animate.asInstanceOf[js.Any], animateOption = animateOption.asInstanceOf[js.Any], capture = capture.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], defaultCfg = defaultCfg.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isInit = isInit.asInstanceOf[js.Any], isRegister = isRegister.asInstanceOf[js.Any], isUpdating = isUpdating.asInstanceOf[js.Any], lineLength = lineLength.asInstanceOf[js.Any], locationType = locationType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], updateAutoRender = updateAutoRender.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Container]
  }
  
  @scala.inline
  implicit class ContainerMutableBuilder[Self <: Container] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateOption(value: Appear): Self = StObject.set(x, "animateOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapture(value: Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainer(value: js.Any): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultCfg(value: Region): Self = StObject.set(x, "defaultCfg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvents(value: js.Any): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroup(value: js.Any): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInit(value: Boolean): Self = StObject.set(x, "isInit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRegister(value: Boolean): Self = StObject.set(x, "isRegister", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsUpdating(value: Boolean): Self = StObject.set(x, "isUpdating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineLength(value: Double): Self = StObject.set(x, "lineLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationType(value: String): Self = StObject.set(x, "locationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoints(value: js.Array[js.Any]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsVarargs(value: js.Any*): Self = StObject.set(x, "points", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateAutoRender(value: Boolean): Self = StObject.set(x, "updateAutoRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
