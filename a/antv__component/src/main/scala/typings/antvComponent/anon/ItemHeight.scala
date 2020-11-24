package typings.antvComponent.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemHeight extends js.Object {
  
  var animate: Boolean = js.native
  
  var animateOption: Appear = js.native
  
  var background: js.Any = js.native
  
  var capture: Boolean = js.native
  
  var container: js.Any = js.native
  
  var defaultCfg: ItemBackground = js.native
  
  var events: js.Any = js.native
  
  var group: js.Any = js.native
  
  var id: String = js.native
  
  var isInit: Boolean = js.native
  
  var isRegister: Boolean = js.native
  
  var isUpdating: Boolean = js.native
  
  var itemHeight: js.Any = js.native
  
  var itemMarginBottom: Double = js.native
  
  var itemSpacing: Double = js.native
  
  var itemValue: js.Any = js.native
  
  var itemWidth: js.Any = js.native
  
  var items: js.Array[_] = js.native
  
  var layout: String = js.native
  
  var locationType: String = js.native
  
  var maxHeight: js.Any = js.native
  
  var maxItemWidth: js.Any = js.native
  
  var maxWidth: js.Any = js.native
  
  var name: String = js.native
  
  var offsetX: Double = js.native
  
  var offsetY: Double = js.native
  
  var title: js.Any = js.native
  
  var `type`: String = js.native
  
  var updateAutoRender: Boolean = js.native
  
  var visible: Boolean = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object ItemHeight {
  
  @scala.inline
  def apply(
    animate: Boolean,
    animateOption: Appear,
    background: js.Any,
    capture: Boolean,
    container: js.Any,
    defaultCfg: ItemBackground,
    events: js.Any,
    group: js.Any,
    id: String,
    isInit: Boolean,
    isRegister: Boolean,
    isUpdating: Boolean,
    itemHeight: js.Any,
    itemMarginBottom: Double,
    itemSpacing: Double,
    itemValue: js.Any,
    itemWidth: js.Any,
    items: js.Array[_],
    layout: String,
    locationType: String,
    maxHeight: js.Any,
    maxItemWidth: js.Any,
    maxWidth: js.Any,
    name: String,
    offsetX: Double,
    offsetY: Double,
    title: js.Any,
    `type`: String,
    updateAutoRender: Boolean,
    visible: Boolean,
    x: Double,
    y: Double
  ): ItemHeight = {
    val __obj = js.Dynamic.literal(animate = animate.asInstanceOf[js.Any], animateOption = animateOption.asInstanceOf[js.Any], background = background.asInstanceOf[js.Any], capture = capture.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], defaultCfg = defaultCfg.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isInit = isInit.asInstanceOf[js.Any], isRegister = isRegister.asInstanceOf[js.Any], isUpdating = isUpdating.asInstanceOf[js.Any], itemHeight = itemHeight.asInstanceOf[js.Any], itemMarginBottom = itemMarginBottom.asInstanceOf[js.Any], itemSpacing = itemSpacing.asInstanceOf[js.Any], itemValue = itemValue.asInstanceOf[js.Any], itemWidth = itemWidth.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], locationType = locationType.asInstanceOf[js.Any], maxHeight = maxHeight.asInstanceOf[js.Any], maxItemWidth = maxItemWidth.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updateAutoRender = updateAutoRender.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemHeight]
  }
  
  @scala.inline
  implicit class ItemHeightOps[Self <: ItemHeight] (val x: Self) extends AnyVal {
    
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
    def setBackground(value: js.Any): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapture(value: Boolean): Self = this.set("capture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainer(value: js.Any): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultCfg(value: ItemBackground): Self = this.set("defaultCfg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvents(value: js.Any): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroup(value: js.Any): Self = this.set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInit(value: Boolean): Self = this.set("isInit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRegister(value: Boolean): Self = this.set("isRegister", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsUpdating(value: Boolean): Self = this.set("isUpdating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemHeight(value: js.Any): Self = this.set("itemHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemMarginBottom(value: Double): Self = this.set("itemMarginBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemSpacing(value: Double): Self = this.set("itemSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemValue(value: js.Any): Self = this.set("itemValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemWidth(value: js.Any): Self = this.set("itemWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: js.Any*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[_]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayout(value: String): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationType(value: String): Self = this.set("locationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxHeight(value: js.Any): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxItemWidth(value: js.Any): Self = this.set("maxItemWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidth(value: js.Any): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetX(value: Double): Self = this.set("offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetY(value: Double): Self = this.set("offsetY", value.asInstanceOf[js.Any])
    
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
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
}
