package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontSizePaddingTop extends StObject {
  
  var color: String
  
  var fontSize: Double
  
  var paddingTop: Double
  
  var textAlignVertical: String
}
object FontSizePaddingTop {
  
  @scala.inline
  def apply(color: String, fontSize: Double, paddingTop: Double, textAlignVertical: String): FontSizePaddingTop = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], paddingTop = paddingTop.asInstanceOf[js.Any], textAlignVertical = textAlignVertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontSizePaddingTop]
  }
  
  @scala.inline
  implicit class FontSizePaddingTopMutableBuilder[Self <: FontSizePaddingTop] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingTop(value: Double): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAlignVertical(value: String): Self = StObject.set(x, "textAlignVertical", value.asInstanceOf[js.Any])
  }
}
