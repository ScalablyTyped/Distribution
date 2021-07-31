package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content extends StObject {
  
  var content: String
  
  var display: Boolean
  
  var style: FontFamily
}
object Content {
  
  @scala.inline
  def apply(content: String, display: Boolean, style: FontFamily): Content = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
  
  @scala.inline
  implicit class ContentMutableBuilder[Self <: Content] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplay(value: Boolean): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: FontFamily): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
