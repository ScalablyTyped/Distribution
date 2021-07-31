package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorPaddingHorizontal extends StObject {
  
  var color: String
  
  var paddingHorizontal: Double
  
  var textAlign: String
}
object ColorPaddingHorizontal {
  
  @scala.inline
  def apply(color: String, paddingHorizontal: Double, textAlign: String): ColorPaddingHorizontal = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], paddingHorizontal = paddingHorizontal.asInstanceOf[js.Any], textAlign = textAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorPaddingHorizontal]
  }
  
  @scala.inline
  implicit class ColorPaddingHorizontalMutableBuilder[Self <: ColorPaddingHorizontal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingHorizontal(value: Double): Self = StObject.set(x, "paddingHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAlign(value: String): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
  }
}
