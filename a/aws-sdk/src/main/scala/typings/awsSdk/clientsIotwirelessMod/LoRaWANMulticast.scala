package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoRaWANMulticast extends StObject {
  
  var DlClass: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.DlClass] = js.undefined
  
  var RfRegion: js.UndefOr[SupportedRfRegion] = js.undefined
}
object LoRaWANMulticast {
  
  inline def apply(): LoRaWANMulticast = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoRaWANMulticast]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoRaWANMulticast] (val x: Self) extends AnyVal {
    
    inline def setDlClass(value: DlClass): Self = StObject.set(x, "DlClass", value.asInstanceOf[js.Any])
    
    inline def setDlClassUndefined: Self = StObject.set(x, "DlClass", js.undefined)
    
    inline def setRfRegion(value: SupportedRfRegion): Self = StObject.set(x, "RfRegion", value.asInstanceOf[js.Any])
    
    inline def setRfRegionUndefined: Self = StObject.set(x, "RfRegion", js.undefined)
  }
}
