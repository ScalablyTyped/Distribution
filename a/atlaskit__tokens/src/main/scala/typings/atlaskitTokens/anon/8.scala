package typings.atlaskitTokens.anon

import typings.atlaskitTokens.distTypesTypesMod.PaintToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `8`[BaseToken] extends StObject {
  
  var hover: PaintToken[BaseToken]
  
  var pressed: PaintToken[BaseToken]
}
object `8` {
  
  inline def apply[BaseToken](hover: PaintToken[BaseToken], pressed: PaintToken[BaseToken]): `8`[BaseToken] = {
    val __obj = js.Dynamic.literal(hover = hover.asInstanceOf[js.Any], pressed = pressed.asInstanceOf[js.Any])
    __obj.asInstanceOf[`8`[BaseToken]]
  }
  
  extension [Self <: `8`[?], BaseToken](x: Self & `8`[BaseToken]) {
    
    inline def setHover(value: PaintToken[BaseToken]): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    inline def setPressed(value: PaintToken[BaseToken]): Self = StObject.set(x, "pressed", value.asInstanceOf[js.Any])
  }
}
