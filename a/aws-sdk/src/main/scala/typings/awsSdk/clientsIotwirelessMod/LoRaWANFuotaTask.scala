package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoRaWANFuotaTask extends StObject {
  
  var RfRegion: js.UndefOr[SupportedRfRegion] = js.undefined
}
object LoRaWANFuotaTask {
  
  inline def apply(): LoRaWANFuotaTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoRaWANFuotaTask]
  }
  
  extension [Self <: LoRaWANFuotaTask](x: Self) {
    
    inline def setRfRegion(value: SupportedRfRegion): Self = StObject.set(x, "RfRegion", value.asInstanceOf[js.Any])
    
    inline def setRfRegionUndefined: Self = StObject.set(x, "RfRegion", js.undefined)
  }
}
