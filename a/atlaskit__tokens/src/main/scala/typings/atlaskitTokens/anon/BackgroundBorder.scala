package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundBorder[BaseToken] extends StObject {
  
  var background: AccentGrayGreen[BaseToken]
  
  var border: AccentBlueGray[BaseToken]
  
  var icon: AccentBlueGray[BaseToken]
  
  var text: AccentYellow[BaseToken]
}
object BackgroundBorder {
  
  inline def apply[BaseToken](
    background: AccentGrayGreen[BaseToken],
    border: AccentBlueGray[BaseToken],
    icon: AccentBlueGray[BaseToken],
    text: AccentYellow[BaseToken]
  ): BackgroundBorder[BaseToken] = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], border = border.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundBorder[BaseToken]]
  }
  
  extension [Self <: BackgroundBorder[?], BaseToken](x: Self & BackgroundBorder[BaseToken]) {
    
    inline def setBackground(value: AccentGrayGreen[BaseToken]): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBorder(value: AccentBlueGray[BaseToken]): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setIcon(value: AccentBlueGray[BaseToken]): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setText(value: AccentYellow[BaseToken]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
