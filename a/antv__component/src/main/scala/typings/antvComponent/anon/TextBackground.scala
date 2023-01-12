package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextBackground extends StObject {
  
  var line: StyleStroke
  
  var text: Offset
  
  var textBackground: Padding
}
object TextBackground {
  
  inline def apply(line: StyleStroke, text: Offset, textBackground: Padding): TextBackground = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textBackground = textBackground.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextBackground]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextBackground] (val x: Self) extends AnyVal {
    
    inline def setLine(value: StyleStroke): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setText(value: Offset): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextBackground(value: Padding): Self = StObject.set(x, "textBackground", value.asInstanceOf[js.Any])
  }
}
