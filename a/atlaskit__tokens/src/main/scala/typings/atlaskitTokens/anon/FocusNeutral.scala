package typings.atlaskitTokens.anon

import typings.atlaskitTokens.typesTypesMod.PaintToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FocusNeutral[BaseToken] extends StObject {
  
  var focus: PaintToken[BaseToken]
  
  var neutral: PaintToken[BaseToken]
}
object FocusNeutral {
  
  inline def apply[BaseToken](focus: PaintToken[BaseToken], neutral: PaintToken[BaseToken]): FocusNeutral[BaseToken] = {
    val __obj = js.Dynamic.literal(focus = focus.asInstanceOf[js.Any], neutral = neutral.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusNeutral[BaseToken]]
  }
  
  extension [Self <: FocusNeutral[?], BaseToken](x: Self & FocusNeutral[BaseToken]) {
    
    inline def setFocus(value: PaintToken[BaseToken]): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    inline def setNeutral(value: PaintToken[BaseToken]): Self = StObject.set(x, "neutral", value.asInstanceOf[js.Any])
  }
}
