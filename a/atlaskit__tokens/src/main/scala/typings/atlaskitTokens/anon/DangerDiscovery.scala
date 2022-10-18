package typings.atlaskitTokens.anon

import typings.atlaskitTokens.distTypesTypesMod.PaintToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DangerDiscovery[BaseToken] extends StObject {
  
  var brand: PaintToken[BaseToken]
  
  var danger: PaintToken[BaseToken]
  
  var discovery: PaintToken[BaseToken]
  
  var success: PaintToken[BaseToken]
  
  var warning: PaintToken[BaseToken]
}
object DangerDiscovery {
  
  inline def apply[BaseToken](
    brand: PaintToken[BaseToken],
    danger: PaintToken[BaseToken],
    discovery: PaintToken[BaseToken],
    success: PaintToken[BaseToken],
    warning: PaintToken[BaseToken]
  ): DangerDiscovery[BaseToken] = {
    val __obj = js.Dynamic.literal(brand = brand.asInstanceOf[js.Any], danger = danger.asInstanceOf[js.Any], discovery = discovery.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[DangerDiscovery[BaseToken]]
  }
  
  extension [Self <: DangerDiscovery[?], BaseToken](x: Self & DangerDiscovery[BaseToken]) {
    
    inline def setBrand(value: PaintToken[BaseToken]): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    inline def setDanger(value: PaintToken[BaseToken]): Self = StObject.set(x, "danger", value.asInstanceOf[js.Any])
    
    inline def setDiscovery(value: PaintToken[BaseToken]): Self = StObject.set(x, "discovery", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: PaintToken[BaseToken]): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setWarning(value: PaintToken[BaseToken]): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
  }
}
