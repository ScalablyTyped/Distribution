package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlignItemsBorderBottomColor extends StObject {
  
  var alignItems: String
  
  var borderBottomColor: String
  
  var borderBottomWidth: Double
  
  var flexDirection: String
  
  var flexGrow: Double
  
  var height: Double
  
  var justifyContent: String
}
object AlignItemsBorderBottomColor {
  
  @scala.inline
  def apply(
    alignItems: String,
    borderBottomColor: String,
    borderBottomWidth: Double,
    flexDirection: String,
    flexGrow: Double,
    height: Double,
    justifyContent: String
  ): AlignItemsBorderBottomColor = {
    val __obj = js.Dynamic.literal(alignItems = alignItems.asInstanceOf[js.Any], borderBottomColor = borderBottomColor.asInstanceOf[js.Any], borderBottomWidth = borderBottomWidth.asInstanceOf[js.Any], flexDirection = flexDirection.asInstanceOf[js.Any], flexGrow = flexGrow.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], justifyContent = justifyContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlignItemsBorderBottomColor]
  }
  
  @scala.inline
  implicit class AlignItemsBorderBottomColorMutableBuilder[Self <: AlignItemsBorderBottomColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignItems(value: String): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderBottomColor(value: String): Self = StObject.set(x, "borderBottomColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderBottomWidth(value: Double): Self = StObject.set(x, "borderBottomWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlexDirection(value: String): Self = StObject.set(x, "flexDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlexGrow(value: Double): Self = StObject.set(x, "flexGrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJustifyContent(value: String): Self = StObject.set(x, "justifyContent", value.asInstanceOf[js.Any])
  }
}
