package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundColorColorFontSize extends StObject {
  
  var backgroundColor: String
  
  var color: String
  
  var fontSize: Double
  
  var textAlign: String
}
object BackgroundColorColorFontSize {
  
  @scala.inline
  def apply(backgroundColor: String, color: String, fontSize: Double, textAlign: String): BackgroundColorColorFontSize = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], textAlign = textAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundColorColorFontSize]
  }
  
  @scala.inline
  implicit class BackgroundColorColorFontSizeMutableBuilder[Self <: BackgroundColorColorFontSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAlign(value: String): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
  }
}
