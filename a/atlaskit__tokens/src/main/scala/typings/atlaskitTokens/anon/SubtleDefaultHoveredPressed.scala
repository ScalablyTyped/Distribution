package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubtleDefaultHoveredPressed[BaseToken] extends StObject {
  
  var subtle: DefaultHoveredPressed[BaseToken]
}
object SubtleDefaultHoveredPressed {
  
  inline def apply[BaseToken](subtle: DefaultHoveredPressed[BaseToken]): SubtleDefaultHoveredPressed[BaseToken] = {
    val __obj = js.Dynamic.literal(subtle = subtle.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubtleDefaultHoveredPressed[BaseToken]]
  }
  
  extension [Self <: SubtleDefaultHoveredPressed[?], BaseToken](x: Self & SubtleDefaultHoveredPressed[BaseToken]) {
    
    inline def setSubtle(value: DefaultHoveredPressed[BaseToken]): Self = StObject.set(x, "subtle", value.asInstanceOf[js.Any])
  }
}
