package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EphemerisTypeDescription extends StObject {
  
  var oem: js.UndefOr[EphemerisDescription] = js.undefined
  
  var tle: js.UndefOr[EphemerisDescription] = js.undefined
}
object EphemerisTypeDescription {
  
  inline def apply(): EphemerisTypeDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EphemerisTypeDescription]
  }
  
  extension [Self <: EphemerisTypeDescription](x: Self) {
    
    inline def setOem(value: EphemerisDescription): Self = StObject.set(x, "oem", value.asInstanceOf[js.Any])
    
    inline def setOemUndefined: Self = StObject.set(x, "oem", js.undefined)
    
    inline def setTle(value: EphemerisDescription): Self = StObject.set(x, "tle", value.asInstanceOf[js.Any])
    
    inline def setTleUndefined: Self = StObject.set(x, "tle", js.undefined)
  }
}
