package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Text extends StObject {
  
  var background: AccentPurple
  
  var border: AccentOrange
  
  var icon: AccentOrange
  
  var text: AccentMagenta
}
object Text {
  
  inline def apply(background: AccentPurple, border: AccentOrange, icon: AccentOrange, text: AccentMagenta): Text = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], border = border.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Text]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Text] (val x: Self) extends AnyVal {
    
    inline def setBackground(value: AccentPurple): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBorder(value: AccentOrange): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setIcon(value: AccentOrange): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setText(value: AccentMagenta): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
