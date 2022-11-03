package typings.atlaskitTokens.anon

import typings.atlaskitTokens.distTypesTypesMod.PaintToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DangerDisabled[BaseToken] extends StObject {
  
  var brand: `8`[BaseToken]
  
  var danger: DefaultDefaultHoveredPressed[BaseToken]
  
  var disabled: PaintToken[BaseToken]
  
  var discovery: DefaultDefaultHoveredPressed[BaseToken]
  
  var information: DefaultDefaultHoveredPressed[BaseToken]
  
  var input: DefaultHoveredPressed[BaseToken]
  
  var inverse: SubtleDefaultHoveredPressed[BaseToken]
  
  var neutral: BoldDefaultHoveredPressed[BaseToken]
  
  var selected: DefaultDefaultHoveredPressed[BaseToken]
  
  var success: DefaultDefaultHoveredPressed[BaseToken]
  
  var warning: DefaultDefaultHoveredPressed[BaseToken]
}
object DangerDisabled {
  
  inline def apply[BaseToken](
    brand: `8`[BaseToken],
    danger: DefaultDefaultHoveredPressed[BaseToken],
    disabled: PaintToken[BaseToken],
    discovery: DefaultDefaultHoveredPressed[BaseToken],
    information: DefaultDefaultHoveredPressed[BaseToken],
    input: DefaultHoveredPressed[BaseToken],
    inverse: SubtleDefaultHoveredPressed[BaseToken],
    neutral: BoldDefaultHoveredPressed[BaseToken],
    selected: DefaultDefaultHoveredPressed[BaseToken],
    success: DefaultDefaultHoveredPressed[BaseToken],
    warning: DefaultDefaultHoveredPressed[BaseToken]
  ): DangerDisabled[BaseToken] = {
    val __obj = js.Dynamic.literal(brand = brand.asInstanceOf[js.Any], danger = danger.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], discovery = discovery.asInstanceOf[js.Any], information = information.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], inverse = inverse.asInstanceOf[js.Any], neutral = neutral.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[DangerDisabled[BaseToken]]
  }
  
  extension [Self <: DangerDisabled[?], BaseToken](x: Self & DangerDisabled[BaseToken]) {
    
    inline def setBrand(value: `8`[BaseToken]): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    inline def setDanger(value: DefaultDefaultHoveredPressed[BaseToken]): Self = StObject.set(x, "danger", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: PaintToken[BaseToken]): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDiscovery(value: DefaultDefaultHoveredPressed[BaseToken]): Self = StObject.set(x, "discovery", value.asInstanceOf[js.Any])
    
    inline def setInformation(value: DefaultDefaultHoveredPressed[BaseToken]): Self = StObject.set(x, "information", value.asInstanceOf[js.Any])
    
    inline def setInput(value: DefaultHoveredPressed[BaseToken]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInverse(value: SubtleDefaultHoveredPressed[BaseToken]): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
    
    inline def setNeutral(value: BoldDefaultHoveredPressed[BaseToken]): Self = StObject.set(x, "neutral", value.asInstanceOf[js.Any])
    
    inline def setSelected(value: DefaultDefaultHoveredPressed[BaseToken]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: DefaultDefaultHoveredPressed[BaseToken]): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setWarning(value: DefaultDefaultHoveredPressed[BaseToken]): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
  }
}
