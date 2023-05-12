package typings.atlaskitTokens.anon

import typings.atlaskitTokens.distTypesPalettesLegacyPaletteMod.BaseToken
import typings.atlaskitTokens.distTypesTypesMod.PaintToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sunken extends StObject {
  
  var `[default]`: HoveredPressed
  
  var overlay: HoveredPressed
  
  var raised: HoveredPressed
  
  var sunken: PaintToken[BaseToken]
}
object Sunken {
  
  inline def apply(
    `[default]`: HoveredPressed,
    overlay: HoveredPressed,
    raised: HoveredPressed,
    sunken: PaintToken[BaseToken]
  ): Sunken = {
    val __obj = js.Dynamic.literal(overlay = overlay.asInstanceOf[js.Any], raised = raised.asInstanceOf[js.Any], sunken = sunken.asInstanceOf[js.Any])
    __obj.updateDynamic("[default]")(`[default]`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sunken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Sunken] (val x: Self) extends AnyVal {
    
    inline def setOverlay(value: HoveredPressed): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
    
    inline def setRaised(value: HoveredPressed): Self = StObject.set(x, "raised", value.asInstanceOf[js.Any])
    
    inline def setSunken(value: PaintToken[BaseToken]): Self = StObject.set(x, "sunken", value.asInstanceOf[js.Any])
    
    inline def `set[default]`(value: HoveredPressed): Self = StObject.set(x, "[default]", value.asInstanceOf[js.Any])
  }
}
