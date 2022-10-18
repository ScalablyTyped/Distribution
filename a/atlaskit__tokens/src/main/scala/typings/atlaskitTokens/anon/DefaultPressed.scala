package typings.atlaskitTokens.anon

import typings.atlaskitTokens.distTypesPalettesLegacyPaletteMod.BaseToken
import typings.atlaskitTokens.distTypesTypesMod.PaintToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultPressed extends StObject {
  
  var `[default]`: PaintToken[BaseToken]
  
  var pressed: PaintToken[BaseToken]
}
object DefaultPressed {
  
  inline def apply(`[default]`: PaintToken[BaseToken], pressed: PaintToken[BaseToken]): DefaultPressed = {
    val __obj = js.Dynamic.literal(pressed = pressed.asInstanceOf[js.Any])
    __obj.updateDynamic("[default]")(`[default]`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultPressed]
  }
  
  extension [Self <: DefaultPressed](x: Self) {
    
    inline def setPressed(value: PaintToken[BaseToken]): Self = StObject.set(x, "pressed", value.asInstanceOf[js.Any])
    
    inline def `set[default]`(value: PaintToken[BaseToken]): Self = StObject.set(x, "[default]", value.asInstanceOf[js.Any])
  }
}
