package typings.atlaskitTokens.anon

import typings.atlaskitTokens.distTypesPalettesLegacyPaletteMod.BaseToken
import typings.atlaskitTokens.distTypesTypesMod.PaintToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HoverResting extends StObject {
  
  var hover: PaintToken[BaseToken]
  
  var resting: PaintToken[BaseToken]
}
object HoverResting {
  
  inline def apply(hover: PaintToken[BaseToken], resting: PaintToken[BaseToken]): HoverResting = {
    val __obj = js.Dynamic.literal(hover = hover.asInstanceOf[js.Any], resting = resting.asInstanceOf[js.Any])
    __obj.asInstanceOf[HoverResting]
  }
  
  extension [Self <: HoverResting](x: Self) {
    
    inline def setHover(value: PaintToken[BaseToken]): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    inline def setResting(value: PaintToken[BaseToken]): Self = StObject.set(x, "resting", value.asInstanceOf[js.Any])
  }
}
