package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemBackground extends StObject {
  
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
  implicit class ItemBackgroundMutableBuilder[Self <: ItemBackground] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground(value: Padding): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemBackground(value: StyleFillOpacity): Self = StObject.set(x, "itemBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemName(value: Spacing): Self = StObject.set(x, "itemName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemStates(value: Inactive): Self = StObject.set(x, "itemStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemValue(value: AlignRight): Self = StObject.set(x, "itemValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarker(value: SpacingStyle): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: Spacing): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
