package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderTopWidthBorderWidth extends StObject {
  
  var borderColor: String
  
  var borderTopWidth: Double
  
  var borderWidth: Double
}
object BorderTopWidthBorderWidth {
  
  @scala.inline
  def apply(borderColor: String, borderTopWidth: Double, borderWidth: Double): BorderTopWidthBorderWidth = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderTopWidth = borderTopWidth.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderTopWidthBorderWidth]
  }
  
  @scala.inline
  implicit class BorderTopWidthBorderWidthMutableBuilder[Self <: BorderTopWidthBorderWidth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderTopWidth(value: Double): Self = StObject.set(x, "borderTopWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
  }
}
