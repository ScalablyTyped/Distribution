package typings.antvComponent.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CrosshairsRegion extends StObject {
  
  var animate: Boolean
  
  var animateOption: Appear
  
  var capture: Boolean
  
  var container: js.Any
  
  var containerClassName: String
  
  var containerTpl: String
  
  var crosshairs: js.Any
  
  var crosshairsRegion: js.Any
  
  var customContent: js.Any
  
  var defaultStyles: StringDictionary[
    BorderRadius | BoxShadow | Float | LineHeight | ListStyleType | Margin | MarginBottom | MarginLeft
  ]
  
  var domStyles: js.Any
  
  var events: js.Any
  
  var id: String
  
  var itemTpl: String
  
  var items: js.Array[js.Any]
  
  var locationType: String
  
  var name: String
  
  var offset: Double
  
  var offsetX: Double
  
  var offsetY: Double
  
  var parent: js.Any
  
  var position: String
  
  /**
    * tooltip 限制的区域
    * @type {Region}
    */
  var region: js.Any
  
  var showTitle: Boolean
  
  var title: js.Any
  
  var `type`: String
  
  var updateAutoRender: Boolean
  
  var visible: Boolean
  
  var x: Double
  
  var xCrosshairTpl: String
  
  var y: Double
  
  var yCrosshairTpl: String
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
    items: js.Array[js.Any],
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
  implicit class CrosshairsRegionMutableBuilder[Self <: CrosshairsRegion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateOption(value: Appear): Self = StObject.set(x, "animateOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapture(value: Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainer(value: js.Any): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerClassName(value: String): Self = StObject.set(x, "containerClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerTpl(value: String): Self = StObject.set(x, "containerTpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrosshairs(value: js.Any): Self = StObject.set(x, "crosshairs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrosshairsRegion(value: js.Any): Self = StObject.set(x, "crosshairsRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomContent(value: js.Any): Self = StObject.set(x, "customContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultStyles(
      value: StringDictionary[
          BorderRadius | BoxShadow | Float | LineHeight | ListStyleType | Margin | MarginBottom | MarginLeft
        ]
    ): Self = StObject.set(x, "defaultStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomStyles(value: js.Any): Self = StObject.set(x, "domStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvents(value: js.Any): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemTpl(value: String): Self = StObject.set(x, "itemTpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItems(value: js.Array[js.Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: js.Any*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setLocationType(value: String): Self = StObject.set(x, "locationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegion(value: js.Any): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowTitle(value: Boolean): Self = StObject.set(x, "showTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: js.Any): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateAutoRender(value: Boolean): Self = StObject.set(x, "updateAutoRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXCrosshairTpl(value: String): Self = StObject.set(x, "xCrosshairTpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYCrosshairTpl(value: String): Self = StObject.set(x, "yCrosshairTpl", value.asInstanceOf[js.Any])
  }
}
