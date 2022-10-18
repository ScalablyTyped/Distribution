package typings.atlaskitTokens.anon

import typings.atlaskitTokens.distTypesTypesMod.PaintToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `11`[BaseToken] extends StObject {
  
  var hovered: PaintToken[BaseToken]
  
  var pressed: PaintToken[BaseToken]
}
object `11` {
  
  inline def apply[BaseToken](hovered: PaintToken[BaseToken], pressed: PaintToken[BaseToken]): `11`[BaseToken] = {
    val __obj = js.Dynamic.literal(hovered = hovered.asInstanceOf[js.Any], pressed = pressed.asInstanceOf[js.Any])
    __obj.asInstanceOf[`11`[BaseToken]]
  }
  
  extension [Self <: `11`[?], BaseToken](x: Self & `11`[BaseToken]) {
    
    inline def setHovered(value: PaintToken[BaseToken]): Self = StObject.set(x, "hovered", value.asInstanceOf[js.Any])
    
    inline def setPressed(value: PaintToken[BaseToken]): Self = StObject.set(x, "pressed", value.asInstanceOf[js.Any])
  }
}
