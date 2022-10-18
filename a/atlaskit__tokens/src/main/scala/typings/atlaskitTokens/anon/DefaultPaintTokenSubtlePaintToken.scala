package typings.atlaskitTokens.anon

import typings.atlaskitTokens.distTypesTypesMod.PaintToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultPaintTokenSubtlePaintToken[BaseToken] extends StObject {
  
  var `[default]`: PaintToken[BaseToken]
  
  var subtle: PaintToken[BaseToken]
}
object DefaultPaintTokenSubtlePaintToken {
  
  inline def apply[BaseToken](`[default]`: PaintToken[BaseToken], subtle: PaintToken[BaseToken]): DefaultPaintTokenSubtlePaintToken[BaseToken] = {
    val __obj = js.Dynamic.literal(subtle = subtle.asInstanceOf[js.Any])
    __obj.updateDynamic("[default]")(`[default]`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultPaintTokenSubtlePaintToken[BaseToken]]
  }
  
  extension [Self <: DefaultPaintTokenSubtlePaintToken[?], BaseToken](x: Self & DefaultPaintTokenSubtlePaintToken[BaseToken]) {
    
    inline def setSubtle(value: PaintToken[BaseToken]): Self = StObject.set(x, "subtle", value.asInstanceOf[js.Any])
    
    inline def `set[default]`(value: PaintToken[BaseToken]): Self = StObject.set(x, "[default]", value.asInstanceOf[js.Any])
  }
}
