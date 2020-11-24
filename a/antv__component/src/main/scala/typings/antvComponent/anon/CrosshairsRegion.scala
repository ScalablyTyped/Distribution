package typings.antvComponent.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CrosshairsRegion extends js.Object {
  
  var animate: Boolean = js.native
  
  var animateOption: Appear = js.native
  
  var capture: Boolean = js.native
  
  var container: js.Any = js.native
  
  var containerClassName: String = js.native
  
  var containerTpl: String = js.native
  
  var crosshairs: js.Any = js.native
  
  var crosshairsRegion: js.Any = js.native
  
  var customContent: js.Any = js.native
  
  var defaultStyles: StringDictionary[
    BorderRadius | BoxShadow | Float | LineHeight | ListStyleType | Margin | MarginBottom | MarginLeft
  ] = js.native
  
  var domStyles: js.Any = js.native
  
  var events: js.Any = js.native
  
  var id: String = js.native
  
  var itemTpl: String = js.native
  
  var items: js.Array[_] = js.native
  
  var locationType: String = js.native
  
  var name: String = js.native
  
  var offset: Double = js.native
  
  var offsetX: Double = js.native
  
  var offsetY: Double = js.native
  
  var parent: js.Any = js.native
  
  var position: String = js.native
  
  /**
    * tooltip 限制的区域
    * @type {Region}
    */
  var region: js.Any = js.native
  
  var showTitle: Boolean = js.native
  
  var title: js.Any = js.native
  
  var `type`: String = js.native
  
  var updateAutoRender: Boolean = js.native
  
  var visible: Boolean = js.native
  
  var x: Double = js.native
  
  var xCrosshairTpl: String = js.native
  
  var y: Double = js.native
  
  var yCrosshairTpl: String = js.native
}
object CrosshairsRegion {
  
  @scala.inline
  def apply(
    animate: Boolean,
    animateOption: Appear,
    capture: Boolean,
    container: js.Any,
    containerClassName: String,
    containerTpl: String,
    crosshairs: js.Any,
    crosshairsRegion: js.Any,
    customContent: js.Any,
    defaultStyles: StringDictionary[
      BorderRadius | BoxShadow | Float | LineHeight | ListStyleType | Margin | MarginBottom | MarginLeft
    ],
    domStyles: js.Any,
    events: js.Any,
    id: String,
    itemTpl: String,
    items: js.Array[_],
    locationType: String,
    name: String,
    offset: Double,
    offsetX: Double,
    offsetY: Double,
    parent: js.Any,
    position: String,
    region: js.Any,
    showTitle: Boolean,
    title: js.Any,
    `type`: String,
    updateAutoRender: Boolean,
    visible: Boolean,
    x: Double,
    xCrosshairTpl: String,
    y: Double,
    yCrosshairTpl: String
  ): CrosshairsRegion = {
    val __obj = js.Dynamic.literal(animate = animate.asInstanceOf[js.Any], animateOption = animateOption.asInstanceOf[js.Any], capture = capture.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], containerClassName = containerClassName.asInstanceOf[js.Any], containerTpl = containerTpl.asInstanceOf[js.Any], crosshairs = crosshairs.asInstanceOf[js.Any], crosshairsRegion = crosshairsRegion.asInstanceOf[js.Any], customContent = customContent.asInstanceOf[js.Any], defaultStyles = defaultStyles.asInstanceOf[js.Any], domStyles = domStyles.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], itemTpl = itemTpl.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], locationType = locationType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], showTitle = showTitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updateAutoRender = updateAutoRender.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xCrosshairTpl = xCrosshairTpl.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yCrosshairTpl = yCrosshairTpl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrosshairsRegion]
  }
  
  @scala.inline
  implicit class CrosshairsRegionOps[Self <: CrosshairsRegion] (val x: Self) extends AnyVal {
    
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
    def setContainer(value: js.Any): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerClassName(value: String): Self = this.set("containerClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerTpl(value: String): Self = this.set("containerTpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrosshairs(value: js.Any): Self = this.set("crosshairs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrosshairsRegion(value: js.Any): Self = this.set("crosshairsRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomContent(value: js.Any): Self = this.set("customContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultStyles(
      value: StringDictionary[
          BorderRadius | BoxShadow | Float | LineHeight | ListStyleType | Margin | MarginBottom | MarginLeft
        ]
    ): Self = this.set("defaultStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomStyles(value: js.Any): Self = this.set("domStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvents(value: js.Any): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemTpl(value: String): Self = this.set("itemTpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: js.Any*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[_]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationType(value: String): Self = this.set("locationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetX(value: Double): Self = this.set("offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetY(value: Double): Self = this.set("offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegion(value: js.Any): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowTitle(value: Boolean): Self = this.set("showTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: js.Any): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateAutoRender(value: Boolean): Self = this.set("updateAutoRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXCrosshairTpl(value: String): Self = this.set("xCrosshairTpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYCrosshairTpl(value: String): Self = this.set("yCrosshairTpl", value.asInstanceOf[js.Any])
  }
}
