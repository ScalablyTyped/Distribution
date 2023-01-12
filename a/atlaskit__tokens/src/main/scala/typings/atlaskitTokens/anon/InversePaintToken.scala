package typings.atlaskitTokens.anon

import typings.atlaskitTokens.distTypesTypesMod.PaintToken
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InversePaintToken[?], BaseToken] (val x: Self & InversePaintToken[BaseToken]) extends AnyVal {
    
    inline def setInverse(value: PaintToken[BaseToken]): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
    
    inline def `set[default]`(value: PaintToken[BaseToken]): Self = StObject.set(x, "[default]", value.asInstanceOf[js.Any])
  }
}
