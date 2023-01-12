package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWirelessDeviceStatisticsResponse extends StObject {
  
  /**
    * The date and time when the most recent uplink was received.
    */
  var LastUplinkReceivedAt: js.UndefOr[ISODateTimeString] = js.undefined
  
  /**
    * Information about the wireless device's operations.
    */
  var LoRaWAN: js.UndefOr[LoRaWANDeviceMetadata] = js.undefined
  
  /**
    * MetaData for Sidewalk device.
    */
  var Sidewalk: js.UndefOr[SidewalkDeviceMetadata] = js.undefined
  
  /**
    * The ID of the wireless device.
    */
  var WirelessDeviceId: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.WirelessDeviceId] = js.undefined
}
object GetWirelessDeviceStatisticsResponse {
  
  inline def apply(): GetWirelessDeviceStatisticsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetWirelessDeviceStatisticsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetWirelessDeviceStatisticsResponse] (val x: Self) extends AnyVal {
    
    inline def setLastUplinkReceivedAt(value: ISODateTimeString): Self = StObject.set(x, "LastUplinkReceivedAt", value.asInstanceOf[js.Any])
    
    inline def setLastUplinkReceivedAtUndefined: Self = StObject.set(x, "LastUplinkReceivedAt", js.undefined)
    
    inline def setLoRaWAN(value: LoRaWANDeviceMetadata): Self = StObject.set(x, "LoRaWAN", value.asInstanceOf[js.Any])
    
    inline def setLoRaWANUndefined: Self = StObject.set(x, "LoRaWAN", js.undefined)
    
    inline def setSidewalk(value: SidewalkDeviceMetadata): Self = StObject.set(x, "Sidewalk", value.asInstanceOf[js.Any])
    
    inline def setSidewalkUndefined: Self = StObject.set(x, "Sidewalk", js.undefined)
    
    inline def setWirelessDeviceId(value: WirelessDeviceId): Self = StObject.set(x, "WirelessDeviceId", value.asInstanceOf[js.Any])
    
    inline def setWirelessDeviceIdUndefined: Self = StObject.set(x, "WirelessDeviceId", js.undefined)
  }
}
