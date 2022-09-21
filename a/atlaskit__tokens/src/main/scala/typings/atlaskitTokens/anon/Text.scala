package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Text extends StObject {
  
  var background: AccentRed
  
  var border: AccentPurple
  
  var icon: AccentPurple
  
  var text: AccentOrange
}
object Text {
  
  inline def apply(background: AccentRed, border: AccentPurple, icon: AccentPurple, text: AccentOrange): Text = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], border = border.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Text]
  }
  
  extension [Self <: Text](x: Self) {
    
    inline def setBackground(value: AccentRed): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBorder(value: AccentPurple): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setIcon(value: AccentPurple): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setText(value: AccentOrange): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
