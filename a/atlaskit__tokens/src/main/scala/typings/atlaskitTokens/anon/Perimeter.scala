package typings.atlaskitTokens.anon

import typings.atlaskitTokens.distTypesPalettesPaletteMod.BaseToken
import typings.atlaskitTokens.distTypesTypesMod.PaintToken
import typings.atlaskitTokens.distTypesTypesMod.ShadowToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Perimeter extends StObject {
  
  var `[default]`: ShadowToken[BaseToken]
  
  var perimeter: PaintToken[BaseToken]
  
  var spread: PaintToken[BaseToken]
}
object Perimeter {
  
  inline def apply(
    `[default]`: ShadowToken[BaseToken],
    perimeter: PaintToken[BaseToken],
    spread: PaintToken[BaseToken]
  ): Perimeter = {
    val __obj = js.Dynamic.literal(perimeter = perimeter.asInstanceOf[js.Any], spread = spread.asInstanceOf[js.Any])
    __obj.updateDynamic("[default]")(`[default]`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Perimeter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Perimeter] (val x: Self) extends AnyVal {
    
    inline def setPerimeter(value: PaintToken[BaseToken]): Self = StObject.set(x, "perimeter", value.asInstanceOf[js.Any])
    
    inline def setSpread(value: PaintToken[BaseToken]): Self = StObject.set(x, "spread", value.asInstanceOf[js.Any])
    
    inline def `set[default]`(value: ShadowToken[BaseToken]): Self = StObject.set(x, "[default]", value.asInstanceOf[js.Any])
  }
}
