package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderWarning[BaseToken] extends StObject {
  
  var border: Warning[BaseToken]
}
object BorderWarning {
  
  inline def apply[BaseToken](border: Warning[BaseToken]): BorderWarning[BaseToken] = {
    val __obj = js.Dynamic.literal(border = border.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderWarning[BaseToken]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BorderWarning[?], BaseToken] (val x: Self & BorderWarning[BaseToken]) extends AnyVal {
    
    inline def setBorder(value: Warning[BaseToken]): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
  }
}
