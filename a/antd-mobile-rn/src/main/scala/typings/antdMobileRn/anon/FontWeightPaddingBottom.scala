package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontWeightPaddingBottom extends StObject {
  
  var color: String
  
  var fontSize: Double
  
  var fontWeight: String
  
  var paddingBottom: Double
}
object FontWeightPaddingBottom {
  
  @scala.inline
  def apply(color: String, fontSize: Double, fontWeight: String, paddingBottom: Double): FontWeightPaddingBottom = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], paddingBottom = paddingBottom.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontWeightPaddingBottom]
  }
  
  @scala.inline
  implicit class FontWeightPaddingBottomMutableBuilder[Self <: FontWeightPaddingBottom] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingBottom(value: Double): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
  }
}
