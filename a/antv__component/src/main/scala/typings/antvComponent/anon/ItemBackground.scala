package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemBackground extends StObject {
  
  var background: Padding
  
  var itemBackground: StyleFillOpacity
  
  var itemName: SpacingStyle
  
  var itemStates: Inactive
  
  var itemValue: AlignRight
  
  var marker: SpacingNumber
  
  var pageNavigator: Marker
  
  var title: Spacing
}
object ItemBackground {
  
  inline def apply(
    background: Padding,
    itemBackground: StyleFillOpacity,
    itemName: SpacingStyle,
    itemStates: Inactive,
    itemValue: AlignRight,
    marker: SpacingNumber,
    pageNavigator: Marker,
    title: Spacing
  ): ItemBackground = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], itemBackground = itemBackground.asInstanceOf[js.Any], itemName = itemName.asInstanceOf[js.Any], itemStates = itemStates.asInstanceOf[js.Any], itemValue = itemValue.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any], pageNavigator = pageNavigator.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemBackground]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ItemBackground] (val x: Self) extends AnyVal {
    
    inline def setBackground(value: Padding): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setItemBackground(value: StyleFillOpacity): Self = StObject.set(x, "itemBackground", value.asInstanceOf[js.Any])
    
    inline def setItemName(value: SpacingStyle): Self = StObject.set(x, "itemName", value.asInstanceOf[js.Any])
    
    inline def setItemStates(value: Inactive): Self = StObject.set(x, "itemStates", value.asInstanceOf[js.Any])
    
    inline def setItemValue(value: AlignRight): Self = StObject.set(x, "itemValue", value.asInstanceOf[js.Any])
    
    inline def setMarker(value: SpacingNumber): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    inline def setPageNavigator(value: Marker): Self = StObject.set(x, "pageNavigator", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: Spacing): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
