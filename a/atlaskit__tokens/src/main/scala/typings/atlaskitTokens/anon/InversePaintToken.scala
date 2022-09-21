package typings.atlaskitTokens.anon

import typings.atlaskitTokens.typesTypesMod.PaintToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InversePaintToken[BaseToken] extends StObject {
  
  var `[default]`: PaintToken[BaseToken]
  
  var inverse: PaintToken[BaseToken]
}
object InversePaintToken {
  
  inline def apply[BaseToken](`[default]`: PaintToken[BaseToken], inverse: PaintToken[BaseToken]): InversePaintToken[BaseToken] = {
    val __obj = js.Dynamic.literal(inverse = inverse.asInstanceOf[js.Any])
    __obj.updateDynamic("[default]")(`[default]`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InversePaintToken[BaseToken]]
  }
  
  extension [Self <: InversePaintToken[?], BaseToken](x: Self & InversePaintToken[BaseToken]) {
    
    inline def setInverse(value: PaintToken[BaseToken]): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
    
    inline def `set[default]`(value: PaintToken[BaseToken]): Self = StObject.set(x, "[default]", value.asInstanceOf[js.Any])
  }
}
