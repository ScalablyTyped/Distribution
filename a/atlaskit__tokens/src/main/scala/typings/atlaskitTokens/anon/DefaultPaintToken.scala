package typings.atlaskitTokens.anon

import typings.atlaskitTokens.distTypesPalettesPaletteMod.BaseToken
import typings.atlaskitTokens.distTypesTypesMod.PaintToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultPaintToken extends StObject {
  
  var `[default]`: PaintToken[BaseToken]
}
object DefaultPaintToken {
  
  inline def apply(`[default]`: PaintToken[BaseToken]): DefaultPaintToken = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("[default]")(`[default]`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultPaintToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultPaintToken] (val x: Self) extends AnyVal {
    
    inline def `set[default]`(value: PaintToken[BaseToken]): Self = StObject.set(x, "[default]", value.asInstanceOf[js.Any])
  }
}
