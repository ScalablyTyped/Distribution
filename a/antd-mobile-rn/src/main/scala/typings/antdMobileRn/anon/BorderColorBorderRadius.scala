package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderColorBorderRadius extends StObject {
  
  var borderColor: String
  
  var borderRadius: Double
  
  var borderWidth: Double
  
  var flexDirection: String
  
  var overflow: String
}
object BorderColorBorderRadius {
  
  @scala.inline
  def apply(
    borderColor: String,
    borderRadius: Double,
    borderWidth: Double,
    flexDirection: String,
    overflow: String
  ): BorderColorBorderRadius = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderRadius = borderRadius.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], flexDirection = flexDirection.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderColorBorderRadius]
  }
  
  @scala.inline
  implicit class BorderColorBorderRadiusMutableBuilder[Self <: BorderColorBorderRadius] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlexDirection(value: String): Self = StObject.set(x, "flexDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverflow(value: String): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
  }
}
