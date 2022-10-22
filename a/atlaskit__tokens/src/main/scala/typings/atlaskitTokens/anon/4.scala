package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4`[BaseToken] extends StObject {
  
  var bold: DefaultHoveredPressed[BaseToken]
}
object `4` {
  
  inline def apply[BaseToken](bold: DefaultHoveredPressed[BaseToken]): `4`[BaseToken] = {
    val __obj = js.Dynamic.literal(bold = bold.asInstanceOf[js.Any])
    __obj.asInstanceOf[`4`[BaseToken]]
  }
  
  extension [Self <: `4`[?], BaseToken](x: Self & `4`[BaseToken]) {
    
    inline def setBold(value: DefaultHoveredPressed[BaseToken]): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
  }
}
