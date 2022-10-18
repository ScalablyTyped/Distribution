package typings.atlaskitTokens.anon

import typings.atlaskitTokens.distTypesPalettesPaletteMod.BaseToken
import typings.atlaskitTokens.distTypesTypesMod.PaintToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Overlay extends StObject {
  
  var `[default]`: Default
  
  var overlay: Default
  
  var raised: Default
  
  var sunken: PaintToken[BaseToken]
}
object Overlay {
  
  inline def apply(`[default]`: Default, overlay: Default, raised: Default, sunken: PaintToken[BaseToken]): Overlay = {
    val __obj = js.Dynamic.literal(overlay = overlay.asInstanceOf[js.Any], raised = raised.asInstanceOf[js.Any], sunken = sunken.asInstanceOf[js.Any])
    __obj.updateDynamic("[default]")(`[default]`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Overlay]
  }
  
  extension [Self <: Overlay](x: Self) {
    
    inline def setOverlay(value: Default): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
    
    inline def setRaised(value: Default): Self = StObject.set(x, "raised", value.asInstanceOf[js.Any])
    
    inline def setSunken(value: PaintToken[BaseToken]): Self = StObject.set(x, "sunken", value.asInstanceOf[js.Any])
    
    inline def `set[default]`(value: Default): Self = StObject.set(x, "[default]", value.asInstanceOf[js.Any])
  }
}
