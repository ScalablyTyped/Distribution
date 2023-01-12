package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundColorBorderBottomColor extends StObject {
  
  var alignItems: String
  
  var backgroundColor: String
  
  var borderBottomColor: String
  
  var paddingVertical: Double
}
object BackgroundColorBorderBottomColor {
  
  inline def apply(alignItems: String, backgroundColor: String, borderBottomColor: String, paddingVertical: Double): BackgroundColorBorderBottomColor = {
    val __obj = js.Dynamic.literal(alignItems = alignItems.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], borderBottomColor = borderBottomColor.asInstanceOf[js.Any], paddingVertical = paddingVertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundColorBorderBottomColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackgroundColorBorderBottomColor] (val x: Self) extends AnyVal {
    
    inline def setAlignItems(value: String): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBorderBottomColor(value: String): Self = StObject.set(x, "borderBottomColor", value.asInstanceOf[js.Any])
    
    inline def setPaddingVertical(value: Double): Self = StObject.set(x, "paddingVertical", value.asInstanceOf[js.Any])
  }
}
