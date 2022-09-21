package typings.atlaskitTokens.anon

import typings.atlaskitTokens.palettesPaletteMod.BaseToken
import typings.atlaskitTokens.typesTypesMod.PaintToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Focus extends StObject {
  
  var focus: PaintToken[BaseToken]
  
  var neutral: PaintToken[BaseToken]
}
object Focus {
  
  inline def apply(focus: PaintToken[BaseToken], neutral: PaintToken[BaseToken]): Focus = {
    val __obj = js.Dynamic.literal(focus = focus.asInstanceOf[js.Any], neutral = neutral.asInstanceOf[js.Any])
    __obj.asInstanceOf[Focus]
  }
  
  extension [Self <: Focus](x: Self) {
    
    inline def setFocus(value: PaintToken[BaseToken]): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    inline def setNeutral(value: PaintToken[BaseToken]): Self = StObject.set(x, "neutral", value.asInstanceOf[js.Any])
  }
}
