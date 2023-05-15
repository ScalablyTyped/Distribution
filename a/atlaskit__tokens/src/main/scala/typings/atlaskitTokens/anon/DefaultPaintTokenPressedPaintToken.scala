package typings.atlaskitTokens.anon

import typings.atlaskitTokens.distTypesPalettesLegacyPaletteMod.BaseToken
import typings.atlaskitTokens.distTypesTypesMod.PaintToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultPaintTokenPressedPaintToken extends StObject {
  
  var `[default]`: PaintToken[BaseToken]
  
  var pressed: PaintToken[BaseToken]
}
object DefaultPaintTokenPressedPaintToken {
  
  inline def apply(`[default]`: PaintToken[BaseToken], pressed: PaintToken[BaseToken]): DefaultPaintTokenPressedPaintToken = {
    val __obj = js.Dynamic.literal(pressed = pressed.asInstanceOf[js.Any])
    __obj.updateDynamic("[default]")(`[default]`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultPaintTokenPressedPaintToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultPaintTokenPressedPaintToken] (val x: Self) extends AnyVal {
    
    inline def setPressed(value: PaintToken[BaseToken]): Self = StObject.set(x, "pressed", value.asInstanceOf[js.Any])
    
    inline def `set[default]`(value: PaintToken[BaseToken]): Self = StObject.set(x, "[default]", value.asInstanceOf[js.Any])
  }
}
