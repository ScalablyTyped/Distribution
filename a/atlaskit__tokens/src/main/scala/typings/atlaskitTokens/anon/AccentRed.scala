package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccentRed[BaseToken] extends StObject {
  
  var accent: Red[BaseToken]
}
object AccentRed {
  
  inline def apply[BaseToken](accent: Red[BaseToken]): AccentRed[BaseToken] = {
    val __obj = js.Dynamic.literal(accent = accent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccentRed[BaseToken]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccentRed[?], BaseToken] (val x: Self & AccentRed[BaseToken]) extends AnyVal {
    
    inline def setAccent(value: Red[BaseToken]): Self = StObject.set(x, "accent", value.asInstanceOf[js.Any])
  }
}
