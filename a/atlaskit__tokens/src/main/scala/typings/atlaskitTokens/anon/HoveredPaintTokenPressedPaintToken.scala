package typings.atlaskitTokens.anon

import typings.atlaskitTokens.distTypesTypesMod.PaintToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HoveredPaintTokenPressedPaintToken[BaseToken] extends StObject {
  
  var hovered: PaintToken[BaseToken]
  
  var pressed: PaintToken[BaseToken]
}
object HoveredPaintTokenPressedPaintToken {
  
  inline def apply[BaseToken](hovered: PaintToken[BaseToken], pressed: PaintToken[BaseToken]): HoveredPaintTokenPressedPaintToken[BaseToken] = {
    val __obj = js.Dynamic.literal(hovered = hovered.asInstanceOf[js.Any], pressed = pressed.asInstanceOf[js.Any])
    __obj.asInstanceOf[HoveredPaintTokenPressedPaintToken[BaseToken]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HoveredPaintTokenPressedPaintToken[?], BaseToken] (val x: Self & HoveredPaintTokenPressedPaintToken[BaseToken]) extends AnyVal {
    
    inline def setHovered(value: PaintToken[BaseToken]): Self = StObject.set(x, "hovered", value.asInstanceOf[js.Any])
    
    inline def setPressed(value: PaintToken[BaseToken]): Self = StObject.set(x, "pressed", value.asInstanceOf[js.Any])
  }
}
