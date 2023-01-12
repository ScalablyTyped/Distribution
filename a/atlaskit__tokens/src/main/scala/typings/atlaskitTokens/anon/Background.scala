package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Background extends StObject {
  
  var background: AccentGreen
  
  var border: AccentGray
  
  var icon: AccentGray
  
  var text: Accent
}
object Background {
  
  inline def apply(background: AccentGreen, border: AccentGray, icon: AccentGray, text: Accent): Background = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], border = border.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Background]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Background] (val x: Self) extends AnyVal {
    
    inline def setBackground(value: AccentGreen): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBorder(value: AccentGray): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setIcon(value: AccentGray): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setText(value: Accent): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
