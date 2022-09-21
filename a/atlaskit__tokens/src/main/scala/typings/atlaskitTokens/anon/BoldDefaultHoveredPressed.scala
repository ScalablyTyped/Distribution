package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoldDefaultHoveredPressed[BaseToken] extends StObject {
  
  var `[default]`: DefaultHoveredPressed[BaseToken]
  
  var bold: DefaultHoveredPressed[BaseToken]
  
  var subtle: DefaultHoveredPressed[BaseToken]
}
object BoldDefaultHoveredPressed {
  
  inline def apply[BaseToken](
    `[default]`: DefaultHoveredPressed[BaseToken],
    bold: DefaultHoveredPressed[BaseToken],
    subtle: DefaultHoveredPressed[BaseToken]
  ): BoldDefaultHoveredPressed[BaseToken] = {
    val __obj = js.Dynamic.literal(bold = bold.asInstanceOf[js.Any], subtle = subtle.asInstanceOf[js.Any])
    __obj.updateDynamic("[default]")(`[default]`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoldDefaultHoveredPressed[BaseToken]]
  }
  
  extension [Self <: BoldDefaultHoveredPressed[?], BaseToken](x: Self & BoldDefaultHoveredPressed[BaseToken]) {
    
    inline def setBold(value: DefaultHoveredPressed[BaseToken]): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    inline def setSubtle(value: DefaultHoveredPressed[BaseToken]): Self = StObject.set(x, "subtle", value.asInstanceOf[js.Any])
    
    inline def `set[default]`(value: DefaultHoveredPressed[BaseToken]): Self = StObject.set(x, "[default]", value.asInstanceOf[js.Any])
  }
}
