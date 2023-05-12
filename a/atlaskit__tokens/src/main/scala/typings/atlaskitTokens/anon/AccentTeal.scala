package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccentTeal[BaseToken] extends StObject {
  
  var accent: Teal[BaseToken]
}
object AccentTeal {
  
  inline def apply[BaseToken](accent: Teal[BaseToken]): AccentTeal[BaseToken] = {
    val __obj = js.Dynamic.literal(accent = accent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccentTeal[BaseToken]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccentTeal[?], BaseToken] (val x: Self & AccentTeal[BaseToken]) extends AnyVal {
    
    inline def setAccent(value: Teal[BaseToken]): Self = StObject.set(x, "accent", value.asInstanceOf[js.Any])
  }
}
