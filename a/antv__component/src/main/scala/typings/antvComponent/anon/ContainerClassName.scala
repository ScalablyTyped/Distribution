package typings.antvComponent.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerClassName extends js.Object {
  
  var animate: Boolean = js.native
  
  var animateOption: Appear = js.native
  
  var capture: Boolean = js.native
  
  var containerClassName: String = js.native
  
  var containerTpl: String = js.native
  
  var crosshairTpl: String = js.native
  
  var defaultCfg: `0` = js.native
  
  var defaultStyles: StringDictionary[BackgroundColor | BackgroundColorColor | ColorFontFamily] = js.native
  
  var domStyles: js.Any = js.native
  
  var end: X = js.native
  
  var events: js.Any = js.native
  
  var id: String = js.native
  
  var locationType: String = js.native
  
  var name: String = js.native
  
  var offsetX: Double = js.native
  
  var offsetY: Double = js.native
  
  var start: X = js.native
  
  var text: js.Any = js.native
  
  var textTpl: String = js.native
  
  var `type`: String = js.native
  
  var updateAutoRender: Boolean = js.native
  
  var visible: Boolean = js.native
}
object ContainerClassName {
  
  @scala.inline
  def apply(
    animate: Boolean,
    animateOption: Appear,
    capture: Boolean,
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
    start: X,
    text: js.Any,
    textTpl: String,
    `type`: String,
    updateAutoRender: Boolean,
    visible: Boolean
  ): ContainerClassName = {
    val __obj = js.Dynamic.literal(animate = animate.asInstanceOf[js.Any], animateOption = animateOption.asInstanceOf[js.Any], capture = capture.asInstanceOf[js.Any], containerClassName = containerClassName.asInstanceOf[js.Any], containerTpl = containerTpl.asInstanceOf[js.Any], crosshairTpl = crosshairTpl.asInstanceOf[js.Any], defaultCfg = defaultCfg.asInstanceOf[js.Any], defaultStyles = defaultStyles.asInstanceOf[js.Any], domStyles = domStyles.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], locationType = locationType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textTpl = textTpl.asInstanceOf[js.Any], updateAutoRender = updateAutoRender.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerClassName]
  }
  
  @scala.inline
  implicit class ContainerClassNameOps[Self <: ContainerClassName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnimate(value: Boolean): Self = this.set("animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateOption(value: Appear): Self = this.set("animateOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapture(value: Boolean): Self = this.set("capture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerClassName(value: String): Self = this.set("containerClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerTpl(value: String): Self = this.set("containerTpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrosshairTpl(value: String): Self = this.set("crosshairTpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultCfg(value: `0`): Self = this.set("defaultCfg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultStyles(value: StringDictionary[BackgroundColor | BackgroundColorColor | ColorFontFamily]): Self = this.set("defaultStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomStyles(value: js.Any): Self = this.set("domStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd(value: X): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvents(value: js.Any): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationType(value: String): Self = this.set("locationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetX(value: Double): Self = this.set("offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetY(value: Double): Self = this.set("offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: X): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: js.Any): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextTpl(value: String): Self = this.set("textTpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateAutoRender(value: Boolean): Self = this.set("updateAutoRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
  }
}
