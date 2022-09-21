package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderDefaultDisabled[BaseToken] extends StObject {
  
  var border: DefaultDisabled[BaseToken]
}
object BorderDefaultDisabled {
  
  inline def apply[BaseToken](border: DefaultDisabled[BaseToken]): BorderDefaultDisabled[BaseToken] = {
    val __obj = js.Dynamic.literal(border = border.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderDefaultDisabled[BaseToken]]
  }
  
  extension [Self <: BorderDefaultDisabled[?], BaseToken](x: Self & BorderDefaultDisabled[BaseToken]) {
    
    inline def setBorder(value: DefaultDisabled[BaseToken]): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
  }
}
