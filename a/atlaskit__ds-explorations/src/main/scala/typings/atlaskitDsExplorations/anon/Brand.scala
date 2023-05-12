package typings.atlaskitDsExplorations.anon

import typings.emotionUtils.mod.SerializedStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Brand extends StObject {
  
  val brand: SerializedStyles
  
  @JSName("color.text")
  val colorDottext: SerializedStyles
  
  val danger: SerializedStyles
  
  val disabled: SerializedStyles
  
  val discovery: SerializedStyles
  
  val information: SerializedStyles
  
  val inverse: SerializedStyles
  
  val selected: SerializedStyles
  
  val subtle: SerializedStyles
  
  val subtlest: SerializedStyles
  
  val success: SerializedStyles
  
  val warning: SerializedStyles
  
  @JSName("warning.inverse")
  val warningDotinverse: SerializedStyles
}
object Brand {
  
  inline def apply(
    brand: SerializedStyles,
    colorDottext: SerializedStyles,
    danger: SerializedStyles,
    disabled: SerializedStyles,
    discovery: SerializedStyles,
    information: SerializedStyles,
    inverse: SerializedStyles,
    selected: SerializedStyles,
    subtle: SerializedStyles,
    subtlest: SerializedStyles,
    success: SerializedStyles,
    warning: SerializedStyles,
    warningDotinverse: SerializedStyles
  ): Brand = {
    val __obj = js.Dynamic.literal(brand = brand.asInstanceOf[js.Any], danger = danger.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], discovery = discovery.asInstanceOf[js.Any], information = information.asInstanceOf[js.Any], inverse = inverse.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], subtle = subtle.asInstanceOf[js.Any], subtlest = subtlest.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.updateDynamic("color.text")(colorDottext.asInstanceOf[js.Any])
    __obj.updateDynamic("warning.inverse")(warningDotinverse.asInstanceOf[js.Any])
    __obj.asInstanceOf[Brand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Brand] (val x: Self) extends AnyVal {
    
    inline def setBrand(value: SerializedStyles): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    inline def setColorDottext(value: SerializedStyles): Self = StObject.set(x, "color.text", value.asInstanceOf[js.Any])
    
    inline def setDanger(value: SerializedStyles): Self = StObject.set(x, "danger", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: SerializedStyles): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDiscovery(value: SerializedStyles): Self = StObject.set(x, "discovery", value.asInstanceOf[js.Any])
    
    inline def setInformation(value: SerializedStyles): Self = StObject.set(x, "information", value.asInstanceOf[js.Any])
    
    inline def setInverse(value: SerializedStyles): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
    
    inline def setSelected(value: SerializedStyles): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSubtle(value: SerializedStyles): Self = StObject.set(x, "subtle", value.asInstanceOf[js.Any])
    
    inline def setSubtlest(value: SerializedStyles): Self = StObject.set(x, "subtlest", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: SerializedStyles): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setWarning(value: SerializedStyles): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningDotinverse(value: SerializedStyles): Self = StObject.set(x, "warning.inverse", value.asInstanceOf[js.Any])
  }
}
