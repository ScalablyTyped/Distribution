package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Link19[BaseToken] extends StObject {
  
  var link: `19`[BaseToken]
  
  var text: DefaultDisabled[BaseToken]
}
object Link19 {
  
  inline def apply[BaseToken](link: `19`[BaseToken], text: DefaultDisabled[BaseToken]): Link19[BaseToken] = {
    val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Link19[BaseToken]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Link19[?], BaseToken] (val x: Self & Link19[BaseToken]) extends AnyVal {
    
    inline def setLink(value: `19`[BaseToken]): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setText(value: DefaultDisabled[BaseToken]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
