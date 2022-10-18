package typings.atlaskitTokens.anon

import typings.atlaskitTokens.distTypesPalettesPaletteMod.BaseToken
import typings.atlaskitTokens.distTypesTypesMod.PaintToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hovered extends StObject {
  
  var hovered: PaintToken[BaseToken]
  
  var pressed: PaintToken[BaseToken]
}
object Hovered {
  
  inline def apply(hovered: PaintToken[BaseToken], pressed: PaintToken[BaseToken]): Hovered = {
    val __obj = js.Dynamic.literal(hovered = hovered.asInstanceOf[js.Any], pressed = pressed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hovered]
  }
  
  extension [Self <: Hovered](x: Self) {
    
    inline def setHovered(value: PaintToken[BaseToken]): Self = StObject.set(x, "hovered", value.asInstanceOf[js.Any])
    
    inline def setPressed(value: PaintToken[BaseToken]): Self = StObject.set(x, "pressed", value.asInstanceOf[js.Any])
  }
}
