package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdMarkerPassthrough extends StObject {
  
  /**
    * Enables ad marker passthrough for your configuration.
    */
  var Enabled: js.UndefOr[boolean] = js.undefined
}
object AdMarkerPassthrough {
  
  inline def apply(): AdMarkerPassthrough = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdMarkerPassthrough]
  }
  
  extension [Self <: AdMarkerPassthrough](x: Self) {
    
    inline def setEnabled(value: boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
  }
}
