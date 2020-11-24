package typings.antvComponent.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemBackground extends js.Object {
  
  var background: Padding = js.native
  
  var itemBackground: StyleFillOpacity = js.native
  
  var itemName: Spacing = js.native
  
  var itemStates: Inactive = js.native
  
  var itemValue: AlignRight = js.native
  
  var marker: SpacingStyle = js.native
  
  var title: Spacing = js.native
}
object ItemBackground {
  
  @scala.inline
  def apply(
    background: Padding,
    itemBackground: StyleFillOpacity,
    itemName: Spacing,
    itemStates: Inactive,
    itemValue: AlignRight,
    marker: SpacingStyle,
    title: Spacing
  ): ItemBackground = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], itemBackground = itemBackground.asInstanceOf[js.Any], itemName = itemName.asInstanceOf[js.Any], itemStates = itemStates.asInstanceOf[js.Any], itemValue = itemValue.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemBackground]
  }
  
  @scala.inline
  implicit class ItemBackgroundOps[Self <: ItemBackground] (val x: Self) extends AnyVal {
    
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
    def setBackground(value: Padding): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemBackground(value: StyleFillOpacity): Self = this.set("itemBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemName(value: Spacing): Self = this.set("itemName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemStates(value: Inactive): Self = this.set("itemStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemValue(value: AlignRight): Self = this.set("itemValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarker(value: SpacingStyle): Self = this.set("marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: Spacing): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}
