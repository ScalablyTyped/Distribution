package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3`[BaseToken] extends StObject {
  
  var bold: DefaultHoveredPressed[BaseToken]
}
object `3` {
  
  inline def apply[BaseToken](bold: DefaultHoveredPressed[BaseToken]): `3`[BaseToken] = {
    val __obj = js.Dynamic.literal(bold = bold.asInstanceOf[js.Any])
    __obj.asInstanceOf[`3`[BaseToken]]
  }
  
  extension [Self <: `3`[?], BaseToken](x: Self & `3`[BaseToken]) {
    
    inline def setBold(value: DefaultHoveredPressed[BaseToken]): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
  }
}
