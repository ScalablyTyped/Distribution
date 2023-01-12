package typings.atlaskitTokens.anon

import typings.atlaskitTokens.distTypesPalettesPaletteMod.BaseToken
import typings.atlaskitTokens.distTypesTypesMod.PaintToken
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Focus] (val x: Self) extends AnyVal {
    
    inline def setFocus(value: PaintToken[BaseToken]): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    inline def setNeutral(value: PaintToken[BaseToken]): Self = StObject.set(x, "neutral", value.asInstanceOf[js.Any])
  }
}
