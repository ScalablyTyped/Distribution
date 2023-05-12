package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkDefaultPaintTokenPressedPaintToken[BaseToken] extends StObject {
  
  var link: DefaultPaintTokenPressedPaintToken[BaseToken]
  
  var text: DefaultDisabled[BaseToken]
}
object LinkDefaultPaintTokenPressedPaintToken {
  
  inline def apply[BaseToken](link: DefaultPaintTokenPressedPaintToken[BaseToken], text: DefaultDisabled[BaseToken]): LinkDefaultPaintTokenPressedPaintToken[BaseToken] = {
    val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkDefaultPaintTokenPressedPaintToken[BaseToken]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LinkDefaultPaintTokenPressedPaintToken[?], BaseToken] (val x: Self & LinkDefaultPaintTokenPressedPaintToken[BaseToken]) extends AnyVal {
    
    inline def setLink(value: DefaultPaintTokenPressedPaintToken[BaseToken]): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setText(value: DefaultDisabled[BaseToken]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
