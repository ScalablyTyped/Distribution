package typings.atlaskitTokens.anon

import typings.atlaskitTokens.distTypesPalettesPaletteMod.BaseToken
import typings.atlaskitTokens.distTypesTypesMod.PaintToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hover extends StObject {
  
  var hover: PaintToken[BaseToken]
  
  var resting: PaintToken[BaseToken]
}
object Hover {
  
  inline def apply(hover: PaintToken[BaseToken], resting: PaintToken[BaseToken]): Hover = {
    val __obj = js.Dynamic.literal(hover = hover.asInstanceOf[js.Any], resting = resting.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hover]
  }
  
  extension [Self <: Hover](x: Self) {
    
    inline def setHover(value: PaintToken[BaseToken]): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    inline def setResting(value: PaintToken[BaseToken]): Self = StObject.set(x, "resting", value.asInstanceOf[js.Any])
  }
}
