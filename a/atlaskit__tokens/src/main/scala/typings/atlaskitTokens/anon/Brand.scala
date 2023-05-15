package typings.atlaskitTokens.anon

import typings.atlaskitTokens.distTypesPalettesPaletteMod.BaseToken
import typings.atlaskitTokens.distTypesTypesMod.PaintToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Brand extends StObject {
  
  var brand: BoldHovered
  
  var danger: DefaultHovered
  
  var disabled: PaintToken[BaseToken]
  
  var discovery: DefaultHovered
  
  var information: DefaultHovered
  
  var input: Hovered
  
  var inverse: SubtleHovered
  
  var neutral: BoldDefault
  
  var selected: DefaultHovered
  
  var success: DefaultHovered
  
  var warning: DefaultHovered
}
object Brand {
  
  inline def apply(
    brand: BoldHovered,
    danger: DefaultHovered,
    disabled: PaintToken[BaseToken],
    discovery: DefaultHovered,
    information: DefaultHovered,
    input: Hovered,
    inverse: SubtleHovered,
    neutral: BoldDefault,
    selected: DefaultHovered,
    success: DefaultHovered,
    warning: DefaultHovered
  ): Brand = {
    val __obj = js.Dynamic.literal(brand = brand.asInstanceOf[js.Any], danger = danger.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], discovery = discovery.asInstanceOf[js.Any], information = information.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], inverse = inverse.asInstanceOf[js.Any], neutral = neutral.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Brand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Brand] (val x: Self) extends AnyVal {
    
    inline def setBrand(value: BoldHovered): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    inline def setDanger(value: DefaultHovered): Self = StObject.set(x, "danger", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: PaintToken[BaseToken]): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDiscovery(value: DefaultHovered): Self = StObject.set(x, "discovery", value.asInstanceOf[js.Any])
    
    inline def setInformation(value: DefaultHovered): Self = StObject.set(x, "information", value.asInstanceOf[js.Any])
    
    inline def setInput(value: Hovered): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInverse(value: SubtleHovered): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
    
    inline def setNeutral(value: BoldDefault): Self = StObject.set(x, "neutral", value.asInstanceOf[js.Any])
    
    inline def setSelected(value: DefaultHovered): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: DefaultHovered): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setWarning(value: DefaultHovered): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
  }
}
