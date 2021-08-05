package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundColorMinWidth extends StObject {
  
  var alignItems: String
  
  var backgroundColor: String
  
  var minWidth: Double
}
object BackgroundColorMinWidth {
  
  inline def apply(alignItems: String, backgroundColor: String, minWidth: Double): BackgroundColorMinWidth = {
    val __obj = js.Dynamic.literal(alignItems = alignItems.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundColorMinWidth]
  }
  
  extension [Self <: BackgroundColorMinWidth](x: Self) {
    
    inline def setAlignItems(value: String): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
  }
}
