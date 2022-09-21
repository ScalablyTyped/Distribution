package typings.atlaskitTokens.anon

import typings.atlaskitTokens.palettesPaletteMod.BaseToken
import typings.atlaskitTokens.typesTypesMod.PaintToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Disabled extends StObject {
  
  var `[default]`: PaintToken[BaseToken]
  
  var bold: PaintToken[BaseToken]
  
  var brand: PaintToken[BaseToken]
  
  var danger: PaintToken[BaseToken]
  
  var disabled: PaintToken[BaseToken]
  
  var discovery: PaintToken[BaseToken]
  
  var focused: PaintToken[BaseToken]
  
  var information: PaintToken[BaseToken]
  
  var input: PaintToken[BaseToken]
  
  var inverse: PaintToken[BaseToken]
  
  var selected: PaintToken[BaseToken]
  
  var success: PaintToken[BaseToken]
  
  var warning: PaintToken[BaseToken]
}
object Disabled {
  
  inline def apply(
    `[default]`: PaintToken[BaseToken],
    bold: PaintToken[BaseToken],
    brand: PaintToken[BaseToken],
    danger: PaintToken[BaseToken],
    disabled: PaintToken[BaseToken],
    discovery: PaintToken[BaseToken],
    focused: PaintToken[BaseToken],
    information: PaintToken[BaseToken],
    input: PaintToken[BaseToken],
    inverse: PaintToken[BaseToken],
    selected: PaintToken[BaseToken],
    success: PaintToken[BaseToken],
    warning: PaintToken[BaseToken]
  ): Disabled = {
    val __obj = js.Dynamic.literal(bold = bold.asInstanceOf[js.Any], brand = brand.asInstanceOf[js.Any], danger = danger.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], discovery = discovery.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], information = information.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], inverse = inverse.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.updateDynamic("[default]")(`[default]`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Disabled]
  }
  
  extension [Self <: Disabled](x: Self) {
    
    inline def setBold(value: PaintToken[BaseToken]): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    inline def setBrand(value: PaintToken[BaseToken]): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    inline def setDanger(value: PaintToken[BaseToken]): Self = StObject.set(x, "danger", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: PaintToken[BaseToken]): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDiscovery(value: PaintToken[BaseToken]): Self = StObject.set(x, "discovery", value.asInstanceOf[js.Any])
    
    inline def setFocused(value: PaintToken[BaseToken]): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
    
    inline def setInformation(value: PaintToken[BaseToken]): Self = StObject.set(x, "information", value.asInstanceOf[js.Any])
    
    inline def setInput(value: PaintToken[BaseToken]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInverse(value: PaintToken[BaseToken]): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
    
    inline def setSelected(value: PaintToken[BaseToken]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: PaintToken[BaseToken]): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setWarning(value: PaintToken[BaseToken]): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def `set[default]`(value: PaintToken[BaseToken]): Self = StObject.set(x, "[default]", value.asInstanceOf[js.Any])
  }
}
