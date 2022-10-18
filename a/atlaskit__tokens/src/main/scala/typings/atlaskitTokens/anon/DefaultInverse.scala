package typings.atlaskitTokens.anon

import typings.atlaskitTokens.distTypesPalettesLegacyPaletteMod.BaseToken
import typings.atlaskitTokens.distTypesTypesMod.PaintToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultInverse extends StObject {
  
  var `[default]`: PaintToken[BaseToken]
  
  var inverse: PaintToken[BaseToken]
}
object DefaultInverse {
  
  inline def apply(`[default]`: PaintToken[BaseToken], inverse: PaintToken[BaseToken]): DefaultInverse = {
    val __obj = js.Dynamic.literal(inverse = inverse.asInstanceOf[js.Any])
    __obj.updateDynamic("[default]")(`[default]`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultInverse]
  }
  
  extension [Self <: DefaultInverse](x: Self) {
    
    inline def setInverse(value: PaintToken[BaseToken]): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
    
    inline def `set[default]`(value: PaintToken[BaseToken]): Self = StObject.set(x, "[default]", value.asInstanceOf[js.Any])
  }
}
