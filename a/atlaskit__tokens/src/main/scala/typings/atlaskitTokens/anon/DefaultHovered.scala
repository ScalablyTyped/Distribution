package typings.atlaskitTokens.anon

import typings.atlaskitTokens.distTypesPalettesPaletteMod.BaseToken
import typings.atlaskitTokens.distTypesTypesMod.PaintToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultHovered extends StObject {
  
  var `[default]`: PaintToken[BaseToken]
  
  var hovered: PaintToken[BaseToken]
}
object DefaultHovered {
  
  inline def apply(`[default]`: PaintToken[BaseToken], hovered: PaintToken[BaseToken]): DefaultHovered = {
    val __obj = js.Dynamic.literal(hovered = hovered.asInstanceOf[js.Any])
    __obj.updateDynamic("[default]")(`[default]`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultHovered]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultHovered] (val x: Self) extends AnyVal {
    
    inline def setHovered(value: PaintToken[BaseToken]): Self = StObject.set(x, "hovered", value.asInstanceOf[js.Any])
    
    inline def `set[default]`(value: PaintToken[BaseToken]): Self = StObject.set(x, "[default]", value.asInstanceOf[js.Any])
  }
}
