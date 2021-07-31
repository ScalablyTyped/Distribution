package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorFontSizeTextAlign extends StObject {
  
  var color: String
  
  var fontSize: Double
  
  var textAlign: String
}
object ColorFontSizeTextAlign {
  
  @scala.inline
  def apply(color: String, fontSize: Double, textAlign: String): ColorFontSizeTextAlign = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], textAlign = textAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorFontSizeTextAlign]
  }
  
  @scala.inline
  implicit class ColorFontSizeTextAlignMutableBuilder[Self <: ColorFontSizeTextAlign] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAlign(value: String): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
  }
}
