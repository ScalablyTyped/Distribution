package typings.atlaskitTokens.anon

import typings.atlaskitTokens.distTypesPalettesLegacyPaletteMod.BaseToken
import typings.atlaskitTokens.distTypesTypesMod.PaintToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Input extends StObject {
  
  var brand: BoldHoveredPressed
  
  var danger: DefaultHoveredPressed
  
  var disabled: PaintToken[BaseToken]
  
  var discovery: DefaultHoveredPressed
  
  var information: DefaultHoveredPressed
  
  var input: HoveredPressed
  
  var inverse: SubtleHoveredPressed
  
  var neutral: BoldDefaultSubtle
  
  var selected: DefaultHoveredPressed
  
  var success: DefaultHoveredPressed
  
  var warning: DefaultHoveredPressed
}
object Input {
  
  inline def apply(
    brand: BoldHoveredPressed,
    danger: DefaultHoveredPressed,
    disabled: PaintToken[BaseToken],
    discovery: DefaultHoveredPressed,
    information: DefaultHoveredPressed,
    input: HoveredPressed,
    inverse: SubtleHoveredPressed,
    neutral: BoldDefaultSubtle,
    selected: DefaultHoveredPressed,
    success: DefaultHoveredPressed,
    warning: DefaultHoveredPressed
  ): Input = {
    val __obj = js.Dynamic.literal(brand = brand.asInstanceOf[js.Any], danger = danger.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], discovery = discovery.asInstanceOf[js.Any], information = information.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], inverse = inverse.asInstanceOf[js.Any], neutral = neutral.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Input]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Input] (val x: Self) extends AnyVal {
    
    inline def setBrand(value: BoldHoveredPressed): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    inline def setDanger(value: DefaultHoveredPressed): Self = StObject.set(x, "danger", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: PaintToken[BaseToken]): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDiscovery(value: DefaultHoveredPressed): Self = StObject.set(x, "discovery", value.asInstanceOf[js.Any])
    
    inline def setInformation(value: DefaultHoveredPressed): Self = StObject.set(x, "information", value.asInstanceOf[js.Any])
    
    inline def setInput(value: HoveredPressed): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInverse(value: SubtleHoveredPressed): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
    
    inline def setNeutral(value: BoldDefaultSubtle): Self = StObject.set(x, "neutral", value.asInstanceOf[js.Any])
    
    inline def setSelected(value: DefaultHoveredPressed): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: DefaultHoveredPressed): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setWarning(value: DefaultHoveredPressed): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
  }
}
