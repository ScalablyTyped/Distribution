package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderBottomWidthBorderColor extends StObject {
  
  var borderBottomWidth: Double
  
  var borderColor: String
  
  var borderStyle: String
}
object BorderBottomWidthBorderColor {
  
  @scala.inline
  def apply(borderBottomWidth: Double, borderColor: String, borderStyle: String): BorderBottomWidthBorderColor = {
    val __obj = js.Dynamic.literal(borderBottomWidth = borderBottomWidth.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderStyle = borderStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderBottomWidthBorderColor]
  }
  
  @scala.inline
  implicit class BorderBottomWidthBorderColorMutableBuilder[Self <: BorderBottomWidthBorderColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderBottomWidth(value: Double): Self = StObject.set(x, "borderBottomWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderStyle(value: String): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
  }
}
