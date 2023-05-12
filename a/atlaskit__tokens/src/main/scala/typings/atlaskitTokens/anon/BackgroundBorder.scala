package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundBorder[BaseToken] extends StObject {
  
  var background: AccentYellow[BaseToken]
  
  var border: AccentTeal[BaseToken]
  
  var icon: AccentTeal[BaseToken]
  
  var text: AccentRed[BaseToken]
}
object BackgroundBorder {
  
  inline def apply[BaseToken](
    background: AccentYellow[BaseToken],
    border: AccentTeal[BaseToken],
    icon: AccentTeal[BaseToken],
    text: AccentRed[BaseToken]
  ): BackgroundBorder[BaseToken] = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], border = border.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundBorder[BaseToken]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackgroundBorder[?], BaseToken] (val x: Self & BackgroundBorder[BaseToken]) extends AnyVal {
    
    inline def setBackground(value: AccentYellow[BaseToken]): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBorder(value: AccentTeal[BaseToken]): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setIcon(value: AccentTeal[BaseToken]): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setText(value: AccentRed[BaseToken]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
