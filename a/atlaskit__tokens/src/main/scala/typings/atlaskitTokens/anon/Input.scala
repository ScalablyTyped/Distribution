package typings.atlaskitTokens.anon

import typings.atlaskitTokens.palettesLegacyPaletteMod.BaseToken
import typings.atlaskitTokens.typesTypesMod.PaintToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Input extends StObject {
  
  var brand: BoldDefaultHovered
  
  var danger: DefaultDefaultHovered
  
  var disabled: PaintToken[BaseToken]
  
  var discovery: DefaultDefaultHovered
  
  var information: DefaultDefaultHovered
  
  var input: DefaultHovered
  
  var inverse: SubtleDefaultHovered
  
  var neutral: BoldDefaultSubtle
  
  var selected: DefaultDefaultHovered
  
  var success: DefaultDefaultHovered
  
  var warning: DefaultDefaultHovered
}
object Input {
  
  inline def apply(
    brand: BoldDefaultHovered,
    danger: DefaultDefaultHovered,
    disabled: PaintToken[BaseToken],
    discovery: DefaultDefaultHovered,
    information: DefaultDefaultHovered,
    input: DefaultHovered,
    inverse: SubtleDefaultHovered,
    neutral: BoldDefaultSubtle,
    selected: DefaultDefaultHovered,
    success: DefaultDefaultHovered,
    warning: DefaultDefaultHovered
  ): Input = {
    val __obj = js.Dynamic.literal(brand = brand.asInstanceOf[js.Any], danger = danger.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], discovery = discovery.asInstanceOf[js.Any], information = information.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], inverse = inverse.asInstanceOf[js.Any], neutral = neutral.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Input]
  }
  
  extension [Self <: Input](x: Self) {
    
    inline def setBrand(value: BoldDefaultHovered): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    inline def setDanger(value: DefaultDefaultHovered): Self = StObject.set(x, "danger", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: PaintToken[BaseToken]): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDiscovery(value: DefaultDefaultHovered): Self = StObject.set(x, "discovery", value.asInstanceOf[js.Any])
    
    inline def setInformation(value: DefaultDefaultHovered): Self = StObject.set(x, "information", value.asInstanceOf[js.Any])
    
    inline def setInput(value: DefaultHovered): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInverse(value: SubtleDefaultHovered): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
    
    inline def setNeutral(value: BoldDefaultSubtle): Self = StObject.set(x, "neutral", value.asInstanceOf[js.Any])
    
    inline def setSelected(value: DefaultDefaultHovered): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: DefaultDefaultHovered): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setWarning(value: DefaultDefaultHovered): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
  }
}
