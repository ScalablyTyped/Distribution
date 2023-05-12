package typings.atlaskitTokens.anon

import typings.atlaskitTokens.distTypesTypesMod.PaintToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Warning[BaseToken] extends StObject {
  
  var brand: `18`[BaseToken]
  
  var danger: DefaultDefaultPaintTokenHoveredPaintToken[BaseToken]
  
  var disabled: PaintToken[BaseToken]
  
  var discovery: DefaultDefaultPaintTokenHoveredPaintToken[BaseToken]
  
  var information: DefaultDefaultPaintTokenHoveredPaintToken[BaseToken]
  
  var input: DefaultPaintTokenHoveredPaintToken[BaseToken]
  
  var inverse: SubtleDefaultPaintTokenHoveredPaintToken[BaseToken]
  
  var neutral: BoldDefaultPaintTokenHoveredPaintToken[BaseToken]
  
  var selected: DefaultDefaultPaintTokenHoveredPaintToken[BaseToken]
  
  var success: DefaultDefaultPaintTokenHoveredPaintToken[BaseToken]
  
  var warning: DefaultDefaultPaintTokenHoveredPaintToken[BaseToken]
}
object Warning {
  
  inline def apply[BaseToken](
    brand: `18`[BaseToken],
    danger: DefaultDefaultPaintTokenHoveredPaintToken[BaseToken],
    disabled: PaintToken[BaseToken],
    discovery: DefaultDefaultPaintTokenHoveredPaintToken[BaseToken],
    information: DefaultDefaultPaintTokenHoveredPaintToken[BaseToken],
    input: DefaultPaintTokenHoveredPaintToken[BaseToken],
    inverse: SubtleDefaultPaintTokenHoveredPaintToken[BaseToken],
    neutral: BoldDefaultPaintTokenHoveredPaintToken[BaseToken],
    selected: DefaultDefaultPaintTokenHoveredPaintToken[BaseToken],
    success: DefaultDefaultPaintTokenHoveredPaintToken[BaseToken],
    warning: DefaultDefaultPaintTokenHoveredPaintToken[BaseToken]
  ): Warning[BaseToken] = {
    val __obj = js.Dynamic.literal(brand = brand.asInstanceOf[js.Any], danger = danger.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], discovery = discovery.asInstanceOf[js.Any], information = information.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], inverse = inverse.asInstanceOf[js.Any], neutral = neutral.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Warning[BaseToken]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Warning[?], BaseToken] (val x: Self & Warning[BaseToken]) extends AnyVal {
    
    inline def setBrand(value: `18`[BaseToken]): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    inline def setDanger(value: DefaultDefaultPaintTokenHoveredPaintToken[BaseToken]): Self = StObject.set(x, "danger", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: PaintToken[BaseToken]): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDiscovery(value: DefaultDefaultPaintTokenHoveredPaintToken[BaseToken]): Self = StObject.set(x, "discovery", value.asInstanceOf[js.Any])
    
    inline def setInformation(value: DefaultDefaultPaintTokenHoveredPaintToken[BaseToken]): Self = StObject.set(x, "information", value.asInstanceOf[js.Any])
    
    inline def setInput(value: DefaultPaintTokenHoveredPaintToken[BaseToken]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInverse(value: SubtleDefaultPaintTokenHoveredPaintToken[BaseToken]): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
    
    inline def setNeutral(value: BoldDefaultPaintTokenHoveredPaintToken[BaseToken]): Self = StObject.set(x, "neutral", value.asInstanceOf[js.Any])
    
    inline def setSelected(value: DefaultDefaultPaintTokenHoveredPaintToken[BaseToken]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: DefaultDefaultPaintTokenHoveredPaintToken[BaseToken]): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setWarning(value: DefaultDefaultPaintTokenHoveredPaintToken[BaseToken]): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
  }
}
