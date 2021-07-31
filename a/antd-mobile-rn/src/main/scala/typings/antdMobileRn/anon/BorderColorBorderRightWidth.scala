package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderColorBorderRightWidth extends StObject {
  
  var borderColor: String
  
  var borderRightWidth: Double
  
  var borderTopWidth: Double
  
  var flexGrow: Double
  
  var height: Double
  
  var justifyContent: String
  
  var paddingVertical: Double
}
object BorderColorBorderRightWidth {
  
  @scala.inline
  def apply(
    borderColor: String,
    borderRightWidth: Double,
    borderTopWidth: Double,
    flexGrow: Double,
    height: Double,
    justifyContent: String,
    paddingVertical: Double
  ): BorderColorBorderRightWidth = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderRightWidth = borderRightWidth.asInstanceOf[js.Any], borderTopWidth = borderTopWidth.asInstanceOf[js.Any], flexGrow = flexGrow.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], justifyContent = justifyContent.asInstanceOf[js.Any], paddingVertical = paddingVertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderColorBorderRightWidth]
  }
  
  @scala.inline
  implicit class BorderColorBorderRightWidthMutableBuilder[Self <: BorderColorBorderRightWidth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderRightWidth(value: Double): Self = StObject.set(x, "borderRightWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderTopWidth(value: Double): Self = StObject.set(x, "borderTopWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlexGrow(value: Double): Self = StObject.set(x, "flexGrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJustifyContent(value: String): Self = StObject.set(x, "justifyContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingVertical(value: Double): Self = StObject.set(x, "paddingVertical", value.asInstanceOf[js.Any])
  }
}
