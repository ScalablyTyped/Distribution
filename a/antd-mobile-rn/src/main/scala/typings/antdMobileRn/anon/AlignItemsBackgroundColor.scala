package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlignItemsBackgroundColor extends StObject {
  
  var alignItems: String
  
  var backgroundColor: String
  
  var flexDirection: String
  
  var height: Double
  
  var overflow: String
}
object AlignItemsBackgroundColor {
  
  inline def apply(
    alignItems: String,
    backgroundColor: String,
    flexDirection: String,
    height: Double,
    overflow: String
  ): AlignItemsBackgroundColor = {
    val __obj = js.Dynamic.literal(alignItems = alignItems.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], flexDirection = flexDirection.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlignItemsBackgroundColor]
  }
  
  extension [Self <: AlignItemsBackgroundColor](x: Self) {
    
    inline def setAlignItems(value: String): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setFlexDirection(value: String): Self = StObject.set(x, "flexDirection", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setOverflow(value: String): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
  }
}
