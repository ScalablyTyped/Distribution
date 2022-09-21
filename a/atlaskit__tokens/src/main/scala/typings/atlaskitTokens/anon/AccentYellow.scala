package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccentYellow[BaseToken] extends StObject {
  
  var accent: Yellow[BaseToken]
}
object AccentYellow {
  
  inline def apply[BaseToken](accent: Yellow[BaseToken]): AccentYellow[BaseToken] = {
    val __obj = js.Dynamic.literal(accent = accent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccentYellow[BaseToken]]
  }
  
  extension [Self <: AccentYellow[?], BaseToken](x: Self & AccentYellow[BaseToken]) {
    
    inline def setAccent(value: Yellow[BaseToken]): Self = StObject.set(x, "accent", value.asInstanceOf[js.Any])
  }
}
