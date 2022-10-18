package typings.atlaskitTokens.anon

import typings.atlaskitTokens.distTypesPalettesLegacyPaletteMod.BaseToken
import typings.atlaskitTokens.distTypesTypesMod.PaintToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Neutral extends StObject {
  
  var focus: PaintToken[BaseToken]
  
  var neutral: PaintToken[BaseToken]
}
object Neutral {
  
  inline def apply(focus: PaintToken[BaseToken], neutral: PaintToken[BaseToken]): Neutral = {
    val __obj = js.Dynamic.literal(focus = focus.asInstanceOf[js.Any], neutral = neutral.asInstanceOf[js.Any])
    __obj.asInstanceOf[Neutral]
  }
  
  extension [Self <: Neutral](x: Self) {
    
    inline def setFocus(value: PaintToken[BaseToken]): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    inline def setNeutral(value: PaintToken[BaseToken]): Self = StObject.set(x, "neutral", value.asInstanceOf[js.Any])
  }
}
