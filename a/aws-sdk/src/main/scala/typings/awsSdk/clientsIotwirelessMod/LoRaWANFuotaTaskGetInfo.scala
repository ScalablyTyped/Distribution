package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoRaWANFuotaTaskGetInfo extends StObject {
  
  var RfRegion: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.RfRegion] = js.undefined
  
  var StartTime: js.UndefOr[js.Date] = js.undefined
}
object LoRaWANFuotaTaskGetInfo {
  
  inline def apply(): LoRaWANFuotaTaskGetInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoRaWANFuotaTaskGetInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoRaWANFuotaTaskGetInfo] (val x: Self) extends AnyVal {
    
    inline def setRfRegion(value: RfRegion): Self = StObject.set(x, "RfRegion", value.asInstanceOf[js.Any])
    
    inline def setRfRegionUndefined: Self = StObject.set(x, "RfRegion", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
  }
}
