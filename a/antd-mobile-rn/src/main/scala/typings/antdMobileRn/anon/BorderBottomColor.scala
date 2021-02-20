package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BorderBottomColor extends StObject {
  
  var alignItems: String = js.native
  
  var borderBottomColor: String = js.native
  
  var borderBottomWidth: Double = js.native
  
  var flexDirection: String = js.native
  
  var height: Double = js.native
  
  var marginBottom: Double = js.native
  
  var marginLeft: Double = js.native
  
  var marginTop: Double = js.native
  
  var paddingRight: Double = js.native
}
object BorderBottomColor {
  
  @scala.inline
  def apply(
    alignItems: String,
    borderBottomColor: String,
    borderBottomWidth: Double,
    flexDirection: String,
    height: Double,
    marginBottom: Double,
    marginLeft: Double,
    marginTop: Double,
    paddingRight: Double
  ): BorderBottomColor = {
    val __obj = js.Dynamic.literal(alignItems = alignItems.asInstanceOf[js.Any], borderBottomColor = borderBottomColor.asInstanceOf[js.Any], borderBottomWidth = borderBottomWidth.asInstanceOf[js.Any], flexDirection = flexDirection.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], marginBottom = marginBottom.asInstanceOf[js.Any], marginLeft = marginLeft.asInstanceOf[js.Any], marginTop = marginTop.asInstanceOf[js.Any], paddingRight = paddingRight.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderBottomColor]
  }
  
  @scala.inline
  implicit class BorderBottomColorMutableBuilder[Self <: BorderBottomColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignItems(value: String): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderBottomColor(value: String): Self = StObject.set(x, "borderBottomColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderBottomWidth(value: Double): Self = StObject.set(x, "borderBottomWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlexDirection(value: String): Self = StObject.set(x, "flexDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginBottom(value: Double): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginLeft(value: Double): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginTop(value: Double): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingRight(value: Double): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
  }
}
