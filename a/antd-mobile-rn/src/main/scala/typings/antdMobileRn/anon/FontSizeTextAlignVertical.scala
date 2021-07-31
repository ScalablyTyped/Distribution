package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontSizeTextAlignVertical extends StObject {
  
  var color: String
  
  var fontSize: Double
  
  var textAlignVertical: String
}
object FontSizeTextAlignVertical {
  
  @scala.inline
  def apply(color: String, fontSize: Double, textAlignVertical: String): FontSizeTextAlignVertical = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], textAlignVertical = textAlignVertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontSizeTextAlignVertical]
  }
  
  @scala.inline
  implicit class FontSizeTextAlignVerticalMutableBuilder[Self <: FontSizeTextAlignVertical] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAlignVertical(value: String): Self = StObject.set(x, "textAlignVertical", value.asInstanceOf[js.Any])
  }
}
