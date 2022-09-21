package typings.atlaskitTokens.anon

import typings.atlaskitTokens.typesTypesMod.PaintToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultPaintTokenPressedPaintToken[BaseToken] extends StObject {
  
  var `[default]`: PaintToken[BaseToken]
  
  var pressed: PaintToken[BaseToken]
}
object DefaultPaintTokenPressedPaintToken {
  
  inline def apply[BaseToken](`[default]`: PaintToken[BaseToken], pressed: PaintToken[BaseToken]): DefaultPaintTokenPressedPaintToken[BaseToken] = {
    val __obj = js.Dynamic.literal(pressed = pressed.asInstanceOf[js.Any])
    __obj.updateDynamic("[default]")(`[default]`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultPaintTokenPressedPaintToken[BaseToken]]
  }
  
  extension [Self <: DefaultPaintTokenPressedPaintToken[?], BaseToken](x: Self & DefaultPaintTokenPressedPaintToken[BaseToken]) {
    
    inline def setPressed(value: PaintToken[BaseToken]): Self = StObject.set(x, "pressed", value.asInstanceOf[js.Any])
    
    inline def `set[default]`(value: PaintToken[BaseToken]): Self = StObject.set(x, "[default]", value.asInstanceOf[js.Any])
  }
}
