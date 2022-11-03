package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `8`[BaseToken] extends StObject {
  
  var bold: DefaultHoveredPressed[BaseToken]
}
object `8` {
  
  inline def apply[BaseToken](bold: DefaultHoveredPressed[BaseToken]): `8`[BaseToken] = {
    val __obj = js.Dynamic.literal(bold = bold.asInstanceOf[js.Any])
    __obj.asInstanceOf[`8`[BaseToken]]
  }
  
  extension [Self <: `8`[?], BaseToken](x: Self & `8`[BaseToken]) {
    
    inline def setBold(value: DefaultHoveredPressed[BaseToken]): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
  }
}
