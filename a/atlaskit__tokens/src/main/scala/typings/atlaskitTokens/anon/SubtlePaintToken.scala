package typings.atlaskitTokens.anon

import typings.atlaskitTokens.distTypesPalettesLegacyPaletteMod.BaseToken
import typings.atlaskitTokens.distTypesTypesMod.PaintToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubtlePaintToken extends StObject {
  
  var `[default]`: PaintToken[BaseToken]
  
  var subtle: PaintToken[BaseToken]
}
object SubtlePaintToken {
  
  inline def apply(`[default]`: PaintToken[BaseToken], subtle: PaintToken[BaseToken]): SubtlePaintToken = {
    val __obj = js.Dynamic.literal(subtle = subtle.asInstanceOf[js.Any])
    __obj.updateDynamic("[default]")(`[default]`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubtlePaintToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubtlePaintToken] (val x: Self) extends AnyVal {
    
    inline def setSubtle(value: PaintToken[BaseToken]): Self = StObject.set(x, "subtle", value.asInstanceOf[js.Any])
    
    inline def `set[default]`(value: PaintToken[BaseToken]): Self = StObject.set(x, "[default]", value.asInstanceOf[js.Any])
  }
}
