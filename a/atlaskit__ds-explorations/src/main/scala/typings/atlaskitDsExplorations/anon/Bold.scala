package typings.atlaskitDsExplorations.anon

import typings.emotionUtils.mod.SerializedStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bold extends StObject {
  
  val bold: SerializedStyles
  
  val brand: SerializedStyles
  
  @JSName("color.border")
  val colorDotborder: SerializedStyles
  
  val danger: SerializedStyles
  
  val disabled: SerializedStyles
  
  val discovery: SerializedStyles
  
  val focused: SerializedStyles
  
  val information: SerializedStyles
  
  val input: SerializedStyles
  
  val inverse: SerializedStyles
  
  val selected: SerializedStyles
  
  val success: SerializedStyles
  
  val warning: SerializedStyles
}
object Bold {
  
  inline def apply(
    bold: SerializedStyles,
    brand: SerializedStyles,
    colorDotborder: SerializedStyles,
    danger: SerializedStyles,
    disabled: SerializedStyles,
    discovery: SerializedStyles,
    focused: SerializedStyles,
    information: SerializedStyles,
    input: SerializedStyles,
    inverse: SerializedStyles,
    selected: SerializedStyles,
    success: SerializedStyles,
    warning: SerializedStyles
  ): Bold = {
    val __obj = js.Dynamic.literal(bold = bold.asInstanceOf[js.Any], brand = brand.asInstanceOf[js.Any], danger = danger.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], discovery = discovery.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], information = information.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], inverse = inverse.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.updateDynamic("color.border")(colorDotborder.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bold]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Bold] (val x: Self) extends AnyVal {
    
    inline def setBold(value: SerializedStyles): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    inline def setBrand(value: SerializedStyles): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    inline def setColorDotborder(value: SerializedStyles): Self = StObject.set(x, "color.border", value.asInstanceOf[js.Any])
    
    inline def setDanger(value: SerializedStyles): Self = StObject.set(x, "danger", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: SerializedStyles): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDiscovery(value: SerializedStyles): Self = StObject.set(x, "discovery", value.asInstanceOf[js.Any])
    
    inline def setFocused(value: SerializedStyles): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
    
    inline def setInformation(value: SerializedStyles): Self = StObject.set(x, "information", value.asInstanceOf[js.Any])
    
    inline def setInput(value: SerializedStyles): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInverse(value: SerializedStyles): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
    
    inline def setSelected(value: SerializedStyles): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: SerializedStyles): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setWarning(value: SerializedStyles): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
  }
}
