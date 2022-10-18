package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWirelessDevicesResponse extends StObject {
  
  /**
    * The token to use to get the next set of results, or null if there are no additional results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.NextToken] = js.undefined
  
  /**
    * The ID of the wireless device.
    */
  var WirelessDeviceList: js.UndefOr[WirelessDeviceStatisticsList] = js.undefined
}
object ListWirelessDevicesResponse {
  
  inline def apply(): ListWirelessDevicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWirelessDevicesResponse]
  }
  
  extension [Self <: ListWirelessDevicesResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setWirelessDeviceList(value: WirelessDeviceStatisticsList): Self = StObject.set(x, "WirelessDeviceList", value.asInstanceOf[js.Any])
    
    inline def setWirelessDeviceListUndefined: Self = StObject.set(x, "WirelessDeviceList", js.undefined)
    
    inline def setWirelessDeviceListVarargs(value: WirelessDeviceStatistics*): Self = StObject.set(x, "WirelessDeviceList", js.Array(value*))
  }
}
