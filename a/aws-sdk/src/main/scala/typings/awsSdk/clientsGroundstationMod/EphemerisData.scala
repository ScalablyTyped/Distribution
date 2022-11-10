package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EphemerisData extends StObject {
  
  var oem: js.UndefOr[OEMEphemeris] = js.undefined
  
  var tle: js.UndefOr[TLEEphemeris] = js.undefined
}
object EphemerisData {
  
  inline def apply(): EphemerisData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EphemerisData]
  }
  
  extension [Self <: EphemerisData](x: Self) {
    
    inline def setOem(value: OEMEphemeris): Self = StObject.set(x, "oem", value.asInstanceOf[js.Any])
    
    inline def setOemUndefined: Self = StObject.set(x, "oem", js.undefined)
    
    inline def setTle(value: TLEEphemeris): Self = StObject.set(x, "tle", value.asInstanceOf[js.Any])
    
    inline def setTleUndefined: Self = StObject.set(x, "tle", js.undefined)
  }
}
