package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultDefaultHoveredPressed[BaseToken] extends StObject {
  
  var `[default]`: DefaultHoveredPressed[BaseToken]
  
  var bold: DefaultHoveredPressed[BaseToken]
}
object DefaultDefaultHoveredPressed {
  
  inline def apply[BaseToken](`[default]`: DefaultHoveredPressed[BaseToken], bold: DefaultHoveredPressed[BaseToken]): DefaultDefaultHoveredPressed[BaseToken] = {
    val __obj = js.Dynamic.literal(bold = bold.asInstanceOf[js.Any])
    __obj.updateDynamic("[default]")(`[default]`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultDefaultHoveredPressed[BaseToken]]
  }
  
  extension [Self <: DefaultDefaultHoveredPressed[?], BaseToken](x: Self & DefaultDefaultHoveredPressed[BaseToken]) {
    
    inline def setBold(value: DefaultHoveredPressed[BaseToken]): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    inline def `set[default]`(value: DefaultHoveredPressed[BaseToken]): Self = StObject.set(x, "[default]", value.asInstanceOf[js.Any])
  }
}
