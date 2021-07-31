package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaddingTop extends StObject {
  
  var backgroundColor: String
  
  var color: String
  
  var fontSize: Double
  
  var paddingBottom: Double
  
  var paddingHorizontal: Double
  
  var paddingTop: Double
}
object PaddingTop {
  
  @scala.inline
  def apply(
    backgroundColor: String,
    color: String,
    fontSize: Double,
    paddingBottom: Double,
    paddingHorizontal: Double,
    paddingTop: Double
  ): PaddingTop = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], paddingBottom = paddingBottom.asInstanceOf[js.Any], paddingHorizontal = paddingHorizontal.asInstanceOf[js.Any], paddingTop = paddingTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaddingTop]
  }
  
  @scala.inline
  implicit class PaddingTopMutableBuilder[Self <: PaddingTop] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingBottom(value: Double): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingHorizontal(value: Double): Self = StObject.set(x, "paddingHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingTop(value: Double): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
  }
}
