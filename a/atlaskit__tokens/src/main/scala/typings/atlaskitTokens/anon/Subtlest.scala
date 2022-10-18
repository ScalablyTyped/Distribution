package typings.atlaskitTokens.anon

import typings.atlaskitTokens.distTypesPalettesLegacyPaletteMod.BaseToken
import typings.atlaskitTokens.distTypesTypesMod.PaintToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Subtlest extends StObject {
  
  var `[default]`: PaintToken[BaseToken]
  
  var brand: PaintToken[BaseToken]
  
  var danger: PaintToken[BaseToken]
  
  var disabled: PaintToken[BaseToken]
  
  var discovery: PaintToken[BaseToken]
  
  var information: PaintToken[BaseToken]
  
  var inverse: PaintToken[BaseToken]
  
  var selected: PaintToken[BaseToken]
  
  var subtle: PaintToken[BaseToken]
  
  var subtlest: PaintToken[BaseToken]
  
  var success: PaintToken[BaseToken]
  
  var warning: DefaultInverse
}
object Subtlest {
  
  inline def apply(
    `[default]`: PaintToken[BaseToken],
    brand: PaintToken[BaseToken],
    danger: PaintToken[BaseToken],
    disabled: PaintToken[BaseToken],
    discovery: PaintToken[BaseToken],
    information: PaintToken[BaseToken],
    inverse: PaintToken[BaseToken],
    selected: PaintToken[BaseToken],
    subtle: PaintToken[BaseToken],
    subtlest: PaintToken[BaseToken],
    success: PaintToken[BaseToken],
    warning: DefaultInverse
  ): Subtlest = {
    val __obj = js.Dynamic.literal(brand = brand.asInstanceOf[js.Any], danger = danger.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], discovery = discovery.asInstanceOf[js.Any], information = information.asInstanceOf[js.Any], inverse = inverse.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], subtle = subtle.asInstanceOf[js.Any], subtlest = subtlest.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.updateDynamic("[default]")(`[default]`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subtlest]
  }
  
  extension [Self <: Subtlest](x: Self) {
    
    inline def setBrand(value: PaintToken[BaseToken]): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    inline def setDanger(value: PaintToken[BaseToken]): Self = StObject.set(x, "danger", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: PaintToken[BaseToken]): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDiscovery(value: PaintToken[BaseToken]): Self = StObject.set(x, "discovery", value.asInstanceOf[js.Any])
    
    inline def setInformation(value: PaintToken[BaseToken]): Self = StObject.set(x, "information", value.asInstanceOf[js.Any])
    
    inline def setInverse(value: PaintToken[BaseToken]): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
    
    inline def setSelected(value: PaintToken[BaseToken]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSubtle(value: PaintToken[BaseToken]): Self = StObject.set(x, "subtle", value.asInstanceOf[js.Any])
    
    inline def setSubtlest(value: PaintToken[BaseToken]): Self = StObject.set(x, "subtlest", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: PaintToken[BaseToken]): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setWarning(value: DefaultInverse): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def `set[default]`(value: PaintToken[BaseToken]): Self = StObject.set(x, "[default]", value.asInstanceOf[js.Any])
  }
}
