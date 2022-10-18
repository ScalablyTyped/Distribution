package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWirelessDeviceStatisticsRequest extends StObject {
  
  /**
    * The ID of the wireless device for which to get the data.
    */
  var WirelessDeviceId: typings.awsSdk.clientsIotwirelessMod.WirelessDeviceId
}
object GetWirelessDeviceStatisticsRequest {
  
  inline def apply(WirelessDeviceId: WirelessDeviceId): GetWirelessDeviceStatisticsRequest = {
    val __obj = js.Dynamic.literal(WirelessDeviceId = WirelessDeviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWirelessDeviceStatisticsRequest]
  }
  
  extension [Self <: GetWirelessDeviceStatisticsRequest](x: Self) {
    
    inline def setWirelessDeviceId(value: WirelessDeviceId): Self = StObject.set(x, "WirelessDeviceId", value.asInstanceOf[js.Any])
  }
}
