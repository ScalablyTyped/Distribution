package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Group extends StObject {
  
  var animate: Boolean = js.native
  
  var animateOption: Appear = js.native
  
  var capture: Boolean = js.native
  
  var container: js.Any = js.native
  
  var defaultCfg: Label = js.native
  
  var events: js.Any = js.native
  
  var group: js.Any = js.native
  
  var id: String = js.native
  
  var isInit: Boolean = js.native
  
  var isRegister: Boolean = js.native
  
  var isUpdating: Boolean = js.native
  
  var locationType: String = js.native
  
  var name: String = js.native
  
  var offsetX: Double = js.native
  
  var offsetY: Double = js.native
  
  var overlapOrder: js.Array[String] = js.native
  
  var subTickLine: js.Any = js.native
  
  var ticks: js.Array[_] = js.native
  
  var title: js.Any = js.native
  
  var `type`: String = js.native
  
  var updateAutoRender: Boolean = js.native
  
  /**
    * 垂直于坐标轴方向的因子，决定文本、title、tickLine 在坐标轴的哪一侧
    */
  var verticalFactor: Double = js.native
  
  var verticalLimitLength: js.Any = js.native
  
  var visible: Boolean = js.native
}
object Group {
  
  @scala.inline
  def apply(
    animate: Boolean,
    animateOption: Appear,
    capture: Boolean,
    container: js.Any,
    defaultCfg: Label,
    events: js.Any,
    group: js.Any,
    id: String,
    isInit: Boolean,
    isRegister: Boolean,
    isUpdating: Boolean,
    locationType: String,
    name: String,
    offsetX: Double,
    offsetY: Double,
    overlapOrder: js.Array[String],
    subTickLine: js.Any,
    ticks: js.Array[_],
    title: js.Any,
    `type`: String,
    updateAutoRender: Boolean,
    verticalFactor: Double,
    verticalLimitLength: js.Any,
    visible: Boolean
  ): Group = {
    val __obj = js.Dynamic.literal(animate = animate.asInstanceOf[js.Any], animateOption = animateOption.asInstanceOf[js.Any], capture = capture.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], defaultCfg = defaultCfg.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isInit = isInit.asInstanceOf[js.Any], isRegister = isRegister.asInstanceOf[js.Any], isUpdating = isUpdating.asInstanceOf[js.Any], locationType = locationType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], overlapOrder = overlapOrder.asInstanceOf[js.Any], subTickLine = subTickLine.asInstanceOf[js.Any], ticks = ticks.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updateAutoRender = updateAutoRender.asInstanceOf[js.Any], verticalFactor = verticalFactor.asInstanceOf[js.Any], verticalLimitLength = verticalLimitLength.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Group]
  }
  
  @scala.inline
  implicit class GroupMutableBuilder[Self <: Group] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateOption(value: Appear): Self = StObject.set(x, "animateOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapture(value: Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainer(value: js.Any): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultCfg(value: Label): Self = StObject.set(x, "defaultCfg", value.asInstanceOf[js.Any])
    
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
    def setLocationType(value: String): Self = StObject.set(x, "locationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlapOrder(value: js.Array[String]): Self = StObject.set(x, "overlapOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlapOrderVarargs(value: String*): Self = StObject.set(x, "overlapOrder", js.Array(value :_*))
    
    @scala.inline
    def setSubTickLine(value: js.Any): Self = StObject.set(x, "subTickLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicks(value: js.Array[_]): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicksVarargs(value: js.Any*): Self = StObject.set(x, "ticks", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: js.Any): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateAutoRender(value: Boolean): Self = StObject.set(x, "updateAutoRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalFactor(value: Double): Self = StObject.set(x, "verticalFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalLimitLength(value: js.Any): Self = StObject.set(x, "verticalLimitLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
