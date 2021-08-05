package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentStyle extends StObject {
  
  var content: String
  
  var style: FontSize
}
object ContentStyle {
  
  inline def apply(content: String, style: FontSize): ContentStyle = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentStyle]
  }
  
  extension [Self <: ContentStyle](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: FontSize): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
