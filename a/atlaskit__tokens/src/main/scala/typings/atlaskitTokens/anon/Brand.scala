package typings.atlaskitTokens.anon

import typings.atlaskitTokens.distTypesPalettesPaletteMod.BaseToken
import typings.atlaskitTokens.distTypesTypesMod.PaintToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Brand extends StObject {
  
  var brand: BoldDefault
  
  var danger: DefaultDefault
  
  var disabled: PaintToken[BaseToken]
  
  var discovery: DefaultDefault
  
  var information: DefaultDefault
  
  var input: Default
  
  var inverse: SubtleDefault
  
  var neutral: Bold
  
  var selected: DefaultDefault
  
  var success: DefaultDefault
  
  var warning: DefaultDefault
}
object Brand {
  
  inline def apply(
    brand: BoldDefault,
    danger: DefaultDefault,
    disabled: PaintToken[BaseToken],
    discovery: DefaultDefault,
    information: DefaultDefault,
    input: Default,
    inverse: SubtleDefault,
    neutral: Bold,
    selected: DefaultDefault,
    success: DefaultDefault,
    warning: DefaultDefault
  ): Brand = {
    val __obj = js.Dynamic.literal(brand = brand.asInstanceOf[js.Any], danger = danger.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], discovery = discovery.asInstanceOf[js.Any], information = information.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], inverse = inverse.asInstanceOf[js.Any], neutral = neutral.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Brand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Brand] (val x: Self) extends AnyVal {
    
    inline def setBrand(value: BoldDefault): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    inline def setDanger(value: DefaultDefault): Self = StObject.set(x, "danger", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: PaintToken[BaseToken]): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDiscovery(value: DefaultDefault): Self = StObject.set(x, "discovery", value.asInstanceOf[js.Any])
    
    inline def setInformation(value: DefaultDefault): Self = StObject.set(x, "information", value.asInstanceOf[js.Any])
    
    inline def setInput(value: Default): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInverse(value: SubtleDefault): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
    
    inline def setNeutral(value: Bold): Self = StObject.set(x, "neutral", value.asInstanceOf[js.Any])
    
    inline def setSelected(value: DefaultDefault): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: DefaultDefault): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setWarning(value: DefaultDefault): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
  }
}
